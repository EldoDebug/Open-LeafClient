package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import java.nio.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.awt.image.*;
import net.optifine.*;
import org.lwjgl.opengl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import javax.imageio.*;
import org.apache.commons.io.*;

public class IlllllllIIIlIIIlIlII
{
    private static final Logger llIllIIIIIllIlIIIIlI;
    private static final IntBuffer IlIIIlIlIIIllIlIlIIl;
    public static final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    public static final int[] IlIlIlIlIlllllllllIl;
    private static final int[] IlIlIIIllIllIIIIIllI;
    private static int[] IllIIlllIIIIlllIIlIl;
    
    static {
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
        IlIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(4194304);
        llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(16, 16);
        IlIlIlIlIlllllllllIl = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl = new int[4194304];
        final int[] array = { -524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040 };
        final int[] array2 = { -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216 };
        final int length = array.length;
        for (int i = 0; i < 16; ++i) {
            System.arraycopy((i < length) ? array : array2, 0, IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl, 16 * i, length);
            System.arraycopy((i < length) ? array2 : array, 0, IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl, 16 * i + length, length);
        }
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        IlIlIIIllIllIIIIIllI = new int[4];
    }
    
    public static int llllIIIIlIIIlIlllIll() {
        return lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n) {
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII(n);
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final BufferedImage bufferedImage) {
        return llllIIIIlIIIlIlllIll(n, bufferedImage, false, false);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int[] array, final int n2, final int n3) {
        IlIlIlIlIlllllllllIl(n);
        llllIIIIlIIIlIlllIll(0, array, n2, n3, 0, 0, false, false, false);
    }
    
    public static int[][] llllIIIIlIIIlIlllIll(final int n, final int n2, final int[][] array) {
        final int[][] array2 = new int[n + 1][];
        array2[0] = array[0];
        if (n > 0) {
            boolean b = false;
            for (int i = 0; i < array[0].length; ++i) {
                if (array[0][i] >> 24 == 0) {
                    b = true;
                    break;
                }
            }
            for (int j = 1; j <= n; ++j) {
                if (array[j] != null) {
                    array2[j] = array[j];
                }
                else {
                    final int[] array3 = array2[j - 1];
                    final int[] array4 = new int[array3.length >> 2];
                    final int n3 = n2 >> j;
                    final int n4 = array4.length / n3;
                    final int n5 = n3 << 1;
                    for (int k = 0; k < n3; ++k) {
                        for (int l = 0; l < n4; ++l) {
                            final int n6 = 2 * (k + l * n5);
                            array4[k + l * n3] = llllIIIIlIIIlIlllIll(array3[n6 + 0], array3[n6 + 1], array3[n6 + 0 + n5], array3[n6 + 1 + n5], b);
                        }
                    }
                    array2[j] = array4;
                }
            }
        }
        return array2;
    }
    
    private static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final boolean b) {
        return lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
    }
    
    private static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5) {
        return (int)((float)Math.pow(((float)Math.pow((n >> n5 & 0xFF) / 255.0f, 2.2) + (float)Math.pow((n2 >> n5 & 0xFF) / 255.0f, 2.2) + (float)Math.pow((n3 >> n5 & 0xFF) / 255.0f, 2.2) + (float)Math.pow((n4 >> n5 & 0xFF) / 255.0f, 2.2)) * 0.25, 0.45454545454545453) * 255.0);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[][] array, final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        for (int i = 0; i < array.length; ++i) {
            llllIIIIlIIIlIlllIll(i, array[i], n >> i, n2 >> i, n3 >> i, n4 >> i, b, b2, array.length > 1);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final int[] array, final int n2, final int n3, final int n4, final int n5, final boolean b, final boolean b2, final boolean b3) {
        final int n6 = 4194304 / n2;
        llllIIIIlIIIlIlllIll(b, b3);
        llllIIIIlIIIlIlllIll(b2);
        int min;
        for (int i = 0; i < n2 * n3; i += n2 * min) {
            final int n7 = i / n2;
            min = Math.min(n6, n3 - n7);
            IlIlIlIlIlllllllllIl(array, i, n2 * min);
            GL11.glTexSubImage2D(3553, n, n4, n5 + n7, n2, min, 32993, 33639, IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final BufferedImage bufferedImage, final boolean b, final boolean b2) {
        llllIIIIlIIIlIlllIll(n, bufferedImage.getWidth(), bufferedImage.getHeight());
        return llllIIIIlIIIlIlllIll(n, bufferedImage, 0, 0, b, b2);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        llllIIIIlIIIlIlllIll(n, 0, n2, n3);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        Class<IlllllllIIIlIIIlIlII> ilIlIlIlIlllllllllIl = IlllllllIIIlIIIlIlII.class;
        if (lIIIIlIIIIIlllIllIII.aM.llIllIIIIIllIlIIIIlI()) {
            ilIlIlIlIlllllllllIl = (Class<IlllllllIIIlIIIlIlII>)lIIIIlIIIIIlllIllIII.aM.IlIlIlIlIlllllllllIl();
        }
        synchronized (ilIlIlIlIlllllllllIl) {
            llllIIIIlIIIlIlllIll(n);
            IlIlIlIlIlllllllllIl(n);
        }
        if (n2 >= 0) {
            GL11.glTexParameteri(3553, 33085, n2);
            GL11.glTexParameterf(3553, 33082, 0.0f);
            GL11.glTexParameterf(3553, 33083, (float)n2);
            GL11.glTexParameterf(3553, 34049, 0.0f);
        }
        for (int i = 0; i <= n2; ++i) {
            GL11.glTexImage2D(3553, i, 6408, n3 >> i, n4 >> i, 0, 32993, 33639, (IntBuffer)null);
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final BufferedImage bufferedImage, final int n2, final int n3, final boolean b, final boolean b2) {
        IlIlIlIlIlllllllllIl(n);
        llllIIIIlIIIlIlllIll(bufferedImage, n2, n3, b, b2);
        return n;
    }
    
    private static void llllIIIIlIIIlIlllIll(final BufferedImage bufferedImage, final int n, final int n2, final boolean b, final boolean b2) {
        final int width = bufferedImage.getWidth();
        final int height = bufferedImage.getHeight();
        final int n3 = 4194304 / width;
        final int[] illIIlllIIIIlllIIlIl = IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
        IlIlIlIlIlllllllllIl(b);
        llllIIIIlIIIlIlllIll(b2);
        for (int i = 0; i < width * height; i += width * n3) {
            final int n4 = i / width;
            final int min = Math.min(n3, height - n4);
            final int n5 = width * min;
            bufferedImage.getRGB(0, n4, width, min, illIIlllIIIIlllIIlIl, 0, width);
            llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, n5);
            GL11.glTexSubImage2D(3553, 0, n, n2 + n4, width, min, 32993, 33639, IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean b) {
        if (b) {
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
        }
        else {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final boolean b) {
        llllIIIIlIIIlIlllIll(b, false);
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean b, final boolean b2) {
        if (b) {
            GL11.glTexParameteri(3553, 10241, b2 ? 9987 : 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
        }
        else {
            final int iIlllIIlIllIllIlIIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll();
            GL11.glTexParameteri(3553, 10241, b2 ? iIlllIIlIllIllIlIIll : 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final int[] array, final int n) {
        IlIlIlIlIlllllllllIl(array, 0, n);
    }
    
    private static void IlIlIlIlIlllllllllIl(final int[] array, final int n, final int n2) {
        int[] llllIIIIlIIIlIlllIll = array;
        if (Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array);
        }
        IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl.clear();
        IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl.put(llllIIIIlIIIlIlllIll, n, n2);
        IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl.position(0).limit(n2);
    }
    
    static void IlIlIlIlIlllllllllIl(final int n) {
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n);
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final BufferedImage llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl());
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        final int width = llllIIIIlIIIlIlllIll.getWidth();
        final int height = llllIIIIlIIIlIlllIll.getHeight();
        final int[] array = new int[width * height];
        llllIIIIlIIIlIlllIll.getRGB(0, 0, width, height, array, 0, width);
        return array;
    }
    
    public static BufferedImage llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        BufferedImage read;
        try {
            read = ImageIO.read(inputStream);
        }
        finally {
            IOUtils.closeQuietly(inputStream);
        }
        IOUtils.closeQuietly(inputStream);
        return read;
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final int[] array) {
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = llIllIIIIIllIlIIIIlI(array[i]);
        }
        return array2;
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n) {
        final int n2 = n >> 24 & 0xFF;
        final int n3 = n >> 16 & 0xFF;
        final int n4 = n >> 8 & 0xFF;
        final int n5 = n & 0xFF;
        return n2 << 24 | (n3 * 30 + n4 * 59 + n5 * 11) / 100 << 16 | (n3 * 30 + n4 * 70) / 100 << 8 | (n3 * 30 + n5 * 70) / 100;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2) {
        final int[] array2 = new int[n];
        for (int n3 = n2 / 2, i = 0; i < n3; ++i) {
            System.arraycopy(array, i * n, array2, 0, n);
            System.arraycopy(array, (n2 - 1 - i) * n, array, i * n, n);
            System.arraycopy(array2, 0, array, (n2 - 1 - i) * n, n);
        }
    }
}
