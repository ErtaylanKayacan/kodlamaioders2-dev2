package recapDemo1;

public class methods2 {

	public static void main(String[] args) {
		ekle();
		String mesaj = "bugün hava çok güzel";
		String yeniMesaj= mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		int sayı = topla(3 , 2);
		System.out.println(sayı);
		int topla = topla2(2,2,3,4,5,6);
		System.out.println(topla);
	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void güncelle() {
		System.out.println("güncelendi");
	}
	public static int topla(int sayı1 , int sayı2) {
		return sayı1 + sayı2;
	}
	public static int topla2(int... sayılar) {
		int toplam =0;
		for (int sayı : sayılar ) {
			toplam += sayı;
		}
		return toplam; 
	}
}
