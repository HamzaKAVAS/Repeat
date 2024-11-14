package repeat4;

public class C04_NumaraIleSoyIsimUpdate extends MapDepo {
    public static void main(String[] args) {

        // ogrenci map'inde numarası ve yeni soyismi verilen ogrencinin
        // eski soyisminin yerine yeni soyismini kaydedin

        int istenenNo = 102;
        String yeniSoyisim = "Koru";

        String eskiValue = ogrenciMap.get(istenenNo); // Enes-Kavas-12-B-SAY
        String[] eskiValueArr = eskiValue.split("-"); // [Enes, Kavas, 12, B, SAY]
        eskiValueArr[1] = yeniSoyisim;
        String yeniValue = String.join("-",eskiValueArr);
        ogrenciMap.put(istenenNo,yeniValue);
        System.out.println(ogrenciMap);

    }
}
