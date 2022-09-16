public class Main {

    /**
     * Simple encryption based on Character length
     *
     * @param args
     */

    public static void main(String args[])
    {
        String test = "Hello World";

        //Test
        Secret.Encrypt(test, (byte)4);
        Secret.Decrypt(test, (byte)4);

    }






}
