package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import java.util.*;

public class IIlIIIIlllIlllllIlII extends lIllIIIIIlllIIlIIllI
{
    public IIlIIIIlllIlllllIlII(final int n, final float n2, final boolean b) {
        super(n, n2, b);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public boolean lIIIIlIIIIIlllIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() > 0;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 0) ? net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI : net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    protected void IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.llllllIllIllIlIllllI, 2400, 0));
        }
        if (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() > 0) {
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllllIllIllIlIllllI, 600, 4));
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllllIllIllIlIllllI, 6000, 0));
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllllIllIllIlIllllI, 6000, 0));
            }
        }
        else {
            super.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 0));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 1));
    }
}
