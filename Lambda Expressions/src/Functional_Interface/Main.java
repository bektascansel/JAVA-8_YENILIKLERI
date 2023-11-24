package Functional_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

// matematik arayüzünden iki farklı şekilde yararlanılabilir


public class Main {

	public static void main(String[] args) {
		
		//1. yöntem anonim sınıf oluşturrarak 
		Matematik matematik=new Matematik() {
			
			@Override
			public void islem(double e, double b) {
				System.out.println(e+b); 
				
			}
		};
		
		matematik.islem(5, 10);
		
		
		
		//2. yöntem olarak lambda kullanılır
		
		Matematik matematik2=(a,b)->System.out.println(a+b);
		
		matematik2.islem(5, 10);
		
		
        Matematik matematik3=(a,b)->System.out.println(a-b);
		
		matematik3.islem(5, 10);
		
		
		
		
		ArrayList<String> sehirler=new ArrayList<String>();
		sehirler.add("ankara");
		sehirler.add("istanbul");
		sehirler.add("eskişehir");
		sehirler.add("didim");
		sehirler.add("izmir");
		
		
		
		
		System.out.println("************JAVANIN KENDİ İÇERİSİNDEKİ FUNCTİONAL INTERFACE************");
		
		System.out.println("*********CONSUMER**********");
		//Consumer<T> javanın kendi functionel interface 
		
		//1.Yol (Anonim class kullanarak)
		sehirler.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		
		//2.Yol(Lambda kullanarak)
		sehirler.forEach((s)->System.out.println(s));
		
		
		System.out.println("*********PREDİCATE**********");
		
		//Predicate<T> javanın kendi functionel interface 
		//1.Yol (Anonim class kullanarak)
		Predicate<String> predicate=new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				
				return t.startsWith("a");
			}
		};
		
		for (int i = 0; i < sehirler.size(); i++) {
			String sehir=sehirler.get(i);
			if(predicate.test(sehir)) {
				System.out.println(sehir);
			}
		}
		
		
		//2.Yol(Lambda kullanarak)
		Predicate<String> predicate2=(s)->s.startsWith("d");
		for (int i = 0; i < sehirler.size(); i++) {
			String sehir=sehirler.get(i);
			if(predicate2.test(sehir)) {
				System.out.println(sehir);
			}
		}
		
		
		
		
		System.out.println("*********SUPPLİER**********");
		//Supplier<T> javanın kendi functionel interface 
		//Supplier bize istediğimiz nesneyi döndürür.
		
		//1.Yol (Anonim class kullanarak)
		Supplier<Urun> supplier=new Supplier<Urun>() {
			
			@Override
			public Urun get() {
				Urun urun= new Urun(1,"kalem",5);
				return urun;
			}
		};
		
		System.out.println(supplier.get());
		
		
		
		//2.Yol(Lambda kullanarak)
		Supplier<Urun>supplier2=()->new Urun(2,"kitap",355);
		System.out.println(supplier.get());
		
		//Supplier liste de döndürebilir.
		Supplier<List<Urun>> supplier3=()->{
			List<Urun> list=new ArrayList<Urun>();
			list.add(new Urun(4,"defter",5));
			list.add(new Urun(5,"boya",7));
			list.add(new Urun(6,"silgi",8));
			list.add(new Urun(7,"kalem tıraş",9));
			return list;
		};
		
		System.out.println(supplier3.get());
		
		
		
		
		
		
		
		
		System.out.println("*********COMPARATOR**********");
		//Comparator<T> javanın kendi functionel interface 
		//Comparator fonskiyonel arayüz ile istediğimiz degerleri istediğimiz şekilde sıralayabiliriz.
		List<Urun> urunler=new ArrayList<Urun>();
		urunler.add(new Urun(14,"defter",5));
		urunler.add(new Urun(5,"boya",7));
		urunler.add(new Urun(61,"silgi",8));
		urunler.add(new Urun(7,"kalem tıraş",9));
		
		
		//1.Yol (Anonim class kullanarak)
		Collections.sort(urunler,new Comparator<Urun>() {
            
			//id numarasına göre küçükten büyüğe sıralar.
			@Override
			public int compare(Urun o1, Urun o2) {
				return o1.getId()-o2.getId();
			}
		});
		urunler.forEach((o)->System.out.println(o));
		
		
		//2.Yol(Lambda kullanarak)
		//id numarasına göre büyükten küçüğe sıralar
		Collections.sort(urunler,(a,b)->b.getId()-a.getId());
		urunler.forEach((o)->System.out.println(o));
		
	}
}
