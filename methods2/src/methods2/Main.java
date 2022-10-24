package methods2;

public class Main {

	public static void main(String[] args) {
		int sayi=topla(8,9);
		System.out.println(sayi);
		int toplam =topla2(1,5,6,4,8,96);
		System.out.println(toplam);
		
		
		
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Siindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla2(int... sayilar ) {
		int toplam=0;
		for (int sayi : sayilar) {
			toplam+=sayi;
			
		}
		return toplam;
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	public static String sehirVer() {
		return "Ankara";
	}
}
