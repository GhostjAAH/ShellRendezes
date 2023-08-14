package hu.shell;

public class Kiiras {
	
private String kiir;
	
	public String getKiir() {
		return kiir;
	}
	
	public void setKiir(String kiir) {
		this.kiir = kiir;
	}
	
	public void rendezettKiiras() {
		
		Rendezes rendez = new Rendezes();
		int[] tomb = rendez.shellRendezes();
		
		int szamolo = 0;
		for (int i = 0; i < tomb.length; i++) {
			System.out.printf("%5d", tomb[i]);
			szamolo++;
			
			if (szamolo % 10 == 0) {
				System.out.println();
			}
		}
	
	}
}
