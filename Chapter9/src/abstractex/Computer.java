package abstractex;

public abstract class Computer {

	public abstract void display();
	public abstract void typing();//구현하지않고 선언만 한다.
	
	
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다."); // 추상클래스 안에서도 구현할 수 있다.
	}
	
	
}
