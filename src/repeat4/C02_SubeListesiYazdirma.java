package repeat4;

import java.util.Collection;

public class C02_SubeListesiYazdirma extends MapDepo {
    public static void main(String[] args) {

        // Verilen sınıf ve subedeki tüm öğrencilerin isim ve soyisimlerini yazdırın

        int istenenSinif = 12;
        String istenenSube = "A";

        System.out.println("======== " + istenenSinif + " " + istenenSube + " şubesindeki kişilerin isim ve soyisimleri ========");
        Collection<String> ogrenciValue = ogrenciMap.values();
        // [Hamza-Kavas-12-A-SAY, Enes-Kavas-12-B-SAY, Öznur-Kavas-10-C-SÖZ, Tuba-Kavas-11-C-SÖZ, Talha-Selvi-9-A-TM, Hamza-Şentürk-9-D-SAY]

        for ( String eachValue : ogrenciValue ){
            String[] eachValueArr = eachValue.split("-"); // [Hamza, Kavas, 12, A, SAY]
            if ( (istenenSinif + "").equalsIgnoreCase(eachValueArr[2]) && istenenSube.equalsIgnoreCase(eachValueArr[3]) ){
                System.out.println( eachValueArr[0] + " " + eachValueArr[1] );
            }
        }






















    }
}
