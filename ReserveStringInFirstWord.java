package player;
import java.util.Scanner;
public class ReserveStringInFirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String:");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int c=a.length();
StringBuffer b=new StringBuffer(a).reverse();
System.out.println(b);
	}

}
