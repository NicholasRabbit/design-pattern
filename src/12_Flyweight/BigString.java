
//此类使用BigChar
public class BigString {

	private BigChar[] bigChars;

	public BigString(){
	
	}
	public BigString(String chars){
		
		bigChars = new BigChar[chars.length()];
		BigCharFactory factory = BigCharFactory.getInstance();

		//通过数字获取对应的大数字对象bigChar
		for(int i = 0; i < bigChars.length; i++){
			bigChars[i] = factory.getBigChar(chars.charAt(i));
		}
		
		
	}
	
	//打印BigChar[]数组
	public void print(){
		for(int i = 0; i < bigChars.length; i++){
			bigChars[i].print();
		}
	}

}