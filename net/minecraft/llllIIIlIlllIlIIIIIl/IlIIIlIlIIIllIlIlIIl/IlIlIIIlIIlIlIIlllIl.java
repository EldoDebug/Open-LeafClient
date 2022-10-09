package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIlIIIlIIlIlIIlllIl extends llIllIIIIIllIlIIIIlI
{
    public int llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    
    public IlIlIIIlIIlIlIIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final int ilIlIIIllIllIIIIIllI) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = 5;
        this.llllIIIIlIIIlIlllIll(0.5f, 0.5f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.IIlIIIIIllIlIIIlIIll = (float)(Math.random() * 360.0);
        this.lIllllllIIllIlIlIlII = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612) * 2.0f;
        this.llIIlllIIlllIIllIllI = (float)(Math.random() * 0.2) * 2.0f;
        this.IIlllIIIlIlllIIlllII = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612) * 2.0f;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    public IlIlIIIlIIlIlIIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = 5;
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    public int a_(final float n) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(0.5f, 0.0f, 1.0f);
        final int a_ = super.a_(n);
        final int n2 = a_ & 0xFF;
        final int n3 = a_ >> 16 & 0xFF;
        int n4 = n2 + (int)(llllIIIIlIIIlIlllIll * 15.0f * 16.0f);
        if (n4 > 240) {
            n4 = 240;
        }
        return n4 | n3 << 16;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.llIllIIIIIllIlIIIIlI > 0) {
            --this.llIllIIIIIllIlIIIIlI;
        }
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        this.llIIlllIIlllIIllIllI -= 0.029999999329447746;
        if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
            this.llIIlllIIlllIIllIllI = 0.20000000298023224;
            this.lIllllllIIllIlIlIlII = (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f;
            this.IIlllIIIlIlllIIlllII = (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f;
            this.llllIIIIlIIIlIlllIll("random.fizz", 0.4f, 2.0f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.4f);
        }
        this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, (this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + this.IlIIlllIIlIlllllIIlI().IlIlIIIllIllIIIIIllI) / 2.0, this.lllllIlIIIlIlIIlllII);
        final double n = 8.0;
        if (this.llllIIIlIlllIlIIIIIl < this.llllIIIIlIIIlIlllIll - 20 + this.IlllIIIIlIIIlIlIlIIl() % 100) {
            if (this.IllIIlllIIIIlllIIlIl == null || this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(this) > n * n) {
                this.IllIIlllIIIIlllIIlIl = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, n);
            }
            this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll;
        }
        if (this.IllIIlllIIIIlllIIlIl != null && this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl()) {
            this.IllIIlllIIIIlllIIlIl = null;
        }
        if (this.IllIIlllIIIIlllIIlIl != null) {
            final double n2 = (this.IllIIlllIIIIlllIIlIl.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl) / n;
            final double n3 = (this.IllIIlllIIIIlllIIlIl.llIIIlIlIllIIlIlIlII + this.IllIIlllIIIIlllIIlIl.llllIlIllllIIlIIlIlI() - this.llIIIlIlIllIIlIlIlII) / n;
            final double n4 = (this.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII) / n;
            final double sqrt = Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4);
            final double n5 = 1.0 - sqrt;
            if (n5 > 0.0) {
                final double n6 = n5 * n5;
                this.lIllllllIIllIlIlIlII += n2 / sqrt * n6 * 0.1;
                this.llIIlllIIlllIIllIllI += n3 / sqrt * n6 * 0.1;
                this.IIlllIIIlIlllIIlllII += n4 / sqrt * n6 * 0.1;
            }
        }
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        float n7 = 0.98f;
        if (this.IIIIIllIIIIlIIIIllIl) {
            n7 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) - 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI * 0.98f;
        }
        this.lIllllllIIllIlIlIlII *= n7;
        this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
        this.IIlllIIIlIlllIIlllII *= n7;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.llIIlllIIlllIIllIllI *= -0.8999999761581421;
        }
        ++this.llllIIIIlIIIlIlllIll;
        ++this.IlIlIlIlIlllllllllIl;
        if (this.IlIlIlIlIlllllllllIl >= 6000) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public boolean IlIIllIIllIIllIIlIIl() {
        return this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI(), net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII, this);
    }
    
    @Override
    protected void IllIIlllIIIIlllIIlIl(final int n) {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll, (float)n);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        this.IIIllIIIlIlIIllIIIlI();
        this.IlIIIlIlIIIllIlIlIIl -= (int)n;
        if (this.IlIIIlIlIIIllIlIlIIl <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Health", (short)(byte)this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Age", (short)this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Value", (short)this.IlIlIIIllIllIIIIIllI);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIIIlIlIIIllIlIlIIl = (iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Health") & 0xFF);
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Age");
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Value");
    }
    
    @Override
    public void b_(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.llIllIIIIIllIlIIIIlI == 0 && llllIIIIlIIIlIlllIll.y == 0) {
            llllIIIIlIIIlIlllIll.y = 2;
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.orb", 0.1f, 0.5f * ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.7f + 1.8f));
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, 1);
            llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl(this.IlIlIIIllIllIIIIIllI);
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return (this.IlIlIIIllIllIIIIIllI >= 2477) ? 10 : ((this.IlIlIIIllIllIIIIIllI >= 1237) ? 9 : ((this.IlIlIIIllIllIIIIIllI >= 617) ? 8 : ((this.IlIlIIIllIllIIIIIllI >= 307) ? 7 : ((this.IlIlIIIllIllIIIIIllI >= 149) ? 6 : ((this.IlIlIIIllIllIIIIIllI >= 73) ? 5 : ((this.IlIlIIIllIllIIIIIllI >= 37) ? 4 : ((this.IlIlIIIllIllIIIIIllI >= 17) ? 3 : ((this.IlIlIIIllIllIIIIIllI >= 7) ? 2 : ((this.IlIlIIIllIllIIIIIllI >= 3) ? 1 : 0)))))))));
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        return (n >= 2477) ? 2477 : ((n >= 1237) ? 1237 : ((n >= 617) ? 617 : ((n >= 307) ? 307 : ((n >= 149) ? 149 : ((n >= 73) ? 73 : ((n >= 37) ? 37 : ((n >= 17) ? 17 : ((n >= 7) ? 7 : ((n >= 3) ? 3 : 1)))))))));
    }
    
    @Override
    public boolean i_() {
        return false;
    }
}
