package repeat4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOlusturma {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap<>();
        System.out.println(ogrenciMap);

        // map'e ekleme için put()
        ogrenciMap.put(101,"Hamza-Kavas-12-A-SAY");
        ogrenciMap.put(102,"Enes-Kavas-12-B-SAY");
        ogrenciMap.put(103,"Öznur-Kavas-10-C-SÖZ");
        ogrenciMap.put(104,"Tuba-Kavas-11-C-SÖZ");
        ogrenciMap.put(105,"Talha-Selvi-9-A-TM");
        ogrenciMap.put(106,"Metin-Şentürk-9-D-SAY");
        System.out.println(ogrenciMap);
        // {101=Hamza-Kavas-12-A-SAY, 102=Enes-Kavas-12-B-SAY, 103=Öznur-Kavas-10-C-SÖZ,
        //  104=Tuba-Kavas-11-C-SÖZ, 105=Talha-Selvi-9-A-TM, 106=Metin-Şentürk-9-D-SAY}

        System.out.println(ogrenciMap.size()); // 6
        System.out.println(ogrenciMap.get(103)); // Öznur-Kavas-10-C-SÖZ
        System.out.println(ogrenciMap.containsKey(103)); // true
        System.out.println(ogrenciMap.containsKey(111)); // false

        System.out.println(ogrenciMap.containsValue("Kavas")); // false
        System.out.println(ogrenciMap.containsValue("Hamza-Kavas-12-A-SAY")); // true

        ogrenciMap.replace(105,"Nevin-Selvi-9-A-TM");

        System.out.println(ogrenciMap);
        // {101=Hamza-Kavas-12-A-SAY, 102=Enes-Kavas-12-B-SAY, 103=Öznur-Kavas-10-C-SÖZ,
        //  104=Tuba-Kavas-11-C-SÖZ, 105=Nevin-Selvi-9-A-TM, 106=Metin-Şentürk-9-D-SAY}

        System.out.println(ogrenciMap.keySet());// [101, 102, 103, 104, 105, 106]
        System.out.println(ogrenciMap.values());
        // [Hamza-Kavas-12-A-SAY, Enes-Kavas-12-B-SAY, Öznur-Kavas-10-C-SÖZ, Tuba-Kavas-11-C-SÖZ, Nevin-Selvi-9-A-TM, Metin-Şentürk-9-D-SAY]

        // Mapde ki tüm keyleri ayrı bir Java yapısına kaydedelim
        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        // Mapdeki tüm value ayrı bir java yapısına kaydedelim
        Collection<String> ogrenciValue = ogrenciMap.values();


    }
}
