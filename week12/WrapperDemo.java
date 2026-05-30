package week12;

public class WrapperDemo {
	public static void main(String[] args) {
		Integer bi1=new Integer(10);
		
		System.out.println(bi1.intValue());
		System.out.println(bi1.doubleValue());
		
		Integer bi2=20; //자동박싱
		int i2=bi2+20;  //자동언박싱
		
		
		String s1=Double.toString(3.14);
		
		Float pi=Float.parseFloat("3.14");
		
		Integer bi3=Integer.valueOf("11",16);  //16은 16진수를 의미함
		 
		System.out.println(bi3);
		
	}

}
