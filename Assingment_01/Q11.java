package Assingment_01;
import java.util.Scanner;
import Assingment_01.Q6;
public class Q11 {
	public static void main(String[] args) {
		SampleClass2 obj = new SampleClass2();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b=sc.nextInt();
		sc.close();
		int result=(a>b)?obj.sum(a,b):obj.sub(a,b);
		System.out.println(result);
	}
}