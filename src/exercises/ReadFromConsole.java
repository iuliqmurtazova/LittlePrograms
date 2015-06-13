package exercises;

import java.util.Scanner;

public class ReadFromConsole {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("a= ");
		int a=input.nextInt();
		System.out.print("b= ");
		int b=input.nextInt();
		int sum=0;
		for (int i=a;i<=b;i++){
		if(i%5==0){
			sum=sum+1;
			}
		}
		System.out.printf("There is %d numbers between %d and %d that "
				+ "are divisible to 5 without reminder ",sum,a,b);
		}

}
