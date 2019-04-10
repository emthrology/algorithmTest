package test0410;

public class InfiniteLoop {

	public static void main(String[] args) {
		double i = Double.POSITIVE_INFINITY;
		while(i==i+1) {
			System.out.println(i);
		}
		//infinity는 double과 float만으로 표현 가능하다 (다른 정수 자료형은 최대값이 정해져있다)
		
		double j = 0.0/0.0; //Not a Number를 호출한다
		while(j !=j) {
			
		}
		//또한 double과 float는 NaN이라는 숫자가 아닌 상태를 호출할 수 있다, NaN-NaN == 0 의 결과값은 false이다
		
		String k ="";
		while(k != k+0) {//변수를 double이나 float로 선언할 수 없다는 제약이 추가된 상태
			
		}
		//연산자 +의 오버로딩으로 while의 무한루프를 이끌어냈다 -->연산자 오버로딩은 같은 자료형끼리 쓰는게 정상적이다
		
		short l = -1;
		while(l !=0) {
			l >>>= 1; //>>>는 오른쪽 쉬프트하면서 제로확장 비슷하게 자릿수를 유지하는 연산
		}
		//int보다 작은 수를 int로 형변환할때 부호확장이 일어나고 다시 l에 넣을 때 줄어드는 0을 인식하지 못하는 현상을 이용해 무한루프를 이끌어냄
		//다시 말하지만 형변환이 일어날 때는 복합할당 연산자를 사용하면 원하는 결과를 얻기 힘들다
		
		
		Integer a = new Integer(0);
		Integer b = new Integer(0);
		while(a<=b && b<=a && a!=b) {
			
		}
		//래퍼 클래스를 사용하여 같은 값을 표현하지만 다른 객체로 인식하게 만드는 것이 가능함을 이용하여 무한루프를 이끌어냄
		//박스자료형은 대소를 비교할 때는 값으로 비교를 하지만 동등 비교를 할 때에는 참조륿 비교한다
		

	}

}
