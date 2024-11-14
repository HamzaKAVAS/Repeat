package repeat4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {

    protected static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Hamza-Kavas-12-A-SAY");
        ogrenciMap.put(102,"Enes-Kavas-12-B-SAY");
        ogrenciMap.put(103,"Öznur-Kavas-10-C-SÖZ");
        ogrenciMap.put(104,"Tuba-Kavas-11-C-SÖZ");
        ogrenciMap.put(105,"Talha-Selvi-9-A-TM");
        ogrenciMap.put(106,"Hamza-Şentürk-9-D-SAY");
    }

    public static void isimdenListeYazdir ( String istenenisim ){

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

    public static void subeListesiYazdir ( int istenenSinif, String istenenSube ){

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

    public static void bolumListesiYazdir ( String istenenBolum ){

        System.out.println( "========== " + istenenBolum + " Öğrencilerinin No, İsim, Soyisim ve Şubeleri ==========");
        Set<Integer> eachKeySet = ogrenciMap.keySet();
        for ( int eachKey : eachKeySet ){
            String eachValue = ogrenciMap.get(eachKey);
            String[] eachValueArr = eachValue.split("-");
            if ( eachValueArr[4].equalsIgnoreCase(istenenBolum) ){
                System.out.println( eachKey + "-" + eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2]);
            }
        }
    }

    public static void numaraileSoyIsim ( int istenenNo, String yeniSoyisim ){

        String eskiValue = ogrenciMap.get(istenenNo); // Enes-Kavas-12-B-SAY
        String[] eskiValueArr = eskiValue.split("-"); // [Enes, Kavas, 12, B, SAY]
        eskiValueArr[1] = yeniSoyisim;
        String yeniValue = String.join("-",eskiValueArr);
        ogrenciMap.put(istenenNo,yeniValue);
        System.out.println(ogrenciMap);
    }

    public static void soyisimliYazdir ( String verilenIsim ){

        System.out.println( "========== " + verilenIsim + " soyisimine sahip olan öğrencilerin bilgileri" + " ==========");

        Collection<String> value = ogrenciMap.values();
        // [Hamza-Kavas-12-A-SAY, Enes-Kavas-12-B-SAY, Öznur-Kavas-10-C-SÖZ, Tuba-Kavas-11-C-SÖZ, Talha-Selvi-9-A-TM, Hamza-Şentürk-9-D-SAY]
        for (String eachValue : value){
            String[] eachValueArr = eachValue.split("-"); // [Hamza, Kavas, 12, A, SAY]
            if ( eachValueArr[1].equalsIgnoreCase(verilenIsim) ){
                System.out.println(
                        eachValueArr[0] + "-" +
                                eachValueArr[1] + "-" +
                                eachValueArr[2] + "-" +
                                eachValueArr[3]
                );
            }
        }
    }

    public static void sinifGuncelleme (){

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]
        for (int eachKey : ogrenciKeySet ){
            String eachValue = ogrenciMap.get(eachKey); // Hamza-Kavas-12-A-SAY
            String[] eachValueArr = eachValue.split("-"); // [Hamza, Kavas, 12, A, SAY]
            switch ( eachValueArr[2] ){
                case "9" :
                    eachValueArr[2] = "10";
                    break;
                case "10" :
                    eachValueArr[2] = "11";
                    break;
                case "11" :
                    eachValueArr[2] = "12";
                    break;
                case "12" :
                    eachValueArr[2] = "MEZUN";
                    break;
            }
            String yeniValue = String.join("-",eachValueArr);
            ogrenciMap.put(eachKey,yeniValue);
        }
    }

















}
