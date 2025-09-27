import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class image {
   public image() {
   }
   public static void main(String[] var0) throws IOException {
      BufferedImage var1 = new BufferedImage(200, 150, 2);
      Graphics2D var2 = var1.createGraphics();
      var2.setColor(Color.YELLOW);
      var2.fillOval(85, 70, 20, 20);
      var2.fillOval(95, 85, 20, 20);
      var2.fillOval(75, 80, 20, 20);
      var2.fillOval(105, 75, 20, 20);
      var2.fillOval(120, 50, 16, 16);
      var2.fillOval(130, 54, 10, 10);
      var2.setColor(Color.ORANGE);
      var2.fillOval(138, 62, 10, 10);
      var2.setColor(Color.BLACK);
      var2.fillOval(133, 57, 4, 4);
      var2.setColor(new Color(160, 82, 45));
      var2.fillOval(95, 105, 6, 6);
      var2.fillOval(105, 110, 6, 6);
      var2.dispose();
      ImageIO.write(var1, "png", new File("dot_duck.png"));
   }
}