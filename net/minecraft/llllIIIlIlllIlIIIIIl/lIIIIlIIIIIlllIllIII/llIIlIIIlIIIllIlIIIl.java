package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llIIlIIIlIIIllIlIIIl extends llIllIIIIIllIlIIIIlI
{
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.3125f, 0.3125f);
    }
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl, n, n2, n3);
        this.llllIIIIlIIIlIlllIll(0.3125f, 0.3125f);
    }
    
    @Override
    protected float llllIIIlIlllIlIIIIIl() {
        return this.lIIIIlIIIIIlllIllIII() ? 0.73f : super.llllIIIlIlllIlIIIIIl();
    }
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.llllIIIIlIIIlIlllIll(0.3125f, 0.3125f);
    }
    
    @Override
    public boolean lIIIIIlIlIIIlIIIIlIl() {
        return false;
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        float n = super.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        if (this.lIIIIlIIIIIlllIllIII() && net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
            n = Math.min(0.8f, n);
        }
        return n;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl != null) {
                if (this.llllIIIIlIIIlIlllIll != null) {
                    if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll), 8.0f)) {
                        if (!llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llllIllllIllllIlIlII()) {
                            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(5.0f);
                        }
                        else {
                            this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl);
                        }
                    }
                }
                else {
                    llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI, 5.0f);
                }
                if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl instanceof lllIIIIlllllIlIIllIl) {
                    int n = 0;
                    if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI) {
                        n = 10;
                    }
                    else if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
                        n = 40;
                    }
                    if (n > 0) {
                        ((lllIIIIlllllIlIIllIl)llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl.llllllIllIllIlIllllI, 20 * n, 1));
                    }
                }
            }
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, 1.0f, false, this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing"));
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        return false;
    }
    
    @Override
    protected void a_() {
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10, (Object)0);
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10) == 1;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(10, (byte)(byte)(b ? 1 : 0));
    }
}
