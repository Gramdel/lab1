package p1;
import p2.D;
import p2.X;
import p2.A;
import p2.Print;

public class Main {
    public static void main (String[]args) {
        Print.f(A.arr(D.arr(), X.arr()));
    }
}