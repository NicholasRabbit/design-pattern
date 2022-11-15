/**
* 个人模拟写个Servlet接口，GenericServlet抽象类，来熟悉接口适配器设计模式
* 实际各方法的形参跟Servlet中不一样，这里仅作练习。
*/

public interface ServletDemo {

	public abstract void init();

	public abstract void service();

	public abstract String getServletConfig();

	public abstract String getServletInfo();

	public abstract void destrory();
}