import java.util.Arrays;

public class HashFunctions {

    public static void main(String[] args) {


        String data1 = "12345";
        System.out.println(data1.hashCode());
        String hash1 = MessageDigestHash.getHash(data1, "MD5");
        System.out.println("MessageDigest with MD5:\n '" + data1 + "' - " + hash1);
        String data2 = "1234567890";
        String hash2 = MessageDigestHash.getHash(data1, "SHA-1");
        System.out.println("MessageDigest with SHA-1:\n '" + data2 + "' - " + hash2);
        String data3 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        String hash3 = MessageDigestHash.getHash(data1, "SHA-256");
        System.out.println("MessageDigest with SHA-256:\n '" + data3 + "' - " + hash3);

    }

}
