package hw.hw0814.hw1;

public class AmphibiousMotorcycle extends Basic implements Ground,Water  {

	
	
	public AmphibiousMotorcycle(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void people() {
		System.out.println("�i�H����1�H�C");
	}

	@Override
	public void feature() {
		System.out.printf("%s��������ΡA�b���W��p�ɥi�H�ɨ��t�סB�Q�����O�㪺�ּ�\n�i�H�f��%s�h�����W�C�ֳ]�I�A�Ҧp:������A%s���h���W������q�u�㭺��!",getName(),getName(),getName());           
	}

	@Override
	public void swim() {
		System.out.print("�H�Τ��W��p���p����q�u��A");
	}

	@Override
	public void road() {
		System.out.printf("%s�����a�W�樫",getName());
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
