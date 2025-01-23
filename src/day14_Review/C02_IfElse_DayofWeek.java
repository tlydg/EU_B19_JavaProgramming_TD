package day14_Review;

public class C02_IfElse_DayofWeek {
    public static void main(String[] args) {

        int dayOfWeek = 5;
        String gun = "";

        if (dayOfWeek==1){
            gun ="Pazartesi";
        } else if (dayOfWeek == 2){
            gun ="Salı";
        } else if (dayOfWeek == 3){
            gun ="Çarşamba";
        } else if (dayOfWeek == 4){
            gun ="Perşembe";
        }else if (dayOfWeek == 5){
            gun ="Cuma";
        }else if (dayOfWeek == 6){
            gun ="Cumartesi";
        }else if (dayOfWeek == 7){
            gun ="Pazar";
        }else {
            System.out.println("Yanlış giriş. ");
        }
        if (dayOfWeek >= 1 && dayOfWeek <=7 );
        System.out.println(" Bugün günlerden " + gun + " 'dir.");


    }
}
