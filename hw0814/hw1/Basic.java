package hw.hw0814.hw1;

public abstract class Basic {

	private String name,color;
	private int wheel,door;
	public Basic(String name, String color, int wheel, int door) {
		super();
		this.name = name;
		this.color = color;
		this.wheel = wheel;
		this.door = door;
	}

	public void together() {
		System.out.printf("%s的顏色為%s，總共有%d個門、%d個輪子。\n",name,color,door,wheel);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	
}
