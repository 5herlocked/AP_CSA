public class GayAssShit {
	public static void main (String ... args){
		One var1 = new Two();
		One var2 = new Three();
		One var3 = new Four();
		Three var4 = new Four();
		Object var5 = new Three();
		Object var6 = new One();

		var1.method1();                 //____________________________
		System.out.println();
		var2.method1();                 //____________________________
		System.out.println();
		var3.method1();                 //____________________________
		System.out.println();
		var4.method1();                 //____________________________
		System.out.println();
		//var5.method1();                 //____________________________

		//var6.method1();                 //____________________________

		var4.method2();                 //____________________________
		System.out.println();
		//var4.method3();                 //____________________________

		//((Two)var1).method2();          //____________________________

		//((Three)var1).method2();        //____________________________

		((Two)var1).method3();          //____________________________
		System.out.println();
		//((Four)var2).method1();         //____________________________

		((Four)var3).method1();         //____________________________
		System.out.println();
		((Four)var4).method3();         //____________________________
		System.out.println();
		((One)var5).method1();          //____________________________
		System.out.println();
		//((Four)var5).method2();         //____________________________

		((Three)var5).method2();        //____________________________
		System.out.println();
		((One)var6).method1();          //____________________________
		System.out.println();
		//((One)var6).method2();          //____________________________

		//((Two)var6).method3();          //____________________________


	}
}    
