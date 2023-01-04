import java.util.HashMap;
import java.util.Map;

class MyMap{
	private Map<String, String> sembarang = new HashMap<>();
	
	// konsturktor pengisian data map sembarang
	public MyMap() {
		this.sembarang.put("banten", "tanggerang");
		this.sembarang.put("jakarta", "dki jakarta");
		this.sembarang.put("bandung", "jawa barat");
		this.sembarang.put("semarang", "jawa tengah");
		this.sembarang.put("yogyakarta", "dki yogyakarta");
		this.sembarang.put("palembang", "sumatra selatan");
	}
	
	public void cetakDataMap() {
		/*
		for(Map.Entry<String, String> data : this.sembarang.entrySet()){
			System.out.println(data.getKey() + " = " + data.getValue());
		}
		*/
		// iterating menggunakan forEach
		this.sembarang.forEach((key, value) -> System.out.println(key + " = " + value));
		System.out.println("=====================");
	}
	
	public void hapusDataMap(String keyMap) {
		this.sembarang.remove(keyMap);
		this.cetakDataMap();
	}
	
	public void ubahDataMap(String keyMap, String valueMap) {
		if(this.sembarang.containsKey(keyMap)) {
			this.sembarang.replace(keyMap, valueMap);
		}
		this.cetakDataMap();
	}
	
	public void tambahDataByPengecekanKey(String keyMap, String valueMap) {
		this.sembarang.putIfAbsent(keyMap, valueMap);
		this.cetakDataMap();
	}
	
	public void cekMapByKey(String keyMap) {
		System.out.println(this.sembarang.containsKey(keyMap));
	}
	
	public void cekMapByValue(String valueMap) {
		System.out.println(this.sembarang.containsValue(valueMap));
	}
}

public class LearningMap {
	public static void main(String[] args) {
		MyMap objMap = new MyMap();
		objMap.cetakDataMap();
		objMap.hapusDataMap("palembang");
		objMap.ubahDataMap("banten", "serang");
		objMap.tambahDataByPengecekanKey("surabaya", "jawa timur");
		objMap.cekMapByKey("banten");
		objMap.cekMapByValue("serang");
	}
}

