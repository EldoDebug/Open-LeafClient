package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class IIlIlIllllIlllIIIIll extends IlIIIlIlIIIllIlIlIIl
{
    private static final llIllIIIIIllIlIIIIlI llllIIIlIlllIlIIIIIl;
    private final lIlIlIIIllIIllIIIllI lIIIIlIIIIIlllIllIII;
    
    static {
        llllIIIlIlllIlIIIIIl = new lIIllIIIllllIlllIllI();
    }
    
    public IIlIlIllllIlllIIIIll(final lIlIlIIIllIIllIIIllI liiiIlIIIIIlllIllIII) {
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        IllIllIlllIllllIIllI.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this, IIlIlIllllIlllIIIIll.llllIIIlIlllIlIIIIIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ao.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl2)) {
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                final ap ap = (ap)((ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() instanceof ao) ? ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(((ao)ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI()).IllIllIIIIlIIlIlllII()) : net.minecraft.llllIIIIlIIIlIlllIll.ap.llllIIIIlIIIlIlllIll);
                double n4 = 0.0;
                if (ap.llIllIIIIIllIlIIIIlI()) {
                    n4 = 0.5;
                }
                final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.0625 + n4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, this.lIIIIlIIIIIlllIllIII);
                if (lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
                    llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
                }
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            }
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            return true;
        }
        return false;
    }
}
