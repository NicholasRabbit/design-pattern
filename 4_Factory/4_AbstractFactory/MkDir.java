

import java.io.*;

public class MkDir {

	public static void main(String[] args){
	
		File f = new File("src/com/factory/order");
		f.mkdirs();
	}
}