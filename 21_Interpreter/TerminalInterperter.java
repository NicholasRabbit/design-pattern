

import java.util.*;

/*
* 终端翻译器（解释器），
* 即翻译器的最小单位，把信息按照分隔符翻译成最小单位的字符串供判断
*/
public class TerminalInterperter extends AbstractInterpreter{
	
	//免门票的数据
	private Set<String> dataSet;
	//分隔符
	private String symbol;

	public TerminalInterperter(){
	
	}

	//初始化，确定好这个最小单位的解释器的免费规则，和拆分符号。
	public TerminalInterperter(Set<String> dataSet, String symbol){
		this.dataSet = dataSet;
		this.symbol = symbol;
	}
	
	/*
	* 重写方法，自定义规则
	* exp: 用户信息
	*/
	public boolean interpret(String userInfo){
		//把用户信息按照指定符号分割
		String[] arr = userInfo.split(symbol);
		for(int i = 0; i < arr.length; i++){
			if(dataSet.contains(arr[i])){
				return true;
			}
		}

		//如果不符合免费要求则返回false
		return false;

	}

}