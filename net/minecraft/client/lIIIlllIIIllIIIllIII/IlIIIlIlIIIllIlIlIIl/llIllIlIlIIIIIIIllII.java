package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;

public class llIllIlIlIIIIIIIllII extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    protected IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/minecart.png");
    }
    
    public llIllIlIlIIIIIIIllII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.llllIIIIlIIIlIlllIll = new IIlllIlIIllIlIlIlIIl();
        this.llIllIIIIIllIlIIIIlI = 0.5f;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, double n, double n2, double n3, float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.llIllIIIIIllIlIIIIlI(llIllIlIIIIllIlIIllI);
        final long n6 = llIllIlIIIIllIlIIllI.IlllIIIIlIIIlIlIlIIl() * 493286711L;
        final long n7 = n6 * n6 * 4392167121L + n6 * 98761L;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((((n7 >> 16 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f, (((n7 >> 20 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f, (((n7 >> 24 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f);
        final double n8 = llIllIlIIIIllIlIIllI.lIIlIIIlIllIlIllIIIl + (llIllIlIIIIllIlIIllI.IIlllIlIIllIlIlIlIIl - llIllIlIIIIllIlIIllI.lIIlIIIlIllIlIllIIIl) * n5;
        final double n9 = llIllIlIIIIllIlIIllI.IIlIIIlllIllIllIlIII + (llIllIlIIIIllIlIIllI.llIIIlIlIllIIlIlIlII - llIllIlIIIIllIlIIllI.IIlIIIlllIllIllIlIII) * n5;
        final double n10 = llIllIlIIIIllIlIIllI.lIlIlIlllIIlIlIlllIl + (llIllIlIIIIllIlIIllI.lllllIlIIIlIlIIlllII - llIllIlIIIIllIlIIllI.lIlIlIlllIIlIlIlllIl) * n5;
        final double n11 = 0.30000001192092896;
        final e llIllIlIIIIllIlIIllI2 = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI(n8, n9, n10);
        float n12 = llIllIlIIIIllIlIIllI.IlIIIlIIIllllIlIlIlI + (llIllIlIIIIllIlIIllI.llllllIllIllIlIllllI - llIllIlIIIIllIlIIllI.IlIIIlIIIllllIlIlIlI) * n5;
        if (llIllIlIIIIllIlIIllI2 != null) {
            e llllIIIIlIIIlIlllIll = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n8, n9, n10, n11);
            e llllIIIIlIIIlIlllIll2 = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n8, n9, n10, -n11);
            if (llllIIIIlIIIlIlllIll == null) {
                llllIIIIlIIIlIlllIll = llIllIlIIIIllIlIIllI2;
            }
            if (llllIIIIlIIIlIlllIll2 == null) {
                llllIIIIlIIIlIlllIll2 = llIllIlIIIIllIlIIllI2;
            }
            n += llIllIlIIIIllIlIIllI2.llllIIIIlIIIlIlllIll - n8;
            n2 += (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl) / 2.0 - n9;
            n3 += llIllIlIIIIllIlIIllI2.llIllIIIIIllIlIIIIlI - n10;
            final e ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(-llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, -llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, -llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
            if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() != 0.0) {
                final e llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
                n4 = (float)(Math.atan2(llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll) * 180.0 / 3.141592653589793);
                n12 = (float)(Math.atan(llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl) * 73.0);
            }
        }
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + 0.375f, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - n4, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n12, 0.0f, 0.0f, 1.0f);
        final float n13 = llIllIlIIIIllIlIIllI.lllIIIIlllllIlIIllIl() - n5;
        float n14 = llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll() - n5;
        if (n14 < 0.0f) {
            n14 = 0.0f;
        }
        if (n13 > 0.0f) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n13) * n13 * n14 / 10.0f * llIllIlIIIIllIlIIllI.IlIlIIIIIIlllIlIllIl(), 1.0f, 0.0f, 0.0f);
        }
        final int illlllllIIIlIIIlIlII = llIllIlIIIIllIlIIllI.IlllllllIIIlIIIlIlII();
        final llIIlIIIlIIIllIlIIIl iiIlIIIlIlIIlllIIlll = llIllIlIIIIllIlIIllI.IIIlIIIlIlIIlllIIlll();
        if (iiIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI().llIllIlIIIIllIlIIllI() != -1) {
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            this.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            final float n15 = 0.75f;
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n15, n15, n15);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, (illlllllIIIlIIIlIlII - 8) / 16.0f, 0.5f);
            this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, n5, iiIlIIIlIlIIlllIIlll);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.llIllIIIIIllIlIIIIlI(llIllIlIIIIllIlIIllI);
        }
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, -1.0f, 1.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        return llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI;
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final float n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, llIllIlIIIIllIlIIllI.b_(n));
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
}
