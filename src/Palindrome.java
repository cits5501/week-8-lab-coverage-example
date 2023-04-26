
public class Palindrome {
    
    public boolean isPalindrome(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
        String reversed = sb.toString();
        return inputString.equals(reversed);
    }   
}
