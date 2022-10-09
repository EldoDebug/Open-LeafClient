package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIllllllllIIIIlII extends IlIlIIIllIllIIIIIllI
{
    private IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIllllllllIIIIlII(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.B().nextFloat() < 0.02f;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl >= 0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        final double n = 6.283185307179586 * this.llllIIIIlIIIlIlllIll.B().nextDouble();
        this.IlIlIlIlIlllllllllIl = Math.cos(n);
        this.llIllIIIIIllIlIIIIlI = Math.sin(n);
        this.IlIIIlIlIIIllIlIlIIl = 20 + this.llllIIIIlIIIlIlllIll.B().nextInt(20);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        --this.IlIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl + this.IlIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + this.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI(), this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII + this.llIllIIIIIllIlIIIIlI, 10.0f, (float)this.llllIIIIlIIIlIlllIll.j());
    }
}
