package test0409;

import java.io.File;

public class MeToo {

	public static void main(String[] args) {
		System.out.println(MeToo.class.getName().replaceAll("\\.", File.separator) + ".class");
		//위 api는 윈도우에서 컴파일할 때 오류가 발생한다. -->정규표현식은 런타임 에러 발생 확률이 높으므로 주의해야한다
		//String.replaceAll()의 두번째 매개변수는 일반문자열이 아니라 java.util.regex에 따르는 치환문자열이다
		//해법1:java.util.regex.Matcher.quoteReplaacement() 사용하기
		//해법2:String.replace(CharSequence, CharSequence)메서드 사용하기-->replaceAll()과 달리 매개변수를 모두 일반문자열로 다룬다
		//정리: 익숙치 않은 라이브러리 메서드를 사용할 때는 주의해야한다. 모르는 부분은 자바 definition을 꼭 참고해야함

	}

}
