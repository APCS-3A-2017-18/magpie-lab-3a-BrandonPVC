/**
* A program to carry on conversations with a human user.
* This is the initial version that:  
 * <ul><li>
*       Uses indexOf to find strings
* </li><li>
*       Handles responding to simple words and phrases 
 * </li></ul>
* This version uses a nested if to handle default responses.
* @author Laurie White
* @version April 2012
*/
public class Magpie2
{
/**
  * Get a default greeting  
  * @return a greeting
  */
public String getGreeting()
{
  return "Hello, let's talk.";
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
  if (statement.indexOf("no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (statement.indexOf("dog") >= 0 
    || statement.indexOf("cat") >= 0)
  {
    response = "Tell me more about your pets.";
  }
  else if (statement.indexOf("Mr. MacMillan") >= 0)
    {
    response = "He must be good at teaching.";
  }
  else if (statement.indexOf("Miss Wong") >= 0)
  {
    response = "She must be good at teaching.";
  }
   else if (statement.trim().length() == 0)
   {
     response = "Please enter in at least one character.";
   }    
   else if (statement.indexOf("old") >= 0)
   {
     response = "I will not disclose my age at this time.";
   }
   else if (statement.indexOf("where") >= 0)
   {
     response = "St. Louis, Missourri";
   }
   else if (statement.indexOf("why") >= 0)
   {
     response = "No good reason";
   }  
                                
  else
  {
   response = getRandomResponse();
  }
  return response;
}

/**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
private String getRandomResponse()
{
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
  {
    response = "I'll have to think about that.";
  }
  else if (whichResponse == 5)
  {
    response = "WHAT DO YOU MEAN??";
  }  

  return response;
}
}

Sent from Mail for Windows 10

