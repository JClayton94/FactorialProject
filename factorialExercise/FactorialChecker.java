package factorialExercise;

public class FactorialChecker {
	
	///////////////Attributes//////////////
	
	private int inputNumber;
	private int factorial;
	private boolean isFactorial = true;
	

	///////////////Constructors////////////////
	
	

	
	////////////////Methods///////////////
	
	public boolean isNumFactorial(int input) {
		
		for(int i = 2; i < input; i++) {
			
			if(input%i != 0) {
				return false;
			}
			
			input = input/i;
		}
		
	
		return true;
	}
	
	public int getInputNumber() {
		return inputNumber;
	}


	public void setInputNumber(int inputNumber) {
		this.inputNumber = inputNumber;
	}


	public int getFactorial() {
		return factorial;
	}


	public void setFactorial(int factorial) {
		this.factorial = factorial;
	}


	public boolean isFactorial() {
		return isFactorial;
	}


	public void setFactorial(boolean isFactorial) {
		this.isFactorial = isFactorial;
	}
}
