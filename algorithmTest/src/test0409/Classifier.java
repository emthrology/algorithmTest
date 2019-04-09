package test0409;

public class Classifier {

	public static void main(String[] args) {
		System.out.println(classify('n') + classify('+') + classify('2'));

	}
	static String classify(char ch) {
		if("01234556789".indexOf(ch)>=0) {
			return "NUMARAL ";
		}
		if("abcdefghijklmnopqrstuvwxyz".indexOf(ch)>=0) {
			return "LETTER ";
		}
		/*(아직 지원안되는 연산자들)
		if("+-*/&!=".indexOf(ch)>=0) {
			return "OPERATOR ";
		}
		*/
		//여러줄 주석을 쓸 때 가아끔 주의해야하는 부분
		return "UNKNOWN ";
		
		
	}

}
