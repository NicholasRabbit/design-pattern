
import java.util.List;
import java.util.ArrayList;

public class UserDao implements IUserDao {
	
	private List<User> userList = new ArrayList<>();
	
	{
		userList.add(new User(1001,"Tom"));
		userList.add(new User(1002,"Kate"));
	}

	
	public List<User> list(User user){
		return this.userList;
	}

}