package hw.hw0814.hw1;

public class AmphibiousMotorcycle extends Basic implements Ground,Water  {

	
	
	public AmphibiousMotorcycle(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void people() {
		System.out.println("可以載客1人。");
	}

	@Override
	public void feature() {
		System.out.printf("%s為水陸兩用，在水上行駛時可以享受速度、被海水淋濕的快樂\n可以搭乘%s去玩海上遊樂設施，例如:香蕉船，%s為去海上玩的交通工具首選!",getName(),getName(),getName());           
	}

	@Override
	public void swim() {
		System.out.print("以及水上行駛的小型交通工具，");
	}

	@Override
	public void road() {
		System.out.printf("%s為陸地上行走",getName());
	}

	@Override
	public void total() {
		road();	
		swim();
		people();
		together();
		feature();
	}

	
}
