package LambdaLab;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import LambdaLab.Kisi.Cinsiyet;

public class Main {
	
	public static void CinsiyeteGoreFiltrele(List<Kisi> kisiler,Kisi.Cinsiyet cinsiyet) {
		for(int i=0;i<kisiler.size();i++) {
			Kisi kisi=kisiler.get(i);
			if(kisi.getCinsiyet().equals(cinsiyet)) {
				System.out.println(kisi);
			}
		}
	}
	
	public static void YasaGoreFiltrele(List<Kisi> kisiler,int yas) {
		for(int i=0;i<kisiler.size();i++) {
			Kisi kisi=kisiler.get(i);
			if(kisi.getYas()>=yas) {
				System.out.println(kisi);
			}
		}
	}
	
	public static void kisiFiltrele(List<Kisi> kisiler,KisiFiltresi kisiFiltresi) {
		for(int i=0;i<kisiler.size();i++) {
			Kisi kisi=kisiler.get(i);
			if(kisiFiltresi.Filtrele(kisi)) {
				System.out.println(kisi);
			}
		}
	}

	public static void main(String[] args) {
		
		Kisi kisi= new Kisi("john",LocalDate.now(),"john@gmail.com",Kisi.Cinsiyet.ERKEK);
		Kisi kisi2= new Kisi("ella",LocalDate.parse("1999-03-05"),"ella@gmail.com",Kisi.Cinsiyet.KADIN);
		Kisi kisi3= new Kisi("wick",LocalDate.parse("1989-02-15"),"wick@gmail.com",Kisi.Cinsiyet.ERKEK);
	
	  System.out.println(kisi);
	  System.out.println(kisi2);
	  System.out.println(kisi3);
	
	  
	  System.out.println("----------------");
	  
	  ArrayList<Kisi> kisiler=new ArrayList<Kisi>();
	  kisiler.add(kisi3);
	  kisiler.add(kisi2);
	  kisiler.add(kisi);
	  
	  CinsiyeteGoreFiltrele(kisiler, Cinsiyet.KADIN);
	  System.out.println("----------------");
	  YasaGoreFiltrele(kisiler, 0);
	  
	  
	  
	  
	  System.out.println("------------");
	  
	  
	  
	  /*Lambda kullanmadan önce
	  KisiFiltrele(kisiler, new KisiFiltresi() {	
		@Override
		public boolean Filtrele(Kisi kisi) {
			return kisi.getYas()>15&&kisi.getCinsiyet().equals(kisi.getCinsiyet().ERKEK);
			 
		}
		*/
	  
	  //lambda kullanılırsa
	  kisiFiltrele(kisiler, (k)->k.getYas()>=15);
		
		
		
		
		
	;
	
	}
}
