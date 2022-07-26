
public class AssignmentCode {

	static final int sum2 = 0;

	public static void main(String[] args) {
	//1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	 int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};	
	 
	 
	 
		/* a. Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code). Print the result to the console.
		 */
	System.out.println(ages[ages.length-1]-ages[0]);
	
	
	 //b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
	 int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93,80,85};
	 System.out.println(ages2[ages2.length-1]-ages2[0]);
	 
	 
	 //c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	 int sum =0;
	 for( int i =0; i<=ages.length-1;i++) {
		 //int sum =0;
		 sum = sum + ages[i];
		//sum++;  
	 }
		double average = (double)sum/(ages.length);
	 System.out.println(average);
	 
	 
	 
	 
	 //2.	Create an array of String called names that contains the following values:
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	 
	 String [] names = {"Sam", "Tommy", "Sally","Buck", "Bob"};
	 
	 
	//a.	Use a loop to iterate through the array and calculate the average number of letters per name.
	 //Print the result to the console.
	 
	          int sumOfLetters= 0;
		for (int j=0; j<=names.length-1; j++) {
			sumOfLetters += names[j].length();
		}
		//System.out.print(names[j] + " ");	
	    double average2 = (double)sumOfLetters/names.length;	
		System.out.println(average2);	
	 
		
		
	// b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String allNames = " ";
			for (int n =0; n<names.length; n++) {
				allNames = allNames  + " ";
			}
			System.out.print(allNames);
			
			
			
			/*
			 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
			 * the previously created names array and add the length of each name to the
			 * nameLengths array.
			 */		
			int[] nameLengths  = new int[names.length];
			for(int m =0; m<names.length-1; m++) {
				nameLengths[m] = names[m].length();
			}
			
			
			/*
			 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
			 * of all the elements in the array. Print the result to the console.
			 * 
            */
			  int sumNameLengths= 0;
			for(int i=0; i<nameLengths.length; i++) {
				sumNameLengths += nameLengths[i];
			}	
			System.out.println(sumNameLengths);
        }

	
	
		/*
		 * 7. Write a method that takes a String word, and an int n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		 */
	     public static String concatenatedWords(String word, int n){
	    	 
	    	  String result= "";
	    	  
	    	  if(n==0) return result;
	    	  
	    	  for (int i =1; i<=n; i++) {
	    		  result = result + word;
	    	  }
	    	  return  result;
	     }
	     
	     
			/*
			 * 8. Write a method that takes two Strings, firstName and lastName, and returns
			 * a full name (the full name should be the first and the last name as a String
			 * separated by a space).
			 * 
			 * 
			 */
	     
	     public static String writeFullName(String firstName, String lastName){
	    	 
	    	
	    	 String fullName = firstName + " " + lastName;
			return fullName;
	    
	     }
	  
	     
	     //9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	     
    public static boolean isSumOfArrayIntsGreaterThan100(int[] array) {
        
	    int sum = 0;
       
	    for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        if (sum < 100) {
            return false;
        } else {
            return true;
          }
         }
         
	     //10.	Write a method that takes an array of double and returns the average of all the elements in the array. 
	     
	      public static double averageElementsinArray(double[] array) {
        double averageAnswer = 0;
        double sum = 0;
        for (double element : array) {
            sum += element;
            averageAnswer = sum / array.length;
        }
        return averageAnswer;
    }

	      

//11.	Write a method that takes two arrays of double and returns true if 
//the average of the elements in the first array is greater than the average of the elements in the second array.
	      
	      public static boolean isArray1AverageGreaterThanArray2Average(double[] array1, double[] array2) {
        double average1 = 0;
        double sum1 = 0;
        double average2 = 0;
        double sum2 = 0;
        for (double element : array1) {
            sum1 += element;
            average1 = sum1 / array1.length;
        }
        for (double element : array2) {
            sum2 += element;
            average2 = sum2 / array2.length;
        }
        if (average1 > average2) {
            return true;
        } else {
            return false;
        }
    }

	      
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

   public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	
	
	if (isHotOutside && moneyInPocket>10.50) {
		return true;
	}else {
		
		return false;
	}
   }
	
	
	//13. Write a method called willBecomeBackendSoftware that takes a boolean doYouStudy5HoursADay, and a boolean doYouPracticeMoreCodes
		//and returns true if it is you study 5 hours a day and if you practice more codes.
		
		public static boolean willBecomeBackendSoftware(int study5HoursADay, boolean doYouPracticeMoreCodes) {       
        if(study5HoursADay >=5 && doYouPracticeMoreCodes) {           
            System.out.println("I am going to be a Backend Software.");
            return true;
        }
        return false;       
    }
   
	
	











