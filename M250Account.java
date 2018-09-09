/**
 * Answer to TMA01 Question 1.
 * 
 * @author Sam Lichy
 * @date 13/12/2017
 */

public class M250Account
{
   private String accountNum;

   /**
    * A constructor for objects of class M250Account that assigns the accountNum attribute a temporary account
	 * number.
    */
   public M250Account()
   {
      accountNum = "X00000";
     
   }
   
   /**
	 * A getter method for the accountNum instance variable.
	 */
	public String getAccountNum()
   {
      return accountNum;
   }
   
   /**
	 * A method to test whether the character length of the provided string 's' is valid. The length is valid 
	 *	if 's' is 6 characters long. The method returns true if the length is equal to 6, and false if 
	 *	otherwise.
	 */
	public boolean isValidLength(String s)
   {
      if (s.length() == 6) //condition to check if the character length of string 's' is 6.
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
	 * A method to test whether the first character of the provided string 's' is a capital letter. The method 
	 *	returns true if the first letter of the provided string 's' is a letter and upper case, and false if the first 
	 * character is not a letter, or if the first letter is not upper case.
	 */
	public boolean isValidStart(String s)
   {  
      if (Character.isLetter(s.charAt(0))) //condition to check if the first character of string 's' is a letter.
      {
         if (s.charAt(0) == Character.toUpperCase(s.charAt(0))) //condition to check if the first character of the string 's' is upper case.
			{
				return true;
			}
			else
			{
				return false;
			}
      }
      else
      {
         return false;
      }
   }
   
   /**
	 * A method to test whether all the characters after the first (capital) letter, of the provided string 's', 
	 *	are digits. The method returns false if any character after the first (capital) letter is not a digit, 
	 *	otherwise the method returns true.
	 */
	public boolean hasValidDigits(String s)
   {
      for (int i = 1; i < s.length(); i++) //looping from i= 1, ... , (length of string 's'  -  1), where i represents the index value of each character in the string 's'  
      {
         if (!Character.isDigit(s.charAt(i))) // condition to check whether each character after index 0 is not a digit.
         {
            return false;
         }
      }
      
      return true;
   }
   
    /**
	 * A method to test whether a user has provided a valid account number by testing whether the three tests:
	 * isValidLength, isValidStart and hasValidDigits, have all returned true for an input string 's'. The 
	 * method returns false if any of the three tests return false, otherwise the method returns true.
	 */
   public boolean isValidAccountNum(String s)
   {
      if (isValidLength(s) && isValidStart(s) && hasValidDigits(s)) //condition to check if all three methods return true. 
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
	 * A setter method to set the accountNum to the received string 's' if the method 'isValidAccountNum' returns 
	 * true. If true is returned, the setter method also prints the message "Value xxxxxx is valid", where 'xxxxxx'
	 * is the string referenced by 's'. If false is returned, the setter method prints the message "Value 'xxxxxx'
	 * is not valid" and the accountNum is unchanged from the value 'X00000" set by the constructor.
	 */
	public void setAccountNum(String s)
   {
      if (isValidAccountNum(s)) //condition to check if the method 'isValidAccountNum(s)' returns true
      {
         accountNum = s;
         System.out.println("Value " + s + " is valid");
      }
      else
      {
         System.out.println("Value " + s + " is not valid");
      }
   }
}
