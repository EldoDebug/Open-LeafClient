package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import java.io.*;
import net.optifine.util.*;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.*;

public class lllllIIlIlIIIlIlIIIl
{
    private static IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll;
    private static int IlIlIlIlIlllllllllIl;
    private static int llIllIIIIIllIlIIIIlI;
    
    static {
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll = null;
        lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl = 0;
        lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI = 0;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll = null;
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll = null;
        lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl = 0;
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl());
        llIllIIIIIllIlIIIIlI();
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        if (lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll != null && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI()) {
            int ilIlIlIlIlllllllllIl = 0;
            for (int i = 0; i < lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll.length; ++i) {
                final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll[i];
                illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl();
                if (illlIIlllIIIlIlllII.lIIIIlIIIIIlllIllIII()) {
                    ++ilIlIlIlIlllllllllIl;
                }
            }
            final int liiiIlIIIIIlllIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII;
            if (liiiIlIIIIIlllIllIII != lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI) {
                lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI = liiiIlIIIIIlllIllIII;
            }
            if (llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
                llIIIllIlIllIllIIIIl.IlIIIlIlIIIllIlIlIIl();
            }
        }
        else {
            lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl = 0;
        }
    }
    
    private static IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll[] array) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; ++i) {
            final IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array[i]);
            if (llllIIIIlIIIlIlllIll != null) {
                list.addAll(Arrays.asList(llllIIIIlIIIlIlllIll));
            }
        }
        return (IIlllIIlllIIIlIlllII[])list.toArray(new IIlllIIlllIIIlIlllII[list.size()]);
    }
    
    private static IIlllIIlllIIIlIlllII[] llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final String[] llllIIIIlIIIlIlllIll = IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, "mcpatcher/anim/", ".properties", null);
        if (llllIIIIlIIIlIlllIll.length <= 0) {
            return null;
        }
        final ArrayList<IIlllIIlllIIIlIlllII> list = new ArrayList<IIlllIIlllIIIlIlllII>();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Texture animation: " + s);
            try {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
                final InputStream llllIIIIlIIIlIlllIll2 = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll2);
                llllIIIIlIIIlIlllIll2.close();
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, lIllllIllIllIIllllll);
                if (llllIIIIlIIIlIlllIll3 != null) {
                    if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(new lIllllIllIllIIllllll(llllIIIIlIIIlIlllIll3.IllIIlllIIIIlllIIlIl())) != llllIIllllIlIlIIIIll) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Skipped: " + s + ", target texture not loaded from same resource pack");
                    }
                    else {
                        list.add(llllIIIIlIIIlIlllIll3);
                    }
                }
            }
            catch (FileNotFoundException ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("File not found: " + ex.getMessage());
            }
            catch (IOException ex2) {
                ex2.printStackTrace();
            }
        }
        return list.toArray(new IIlllIIlllIIIlIlllII[list.size()]);
    }
    
    private static IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll(final Properties properties, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final String property = properties.getProperty("from");
        final String property2 = properties.getProperty("to");
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("x"), -1);
        final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("y"), -1);
        final int llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("w"), -1);
        final int llllIIIIlIIIlIlllIll4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("h"), -1);
        if (property != null && property2 != null) {
            if (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll3 >= 0 && llllIIIIlIIIlIlllIll4 >= 0) {
                final String trim = property.trim();
                final String trim2 = property2.trim();
                final String llllIIIIlIIIlIlllIll5 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
                final String llllIIIIlIIIlIlllIll6 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(trim, llllIIIIlIIIlIlllIll5);
                final String llllIIIIlIIIlIlllIll7 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(trim2, llllIIIIlIIIlIlllIll5);
                final byte[] llllIIIIlIIIlIlllIll8 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll6, llllIIIIlIIIlIlllIll3);
                if (llllIIIIlIIIlIlllIll8 == null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAnimation: Source texture not found: " + llllIIIIlIIIlIlllIll7);
                    return null;
                }
                final int n = llllIIIIlIIIlIlllIll8.length / 4;
                if (n != n / (llllIIIIlIIIlIlllIll3 * llllIIIIlIIIlIlllIll4) * llllIIIIlIIIlIlllIll3 * llllIIIIlIIIlIlllIll4) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAnimation: Source texture has invalid number of frames: " + llllIIIIlIIIlIlllIll6 + ", frames: " + n / (float)(llllIIIIlIIIlIlllIll3 * llllIIIIlIIIlIlllIll4));
                    return null;
                }
                final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = new lIllllIllIllIIllllll(llllIIIIlIIIlIlllIll7);
                try {
                    final InputStream llllIIIIlIIIlIlllIll9 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll2);
                    if (llllIIIIlIIIlIlllIll9 == null) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAnimation: Target texture not found: " + llllIIIIlIIIlIlllIll7);
                        return null;
                    }
                    final BufferedImage llllIIIIlIIIlIlllIll10 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll9);
                    if (llllIIIIlIIIlIlllIll + llllIIIIlIIIlIlllIll3 <= llllIIIIlIIIlIlllIll10.getWidth() && llllIIIIlIIIlIlllIll2 + llllIIIIlIIIlIlllIll4 <= llllIIIIlIIIlIlllIll10.getHeight()) {
                        return new IIlllIIlllIIIlIlllII(llllIIIIlIIIlIlllIll6, llllIIIIlIIIlIlllIll8, llllIIIIlIIIlIlllIll7, lIllllIllIllIIllllll2, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll4, properties);
                    }
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAnimation: Animation coordinates are outside the target texture: " + llllIIIIlIIIlIlllIll7);
                    return null;
                }
                catch (IOException ex) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAnimation: Target texture not found: " + llllIIIIlIIIlIlllIll7);
                    return null;
                }
            }
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAnimation: Invalid coordinates");
            return null;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAnimation: Source or target texture not specified");
        return null;
    }
    
    private static byte[] llllIIIIlIIIlIlllIll(final String s, final int n) {
        byte[] array = IlIlIlIlIlllllllllIl(s, n);
        if (array == null) {
            array = IlIlIlIlIlllllllllIl("/anim" + s, n);
        }
        return array;
    }
    
    private static byte[] IlIlIlIlIlllllllllIl(final String s, final int n) {
        final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll c = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c();
        try {
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
            if (llllIIIIlIIIlIlllIll == null) {
                return null;
            }
            BufferedImage bufferedImage = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            if (bufferedImage == null) {
                return null;
            }
            if (n > 0 && bufferedImage.getWidth() != n) {
                bufferedImage = llllIIIIlIIIlIlllIll(bufferedImage, n, (int)(n * (double)(bufferedImage.getHeight() / bufferedImage.getWidth())));
            }
            final int width = bufferedImage.getWidth();
            final int height = bufferedImage.getHeight();
            final int[] array = new int[width * height];
            final byte[] array2 = new byte[width * height * 4];
            bufferedImage.getRGB(0, 0, width, height, array, 0, width);
            for (int i = 0; i < array.length; ++i) {
                final int n2 = array[i] >> 24 & 0xFF;
                int n3 = array[i] >> 16 & 0xFF;
                int n4 = array[i] >> 8 & 0xFF;
                int n5 = array[i] & 0xFF;
                if (c != null && c.IlIlIIIllIllIIIIIllI) {
                    final int n6 = (n3 * 30 + n4 * 59 + n5 * 11) / 100;
                    final int n7 = (n3 * 30 + n4 * 70) / 100;
                    final int n8 = (n3 * 30 + n5 * 70) / 100;
                    n3 = n6;
                    n4 = n7;
                    n5 = n8;
                }
                array2[i * 4 + 0] = (byte)n3;
                array2[i * 4 + 1] = (byte)n4;
                array2[i * 4 + 2] = (byte)n5;
                array2[i * 4 + 3] = (byte)n2;
            }
            return array2;
        }
        catch (FileNotFoundException ex2) {
            return null;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static BufferedImage llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        final BufferedImage read = ImageIO.read(inputStream);
        inputStream.close();
        return read;
    }
    
    private static BufferedImage llllIIIIlIIIlIlllIll(final BufferedImage bufferedImage, final int n, final int n2) {
        final BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        final Graphics2D graphics = bufferedImage2.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics.drawImage(bufferedImage, 0, 0, n, n2, null);
        return bufferedImage2;
    }
    
    public static int IlIIIlIlIIIllIlIlIIl() {
        return (lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll == null) ? 0 : lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll.length;
    }
    
    public static int IlIlIIIllIllIIIIIllI() {
        return lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl;
    }
}
