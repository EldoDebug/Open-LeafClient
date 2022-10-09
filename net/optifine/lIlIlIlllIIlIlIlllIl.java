package net.optifine;

import java.nio.*;
import java.awt.*;
import net.optifine.util.*;
import java.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.opengl.*;

public class lIlIlIlllIIlIlIlllIl
{
    private final String llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int[] IlIIIlIlIIIllIlIlIIl;
    private final boolean IlIlIIIllIllIIIIIllI;
    private int[][] IllIIlllIIIIlllIIlIl;
    private IntBuffer[] llllIIIlIlllIlIIIIIl;
    private Dimension[] lIIIIlIIIIIlllIllIII;
    
    public lIlIlIlllIIlIlIlllIl(final String llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int[] ilIIIlIlIIIllIlIlIIl, final boolean ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll);
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, this.lIIIIlIIIIIlllIllIII);
        if (ilIlIIIllIllIIIIIllI) {
            this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl);
        }
    }
    
    public static Dimension[] llllIIIIlIIIlIlllIll(final int n, final int n2, final String s) {
        final int llllIIIIlIIIlIlllIll = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(n);
        final int llllIIIIlIIIlIlllIll2 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(n2);
        if (llllIIIIlIIIlIlllIll == n && llllIIIIlIIIlIlllIll2 == n2) {
            final ArrayList<Dimension> list = new ArrayList<Dimension>();
            int n3 = llllIIIIlIIIlIlllIll;
            int n4 = llllIIIIlIIIlIlllIll2;
            while (true) {
                n3 /= 2;
                n4 /= 2;
                if (n3 <= 0 && n4 <= 0) {
                    break;
                }
                if (n3 <= 0) {
                    n3 = 1;
                }
                if (n4 <= 0) {
                    n4 = 1;
                }
                list.add(new Dimension(n3, n4));
            }
            return list.toArray(new Dimension[list.size()]);
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Mipmaps not possible (power of 2 dimensions needed), texture: " + s + ", dim: " + n + "x" + n2);
        return new Dimension[0];
    }
    
    public static int[][] llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2, final Dimension[] array2) {
        int[] array3 = array;
        int n3 = n;
        int n4 = 1;
        final int[][] array4 = new int[array2.length][];
        for (int i = 0; i < array2.length; ++i) {
            final Dimension dimension = array2[i];
            final int width = dimension.width;
            final int height = dimension.height;
            final int[] array5 = new int[width * height];
            array4[i] = array5;
            if (n4 != 0) {
                for (int j = 0; j < width; ++j) {
                    for (int k = 0; k < height; ++k) {
                        array5[j + k * width] = llllIIIIlIIIlIlllIll(array3[j * 2 + 0 + (k * 2 + 0) * n3], array3[j * 2 + 1 + (k * 2 + 0) * n3], array3[j * 2 + 1 + (k * 2 + 1) * n3], array3[j * 2 + 0 + (k * 2 + 1) * n3]);
                    }
                }
            }
            array3 = array5;
            n3 = width;
            if (width <= 1 || height <= 1) {
                n4 = 0;
            }
        }
        return array4;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(n, n2), llllIIIIlIIIlIlllIll(n3, n4));
    }
    
    private static int llllIIIIlIIIlIlllIll(int n, int n2) {
        int n3 = (n & 0xFF000000) >> 24 & 0xFF;
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        int n5 = (n3 + n4) / 2;
        if (n3 == 0 && n4 == 0) {
            n3 = 1;
            n4 = 1;
        }
        else {
            if (n3 == 0) {
                n = n2;
                n5 /= 2;
            }
            if (n4 == 0) {
                n2 = n;
                n5 /= 2;
            }
        }
        return n5 << 24 | ((n >> 16 & 0xFF) * n3 + (n2 >> 16 & 0xFF) * n4) / (n3 + n4) << 16 | ((n >> 8 & 0xFF) * n3 + (n2 >> 8 & 0xFF) * n4) / (n3 + n4) << 8 | ((n & 0xFF) * n3 + (n2 & 0xFF) * n4) / (n3 + n4);
    }
    
    private int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return (((n & 0xFF000000) >> 24 & 0xFF) + ((n2 & 0xFF000000) >> 24 & 0xFF) >> 1 << 24) + ((n & 0xFEFEFE) + (n2 & 0xFEFEFE) >> 1);
    }
    
    public static IntBuffer[] llllIIIIlIIIlIlllIll(final Dimension[] array, final int[][] array2) {
        if (array == null) {
            return null;
        }
        final IntBuffer[] array3 = new IntBuffer[array.length];
        for (int i = 0; i < array.length; ++i) {
            final Dimension dimension = array[i];
            final IntBuffer ilIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(dimension.width * dimension.height);
            final int[] array4 = array2[i];
            ilIIIlIlIIIllIlIlIIl.clear();
            ilIIIlIlIIIllIlIlIIl.put(array4);
            ilIIIlIlIIIllIlIlIIl.clear();
            array3[i] = ilIIIlIlIIIllIlIlIIl;
        }
        return array3;
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2, final String s) {
        final Dimension[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n, n2, s);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final Dimension dimension = llllIIIIlIIIlIlllIll[i];
            GL11.glTexImage2D(3553, i + 1, 6408, dimension.width, dimension.height, 0, 32993, 33639, (IntBuffer)null);
        }
    }
}
