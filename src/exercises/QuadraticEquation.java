package exercises;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a=input.nextDouble();
		
		System.out.print("Enter b: ");
		double b=input.nextDouble();
		
		System.out.print("Enter c: ");
		double c=input.nextDouble();
		
		System.out.println("D=b^2-4*a*c=" + ((b*b)-4*a*c));
		double D=(b*b)-4*a*c;
		if (D>0) {
			double x1=(-b+Math.sqrt(D))/2*a;
			double x2=(-b-Math.sqrt(D))/2*a;
			System.out.println("Roots of the equation are x1="+ x1 + " x2="+x2);
		} else if (D==0) {
			double x1=(-b)/2*a;
			double x2=(-b)/2*a;
			System.out.println("Roots of the equation are x1="+ x1 + " x2="+x2);
		} else {
			System.out.println("No solution!");
		}
	}
}
