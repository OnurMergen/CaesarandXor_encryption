
package vize;

class SezarCozum {
      public static String coz(String sifreliMetin, int anahtar) {
        String cozulmusMetin = "";
        for (int i = 0; i < sifreliMetin.length(); i++) {
            char karakter = sifreliMetin.charAt(i);
            if (karakter >= 'a' && karakter <= 'z') {
                karakter = (char) (karakter - anahtar);
                if (karakter < 'a') {
                    karakter = (char) (karakter + 26);
                }
            } else if (karakter >= 'A' && karakter <= 'Z') {
                karakter = (char) (karakter - anahtar);
                if (karakter < 'A') {
                    karakter = (char) (karakter + 26);
                }
            }
            cozulmusMetin += karakter;
        }
        return cozulmusMetin;
    }
}
