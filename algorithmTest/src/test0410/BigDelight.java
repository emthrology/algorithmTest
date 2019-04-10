package test0410;

public class BigDelight {

	public static void main(String[] args) {
		for(byte b = Byte.MIN_VALUE; b<Byte.MAX_VALUE;b++) {
			if(b==(byte)0x90) {
				System.out.println("Joy!");
				//0x90 = 144 -->byte의 범위를 벗어나거나, (byte로 형변환했을 때)-122
				//교훈 : 항상 자료형을 일치시켜 비교해야함 
			}
		}

	}

}
