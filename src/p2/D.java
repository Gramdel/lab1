package p2;

public class D {
	public static int[] arr() {
		int[] d = new int[9];
        for (int i = 0; i < 9; i++) {
            d[i]=(i+1)*2;
            System.out.println("d["+i+"]"+" = "+d[i]);
        }
        System.out.println();
		return d;
	}
}