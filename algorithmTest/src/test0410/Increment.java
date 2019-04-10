package test0410;

public class Increment {

	public static void main(String[] args) {
		int j = 0;
		for(int i =0;i<100;i++) {
			j =j+1;
			System.out.println(j);
		}
		//후위연산이라 0=0을 하고j=1이 되지만 반복문 다시 돌 때 외부에서 새롭게j=0을 받아온다
		//j++을 j+1로 바꾸었다

	}

}
