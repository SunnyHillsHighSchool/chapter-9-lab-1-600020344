//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
 {
   //c is character to check. Set c to first character of a
   String c = a.substring(0,1);
   //check if c, when lowercase, is a vowel
  if (c.toLowerCase().equals("a")||c.toLowerCase().equals("e")||c.toLowerCase().equals("i")||c.toLowerCase().equals("o")||c.toLowerCase().equals("u"))
  {
    //if so return yes
    return "yes";
  }
  //set c to last character of a
  c = a.substring(a.length()-1);
  //check if c, when lowercase, is a vowel
  if (c.toLowerCase().equals("a")||c.toLowerCase().equals("e")||c.toLowerCase().equals("i")||c.toLowerCase().equals("o")||c.toLowerCase().equals("u"))
  {
    //if so return yes
    return "yes";
  }
  //otherwise return no
  return "no";
 }
}
