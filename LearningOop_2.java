class RumusMatematika{
	// akses modifier private hanya bisa diakses di dalam class ini saja
	private double dataSatu;
	private double dataDua;
	
	// akses modifier protected bisa diakses pada class turunannya
	protected double luas;
	
	// akses modifier static digunakan untuk membuat variabel class
	static int jumlahObject;
	
	// overloading konstruktor
	public RumusMatematika(double dataSatu, double dataDua) {
		this.dataSatu = dataSatu;
		this.dataDua = dataDua;
	}
	
	// overloading konstruktor
	public RumusMatematika(double dataSatu) {
		this.dataSatu = dataSatu;
	}
	
	public void hitungLuas(String bentukBangun) {
		
	}
	
	public void jumlahObject() {
		System.out.println("Jumlah Object \t\t : " + RumusMatematika.jumlahObject);
		System.out.println("===================================");
	}
		
	public double getDataSatu() {
		return this.dataSatu;
	}
	
	public double getDataDua() {
		return this.dataDua;
	}
}

class PersegiPanjang extends RumusMatematika{
		
	// konstruktor
	public PersegiPanjang(double dataSatu, double dataDua) {
		super(dataSatu, dataDua);
		RumusMatematika.jumlahObject++;
	}
	
	@Override
	public void hitungLuas(String bentukBangun) {
		this.luas = this.getDataSatu() * this.getDataDua();
		System.out.println("Luas " + bentukBangun + " \t : " + this.luas);
	}
}

class Lingkaran extends RumusMatematika{
	
	// konstanta PHI
	private final double PHI = 3.14;
	
	// konsturktor
	public Lingkaran(double dataSatu) {
		super(dataSatu);
		RumusMatematika.jumlahObject++;
	}
	
	@Override
	public void hitungLuas(String bentukBangun) {
		this.luas = PHI * this.getDataSatu() * this.getDataSatu();
		System.out.println("Luas " + bentukBangun + " \t\t : " + this.luas);
	}
}

public class LearningOop_2 {
	public static void main(String[] args) {
		PersegiPanjang objPersegi = new PersegiPanjang(10, 5);
		objPersegi.hitungLuas("Persegi Panjang");
		objPersegi.jumlahObject();
		
		Lingkaran objLingkaran = new Lingkaran(20);
		objLingkaran.hitungLuas("Lingkaran");
		objLingkaran.jumlahObject();
	}
}

