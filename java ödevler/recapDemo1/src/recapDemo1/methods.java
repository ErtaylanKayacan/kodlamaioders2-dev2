package recapDemo1;

public class methods {

	public static void main(String[] args) {
		
			sayıBulmaca();
	}
	public static void sayıBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,6,8};
		int aranan = 1;
		boolean varMı = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranan) {
				varMı =true;
				break;
			}
		}
		
		if (varMı) {
			System.out.println("Sayı mevcutur :" +aranan);
		}else {
			System.out.println("Sayı mevcut değildir"+aranan );
		}
	}
}
