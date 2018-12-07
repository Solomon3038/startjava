
public class Jaeger {
    String modelName;
    String mark;
    String origin;
    float height;
    float weight;
    int speed;
    int strenght;
    int armor;


  /*  public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
    }*/

    public String getModelName() {
        return modelName;
    }

    public Jaeger setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getMark() {
        return mark;
    }

    public Jaeger setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public String getOrigin() {
        return origin;
    }

    public Jaeger setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public Jaeger setHeight(float height) {
        this.height = height;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public Jaeger setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Jaeger setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public int getStrenght() {
        return strenght;
    }

    public Jaeger setStrenght(int strenght) {
        this.strenght = strenght;
        return this;
    }

    public int getArmor() {
        return armor;
    }

    public Jaeger setArmor(int armor) {
        this.armor = armor;
        return this;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }


    String scanKaiju(String str) {
        System.out.println("nothing");
        return "";
    }

    void useVorteCannon() {
        System.out.println("The Vortex is ready to shoot");
    }
}



