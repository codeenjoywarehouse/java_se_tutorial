/**
 * 封装思想
 */ 
public class PrivateConcept {

  public static void main(String[] args) {

    User user = new User();

    user.setUserName("Tom");
    user.setUserAge(18);

    System.out.println(user.getUserName());
    System.out.println(user.getUserAge());

  }

}

class User {
	private String userName;
	private int userAge;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserName() {
		return this.userName;
	}

	public int getUserAge() {
		return this.userAge;
	}
}