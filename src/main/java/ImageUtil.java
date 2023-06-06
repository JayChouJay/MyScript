import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageUtil {
    public static void main(String[] args) throws IOException {
        transferAlpha("C:\\Users\\hp\\OneDrive\\数字力量\\记录\\金智维\\案例练习\\验证码\\普通图片.png");

    }

    public static byte[] transferAlpha(String imgPath) throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        File file = new File(imgPath);
        InputStream is;
        StringBuffer newImgPath = new StringBuffer(imgPath.substring(0, imgPath.lastIndexOf("."))).append("-无背景.png");
        is = new FileInputStream(file);
        // 如果是MultipartFile类型，那么自身也有转换成流的方法：is = file.getInputStream();
        BufferedImage bi = ImageIO.read(is);
        Image image = (Image) bi;
        ImageIcon imageIcon = new ImageIcon(image);
        BufferedImage bufferedImage = new BufferedImage(imageIcon.getIconWidth(), imageIcon.getIconHeight(),
                BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2D = (Graphics2D) bufferedImage.getGraphics();
        g2D.drawImage(imageIcon.getImage(), 0, 0, imageIcon.getImageObserver());
        int alpha = 0;
        for (int j1 = bufferedImage.getMinY(); j1 < bufferedImage.getHeight(); j1++) {
            for (int j2 = bufferedImage.getMinX(); j2 < bufferedImage.getWidth(); j2++) {
                int rgb = bufferedImage.getRGB(j2, j1);

                int R = (rgb & 0xff0000) >> 16;
                int G = (rgb & 0xff00) >> 8;
                int B = (rgb & 0xff);
                if (((255 - R) < 30) && ((255 - G) < 30) && ((255 - B) < 30)) {
                    rgb = ((alpha + 1) << 24) | (rgb & 0x00ffffff);
                }

                bufferedImage.setRGB(j2, j1, rgb);

            }
        }

        g2D.drawImage(bufferedImage, 0, 0, imageIcon.getImageObserver());
        ImageIO.write(bufferedImage, "png", new File(newImgPath.toString()));// 直接输出文件
        return byteArrayOutputStream.toByteArray();
    }

    public static String method(String arg) {
        System.out.println(arg);
        return arg + "_";

    }


}