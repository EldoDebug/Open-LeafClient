package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIIIIIllIlIIIIlI extends net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI
{
    public final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll;
    public final String IlIlIlIlIlllllllllIl;
    
    public llIllIIIIIllIlIIIIlI(final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final float n, final float n2) {
        super(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(n, n2);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        return !this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII) && this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this, lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public boolean lIIIIlIIIIIlllIllIII(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return this == llIllIIIIIllIlIIIIlI || this.llllIIIIlIIIlIlllIll == llIllIIIIIllIlIIIIlI;
    }
}
