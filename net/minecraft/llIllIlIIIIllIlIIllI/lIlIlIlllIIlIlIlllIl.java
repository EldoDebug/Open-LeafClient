package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIlIlIlllIIlIlIlllIl extends IlIIIlIlIIIllIlIlIIl
{
    public lIlIlIlllIIlIlIlllIl() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + 0.5, llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() + 0.5, llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + 0.5, "item.fireCharge.use", 1.0f, (lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI.nextFloat() - lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI.nextFloat()) * 0.2f + 1.0f);
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
        }
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        }
        return true;
    }
}
