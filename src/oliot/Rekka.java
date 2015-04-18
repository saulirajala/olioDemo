package oliot;

/**
 * Rekka-luokka joka perii Auto-luokan eli Rekka on Auton aliluokka
 * periminen ilmaistaan avainsanalla extends
 * @author Ratsala
 *
 */
public class Rekka extends Auto {
	protected int kuormaus;

	public Rekka() {
		this.kuormaus = 2000;
		this.vari = "punainen";
		this.vmalli = 1998;
	}

	public int getKuormaus() {
		return kuormaus;
	}

	public void setKuormaus(int kuormaus) {
		this.kuormaus = kuormaus;
	}
}
