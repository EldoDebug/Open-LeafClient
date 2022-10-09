package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public abstract class llIllIlIIIIllIlIIllI extends IlIlIIIllIllIIIIIllI
{
    protected IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    protected IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    protected llIlIIIIIlIIlIlIIlll llIllIIIIIllIlIIIIlI;
    boolean IlIIIlIlIIIllIlIlIIl;
    float IlIlIIIllIllIIIIIllI;
    float IllIIlllIIIIlllIIlIl;
    
    public llIllIlIIIIllIlIIllI(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (!(llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII() instanceof IllIIlllIIIIlllIIlIl)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI) {
            return false;
        }
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII();
        final net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != null && !llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl() && illIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI()) {
            for (int i = 0; i < Math.min(llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() + 2, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl()); ++i) {
                final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(i);
                this.IlIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + 1, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
                if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()) <= 2.25) {
                    this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
                    if (this.llIllIIIIIllIlIIIIlI != null) {
                        return true;
                    }
                }
            }
            this.IlIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll();
            this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            return this.llIllIIIIIllIlIIIIlI != null;
        }
        return false;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.IlIlIIIllIllIIIIIllI = (float)(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl);
        this.IllIIlllIIIIlllIIlIl = (float)(this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.IlIlIIIllIllIIIIIllI * (float)(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl) + this.IllIIlllIIIIlllIIlIl * (float)(this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII) < 0.0f) {
            this.IlIIIlIlIIIllIlIlIIl = true;
        }
    }
    
    private llIlIIIIIlIIlIlIIlll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return (llIllIIIIIllIlIIIIlI instanceof llIlIIIIIlIIlIlIIlll && llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) ? ((llIlIIIIIlIIlIlIIlll)llIllIIIIIllIlIIIIlI) : null;
    }
}
