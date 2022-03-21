### 추상클래스(abstract class)
추상메서드를 포함한 클래스
추상 메서드는 구현코드 없이 메서드의 선언만 있다.
 abstract int add(int x, int y); 선언만 있는 추상 메서드
 int add(int x, int y){}.   {} 부분이 구현 내용이기 때문에 추상 메서드가 아님
 
* abstract 예약어 사용한다.
* 추상 클래스는 new (인스턴스 화) 할 수 없음 
 
### 코드

----------------------------------------------------------------------------------------------------------------------
### Computer  Class
package abstractex;
 
public abstract class Computer {
 
public abstract void display();
public abstract void typing();// 구현은 하지않고 하고 선언만 한다.
 
public void turnOn() {
System.out.println("전원을 킵니다.");
}
public void turnOff() {
System.out.println("전원을 끕니다."); // 추상클래스 안에서도 구현할 수 있다.
}
 
}
* Computer 클래스를 추상클래스로 선언을 해주었다. 
----------------------------------------------------------------------------------------------------------------------
 
### DeskTop  Class
package abstractex;
 
public class DeskTop extends Computer {
 
}
* DeskTop 클래스를 만들면 아래와 같은 오류가 나게 된다.
The type DeskTop must implement the inherited abstract method Computer.typing()
-> 상속된 추상 메서드 Computer.typing()을 구현하거나 DeskTop 도 추상클래스로 선언을 해줘야한다.
 
 
package abstractex;
 
public class DeskTop extends Computer {
 
public void display() {
System.out.println("DeskTop display()");
}
 
public void typing() {
System.out.println("typing display()");
}
 
}
 추상클래스로 선언하지 않고 display와 typing 메소드를 선언하고 구현했다
 
----------------------------------------------------------------------------------------------------------------------
 
NoteBook  Class
package abstractex;
 
public abstract class NoteBook extends Computer{
 
public void display() {
System.out.println("NoteBook display()");
}
}
* 추상클래스로 선언했으며 display() 메소드만 선언 및 구현했다.
----------------------------------------------------------------------------------------------------------------------
 
### MyNoteBook  Class
package abstractex;
 
public class MyNoteBook extends NoteBook{
 
public void typing() {
System.out.println("My NoteBook typing()");
}
}
* MyNoteBook은 NoteBook을 상속받았기 때문에 처음에는 display()만 구현했는데 에러가 났다.
 그 이유는 NoteBook은 Computerf를 상속 받았기 때문에 결국 typing()d의 구현도 필요했던 것이다.
---------------------------------------------------------------------------------------------------------------------- 
 
### Test  Class
package abstractex;
 
public class Test {
 
public static void main(String[] args) {
Computer n1 = new DeskTop();
Computer n2 = new MyNoteBook();
 
n1.display();
n2.display();
}
}
   결과값 
DeskTop display()
NoteBook display()
 
### 그러면 왜 추상클래스를 사용하는 걸까?
 
#### 내가생각하는 사용하는 이유 : 부모 클래스를 추상클래스로 잡아두고, 메서드 선언만 여러개 한다. 
그리고 자식 클래스들에서 선언 및 구현을 하면 되기 때문에 관리하기가 쉬워서 사용한다고 생각한다.
 
#### 사용이유 : 반드시 사용되어야 하는 메소드를 추상 클래스에 추상 메소드로 선언해 놓으면, 이 클래스를 상속받는 모든 클래스에서는 이 추상 메소드를 반드시 재정의해야 합니다
