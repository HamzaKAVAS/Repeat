package repeat4;

import java.util.Collection;

public class C01_IsimleOgrenciOlusturma extends MapDepo {
    public static void main(String[] args) {

        // ogrenci map'inde verilen isme sahip olan öğrencilerin
        // isim,soyisim,sınıf ve subelerini yazdırın

        System.out.println(ogrenciMap);
        // {101=Hamza-Kavas-12-A-SAY,
        //  102=Enes-Kavas-12-B-SAY,
        //  103=Öznur-Kavas-10-C-SÖZ,
        //  104=Tuba-Kavas-11-C-SÖZ,
        //  105=Talha-Selvi-9-A-TM,
        //  106=Hamza-Şentürk-9-D-SAY}

        String istenenisim = "Hamza";

        Collection<String> ogrenciValue = ogrenciMap.values();
        System.out.println(ogrenciValue);
        // [Hamza-Kavas-12-A-SAY, Enes-Kavas-12-B-SAY, Öznur-Kavas-10-C-SÖZ, Tuba-Kavas-11-C-SÖZ, Talha-Selvi-9-A-TM, Hamza-Şentürk-9-D-SAY]

        System.out.println("========== " + istenenisim + " ismine sahip öğrencilerin bilgileri ==========");

        for (String eachValue : ogrenciValue) {

            String[] eachValueArr = eachValue.split("-"); // [Hamza, Kavas, 12, A, SAY]
            if (eachValueArr[0].equalsIgnoreCase(istenenisim)) {
                System.out.println(eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2] + "-" + eachValueArr[3]);
            }

        }


    }
}
