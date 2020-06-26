package lambdas_streams;

import java.util.List;
import java.util.stream.Collectors;

public class Palindromes {
	public static boolean isPalindrome(String string)
	{
		int len=string.length();
		boolean flag=true;
		for(int i=0;i<len/2;i++)
		{
			if(string.charAt(i)!=string.charAt(len-i-1))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static List<String> palindromeStrings(List <String> list)
	{
	  return list.stream().filter(value->isPalindrome(value)).collect(Collectors.toList());
	}
}
