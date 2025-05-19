package day37_Constructor_PassingPbjects01;

import java.util.ArrayList;
import java.util.Objects;

public class Banka {

    String name;
    String adress;
    int hesapNo;

    ArrayList<Musteri> musteriler;


    public Banka(){
        name="İsimsiz Banka";
        adress="Adres Bilgisi Yok";
        hesapNo= 1000;
        musteriler= new ArrayList<>();
    }
    public Banka(String name, String adress, int hesapNo){
        this.name=name;
        this.adress=adress;
       this.hesapNo=hesapNo;
       musteriler=new ArrayList<>();
    }

    public void musteriEkle(Musteri musteri){
        hesapNo++;
        musteri.hesapNo = hesapNo;
        musteriler.add(musteri);
        System.out.println(musteri.name + "isimli müşteri için "+musteri.hesapNo +" hesap no ile hesap açılmıştır.");

    }

    public void paraYatir(Musteri musteri, double miktar){
        if(miktar > 0){
            musteri.bakiye+=miktar;

        }
    }

    public void paraCek(Musteri musteri, double miktar){
        if(miktar >0 && musteri.bakiye >=miktar){
            musteri.bakiye-=miktar;

        }else {
            System.out.println("Hesabınızda yeterli bakiye yoktur");
            System.out.println("En fazla "+musteri.bakiye+ " TL miktarda para çekebilirsin");
        }
    }

    public void findByHesapNo(int hesapNo){
        System.out.println("Hesap Numarası ile Müşteri Bulma");
        System.out.println("--------------------------------------");

        boolean isFound=false;

        for (Musteri musteri  : musteriler ) {
              if(musteri.hesapNo==hesapNo) {
                  isFound=true;
                  musteri.showInfo();
                  break;
              }
        }
        if (!isFound){
            System.out.println(hesapNo+" hesap numaralı bir müşteri yoktur!!!");
        }


    }

    public void findByName(String name){
        System.out.println("İsimden Müşteri Bulma");
        System.out.println("--------------------------------------");

        int count =0;

        for (Musteri musteri  :musteriler ) {
            if (musteri.name.startsWith(name)){
                count++;
                musteri.showInfo();
                System.out.println("-------------------------------");
            }
        }
        if (count==0){
            System.out.println(name+ " isminde bir müşteri yoktur");
        }else {
            System.out.println(name+ " isminde "+count+ " adet müşteri vardır ");
        }



    }



    public void musteriListe(){
        for (Musteri musteri  : musteriler ) {
                    musteri.showInfo();
            System.out.println("-------------------------");
        }
    }






}
