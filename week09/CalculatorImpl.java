package week09;

public class CalculatorImpl implements ICalculator {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ret =ICalculator.exec(ICalculator.Mutiple,3,4);
		System.out.println("결과 :"+ret);
	}
	
	@Override
	public int multiple(int i, int j) {
		// TODO Auto-generated method stub
		return (i*j)+5;
	}

	@Override
	public int plus(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int minus(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}


}
