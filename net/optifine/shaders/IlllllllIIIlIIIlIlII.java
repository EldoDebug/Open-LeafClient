package net.optifine.shaders;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import java.nio.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlllllllIIIlIIIlIlII
{
    int llllIIIIlIIIlIlllIll;
    int IlIlIlIlIlllllllllIl;
    int llIllIIIIIllIlIIIIlI;
    int IlIIIlIlIIIllIlIlIIl;
    boolean IlIlIIIllIllIIIIIllI;
    boolean IllIIlllIIIIlllIIlIl;
    boolean llllIIIlIlllIlIIIIIl;
    boolean lIIIIlIIIIIlllIllIII;
    long[] lIIIlllIIIllIIIllIII;
    int llIIlIIIlIIIllIlIIIl;
    
    public IlllllllIIIlIIIlIlII() {
        this.lIIIlllIIIllIIIllIII = new long[10];
        this.llIIlIIIlIIIllIlIIIl = 0;
        this.lIIIlllIIIllIIIllIII[this.llIIlIIIlIIIllIlIIIl] = 0L;
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI = new IlllllllIIIlIIIlIlII();
    }
    
    public void llllIIIIlIIIlIlllIll(final long n) {
        ++this.llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII[this.llIIlIIIlIIIllIlIIIl] = n;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIlllIIIllIIIllIII[this.llIIlIIIlIIIllIlIIIl] = 0L;
        --this.llIIlIIIlIIIllIlIIIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        int n;
        int n2;
        if (llIIlIIIlIIIllIlIIIl instanceof IllIIlllIIIIlllIIlIl) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)llIIlIIIlIIIllIlIIIl;
            n = illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
            n2 = illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl();
        }
        else {
            n = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            n2 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl);
        }
        final int llllIIIIlIIIlIlllIll = net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2);
        if (llllIIIIlIIIlIlllIll >= 0) {
            n = llllIIIIlIIIlIlllIll;
        }
        liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(((long)(n2 & 0xFFFF) << 32) + (((llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() & 0xFFFF) << 16) + (n & 0xFFFF)));
    }
    
    public static void IlIlIlIlIlllllllllIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final boolean b, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        return b;
    }
    
    public static void llIllIIIIIllIlIIIIlI(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI = liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI;
        final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = liIllIIIllllIlllIllI.lIIIIlIIIIIlllIllIII();
        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl() / 4;
        ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI;
        ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(0);
        ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl = (ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI ? (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() / 4) : 0);
        ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI = (ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl ? (liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(0) / 4) : 0);
        ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl = 8;
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        if (liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI == 0) {
            llIllIIIIIllIlIIIIlI(liIllIIIllllIlllIllI);
        }
    }
    
    public static void IlIlIIIllIllIIIIIllI(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI = liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI;
        if (ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll == 14) {
            if (liIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl == 7 && liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI % 4 == 0) {
                ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl() - 4 * ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll);
            }
            final long n = ilIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII[ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl];
            final int n2 = liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl() - 14 + 12;
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll.put(n2, (int)n);
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll.put(n2 + 1, (int)(n >> 32));
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final int[] array) {
        if (liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI == 0) {
            llIllIIIIIllIlIIIIlI(liIllIIIllllIlllIllI);
        }
        final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI = liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI;
        if (ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll == 14) {
            final long n = ilIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII[ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl];
            for (int n2 = 12; n2 + 1 < array.length; n2 += 14) {
                array[n2] = (int)n;
                array[n2 + 1] = (int)(n >> 32);
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final ByteBuffer byteBuffer) {
        if (liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI == 0) {
            llIllIIIIIllIlIIIIlI(liIllIIIllllIlllIllI);
        }
        final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI = liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI;
        if (ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll == 14) {
            final long n = ilIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII[ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl];
            for (int n2 = byteBuffer.limit() / 4, n3 = 12; n3 + 1 < n2; n3 += 14) {
                final int n4 = (int)n;
                final int n5 = (int)(n >> 32);
                byteBuffer.putInt(n3 * 4, n4);
                byteBuffer.putInt((n3 + 1) * 4, n5);
            }
        }
    }
    
    public static void IllIIlllIIIIlllIIlIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI = liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI;
        if (ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll == 14 && liIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl == 7 && liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI % 4 == 0) {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl() - 4 * ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final int n) {
        final FloatBuffer ilIlIlIlIlllllllllIl = liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl;
        final IntBuffer llllIIIIlIIIlIlllIll = liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll;
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl();
        final float value = ilIlIlIlIlllllllllIl.get(n + 0 * this.llllIIIIlIIIlIlllIll);
        final float value2 = ilIlIlIlIlllllllllIl.get(n + 0 * this.llllIIIIlIIIlIlllIll + 1);
        final float value3 = ilIlIlIlIlllllllllIl.get(n + 0 * this.llllIIIIlIIIlIlllIll + 2);
        final float value4 = ilIlIlIlIlllllllllIl.get(n + 0 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI);
        final float value5 = ilIlIlIlIlllllllllIl.get(n + 0 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI + 1);
        final float value6 = ilIlIlIlIlllllllllIl.get(n + 1 * this.llllIIIIlIIIlIlllIll);
        final float value7 = ilIlIlIlIlllllllllIl.get(n + 1 * this.llllIIIIlIIIlIlllIll + 1);
        final float value8 = ilIlIlIlIlllllllllIl.get(n + 1 * this.llllIIIIlIIIlIlllIll + 2);
        final float value9 = ilIlIlIlIlllllllllIl.get(n + 1 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI);
        final float value10 = ilIlIlIlIlllllllllIl.get(n + 1 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI + 1);
        final float value11 = ilIlIlIlIlllllllllIl.get(n + 2 * this.llllIIIIlIIIlIlllIll);
        final float value12 = ilIlIlIlIlllllllllIl.get(n + 2 * this.llllIIIIlIIIlIlllIll + 1);
        final float value13 = ilIlIlIlIlllllllllIl.get(n + 2 * this.llllIIIIlIIIlIlllIll + 2);
        final float value14 = ilIlIlIlIlllllllllIl.get(n + 2 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI);
        final float value15 = ilIlIlIlIlllllllllIl.get(n + 2 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI + 1);
        final float value16 = ilIlIlIlIlllllllllIl.get(n + 3 * this.llllIIIIlIIIlIlllIll);
        final float value17 = ilIlIlIlIlllllllllIl.get(n + 3 * this.llllIIIIlIIIlIlllIll + 1);
        final float value18 = ilIlIlIlIlllllllllIl.get(n + 3 * this.llllIIIIlIIIlIlllIll + 2);
        final float value19 = ilIlIlIlIlllllllllIl.get(n + 3 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI);
        final float value20 = ilIlIlIlIlllllllllIl.get(n + 3 * this.llllIIIIlIIIlIlllIll + this.llIllIIIIIllIlIIIIlI + 1);
        final float n2 = value11 - value;
        final float n3 = value12 - value2;
        final float n4 = value13 - value3;
        final float n5 = value16 - value6;
        final float n6 = value17 - value7;
        final float n7 = value18 - value8;
        final float n8 = n3 * n7 - n6 * n4;
        final float n9 = n4 * n5 - n7 * n2;
        final float n10 = n2 * n6 - n5 * n3;
        final float n11 = n8 * n8 + n9 * n9 + n10 * n10;
        final float n12 = (n11 != 0.0) ? ((float)(1.0 / Math.sqrt(n11))) : 1.0f;
        final float n13 = n8 * n12;
        final float n14 = n9 * n12;
        final float n15 = n10 * n12;
        final float n16 = value6 - value;
        final float n17 = value7 - value2;
        final float n18 = value8 - value3;
        final float n19 = value9 - value4;
        final float n20 = value10 - value5;
        final float n21 = value11 - value;
        final float n22 = value12 - value2;
        final float n23 = value13 - value3;
        final float n24 = value14 - value4;
        final float n25 = value15 - value5;
        final float n26 = n19 * n25 - n24 * n20;
        final float n27 = (n26 != 0.0f) ? (1.0f / n26) : 1.0f;
        final float n28 = (n25 * n16 - n20 * n21) * n27;
        final float n29 = (n25 * n17 - n20 * n22) * n27;
        final float n30 = (n25 * n18 - n20 * n23) * n27;
        final float n31 = (n19 * n21 - n24 * n16) * n27;
        final float n32 = (n19 * n22 - n24 * n17) * n27;
        final float n33 = (n19 * n23 - n24 * n18) * n27;
        final float n34 = n28 * n28 + n29 * n29 + n30 * n30;
        final float n35 = (n34 != 0.0) ? ((float)(1.0 / Math.sqrt(n34))) : 1.0f;
        final float n36 = n28 * n35;
        final float n37 = n29 * n35;
        final float n38 = n30 * n35;
        final float n39 = n31 * n31 + n32 * n32 + n33 * n33;
        final float n40 = (n39 != 0.0) ? ((float)(1.0 / Math.sqrt(n39))) : 1.0f;
        final float n41 = (n31 * n40 * (n15 * n37 - n14 * n38) + n32 * n40 * (n13 * n38 - n15 * n36) + n33 * n40 * (n14 * n36 - n13 * n37) < 0.0f) ? -1.0f : 1.0f;
        final int n42 = (((int)(n15 * 127.0f) & 0xFF) << 16) + (((int)(n14 * 127.0f) & 0xFF) << 8) + ((int)(n13 * 127.0f) & 0xFF);
        llllIIIIlIIIlIlllIll.put(n + 0 * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl, n42);
        llllIIIIlIIIlIlllIll.put(n + 1 * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl, n42);
        llllIIIIlIIIlIlllIll.put(n + 2 * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl, n42);
        llllIIIIlIIIlIlllIll.put(n + 3 * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl, n42);
        final int n43 = ((int)(n36 * 32767.0f) & 0xFFFF) + (((int)(n37 * 32767.0f) & 0xFFFF) << 16);
        final int n44 = ((int)(n38 * 32767.0f) & 0xFFFF) + (((int)(n41 * 32767.0f) & 0xFFFF) << 16);
        llllIIIIlIIIlIlllIll.put(n + 0 * this.llllIIIIlIIIlIlllIll + 10, n43);
        llllIIIIlIIIlIlllIll.put(n + 0 * this.llllIIIIlIIIlIlllIll + 10 + 1, n44);
        llllIIIIlIIIlIlllIll.put(n + 1 * this.llllIIIIlIIIlIlllIll + 10, n43);
        llllIIIIlIIIlIlllIll.put(n + 1 * this.llllIIIIlIIIlIlllIll + 10 + 1, n44);
        llllIIIIlIIIlIlllIll.put(n + 2 * this.llllIIIIlIIIlIlllIll + 10, n43);
        llllIIIIlIIIlIlllIll.put(n + 2 * this.llllIIIIlIIIlIlllIll + 10 + 1, n44);
        llllIIIIlIIIlIlllIll.put(n + 3 * this.llllIIIIlIIIlIlllIll + 10, n43);
        llllIIIIlIIIlIlllIll.put(n + 3 * this.llllIIIIlIIIlIlllIll + 10 + 1, n44);
        final float n45 = (value4 + value9 + value14 + value19) / 4.0f;
        final float n46 = (value5 + value10 + value15 + value20) / 4.0f;
        ilIlIlIlIlllllllllIl.put(n + 0 * this.llllIIIIlIIIlIlllIll + 8, n45);
        ilIlIlIlIlllllllllIl.put(n + 0 * this.llllIIIIlIIIlIlllIll + 8 + 1, n46);
        ilIlIlIlIlllllllllIl.put(n + 1 * this.llllIIIIlIIIlIlllIll + 8, n45);
        ilIlIlIlIlllllllllIl.put(n + 1 * this.llllIIIIlIIIlIlllIll + 8 + 1, n46);
        ilIlIlIlIlllllllllIl.put(n + 2 * this.llllIIIIlIIIlIlllIll + 8, n45);
        ilIlIlIlIlllllllllIl.put(n + 2 * this.llllIIIIlIIIlIlllIll + 8 + 1, n46);
        ilIlIlIlIlllllllllIl.put(n + 3 * this.llllIIIIlIIIlIlllIll + 8, n45);
        ilIlIlIlIlllllllllIl.put(n + 3 * this.llllIIIIlIIIlIlllIll + 8 + 1, n46);
    }
    
    public static void llllIIIlIlllIlIIIIIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        if (liIllIIIllllIlllIllI.lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl() && liIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl == 7 && liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI % 4 == 0) {
            final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI = liIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI;
            llIllIIIIIllIlIIIIlI(liIllIIIllllIlllIllI);
            for (int n = liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI * ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, i = 0; i < n; i += ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll * 4) {
                ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, i);
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        if (n3 != 0) {
            final int llllIIIlIlllIlIIIIIl = liIllIIIllllIlllIllI.lIIIIlIIIIIlllIllIII().llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl == 56) {
                final ByteBuffer llllIIIlIlllIlIIIIIl2 = liIllIIIllllIlllIllI.llllIIIlIlllIlIIIIIl();
                llllIIIlIlllIlIIIIIl2.position(32);
                GL20.glVertexAttribPointer(llIIlllIIlllIIllIllI.llIllIIlllllllllllll, 2, 5126, false, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                llllIIIlIlllIlIIIIIl2.position(40);
                GL20.glVertexAttribPointer(llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI, 4, 5122, false, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                llllIIIlIlllIlIIIIIl2.position(48);
                GL20.glVertexAttribPointer(llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII, 3, 5122, false, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                llllIIIlIlllIlIIIIIl2.position(0);
                GL20.glEnableVertexAttribArray(llIIlllIIlllIIllIllI.llIllIIlllllllllllll);
                GL20.glEnableVertexAttribArray(llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI);
                GL20.glEnableVertexAttribArray(llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n, n2, n3);
                GL20.glDisableVertexAttribArray(llIIlllIIlllIIllIllI.llIllIIlllllllllllll);
                GL20.glDisableVertexAttribArray(llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI);
                GL20.glDisableVertexAttribArray(llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII);
            }
            else {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n, n2, n3);
            }
        }
    }
}
