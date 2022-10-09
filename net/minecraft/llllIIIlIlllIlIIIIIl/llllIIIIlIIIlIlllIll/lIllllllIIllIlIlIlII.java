package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public abstract class lIllllllIIllIlIlIlII extends IlIlIIIllIllIIIIIllI
{
    private final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    private final double IlIIIlIlIIIllIlIlIIl;
    protected int llllIIIIlIIIlIlllIll;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    protected IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    public lIllllllIIllIlIlIlII(final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final int liiiIlIIIIIlllIllIII) {
        this.IlIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll(5);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll > 0) {
            --this.llllIIIIlIIIlIlllIll;
            return false;
        }
        this.llllIIIIlIIIlIlllIll = 200 + this.llIllIIIIIllIlIIIIlI.B().nextInt(200);
        return this.lIIIlllIIIllIIIllIII();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI >= -this.IllIIlllIIIIlllIIlIl && this.IlIlIIIllIllIIIIIllI <= 1200 && this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll((float)this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1, (float)this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, this.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = 0;
        this.IllIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI.B().nextInt(this.llIllIIIIIllIlIIIIlI.B().nextInt(1200) + 1200) + 1200;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) > 1.0) {
            this.llllIIIlIlllIlIIIIIl = false;
            ++this.IlIlIIIllIllIIIIIllI;
            if (this.IlIlIIIllIllIIIIIllI % 40 == 0) {
                this.llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll((float)this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1, (float)this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, this.IlIIIlIlIIIllIlIlIIl);
            }
        }
        else {
            this.llllIIIlIlllIlIIIIIl = true;
            --this.IlIlIIIllIllIIIIIllI;
        }
    }
    
    protected boolean lIIIIlIIIIIlllIllIII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    private boolean lIIIlllIIIllIIIllIII() {
        final int liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
        for (int i = 0; i <= 1; i = ((i > 0) ? (-i) : (1 - i))) {
            for (int j = 0; j < liiiIlIIIIIlllIllIII; ++j) {
                for (int k = 0; k <= j; k = ((k > 0) ? (-k) : (1 - k))) {
                    for (int l = (k < j && k > -j) ? j : 0; l <= j; l = ((l > 0) ? (-l) : (1 - l))) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(k, i - 1, l);
                        if (this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll) && this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll)) {
                            this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    protected abstract boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII p0, final IlIlIlIlIlllllllllIl p1);
}
