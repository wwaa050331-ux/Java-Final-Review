package week10;

//인터페이를 이용한 다형성 제공방법
//인터페이를 이용한 결합도를 줄일 수 있는 방법
public class ControllablePolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControllablePolyDemo cont = new ControllablePolyDemo();
		
		Controllable[] controllable = {new TV(), new Computer()};
		
		for (Controllable c : controllable)
			cont.printObj(c);
		Controllable.reset();
		
		//인터페이스 타입의 참조 변수가 구현 객체를 참조하고 있다면 강제타입변환이 가능
		if(controllable[0] instanceof TV) {
			TV v=(TV)controllable[0];
			v.remoteOn();
			v.remoteOff();
			//Private 메서드는 인터페이스 외부에서는 호출불가
			//v.show("TV");
		}
	}
	// 다형성과 결합도 감소를 위해서 매개변수 타입을 인터페이스 타입으로 선언
	void printObj(Controllable c) {
		c.turnOn();
		c.turnOff();
		c.repair();
	}

}
