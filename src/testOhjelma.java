/*
 * importataan eli tuodaan testOhjelmaan oliot-pakkauksessa olevat
 * Auto- ja Rekka-luokat
 */
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
		
		//luodaan Auto-luokan olio nimeltä opel annetuilla attribuuteilla
		Auto opel = new Auto("ruskea", 1888);
		System.out.println("Opel");
		System.out.println("Vuosimalli = " + opel.getVmalli() + " ja väri = "
				+ opel.getVari());

		/*
		 * Tämä aiheuttaa errorin, siksi kommenteissa
		 * Virhe tulee siitä, että Auto-luokassa ei ole määritelty sellaista 
		 * konstruktoria, joka osaisi käsitellä tilanteen, jossa oliolle annetaan
		 * vain väri muttei vuosimallia. 
		 *
		Auto fiiat = new Auto("sininen");
		System.out.println(fiiat.getVari());
		 */
		
		
		//luodaan Rekka-luokan olio nimeltä sisu ilman attributteja, joilloin 
		//attribuuteiksi tulevat Rekka- ja Auto-luokissa määritelly oletusarvot
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
