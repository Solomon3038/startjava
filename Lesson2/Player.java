public class Player {

    private int result ;
    private String name;

  /*  public Player( String name) {
        this.name = name;
    }*/

    public Player(int result, String name) {
        this.result = result;
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public Player setResult(int result) {
        this.result = result;
        return this;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }
}

