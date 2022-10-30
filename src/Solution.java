import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;

class Solution  {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        hash("patrick.star@underthesea.com");


    }









    public static String hash(String email) throws NoSuchAlgorithmException {

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(email.getBytes(StandardCharsets.UTF_8));
        String s = Base64.getEncoder().encodeToString(hash);
        System.out.println(s);
        return s;


    }
}