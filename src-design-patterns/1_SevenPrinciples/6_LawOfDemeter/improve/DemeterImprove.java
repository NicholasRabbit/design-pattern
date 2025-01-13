
import java.util.*;
/*
使用迪米特法则   
*/

public  class DemeterImprove {
	
	public static void main(String[] args){
		HeadManager hm = new HeadManager();
		CollegeManager cm = new CollegeManager();
		hm.getAllEmps(cm);
	}
}


//总部管理类
class HeadManager {
	//获取总部员工
	public List<Emp> getHeadEmps(){
		List<Emp> list = new ArrayList<>();
		int id = 1000;
		//增加10个总部员工
		for(int i = 0; i < 10; i++){
			Emp emp = new Emp();
			emp.setId(++id);
			list.add(emp);
		}
		return list;
	}

	// 打印全部员工
	public void getAllEmps(CollegeManager cm){
		// 使用迪米特法则，把打印学院员工封装在CollegeManager类里
		cm.printCollegeEmps();
		//打印总部员工
		List<Emp> empList = this.getHeadEmps();
		for(Emp e : empList){
			System.out.println(e.getId());
		}
	}

}

//学院管理类
class CollegeManager {

	public List<CollegeEmp> getCollegeEmps(){
		List<CollegeEmp> list = new ArrayList<>();
		int id = 5000;
		//增加10个学院员工
		for(int i = 0; i < 10; i++){
			CollegeEmp cemp = new CollegeEmp();
			cemp.setId(++id);
			list.add(cemp);
		}
		return list;
	}

	void printCollegeEmps(){
		List<CollegeEmp> cempList = this.getCollegeEmps();  
		for(CollegeEmp c : cempList){
			System.out.println(c.getId());
		}
	}
}

//总部员工：1001 ，1开头
class Emp {
	
	private int id;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
}
//学院员工:5001，5开头
class CollegeEmp {
	private int id;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
}

