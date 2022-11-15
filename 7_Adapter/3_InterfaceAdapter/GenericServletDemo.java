
public abstract class GenericServletDemo implements ServletDemo {
	
	public void init(){
	
	}
	//service不实现，留给子类去实现
	public abstract void service();

	public String getServletConfig(){
		return null;
	}

	public String getServletInfo(){
		return null;
	}

	public void destrory(){
	
	}
}