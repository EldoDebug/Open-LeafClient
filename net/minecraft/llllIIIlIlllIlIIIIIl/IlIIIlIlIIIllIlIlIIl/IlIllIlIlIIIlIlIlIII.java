package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIllIlIlIIIlIlIlIII extends llIllIlIIIIllIlIIllI
{
    private int llIllIIIIIllIlIIIIlI;
    public double llllIIIIlIIIlIlllIll;
    public double IlIlIlIlIlllllllllIl;
    
    public IlIllIlIlIIIlIlIlIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IlIllIlIlIIIlIlIlIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, new Byte((byte)0));
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.llIllIIIIIllIlIIIIlI > 0) {
            --this.llIllIIIIIllIlIIIIlI;
        }
        if (this.llIllIIIIIllIlIIIIlI <= 0) {
            final double n = 0.0;
            this.IlIlIlIlIlllllllllIl = n;
            this.llllIIIIlIIIlIlllIll = n;
        }
        this.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI > 0);
        if (this.lIIIlllIIIllIIIllIII() && this.IlIIllIIllIIllIIlIIl.nextInt(4) == 0) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + 0.8, this.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    protected double lIlIlIIIllIIllIIIllI() {
        return 0.2;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        if (!lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI() && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll, 1), 0.0f);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        final double n = this.llllIIIIlIIIlIlllIll * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl;
        if (n > 1.0E-4 && this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII > 0.001) {
            final double n2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n);
            this.llllIIIIlIIIlIlllIll /= n2;
            this.IlIlIlIlIlllllllllIl /= n2;
            if (this.llllIIIIlIIIlIlllIll * this.lIllllllIIllIlIlIlII + this.IlIlIlIlIlllllllllIl * this.IIlllIIIlIlllIIlllII < 0.0) {
                this.llllIIIIlIIIlIlllIll = 0.0;
                this.IlIlIlIlIlllllllllIl = 0.0;
            }
            else {
                final double n3 = n2 / this.lIlIlIIIllIIllIIIllI();
                this.llllIIIIlIIIlIlllIll *= n3;
                this.IlIlIlIlIlllllllllIl *= n3;
            }
        }
    }
    
    @Override
    protected void IlIllIlIlIIIlIlIlIII() {
        final double n = this.llllIIIIlIIIlIlllIll * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl;
        if (n > 1.0E-4) {
            final double n2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n);
            this.llllIIIIlIIIlIlllIll /= n2;
            this.IlIlIlIlIlllllllllIl /= n2;
            final double n3 = 1.0;
            this.lIllllllIIllIlIlIlII *= 0.800000011920929;
            this.llIIlllIIlllIIllIllI *= 0.0;
            this.IIlllIIIlIlllIIlllII *= 0.800000011920929;
            this.lIllllllIIllIlIlIlII += this.llllIIIIlIIIlIlllIll * n3;
            this.IIlllIIIlIlllIIlllII += this.IlIlIlIlIlllllllllIl * n3;
        }
        else {
            this.lIllllllIIllIlIlIlII *= 0.9800000190734863;
            this.llIIlllIIlllIIllIllI *= 0.0;
            this.IIlllIIIlIlllIIlllII *= 0.9800000190734863;
        }
        super.IlIllIlIlIIIlIlIlIII();
    }
    
    @Override
    public boolean a_(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII) {
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl;
                if (--lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
                    llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
                }
            }
            this.llIllIIIIIllIlIIIIlI += 3600;
        }
        this.llllIIIIlIIIlIlllIll = this.IIlllIlIIllIlIlIlIIl - llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
        this.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII - llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
        return true;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PushX", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PushZ", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Fuel", (short)this.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("PushX");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("PushZ");
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Fuel");
    }
    
    protected boolean lIIIlllIIIllIIIllIII() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
    
    protected void IlIlIlIlIlllllllllIl(final boolean b) {
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) | 0x1));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0xFFFFFFFE));
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII() {
        return (this.lIIIlllIIIllIIIllIII() ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll).lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI);
    }
}
