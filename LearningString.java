import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

class MyString{
	private String dataString;
	
	// konstruktor pengisian data
	public MyString(String paramString) {
		this.dataString = paramString;
	}
	
	public void cetakUpperString() {
		System.out.println(this.dataString.toUpperCase());
	}
	
	public void cetakLowerString() {
		System.out.println(this.dataString.toLowerCase());
	}
	
	public void cetakSplitCharacter(String paramPemisah) {
		
		String [] tmpSplit = this.dataString.split(paramPemisah);
		System.out.println(Arrays.toString(tmpSplit));
	}
	
	public void cetakTitleString(String paramPemisah) {
		StringBuilder outPut = new StringBuilder();
		Stream.of(this.dataString.split(paramPemisah)).forEach(data -> {
			char [] charArray = data.toLowerCase().toCharArray();
			
			// uppercase karakter pertama
			charArray[0] = Character.toUpperCase(charArray[0]);
			outPut.append(new String(charArray)).append(" ");
		});
		
		System.out.println(outPut.toString().trim());
	}
	
	public void cetakSubstring(int indeksAwal, int indeksAkhir) {
		System.out.println(this.dataString.substring(indeksAwal, indeksAkhir));
	}
	
	public void cetakTambahDataString(String[] paramString) {
		StringBuilder output = new StringBuilder();
		output.append(this.dataString);
		for(String data:paramString) {
			output.append(data).append(" ");
		}
		System.out.println(output.toString().trim());
	}
	
	public void cetakHapusDataString(String paramHapusData, String paramPemisah) {
		StringBuilder outPut = new StringBuilder();
		Stream.of(this.dataString.split(paramPemisah)).forEach(data -> {
			
			// fungsi equalsIgnoreCase akan membandingkan 
			// tanpa perlu memperhatikan huruf besar dan kecil
			if(!data.equalsIgnoreCase(paramHapusData)) {
				outPut.append(data).append(" ");
			}			
		});
		
		System.out.println(outPut.toString().trim());
	}
	
	public void cetakReplaceDataString(String paramOldData, String paramUbahData) {
		System.out.println(this.dataString.replace(paramOldData, paramUbahData));
	}
	
	public void cetakReversedDataString() {
		StringBuilder output = new StringBuilder(this.dataString);
		System.out.println(output.reverse().toString().trim());
	}
	
	public void cetakTokenizer(String paramPemisah) {
		StringBuilder outPut = new StringBuilder();
		StringTokenizer token = new StringTokenizer(this.dataString, paramPemisah);
		while(token.hasMoreTokens()) {
			outPut.append(token.nextToken()).append(":");
		}
		
		System.out.println(outPut.toString().trim());
	}
	
}

public class LearningString {
	public static void main(String[] args) {
		MyString objMyString = new MyString("lAgi bElajar string euy");
		objMyString.cetakUpperString();
		objMyString.cetakLowerString();
		objMyString.cetakSplitCharacter(" ");
		objMyString.cetakTitleString(" ");
		objMyString.cetakSubstring(0, 4);
		
		String [] dataString = new String[] {",","ngopi", "dulu", "ahh"};
		objMyString.cetakTambahDataString(dataString);
		
		objMyString.cetakHapusDataString("EUY", " ");
		objMyString.cetakReplaceDataString("bElajar", "Haduuhh");
		objMyString.cetakReversedDataString();
		
		MyString objMyStringToken = new MyString("lAgi-bElajar-string-euy");
		objMyStringToken.cetakTokenizer("-");
	}
}

