import oliot.Auto;
import oliot.Rekka;

/**
 * Apuohjelma, jolla demonstroin olio-osaamistani
 * 
 * @author Sauli Rajala
 * 
 */
public class testOhjelma {
	public static void main(String[] args) {
		Auto opel = new Auto("ruskea", 1888);
		System.out.println("Opel");
		System.out.println("Vuosimalli = " + opel.getVmalli() + " ja väri = "
				+ opel.getVari());

		Rekka sisu = new Rekka();
		System.out.println("Sisu");
		System.out.println("Kuormaus = " + sisu.getKuormaus()
				+ ", vuosimalli = " + sisu.getVmalli() + " ja väri = "
				+ sisu.getVari());

		opel.setVari("punainen");
		sisu.setKuormaus(1000);

		System.out.println("Opel");
		System.out.println("Vuosimalli = " + opel.getVmalli() + " ja väri = "
				+ opel.getVari());

		System.out.println("Sisu");
		System.out.println("Kuormaus = " + sisu.getKuormaus()
				+ ", vuosimalli = " + sisu.getVmalli() + " ja väri = "
				+ sisu.getVari());
	}
}
