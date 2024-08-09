package learn_hashing;


public class All_Character_hashing {
	
	static void allcharacter(String s) {
		
		int[] hash = new int[256];
		
		for (int i = 0; i < s.length() ; i++) {
			
				hash[s.charAt(i)]++;
				
		}
		
		int max = 0;
		int index = 0;
		for (int i = 0; i < (hash.length -1); i++) {
			
				if(max < hash[i]) {
					max=hash[i];
					index = i;
				}
		}
		
		System.out.println("'"+(char)(index)+"'" +" " + hash[index]);
		
		
		
	}
public static void main(String[] args) {
		
		String s = "the sun looks beautiful today but it won't for long because something is approaching soon";
		
		allcharacter(s);
	}
	
}
