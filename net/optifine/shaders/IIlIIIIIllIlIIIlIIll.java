package net.optifine.shaders;

import java.nio.*;
import org.lwjgl.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import net.minecraft.client.*;

public class IIlIIIIIllIlIIIlIIll
{
    public static final int llllIIIIlIIIlIlllIll = 1048576;
    public static ByteBuffer IlIlIlIlIlllllllllIl;
    public static IntBuffer llIllIIIIIllIlIIIIlI;
    public static int[] IlIIIlIlIIIllIlIlIIl;
    public static final int IlIlIIIllIllIIIIIllI = 0;
    public static final int IllIIlllIIIIlllIIlIl = -8421377;
    public static final int llllIIIlIlllIlIIIIIl = 0;
    public static Map lIIIIlIIIIIlllIllIII;
    
    static {
        IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl = BufferUtils.createByteBuffer(4194304);
        IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI = IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl.asIntBuffer();
        IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl = new int[1048576];
        IIlIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII = new HashMap();
    }
    
    public static IntBuffer llllIIIIlIIIlIlllIll(final int n) {
        if (IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI.capacity() < n) {
            IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl = BufferUtils.createByteBuffer(llIllIIIIIllIlIIIIlI(n) * 4);
            IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI = IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl.asIntBuffer();
        }
        return IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
    }
    
    public static int[] IlIlIlIlIlllllllllIl(final int n) {
        if (IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl == null) {
            IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl = new int[1048576];
        }
        if (IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl.length < n) {
            IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl = new int[llIllIIIIIllIlIIIIlI(n)];
        }
        return IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n) {
        final int n2 = n - 1;
        final int n3 = n2 | n2 >> 1;
        final int n4 = n3 | n3 >> 2;
        final int n5 = n4 | n4 >> 4;
        final int n6 = n5 | n5 >> 8;
        return (n6 | n6 >> 16) + 1;
    }
    
    public static int IlIIIlIlIIIllIlIlIIl(int n) {
        int n2 = 0;
        if ((n & 0xFFFF0000) != 0x0) {
            n2 += 16;
            n >>= 16;
        }
        if ((n & 0xFF00) != 0x0) {
            n2 += 8;
            n >>= 8;
        }
        if ((n & 0xF0) != 0x0) {
            n2 += 4;
            n >>= 4;
        }
        if ((n & 0x6) != 0x0) {
            n2 += 2;
            n >>= 2;
        }
        if ((n & 0x2) != 0x0) {
            ++n2;
        }
        return n2;
    }
    
    public static IntBuffer llllIIIIlIIIlIlllIll(final int n, final int n2) {
        IlIlIlIlIlllllllllIl(n);
        llllIIIIlIIIlIlllIll(n);
        Arrays.fill(IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl, 0, n, n2);
        IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI.put(IIlIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl, 0, n);
        return IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
    }
    
    public static int[] IlIlIIIllIllIIIIIllI(final int n) {
        final int[] array = new int[n * 3];
        Arrays.fill(array, 0, n, 0);
        Arrays.fill(array, n, n * 2, -8421377);
        Arrays.fill(array, n * 2, n * 3, 0);
        return array;
    }
    
    public static int[] IlIlIlIlIlllllllllIl(final int n, final int n2) {
        final int[] array = new int[n * 3];
        Arrays.fill(array, 0, n, n2);
        Arrays.fill(array, n, n * 2, -8421377);
        Arrays.fill(array, n * 2, n * 3, 0);
        return array;
    }
    
    public static llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIllllIlIlIIIIll liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII == null) {
            final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            liiiIlIIIIIlllIllIII = (llllIIllllIlIlIIIIll)IIlIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII.get(llllIIIIlIIIlIlllIll2);
            if (liiiIlIIIIIlllIllIII == null) {
                liiiIlIIIIIlllIllIII = new llllIIllllIlIlIIIIll(llllIIIIlIIIlIlllIll2, GL11.glGenTextures(), GL11.glGenTextures());
                IIlIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII.put(llllIIIIlIIIlIlllIll2, liiiIlIIIIIlllIllIII);
            }
            llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    public static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        final llllIIllllIlIlIIIIll liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII != null) {
            llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = null;
            IIlIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII.remove(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll);
            lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl);
            lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI);
            if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll != n) {
                IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Error : MultiTexID.base mismatch: " + liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll + ", texid: " + n);
                lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI && lllllIlIIIlIlIIlllII.IIIllllllIllIIIlllIl() == 33984) {
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33986);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n);
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33987);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n2);
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        llIllIIIIIllIlIIIIlI(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl, llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI && lllllIlIIIlIlIIlllII.IIIllllllIllIIIlllIl() == 33984) {
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33986);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n2);
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33987);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n3);
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n);
    }
    
    public static void IlIlIlIlIlllllllllIl(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        if (llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI && lllllIlIIIlIlIIlllII.IIIllllllIllIIIlllIl() == 33984) {
            if (llIIlllIIlllIIllIllI.cj) {
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33986);
                lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl);
            }
            if (llIIlllIIlllIIllIllI.ck) {
                lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33987);
                lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI);
            }
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
        IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl());
        if (lllllIlIIIlIlIIlllII.IIIllllllIllIIIlllIl() == 33984) {
            final int iiIllIIllIIIIIIlIIlI = llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI;
            final int iiiiiiIllllIlIIIIIII = llIIlllIIlllIIllIllI.IIIIIIIllllIlIIIIIII;
            if (ilIIIlIlIIIllIlIlIIl instanceof IlIlIIIIIIlllIlIllIl) {
                llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI = ((IlIlIIIIIIlllIlIllIl)ilIIIlIlIIIllIlIlIIl).lIIIlllIIIllIIIllIII;
                llIIlllIIlllIIllIllI.IIIIIIIllllIlIIIIIII = ((IlIlIIIIIIlllIlIllIl)ilIIIlIlIIIllIlIlIIl).llIIlIIIlIIIllIlIIIl;
            }
            else {
                llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI = 0;
                llIIlllIIlllIIllIllI.IIIIIIIllllIlIIIIIII = 0;
            }
            if (llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI != iiIllIIllIIIIIIlIIlI || llIIlllIIlllIIllIllI.IIIIIIIllllIlIIIIIII != iiiiiiIllllIlIIIIIII) {
                llIIlllIIlllIIllIllI.ap.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI, llIIlllIIlllIIllIllI.IIIIIIIllllIlIIIIIII);
            }
        }
    }
    
    public static void IllIIlllIIIIlllIIlIl(final int n) {
        IlIlIlIlIlllllllllIl(IIlIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII.get(n));
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIllllIlIlIIIIll llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
        final int[] llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        final int n4 = n2 * n3;
        Arrays.fill(llIllIIIIIllIlIIIIlI, n4, n4 * 2, -8421377);
        Arrays.fill(llIllIIIIIllIlIIIIlI, n4 * 2, n4 * 3, 0);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, n2, n3);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(false, false);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(false);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, n2, n3);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(false, false);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(false);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI, n2, n3);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(false, false);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(false);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int[] array, final int n2, final int n3, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIllllIlIlIIIIll llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
        llllIIIIlIIIlIlllIll(array, n2, n3, 0, 0, 0);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll(array, n2, n3, 0, 0, 1);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        llllIIIIlIIIlIlllIll(array, n2, n3, 0, 0, 2);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = n * n2;
        final IntBuffer llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n6);
        llllIIIIlIIIlIlllIll.clear();
        final int n7 = n5 * n6;
        if (array.length >= n7 + n6) {
            llllIIIIlIIIlIlllIll.put(array, n7, n6).position(0).limit(n6);
            GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.clear();
        }
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(1, 1);
        ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()[0] = -1;
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        return ilIlIlIlIlllllllllIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2, final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("allocateTextureMap " + n2 + " " + liiIlllIIIllIIIllIII + " " + llIIlIIIlIIIllIlIIIl + " ");
        ilIlIIIIIIlllIlIllIl.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        ilIlIIIIIIlllIlIllIl.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, n2, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl);
        if (llIIlllIIlllIIllIllI.cj) {
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, n2, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl);
        }
        if (llIIlllIIlllIIllIllI.ck) {
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, n2, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl);
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(n);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final String s, final int[][] array, final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        final llllIIllllIlIlIIIIll liiiIlIIIIIlllIllIII = ilIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII;
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(array, n, n2, n3, n4, b, b2);
        final boolean b3 = false;
        if (llIIlllIIlllIIllIllI.cj) {
            final int[][] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, String.valueOf(s) + "_n", n, n2, array.length, b3, -8421377);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl);
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, n3, n4, b, b2);
        }
        if (llIIlllIIlllIIllIllI.ck) {
            final int[][] llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, String.valueOf(s) + "_s", n, n2, array.length, b3, 0);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI);
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, n, n2, n3, n4, b, b2);
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll);
    }
    
    public static int[][] llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final String s, final int n, final int n2, final int n3, final boolean b, final int n4) {
        final llllIIllllIlIlIIIIll liiiIlIIIIIlllIllIII = ilIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII;
        final int[][] array = new int[n3][];
        final int[] array2 = array[0] = new int[n * n2];
        boolean b2 = false;
        final BufferedImage llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s)));
        if (llllIIIIlIIIlIlllIll != null) {
            final int width = llllIIIIlIIIlIlllIll.getWidth();
            llllIIIIlIIIlIlllIll.getHeight();
            if (width + (b ? 16 : 0) == n) {
                b2 = true;
                llllIIIIlIIIlIlllIll.getRGB(0, 0, width, width, array2, 0, width);
            }
        }
        if (!b2) {
            Arrays.fill(array2, n4);
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI);
        return llllIIIIlIIIlIlllIll(array.length - 1, n, array);
    }
    
    public static BufferedImage llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        try {
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
                return null;
            }
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            if (llllIIIIlIIIlIlllIll == null) {
                return null;
            }
            final BufferedImage read = ImageIO.read(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            return read;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static int[][] llllIIIIlIIIlIlllIll(final int n, final int n2, final int[][] array) {
        for (int i = 1; i <= n; ++i) {
            if (array[i] == null) {
                final int n3 = n2 >> i;
                final int n4 = n3 * 2;
                final int[] array2 = array[i - 1];
                final int n5 = i;
                final int[] array3 = new int[n3 * n3];
                array[n5] = array3;
                final int[] array4 = array3;
                for (int j = 0; j < n3; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        final int n6 = j * 2 * n4 + k * 2;
                        array4[j * n3 + k] = IlIlIlIlIlllllllllIl(array2[n6], array2[n6 + 1], array2[n6 + n4], array2[n6 + n4 + 1]);
                    }
                }
            }
        }
        return array;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[][] array, final int n, final int n2, final int n3, final int n4, final int n5) {
        final IntBuffer llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n * n2);
        for (int length = array.length, n6 = 0, n7 = n, n8 = n2, n9 = n3, n10 = n4; n7 > 0 && n8 > 0 && n6 < length; n7 >>= 1, n8 >>= 1, n9 >>= 1, n10 >>= 1, ++n6) {
            final int n11 = n7 * n8;
            final int[] array2 = array[n6];
            llllIIIIlIIIlIlllIll.clear();
            if (array2.length >= n11 * (n5 + 1)) {
                llllIIIIlIIIlIlllIll.put(array2, n11 * n5, n11).position(0).limit(n11);
                GL11.glTexSubImage2D(3553, n6, n9, n10, n7, n8, 32993, 33639, llllIIIIlIIIlIlllIll);
            }
        }
        llllIIIIlIIIlIlllIll.clear();
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        int n5 = n >>> 24 & 0xFF;
        int n6 = n2 >>> 24 & 0xFF;
        int n7 = n3 >>> 24 & 0xFF;
        int n8 = n4 >>> 24 & 0xFF;
        final int n9 = n5 + n6 + n7 + n8;
        final int n10 = (n9 + 2) / 4;
        int n11;
        if (n9 != 0) {
            n11 = n9;
        }
        else {
            n11 = 4;
            n5 = 1;
            n6 = 1;
            n7 = 1;
            n8 = 1;
        }
        final int n12 = (n11 + 1) / 2;
        return n10 << 24 | ((n >>> 16 & 0xFF) * n5 + (n2 >>> 16 & 0xFF) * n6 + (n3 >>> 16 & 0xFF) * n7 + (n4 >>> 16 & 0xFF) * n8 + n12) / n11 << 16 | ((n >>> 8 & 0xFF) * n5 + (n2 >>> 8 & 0xFF) * n6 + (n3 >>> 8 & 0xFF) * n7 + (n4 >>> 8 & 0xFF) * n8 + n12) / n11 << 8 | ((n >>> 0 & 0xFF) * n5 + (n2 >>> 0 & 0xFF) * n6 + (n3 >>> 0 & 0xFF) * n7 + (n4 >>> 0 & 0xFF) * n8 + n12) / n11 << 0;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4) {
        return ((n >>> 24 & 0xFF) + (n2 >>> 24 & 0xFF) + (n3 >>> 24 & 0xFF) + (n4 >>> 24 & 0xFF) + 2) / 4 << 24 | ((n >>> 16 & 0xFF) + (n2 >>> 16 & 0xFF) + (n3 >>> 16 & 0xFF) + (n4 >>> 16 & 0xFF) + 2) / 4 << 16 | ((n >>> 8 & 0xFF) + (n2 >>> 8 & 0xFF) + (n3 >>> 8 & 0xFF) + (n4 >>> 8 & 0xFF) + 2) / 4 << 8 | ((n >>> 0 & 0xFF) + (n2 >>> 0 & 0xFF) + (n3 >>> 0 & 0xFF) + (n4 >>> 0 & 0xFF) + 2) / 4 << 0;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2, final int n3) {
        Math.min(n2, n3);
        int n4 = n;
        int i = n2;
        int n5 = n3;
        int n6 = 0;
        int n7 = 0;
        int j = 0;
        while (i > 1) {
            if (n5 <= 1) {
                break;
            }
            n6 = n4 + i * n5;
            n7 = i / 2;
            final int n8 = n5 / 2;
            for (int k = 0; k < n8; ++k) {
                final int n9 = n6 + k * n7;
                final int n10 = n4 + k * 2 * i;
                for (int l = 0; l < n7; ++l) {
                    array[n9 + l] = llllIIIIlIIIlIlllIll(array[n10 + l * 2], array[n10 + l * 2 + 1], array[n10 + i + l * 2], array[n10 + i + l * 2 + 1]);
                }
            }
            ++j;
            i = n7;
            n5 = n8;
            n4 = n6;
        }
        while (j > 0) {
            --j;
            final int n11 = n2 >> j;
            final int n12 = n3 >> j;
            int n14;
            final int n13 = n14 = n6 - n11 * n12;
            for (int n15 = 0; n15 < n12; ++n15) {
                for (int n16 = 0; n16 < n11; ++n16) {
                    if (array[n14] == 0) {
                        array[n14] = (array[n6 + n15 / 2 * n7 + n16 / 2] & 0xFFFFFF);
                    }
                    ++n14;
                }
            }
            n6 = n13;
            n7 = n11;
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final int[] array, final int n, final int n2, final int n3) {
        Math.min(n2, n3);
        int n4 = n;
        int i = n2;
        int n5 = n3;
        int n6 = 0;
        int n7 = 0;
        int j = 0;
        while (i > 1) {
            if (n5 <= 1) {
                break;
            }
            n6 = n4 + i * n5;
            n7 = i / 2;
            final int n8 = n5 / 2;
            for (int k = 0; k < n8; ++k) {
                final int n9 = n6 + k * n7;
                final int n10 = n4 + k * 2 * i;
                for (int l = 0; l < n7; ++l) {
                    array[n9 + l] = IlIlIlIlIlllllllllIl(array[n10 + l * 2], array[n10 + l * 2 + 1], array[n10 + i + l * 2], array[n10 + i + l * 2 + 1]);
                }
            }
            ++j;
            i = n7;
            n5 = n8;
            n4 = n6;
        }
        while (j > 0) {
            --j;
            final int n11 = n2 >> j;
            final int n12 = n3 >> j;
            int n14;
            final int n13 = n14 = n6 - n11 * n12;
            for (int n15 = 0; n15 < n12; ++n15) {
                for (int n16 = 0; n16 < n11; ++n16) {
                    if (array[n14] == 0) {
                        array[n14] = (array[n6 + n15 / 2 * n7 + n16 / 2] & 0xFFFFFF);
                    }
                    ++n14;
                }
            }
            n6 = n13;
            n7 = n11;
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2) {
        final int n3 = n * n2;
        if (array[0] >>> 24 == 255 && array[n3 - 1] == 0) {
            return true;
        }
        for (int i = 0; i < n3; ++i) {
            final int n4 = array[i] >>> 24;
            if (n4 != 0 && n4 != 255) {
                return true;
            }
        }
        return false;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        for (int n6 = n, n7 = n2, n8 = n3, n9 = n4; n6 > 0 && n7 > 0; n6 /= 2, n7 /= 2, n8 /= 2, n9 /= 2) {
            GL11.glCopyTexSubImage2D(3553, n5, n8, n9, 0, 0, n6, n7);
            ++n5;
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final int[] array, final int n, final int n2, final boolean b, final boolean b2) {
        final int n3 = b ? 9729 : 9728;
        final int n4 = b2 ? 33071 : 10497;
        final int n5 = n * n2;
        final IntBuffer llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n5);
        llllIIIIlIIIlIlllIll.clear();
        llllIIIIlIIIlIlllIll.put(array, 0, n5).position(0).limit(n5);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll);
        GL11.glTexImage2D(3553, 0, 6408, n, n2, 0, 32993, 33639, llllIIIIlIIIlIlllIll);
        GL11.glTexParameteri(3553, 10241, n3);
        GL11.glTexParameteri(3553, 10240, n3);
        GL11.glTexParameteri(3553, 10242, n4);
        GL11.glTexParameteri(3553, 10243, n4);
        llllIIIIlIIIlIlllIll.put(array, n5, n5).position(0).limit(n5);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl);
        GL11.glTexImage2D(3553, 0, 6408, n, n2, 0, 32993, 33639, llllIIIIlIIIlIlllIll);
        GL11.glTexParameteri(3553, 10241, n3);
        GL11.glTexParameteri(3553, 10240, n3);
        GL11.glTexParameteri(3553, 10242, n4);
        GL11.glTexParameteri(3553, 10243, n4);
        llllIIIIlIIIlIlllIll.put(array, n5 * 2, n5).position(0).limit(n5);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI);
        GL11.glTexImage2D(3553, 0, 6408, n, n2, 0, 32993, 33639, llllIIIIlIIIlIlllIll);
        GL11.glTexParameteri(3553, 10241, n3);
        GL11.glTexParameteri(3553, 10240, n3);
        GL11.glTexParameteri(3553, 10242, n4);
        GL11.glTexParameteri(3553, 10243, n4);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll);
    }
    
    public static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final int[] array, final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        final int n5 = n * n2;
        final IntBuffer llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n5);
        llllIIIIlIIIlIlllIll.clear();
        llllIIIIlIIIlIlllIll.put(array, 0, n5);
        llllIIIIlIIIlIlllIll.position(0).limit(n5);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, llllIIIIlIIIlIlllIll);
        if (array.length == n5 * 3) {
            llllIIIIlIIIlIlllIll.clear();
            llllIIIIlIIIlIlllIll.put(array, n5, n5).position(0);
            llllIIIIlIIIlIlllIll.position(0).limit(n5);
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, llllIIIIlIIIlIlllIll);
        if (array.length == n5 * 3) {
            llllIIIIlIIIlIlllIll.clear();
            llllIIIIlIIIlIlllIll.put(array, n5 * 2, n5);
            llllIIIIlIIIlIlllIll.position(0).limit(n5);
        }
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexSubImage2D(3553, 0, n3, n4, n, n2, 32993, 33639, llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final String s) {
        if (lIllllIllIllIIllllll == null) {
            return null;
        }
        return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl().split(".png")[0]) + "_" + s + ".png");
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n, final int n2, final int[] array) {
        if (llIIlllIIlllIIllIllI.cj) {
            llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, "n"), n, n2, array, n * n2, -8421377);
        }
        if (llIIlllIIlllIIllIllI.ck) {
            llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, "s"), n, n2, array, n * n2 * 2, 0);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n, final int n2, final int[] array, final int n3, final int n4) {
        if (!llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIllllIllIllIIllllll, n, n2, array, n3)) {
            Arrays.fill(array, n3, n3 + n * n2, n4);
        }
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n, final int n2, final int[] array, final int n3) {
        if (lIllllIllIllIIllllll == null) {
            return false;
        }
        try {
            final BufferedImage read = ImageIO.read(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl());
            if (read == null) {
                return false;
            }
            if (read.getWidth() == n && read.getHeight() == n2) {
                read.getRGB(0, 0, n, n2, array, n3, n);
                return true;
            }
            return false;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final BufferedImage bufferedImage, final boolean b, final boolean b2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final int width = bufferedImage.getWidth();
        final int height = bufferedImage.getHeight();
        final int[] ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(width * height * 3);
        bufferedImage.getRGB(0, 0, width, height, ilIlIlIlIlllllllllIl, 0, width);
        llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIllllIllIllIIllllll, width, height, ilIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, ilIlIlIlIlllllllllIl, width, height, b, b2);
        return n;
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int[] array, final int n, final int n2, final int n3) {
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        final int n4 = 255 - n3;
        return ((n >>> 24 & 0xFF) * n3 + (n2 >>> 24 & 0xFF) * n4) / 255 << 24 | ((n >>> 16 & 0xFF) * n3 + (n2 >>> 16 & 0xFF) * n4) / 255 << 16 | ((n >>> 8 & 0xFF) * n3 + (n2 >>> 8 & 0xFF) * n4) / 255 << 8 | ((n >>> 0 & 0xFF) * n3 + (n2 >>> 0 & 0xFF) * n4) / 255 << 0;
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final List list) {
        int width = 0;
        int height = 0;
        int n = 0;
        int[] ilIlIlIlIlllllllllIl = null;
        for (final String next : list) {
            if (next != null) {
                try {
                    final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(next);
                    final BufferedImage read = ImageIO.read(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl());
                    if (n == 0) {
                        width = read.getWidth();
                        height = read.getHeight();
                        n = width * height;
                        ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(n, 0);
                    }
                    final int[] ilIlIlIlIlllllllllIl2 = IlIlIlIlIlllllllllIl(n * 3);
                    read.getRGB(0, 0, width, height, ilIlIlIlIlllllllllIl2, 0, width);
                    llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIllllIllIllIIllllll, width, height, ilIlIlIlIlllllllllIl2);
                    for (int i = 0; i < n; ++i) {
                        final int n2 = ilIlIlIlIlllllllllIl2[i] >>> 24 & 0xFF;
                        ilIlIlIlIlllllllllIl[n * 0 + i] = IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2[n * 0 + i], ilIlIlIlIlllllllllIl[n * 0 + i], n2);
                        ilIlIlIlIlllllllllIl[n * 1 + i] = IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2[n * 1 + i], ilIlIlIlIlllllllllIl[n * 1 + i], n2);
                        ilIlIlIlIlllllllllIl[n * 2 + i] = IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2[n * 2 + i], ilIlIlIlIlllllllllIl[n * 2 + i], n2);
                    }
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(), ilIlIlIlIlllllllllIl, width, height, false, false);
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = Minecraft.getMinecraft().lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl != null) {
            final llllIIllllIlIlIIIIll llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
            GL11.glTexParameteri(3553, 10241, llIIlllIIlllIIllIllI.cs[llIIlllIIlllIIllIllI.cc]);
            GL11.glTexParameteri(3553, 10240, llIIlllIIlllIIllIllI.ct[llIIlllIIlllIIllIllI.cf]);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
            GL11.glTexParameteri(3553, 10241, llIIlllIIlllIIllIllI.cs[llIIlllIIlllIIllIllI.cd]);
            GL11.glTexParameteri(3553, 10240, llIIlllIIlllIIllIllI.ct[llIIlllIIlllIIllIllI.cg]);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
            GL11.glTexParameteri(3553, 10241, llIIlllIIlllIIllIllI.cs[llIIlllIIlllIIllIllI.ce]);
            GL11.glTexParameteri(3553, 10240, llIIlllIIlllIIllIllI.ct[llIIlllIIlllIIllIllI.ch]);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
        }
    }
    
    public static int[][] llllIIIIlIIIlIlllIll(final int[][] array, final int n, final int n2, final int n3) {
        final int length = array.length;
        final int[][] array2 = new int[length][];
        for (int i = 0; i < length; ++i) {
            final int[] array3 = array[i];
            if (array3 != null) {
                final int n4 = (n >> i) * (n2 >> i);
                final int[] array4 = new int[n4 * 3];
                array2[i] = array4;
                final int n5 = array3.length / 3;
                final int n6 = n4 * n3;
                final int n7 = 0;
                System.arraycopy(array3, n6, array4, n7, n4);
                final int n8 = n6 + n5;
                final int n9 = n7 + n4;
                System.arraycopy(array3, n8, array4, n9, n4);
                System.arraycopy(array3, n8 + n5, array4, n9 + n4, n4);
            }
        }
        return array2;
    }
    
    public static int[][] llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int[][] array, final int n, final int n2) {
        return array;
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int[] array) {
    }
}
