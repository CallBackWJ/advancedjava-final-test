package prob05;

public class UserNotFoundException extends Exception {

	public UserNotFoundException(String message)
	{
		super(message);
	}
	
	public UserNotFoundException()
	{
		super("존재하지 않는 사용자입니다.");
	}
}

