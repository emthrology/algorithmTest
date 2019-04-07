package test0407;

public class AnimalFarm {

	public static void main(String[] args) {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal: " + pig == dog);
		//+연산자가 ==연산자보다 우선순위가 높기 때문에 "Animals are equal" +pig가 우선 실행 된 다음 그것과 dog가 같은지 이항연산자 ==를 쓰고 있
		System.out.println("Animals are equal: " + pig.equals(dog));
	}

}
