/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bonus;
import javax.microedition.lcdui.*;
import java.io.IOException;
/**
 *
 * @author Shubhang
 */
public class my_canvas extends Canvas{
    public void paint(Graphics g) {
      int width = getWidth();
    int height = getHeight();
    try {
      Image image = Image.createImage("/new1.png");
      g.drawImage(image, width/2, height/2, Graphics.VCENTER | Graphics.HCENTER);
       g.setColor(255, 255, 255);
        g.drawString("Shubhang", (getWidth()/2)+10,(getHeight()/2)-8,
                Graphics.TOP | Graphics.RIGHT);
    } catch (IOException ex) {
      g.setColor(0xffffff);
      g.drawString("Failed to load image!", 0, 0, Graphics.TOP | Graphics.LEFT);
      return;
    }

  }
}
