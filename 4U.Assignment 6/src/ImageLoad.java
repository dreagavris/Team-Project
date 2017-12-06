
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ratid6445
 */
public class ImageLoad {

    public void ImageLoad() {
        // load the images
        BufferedImage pic = null;
        try {
            String file = null;
            pic = ImageIO.read(new File("images/" + file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
