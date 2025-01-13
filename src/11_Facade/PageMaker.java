
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

import java.io.FileNotFoundException;
import java.io.IOException;


/*
* 此类是外观者的角色
*/
public class PageMaker {

	/*
	* 制作html页面的方法，把DataBase,HtmlWriter的多个复杂功能都写在这里,
	* 后两者的功能复杂，方法多，统一放在外观者这里调用，对外只提供createPage(..)方法,
	* 使得调用API变得简单了。
	*/
	//htmlFile ： 要写入的html文件名
	public void createPage(String email,String htmlFile){
		
		//获取数据信息
		Properties pro = DataBase.getProperties("user-info.txt");
		String userName = pro.getProperty("user.name");
		String href = pro.getProperty("href");
		try{
			HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(htmlFile));
			htmlWriter.writerHead("Welcome " + userName);
			htmlWriter.writeParagraph("欢迎:" + userName);
			htmlWriter.writeLink(href,"必应");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
