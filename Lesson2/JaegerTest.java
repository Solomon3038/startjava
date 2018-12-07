public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger();
        gipsy.setArmor(6);
        gipsy.setSpeed(7);
        gipsy.setModelName("Gipsy");
        gipsy.setWeight(1.980f);
        gipsy.setHeight(260);
        gipsy.setMark("Mark-3");
        gipsy.setOrigin("USA");
        gipsy.setStrenght(8);

        gipsy.useVorteCannon();
        gipsy.move();
        gipsy.drift();
        gipsy.scanKaiju(" Hello");

      /* Jaeger striker = new Jaeger("Striker", "Mark-5","Australia", 250,1850f, 10, 10, 9);
     Jaeger gipsy = new Jaeger("Gipsy","Mark-3","USA",260, 1.980f, 7, 8, 6);*/

        Jaeger striker = new Jaeger();
        striker.setArmor(9);
        striker.setSpeed(10);
        striker.setModelName("Striker");
        striker.setWeight(1.850f);
        striker.setHeight(250);
        striker.setMark("Mark-5");
        striker.setOrigin("Australia");
        striker.setStrenght(10);


        System.out.println(striker.getArmor());
        System.out.println(striker.getSpeed());
        System.out.println(striker.getModelName());
        System.out.println(striker.getWeight());
        System.out.println(striker.getHeight());
        System.out.println(striker.getMark());
        System.out.println(striker.getOrigin());
        System.out.println(striker.getStrenght());


        System.out.println("     ");
        System.out.println("     ");


        System.out.println(gipsy.getArmor());
        System.out.println(striker.getSpeed());
        System.out.println(gipsy.getModelName());
        System.out.println(gipsy.getWeight());
        System.out.println(gipsy.getHeight());
        System.out.println(gipsy.getMark());
        System.out.println(gipsy.getOrigin());
        System.out.println(gipsy.getStrenght());

        gipsy.move();
        gipsy.scanKaiju(" ");
        gipsy.drift();
        gipsy.useVorteCannon();

    }
}

