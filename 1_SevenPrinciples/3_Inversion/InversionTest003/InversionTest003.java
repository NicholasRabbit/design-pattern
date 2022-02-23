
//依赖传递范例
public class InversionTest003 {

	public static void main(String[] args){
		//1,通过接口传递实现依赖
		ITV sony = new Sony();
		IOpenAndClose op = new OpenAndClose();
		op.open(sony);
		//2,通过构造方法传递依赖
		ITV xiaomi = new XiaoMi();
		IOpenAndClose02 op02 = new OpenAndClose02(xiaomi);
		op02.open();  //这里无实参
		//3,通过setter传递依赖
		ITV konka = new Konka();
		OpenAndClose03 op03 = new OpenAndClose03();
		op03.setTv(konka);
		op03.open();

	}
}

//1,通过接口传递实现依赖
//电视接口
interface ITV {
	public abstract void play();
}
//开关接口
interface IOpenAndClose {
	//此处传递依赖
	public abstract void open(ITV tv);
}

class Sony implements ITV {
	public void play(){
		System.out.println("Sony TV play!");
	}
}

class OpenAndClose implements IOpenAndClose {
	public void open(ITV tv){
		tv.play();
	}
}

//2,通过构造方法传递依赖
//开关接口
interface IOpenAndClose02 {
	//此处传递依赖
	public abstract void open();
}

class OpenAndClose02 implements IOpenAndClose02 {
	ITV tv;
	public OpenAndClose02(){}
	//此处构造方法传递依赖
	public OpenAndClose02(ITV tv){
		this.tv = tv;
	}
	public void open(){
		this.tv.play();
	}
}

class XiaoMi implements ITV {
	public void play(){
		System.out.println("XiaoMi TV play!");
	}
}

//3,通过setter方法实现依赖传递
class OpenAndClose03 implements IOpenAndClose02 {
	ITV tv;
	//此处set方法传递依赖
	public void setTv(ITV tv){
		this.tv = tv;
	}
	public void open(){
		this.tv.play();
	}
}

class Konka implements ITV {
	public void play(){
		System.out.println("Konka TV play!");
	}
}
