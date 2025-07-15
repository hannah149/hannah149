package day03;

public class test04PC방계산기 {

	//과거에 만들었던 PC방 요금 계산기는 특정요금에서 정상적으로 계산이 이루어지지 않는 문제가 있습니다.
	//(ex:시간당 1000원으로 설정하면 960원으로 계산됨)
	//정수와 실수의 변롼을 이용해서 얼마로 설정하든 정상요금이 출력 될 수 있도로 구련 (double 사용)
	
	//입장시각-10시30분퇴장시각,-16시15분 ,시간당 1000원
	
	
	
	public static void main(String[]args) {
		
	//입력
	int inHour=10,inMinute=30;
	int outHour = 11,outMinute= 30;
	int priceHour = 1000;
	
	//연산 
	int priceMinute = priceHour/60;
	int inTime =inHour*60 + inMinute;
	int outTime=outHour*60+ outMinute;
	int time=outTime-inTime;
	
	//출력 
	
	System.out.println();
	
	}
}
