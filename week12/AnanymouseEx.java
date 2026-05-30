package week12;

interface MyInterface{
	void printMsg(String msg);
}
public class AnanymouseEx {
	
	public static void main(String[]args) {
		MyInterface obj;
		obj=new MyInterface() {
			
			
			@Override
			public void printMsg(String msg) {
				System.out.println(msg);
			}
		};
		obj.printMsg("Hello");
	}
}
