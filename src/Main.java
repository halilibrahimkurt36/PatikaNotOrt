import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] dersler= {"Matematik","Fizik","Kimya","Türkçe","Tarih","Müzik"};
		double mat,fizik,kimya,turkce,tarih,muzik;
		double ort;
		String sonuc;
		try (Scanner giris = new Scanner(System.in)) {
			System.out.print("Lütfen "+dersler[0]+" dersinin notunu giriniz :");
			mat=giris.nextDouble();
			System.out.print("Lütfen "+dersler[1]+" dersinin notunu giriniz :");
			fizik=giris.nextDouble();
			System.out.print("Lütfen "+dersler[2]+" dersinin notunu giriniz :");
			kimya=giris.nextDouble();
			System.out.print("Lütfen "+dersler[3]+" dersinin notunu giriniz :");
			turkce=giris.nextDouble();
			System.out.print("Lütfen "+dersler[4]+" dersinin notunu giriniz :");
			tarih=giris.nextDouble();
			System.out.print("Lütfen "+dersler[5]+" dersinin notunu giriniz :");
			muzik=giris.nextDouble();
		}
		ort=(mat+fizik+kimya+turkce+tarih+muzik)/dersler.length;
		System.out.println("Derslerin ortalaması "+ ort);
		sonuc=ort>60? "Geçti" : "Kaldı";
		System.out.print("Okul Durumunuz : "+sonuc);
	}
	
}
