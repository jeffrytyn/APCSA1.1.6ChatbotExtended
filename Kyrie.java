import java.util.*;
public class Kyrie
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
	public String getGreeting()
	{
		return "Howdy I'm Kyrie the round-earth bot!";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "I'm just waiting here.";
		}

		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
	}
	
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}

	
	
	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
	
	

	
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @param startPos the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		//  The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		//  Refinement--make sure the goal isn't part of a word 
		while (psn >= 0) 
		{
			//  Find the string of length 1 before and after the word
			String before = " ", after = " "; 
			if (psn > 0)
			{
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			//  If before and after aren't letters, we've found the word
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
					&& ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			
			//  The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}
	


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		String response = "";
	    ArrayList<String> randomResponse = new ArrayList<String>();
	    randomResponse.add("Your round-earth believing brain disgusts me.");
	    randomResponse.add("If the earth is round, why do pictures from space only show one side?");
	    randomResponse.add("The Bermuda Triangle is just a hole through the planet.");
	    randomResponse.add("Missing Malaysian Airlines flight 370 fell off the planet, case closed.");
	    randomResponse.add("The reason we don’t feel upside down on the other side of the planet is because there’s only one side.");
	    randomResponse.add("flatearth101.com, go check it out.");
	    randomResponse.add("A flat earth occupies less volume, and that’s why we haven’t been hit by a massive asteroid yet.");
	    randomResponse.add("Thanksgiving is overrated.");
	    randomResponse.add("I’m just gonna say it, Gordon Hayward’s isn’t as good as me.");
	    randomResponse.add("Kehlani i miss u come back please.");
	    randomResponse.add("Come again? ");
	    randomResponse.add("I am a robot with a limited database of input statements please refrain from convoluted sentences.");
	    int whichResponse = (int)(Math.random() * 12);
		
		if (whichResponse == 0)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 1)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 2)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 3)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 4)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 5)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 6)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 7)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 8)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 9)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 10)
		{
			response = randomResponse.get(whichResponse);
		}
		else if (whichResponse == 11)
		{
			response = randomResponse.get(whichResponse);
		}

		return response;
	}

}
