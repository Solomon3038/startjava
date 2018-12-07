public class Exponention {
    public static int exponent(int xe, int xo) {
        int result = 1;
        for (int i = 0; i < xo; i++) {
            result = result * xe;

        }
        return result;
    }
}

