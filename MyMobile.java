package assignment.week1;

public class MyMobile {
	String name = "iphone";
	float version = 13f;
	boolean internet = true;
	boolean sendmsg = false;

public void makeCall() {
	
	System.out.println("Make a call");
	
}
public void sendMsg() {
	System.out.println("Send a message");

}

private void payBills() {
	
	System.out.println("Pay the bill");
}
	

	public static void main(String[] args) {
	
		MyMobile obj = new MyMobile();
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
		System.out.println(obj.version);
		System.out.println(obj.name);
		System.out.println(obj.internet);
		System.out.println(obj.sendmsg);

	}

}
