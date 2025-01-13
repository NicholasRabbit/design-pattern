

//controller就是handler,叫法不同而已
public interface Controller {
	
}


//controller接口的处理不同请求的实现类

class SimpleController implements Controller {
	
	public void doSimpleHandler(){
		System.out.println("do simplerHandler...");
	}

}

class HttpController implements Controller {

	public void doHttpHandler(){
		System.out.println("do httpHandler...");
	}
}

class AnnotationController implements Controller {

	public void doAnnotationHandler(){
		System.out.println("do annotationHandler");
	}

}



