package hw.hw0814.hw1;

public class Train extends Basic implements Ground {

	public Train(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void people() {
		System.out.println("�i�H���Ȭ�600�H�C");

	}

	@Override
	public void feature() {
		System.out.printf("%s���t�קֳt�A�K���[�\�d��s�A�i�H�h���ܦh���P���a��C\n%s�������K�y��f�A���u�~���ȤH�ҾA�X�����C",getName(),getName());
	}

	@Override
	public void road() {
		System.out.printf("%s�����a�W���j����q�u��A",getName());
	}

	@Override
	public void total() {
		road();	
		people();
		together();
		feature();
	}

	
}
