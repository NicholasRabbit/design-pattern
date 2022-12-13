

import java.util.Properties;
import java.io.*;

//测试类，不属于外观模式内的类，只用来测试
//注意有时候，多个xxx.java 文件，只编译主测试类，其它的不会自动编译，要删除原来的.class 文件。
public class FacadeTest {

	public static void main(String[] args){
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.createPage("askTom@sina.com","index.html");

		
		
	}


}
