import java.util.Scanner;
/**
 * Write a description of class KyrieRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KyrieRunner
{
   public static void main(String[] args)
	{
		Kyrie kyrie = new Kyrie();
		
		System.out.println (kyrie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println(kyrie.getHiResponse(statement));
		    System.out.println (kyrie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
