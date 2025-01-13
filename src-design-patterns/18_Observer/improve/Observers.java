
/*
* 观察者接口，这里用复数，防止和JDK自带的Observer冲突
*/
public interface Observers {
	
	public abstract void update(String news);

}