package vize;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Vize {

    public static void main(String[] args) throws IOException {
        //menü kısmı menü kısmı menü kısmı menü kısmı menü kısmı menü kısmı 
        Scanner key = new Scanner(System.in);
        String sifretursecimi;
        int secilenislem = 0;
        do {
            System.out.println("yapabileceginiz islemler\n 1.)dosya okuma\n 2.)dosya sifreleme \n 3.)sifreleme sec \n 4.)cikis");

            secilenislem = key.nextInt();
            //dosya okuma dosya okumadosya okumadosya okumadosya okumadosya okuma
            if (secilenislem == 1) {
                System.out.println("okutmak istediginiz dosyanın adini giriniz");
                String ad = key.next();
                File dosya = new File("C:\\Users\\sedat\\OneDrive\\Masaüstü\\" + ad + ".txt");
                if (!dosya.exists()) {
                    dosya.createNewFile();

                    String dosyaAdi = "C:\\Users\\sedat\\OneDrive\\Masaüstü\\" + ad + ".txt";
                    String satir = null;
                    FileReader dosyaokuma = new FileReader(dosyaAdi);
                    BufferedReader bufRead = new BufferedReader(dosyaokuma);
                    while ((satir = bufRead.readLine()) != null) {
                        System.out.println(satir);}}
            } //dosya sifreleme
            else if (secilenislem == 2) {
                System.out.println("yapmak istedigini sifreleme metodu sezar mi yoksa xor mu?(lutfen yazarak belirtiniz eğer "
                        + "4. seçenekle belirttiyseniz seçim yapmayınız)");
                sifretursecimi = key.next();
                if (sifretursecimi.equals("sezar")) {
                    System.out.println("sezar sifreleme anahtari belirleyin");
                    int anahtar = key.nextInt();

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("sifrelenecek dosya adini girin");
                    String ad1 = key.next();
                    String dosyaYolu = "C:\\Users\\sedat\\OneDrive\\Masaüstü\\" + ad1 + ".txt";
                    File dosya = new File(dosyaYolu);
                    BufferedReader okuyucu = new BufferedReader(new FileReader(dosya));

                    String metin = "";
                    String satir = okuyucu.readLine();
                    while (satir != null) {
                        metin += satir;
                        satir = okuyucu.readLine();
                    }
                    Sezarsifreleme nesne1 = new Sezarsifreleme();
                    String sifreliMetin = nesne1.sezarSifrele(metin, anahtar);
                    okuyucu.close();
                    scanner.close();
                    //sifreli dosya olusturma
                    System.out.println("sifrelenmis metni yazmak istediginiz dosyanin adini girin");
                    String sifrelidosyaadi2 = key.next();
                    File dosya3 = new File("C:\\Users\\sedat\\OneDrive\\Masaüstü\\" + sifrelidosyaadi2 + ".txt");
                    FileWriter dosyayazma = new FileWriter(dosya3, true);
                    dosyayazma.write(sifreliMetin);
                    dosyayazma.close();
                } else if (sifretursecimi.equals("xor")) {
                    System.out.println("xor sifreleme anahtari metin ile belirleyin");
                    String anahtar = key.next();

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("sifrelenecek dosya adini girin");
                    String ad1 = key.next();
                    String dosyaYolu = "C:\\Users\\sedat\\OneDrive\\Masaüstü\\" + ad1 + ".txt";
                    File dosya = new File(dosyaYolu);
                    BufferedReader okuyucu = new BufferedReader(new FileReader(dosya));

                    String metin = "";
                    String satir = okuyucu.readLine();
                    while (satir != null) {
                        metin += satir;
                        satir = okuyucu.readLine();
                    }
                    xorsifreleme nesne2 = new xorsifreleme();
                    String sifreliMetin = nesne2.XORSifrele(metin, anahtar);
                    okuyucu.close();
                    scanner.close();
                    //sifreli dosya olusturma
                    System.out.println("sifrelenmis metni yazmak istediginiz dosyanin adini girin");
                    String sifrelidosyaadi2 = key.next();
                    File dosya3 = new File("C:\\Users\\sedat\\OneDrive\\Masaüstü\\" + sifrelidosyaadi2 + ".txt");
                    FileWriter dosyayazma = new FileWriter(dosya3, true);
                    dosyayazma.write(sifreliMetin);
                    dosyayazma.close();
                }} else if (secilenislem == 3) {
                    System.out.println("secmek istediginiz sifreleme turu nedir?\n a)sezar\t bxor)");
                    String sifrelemesecimi = key.next();
                } else if (secilenislem == 4) {
                    System.out.println("cozum yapılacak dosyanin adini giriniz");
                }
                String ad1 = key.next();
                String dosyaAdi = "C:\\Users\\sedat\\OneDrive\\Masaüstü\\" + ad1 + ".txt";
                String satir = null;
                FileReader dosyaokuma = new FileReader(dosyaAdi);
                BufferedReader bufRead = new BufferedReader(dosyaokuma);
                while ((satir = bufRead.readLine()) != null) {
                    System.out.println(satir);
                }
                System.out.println("hangi sifreleme metodu ile cozulecek");
                String cozummetodu = key.next();
                if (cozummetodu.equals("sezar")) {
                    System.out.println("anahtariniz");
                    int anahtar = key.nextInt();
                    String cozulmusmetin = SezarCozum.coz(satir, anahtar);
                    File dosya10 = new File("C:\\Users\\sedat\\OneDrive\\Masaüstü\\cozulmusmetin.txt");
                    FileWriter dosyayazma = new FileWriter(dosya10, true);
                    dosyayazma.write(cozulmusmetin);
                    dosyayazma.close();
                    System.out.println("dosyaya yazıldı");

                } else if (cozummetodu.equals("xor")) {
                    System.out.println("anahtar giriniz");
                    String anahtar = key.next();
                    String cozulmusmetin = xorcozumleme.cozumle(satir, anahtar);
                    File dosya10 = new File("C:\\Users\\sedat\\OneDrive\\Masaüstü\\cozulmusmetin.txt");
                    FileWriter dosyayazma = new FileWriter(dosya10, true);
                    dosyayazma.write(cozulmusmetin);
                    dosyayazma.close();
                    System.out.println("dosyaya yazıldı");

                }

            }
        } while (secilenislem != 4);
        {
            System.out.println("cıkıs yapiliyor");
        }

    }

