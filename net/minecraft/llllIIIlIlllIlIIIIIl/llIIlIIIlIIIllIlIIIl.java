package net.minecraft.llllIIIlIlllIlIIIIIl;

import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;

public abstract class llIIlIIIlIIIllIlIIIl extends IlIllIlIlIIIlIlIlIII
{
    public static final UUID IlIIIlIlIIIllIlIlIIl;
    public static final llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI;
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private IlIlIIIllIllIIIIIllI llIllIIIIIllIlIIIIlI;
    private boolean t;
    
    static {
        IlIIIlIlIIIllIlIlIIl = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
        IlIlIIIllIllIIIIIllI = new llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl, "Fleeing speed bonus", 2.0, 2).llllIIIIlIIIlIlllIll(false);
    }
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = -1.0f;
        this.llIllIIIIIllIlIIIIlI = new llIIlllIIlllIIllIllI(this, 1.0);
    }
    
    public float llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return 0.0f;
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return super.lIlIlIIIllIIllIIIllI() && this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII)) >= 0.0f;
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return !this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl();
    }
    
    public boolean IlIllIlIlIIIlIlIlIII() {
        return this.IlIlIIIllIllIIIIIllI(new IlIlIlIlIlllllllllIl(this));
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIlIlIlllllllllIl == -1.0f || this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl) < this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final int n) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = (float)n;
    }
    
    public IlIlIlIlIlllllllllIl IIlllIIlIllIllIlIIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public float lllIIIIlllllIlIIllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void IlIlIIIIIIlllIlIllIl() {
        this.IlIlIlIlIlllllllllIl = -1.0f;
    }
    
    public boolean IlllllllIIIlIIIlIlII() {
        return this.IlIlIlIlIlllllllllIl != -1.0f;
    }
    
    @Override
    protected void IIIlIIlIIIIlllIlllII() {
        super.IIIlIIlIIIIlllIlllII();
        if (this.t() && this.u() != null && this.u().IlllllllIIIlIIIlIlII == this.IlllllllIIIlIIIlIlII) {
            final llIllIIIIIllIlIIIIlI u = this.u();
            this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl((int)u.IIlllIlIIllIlIlIlIIl, (int)u.llIIIlIlIllIIlIlIlII, (int)u.lllllIlIIIlIlIIlllII), 5);
            final float ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(u);
            if (this instanceof IIIlIIlIIIIlllIlllII && ((IIIlIIlIIIIlllIlllII)this).at()) {
                if (ilIIIlIlIIIllIlIlIIl > 10.0f) {
                    this.llllIIIIlIIIlIlllIll(true, true);
                }
                return;
            }
            if (!this.t) {
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, this.llIllIIIIIllIlIIIIlI);
                if (this.lIllllllIIllIlIlIlII() instanceof IllIIlllIIIIlllIIlIl) {
                    ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(false);
                }
                this.t = true;
            }
            this.IlIlIIIllIllIIIIIllI(ilIIIlIlIIIllIlIlIIl);
            if (ilIIIlIlIIIllIlIlIIl > 4.0f) {
                this.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(u, 1.0);
            }
            if (ilIIIlIlIIIllIlIlIIl > 6.0f) {
                final double n = (u.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl) / ilIIIlIlIIIllIlIlIIl;
                final double n2 = (u.llIIIlIlIllIIlIlIlII - this.llIIIlIlIllIIlIlIlII) / ilIIIlIlIIIllIlIlIIl;
                final double n3 = (u.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII) / ilIIIlIlIIIllIlIlIIl;
                this.lIllllllIIllIlIlIlII += n * Math.abs(n) * 0.4;
                this.llIIlllIIlllIIllIllI += n2 * Math.abs(n2) * 0.4;
                this.IIlllIIIlIlllIIlllII += n3 * Math.abs(n3) * 0.4;
            }
            if (ilIIIlIlIIIllIlIlIIl > 10.0f) {
                this.llllIIIIlIIIlIlllIll(true, true);
            }
        }
        else if (!this.t() && this.t) {
            this.t = false;
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
            if (this.lIllllllIIllIlIlIlII() instanceof IllIIlllIIIIlllIIlIl) {
                ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
            }
            this.IlIlIIIIIIlllIlIllIl();
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI(final float n) {
    }
}
