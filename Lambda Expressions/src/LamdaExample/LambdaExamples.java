package LamdaExample;

public class LambdaExamples {
     
	public static void main(String[] args) {
		
		Merhaba merhaba=() ->"merhaba";
		
		System.out.println(merhaba.selam());
		
		Merhaba2 merhaba2=(s) ->"Merhaba "+s;
		System.out.println(merhaba2.selam("insanlar"));
	
	    Topla topla=(a,b) -> a+b;
	    System.out.println(topla.topla(2, 5));
	
	}
}
