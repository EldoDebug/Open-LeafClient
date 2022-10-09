package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIllIIllIIIIIIlIIlI extends IlIIIlIlIIIllIlIlIIl
{
    public IIIllIIllIIIIIIlIIlI() {
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (lllIIIIlllllIlIIllIl instanceof llIllIlIIIIllIlIIllI) {
            final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)lllIIIIlllllIlIIllIl;
            if (!llIllIlIIIIllIlIIllI.aq() && !llIllIlIIIIllIlIIllI.e_()) {
                llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI(true);
                llIllIlIIIIllIlIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, "mob.horse.leather", 0.5f, 1.0f);
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, null, lllIIIIlllllIlIIllIl);
        return true;
    }
}
