
import java.util.*;


//更新通知消息接口
public interface Subjects {

	void add(Observers ob);
	void remove(Observers ob);
	void notifyNews();

	void setObservers(List<Observers> observers);

}