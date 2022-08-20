package hw.hw0814.hw1;

public class Taxi extends Basic implements Ground {

	
	public Taxi(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
	}

	@Override
	public void people() {
		System.out.println("可以載客4人。");
	}

	@Override
	public void feature() {
		System.out.printf("%s路上隨處可見，也可以使用app叫車，它將客人直接載到目的地，方便快速，是客人趕時間的第一首選。",getName());
	}

	@Override
	public void road() {
		System.out.printf("%s為陸地上的小型交通工具，",getName());
	}
	
	@Override
	public void total() {
		road();	
		people();
		together();
		feature();
	}	
	
	

}
