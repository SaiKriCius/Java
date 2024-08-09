package learn_hashing;


public class Character_hashing {
	static void character_hash(String s){
		
		
		s=s.replace(" ", "");
		
		int[] hash = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			
				hash[s.charAt(i)-'a']++;
			
			
		}
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < hash.length; i++) {
			
			result.append((char)('a' + i)).append(" ").append(hash[i]).append("\n");
			
		}
		System.out.println(result.toString());
		
	}
	
	
	public static void main(String[] args) {
		
		String s = "the sun looks beautiful today";
		
		character_hash(s);
	}
}
