
import java.util.*;

/*
* 测试观察者模式
* 应用范例：
* JDK中的Obserable,Observer就是观察者模式，
* 其中Observable相当于本例的GameNews，之时没有Subjects接口
* Observer是个观察者接口，没有实现类，留给程序员自己写实现类。

* 用途：当业务符合订阅-发布这种场景时就考虑这个模式。
*/

public class ObserverTest {
	
	public static void main(String[] args){
		
		//创建消息，初始化消息对象
		Subjects gameNews = new GameNews("WCG Final Game : Jaedong 3 : 0 F91");
		List<Observers> obs = new ArrayList<>();
		gameNews.setObservers(obs);
		//添加一个观察者
		gameNews.add(new NeoTvOb());
		//发送通知消息
		gameNews.notifyNews();
		
		//再增加一个观察者PluTvOb，直接调用gameNews.add(..)即可，不用修改GameNews里的代码了
		gameNews.add(new PluTvOb());
		//发送消息也不用改，直接调用。
		gameNews.notifyNews();  
	}

}