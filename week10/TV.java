package week10;

public class TV implements RemoteControllable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켠다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끈다");
	}

	@Override
	public void remoteOn() {
		// TODO Auto-generated method stub
		System.out.println("리모컨으로 TV를 켠다");
	}

	@Override
	public void remoteOff() {
		// TODO Auto-generated method stub
		System.out.println("리모컨으로 TV를 끈다");
	}

}
