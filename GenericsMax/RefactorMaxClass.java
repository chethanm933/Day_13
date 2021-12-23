package GenericsMax;

public class RefactorMaxClass<M extends Comparable<M>> {

	M a , b , c ;

	public M getMax(M a , M b , M c ) {
		M max = a;
		if (b.compareTo(max) > 0 ) {
			max = b;
		} 
		if (c.compareTo(max) > 0){
			max = c;
		}
		printMax(a , b , c , max);
		return max;
	}
	public static String getMaxStr(String a , String b , String c ) {
		String max = a ; 
		if (b.compareTo(max) > 0 ) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a , b , c , max);
		return max;
	}
	public static <M> void printMax(M a, M b, M c, M max) {
		System.out.printf("Max of %s, %s and %s is %s\n",a,b,c,max);
	}
	
	public static void main(String[] args) {
		Integer aInt = 1 , bInt = 2 ,cInt = 3 ;
		Float aFl = 1.2f , bFl = 8.2f , cFl = 60.2f ;
		String aStr = "INDIA" , bStr = "Delhi" , cStr = "banglore" ;

		RefactorMaxClass<String> refactorMaximumClass = new RefactorMaxClass();
		RefactorMaxClass<Integer> refactorMaximumClass1 = new RefactorMaxClass();
		RefactorMaxClass<Float> refactorMaximumClass11 = new RefactorMaxClass();

		System.out.println(refactorMaximumClass.getMax(aStr, bStr, cStr));

		//refactorMaximumClass11.getMax(aStr, bStr, cStr);
		//RefactorMaximumMethod.getMax(aInt, bInt, cInt);
		//RefactorMaximumMethod.getMaxDoub(aFl, bFl, cFl);
	}
}
