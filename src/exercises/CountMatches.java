package exercises;

public class CountMatches {
	public static int count(int[] array, int num){
		int counter=0;
		for(int i=0; i<array.length;i++){
			if(array[i]==num){
				counter++;
			}
		}	
		System.out.println(counter);
		return counter;
		
	}	
	

	public static void main(String[] args) {
		int[] array = {5,5,6,8,9,5,5,4,5,7,5,6,8,2,6};
		count(array,6);
	}

}
