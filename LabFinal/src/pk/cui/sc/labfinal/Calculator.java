package pk.cui.sc.labfinal;

public class Calculator {

	/**
	 * @author Ayesha
	 * This method is used to find the maximum value
	 * @param num1 is the first integer value
	 * @param num2 is the second integer value
	 * @param num3 is the third integer value
	 * @return returns the maximum value
	 */
	
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
	/**
	 * This method is used to calculate square of integer values.
	 * @param num  is the integer value
	 * @return returns the square value
	 * @throws IllegalArgumentException when the input integer is not 
     * between <code>0</code> and <code>10</code>
     */
	
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
	/**
	 * This method is used to calculate cube of the integer.
	 * @param num is the integer value
	 * @return return the cube of the integer
	 */
	public int cube(int num){
		return num*num*num;
	}

}



