
/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("1234");
		String s2 = new String("1234");

//		int res = obj.palindrome_string(s);
//        if(res == 1)
//        {
//            System.out.println("String is a Palindrome");
//        }
//        else
//        {
//            System.out.println("String is not a Palindrome");
//        }
		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();
		if(s.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
	}
	

	void reverseOfAString(String s) {
		String s1 = new String();
		for(int i = s.length()-1; i >= 0; i--)
		{
			s1 += s.charAt(i);
		}
		System.out.println(s1);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		int i = 0, flag = 0; 
		if(s1.length() == s2.length())
		{
			while(i < s1.length()-1)
			{
				if(s1.charAt(i) != s2.charAt(i))
				{
					flag = 1;
				}
				i++;
			}
			if(flag == 1)
			{
				System.out.println("Strings are not Equal");
			}
			else
			{
				System.out.println("Strings are Equal");
			}
		}
		else
		{
			System.out.println("Strings are not Equal !");
		}
		
		
	}
}