
import java.util.*;

/*
* BigChar工厂类，在这里生成不同数字对应的BigChar对象。
* 这个工厂类用单例模式生成，因为工厂只需要一个。
*/
public class BigCharFactory {

	//单例对象
	private static volatile BigCharFactory singleton;

	//BigChar的缓存池，共享的数据在这里存储，享元模式就是能使用共享的数据就使用，不要在new了。
	Map<String,BigChar> pool = new HashMap<>();

	//单例模式，构造器私有化
	private BigCharFactory(){
	
	}

	//双重检查模式生成单例
	public static BigCharFactory getInstance(){
		if(singleton == null){
			synchronized(BigCharFactory.class){
				if(singleton == null){
					singleton = new BigCharFactory();
				}
			}
		}
		return singleton;

	}
	
	//This is the core code of Flyweight pattern.
	//享元模式的核心代码，获取bigChar对象时会检查，如果已有代表相同的数字则不重新new，减少的冗余的对象创建
	//类似于Integer的byte常量池，String的字符串常量池。
	public BigChar getBigChar(char charName){
		
		//注释的代码可优化，写代码时尽量减少读取内存的次数，可提高运行速度
		//这里从map中读取了两次
		/* 
		BigChar bigChar = pool.get(charName + "");
		if(bigChar == null){
			pool.put(charName + "",new BigChar(charName + ""));
		}
		return pool.get(charName + "");
		*/

		//优化，只读取了一次map
		BigChar bigChar = pool.get(charName + "");
		//如果没有该数字则new，放到map中。
		if(bigChar == null){
			bigChar = new BigChar(charName + "");
			pool.put(charName + "",bigChar);
		}
		return bigChar;
	}


}