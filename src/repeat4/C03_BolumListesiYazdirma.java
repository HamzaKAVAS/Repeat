package repeat4;

import java.util.Set;

public class C03_BolumListesiYazdirma extends MapDepo {
    public static void main(String[] args) {

        // Verilen bölümdeki tüm öğrencilerin
        // Numara, İsim, Soyisim ve Şubelerini yazdırın

        String istenenBolum = "SAY";
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
}
