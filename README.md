
# Java 8 Yenilikleri Projesi

Bu proje, Java 8'in önemli yeniliklerini içermektedir.

## İçerik

1. **Lambda İfadeleri:**
   - Proje içinde lambda ifadelerini kullanarak örnekler bulunmaktadır.
   - Java'da Lambda ifadeleri (Lambda expressions), Java 8 sürümü ile birlikte eklenen bir özelliktir. Lambda ifadeleri, özellikle fonksiyonel arayüzlerle (functional interfaces) birlikte kullanılarak kodun daha kısa ve okunabilir olmasını sağlar. Lambda ifadeleri, genellikle bir arayüzde yalnızca bir abstract metodu bulunan fonksiyonel arayüzlerle kullanılır.

      **Lambda İfadesi (Lambda Expression):**
      - Temelde anonim yani isimsiz bir metottur.
      - Bu metot kendisini icra etmez.
      - Fonksiyonel arayüz tarafından tanımlanan metodu implemente etmek için kullanılır.
      - Lambda ifadelerinin yapısı anonim sınıflar gibidir.
      - Genel olarak closures (kapanışlar) şeklinde atfedilirler.

2. **Fonksiyonel Arayüzler:**
   - Temel fonksiyonel arayüz örneklerini içermektedir.
   - Fonksiyonel Arayüz  (Functional interface):
     - İçerisinde sadece ve sadece bir adet soyut metot bulunduran arayüze verilen isimdir.
     - Bu metot arayüzün kullanım amacını ifade eder.
     - Lambda ifadelerinin hedef tipini tanımlar.
     - SAM (Single Abstract Method) yani tek soyut sınıf olarak atfedilirler.
     - Kendimiz fonksiyonel arayüz tanımlayabileceğimiz gibi, java 8 tarafından java.util.function paketinde tanımlanmış fonksiyonel arayüzleri de kullanabiliriz. Bu arayüzler;
     
        - Consumer<T>
          - Açıklama: Bu arayüz, parametre olarak bir nesne alır ve herhangi bir dönüş değeri olmayan bir işlem gerçekleştirir. Genellikle bir türdeki nesneler üzerinde bir işlem yapmak için kullanılır.
          - Kullandığı Metod: `void accept(T t)`
          
        - Supplier<T>
          - Açıklama: Bu arayüz, herhangi bir parametre almadan bir değer üreten bir işlemi temsil eder. Genellikle bir türdeki nesneleri üretmek için kullanılır.
          - Kullandığı Metod: `T get()`
          
        - Predicate<T>
          - Açıklama: Bu arayüz, bir koşulu değerlendirip true veya false dönen bir işlemi temsil eder. Genellikle filtreleme veya kontrol amaçlı kullanılır.
          - Kullandığı Metod: `boolean test(T t)`

Bu fonksiyonel arayüzler, Java 8 ve sonraki sürümlerde eklenmiştir ve lambda ifadeleri ile birlikte kullanıldıklarında, kodun daha kısa, okunabilir ve esnek olmasını sağlarlar.






