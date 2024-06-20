import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class SecureRandomHash {

    public static long getHash(String algorithm) {
        try {
            SecureRandom secureRandom = SecureRandom.getInstance(algorithm);

            // Long.MAX_VALUE to only get positive values
            return secureRandom.nextLong() & Long.MAX_VALUE;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
