
public class Programe {
	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		boolean res = isAnagram(str1,str2);
		if(res) {
			System.err.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
	}
	static boolean isAnagram(String s,String t) {
		int []count1= occrance(s);
		int []count2 = occrance(t);
		
		for(int i=0;i<count1.length;i++) {
			if(count1[i]!= count2[i]) {
				return false;
			}
		}
		return true;
	}
	
	static int [] occrance(String str) {
		int[] count = new int[26];
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				count[ch-65]++;
			}
			if(ch>= 'a' && ch<='z') {
				count[ch-97]++;
			}
		}
		return count;
	}
	

}
