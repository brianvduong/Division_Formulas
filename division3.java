import java.util.Random;

public class division3 {
	
	public static int generateNum2() {
		Random rand = new Random();
		int low = 1;
		int high = 20;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main (String [] args) {
		
		int number1 = 3;
		int number2 = generateNum2() * number1;
		
		if(number2 < 10) {
			System.out.println("  " + number2);
			System.out.println("/ " + number1);
			System.out.println("----");
		}
		else {
			System.out.println("  " + number2);
			System.out.println("/  " + number1);
			System.out.println("-----");
		}		
	}
	
	
	
	
}
