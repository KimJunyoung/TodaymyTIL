package abstractex;

public class Test {

	public static void main(String[] args) {

		Computer n1 = new DeskTop();
		Computer n2 = new MyNoteBook();
		
		n1.display();
		n2.display();
	}

}
