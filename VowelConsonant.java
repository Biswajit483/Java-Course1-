
public class VowelConsonant {
	public static void main(String[] args) {
		int vl = 0;
		int con = 0;
		
		String str = "hello world";
		
		char [] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<'z') {
				if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' ||ch[i]=='u') {
					vl++;
				}else {
					con++;
				}
			}
			if(ch[i]>='A' && ch[i]<'Z') {
				if(ch[i]=='A'|| ch[i]=='E' || ch[i]=='I' || ch[i]=='O' ||ch[i]=='U') {
					vl++;
				}else {
					con++;
				}
			}
		}
		
		System.err.println("vowel="+vl + "Consonenet=" + con);
	}
	

}
