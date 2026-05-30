package week12;

class Mouse extends Object{
	
	String name;
	
	public Mouse(String name) {
		this.name=name;
	}
}

public class Keyboard {
	String name;

	public Keyboard(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	if(obj instanceof Keyboard) {
		Keyboard k=(Keyboard) obj;
		if(name.equals(k.name))
			return true;
	}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "키보드입니다.";
	}

	
}
