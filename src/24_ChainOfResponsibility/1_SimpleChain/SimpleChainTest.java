
/*
* 简单职责链模式：
* 以一个预算审批的范例演示简单职责链。
* 具体需求：
* 员工提交一项采购预算，首先给组负责人，如果预算金额超出组负责人权限，
* 则继续向链条上游提交处理请求。
* 
* 还有一种复杂的职责链，在例2中演示。
*/
public class SimpleChainTest {

	public static void main(String[] args){
		
		AbstractBugetHandler team = new TeamSupervisor();
		AbstractBugetHandler dept = new DeptLeader();
		AbstractBugetHandler manager = new FinancialManager();
		//设置下一个负责人
		team.setNextHandler(dept);
		dept.setNextHandler(manager);

		//测试
		team.checkBuget(15000);
		
	}
}