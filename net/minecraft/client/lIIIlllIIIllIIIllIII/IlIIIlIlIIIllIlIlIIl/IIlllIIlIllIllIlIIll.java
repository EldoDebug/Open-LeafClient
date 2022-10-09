package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import leaf.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class IIlllIIlIllIllIlIIll extends llIllIIIIIllIlIIIIlI
{
    private final IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll;
    private Random IlIlIIIllIllIIIIIllI;
    
    public IIlllIIlIllIllIlIIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll) {
        super(lllIllIIIllllllIllll);
        this.IlIlIIIllIllIIIIIllI = new Random();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = 0.15f;
        this.IlIIIlIlIIIllIlIlIIl = 0.75f;
    }
    
    private int llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final double n, final double n2, final double n3, final float n4, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
        if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == null) {
            return 0;
        }
        final boolean llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((liiIlllIIIllIIIllIII.llllIIllllIlIlIIIIll() + n4) / 10.0f + liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll) * 0.1f + 0.1f) + 0.25f * ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl(IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl).IlIIIlIlIIIllIlIlIIl.y, (float)n3);
        if (llIllIIIIIllIlIIIIlI || this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl != null) {
            if (Leaf.instance.modManager.item) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
            }
            else {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(((liiIlllIIIllIIIllIII.llllIIllllIlIlIIIIll() + n4) / 20.0f + liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll) * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
        }
        if (!llIllIIIIIllIlIIIIlI) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.0f * (llllIIIIlIIIlIlllIll - 1) * 0.5f, -0.0f * (llllIIIIlIIIlIlllIll - 1) * 0.5f, -0.046875f * (llllIIIIlIIIlIlllIll - 1) * 0.5f);
        }
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        return llllIIIIlIIIlIlllIll;
    }
    
    private int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        int n = 1;
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 48) {
            n = 5;
        }
        else if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 32) {
            n = 4;
        }
        else if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 16) {
            n = 3;
        }
        else if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 1) {
            n = 2;
        }
        return n;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final double n, final double n2, final double n3, final float n4, final float n5) {
        final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
        this.IlIlIIIllIllIIIIIllI.setSeed(187L);
        boolean b = false;
        if (this.llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII)) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII)).IlIlIlIlIlllllllllIl(false, false);
            b = true;
        }
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        for (int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, n, n2, n3, n5, llllIIIIlIIIlIlllIll), i = 0; i < llllIIIIlIIIlIlllIll2; ++i) {
            if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                if (i > 0) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((this.IlIlIIIllIllIIIIIllI.nextFloat() * 2.0f - 1.0f) * 0.15f, (this.IlIlIIIllIllIIIIIllI.nextFloat() * 2.0f - 1.0f) * 0.15f, (this.IlIlIIIllIllIIIIIllI.nextFloat() * 2.0f - 1.0f) * 0.15f);
                }
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.5f, 0.5f, 0.5f);
                llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl);
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, llllIIIIlIIIlIlllIll);
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            else {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl);
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, llllIIIIlIIIlIlllIll);
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f * llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl.x, 0.0f * llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl.y, 0.046875f * llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl.z);
            }
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        this.llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII);
        if (b) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII)).IlIlIIIllIllIIIIIllI();
        }
        super.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        return IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
    }
}
