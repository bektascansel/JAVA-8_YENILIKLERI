package LambdaLab;

import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable{
    public enum Cinsiyet{
    	KADIN,
    	ERKEK
    }
	private String isim;
	private LocalDate dogumTarihi;
	private String emailAdres;
	private Cinsiyet cinsiyet;
	private int yas;
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public String getEmailAdres() {
		return emailAdres;
	}
	public void setEmailAdres(String emailAdres) {
		this.emailAdres = emailAdres;
	}
	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public Kisi(String isim, LocalDate dogumTarihi, String emailAdres, Cinsiyet cinsiyet) {
		super();
		this.isim = isim;
		this.dogumTarihi = dogumTarihi;
		this.emailAdres = emailAdres;
		this.cinsiyet = cinsiyet;
	}
	
	public Kisi() {
		super();
	}
	
	
	public Kisi(String isim, LocalDate dogumTarihi, String emailAdres, Cinsiyet cinsiyet, int yas) {
		super();
		this.isim = isim;
		this.dogumTarihi = dogumTarihi;
		this.emailAdres = emailAdres;
		this.cinsiyet = cinsiyet;
		this.yas = yas;
	}
	//iki kişinin mail adresleri aynı ise bu kişileri aynı say
	@Override
	public int hashCode() {
		return emailAdres.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		Kisi kisi=(Kisi)o;
		return this.emailAdres.equals(kisi.emailAdres);
	}
	
	@Override
	public String toString () {
		return "İsim: "+isim+" Dogum Taihi: "+dogumTarihi+" Email: "+emailAdres+" Cinsiyet: "+cinsiyet+" Yas: "+getYas();
	}
	public int getYas() {
		return LocalDate.now().getYear()-dogumTarihi.getYear();
	}
	
	
	
}
