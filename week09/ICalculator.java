package week09;

public interface ICalculator {
	String PLUS="pluse",Minus="minus",Mutiple="multiple";
	
	public int plus(int i,int j);
	public int minus(int i,int j);
	
	default int multiple(int i,int j) {
		return i*j;
	}
	
	private static void initMessage(String opt) {
		System.out.println(opt+"시작합니다~~~~");
	}
	
	public static int exec(String opt,int i,int j){
		initMessage(opt);
		CalculatorImpl cal=new CalculatorImpl();
		int retVal=0;
		
		switch(opt) {
		case "plus":
			retVal=cal.plus(i,j);
			break;
		case "minus":
			retVal=cal.minus(i,j);
		break;
		case "multiple":
			retVal=cal.multiple(i,j);
		break;
	}
		return retVal;
		}
	}

