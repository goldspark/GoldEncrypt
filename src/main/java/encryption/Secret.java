package encryption;

public class Secret {
    //enccyption.Secret

    private static byte[] characters_byte;

    public static String SimpleEncrypt(String text, byte key)
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

    /**
     * Decrypt message not from local string
     * @param text
     * @param key
     * @param fromRemote Is the message coming from somewhere? Example: firebase
     * @return
     */
    public static String SimpleDecrypt(String text, byte key, boolean fromRemote)
    {
        char[] characters = text.toCharArray();

        if(fromRemote)
        {
            characters_byte = text.getBytes();
        }

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
