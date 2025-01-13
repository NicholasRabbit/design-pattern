/*
开闭原则：
1，对扩展开放，对修改关闭
2，设计模式最主要的目的就是为了实现开闭原则
本例未使用开闭原则，出现的问题：
如果我要增加一个绘制圆形的方法，仅仅写个Cirlce类还不行，GraphicEditor.java里的代码要改动，耦合性太强
*/

public class OpenCloseTest {

	public static void main(String[] args){
		GraphicEditor g = new GraphicEditor();
		g.draw(new Triangle());
		g.draw(new Rectangles());
		//增加绘制圆形的方法
		g.draw(new Circle());
	}

}

class GraphicEditor {

	public void draw(Shapes s){
		if(s.type == 1)
			System.out.println("绘制三角形");	
		else if (s.type == 2)
			System.out.println("绘制正方形");
		else if (s.type == 3) //代码改动，增加了代码，不符合开闭原则
			System.out.println("绘制圆形");
		 
	}
}

abstract class Shapes {
	int type;
}

class Triangle extends Shapes {
	public Triangle (){
		super.type = 1;
	}
}

class Rectangles extends Shapes {
	public Rectangles () {
		super.type = 2;
	}
}

class Circle extends Shapes {
	public Circle (){
		super.type = 3;
	}
}

