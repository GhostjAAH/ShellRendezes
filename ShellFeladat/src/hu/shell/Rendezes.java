package hu.shell;

public class Rendezes {
	
private String rendez;
	
	public String getRendez() {
		return rendez;
	}
	public void setRendez(String rendez) {
		this.rendez = rendez;
	}
	public int[] shellRendezes() {
		
		Tombtoltes toltes = new Tombtoltes();
		int[] tomb = toltes.tombbeToltes();
		int l = tomb.length;
		
		for (int gap = l / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < l; i++) {
				int temp = tomb[i];
				int j;
				for (j = i; j>= gap && tomb[j - gap] > temp; j-= gap) {
					tomb[j] = tomb[j - gap];
				}
				tomb[j] = temp;
			}
		}
		return tomb;
	}
}
