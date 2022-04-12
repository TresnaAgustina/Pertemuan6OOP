public class Pert6Lat1 {
    public static void main(String[] args) {

//        ClassName namaObj = new ClassName();
        HitungLuasSegitiga segitiga = new HitungLuasSegitiga();


//        segitiga.alas = 4; --> memanggil atribut

//        memasukan nilai melalui method ke dalam parameter
        segitiga.SetAlas(4);
        segitiga.SetTinggi(5);

//        memanggil method cetak hasil untuk ditampilkan hasilnya
        segitiga.CetaakLuas();
    }


}
