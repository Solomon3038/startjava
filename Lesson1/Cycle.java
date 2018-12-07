public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }
        System.out.println("  ");
        int n = 6;

        while (-6 <= n) {
            System.out.println(n);
            n -= 2;

        }
        System.out.println("   ");
        int i = 11;

        int sum = 0;
        do {
            sum = sum + i;
            if (i % 2 != 0) {
                i += 2;
            }

        } while (i < 21);
        System.out.println(sum);
    }
}



