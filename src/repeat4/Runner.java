package repeat4;

public class Runner {
    public static void main(String[] args) {

        MapDepo.isimdenListeYazdir("Enes"); // Enes-Kavas-12-B
        MapDepo.isimdenListeYazdir("Hamza"); // Hamza-Kavas-12-A , Hamza-Şentürk-9-D

        MapDepo.subeListesiYazdir(9,"D"); // Hamza Şentürk
        MapDepo.subeListesiYazdir(10,"C"); // Öznur Kavas

        MapDepo.bolumListesiYazdir("SÖZ"); // 103-Öznur-Kavas-10 , 104-Tuba-Kavas-11
        MapDepo.bolumListesiYazdir("TM"); // 105-Talha-Selvi-9

        MapDepo.numaraileSoyIsim(101,"BULUT"); // 101=Hamza-BULUT-12-A-SAY

        MapDepo.soyisimliYazdir("Selvi"); // Talha-Selvi-9-A
        MapDepo.soyisimliYazdir("Şentürk"); // Hamza-Şentürk-9-D

        MapDepo.sinifGuncelleme();
        System.out.println(MapDepo.ogrenciMap);
        MapDepo.sinifGuncelleme();
        System.out.println(MapDepo.ogrenciMap);
        MapDepo.sinifGuncelleme();
        System.out.println(MapDepo.ogrenciMap);
        MapDepo.sinifGuncelleme();
        System.out.println(MapDepo.ogrenciMap);





    }
}
