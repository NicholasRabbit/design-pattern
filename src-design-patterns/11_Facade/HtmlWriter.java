

import java.io.Writer;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


//写html页面的类
public class HtmlWriter {

	private Writer writer;

	public HtmlWriter(){
	
	}
	public HtmlWriter(Writer writer){
		this.writer = writer;
	}
	
	//写标题
	public void writerHead(String title){
		try{
			writer.write("<html>");
			writer.write("\r\n");
			writer.write("<head>");
			writer.write("<title>");
			writer.write(title);
			writer.write("</title>");
			writer.write("</head>\r\n");
			writer.write("<h1>");
			writer.write(title);
			writer.write("</h1>\r\n");
			writer.flush();  //清空输出流
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}/*finally{
		   if(writer != null){
		      try{
			     writer.close();	//输出流不要关闭，下面的方法还用，要不然还得重新获取
			  }catch(IOException e){
			     e.printStackTrace();
			  }
		   }
		}*/
		
	}
	
	//写段落
	//写页面的结尾
	public void writeParagraph(String para){
		try{
			
			writer.write("<body>");
			writer.write("\r\n");
			writer.write("<p>");
			writer.write(para);
			writer.write("</p>");

			writer.flush();  //清空输出流
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}
		/*finally{
		   if(writer != null){
		      try{
			     writer.close();   //输出流不要关闭，下面的方法还用，要不然还得重新获取
			  }catch(IOException e){
			     e.printStackTrace();
			  }
		   }
		}
		*/
	}

	//写超链接
	public void writeLink(String link,String linkName){
		try{
			
			writer.write("<a href='");
			writer.write(link);
			writer.write("'>");
			writer.write(linkName);
			writer.write("</a>");
			
			writer.flush();  //清空输出流
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}
	}

	
	
	//写页面的结尾
	public void writeEnd(){
		try{
			writer.write("</body>");
			writer.write("\r\n");
			writer.write("</html>");
			
			writer.flush();  //清空输出流
		}catch(FileNotFoundException e){
		   e.printStackTrace();
		}catch(IOException e){
		   e.printStackTrace();
		}finally{
		   if(writer != null){
		      try{
			     writer.close();   //最后这里关闭输出流
			  }catch(IOException e){
			     e.printStackTrace();
			  }
		   }
		}
	}

}