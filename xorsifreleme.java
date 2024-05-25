
package vize;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class xorsifreleme {

    public String XORSifrele(String metin, String anahtar) {
        String sifreliMetin = "";
        int anahtarIndex = 0;
        for (int i = 0; i < metin.length(); i++) {
          
            int ascii = (int) metin.charAt(i);
            
            int sifreliAscii = ascii ^ anahtar.charAt(anahtarIndex);
            
            sifreliMetin += (char) sifreliAscii;
            
            anahtarIndex++;
            
            if (anahtarIndex == anahtar.length()) {
                anahtarIndex = 0;
            }
        }
        return sifreliMetin;
}}
