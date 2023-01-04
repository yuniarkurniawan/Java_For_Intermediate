import java.util.ArrayList;
import java.util.Arrays;

class MyArray{
	
	private int [] bilangan;
	private String [] namaKota;
	private Object [] sembarang;
	
	// konstruktor untuk bilangan
	public MyArray(int panjangElemen) {
		this.bilangan = new int [panjangElemen];
		Arrays.setAll(this.bilangan, i -> i+1);
	}
	
	// konstruktor untuk nama kota
	public MyArray(String[] namaKota) {
		this.namaKota = namaKota;
	}
	
	// konstruktor untuk tipe object
	public MyArray(Object[] sembarang) {
		this.sembarang = sembarang;
	}
	
	public void cetakBilangan() {
		System.out.println(Arrays.toString(this.bilangan));
	}
	
	public void cetakNamaKota() {
		System.out.println(Arrays.toString(this.namaKota));
	}
	
	public void hapusElemenKota(String paramNamaKota) {
		ArrayList<String> arrList = new ArrayList<String>();
		for(String data:this.namaKota) {
			arrList.add(data);
		}
		
		arrList.remove(paramNamaKota);
		System.out.println(arrList);
	}
	
	public void cetakSembarang() {
		System.out.println(Arrays.toString(this.sembarang));
	}
}

public class LearningArray {
	public static void main(String[] args) {
		MyArray objArrayBilangan = new MyArray(10);
		objArrayBilangan.cetakBilangan();
		
		String [] namaKota = new String [] {"Serang", "Jakarta", "Bandung", "Semarang", "Yogyakarta", "Surabaya", "Berlin"};
		MyArray objArrayNamaKota = new MyArray(namaKota);
		objArrayNamaKota.cetakNamaKota();
		objArrayNamaKota.hapusElemenKota("Berlin");
		
		Object[] sembarang = new Object [] {"Bandung", 10, 45.3};
		MyArray objSembarang = new MyArray(sembarang);
		objSembarang.cetakSembarang();
	}
}
