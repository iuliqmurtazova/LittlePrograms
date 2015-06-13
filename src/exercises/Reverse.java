package exercises;

public class Reverse {
	
	public static void printReverseNum(int number){
		while(number!=0){
			System.out.print(number%10);
			number=number/10;
		}
	}

	public static void main(String[] args) {
		printReverseNum(345548);

	}

}
