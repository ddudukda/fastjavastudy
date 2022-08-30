package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();  //오브젝트 타입은 형변환을 해줘야해서 번거로움 -> 제너릭
		System.out.println(p.toString());
		System.out.println(printer.toString());

		
	}

}
