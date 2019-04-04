package test0404;

public class JoyOfHex {

	public static void main(String[] args) {
		System.out.println(
				Long.toHexString(0x100000000L + 0xcafebabe));
		/*16진수
		 * 01234566789
		 * abcdef
		 * 
		 * 0x?
		 * -->16진수 표기하겠다는 소리
		 * 
		 * String java.lang.Long.toHexString(long i)
		 * Returns a string representation of the long argument as an unsigned integer in base 16.
		 * 
		 * unsigned int n2; //16개의 비트를 하용하며 0을 포함하여 모두 양수이다.-->부호표시를 안함
         *             // range : 0 ~ 65,535
         *             
         * 뒤의 숫자 0xcafebabe는 long이 아니다.
         * 그런데 java의 int는 기본적으로 부호를 가지고 있기 때문에 변환될 때 부호확장이 일어나서 0xffffffffcafbabeL이 된다
         * 앞의 숫자와 더하면 같은 수에 부호만 붙은 꼴이 되어 상쇄되어 사라지고, cafebabe만 남게 된다
         *             
		 */
		
	}

}
