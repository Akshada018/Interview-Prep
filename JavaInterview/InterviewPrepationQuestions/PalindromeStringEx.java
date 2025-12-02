public class PalindromeStringEx{
	  public static void main(String[] args) {
	        String str = "Abac";
	        if(isPalindrome(str)){
	            System.out.print(str+" is a palindrome!");
	        }else{
	            System.out.print(str+" is not palindrome!");

	        }
	    }
	    
	    public static boolean isPalindrome(String s){
	        String reversed = reverseString(s);
	        
	        if(s.equalsIgnoreCase(reversed)){
	            return true;
	        }
	        else return false;
	    }
	    
	    public static String reverseString(String str){
	        if(str.isEmpty()){
	            return str;
	        }
	        
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }
}