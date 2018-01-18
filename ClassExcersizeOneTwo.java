import java.util.Scanner;

public class ClassExcersizeOneTwo 

{
	
	public static void main ( String args[])
	{
		
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter username: ");
		String username = scanner.next();
		System.out.println("Enter password: ");
		String password = scanner.next();
		
		if(username.equals("Elephant") && password.equals("trunk"))
			{
			System.out.println("Welcome " + username);
			}
		else
			{
			System.out.println("Invalid username or password");
			}
		scanner.close();

	}
}