package Functional_Interface;

public class Urun {

	private int id;
	private String isim;
	private double fiyat;
	
	
	public Urun() {
		super();
	}
	public Urun(int id, String isim, double fiyat) {
		super();
		this.id = id;
		this.isim = isim;
		this.fiyat = fiyat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object o) {
		Urun urun=(Urun)o;
		return this.id==urun.id;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+" İsim: "+isim+" Fiyat: "+fiyat;
	}
	
}
