public class ImageUtility {    
    public static void main(String[] args) {
        ImageUtility uitility = new ImageUtility();
        Image myImage = Image.fromFile("myImage.jpg");
        
        Image myEncryptedImage = uitility.encrypt(myImage, " ");
        myEncryptedImage.display();
    }

    private Color addColor(Color current, Color second, int extra) {
        Color newColor = new Color((current.red() + second.red() + extra) % 256, (current.green() + second.green() + extra) % 256, (current.blue() + second.blue() + extra) % 256);
        return newColor;
    }
    private Color subColor(Color current, Color second, int extra) {
        Color newColor = new Color((current.red() - second.red() - extra) * 256, (current.green() - second.green() - extra) * 256, (current.blue() - second.blue() - extra) * 256);
        return newColor;
    }
    public Image encrypt(Image image, String key) {
        int Index = 0;
        int prevX = 0, prevY = 0;
        Image encryptedImage = new Image(image.width(), image.height());
        for (int x = 0; x < image.width(); x++) {
            for (int y = 0; y < image.height(); y++) {
                Color currentColor = image.pixel(x, y);
                Color oldColor = image.pixel(prevX, prevY);
                
                int code = key.codePointAt(Index % key.length());
                
                encryptedImage.setPixel(x, y, addColor(currentColor, oldColor, code));
                
                Index++;
                prevX = x; 
                prevY = y;
            }
        }
        return encryptedImage;
    }
    public Image decrypt(Image image, String key) {
        int Index = 0;
        int prevX = 0, prevY = 0;
        Image decryptedImage = new Image(image.width(), image.height());
        for (int x = 0; x < image.width(); x++) {
            for (int y = 0; y < image.height(); y++) {
                Color currentColor = image.pixel(x, y);
                Color oldColor = image.pixel(prevX, prevY);
                
                int code = key.codePointAt(Index % key.length());
                
                decryptedImage.setPixel(x, y, addColor(currentColor, oldColor, code));
                
                Index++;
                prevX = x; 
                prevY = y;
            }
        }
        return decryptedImage;
    }
   
}