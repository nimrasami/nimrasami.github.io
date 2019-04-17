
public class Question6 {

    public static double areaOfCircle(int r, int n) {
        double deltaX = (double) r / n, a = 0, x = 0;

        while (x < r) {
            a += deltaX * Math.sqrt(r * r - x * x);
            x += deltaX;
        }
        return 4 * a;
    }

    public static void main(String[] args) {
        System.out.println(areaOfCircle(1, 10000));
    }
}
