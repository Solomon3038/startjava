package guessnumber;

public class Player {
	private String name;
	private int value;
	
	public Player(String name) {
		this.name = name;
		this.value = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getValue() {
		return this.value;
	}
}