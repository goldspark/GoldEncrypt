package encryption;

public class Secret {


    public static String SimpleEncrypt(String text, byte key){


        StringBuilder builder = new StringBuilder("");


        if (text.length() <= 0) {
            return "";
        } else {

            int i;
            for(i = 0; i < text.length(); ++i) {
                char code = (char) (text.charAt(i) - (text.length() - (text.length() / 2)));
                builder.append(code);
            }

            return builder.toString();
        }
    }

    /**
     * Get decryption from server
     * @param text
     * @param key
     * @param fromRemote Checks if the message is not local and its coming from EXAMPLE FIREBASE
     * @return
     */
    public static String SimpleDecrypt(String text, byte key, boolean fromRemote){
        StringBuilder builder = new StringBuilder("");

        if (text.length() <= 0) {
            return "";
        } else {

            int i;
            for(i = 0; i < text.length(); ++i) {
                char code = (char) (text.charAt(i) + (text.length() - (text.length() / 2)));
                builder.append(code);
            }

            return builder.toString();
        }
    }
}
