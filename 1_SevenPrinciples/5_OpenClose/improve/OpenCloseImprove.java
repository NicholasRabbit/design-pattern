
//使用OCP开闭原则改善

public class OpenCloseImprove {
	
	public static void main(String[] args){
		GraphicEditor g = new GraphicEditor();
		g.draw(new Triangle());
		//增加绘制圆形，只需new一个Circle类就行了，不用改动GraphicEditor的代码了
		g.draw(new Circle());
	}
	
}

class GraphicEditor {

	public void draw(Shapes s){
		s.draw(); 
	}
}

abstract class Shapes {
	int type;
	public abstract void draw();
}

class Triangle extends Shapes {
	public Triangle (){
		super.type = 1;
	}
	public void draw(){
		System.out.println("绘制三角形");
	}
}

//新增绘制圆形，只需写这个类就行了，不用改动GraphicEditor
class Circle extends Shapes {
	public Circle (){
		super.type = 2;
	}
	public void draw(){
		System.out.println("绘制圆形");
	}
}

