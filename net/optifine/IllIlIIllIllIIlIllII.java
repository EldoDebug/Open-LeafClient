package net.optifine;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IllIlIIllIllIIlIllII
{
    private IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    private float[][] IlIlIlIlIlllllllllIl;
    private float[][] llIllIIIIIllIlIIIIlI;
    
    public IllIlIIllIllIIlIllII(final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = new float[16][3];
        this.llIllIIIIIllIlIIIIlI = new float[16][3];
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final int[] array, final boolean b) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        final int illIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
        if (b && illIIlllIIIIlllIIlIl < 64) {
            return false;
        }
        final int ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI < 16) {
            IlIlIlIlIlllllllllIl("Invalid lightmap width: " + ilIlIIIllIllIIIIIllI);
            this.llllIIIIlIIIlIlllIll = null;
            return false;
        }
        int n2 = 0;
        if (b) {
            n2 = ilIlIIIllIllIIIIIllI * 16 * 2;
        }
        float n3 = 1.1666666f * (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(1.0f) - 0.2f);
        if (illlllllIIIlIIIlIlII.IIlIlIlIIlIllIIIIIIl() > 0) {
            n3 = 1.0f;
        }
        final float n4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n3) * (ilIlIIIllIllIIIIIllI - 1);
        final float n5 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n + 0.5f) * (ilIlIIIllIllIIIIIllI - 1);
        final float llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().IIIIIlllIlIIIIIIIllI);
        final boolean b2 = llllIIIIlIIIlIlllIll > 1.0E-4f;
        final float[][] ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n4, n2, ilIlIIIllIllIIIIIllI, this.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n5, n2 + 16 * ilIlIIIllIllIIIIIllI, ilIlIIIllIllIIIIIllI, this.llIllIIIIIllIlIIIIlI);
        final float[] array2 = new float[3];
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 3; ++k) {
                    float llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl[i][k] + this.llIllIIIIIllIlIIIIlI[j][k]);
                    if (b2) {
                        final float n6 = 1.0f - llllIIIIlIIIlIlllIll2;
                        llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll * (1.0f - n6 * n6 * n6 * n6) + (1.0f - llllIIIIlIIIlIlllIll) * llllIIIIlIIIlIlllIll2;
                    }
                    array2[k] = llllIIIIlIIIlIlllIll2;
                }
                array[i * 16 + j] = (0xFF000000 | (int)(array2[0] * 255.0f) << 16 | (int)(array2[1] * 255.0f) << 8 | (int)(array2[2] * 255.0f));
            }
        }
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final float[][] array, final float n, final int n2, final int n3, final float[][] array2) {
        final int n4 = (int)Math.floor(n);
        final int n5 = (int)Math.ceil(n);
        if (n4 == n5) {
            for (int i = 0; i < 16; ++i) {
                final float[] array3 = array[n2 + i * n3 + n4];
                final float[] array4 = array2[i];
                for (int j = 0; j < 3; ++j) {
                    array4[j] = array3[j];
                }
            }
        }
        else {
            final float n6 = 1.0f - (n - n4);
            final float n7 = 1.0f - (n5 - n);
            for (int k = 0; k < 16; ++k) {
                final float[] array5 = array[n2 + k * n3 + n4];
                final float[] array6 = array[n2 + k * n3 + n5];
                final float[] array7 = array2[k];
                for (int l = 0; l < 3; ++l) {
                    array7[l] = array5[l] * n6 + array6[l] * n7;
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s) {
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomColors: " + s);
    }
    
    private static void IlIlIlIlIlllllllllIl(final String s) {
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomColors: " + s);
    }
}
