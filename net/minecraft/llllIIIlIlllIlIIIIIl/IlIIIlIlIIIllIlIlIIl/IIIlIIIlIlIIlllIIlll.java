package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IIIlIIIlIlIIlllIIlll extends llIllIIIIIllIlIIIIlI
{
    public int llllIIIIlIIIlIlllIll;
    private lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    
    public IIIlIIIlIlIIlllIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIIIIlllIlIllIl = true;
        this.llllIIIIlIIIlIlllIll(0.98f, 0.98f);
    }
    
    public IIIlIIIlIlIIlllIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double iIlIIIIlllIlllllIlII, final double iiIlIIlIIIIlllIlllII, final double ilIlIllllllllIIIIlII, final lllIIIIlllllIlIIllIl ilIlIlIlIlllllllllIl) {
        this(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(iIlIIIIlllIlllllIlII, iiIlIIlIIIIlllIlllII, ilIlIllllllllIIIIlII);
        final float n = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.lIllllllIIllIlIlIlII = -(float)Math.sin(n) * 0.02f;
        this.llIIlllIIlllIIllIllI = 0.20000000298023224;
        this.IIlllIIIlIlllIIlllII = -(float)Math.cos(n) * 0.02f;
        this.llllIIIIlIIIlIlllIll = 80;
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return !this.IIlIlIlIIlIllIIIIIIl;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        this.llIIlllIIlllIIllIllI -= 0.03999999910593033;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9800000190734863;
        this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
        this.IIlllIIIlIlllIIlllII *= 0.9800000190734863;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
            this.llIIlllIIlllIIllIllI *= -0.5;
        }
        if (this.llllIIIIlIIIlIlllIll-- <= 0) {
            this.IllIllIIIIlIIlIlllII();
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.lIIIIlIIIIIlllIllIII();
            }
        }
        else {
            this.IlIIllIIllIIllIIlIIl();
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.IlIllllIIlIIlIlIlIll / 16.0f, this.lllllIlIIIlIlIIlllII, 4.0f, true);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Fuse", (byte)this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Fuse");
    }
    
    public lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 0.0f;
    }
}
