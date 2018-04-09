//author: stephen tong
//makes sierpinski gasket, binary coefficient construction method
// n choose k === (~n & k == 0) (mod 2)   
public class Gasket {
	public static void main (String... args){
		final int lmao = 64;
		for (int i = 0; i < lmao; i++) {
			for(int j=0 ;j < lmao - i; j++){
				System.out.print(" ");
			}
			for (int j=0; j <=i; j++) {
				System.out.print((~i & j) ==0 ? "/\\" : "  " );
			}
			System.out.println();
		}
	}
}