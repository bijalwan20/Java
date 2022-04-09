import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_switchstatement {

	public static void main(String[] args) {
        
		System.out.println("Choose Any One :");
		System.out.println("1    2      3    4");
		
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
		

		switch(num){
            case 1:System.out.println("2022");
            break;
            case 2:System.out.println("April");
            break;
            case 3:System.out.println("Saturday");
            break;
            default:System.out.println("Not applicable");
		}
		
	}

	private void Switch(int num) {
		// TODO Auto-generated method stub
		
	}
}