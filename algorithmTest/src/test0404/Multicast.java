package test0404;

public class Multicast {

	public static void main(String[] args) {
		System.out.println((int) (char) (byte) -1);
		
		/* int -1를 2의 보수로 표현한 2진수로 나타내면  1111,1111,1111,1111,1111,1111,1111,1111이다
		 * 그런데 byte의 최고자릿수는 2진수로 8자리이다
		 * 따라서 byte -1은 2진수로 다음과 같다
		 * 1111,1111
		 * 
		 * 그런데 char는 int를 받아 ASCII CODE로 변환시키는 것으로 알고있다 --> 그 전에 16비트화된다(축소변환)
		 * 그리고 char에는 부호가 없기 때문에 byte -1을 char로 casting하면 0000,0000,0000,0000,1111,1111,1111,1111이 된다(부호확장-->제로확장)
		 * 최종적으로 다시 int가 될 때, 부호의 자리가 0이기 때문에 양수 1111,1111,1111,1111(2^16-1 = 65535)가 출력되는 것이다
		 * 
		 * 
		 */
		System.out.println((long)(int)(long)-1);
		//제로확장이 일어나지 않는 케스팅만 있으므로 -1이 온전히 출력된다

	}

}
