package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llIllIlIlIIIIIIIllII extends IIlllIlIIllIlIlIlIIl
{
    public llIllIlIlIIIIIIIllII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(1.4f, 0.9f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII(this, 0.4f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IIlIlIlIIlIllIIIIIIl(this, llllIIIIlIIIlIlllIll.class));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IIlIlIlIIlIllIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IlIIllIIllIIllIIlIIl(this, 0.8));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IllIllIIIIlIIlIlllII(this, llllIIIIlIIIlIlllIll.class));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3, new IllIllIIIIlIIlIlllII(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class));
    }
    
    @Override
    public double llIllIIlllllllllllll() {
        return this.IlIllllIIlIIlIlIlIll * 0.5f;
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return new net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI(this, illlllllIIIlIIIlIlII);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, new Byte((byte)0));
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.llllIIIIlIIIlIlllIll(this.IIIIIIIIIlllIllIlIlI);
        }
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(16.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.30000001192092896);
    }
    
    @Override
    protected String e() {
        return "mob.spider.say";
    }
    
    @Override
    protected String O() {
        return "mob.spider.say";
    }
    
    @Override
    protected String P() {
        return "mob.spider.death";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.spider.step", 0.15f, 1.0f);
    }
    
    @Override
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        super.llllIIIIlIIIlIlllIll(b, n);
        if (b && (this.IlIIllIIllIIllIIlIIl.nextInt(3) == 0 || this.IlIIllIIllIIllIIlIIl.nextInt(1 + n) > 0)) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.F, 1);
        }
    }
    
    @Override
    public boolean f_() {
        return this.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void lllllIlIlIlllIlllIlI() {
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII Y() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() != net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI && super.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        byte b2;
        if (b) {
            b2 = (byte)(llllIIIIlIIIlIlllIll | 0x1);
        }
        else {
            b2 = (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFE);
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, b2);
    }
    
    @Override
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll);
        if (this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(100) == 0) {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(this.IlllllllIIIlIIIlIlII);
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, 0.0f);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, null);
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this);
        }
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = new IlIllllIIlIIlIlIlIll();
            if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl && this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() < 0.1f * ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) {
                ((IlIllllIIlIIlIlIlIll)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll);
            }
        }
        if (llllIIIIlIIIlIlllIll instanceof IlIllllIIlIIlIlIlIll) {
            final int llllIIIIlIIIlIlllIll2 = ((IlIllllIIlIIlIlIlIll)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll;
            if (llllIIIIlIIIlIlllIll2 > 0 && net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2] != null) {
                this.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2, Integer.MAX_VALUE));
            }
        }
        return (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 0.65f;
    }
}
