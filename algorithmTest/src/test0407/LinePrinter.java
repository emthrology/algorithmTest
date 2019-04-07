package test0407;

public class LinePrinter {

	public static void main(String[] args) {
		//Note : \u000A //is Unicode representation of linefeed (LF)
		//위의 '역슬래시u000A'는 유니코드의 라인피드 이스케이프인데, 
		//먼저 언급했다시피 유니코드 이스케이프는 주석에서도 작동하므로 '역슬래시u000A'이후의 문장은 개행처리되어 컴파일되지않는 문장이 되버린다
		char c = 0x000A;
		System.out.println(c);

	}

}
