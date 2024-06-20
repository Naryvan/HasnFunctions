import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestHash {

    public static String getHash(String data, String algorithm) {
        try {
            MessageDigest digester = MessageDigest.getInstance(algorithm);
            digester.update(data.getBytes());
            byte[] digest = digester.digest();

            //Converting byte array into a HEX string
            String result = "";
            for (int i=0; i < digest.length; i++) {
                result += Integer.toString( ( digest[i] & 0xff ) + 0x100, 16).substring( 1 );
            }

            return result;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

}
