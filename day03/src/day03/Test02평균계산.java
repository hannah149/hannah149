package day03;

//국어점수가'75'점,수학 점수가 '60'점 ,영어점수가 '88'점인 학생의**총점**과**과목별 평균을 구하여 출력하시오.

public class Test02평균계산 {
	public static void main(String[] args){
		//입력
		int kor=75;
		int math=60;
		int eng=88;
		
       //연산	
		int total=kor+math+eng;
		
	    //float average=total/3f
	    //float average=total/3.0f;
		float average =(float)total/3;//변수를 float로 변환(변환연산)
		// float average=total/(floar)3;
		
		//출력
		
 
		 System.out.println(total);
		 System.out.println(average);
				
	}
}
