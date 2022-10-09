package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lllllIIllIlIllIllllI extends IlIIIlIlIIIllIlIlIIl
{
    public lllllIIllIlIllIllllI() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (!lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
            return false;
        }
        if (lllIIIIlllllIlIIllIl instanceof IlIllIlIlIIIlIlIlIII) {
            final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)lllIIIIlllllIlIIllIl;
            ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
            ilIllIlIlIIIlIlIlIII.p();
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            return true;
        }
        return super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll, lllIIIIlllllIlIIllIl);
    }
}
