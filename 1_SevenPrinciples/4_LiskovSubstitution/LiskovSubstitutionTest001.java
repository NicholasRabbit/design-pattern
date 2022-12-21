/*
里氏替换原则：
1,子类尽量不重写其继承父类已实现的方法，否则在后期多态语法使用频繁时会发生混乱
2,继承让两个类的耦合性增强了，适当时，尽量使用聚合，组合，依赖解决需求
3,无论在父类类型的变量中保存哪个子类，调用的方法都不改变功能，程序都正常工作，称作里氏替换原则。
3,多看课堂笔记

本例先不符合里氏替换原则，查看其弊端
*/

public class LiskovSubstitutionTest001 {

	public static void main(String[] args){
		Cacu c = new Cacu();
		System.out.println("1 + 2 = " + c.sum(1,2));   //输出：3
		//子类改写了方法,使用多态声明变量，调用的是子类的方法
		Cacu mc = new MyCacu();
		System.out.println("1 + 2 = " + mc.sum(1,2));  //sum(..)预想的是求和，这里结果确是：-1
	}
}


//父类，sum实现的是求和
class Cacu {
	public int sum(int i, int j){
		return i + j;
	}
}

//子类，重写sum()方法,改为了求差,造成了混乱
class MyCacu extends Cacu {
	public int sum(int i, int j){
		return i - j;
	}
}
