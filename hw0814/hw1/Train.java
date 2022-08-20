package hw.hw0814.hw1;

public class Train extends Basic implements Ground {

	public Train(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void people() {
		System.out.println("可以載客約600人。");

	}

	@Override
	public void feature() {
		System.out.printf("%s的速度快速，鐵路涵蓋範圍廣，可以去往很多不同的地方。\n%s的票價便宜實惠，長短途的客人皆適合乘坐。",getName(),getName());
	}

	@Override
	public void road() {
		System.out.printf("%s為陸地上的大型交通工具，",getName());
	}

	@Override
	public void total() {
		road();	
		people();
		together();
		feature();
	}

	
}
