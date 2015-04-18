package oliot;

/**
 * Auto-luokka
 * public tarkoittaa, että kyseessä on julkinen luokka eli, että myös paketin 
 * ulkopuolella olevat luokat näkevät Auto-luokan
 * @author Ratsala
 *
 */
public class Auto {

	/* protected tarkoittaa, että attribuutit näkyvät vain niille luokille, 
	 * jotka ovat samassa paketissa Auto-luokan kanssa eli tässä tapauksessa 
	 * Rekka-luokalle
	 */
	protected String vari;
	protected int vmalli;

	/*
	 * Tämä on Auto-olioiden konstruktori, jos olion luomisen yhteydessä ei 
	 * anneta mitään attribuutteja
	 */
	public Auto() {
		this.vari = "keltainen";
		this.vmalli = 1985;
	}

	/*
	 * Tämä konstruktori luo olion annetuilla attribuuteilla
	 */
	public Auto(String vari, int vmalli) {
		this.vari = vari;
		this.vmalli = vmalli;
	}

	/*
	 * Sitten seuraa joukko gettereitä ja settereitä, joiden avulla 
	 * attribuutteja voidaan muuttaa. Nämä ovat siis tavallisia metodeja ja 
	 * niiden syntaksi on seuraava
	 * public = kyseessä on julkinen metodi
	 * String = metodi palauttaa String olion eli merkkijonon
	 * getVari() = metodin nimi ja suluissa attribuutit, joita ei ole
	 */
	public String getVari() {
		return vari;
	}

	public int getVmalli() {
		return vmalli;
	}

	public void setVari(String vari) {
		this.vari = vari;
	}

	public void setVmalli(int vmalli) {
		this.vmalli = vmalli;
	}

}
