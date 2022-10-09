package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class llllIIIlIlllIlIIIIIl extends IIlIIIIIllIlIIIlIIll
{
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI llIIlIIIlIIIllIlIIIl;
    
    public llllIIIlIlllIlIIIIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI llIIlIIIlIIIllIlIIIl) {
        super(llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll.class, true);
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final List llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.class, this.IlIlIIIllIllIIIIIllI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, 4.0, liiiIlIIIIIlllIllIII), this.llIllIIIIIllIlIIIIlI);
        Collections.sort((List<Object>)llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll.isEmpty()) {
            return false;
        }
        this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.get(0);
        return true;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.lIIIIlIIIIIlllIllIII = 5;
        this.lIIIlllIIIllIIIllIII = 0;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIlIlllIlIIIIIl = null;
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(false);
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
        super.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            return super.IlIlIlIlIlllllllllIl();
        }
        if (!this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl(this.llllIIIlIlllIlIIIIIl)) {
            return false;
        }
        net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, true);
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, 10.0f, 10.0f);
        return true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIlIlllIlIIIIIl != null) {
            if (--this.lIIIIlIIIIIlllIllIII <= 0) {
                this.IlIIIlIlIIIllIlIlIIl = this.llllIIIlIlllIlIIIIIl;
                this.llllIIIlIlllIlIIIIIl = null;
                super.IlIlIIIllIllIIIIIllI();
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("mob.endermen.stare", 1.0f, 1.0f);
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(true);
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
            }
        }
        else {
            if (this.IlIIIlIlIIIllIlIlIIl != null) {
                if (this.IlIIIlIlIIIllIlIlIIl instanceof llllIIIIlIIIlIlllIll && this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl((llllIIIIlIIIlIlllIll)this.IlIIIlIlIIIllIlIlIIl)) {
                    if (this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(this.llIIlIIIlIIIllIlIIIl) < 16.0) {
                        this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII();
                    }
                    this.lIIIlllIIIllIIIllIII = 0;
                }
                else if (this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(this.llIIlIIIlIIIllIlIIIl) > 256.0 && this.lIIIlllIIIllIIIllIII++ >= 30 && this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI)this.IlIIIlIlIIIllIlIlIIl)) {
                    this.lIIIlllIIIllIIIllIII = 0;
                }
            }
            super.IlIIIlIlIIIllIlIlIIl();
        }
    }
}
