package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lIIlIIIIIIIlIIlIlIIl extends IIlIIIIlllIlllllIlII
{
    protected lIIlIIIIIIIlIIlIlIIl() {
        final float n = 0.5f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.015625f, 0.5f + n);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI == null || !(llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl)) {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.IlIlIllllllllIIIIlII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIIlIlIllIIlIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.lIllllllIIllIlIlIlII, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIlllIIlllIIllIllI);
    }
    
    @Override
    public int IIlIIIIlllIlllllIlII() {
        return 7455580;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 7455580;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return 2129968;
    }
    
    @Override
    protected boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII && (int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl) == 0;
        }
        return false;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 0;
    }
}
