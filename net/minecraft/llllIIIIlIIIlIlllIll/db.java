package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class db extends llllIIIIlIIIlIlllIll
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("explode");
    }
    
    public db() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, false));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        super.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        if (illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl)) {
            this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, true));
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl)) {
            this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, true));
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = new IIIlIIIlIlIIlllIIlll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI());
            iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll / 4) + iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll / 8;
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, (lllIIIIlllllIlIIllIl)null);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI)) {
            final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = new IIIlIIIlIlIIlllIIlll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, lllIIIIlllllIlIIllIl);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, "game.tnt.primed", 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (llllIIIIlIIIlIlllIll.p() != null) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl || llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.P) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, true), (lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll);
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl) {
                    llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll);
                }
                else if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    final lllIIIIlIlIllIIlIIIl p8 = llllIIIIlIIIlIlllIll.p();
                    --p8.IlIlIlIlIlllllllllIl;
                }
                return true;
            }
        }
        return super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll, n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI;
            if (llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl()) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, true), (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) ? ((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) : null);
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return false;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, (n & 0x1) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI)) ? 1 : 0;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { db.IIIIIIIIIlllIllIlIlI });
    }
}
