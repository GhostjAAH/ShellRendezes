package hu.shell;
import java.io.*;

public class Tombtoltes {
	
	private String betolt;
	
	public String getBetolt() {
		return betolt;
	}
	
	public void setBetolt(String betolt) {
		this.betolt = betolt;
	}
	
	public int[] tombbeToltes() {
		
		int[] tomb = new int[100];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src//szamok.txt"));
			String line;
			int szamolo = 0;
		
			while ((line = br.readLine()) != null){
				String[] szamokString = line.split(" ");
				for (String szamString : szamokString) {
					int szam = Integer.parseInt(szamString);
					tomb[szamolo++] = szam;
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return tomb;
	}
}
