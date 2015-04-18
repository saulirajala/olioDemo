package oliot;

public class Auto {

	protected String vari;
	protected int vmalli;

	public Auto() {
		vari = "keltainen";
		vmalli = 1985;
	}

	public Auto(String vari, int vmalli) {
		this.vari = vari;
		this.vmalli = vmalli;
	}

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
