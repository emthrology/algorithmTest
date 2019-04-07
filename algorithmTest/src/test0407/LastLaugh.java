package test0407;

public class LastLaugh {

	public static void main(String[] args) {
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
		//문자열을 합치면 두 문자열을 합한 문자열을 출력
		//문자를 합치려하면 두 문자에 해당하는 아스키코드값으로 변환뒤 더해져서 정수값이 출력
		//자바 api들은 char를 String에 가깝게 처리하므로 대표젹인 문자 관련 api StringBuffer()를 사용하여 char를 연결한다
		StringBuffer sb = new StringBuffer();
		sb.append('H');
		sb.append('a');
		System.out.println(sb);
		
		System.out.println("2+2 = " + (2+2));
		//연산자 오버로딩을 막기 위해 괄호를 쳤다
	}

}
