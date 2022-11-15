
/*
* 接口适配器模式
* 指用一个抽象类实现一个接口中的方法，因为是抽象类，可不必全部实现接口中的方法，只实现部分方法 (可空实现，不写具体业务操作)
* 其他类可继承该抽象类，选择所需方法进行实现。
* 常用范例，Servlet-->GenericServlet
*/
public class InterfaceAdapterTest {

	public static void main(String[] args){
		ServletDemo servlet = new MyServlet();
		servlet.service();
	}
}