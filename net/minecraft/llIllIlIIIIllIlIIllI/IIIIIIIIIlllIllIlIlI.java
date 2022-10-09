package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class IIIIIIIIIlllIllIlIlI extends IlIIIlIlIIIllIlIlIIl
{
    public IIIIIIIIIlllIllIlIlI() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        this.IlIlIlIlIlllllllllIl(1);
        this.IlIIIlIlIIIllIlIlIIl(25);
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return true;
    }
    
    @Override
    public boolean llllIIIlIlllIlIIIIIl() {
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII() && llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll instanceof llIllIlIIIIllIlIIllI) {
            final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll;
            if (llIllIlIIIIllIlIIllI.ar().llIIlIIIlIIIllIlIIIl() && lllIIIIlIlIllIIlIIIl.lIIIlllIIIllIIIllIII() - lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() >= 7) {
                llIllIlIIIIllIlIIllI.ar().lIIIlllIIIllIIIllIII();
                lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(7, llllIIIIlIIIlIlllIll);
                if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll);
                    lllIIIIlIlIllIIlIIIl2.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll());
                    return lllIIIIlIlIllIIlIIIl2;
                }
            }
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
}
