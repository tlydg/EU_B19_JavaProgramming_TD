package day36_Review;

import java.util.*;

public class C01_ArrayListReview {
    public static void main(String[] args) {
        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.add(10);
        numberlist.add(20);
        numberlist.add(30);
        numberlist.add(40);
        numberlist.add(50);

        //yazdırma
        System.out.println("numberlist = " + numberlist); // [10, 20, 30, 40, 50] // aynı
        System.out.println("numberlist = " + numberlist.toString()); // [10, 20, 30, 40, 50] //aynı

        // element sayısı
        System.out.println("numberlist.size() = " + numberlist.size());
        
        //boş mu ?
        System.out.println("numberlist.isEmpty() = " + numberlist.isEmpty());

        //fori ile yazdırma
        System.out.println("--------fori-------------");
        for (int i = 0; i <numberlist.size() ; i++) {
            System.out.print(numberlist.get(i)+ " ");
        }
        System.out.println();
        System.out.println("-----forEach-------");

        for (Integer number : numberlist ) {
            System.out.println("number = " + number);
        }

        System.out.println("-------------------------");

        // belirli index element ekleme
        numberlist.add(4,45);
        System.out.println("numberlist = " + numberlist); // numberlist = [10, 20, 30, 40, 45, 50]

        //belirli bir indexteki elementin değerini değiştirme
        numberlist.set(2,300);
        System.out.println("numberList = " + numberlist); //numberList = [10, 20, 300, 40, 45, 50]

        //belirli indextekini silelim.
        numberlist.remove(4);
        System.out.println("numberlist = " + numberlist); // numberlist = [10, 20, 30, 40, 50]

        //değeri 10 olan elementi sildirmek istiyorum
        System.out.println("numberlist.remove(Integer.valueOf(10)) = " + numberlist.remove(Integer.valueOf(10)));
        // true döner ve elementi siler
        System.out.println("numberlist = " + numberlist); // numberlist = [20, 30, 40, 50]
        System.out.println("numberlist.remove(Integer.valueOf(70)) = " + numberlist.remove(Integer.valueOf(70)));
       // false döner ve silme işlemi yapmaz.hata da vermez
        System.out.println("numberList = " + numberlist);  //numberList = [20, 30, 40, 50]


        //contains() metodu
        System.out.println("numberlist.contains(40) = " + numberlist.contains(40)); //true
        System.out.println("numberlist.contains(40) = " + numberlist.contains(100)); //false

        //ArrayListi tamamen silme
        numberlist.clear();
        System.out.println("numberlist = " + numberlist); // numberlist = []

        System.out.println("-------------Bir ArrayListe element ekleme yolları---------------");

        // 1. yol add ()
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(22);
        numbers.add(-78);
        numbers.add(200);

        System.out.println("numbers = " + numbers); // numbers = [2, 22, -78, 200]

        //2.yol
        //Collections addAll() metodu ile
        Collections.addAll(numbers,32,36,98,-10);
        System.out.println("numbers = " + numbers); // numbers = [2, 22, -78, 200, 32, 36, 98, -10]

        //3. yol List.of() metodu ile
        ArrayList<String> names = new ArrayList<>(List.of("Ali","Veli","Berrin"));
        System.out.println("names = " + names); // names = [Ali, Veli, Berrin]
        names.add("Zeliha");
        System.out.println("names = " + names); // names = [Ali, Veli, Berrin, Zeliha]

        // 4. yol Arrays.asList() metodu ile
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Ali","Elif","Serap"));
        System.out.println("isimler = " + isimler); // isimler = [Ali, Elif, Serap]
        isimler.add("Hamza");
        System.out.println("isimler = " + isimler); // isimler = [Ali, Elif, Serap, Hamza]

        Integer [] sayilar={2,20,-9,33};
        ArrayList<Integer>sayilarList = new ArrayList<>(Arrays.asList(sayilar));
        System.out.println("sayilarList = " + sayilarList); // sayilarList = [2, 20, -9, 33]

        // 5. yol  çift süslü parantez ile girme
        ArrayList<String> adlar = new ArrayList<>(){{
            add("Hasan");
            add("Yeşim");
            add("Mahmet");
        }};
        System.out.println("adlar = " + adlar); // adlar = [Hasan, Yeşim, Mahmet]

        //ArrayList sıralama
        Collections.sort(adlar);
        System.out.println("adlar = " + adlar); //adlar = [Hasan, Mahmut, Yeşim]
        adlar.sort(Comparator.reverseOrder());
        System.out.println("adlar = " + adlar); //adlar = [Yeşim, Mahmut, Hasan]
        adlar.sort(Comparator.naturalOrder());
        System.out.println("adlar = " + adlar); //adlar = [Hasan, Mahmut, Yeşim]

        //ArrayList'i Array'e çevirme
        // 1. yol for döngüsü ile
        String [] adlarArray = new String[adlar.size()];

        for (int i = 0; i <adlar.size() ; i++) {
            adlarArray[i] = adlar.get(i);
        }
        System.out.println("Arrays.toString(adlarArray) = " + Arrays.toString(adlarArray)); //[Hasan, Mahmet, Yeşim]

        //2.yol
        //toArray() metodu ile
        String [] adlarArray2 = adlar.toArray(new String[0]);

        System.out.println("Arrays.toString(adlarArray2) = " + Arrays.toString(adlarArray2));


    }
}
