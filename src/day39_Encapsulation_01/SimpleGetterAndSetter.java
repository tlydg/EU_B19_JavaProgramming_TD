package day39_Encapsulation_01;

public class SimpleGetterAndSetter {

    // private - sınırlı erişim vardır.Aynı class içinden ulaşılabilir.
    // Data members--> must be private
    private int number;

    //Constructor
    public SimpleGetterAndSetter() {
       // this.number=0;
        setNumber(0);
    }

    public SimpleGetterAndSetter(int number) {
        setNumber(number);
        /*
        if(number>0){
           this.number = number;
        }else{
            System.out.println("number değişkeni 0 dan küçük olamaz");
            this.number=0;
        }
        */

    }

   /*
    public void numberDegerAta(int number){ //bir setter metod ancak isimlendirme standardına uygun değil
         if(number>0){
            this.number = number;
        }else{
            System.out.println("number değişkeni 0 dan küçük olamaz");
            this.number=0;
        }
    }
    */


    // getter method -- return tipi vardır
    public int getNumber() {return number;}

    // setter veya Mutator method -- data set etmeye yarar
    public void setNumber(int number) {
        //this.number = number; // herhangi bir kontrol yapmadan doğrudan değişkene değer atar
        //Yukarıddaki gibi Doğrudan değer atamak yerine bazı kontroller sonrası değer atamak için aşağıdaki kontrolleri yazdık

        //Değişkene doğrudan değer atamak yerine belirli bir kurala uygun olup olmadığına karar verip değer atamasını bu karara göre yaptık
        if(number>0){
            this.number = number;
        }else{
            System.out.println("number değişkeni 0 dan küçük olamaz");
            this.number=0;
        }
    }

    @Override
    public String toString() {
        return "SimpleGetterAndSetter{" +
                "number=" + number +
                '}';
    }
}
