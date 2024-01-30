
//
public class LogAdapter implements LogInterface{
	
	//The newLogger is aggregated in LogAdapter.
	private NewLogFactory newLogger;

	public LogAdapter(){
	
	}

	public LogAdapter(NewLogFactory newLogger){
		this.newLogger = newLogger;
	}

	public void log(String s){
		newLogger.info(s);	
	}

}
