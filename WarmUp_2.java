/*
 * This is a collection of CodingBat's Warmup-2 solutions.
 * Author: theNorthAbyss
 * Date:3/22/2020
 */
public class WarmUp_2 {
	
	/* Problem 1 : stringTimes
	 * 
	 * Given a string and a non-negative int n,
	 * return a larger string that is n copies of the original string.
	 * 
	 */
	
	public String stringTimes(String str, int n) {
		
		String finalString = "";
		
		for(int i =0; i<n;i++) {
			finalString+= str;
		}
		return finalString;
		
		/* Recursive Answer:
		 * 
		 * if(n == 0)return "";
		 * return str + stringTimes(str,n-1);
		 */
	}
	
	/* Problem 2 : frontTimes
	 * 
	 * Given a string and a non-negative int n, we'll say that the
	 * front of the string is the first 3 chars, or whatever is there
	 * if the string is less than length 3. Return n copies of the front.
	 * 
	 */
	
	public String frontTimes(String str, int n) {
		String front3="";
		if(str.length()<3) {
			for(int i =0; i<n ;i++) {
				front3+=str;
			}
			return front3;
		}
		for(int i =0; i<n ;i++) {
			front3+=str.substring(0,3);
		}
		return front3;
		  
		/* Recursive Answer:
		 * 
		 * if(n==0)return "";
		 * 
		 * if(str.length()<3)return str+frontTimes(str,n-1);
		 * 
		 * return str.substring(0,3)+frontTimes(str,n-1);
		 */
		
	}
	
	/* Problem 3 : countXX
	 * 
	 * Count the number of "xx" in the given string.
	 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 * 
	 */
	
	int countXX(String str) {
		int count = 0;
		
		for(int i =0;i<str.length()-1;i++) {
			if(str.charAt(i)=='x'&&str.charAt(i+1)=='x')count++;
		}
		
		return count;
	
		/* Recursive Answer:
		 * 
		 * if(str.length()<=1)return 0;
		 * 
		 * if(str.charAt(0)=='x'&&str.charAt(1)=='x')return 1+countXX(str.substring(1));
		 * 
		 * else return 0+countXX(str.substring(1));
		 *
		 */

	}
	
	/* Problem 4 : doubleX
	 * 
	 * Given a string, return true if the first instance of "x"
	 * in the string is immediately followed by another "x".
	 * 
	 */
	
	boolean doubleX(String str) {
		  
		for(int i =0; i<str.length()-1;i++) {
			if(str.charAt(i)=='x' && str.charAt(i+1)=='x')return true;
			else if(str.charAt(i)=='x')return false;
		}
		return false;
		
		/* Recursive Answer:
		 * 
		 * if(str.length()<=1)return false;
		 * 
		 * if(str.charAt(0)=='x'&& str.charAt(1)=='x')return true;
		 * 
		 * else if(str.charAt(0)=='x')return false;
		 * 
		 * return doubleX(str.substring(1));
		 *
		 */
		
		
	}
	
	/* Problem 5 : stringBits
	 * 
	 * Given a string, return a new string made of every other char
	 * starting with the first, so "Hello" yields "Hlo".
	 * 
	 */
	
	public String stringBits(String str) {
		  String bits="";
		  
		  for(int i =0; i<str.length();i+=2) {
			  bits+= str.charAt(i);
		  }
		  return bits;
		  
		  /* Recursive Answer:
		   * 
		   * if(str.length()<=1)return str;
		   * return str.charAt(0)+stringBits(str.substring(2));
		   * 
		   */
		  
	}
	
	/* Problem 6 : stringSpolsion
	 * 
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 * 
	 */

	public String stringSplosion(String str) {
		  String exploded= "";
		  
		  for(int i = 0; i<=str.length();i++) {
			  exploded+= str.substring(0,i);
		  }
		  return exploded;
		  
		  /* Recursive Answer:
		   * 
		   * ??
		   * 
		   */
	}
	
	
	/* Problem 7 : stringSpolsion
	 * 
	 * Given a string, return the count of the number of times that a substring
	 * length 2 appears in the string and also as the last 2 chars of the string,
	 * so "hixxxhi" yields 1 (we won't count the end substring).
	 * 
	 */
	
	public int last2(String str) {
		
		 if(str.length()<= 1){
			    
			    return 0;
			    
			  }else{ 
			    
			     String last2=str.substring(str.length()-2);
			     
			     int count =-1;
			     
					  for(int i =0;i < str.length()-1 ;i++) {
						  if((str.substring(i,i+2)).equals(last2)) count++;
					  }
					  return count;
			  }
		 /* Recursive Answer:
		   * 
		   * ??
		   * 
		   */	 
	}
	
	/* Problem 8 : arrayCount9
	 * 
	 * Given an array of ints, return the number of 9's in the array.
	 * 
	 */
	
	public int arrayCount9(int[] nums) {
		  int count =0;
		  
		  for(int i =0; i< nums.length; i++) {
			  if(nums[i]==9)count++;
			  
		  }
		  return count; 
		  
		  /* Recursive Answer: ???? fix
		   * 
		   *  if(nums.length==0)return 0;
		   *  else if(nums[1]==9)return 1+ arrayCount9(String[] modifiedArray = Arrays.copyOfRange(nums, 1, nums.length));
		   * 
		   */	
	}
	
	/* Problem 9 : arrayFront9
	 * 
	 * Given an array of ints, return true if one of the first 4 
	 * elements in the array is a 9.The array length may be less than 4.
	 * 
	 */
	
	public boolean arrayFront9(int[] nums) {
		  boolean hasNine = false;
		  
		if(nums.length >=4) {
			
			for(int i = 0; i< 4; i++) {
				if(nums[i]==9)hasNine=true;
			}
		}
		
		else 
		{
			for(int i = 0; i< nums.length; i++) {
				if(nums[i]==9)hasNine=true;
			}
		}
		return hasNine;
		 
		  /* Recursive Answer: ???? 
		   * 
		   * 
		   */	
	}
	
	/* Problem 10 : array123
	 * 
	 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 
	 * appears in the array somewhere.
	 * 
	 */
	
	public boolean array123(int[] nums) {
		  boolean hasSequence= false;
		  
		  for(int i =0; i< nums.length;i++) {
			  if(i+2 <nums.length &&nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)hasSequence=true;
		  }
		  return hasSequence;
		  
		  /* Recursive Answer: ???? 
		   * 
		   * 
		   */	
	}
	
	/* Problem 11 : stringMatch
	 * 
	 * Given 2 strings, a and b, return the number of the 
	 * positionswhere they contain the same length 2 substring.
	 * So "xxcaazz" and "xxbaaz" yields 3,since the "xx", "aa", and "az"
	 * substrings appear in the same place in both strings.
	 * 
	 */
	
	public int stringMatch(String a, String b) {
		int count= 0;
		  
		for(int i =0; i< a.length()&& i<b.length();i++ ) {
			if(i+2<=a.length()&&i+2<=b.length()&& a.substring(i,i+2).equals(b.substring(i,i+2)))count++;
		}
			return count; 
			
			/* Recursive Answer: ???? 
			 * 
			 * 
			 */	
	}
	
	/* Problem 12 : stringX
	 * 
	 * Given a string, return a version where all the "x" have been removed. 
	 * Except an "x" at the very start or end should not be removed.
	 * 
	 */
	
	public String stringX(String str) {
		if(str.length() <=1)return str;
		  String removeX=str.substring(0,1);
		  
		  for(int i =2;i<str.length()-2;i++) {
			  if(str.charAt(i)!= 'x')removeX+=str.charAt(i);
		  }
		  return removeX+str.substring(str.length()-1);
		  
		  /* Recursive Answer: ???? 
		   * 
	       * 
		   */	
	}
	
	/* Problem 13 : altPairs
	 * 
	 * Given a string, return a string made of the chars at indexes 
	 * 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 * 
	 */
	
	public String altPairs(String str) {
		String altStr="";
		 
		 for(int i =0; i<str.length(); i+=4) {
			 if(i==0 && str.length()>=2)altStr+=str.substring(0,2);
			 
			 else if(i+2 <= str.length())altStr+= str.substring(i,i+2);
			 
			 else if(i+1 <= str.length())altStr+= str.substring(i,i+1);
		 }
		 return altStr;
		 
		 /* Recursive Answer: ???? 
		   * 
	       * 
		   */	
	}
	
	/* Problem 14 : stringYak
	 * 
	 * Suppose the string "yak" is unlucky. Given a string,
	 * return a version where all the "yak" are removed, 
	 * but the "a" can be any char. The "yak" strings will not overlap.
	 * 
	 */
	
	public String stringYak(String str) {
		  String noYak="";
		  
		   for (int i=0; i<str.length(); i++) {
			    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
			      i =  i + 2;
			    } else { 
			      noYak = noYak + str.charAt(i);
			    }
		  }
		   return noYak;
	}
	
	/* Problem 15 : array667
	 * 
	 * Given an array of ints, return the number of times that two 6's 
	 * are next to each other in the array. Also count instances where 
	 * the second "6" is actually a 7.
	 * 
	 */
	
	public int array667(int[] nums) {
		
		  int count =0;
		
		for(int i =0;i<nums.length-1;i++) {
			if(nums[i]==6 && (nums[i+1]==6 ||nums[i+1]==7) )count++;
		}
		return count;
	}
	
	/* Problem 16 : noTriples
	 * 
	 * Given an array of ints, we'll say that a triple is a value appearing
	 * 3 times in a row in the array. Return true if the array does not contain
	 * any triples.
	 * 
	 */
	
	public boolean noTriples(int[] nums) {
		  
		for(int i =0; i <nums.length-2;i++) {
			if(nums[i]==nums[i+1]&& nums[i]==nums[i+2])return false;
		}
		return true;
	}
	
	/* Problem 17 : has271
	 * 
	 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
	 * followed by the value plus 5, followed by the value minus 1. 
	 * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
	 * 
	 */
	
	public boolean has271(int[] nums) {
		
		for (int i=0; i < (nums.length-2); i++) {
		    int val = nums[i];
		    if (nums[i+1] == (val+5) &&              
		      Math.abs(nums[i+2] - (val-1)) <= 2) {  
		        return true;
		    }
		    
		  }
		return false;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("There are 17 total problems");

	}
}
