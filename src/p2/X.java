package p2;

public class X {
	public static float[] arr() {
		float[] x = new float[12];
        for (int i = 0; i < 12; i++) {
            x[i] = (float)Math.random()*11 - 7;
            System.out.println("x["+i+"]"+" = "+x[i]);
        }
        System.out.println();
		return x;
	}
}