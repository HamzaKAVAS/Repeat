package repeat1;

public class C02_MultipleTryCatch {
    public static void main(String[] args) {

        String str = "Java candir";
        int[] arr = {1,2,3,4,5,6,6,4,8,2,5,9,6,1,4,7,8,5,7,8};

        // verilen negatif olmayan bir sayi index olarak kabul edip
        // yukardaki str ve arr'deki o index'de bulunan harfi ve sayıyı yazdırın
        // eğer kullanıcı index'den büyük sayı girerse
        // hata mesajı ve son index'i yazdırın

        int index = 30;

        if ( index < 0 ) {

            System.out.print("İndex negatif olmamalı");

        } else {
            try {
                System.out.println(str.charAt(index));
                System.out.println(str.length()); // 11 yani 10 index
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Girilen index numarası str uzunluğundan fazladır.Son index: " + (str.length()-1) );
            }
            try {
                System.out.println(arr[index]); // 5
                System.out.println(arr.length); // 20 yani 19 index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girilen index numarası arr uzunluğundan fazladır.Son index: " + (arr.length-1) );
            }

        } // else sonu











    }
}
