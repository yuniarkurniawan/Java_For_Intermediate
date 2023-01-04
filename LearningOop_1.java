class Mobil{
	private String merk;
	private int cc;
	
	// konstruktor pengisian variabel instan merk dan cc
	public Mobil(String merk, int cc) {
		this.merk = merk;
		this.cc = cc;
	}
	
	public void infoKendaraan() {
		System.out.println("Merk \t : " + this.merk);
		System.out.println("CC \t : " + this.cc);
		System.out.println("======================");
	}
}

public class LearningOop_1 {
	public static void main(String[] args) {
		Mobil mobilHonda = new Mobil("Honda Civic", 1200);
		mobilHonda.infoKendaraan();
		
		Mobil mobilToyota = new Mobil("Toyota", 1500);
		mobilToyota.infoKendaraan();
	}
}

