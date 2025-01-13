
/*
* 使用组合设计模式来处理多层级关系
* 好处：删除节点操作不会影响其他的子类，因为如果是继承关系，删除一个节点要考虑它的子类的继承了会受影响。
*       增加节点也是没有耦合。
*       符合设计原则。
*/

public class CompositeTest {
	
	public static void main(String[] args){
		
		//创建一个总部
		Company hq = new Headquarter("总部","代号No.001");
		Company hebeiQuarter = new ProvinceBranch("河北分公司","HB001");
		Company henanQuarter = new ProvinceBranch("河南分公司","HN001");
		Company shandongQuarter = new ProvinceBranch("山东分公司","SD001");
		hq.add(hebeiQuarter);
		//再添加下级公司直接加就行了，不用再用继承那么复杂且不易维护的方式
		hq.add(henanQuarter);
		hq.add(shandongQuarter);
		System.out.println(hq);
		hq.print();

		//给省级添加市级的公司，以河北分公司为例
		Company handanBranch = new CityBranch("邯郸分公司","HD001");
		Company xingtaiBranch = new CityBranch("邢台分公司","XT001");
		Company sjzBranch = new CityBranch("石家庄分公司","SJZ001");
		hebeiQuarter.add(handanBranch);
		hebeiQuarter.add(xingtaiBranch);
		hebeiQuarter.add(sjzBranch);
		hebeiQuarter.print();
	}

}