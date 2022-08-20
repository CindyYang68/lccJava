package hw.hw0814.hw1;

public class Airplane extends Basic implements Fly {

	public Airplane(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void people() {
		System.out.println("可以載客500人左右，根據機型不同略有差異。");
	}

	@Override
	public void feature() {
		System.out.printf("%s可以行駛得更快更遠，乘坐起來很舒服，%s上還有提供餐點。\n%s時速每小時可達900公里，是出國必要的交通工具。",getName(),getName(),getName());

	}

	@Override
	public void flyer() {
		System.out.printf("%s為天空上的大型交通工具，",getName());
	}
	
	@Override
	public void total() {
		flyer();	
		people();
		together();
		feature();
	}

	

}
