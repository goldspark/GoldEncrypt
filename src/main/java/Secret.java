public class Secret {

    private static byte[] characters_byte;

    public static String Encrypt(String text, byte key)
    {
        char[] characters = text.toCharArray();

        characters_byte = text.getBytes();


        for(int i = 0; i < characters_byte.length; i++)
        {
            characters_byte[i] -= (characters_byte.length) - (characters_byte.length / key);
        }

        for(int i = 0; i < characters_byte.length; i++)
        {
            characters[i] = (char) (characters_byte[i] & 0xFF);
        }

        System.out.println("Encrypted: " + String.valueOf(characters));

        return String.valueOf(characters);
    }

    public static String Decrypt(String text, byte key)
    {
        char[] characters = text.toCharArray();


        for(int i = 0; i < characters_byte.length; i++)
        {
            characters_byte[i] += (characters_byte.length) - (characters_byte.length / key);
        }

        for(int i = 0; i < characters_byte.length; i++)
        {
            characters[i] = (char) (characters_byte[i] & 0xFF);
        }

        System.out.println("Decrypted: " + String.valueOf(characters));

        return String.valueOf(characters);
    }

}
