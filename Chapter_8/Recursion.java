import console.*; 

public class Recursion {
	private static void yeet (String death, int nope){
		if (nope < death.length()){
			int i;
			for (i = 0; i <= nope; i++){
				System.out.println(death.substring(nope, nope+1));
			}
			yeet(death, nope+1);
			for (int j = 0; j <= nope; j++){
				System.out.println(death.substring(nope, nope+1));
			}
		}
	}

	public static void main (String ... args){
		yeet("ABCD", 0);
	}
}