import java.util.ArrayList;
import java.util.Arrays;

class MyArrayList{
	private ArrayList<Integer> bilangan = new ArrayList<>();
	private ArrayList<Object> sembarang = new ArrayList<>();
	
	// konstruktor pengisian data bilangan
	public MyArrayList(int paramBilangan) {
		int [] bil = new int [paramBilangan];
		Arrays.setAll(bil, i -> i+1);
		for(int data:bil) {
			this.bilangan.add(data);
		}
	}
	
	// konstruktor pengisian data sembarang
	public MyArrayList(Object[] arrObject) {
		for(int i=0;i<arrObject.length;i++) {
			this.sembarang.add(arrObject[i]);
		}
	}
	
	public void cetakBilangan() {
		System.out.println(this.bilangan);
	}
	
	public void cetakSembarang() {
		System.out.println(this.sembarang);
	}
	
	public void hapusBilangan(int paramBilangan) {
		
		// fungsi contains digunakan untuk mengecek eksis elemen
		if(this.bilangan.contains(paramBilangan)) {
			this.bilangan.remove(paramBilangan);
		}
		this.cetakBilangan();
	}
	
	public void tambahBilangan(int paramBilangan) {
		// fungsi add digunakan untuk menambahkan elemen baru
		this.bilangan.add(paramBilangan);
		this.cetakBilangan();
	}
	
	public void hapusSembarang(Object paramHapus) {
		if(this.sembarang.contains(paramHapus)) {
			this.sembarang.remove(paramHapus);
		}
		this.cetakSembarang();
	}
	
	public void tambahSembarang(int index, Object paramTambah) {
		this.sembarang.add(index, paramTambah);
		this.cetakSembarang();
	}
}

public class LearningArrayList {
	public static void main(String[] args) {
		MyArrayList objArrayBilangan = new MyArrayList(10);
		objArrayBilangan.cetakBilangan();
		objArrayBilangan.hapusBilangan(5);
		objArrayBilangan.tambahBilangan(56);
		
		Object[] dataSembarang = new Object[]{"Berlin", 10, 45.3};;
		MyArrayList objArraySembarang = new MyArrayList(dataSembarang);
		objArraySembarang.cetakSembarang();
		objArraySembarang.hapusSembarang("Berlin");
		objArraySembarang.tambahSembarang(0,"Bandung");		
	}
}

