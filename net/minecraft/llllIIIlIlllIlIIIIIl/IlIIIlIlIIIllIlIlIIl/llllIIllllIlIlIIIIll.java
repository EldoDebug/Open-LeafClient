package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIllllIlIlIIIIll extends llIllIlIIIIllIlIIllI
{
    public llllIIllllIlIlIIIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public llllIIllllIlIlIIIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
    }
    
    @Override
    public boolean a_(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI instanceof llllIIIIlIIIlIlllIll && this.IIllIIllIIIlIlIIIIlI != llllIIIIlIIIlIlllIll) {
            return true;
        }
        if (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI != llllIIIIlIIIlIlllIll) {
            return false;
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        }
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            if (this.IIllIIllIIIlIlIIIIlI != null) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
            }
            if (this.lllIIIIlllllIlIIllIl() == 0) {
                this.llIllIIIIIllIlIIIIlI(-this.IlIlIIIIIIlllIlIllIl());
                this.IlIlIlIlIlllllllllIl(10);
                this.IlIIIlIlIIIllIlIlIIl(50.0f);
                this.IIIllIIIlIlIIllIIIlI();
            }
        }
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
    }
}
