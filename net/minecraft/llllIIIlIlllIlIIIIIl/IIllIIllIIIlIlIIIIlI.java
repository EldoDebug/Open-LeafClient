package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IIllIIllIIIlIlIIIIlI extends llIllIlIIIIllIlIIllI
{
    private final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IIllIIllIIIlIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = new IIIlIIIlIlIIlllIIlll(this);
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    public IIllIIllIIIlIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll = new IIIlIIIlIlIIlllIIlll(this);
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(23, "");
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(24, "");
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(23, this.lIIIlllIIIllIIIllIII().lIIIlllIIIllIIIllIII());
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(24, net.minecraft.IlllllllIIIlIIIlIlII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII().lIIIIlIIIIIlllIllIII()));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII() {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ab.lllIllIIIllllllIllll();
    }
    
    public IlIlIIIllIllIIIIIllI lIIIlllIIIllIIIllIII() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final boolean b) {
        if (b && this.lllllIIIIIlIlIIIIIIl - this.IlIlIlIlIlllllllllIl >= 4) {
            this.lIIIlllIIIllIIIllIII().llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII);
            this.IlIlIlIlIlllllllllIl = this.lllllIIIIIlIlIIIIIIl;
        }
    }
    
    @Override
    public boolean a_(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        return false;
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl(final int n) {
        super.llIIlIIIlIIIllIlIIIl(n);
        if (n == 24) {
            try {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.llIllIlIlIIIIIIIllII().IlIlIIIllIllIIIIIllI(24)));
            }
            catch (Throwable t) {}
        }
        else if (n == 23) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIlIlIIIIIIIllII().IlIlIIIllIllIIIIIllI(23));
        }
    }
}
