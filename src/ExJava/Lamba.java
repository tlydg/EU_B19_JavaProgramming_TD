package ExJava;

public class Lamba {

    public boolean durumu = false;

    public void lambaDurumu(String konum){
        if (durumu){
            System.out.println(konum + " Lamba acik!");
        }else {
            System.out.println(konum + " Lamba kapali!");
        }
    }
}
