package com.jcgarciacandela.captura;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CapturaService {

    @Value("${basePath}")
    private String path;

    @Scheduled(fixedRate = 15000)
    private void capturaExec() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

        String fileName = dateFormat.format(new Date()) + ".png";

        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            File file = new File(path + fileName);
            ImageIO.write(screencapture, "png", file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
