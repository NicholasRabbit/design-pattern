
import java.util.*;
import java.io.*;

public class BuyCar {
	
	Vehicle v;
	String carMake;

	//如果每增加一个新的车类型，就得修改这里的代码，耦合性太强
	public BuyCar(){
		do{
			carMake = getCarMake();
			if(carMake.equals("vios")){
				v = new Vios();
				v.setCarMake("vios");
			}else if(carMake.equals("corrolla")){
				v = new Corrolla();
				v.setCarMake("corrolla");
			}else{
				break;
			}

			v.prepare();
			v.cnc();
			v.buyComponent();
			v.assembly();
			
		} while (true);
	}

	private String getCarMake(){
		try{
			BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入车型：");
			String carMake = strIn.readLine();
			return carMake;
		}catch(IOException e){
			e.printStackTrace();
			return "";  //try, catch里总有一个return执行，所以写这里可以
		}
		
	}
}