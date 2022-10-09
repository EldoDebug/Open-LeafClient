package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIIIIIllllIlIIIIIII extends lIllIIIIIlllIIlIIllI
{
    private llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private llllIIIIlIIIlIlllIll lIIIlllIIIllIIIllIII;
    
    public IIIIIIIllllIlIIIIIII(final int n, final float n2, final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII, final llllIIIIlIIIlIlllIll liiIlllIIIllIIIllIII) {
        super(n, n2, false);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            return false;
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == this.lIIIlllIIIllIIIllIII && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll())) {
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), this.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            return true;
        }
        return false;
    }
}
