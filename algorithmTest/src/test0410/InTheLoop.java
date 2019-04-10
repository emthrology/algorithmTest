package test0410;

public class InTheLoop {
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	
	public static void main(String[] args) {
		int count = 0;
		for(long i = START ; i<=END ; i++) {
			count++;
			System.out.println(count);	
		}
		//인덱스로 int를 쓰고 있는데 int의 최대값이 반복문 종료지즘이다 그래서 i++해도 END를 벗어날수 없는 거시다

	}

}
