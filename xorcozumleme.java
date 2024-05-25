
package vize;

public class xorcozumleme {
    
    public static String cozumle(String metin, String anahtar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < metin.length(); i++) {
            char c = (char) (metin.charAt(i) ^ anahtar.charAt(i % anahtar.length()));
            sb.append(c);
        }
        return sb.toString();
    }
    

    
}
