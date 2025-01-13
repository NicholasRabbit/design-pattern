
import java.io.*;

/*
* BigChar对象对应big-numbers里的各个数字
* 在这里读取文本中的数据，转换为String
*/
public class BigChar {

	//字符名字
	private String charName;
	//大型字对应的字符串
	private String fontData;

	public BigChar(){
	
	}

	
	/*
	* 在有参构造中输入不同的参数，可读取不同文本中的大数字。
	*/
	public BigChar(String charName){
		
		//通过charName读取文件中的内容
		FileReader reader = null;
		BufferedReader buffer = null;
		try{
			//组合文件名
			charName = "big-numbers/big" + charName + ".txt";
			reader = new FileReader(charName);
			buffer = new BufferedReader(reader);
			//读取文件内容
			String line = null;
			StringBuffer sb = new StringBuffer();
			while((line = buffer.readLine()) != null){
				//把从文件读取的内容组装成字符串
				sb.append(line);
				sb.append("\n");
			}
			fontData = sb.toString();

		}catch(FileNotFoundException e){
		    e.printStackTrace();
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    if(buffer != null){
			    try{
				    buffer.close();          
				}catch(IOException e){   
				    e.printStackTrace();
				}
			}
			if(reader != null){
			    try{
				    reader.close();          
				}catch(IOException e){   
				    e.printStackTrace();
				}
			}
		}

	}
	
	//打印大数字
	public void print(){
		System.out.println(this.fontData);
	}

}