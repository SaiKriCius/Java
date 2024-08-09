package basic_maths;

public class Stringpallidromecheck {
	static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        
        for(char ch : s.toCharArray()) {
        	if(Character.isLetter(ch) || Character.isDigit(ch)) {
        		sb.append(Character.toLowerCase(ch));
        	}	
        }
        
        
        String pallicheck = sb.toString();
        int l = pallicheck.length();
        for (int i = 0; i < (l/2); i++) {
            if (pallicheck.charAt(i) != pallicheck.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }
		public static void main(String[] args) {
			String phrase = "A man, a plan, a canal: Panama";

			
			System.out.println(isPalindrome(phrase));
		}
}
