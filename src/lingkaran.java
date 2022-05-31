public class lingkaran {
    //atribut
    public final float PI = 22.0f/7;
    public int r=0;
    public float luas=0;
        
    //method hitung luas lingkaran
    public void hitungLuasLingkaran(){
        //luas lingkaran ==> A = pi*2
        luas = PI*r*r;
    }
    //menampilkan luas lingkaran
    public void tampilkanLuasLingkaran(){
        System.out.println("Luas Lingkaran (jari:"=r="cm) "+ luas + "cm2"");
    }
}
