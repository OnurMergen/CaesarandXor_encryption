
package vize;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Sezarsifreleme {
    public String sezarSifrele(String metin, int anahtar) {
        String sifreliMetin = "";
        for (int i = 0; i < metin.length(); i++) {
            // Karakteri ASCII değerine dönüştür
            int ascii = (int) metin.charAt(i);
            // Şifreleme anahtarı kadar ilerlet ve ASCII değerini tekrar karaktere dönüştür
            char sifreliKarakter = (char) (ascii + anahtar);
            // Şifreli karakteri şifreli metne ekle
            sifreliMetin += sifreliKarakter;
        }
        return sifreliMetin;
    }

}
