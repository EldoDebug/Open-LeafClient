package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class bb extends IIlIlIlIIlIllIIIIIIl
{
    protected final boolean lllIllIIIllllllIllll;
    
    protected bb(final boolean lllIllIIIllllllIllll) {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
        this.lllIllIIIllllllIllll = lllIllIIIllllllIllll;
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    public boolean lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (!this.IlIlIlIlIlllllllllIl((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            final boolean ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
            if (this.lllIllIIIllllllIllll && !ilIlIIIllIllIIIIIllI) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.llIllIlIIIIllIlIIllI(llIIlIIIlIIIllIlIIIl), 2);
            }
            else if (!this.lllIllIIIllllllIllll) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.llIIlIIIlIIIllIlIIIl(llIIlIIIlIIIllIlIIIl), 2);
                if (!ilIlIIIllIllIIIIIllI) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.llIIlIIIlIIIllIlIIIl(llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI(), this.IlIlIIIllIIllIlllllI(llIIlIIIlIIIllIlIIIl), -1);
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() != llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
    }
    
    protected boolean lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.lllIllIIIllllllIllll;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, lllIllIIIllllllIllll);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.lIlIlIIIllIIllIIIllI(llIIlIIIlIIIllIlIIIl) ? ((llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl) == lllIllIIIllllllIllll) ? this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl) : 0) : 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        }
        else {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]), this);
            }
        }
    }
    
    protected void llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!this.IlIlIlIlIlllllllllIl((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            final boolean ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
            if (((this.lllIllIIIllllllIllll && !ilIlIIIllIllIIIIIllI) || (!this.lllIllIIIllllllIllll && ilIlIIIllIllIIIIIllI)) && !illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl, this)) {
                int n = -1;
                if (this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
                    n = -3;
                }
                else if (this.lllIllIIIllllllIllll) {
                    n = -2;
                }
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl), n);
            }
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return false;
    }
    
    protected boolean IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl) > 0;
    }
    
    protected int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        final int llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll);
        if (llIllIIIIIllIlIIIIlI >= 15) {
            return llIllIIIIIllIlIIIIlI;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        return Math.max(llIllIIIIIllIlIIIIlI, (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl) ? ((int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII)) : 0);
    }
    
    protected int llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl);
        final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl = lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl();
        final lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl();
        return Math.max(this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl), illIIlllIIIIlllIIlIl), this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl), llllIIIlIlllIlIIIIIl));
    }
    
    protected int llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        return (int)(this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI) ? ((llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl) ? ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII) : lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll)) : 0);
    }
    
    @Override
    public boolean IIIlIIlIIIIlllIlllII() {
        return true;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII().IlIlIIIllIllIIIIIllI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, 1);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.lIIIIlIIIIIlllIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    protected void lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI());
        illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll, this);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this, lllIllIIIllllllIllll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.lllIllIIIllllllIllll) {
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]), this);
            }
        }
        super.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    protected boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII();
    }
    
    protected int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 15;
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.f.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll) || net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.an.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll == this.llIIlIIIlIIIllIlIIIl(this.lllIllIIIllllllIllll()).llIllIIIIIllIlIIIIlI() || llllIIIIlIIIlIlllIll == this.llIllIlIIIIllIlIIllI(this.lllIllIIIllllllIllll()).llIllIIIIIllIlIIIIlI();
    }
    
    public boolean lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl)).IlIlIIIllIllIIIIIllI();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        return IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI()) && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl) != ilIlIIIllIllIIIIIllI;
    }
    
    protected int IlIlIIIllIIllIlllllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl);
    }
    
    protected abstract int lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl p0);
    
    protected abstract llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl(final llIIlIIIlIIIllIlIIIl p0);
    
    protected abstract llIIlIIIlIIIllIlIIIl llIllIlIIIIllIlIIllI(final llIIlIIIlIIIllIlIIIl p0);
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
}
