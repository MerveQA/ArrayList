package j16_ArrayList.Tasks;

public class Task12_POJO {

    int miktar ;
    int fiyat ;


    public Task12_POJO(int miktar, int fiyat) {
        this.miktar = miktar;
        this.fiyat = fiyat;
    }

    public Task12_POJO() {

    }




    public static int calculatePrice(Task12_POJO urun, int kg) {
        return urun.miktar* urun.fiyat;
    }




}
