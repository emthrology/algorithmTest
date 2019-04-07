package test0407;

public class Abc {

	public static void main(String[] args) {
		String letters = "ABC";
		char[] numbers = {'1','2','3'};
		System.out.println(letters + "easy as " + String.valueOf(numbers));
		//System.out.print(참조형 변수명,String 자료형 제외)을 쓰면 toString()이 호출되어 자료의 주소값이 호출된다
		//이를 방지하기위해 String.valueOf(Obj)가 사용된다

	}

}
