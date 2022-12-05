

import java.util.*;


/**
* 简单模拟SpringMVC使用适配器设计模式来转发不同的请求
* 
*/

public class DispatcherServlet {

    public static List<HandlerAdapter> hanlderList = new ArrayList<>();
	
	//实例代码块，在类实例化的时候，在缺省构造器之前执行
	//在集合中预先准备不同的适配器
	{
		hanlderList.add(new SimpleHandlerAdapter());
		hanlderList.add(new HttpHandlerAdapter());
		hanlderList.add(new AnnotationHandlerAdapter());
	}
	
	
	public DispatcherServlet(){
		
	}

	public static void main(String[] args) {
		
		DispatcherServlet dispatcher = new DispatcherServlet();
		dispatcher.doDispatch();

    }


	public void doDispatch(){
		//模拟SpringMVC从request中获取到一个请求,然后给这个请求适配一个对应的处理器
		Controller controller = new SimpleController();
		//通过请求获取对应的适配器
		HandlerAdapter adapter = getHandler(controller);
		//实际是找到对应的适配器后，该适配器的handle方法内调用SimpleController的方法处理业务请求，替代了对应的Controller来处理请求。
		adapter.handle(controller);

		//后面再有别的请求，就增加请求处理类，增加适配器就可以了。
		Controller httpController = new HttpController();
		//写法上面一样
		HandlerAdapter adapter2 = getHandler(httpController);
		adapter2.handle(httpController);

	}


	//获取请求对应的处理适配器
	public HandlerAdapter getHandler(Controller controller){
		for(HandlerAdapter  adapter : hanlderList){
			if(adapter.support(controller)){
				return adapter;
			}
		}

		return null;
	
	}

}