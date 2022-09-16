package testing;


import encryption.Secret;

public class Main {


    public static void main(String args[])
    {
        String hello = "Hello World!";

        Secret.SimpleEncrypt(hello, (byte)2);
        Secret.SimpleDecrypt(hello, (byte)2, false);
    }


}
