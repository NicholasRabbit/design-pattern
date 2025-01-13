

/*
 * 需求：
 * 为项目加新的日志框架, 原来调用的是一个日志接口类，旧日志框架实现此日志接口。
 * 做法-增加适配器：
 * 1，日志适配器LogAdapter实现原日志接口；
 * 2，把新日志框架类聚合到适配器内，重写接口实现方法，改为调用新的日志框架；
 * */
public class TestLogAdapter {

	public static void main(String[] args){
		
		LogInterface logger = new LogAdapter(new NewLogFactory());
		
		logger.log("printing log...");
		
	}

}
