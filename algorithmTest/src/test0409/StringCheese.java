package test0409;

public class StringCheese {
	public static void main(String[] args) {
		byte[] bytes = new byte[256];
		for(int i:bytes) {
			bytes[i] = (byte)i;
		}
		String str = new String(bytes);
		for(int i = 0;i<str.length();i++) {
			System.out.print((int)str.charAt(i) + " ");
		}
		/*
		 * String(byte[])생성자는 CharacterSet에 따라 결과가 다르므로byte[]을 문자열로 변환할 때에는 반드시 케릭터셋을 지정해야한다
		 * 컴퓨터가 utf시리즈밖에 지원못함;;
		 */
	}

}
