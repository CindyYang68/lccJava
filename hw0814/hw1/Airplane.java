package hw.hw0814.hw1;

public class Airplane extends Basic implements Fly {

	public Airplane(String name, String color, int wheel, int door) {
		super(name, color, wheel, door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void people() {
		System.out.println("�i�H����500�H���k�A�ھھ������P�����t���C");
	}

	@Override
	public void feature() {
		System.out.printf("%s�i�H��p�o��֧󻷡A�����_�ӫܵΪA�A%s�W�٦������\�I�C\n%s�ɳt�C�p�ɥi�F900�����A�O�X�ꥲ�n����q�u��C",getName(),getName(),getName());

	}

	@Override
	public void flyer() {
		System.out.printf("%s���ѪŤW���j����q�u��A",getName());
	}
	
	@Override
	public void total() {
		flyer();	
		people();
		together();
		feature();
	}

	

}
