package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIllIIIIIllIlIIIIlI extends llIllIlIlIIIIIIIllII
{
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.7f, 0.5f);
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(12.0);
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (super.llllIIllllIlIlIIIIll(llIllIIIIIllIlIIIIlI)) {
            if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                int n = 0;
                if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI) {
                    n = 7;
                }
                else if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
                    n = 15;
                }
                if (n > 0) {
                    ((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI, n * 20, 0));
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        return llIIIlIlIllIIlIlIlII;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 0.45f;
    }
}
