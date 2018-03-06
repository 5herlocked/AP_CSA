public class Kms {
	public static void main (String ... args){
		Animal[] a = {new Bird(), new Dog(), new Cow()};

		for (int i = 0; i < a.length; i++){
			a[i].speak();
		}
	}
}