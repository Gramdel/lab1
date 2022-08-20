package p2;

public class A {
	public static double[][] arr(int[] d,float[] x) {
		double[][] a = new double[9][12];
		int i = 0;
		while (i<9) {
			for (int j = 0; j < 12; j++) {
				if (d[i] == 8) {
					a[i][j] = (Math.pow(Math.E,Math.log(Math.abs(x[j])))+1)/Math.log(Math.acos((x[j]-1.5)/11));
				} 
				else {
					if (d[i] == 4 || d[i] == 10 || d[i] == 14 || d[i] == 18) {
						a[i][j] = Math.sin(Math.pow(Math.E,Math.cbrt(x[j])));
					} else {
						a[i][j] = Math.tan(Math.cos(Math.asin(0.25*(x[j]-1.5)/11)));
					}
				}
			}
			i++;
		}
		return a;
	}
}