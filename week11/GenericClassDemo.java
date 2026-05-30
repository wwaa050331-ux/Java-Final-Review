package week11;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericCup<Beer> c1;
		
		c1=new GenericCup<>();
	    c1.setBeverage(new Beer());
	    
	   //Beer타입의 GenericCup객체에 Boricha타입의 객체를 대입할 수 없음
	   //c1.setBeverage(new Boricha());
	    
	   GenericCup<Beverage> c2=new GenericCup<>();
	   c2.setBeverage(new Beer());
	   c2.setBeverage(new Boricha());
	}

}
