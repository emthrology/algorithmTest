package test0407;

public class SameButDifferent {
	public static void main(String[] args) {
		//답 1
		char x;
		char i;
		x = 'x';
		i = 'i';
		x +=i;
		System.out.println(x); //á
//		x = x + i; // Type mismatch: cannot convert from int to char
		
		//답 2
		short x1 = 2;
		int i1 = 123456;
		x1+=i1;
		System.out.println(x1); //-7614
//		x1 = x1+i; //Type mismatch: cannot convert from int to short
		
		//복합할당연산자는 자동형변환이 일어남, 연산결과가 변수의 coverage를 벗어나면 축소변환이 발생한다
		//교혼1 :byte, short, char자료형에 복합할당연산자를 쓰지 말자
		//2 : long, float, double 자료형이 복합할당연산자의 우항에 오게 하지 말자
		
	
	}

}
