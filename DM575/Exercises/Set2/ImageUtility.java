public class ImageUtility {    
    public static void main(String[] args) {
        ImageUtility uitility = new ImageUtility();
        Image myImage = Image.fromFile("myImage.jpg");
        
        Image myEncryptedImage = uitility.encrypt(myImage, "This is a key!");
        myEncryptedImage.display();
        Image myDecryptedImage = uitility.decrypt(myEncryptedImage, "This is a key!");
        myDecryptedImage.display();
    }

    /**
     * Used to encrypt a Color
     * @param current   Current Image Color
     * @param second    Prev Image Color
     * @param extra     Current havh of key
     * @return  Encrypted Color
     */
    private Color addColor(Color current, Color second, int extra) {
        Color newColor = new Color((current.red() + second.red() + extra) % 256, (current.green() + second.green() + extra) % 256, (current.blue() + second.blue() + extra) % 256);
        return newColor;
    }
    /**
     * Used to decrypt a Color
     * @param current   Current Image Color
     * @param second    Prev Image Color
     * @param extra     Current hash of key
     * @return  Decrypted Color
     */
    private Color subColor(Color current, Color second, int extra) {
        Color newColor = new Color((current.red() - second.red() - extra +2*256) % 256, (current.green() - second.green() - extra +2*256) % 256, (current.blue() - second.blue() - extra +2*256) % 256);
        return newColor;
    }
    /**
     * Returns an encrypted image of the given image
     * @param image image to be encrypted
     * @param key   key used to encrypt
     * @return  Image 
     */
    public Image encrypt(Image image, String key) {
        int Index = 0;
        int prevX = 0, prevY = 0;
        Image encryptedImage = new Image(image.width(), image.height());
        for (int x = 0; x < image.width(); x++) {
            for (int y = 0; y < image.height(); y++) {
                Color currentColor = image.pixel(x, y);
                Color oldColor = encryptedImage.pixel(prevX, prevY);
                
                int code = key.codePointAt(Index % key.length());
                
                encryptedImage.setPixel(x, y, addColor(currentColor, oldColor, code));
                
                Index++;
                prevX = x; 
                prevY = y;
            }
        }
        return encryptedImage;
    }
    /**
     * Decrypt an encrypted image using the same key it was encrypted with
     * @param encryptedImage    Enctypted Image
     * @param key               Key used to decrypt 
     * @return  Decrypted Image
     */
    public Image decrypt(Image encryptedImage, String key) {
        int Index = 0;
        int prevX = 0, prevY = 0;
        Image decryptedImage = new Image(encryptedImage.width(), encryptedImage.height());
        for (int x = 0; x < encryptedImage.width(); x++) {
            for (int y = 0; y < encryptedImage.height(); y++) {
                Color currentColor = encryptedImage.pixel(x, y);
                Color oldColor = encryptedImage.pixel(prevX, prevY);
                
                int code = key.codePointAt(Index % key.length());
                
                decryptedImage.setPixel(x, y, subColor(currentColor, oldColor, code));
                
                Index++;
                prevX = x; 
                prevY = y;
            }
        }
        return decryptedImage;
    }
   
}