package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class lIIIIlIIIIIlllIllIII extends llIIlIIIlIIIllIlIIIl
{
    protected int llllIIIIlIIIlIlllIll;
    protected int IlIlIlIlIlllllllllIl;
    protected int llIllIIIIIllIlIIIIlI;
    private float t;
    private float u;
    
    public lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.t = -1.0f;
    }
    
    public abstract lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII p0);
    
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.N) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                final Class llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII());
                if (llllIIIIlIIIlIlllIll2 != null && this.getClass() == llllIIIIlIIIlIlllIll2) {
                    final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(this);
                    if (llllIIIIlIIIlIlllIll3 != null) {
                        llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(-24000);
                        llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, 0.0f, 0.0f);
                        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                        if (ilIIIlIlIIIllIlIlIIl.IlIlIIIIIIlllIlIllIl()) {
                            llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl.IIlllIIlIllIllIlIIll());
                        }
                        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl;
                            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl <= 0) {
                                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(12, (Object)0);
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII ? this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(12) : this.llllIIIIlIIIlIlllIll;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final boolean b) {
        final int llllIIIlIlllIlIIIIIl;
        int n2 = (llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl()) + n * 20;
        if (n2 > 0) {
            n2 = 0;
            if (llllIIIlIlllIlIIIIIl < 0) {
                this.lIIIIlIIIIIlllIllIII();
            }
        }
        final int n3 = n2 - llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl(n2);
        if (b) {
            this.IlIlIlIlIlllllllllIl += n3;
            if (this.llIllIIIIIllIlIIIIlI == 0) {
                this.llIllIIIIIllIlIIIIlI = 40;
            }
        }
        if (this.llllIIIlIlllIlIIIIIl() == 0) {
            this.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IlIlIlIlIlllllllllIl(n, false);
    }
    
    public void IlIlIlIlIlllllllllIl(final int llllIIIIlIIIlIlllIll) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(12, (byte)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, -1, 1));
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(this.e_());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Age", this.llllIIIlIlllIlIIIIIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ForcedAge", this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Age"));
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ForcedAge");
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.llIllIIIIIllIlIIIIlI > 0) {
                if (this.llIllIIIIIllIlIIIIlI % 4 == 0) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIlIIlIlIIlllIl, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + 0.5 + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, 0.0, 0.0, 0.0, new int[0]);
                }
                --this.llIllIIIIIllIlIIIIlI;
            }
            this.llllIIIIlIIIlIlllIll(this.e_());
        }
        else {
            int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl < 0) {
                ++llllIIIlIlllIlIIIIIl;
                this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
                if (llllIIIlIlllIlIIIIIl == 0) {
                    this.lIIIIlIIIIIlllIllIII();
                }
            }
            else if (llllIIIlIlllIlIIIIIl > 0) {
                --llllIIIlIlllIlIIIIIl;
                this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
            }
        }
    }
    
    protected void lIIIIlIIIIIlllIllIII() {
    }
    
    @Override
    public boolean e_() {
        return this.llllIIIlIlllIlIIIIIl() < 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IlIIIlIlIIIllIlIlIIl(b ? 0.5f : 1.0f);
    }
    
    @Override
    protected final void llllIIIIlIIIlIlllIll(final float t, final float u) {
        final boolean b = this.t > 0.0f;
        this.t = t;
        this.u = u;
        if (!b) {
            this.IlIIIlIlIIIllIlIlIIl(1.0f);
        }
    }
    
    protected final void IlIIIlIlIIIllIlIlIIl(final float n) {
        super.llllIIIIlIIIlIlllIll(this.t * n, this.u * n);
    }
}
