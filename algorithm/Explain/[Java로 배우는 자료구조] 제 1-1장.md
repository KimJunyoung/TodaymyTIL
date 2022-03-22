| 타입이름 | 설명 |
| --- | --- |
| byte | 정수 |
| short | 정수 |
| int | 정수 |
| long | 정수 |
| float | 소수 |
| double | 소수 |
| char | 문자 하나 |
| boolean | 참 또는 거짓 |
| String | 문자열 |
| 그밖의 타입들 | \* 나중에 공부 |

\* 변수는 데이터를 보관하는 장소

\* 변수는 사용하기 전에 선언되어야 한다. 변수의 선언이란 "이름"과 "타입"을 정해주는 것

\* 변수는 "적용 범위(scope)"를 가짐

 메서드(블록) 내부에 선언된 변수는 그 메서드(블록) 내부에서만 사용가능

 메서드 외부에 (클래스 내부) 선언된 변수는 클래스 내에서 사용가능
 
---------------------------------------------------------------------------------------------------------------------------------------------------------

**오늘의 코드**

****import** java.util.Scanner;**

**public** **class** Code2 {

**public** **static** **void** main(String\[\] args) {

**int** number = 123;

Scanner keyboard1 = **new** Scanner(System.**_in_**);  //입력받고싶으면 Scanner를 사용하면 된다.

System.**_out_**.println("Please enter an integer: ");

**int** input = keyboard1.nextInt();

**if**(input\==number) {

System.**_out_**.println("Numbers match :-)");

}

**else** {

System.**_out_**.println("Numbers do not match! :-(");

}

keyboard1.close();

}

}


### 숫자를 정해두고(number) 입력 값을 받아서 서로 일치한지 확인하는 알고리즘 이다.

---------------------------------------------------------------------------------------------------------------------------------------------------------

궁금한점들을 검색해보자!

****1. import** java.util.Scanner;**


**2\. nextInt();**    


**3. keyboard1.close();**


**1\. Java.util 패키지에 포함된 외부클래스이다.**

    Scanner 에서도 많은 메서드들이 있다. 대표적인 메서드가 next() 
    
    

**2\. 기본적으로 next()는 String, nextInt() 는 공백 이전까지의 int를 입력받는다.**  

     **nextdouble() 는 공백 이전까지의 double를 입력받는다.**



**3. I/O 사용할때는 끊음을 확실히 해줘야 한다고 사람들이 말한다**.. 

 다만 공식문서에는

 \* Streams have a BaseStream.close() method and implement AutoCloseable, but nearly all stream instances do not actually need to be closed after use.  라고 나와있다. 

오늘의 알고리즘 끝!

