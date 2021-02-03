//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String vowels = "aeiouAEIOU";
	   if (vowels.contains(Character.toString(a.charAt(0))) || vowels.contains(Character.toString(a.charAt(a.length()-1)))) {
		   return "yes";
	   }
	   return "no";
	}
}