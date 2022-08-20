package p2;

public class Print {
	public static void f(double[][] a) {
		for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%8.4f ", a[i][j]);
            }
            System.out.println();
        }
	}
}