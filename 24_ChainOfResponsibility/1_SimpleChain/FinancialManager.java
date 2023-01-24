
//财务经理，最高级别
public class FinancialManager extends AbstractBugetHandler {

	/*
	* 最高级别审核人，最多只批20000，如果再高则不同意。
	*/
	public boolean checkBuget(int money){
		if(money <= 20000){
			System.out.println("FinancialManager had approved.");
			return true;
		}else{
			System.out.println("FinancialManager did not agree.");
			return false;
		}
	}

}