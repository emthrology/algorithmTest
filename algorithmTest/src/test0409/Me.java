package test0409;

public class Me {

	public static void main(String[] args) {
		System.out.println(
				Me.class.getName().replaceAll(".", "/") + ".class");
		//String.replaceAll()메서드는 첫 번째 매개변수를 문자열이 아니라 '정규표현식'으로 인식한다
		//정규표현식"."은 모든 문자를 의미하므로 위 코드는 모든 문자를 "/"으로 바꾼다
		//이를 방지하려면 이스케이프문자를 만들어야하는데 \를 두 개를 써야한다\\
		

	}

}
