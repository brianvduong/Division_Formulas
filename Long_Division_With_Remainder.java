import java.util.Random;

public class Long_Division_With_Remainder {
	
	public static int generateNum1() {
		Random rand = new Random();
		int low = 500;
		int high = 1500;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static int generateNum2() {
		Random rand = new Random();
		int low = 1;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main (String [] args) {
		
		int number1 = generateNum1();
		int number2 = generateNum2();
		
		if(number1 < 1000) {
			System.out.println("  " + number1);
			System.out.println("/   " + number2);
			System.out.println("------");
		}
		else {
			System.out.println("  " + number1);
			System.out.println("/    " + number2);
			System.out.println("-------");
		}		
		
	}
}
