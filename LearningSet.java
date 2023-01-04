import java.util.HashSet;
import java.util.Set;

class MySet{
	private Set<Integer> bilangan = new HashSet<Integer>();
	
	public MySet(int[] paramBilangan) {
		for(int data:paramBilangan) {
			this.bilangan.add(data);
		}
	}
	
	public void cetakSetBilangan() {
		this.bilangan.forEach((value) -> System.out.println(value));
		System.out.println("======================");
	}
	
	public void cetakIntersectionData(Set<Integer> dataBilanganPembanding) {
		// fungsi retainAll sama dengan intersection pada python
		// digunakan untuk mencari irisan diantara set
		this.bilangan.retainAll(dataBilanganPembanding);
		this.cetakSetBilangan();
	}
	
	public void cetakUnionData(Set<Integer> dataBilanganDua) {
		this.bilangan.addAll(dataBilanganDua);
		this.cetakSetBilangan();
	}
	
	public void hapusElemenSet(Integer valueSet) {
		if(this.bilangan.contains(valueSet)) {
			this.bilangan.remove(valueSet);
		}
		this.cetakSetBilangan();
	}
}

public class LearningSet {
	public static void main(String[] args) {
		int[] bilangan = new int[] {1,2,3,4,5,6,7,8,9,10};
		MySet objSet = new MySet(bilangan);
		objSet.cetakSetBilangan();
		
		@SuppressWarnings("serial")
		Set<Integer> dataBilanganPembading = new HashSet<Integer>() {{
			add(8);
			add(9);
			add(10);
		}};
		objSet.cetakIntersectionData(dataBilanganPembading);
		
		@SuppressWarnings("serial")
		Set<Integer> dataBilanganDua = new HashSet<Integer>() {{
			add(11);
			add(12);
			add(13);
		}};
		objSet.cetakUnionData(dataBilanganDua);
		
		objSet.hapusElemenSet(10);
	}
}

