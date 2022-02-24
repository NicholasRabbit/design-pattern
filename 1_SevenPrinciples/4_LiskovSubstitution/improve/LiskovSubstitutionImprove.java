/*
使用里氏原则范例:
使得两个类都继承一个基类，它们之间不要有关系
*/
public class LiskovSubstitutionImprove {

	public static void main(String[] args){
		Cacu c = new Cacu();
		System.out.println("Cacu's m1()==> 3 + 6 = " + c.m1(3,6));
		MyCacu mc = new MyCacu();
		System.out.println("MyCacu's m1()==> 3 + 6 = " + mc.m1(3,6));
		System.out.println("MyCacu's m2()==> 3 + 6 = " + mc.m2(3,6));
		System.out.println("MyCacu's m3()==> 3 + 6 = " + mc.m3(3,6));
	}
}


//基类
abstract class Base {
	public abstract int m1(int i ,int j);
}

//父类，m1实现的是求和
class Cacu extends Base{
	public int m1(int i, int j){
		return i + j;
	}
}

//子类
class MyCacu extends Base {
	
	Cacu c = new Cacu();
	
	//m1是求差,跟Cacu里的方法一样，也许是无意识写的，但是没有继承Cacu，因此不会影响Cacu的m1()方法
	public int m1(int i, int j){
		return i - j;
	}
	//m2是求和
	public int m2(int i, int j){
		return m1(i,j) + 10;
	}
	//也可以调用Cacu对象的m1()方法实现求和
	public int m3(int i, int j){
		return this.c.m1(i,j);
	}
}

