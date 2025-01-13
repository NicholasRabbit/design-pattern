
/*
二，泛化关系(Generalization),实际就是继承，一种依赖关系的特例
例，CustomerDao和BaseDao就是泛化关系
*/

public class GeneralizationTest {

	public static void main(String[] args){
		BaseDao customerDao = new CustomerDao();
	}

}


abstract class BaseDao {
	String no;
	public abstract String getNo();
	public abstract void setNo(String no);	
}

class CustomerDao extends BaseDao{
	private String no;
	public String getNo(){
		return this.no;
	}
	public void setNo(String no){
		this.no = no;
	}
}