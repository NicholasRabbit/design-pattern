

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
* 模拟数据库，把user-info.txt当成数据库，从中读取信息
*/
public class DataBase {

	
	public static Properties getProperties(String fileName){
		
		FileInputStream in = null;
		Properties pro = null;
		try{
			//读取数据文件
			in = new FileInputStream(fileName);	
			//把文件信息加载到Properties对象中
			pro = new Properties();
			pro.load(in);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(in != null){
				try{
					in.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	
		return pro;
	}

}