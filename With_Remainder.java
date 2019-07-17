import java.util.Random;

public class With_Remainder {
	
	public static int generateNum1() {
		Random rand = new Random();
		int low = 10;
		int high = 30;
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
		int num1 = generateNum1();
		int num2 = generateNum2();
		
		if(num1 < 10 && num2 < 10) {
			System.out.println("  " + num1);
			System.out.println("/ " + num2);
			System.out.println("----");
		}
		else if(num1 < 10 && num2 > 10) {
			System.out.println("   " + num1);
			System.out.println("/ " + num2);
			System.out.println("-----");
		}
		else if(num1 > 10 && num2 < 10){
			System.out.println("  " + num1);
			System.out.println("/  " + num2);
			System.out.println("-----");
		}
		else {
			System.out.println("  " + num1);
			System.out.println("/ " + num2);
			System.out.println("-----");
		}		
	}

}
