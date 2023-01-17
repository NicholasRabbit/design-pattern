
import java.util.*;

/*
* 景区类，在这里调用解释器判断用户是否符合免票要求。
*/
public class ScenicArea {
	
	//符合免票的城市集合
	private Set<String> citySet;
	//符合免票的人群类型集合
	private Set<String> typeSet;

	//总的判断规则
	private AbstractInterpreter orInterpreter;

	//初始化规则
	{
		this.citySet = new HashSet<String>();
		this.typeSet = new HashSet<String>();
		
		citySet.add("北京");
		citySet.add("天津");

		typeSet.add("老人");
		typeSet.add("医生");
		typeSet.add("儿童");
		
		//定义最小单位的拆分规则
		AbstractInterpreter tmnlCity = new TerminalInterperter(citySet,":");
		AbstractInterpreter tmnlType = new TerminalInterperter(typeSet,"-");
		//设定总的判断规则
		orInterpreter = new OrInterpreter(tmnlCity,tmnlType);

	}

	public void getTicket(String userInfo){
		if(orInterpreter.interpret(userInfo)){
			System.out.println("符合免票！");
		}else{
			System.out.println("请您购票！");
		}
	}
}