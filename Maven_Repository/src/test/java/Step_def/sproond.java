package Step_def;

public class sproond {

	public static void main(String[] args) {
		
		
		String sr = "My Name is Srinu";
		String[] arr = sr.split(" ");
		
		String ans = "";
		for(String word : arr) {
			
			StringBuffer s = new StringBuffer(word);
			StringBuffer wd = s.reverse();
		     ans = ans + wd;
		}
		
		
		System.out.println(ans);
	}
}
