package hw.hw0814.hw1;

public class Taxi extends Basic implements Ground {

	
	public Taxi(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
	}

	@Override
	public void people() {
		System.out.println("�i�H����4�H�C");
	}

	@Override
	public void feature() {
		System.out.printf("%s���W�H�B�i���A�]�i�H�ϥ�app�s���A���N�ȤH��������ت��a�A��K�ֳt�A�O�ȤH���ɶ����Ĥ@����C",getName());
	}

	@Override
	public void road() {
		System.out.printf("%s�����a�W���p����q�u��A",getName());
	}
	
	@Override
	public void total() {
		road();	
		people();
		together();
		feature();
	}	
	
	

}
