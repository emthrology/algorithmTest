package test0410;

public class Shifty {

	public static void main(String[] args) {
		int i = 0;
		while(-1<<i !=0) {
			i++;
			System.out.println(i);
		}
		/*
		 * -1 = 0000 0000 0000 0000 0000 0000 0000 0001 의 2 보수 = 1111 1111 1111 1111 1111 1111 1111 1111
		 * 1111을 왼쪽으로 비트이동연산 -> ff ff ff f 1110
		 * i++ -->1
		 * 1100-->2
		 * 1000-->3
		 * ...0000-->반복문 break;
		 * 이래서 32 아닌가?
		 * 
		 * -1을 시프트연산하려해도 시프트연산은 5개(long은 6개)만 사용하므로 비트시프트연산은 소용이없게된다고한다 
		 */

	}

}
