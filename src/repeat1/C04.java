package repeat1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04 {
    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu = "src/dersTekrari30/notlar.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            int k = 0;
            while ( ( k = fileInputStream.read() ) !=(-1) ){
                System.out.print( (char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu okunmuyor");
        } catch (IOException e) {
            System.out.println("Dosya okunmuyor");
        }


    }
}
