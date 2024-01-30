


public interface HandlerAdapter {
    
    //此方法判断是否是适配的handler
	public boolean support(Controller handler);
	
	//此方法的形参是handler，即controller，代替controller对象执行操作。
	public void handle(Controller handler);

	
}


//多种适配器类
//下面模拟mvc处理不同请求的适配器类
class SimpleHandlerAdapter implements HandlerAdapter{
	
	public boolean support(Controller handler){
		return (handler instanceof SimpleController);
	}
	
	public void handle(Controller handler){
		((SimpleController)handler).doSimpleHandler();
	}

}


class HttpHandlerAdapter implements HandlerAdapter {
	
	public boolean support(Controller handler){
		return (handler instanceof HttpController);
	}
	
	public void handle(Controller handler){
		((HttpController)handler).doHttpHandler();
	}

}

class AnnotationHandlerAdapter implements HandlerAdapter {
	public boolean support(Controller handler){
		return (handler instanceof AnnotationController);
	}
	
	public void handle(Controller handler){
		((AnnotationController)handler).doAnnotationHandler();
	}	
	
}
