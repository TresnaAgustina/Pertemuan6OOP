public class HitungLuasSegitiga {
//    float = luas,alas,tinggi;

//    private atribut
//    private atribut hanya dapat diakses dalam class yang sama
//    private float alas;
    private float alas;
    private float tinggi;
    double luas;


//    method alas dengan parameter float untuk set nilai atribut alas
    public void SetAlas(float AL){
        this.alas = AL;
    }


//  method setTinggi dengan parameter float untuk set nilai ke atribut tinggi
    public void SetTinggi(float TG) {
        this.tinggi = TG;
    }


//    method private tanpa mengembalikan nilai == tanpa param untuk menghitung luas segitiga
    private double HitungLuas(){
        this.luas = 0.5 * this.alas * this.tinggi;

//        mengembalikan nilai luas
        return luas;
    }

//    public method untuk menampilkan hasil
    public void CetaakLuas(){
//        memanggil method private hitung luas
        this.HitungLuas();
//          menampilkan atribut
        System.out.println("Hitung Luas Segitiga");
        System.out.println("================================");
        System.out.println("Nilai Alas Segitiga : " + this.alas + " CM²");
        System.out.println("Nilai Tiggi Segitiga: " + this.tinggi + " CM²");
        System.out.println("Total Luas Segitiga : " + this.luas + " CM²");

    }
}
