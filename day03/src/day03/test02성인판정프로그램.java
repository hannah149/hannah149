package day03;

public class test02성인판정프로그램 {

//	```java
	//int birth =20051012;
	
	//```
	
	//위와 같이 생년월일이 8자리 정수로 저장되어 있다고 할 때, 
	//사람이 술/담배를 구매할 수 있는 성인인지 판정하여 성인이라면 true, 
	//아니라면 false가 화면에 출력될 수 있도록 코드를 작성하세요
	
		public static void main(String[] args) {

			//입력
			int birth=20051012;
			
			//연산
			
			int year=birth /10000;
			int age=2025-year+1;
			boolean adult =age>=20;
			
			//결과
			
			System.out.println(adult);
			
			
	
	
		}
		}
