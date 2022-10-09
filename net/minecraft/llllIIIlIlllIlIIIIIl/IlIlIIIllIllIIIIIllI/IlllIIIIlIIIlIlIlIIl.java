package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IlllIIIIlIIIlIlIlIIl extends IIlllIIlllIIIlIlllII
{
    private float llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private IIIllllllIllIIIlllIl lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    
    public IlllIIIIlIIIlIlIlIIl(final IIIllllllIllIIIlllIl liiIlllIIIllIIIllIII) {
        super(liiIlllIIIllIIIllIII);
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final float llllIIIlIlllIlIIIIIl, final boolean llIIlIIIlIIIllIlIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = true;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, this.llllIIIlIlllIlIIIIIl, 30.0f);
        this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll = this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll;
        this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII = this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll;
        if (!this.IllIIlllIIIIlllIIlIl) {
            this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(0.0f);
        }
        else {
            this.IllIIlllIIIIlllIIlIl = false;
            if (this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl) {
                this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl((float)(this.IlIlIIIllIllIIIIIllI * this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI()));
                if (this.lIIIIlIIIIIlllIllIII-- <= 0) {
                    this.lIIIIlIIIIIlllIllIII = this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII();
                    if (this.llIIlIIIlIIIllIlIIIl) {
                        this.lIIIIlIIIIIlllIllIII /= 3;
                    }
                    this.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII().llllIIIIlIIIlIlllIll();
                    if (this.lIIIlllIIIllIIIllIII.ap()) {
                        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII(), this.lIIIlllIIIllIIIllIII.Z(), ((this.lIIIlllIIIllIIIllIII.B().nextFloat() - this.lIIIlllIIIllIIIllIII.B().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                    }
                }
                else {
                    final IIIllllllIllIIIlllIl liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
                    final IIIllllllIllIIIlllIl liiIlllIIIllIIIllIII2 = this.lIIIlllIIIllIIIllIII;
                    final float n = 0.0f;
                    liiIlllIIIllIIIllIII2.l = n;
                    liiIlllIIIllIIIllIII.k = n;
                    this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(0.0f);
                }
            }
            else {
                this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl((float)(this.IlIlIIIllIllIIIIIllI * this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI()));
            }
        }
    }
}
