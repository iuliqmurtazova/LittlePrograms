package exercises;

import javax.swing.JOptionPane;

public class LargeSmall {
	// Compute the smallest and the largest among 4 input numbers
	   
	   public static void main(String[] args)
	   {
	      String dataString; 
	      String smallString;  
	      String largeString;  
	      String input;     
	      int largest, smallest; 

	      
	      int firstNumber, secondNumber, thirdNumber,
	         fourthNumber, fifthNumber;

	      input = JOptionPane.showInputDialog("Enter first number :" );
	      firstNumber = Integer.parseInt( input );
	      
	      input = JOptionPane.showInputDialog("Enter second number :" );
	      secondNumber = Integer.parseInt( input );
	      
	      input = JOptionPane.showInputDialog("Enter third number :" );
	      thirdNumber = Integer.parseInt( input );
	      
	      input = JOptionPane.showInputDialog("Enter fourth number :" );
	      fourthNumber = Integer.parseInt( input );
	      
	      input = JOptionPane.showInputDialog("Enter fifth number :" );
	      fifthNumber = Integer.parseInt( input );
	      
	      int[] arr={firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber};
	      
	      for(int i=0; i<arr.length-1;i++){
	    	  for (int j=0; j<arr.length-1;j++){
	    		 if(arr[j]>arr[j+1]) {
	    			int x=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=x;
	    		 }
	    	  }
	      } 
	      smallest=arr[0];
	      largest=arr[4];
	      
	      smallString ="Smallest number is: "+smallest+"\n";
	      largeString = "Largest number is: "+largest;
	      dataString=smallString+largeString;
	      
	      JOptionPane.showMessageDialog(null,dataString);   

	}  
}

