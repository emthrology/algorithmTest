package test0403;

public class LongDivision {

	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24*60*60*1000*1000;
		final long MILLS_PER_DAY = 24*60*60*1000;
		System.out.println(MICROS_PER_DAY / MILLS_PER_DAY);
		
		long num1 = 24*60*60*1000*1000;
		long num2 = 24*60*60*1000;
		System.out.println(num1);		//500,654,080???-->86,400,000,000 이 아니다->연산하는 애들이 int라서 곱하기할 때 overflow
		System.out.println(num2);		//86,400,000

		System.out.println(num1/num2);  //5
		System.out.println();
		
		long num3 = ((long)24*60*60*1000)*1000; //int가 오버플로우되기전에 강제형변환 하고 나머지 연산
		long num5 = 24L*60*60*1000*1000;//형변환 더 쉽게
		System.out.println(num3);		//86,400,000,000
		long num4 = 24*60*60*1000;
		int result = (int) (num3/num4);
		System.out.println(result);		//1000
		System.out.println(num5/num4);

	}

}
