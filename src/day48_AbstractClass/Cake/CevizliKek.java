package day48_AbstractClass.Cake;

public class CevizliKek extends BaseKek {

    private int ceviz;


    public CevizliKek(int yumurta, int un, int seker, int kabartmaTozu, int sut, int yag) {
        super(yumurta, un, seker, kabartmaTozu, sut, yag);
    }

    public int getCeviz() {
        return ceviz;
    }

    public void setCeviz(int ceviz) {
        this.ceviz = ceviz;
    }

    @Override
    public void karistir() {
        System.out.println("Aşağıdaki malzemeleri karıştırma kabına koy");
        System.out.println("En az 5 dakika karıştır");
        System.out.println("Un             = " + getUn());
        System.out.println("KabartmaTozu   = " + getKabartmaTozu());
        System.out.println("Seker          = " + getSeker());
        System.out.println("Sut            = " + getSut());
        System.out.println("Yag            = " + getYag());
        System.out.println("Yumurta        = " + getYumurta());
        System.out.println("Ceviz       = " + getCeviz());

        System.out.println("Büütn malzemeler karıştırıldı");

        setMixed(true);

    }

    @Override
    public void pisir() {
        if(isMixed()){
            System.out.println("kek pişirilir");
        }else {
            System.out.println("Önce keki karıştır");
        }

    }


}
