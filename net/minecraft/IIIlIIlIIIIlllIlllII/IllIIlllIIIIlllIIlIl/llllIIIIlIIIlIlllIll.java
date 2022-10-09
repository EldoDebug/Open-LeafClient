package net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;

public abstract class llllIIIIlIIIlIlllIll
{
    protected lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll;
    protected IIIllIIIlIlIIllIIIlI IlIlIlIlIlllllllllIl;
    protected int llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    protected int IlIlIIIllIllIIIIIllI;
    
    public llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = new IIIllIIIlIlIIllIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        this.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII + 1.0f);
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll + 1.0f);
        this.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII + 1.0f);
    }
    
    public void llllIIIIlIIIlIlllIll() {
    }
    
    protected lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final int llllIIIIlIIIlIlllIll = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2, n3);
        lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = (lIIIIlIIIIIlllIllIII)this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (liiiIlIIIIIlllIllIII == null) {
            liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(n, n2, n3);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII);
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    public abstract lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI p0);
    
    public abstract lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI p0, final double p1, final double p2, final double p3);
    
    public abstract int llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII[] p0, final llIllIIIIIllIlIIIIlI p1, final lIIIIlIIIIIlllIllIII p2, final lIIIIlIIIIIlllIllIII p3, final float p4);
}
