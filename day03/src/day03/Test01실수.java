package day03;

public class Test01실수 {
	public static void main(String[] args){
		//실수
		//-소수점이 있는 수
		//double이 기본값이며 float는 F를 붙여야 한다.
		//둘의 차이는 표현 할 수 있는 자리수 차이
		//-표현 가능한 크기보다 더 긴 값이 들어온다면 버림
		
		float a = 1.234234234234234234234f;
		double b = 1.234234234234234234234;
		System.out.println(a);
		System.out.println(b);
		
		//중요 정수와 실수를 계산하면?무조건 실수
		System.out.println(10/3);//결과 int
		System.out.println(10/3.0);//결과 double
		System.out.println(10/3f);//결과 float
		System.out.println(10/3d);//결과 double
		
	}

}
