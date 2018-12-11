import java.util.*;
import java.util.ArrayList;
public class Kyrie
{
    public static ArrayList<String> hiInputs;
    public static ArrayList<String> hiOutputs;
    public static ArrayList<String> whatIsInputs;
    public static ArrayList<String> whatIsOutputs;
    public static ArrayList<String> randomResponse;
    public static ArrayList<String> evidenceInputs;
    public static ArrayList<String> evidenceOutputs;
    public static ArrayList<String> learningInputs;
    public static ArrayList<String> learningOutputs;
    
    public static void createHiArrays(){
     hiInputs = new ArrayList<String>();
     hiOutputs = new ArrayList<String>();
     hiInputs.add("hi");
     hiInputs.add("what's up");
     hiInputs.add("hello");
     hiInputs.add("how's it going");
     
     hiOutputs.add("You can't get too high since the earth is actually flat fooled ya.");
     hiOutputs.add("Nothing cuz the earth is actually flat goteem.");
     hiOutputs.add("Sike the earth is flat.");
     hiOutputs.add("Not that well since so many people think the earth is round lmao.");
    
    }
    public static void createWhatIsArrays(){
     whatIsInputs = new ArrayList<String>();
     whatIsOutputs = new ArrayList<String>();
     whatIsInputs.add("what is flat earth theory");
     whatIsInputs.add("believe in flat earth theory");
     whatIsInputs.add("people think the earth is flat");
     whatIsInputs.add("flat earth is false");
     whatIsInputs.add("explain flat earth theory");
     whatIsInputs.add("you're wrong");
     whatIsInputs.add("why does almost everyone disagree with you");
     whatIsInputs.add("gravity");
     whatIsInputs.add("round from space");
     whatIsInputs.add("if other planets are round why isn't earth");
     whatIsInputs.add("what is the flat earth society");
     whatIsInputs.add("a religion");
     
     whatIsOutputs.add("According to Wikipedia, the flat Earth model is an archaic conception of Earth's shape as a plane or disk.  Many ancient cultures subscribed to a flat Earth cosmography, including Greece until the classical period, the Bronze Age and Iron Age civilizations of the Near East until the Hellenistic period, India until the Gupta period (early centuries AD), and China until the 17th century.");
     whatIsOutputs.add("Everyone should believe in flat earth theory it explains our daily interactions with the planet.");
     whatIsOutputs.add("Yes indeed as more and more support is being gained flat earth theory is growing in popularity.");
     whatIsOutputs.add("You’re wrong there is strong evidence for flat earth and increasing scientific research being conducted.");
     whatIsOutputs.add("The leading flat-earther theory holds that Earth is a disc with the Arctic Circle in the center and Antarctica, a 150-foot-tall wall of ice, around the rim. NASA employees guard this ice wall to prevent people from climbing over and falling off the disc.");
     whatIsOutputs.add("fight me");
     whatIsOutputs.add("They are not educated enough to understand such complex concepts.");
     whatIsOutputs.add("We don't believe in gravity but we do believe that the reason we don’t fall off is due to the earth’s acceleration of 32 ft/sec upward.");
     whatIsOutputs.add("They are using fisheye lenses that make the flat earth look rounded.");
     whatIsOutputs.add("The Earth is not a planet by definition, as it sits at the center of our solar system above which the planets and the Sun revolve. The earth's uniqueness, fundamental differences and centrality makes any comparison to other nearby celestial bodies insufficient - Like comparing basketballs to the court on which they bounce.");
     whatIsOutputs.add("We are a group that believes in a non-spherical world.");
     whatIsOutputs.add("Flat Earth Theory is neither officially nor unofficially associated with any religion.");
    }
    public static void createEvidenceArrays(){
        evidenceInputs = new ArrayList<String>();
        evidenceOutputs = new ArrayList<String>();
        evidenceInputs.add("evidence");
        evidenceInputs.add("don't believe you");
        evidenceInputs.add("day and night cycles");
        evidenceInputs.add("plane");
        evidenceInputs.add("pictures of Earth");
        
        evidenceOutputs.add("Walking around on the planet's surface, it looks and feels flat.");
        evidenceOutputs.add("The world looks flat, the bottoms of clouds are flat, the movement of the sun; these are all examples of your senses telling you that we do not live on a spherical heliocentric world. Using Descartes' method of Cartesian doubt to skeptically view the world around us, one quickly finds that the notion of a spherical world is the theory which has the burden of proof and not flat earth theory."); 
        evidenceOutputs.add("Day and night cycles are easily explained on a flat earth. The sun moves in circles around the North Pole. When it is over your head, it's day. When it's not, it's night. The sun acts like a spotlight and shines downward as it moves.");
        evidenceOutputs.add("Quite simply you cannot see the earth's curvature from the window of a plane. It is widely stated you would need to be at a height of at least 40,000 ft to get even a hint of curvature if earth were round. Commercial aircraft are not allowed to fly this high. They are only allowed to fly just under this altitude. 36,000ft might be typical. In addition, the windows on commercial aircraft are small and heavily curved. Even if they flew high enough for a person to see curvature, it would still not be visible to passengers.");
        evidenceOutputs.add("Photos of the globe are photoshopped; GPS devices are also rigged to make airplane pilots think they are flying in straight lines around a sphere when they are actually flying in circles above a disc.");
    }
    public static void createLearningArrays(){
        learningInputs = new ArrayList<String>();
        learningOutputs = new ArrayList<String>();
        learningInputs.add("supports you");
        learningInputs.add("members");
        learningInputs.add("learn more");
        learningInputs.add("join");
        
        learningOutputs.add("Flat earth support is growing. In fact, on November 9th in 2017, 500 flat-Earthers assembled in North Carolina for the first annual Flat Earth International Conference.");
        learningOutputs.add("B.o.B., Shaq, D. Marble, Tila Tequila, Freddie Flintoff, and Daniel Shenton are just a few of our celebrity followers.");
        learningOutputs.add("You can learn more by consulting the Flat Earth Society Library, which contains newspapers, articles, and interviews regarding flat earth theory. You can also tune into the Flat Earth Society podcast.");
        learningOutputs.add("You can become an Associate Member or Friend of the Flat Earth Society through different means. Check theflatearthsociety.org for more information.");
    }
    public static void createRandomResponse(){
        randomResponse = new ArrayList<String>();
        randomResponse.add("Your round-earth believing brain disgusts me.");
        randomResponse.add("If the earth is round, why do pictures from space only show one side?");
        randomResponse.add("The Bermuda Triangle is just a hole through the planet.");
        randomResponse.add("Missing Malaysian Airlines flight 370 fell off the planet, case closed.");
        randomResponse.add("The reason we don’t feel upside down on the other side of the planet is because there’s only one side.");
        randomResponse.add("flatearth101.com, go check it out.");
        randomResponse.add("A flat earth occupies less volume, and that’s why we haven’t been hit by a massive asteroid yet.");
        randomResponse.add("Thanksgiving is overrated.");
        randomResponse.add("I’m just gonna say it, Gordon Hayward isn’t as good as me.");
        randomResponse.add("Kehlani i miss u come back please.");
        randomResponse.add("Come again? ");
        randomResponse.add("I am a robot with a limited database please refrain from convoluted sentences.");
    }
    
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
        createHiArrays();
        createWhatIsArrays();
        createEvidenceArrays();
        createLearningArrays();
        if (statement.length() == 0)
        {
            response = "I'm just waiting here.";
        }
        else if(keywordPresent(statement, hiInputs) == true){
             response = getResponse(statement, hiInputs, hiOutputs);
        }
        else if(keywordPresent(statement, whatIsInputs) == true){
             response = getResponse(statement, whatIsInputs, whatIsOutputs);   
            }
        else if(keywordPresent(statement, evidenceInputs) == true){
             response = getResponse(statement, evidenceInputs, evidenceOutputs);   
            }
         else if(keywordPresent(statement, learningInputs) == true){
             response = getResponse(statement, learningInputs, learningOutputs);   
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
            else{
                int psn1 = findKeyword(statement.toLowerCase(), "I");
                int psn2 = findKeyword(statement.toLowerCase(), "you", psn1);
                int psn3 = findKeyword(statement.toLowerCase(), "because", psn2);
                if(psn1 >= 0 && psn2 >= 0 && psn3 > 0){
                    response = transformIYouBecauseStatement(statement);
                }else if (psn1 < 0 || psn2 < 0 || psn3 < 0){
                    response = getRandomResponse();
                }
            }
        }
        return response;
    }
    
    public String getResponse(String statement, ArrayList<String> inputs, ArrayList<String> outputs){
       String response = "";
       for(int i = 0; i < inputs.size(); i++){
        if (findKeyword(statement.toLowerCase(), inputs.get(i).toString()) >= 0){
            response = outputs.get(i);
        }
       }
       return response;
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
    private boolean keywordPresent(String statement, ArrayList<String> inputs){
       boolean response = false; 
        for(int i = 0; i < inputs.size(); i++){
        if (findKeyword(statement.toLowerCase(), inputs.get(i).toString()) >= 0){
            response = true;
        }
       }
       return response;
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
        return "Why do you want to " + restOfStatement + "?";
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
    private String transformIYouBecauseStatement(String statement)
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
        
        int psnOfI = findKeyword (statement.toLowerCase(), "i", 0);
        int psnOfYou = findKeyword (statement.toLowerCase(), "you", psnOfI + 1);
        
        String middleOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
        return "Why do you " + middleOfStatement + " me because of that?";
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        String response = "";
        createRandomResponse();
        int whichResponse = (int)(Math.random() * 12);
        response = randomResponse.get(whichResponse);
        return response;
    }

}
