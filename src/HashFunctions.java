import java.util.Arrays;
import java.util.HashMap;

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

        System.out.println();

        long randomHash1 = SecureRandomHash.getHash("SHA1PRNG");
        System.out.println("SecureRandom using SHA1PRNG:\n" + randomHash1);
        long randomHash2 = SecureRandomHash.getHash("Windows-PRNG");
        System.out.println("SecureRandom using Windows-PRNG:\n" + randomHash2);
        long randomHash3 = SecureRandomHash.getHash("DRBG");
        System.out.println("SecureRandom using DRBG:\n" + randomHash3);

        System.out.println();

        HashMap<CorrectClass, String> correctMap = new HashMap<CorrectClass, String>();
        CorrectClass object1 = new CorrectClass("object1");
        correctMap.put(object1, "This is object1");
        CorrectClass object2 = new CorrectClass("object2");
        correctMap.put(object2, "This is object2");
        CorrectClass object3 = new CorrectClass("object3");
        correctMap.put(object3, "This is object3");

        System.out.println("HashMap with correct objects:");

        System.out.println("Key: " + object1 + " Value: " + correctMap.get(object1));
        System.out.println("Key: " + object2 + " Value: " + correctMap.get(object2));
        System.out.println("Key: " + object3 + " Value: " + correctMap.get(object3));

        System.out.println();

        HashMap<IncorrectClass, String> incorrectMap = new HashMap<IncorrectClass, String>();
        IncorrectClass badObject1 = new IncorrectClass("object1");
        incorrectMap.put(badObject1, "This is object1");
        IncorrectClass badObject2 = new IncorrectClass("object2");
        incorrectMap.put(badObject2, "This is object2");
        IncorrectClass badObject3 = new IncorrectClass("object3");
        incorrectMap.put(badObject3, "This is object3");

        System.out.println("HashMap with incorrect objects:");

        System.out.println("Key: " + badObject1 + " Value: " + incorrectMap.get(badObject1));
        System.out.println("Key: " + badObject2 + " Value: " + incorrectMap.get(badObject2));
        System.out.println("Key: " + badObject3 + " Value: " + incorrectMap.get(badObject3));

    }

}
