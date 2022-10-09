package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlllIIIIlIIIlIlIlIIl extends IIIllllllIllIIIlllIl
{
    private int IIIIIIIllllIlIIIIIII;
    private final net.minecraft.client.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI IIlllIIIllIllIIlIlIl;
    private IlIlIIIlIIlIlIIlllIl llIlllIlllllIIllIIII;
    boolean llllIIIIlIIIlIlllIll;
    
    public IlllIIIIlIIIlIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double lIllllllIIllIlIlIlII, final double llIIlllIIlllIIllIllI, final double iIlllIIIlIlllIIlllII, final net.minecraft.client.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI iIlllIIIllIllIIlIlIl, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        this.IIlllIIIllIllIIlIlIl = iIlllIIIllIllIIlIlIl;
        this.llllIIIlIlllIlIIIIIl = 8;
        if (iiiIlllIIIIIIlIIIlll != null) {
            this.llIlllIlllllIIllIIII = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Explosions", 10);
            if (this.llIlllIlllllIIllIIII.IlIlIIIllIllIIIIIllI() == 0) {
                this.llIlllIlllllIIllIIII = null;
            }
            else {
                this.llllIIIlIlllIlIIIIIl = this.llIlllIlllllIIllIIII.IlIlIIIllIllIIIIIllI() * 2 - 1;
                for (int i = 0; i < this.llIlllIlllllIIllIIII.IlIlIIIllIllIIIIIllI(); ++i) {
                    if (this.llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl(i).IIIIlllIIIIIIlIIIlll("Flicker")) {
                        this.llllIIIIlIIIlIlllIll = true;
                        this.llllIIIlIlllIlIIIIIl += 15;
                        break;
                    }
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (this.IIIIIIIllllIlIIIIIII == 0 && this.llIlllIlllllIIllIIII != null) {
            final boolean llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
            boolean b = false;
            if (this.llIlllIlllllIIllIIII.IlIlIIIllIllIIIIIllI() >= 3) {
                b = true;
            }
            else {
                for (int i = 0; i < this.llIlllIlllllIIllIIII.IlIlIIIllIllIIIIIllI(); ++i) {
                    if (this.llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl(i).IlIIIlIlIIIllIlIlIIl("Type") == 1) {
                        b = true;
                        break;
                    }
                }
            }
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, "fireworks." + (b ? "largeBlast" : "blast") + (llllIIllllIlIlIIIIll ? "_far" : ""), 20.0f, 0.95f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.1f, true);
        }
        if (this.IIIIIIIllllIlIIIIIII % 2 == 0 && this.llIlllIlllllIIllIIII != null && this.IIIIIIIllllIlIIIIIII / 2 < this.llIlllIlllllIIllIIII.IlIlIIIllIllIIIIIllI()) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = this.llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl(this.IIIIIIIllllIlIIIIIII / 2);
            final byte ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Type");
            final boolean iiiIlllIIIIIIlIIIlll = ilIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("Trail");
            final boolean iiiIlllIIIIIIlIIIlll2 = ilIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("Flicker");
            int[] lIlIlIIIllIIllIIIllI = ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI("Colors");
            final int[] lIlIlIIIllIIllIIIllI2 = ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI("FadeColors");
            if (lIlIlIIIllIIllIIIllI.length == 0) {
                lIlIlIIIllIIllIIIllI = new int[] { net.minecraft.llIllIlIIIIllIlIIllI.IllIllIIIIlIIlIlllII.llllIIIlIlllIlIIIIIl[0] };
            }
            if (ilIIIlIlIIIllIlIlIIl == 1) {
                this.llllIIIIlIIIlIlllIll(0.5, 4, lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI2, iiiIlllIIIIIIlIIIlll, iiiIlllIIIIIIlIIIlll2);
            }
            else if (ilIIIlIlIIIllIlIlIIl == 2) {
                this.llllIIIIlIIIlIlllIll(0.5, new double[][] { { 0.0, 1.0 }, { 0.3455, 0.309 }, { 0.9511, 0.309 }, { 0.3795918367346939, -0.12653061224489795 }, { 0.6122448979591837, -0.8040816326530612 }, { 0.0, -0.35918367346938773 } }, lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI2, iiiIlllIIIIIIlIIIlll, iiiIlllIIIIIIlIIIlll2, false);
            }
            else if (ilIIIlIlIIIllIlIlIIl == 3) {
                this.llllIIIIlIIIlIlllIll(0.5, new double[][] { { 0.0, 0.2 }, { 0.2, 0.2 }, { 0.2, 0.6 }, { 0.6, 0.6 }, { 0.6, 0.2 }, { 0.2, 0.2 }, { 0.2, 0.0 }, { 0.4, 0.0 }, { 0.4, -0.6 }, { 0.2, -0.6 }, { 0.2, -0.4 }, { 0.0, -0.4 } }, lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI2, iiiIlllIIIIIIlIIIlll, iiiIlllIIIIIIlIIIlll2, true);
            }
            else if (ilIIIlIlIIIllIlIlIIl == 4) {
                this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI2, iiiIlllIIIIIIlIIIlll, iiiIlllIIIIIIlIIIlll2);
            }
            else {
                this.llllIIIIlIIIlIlllIll(0.25, 2, lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI2, iiiIlllIIIIIIlIIIlll, iiiIlllIIIIIIlIIIlll2);
            }
            final int n = lIlIlIIIllIIllIIIllI[0];
            final float n2 = ((n & 0xFF0000) >> 16) / 255.0f;
            final float n3 = ((n & 0xFF00) >> 8) / 255.0f;
            final float n4 = ((n & 0xFF) >> 0) / 255.0f;
            final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = new IIIIIIIIIlllIllIlIlI(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
            iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll(n2, n3, n4);
            this.IIlllIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll(iiiiiiiiIlllIllIlIlI);
        }
        ++this.IIIIIIIllllIlIIIIIII;
        if (this.IIIIIIIllllIlIIIIIII > this.llllIIIlIlllIlIIIIIl) {
            if (this.llllIIIIlIIIlIlllIll) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, "fireworks." + (this.llllIIllllIlIlIIIIll() ? "twinkle_far" : "twinkle"), 20.0f, 0.9f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.15f, true);
            }
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    private boolean llllIIllllIlIlIIIIll() {
        final Minecraft minecraft = Minecraft.getMinecraft();
        return minecraft == null || minecraft.lIIIIlIlIllllIIlIllI() == null || minecraft.lIIIIlIlIllllIIlIllI().IlIlIIIllIllIIIIIllI(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII) >= 256.0;
    }
    
    private void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int[] array, final int[] array2, final boolean b, final boolean b2) {
        final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = new IIllllIIIlIIIIIIllIl(this.IlllllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6, this.IIlllIIIllIllIIlIlIl);
        illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl(0.99f);
        illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(b);
        illllIIIlIIIIIIllIl.IlIlIlIlIlllllllllIl(b2);
        illllIIIlIIIIIIllIl.IlIlIlIlIlllllllllIl(array[this.IlIIllIIllIIllIIlIIl.nextInt(array.length)]);
        if (array2 != null && array2.length > 0) {
            illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI(array2[this.IlIIllIIllIIllIIlIIl.nextInt(array2.length)]);
        }
        this.IIlllIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll(illllIIIlIIIIIIllIl);
    }
    
    private void llllIIIIlIIIlIlllIll(final double n, final int n2, final int[] array, final int[] array2, final boolean b, final boolean b2) {
        final double iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl;
        final double llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII;
        final double lllllIlIIIlIlIIlllII = this.lllllIlIIIlIlIIlllII;
        for (int i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    final double n3 = j + (this.IlIIllIIllIIllIIlIIl.nextDouble() - this.IlIIllIIllIIllIIlIIl.nextDouble()) * 0.5;
                    final double n4 = i + (this.IlIIllIIllIIllIIlIIl.nextDouble() - this.IlIIllIIllIIllIIlIIl.nextDouble()) * 0.5;
                    final double n5 = k + (this.IlIIllIIllIIllIIlIIl.nextDouble() - this.IlIIllIIllIIllIIlIIl.nextDouble()) * 0.5;
                    final double n6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * n3 + n4 * n4 + n5 * n5) / n + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.05;
                    this.llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl, llIIIlIlIllIIlIlIlII, lllllIlIIIlIlIIlllII, n3 / n6, n4 / n6, n5 / n6, array, array2, b, b2);
                    if (i != -n2 && i != n2 && j != -n2 && j != n2) {
                        k += n2 * 2 - 1;
                    }
                }
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final double n, final double[][] array, final int[] array2, final int[] array3, final boolean b, final boolean b2, final boolean b3) {
        final double n2 = array[0][0];
        final double n3 = array[0][1];
        this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, n2 * n, n3 * n, 0.0, array2, array3, b, b2);
        final float n4 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.1415927f;
        final double n5 = b3 ? 0.034 : 0.34;
        for (int i = 0; i < 3; ++i) {
            final double n6 = n4 + i * 3.1415927f * n5;
            double n7 = n2;
            double n8 = n3;
            for (int j = 1; j < array.length; ++j) {
                final double n9 = array[j][0];
                final double n10 = array[j][1];
                for (double n11 = 0.25; n11 <= 1.0; n11 += 0.25) {
                    final double n12 = (n7 + (n9 - n7) * n11) * n;
                    final double n13 = (n8 + (n10 - n8) * n11) * n;
                    final double n14 = n12 * Math.sin(n6);
                    final double n15 = n12 * Math.cos(n6);
                    for (double n16 = -1.0; n16 <= 1.0; n16 += 2.0) {
                        this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, n15 * n16, n13, n14 * n16, array2, array3, b, b2);
                    }
                }
                n7 = n9;
                n8 = n10;
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int[] array, final int[] array2, final boolean b, final boolean b2) {
        final double n = this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.05;
        final double n2 = this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.05;
        for (int i = 0; i < 70; ++i) {
            this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.lIllllllIIllIlIlIlII * 0.5 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.15 + n, this.llIIlllIIlllIIllIllI * 0.5 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.5, this.IIlllIIIlIlllIIlllII * 0.5 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.15 + n2, array, array2, b, b2);
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 0;
    }
}
