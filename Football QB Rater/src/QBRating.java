import java.util.Scanner;

public class QBRating {
	
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in );
	
	System.out.println("Enter attempted passes: ");
	String Att = scanner.nextLine();
	float ATT = Float.parseFloat(Att);

	System.out.println("Enter number of completions: ");
	String Comp = scanner.nextLine();
	float COMP = Float.parseFloat(Comp);

	System.out.println("Enter passing yards: ");
	String Yards = scanner.nextLine();
	float YDS = Float.parseFloat(Yards);

	System.out.println("Enter touchdown passes: ");
	String TDs= scanner.nextLine();
	float TD = Float.parseFloat(TDs);

	System.out.println("Enter interceptions: ");
	String Int = scanner.nextLine();
	float INT = Float.parseFloat(Int);
	
	float a = (float) (((COMP/ATT) - 0.3) * 5);
	float b = (float) (((YDS/ATT) - 3) * 0.25);
	float c = ((TD/ATT) * 20);
	float d = (float) (2.375 - ((INT/ATT) * 25));
	
	float PSR = ((a + b + c + d)/6) * 100; 
	System.out.println("The QB Rating is: " + PSR);
	}
}
