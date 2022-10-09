package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class bp extends IIlIIIIlllIlllllIlII implements dt
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    public static final IllIIlllIIIIlllIIlIl IIllllIIIlIIIIIIllIl;
    private static volatile /* synthetic */ int[] IlllIIIIlIIIlIlIlIIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("type", aa.class);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("stage", 0, 1);
    }
    
    protected bp() {
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(bp.IIIIIIIIIlllIllIlIlI, aa.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(bp.IIllllIIIlIIIIIIllIl, 0));
        final float n = 0.4f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, n * 2.0f, 0.5f + n);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(this.lIllllllIIllIlIlIlII()) + "." + aa.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl() + ".name");
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            super.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
            if (illlllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) >= 9 && random.nextInt(7) == 0) {
                this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
            }
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if ((int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bp.IIllllIIIlIIIIIIllIl) == 0) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(bp.IIllllIIIlIIIIIIllIl), 4);
        }
        else {
            this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
        }
    }
    
    public void IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (random.nextInt(10) == 0) ? new llIllIIIIIllIlIIIIlI(true) : new IIIIIIIIIlllIllIlIlI(true);
        int i = 0;
        int j = 0;
        int n = 0;
        switch (IllIllIIIIlIIlIlllII()[((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bp.IIIIIIIIIlllIllIlIlI)).ordinal()]) {
            case 2: {
            Label_0163:
                for (i = 0; i >= -1; --i) {
                    for (j = 0; j >= -1; --j) {
                        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, i, j, aa.IlIlIlIlIlllllllllIl)) {
                            llllIIIIlIIIlIlllIll = new IIIlIIlIIIIlllIlllII(false, random.nextBoolean());
                            n = 1;
                            break Label_0163;
                        }
                    }
                }
                if (n == 0) {
                    j = 0;
                    i = 0;
                    llllIIIIlIIIlIlllIll = new IlIIIlIIIllllIlIlIlI(true);
                    break;
                }
                break;
            }
            case 3: {
                llllIIIIlIIIlIlllIll = new llllIIllllIlIlIIIIll(true, false);
                break;
            }
            case 4: {
                final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.IlIIIlIlIIIllIlIlIIl);
                final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll3 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
            Label_0321:
                for (i = 0; i >= -1; --i) {
                    for (j = 0; j >= -1; --j) {
                        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, i, j, aa.IlIIIlIlIIIllIlIlIIl)) {
                            llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII(true, 10, 20, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3);
                            n = 1;
                            break Label_0321;
                        }
                    }
                }
                if (n == 0) {
                    j = 0;
                    i = 0;
                    llllIIIIlIIIlIlllIll = new IIIIIIIIIlllIllIlIlI(true, 4 + random.nextInt(7), llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3, false);
                    break;
                }
                break;
            }
            case 5: {
                llllIIIIlIIIlIlllIll = new llIIlllIIlllIIllIllI(true);
                break;
            }
            case 6: {
            Label_0434:
                for (i = 0; i >= -1; --i) {
                    for (j = 0; j >= -1; --j) {
                        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, i, j, aa.IllIIlllIIIIlllIIlIl)) {
                            llllIIIIlIIIlIlllIll = new llllIIIlIlllIlIIIIIl(true);
                            n = 1;
                            break Label_0434;
                        }
                    }
                }
                if (n == 0) {
                    return;
                }
                break;
            }
        }
        final llIIlIIIlIIIllIlIIIl lllIllIIIllllllIllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        if (n != 0) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j), lllIllIIIllllllIllll, 4);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i + 1, 0, j), lllIllIIIllllllIllll, 4);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j + 1), lllIllIIIllllllIllll, 4);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i + 1, 0, j + 1), lllIllIIIllllllIllll, 4);
        }
        else {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, 4);
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j))) {
            if (n != 0) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j), llIIlIIIlIIIllIlIIIl, 4);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i + 1, 0, j), llIIlIIIlIIIllIlIIIl, 4);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j + 1), llIIlIIIlIIIllIlIIIl, 4);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i + 1, 0, j + 1), llIIlIIIlIIIllIlIIIl, 4);
            }
            else {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 4);
            }
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final aa aa) {
        return this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, 0, n2), aa) && this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n + 1, 0, n2), aa) && this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, 0, n2 + 1), aa) && this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n + 1, 0, n2 + 1), aa);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final aa aa) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(bp.IIIIIIIIIlllIllIlIlI) == aa;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bp.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        aa[] values;
        for (int length = (values = aa.values()).length, i = 0; i < length; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, values[i].IlIlIlIlIlllllllllIl()));
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() < 0.45;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bp.IIIIIIIIIlllIllIlIlI, aa.llllIIIIlIIIlIlllIll(n & 0x7)).llllIIIIlIIIlIlllIll(bp.IIllllIIIlIIIIIIllIl, (n & 0x8) >> 3);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 0x0 | ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bp.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl() | (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bp.IIllllIIIlIIIIIIllIl) << 3;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { bp.IIIIIIIIIlllIllIlIlI, bp.IIllllIIIlIIIIIIllIl });
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] illlIIIIlIIIlIlIlIIl = bp.IlllIIIIlIIIlIlIlIIl;
        if (illlIIIIlIIIlIlIlIIl != null) {
            return illlIIIIlIIIlIlIlIIl;
        }
        final int[] illlIIIIlIIIlIlIlIIl2 = new int[aa.values().length];
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return bp.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl2;
    }
}
