package LamdaExample;
public class Lamda {
          
	public static void main(String[] args) {
		
		/*
		//arka tarafta anonim bir sınıf oluşturuldu
		SayıOlustur sayiOlustur=new SayıOlustur() {
			
			@Override
			public double olustur() {
			
				return 15.0;
			}
		};
		
		System.out.println(sayiOlustur.olustur());
		
		*/
		
		
		/* fonskiyonel interface ile birlikte lambda expressionlar 
	       kullanılarak yukarıdaki ifade tekrardan yazılır 
	       bu  şekilde anaonim bir sınıf oluşturulmaz 
		*/
		SayıOlustur sayiOlustur = () -> 15.0;
		
		
		
	}
}
