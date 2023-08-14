package hu.shell;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Feltoltes {
	
	private String rszamok;
	
	public String getRszamok() {
		return rszamok;
	}
	public void setRszamok(String rszamok) {
		this.rszamok = rszamok;
	}
	public void filebaToltes() {
		
		Random random = new Random();
		List<Integer> szamok = new ArrayList<>();
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("src//szamok.txt");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		PrintWriter pWriter = new PrintWriter(writer);
		for(int i = 0; i < 100; i++){
	        int szam = random.nextInt(1000); 
	        
	        while (szamok.contains(szam)) {
	        	szam = random.nextInt(1000);
	        }
	        szamok.add(szam);
	        pWriter.print(szam + " ");
	    }
		pWriter.close();
	}
}
