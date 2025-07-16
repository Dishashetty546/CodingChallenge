package Algorithm.CN;

import java.math.BigInteger;

public class RSA {
    private final static BigInteger ONE = new BigInteger("1");
    private BigInteger publickeys;
    private BigInteger privateKeys;
    private BigInteger modulus;

    public RSA(int N) {
        BigInteger p = BigInteger.probablePrime(N / 2, new java.util.Random());
        BigInteger q = BigInteger.probablePrime(N / 2, new java.util.Random());
        BigInteger phi = (p.subtract(ONE).multiply(q.subtract(ONE)));
        modulus = p.multiply(q);
        publickeys = new BigInteger("65537");
        privateKeys = publickeys.modInverse(phi);

    }

    BigInteger encrypt(BigInteger message) {
        return message.modPow(publickeys, modulus);
    }

    BigInteger decrypt(BigInteger encrypted) {
        return encrypted.modPow(privateKeys, modulus);
    }

    public String toString() {
        return "publickeys: \n" + publickeys + "\n privatekeys: \n" + privateKeys + "\nmodulus: \n" + modulus;
    }

    public static void main(String[] args) {
        int N = 1024;
        RSA rsa = new RSA(N);
        System.out.println(rsa);

        String Plaintext = "hello world";
        byte[] bytes = Plaintext.getBytes();
        BigInteger message = new BigInteger(bytes);

        BigInteger encrypted = rsa.encrypt(message);
        System.out.println("Encrypted form:" + encrypted);

        BigInteger decrypted = rsa.decrypt(encrypted);
        String decryptedMessage = new String(decrypted.toByteArray());
        System.out.println("decrpted :" + decryptedMessage);

    }

}