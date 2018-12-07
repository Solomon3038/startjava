public class Variable {
    public static void main(String[] args) {
        int processor = 1;  // 32 bit
        double frequency = 1.80; //64 bit
        boolean r = true; //1 bit
        char currency = '$'; // 16 bit
        float unix = 16;// 32 bit
        long HD = 250;// 64 bit
        byte core = 8; // 8 bit
        short prise = 250;  //short	16 bit

        System.out.println("My computer has " + processor + " processor");
        System.out.println("The processor has " + core + " core");
        System.out.println("The frequency of eatch core is " + frequency + " GHz");
        System.out.println("The Hard Disk have " + HD + " GB memory");
        System.out.println("On the Computer is a Ubuntu " + unix + " instalation");
        System.out.println("The computer has " + " " + prise + " " + currency + " costed");


    }
}

