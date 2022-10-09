package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class llllllIllIllIlIllllI extends IlIllIlIlIIIlIlIlIII implements IIIIIllIIIIlIIIIllIl
{
    public llllllIllIllIlIllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    @Override
    public boolean x() {
        return true;
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return true;
    }
    
    @Override
    public boolean k() {
        return this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI(), this);
    }
    
    @Override
    public int IIIllllllIllIIIlllIl() {
        return 120;
    }
    
    @Override
    protected boolean g() {
        return true;
    }
    
    @Override
    protected int IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return 1 + this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(3);
    }
    
    @Override
    public void IlIllllIIlIIlIlIlIll() {
        int llIlllIlllllIIllIIII = this.llIlllIlllllIIllIIII();
        super.IlIllllIIlIIlIlIlIll();
        if (this.llllIllllIllllIlIlII() && !this.llIIIlIlllIllIIlIllI()) {
            --llIlllIlllllIIllIIII;
            this.lIIIIlIIIIIlllIllIII(llIlllIlllllIIllIIII);
            if (this.llIlllIlllllIIllIIII() == -20) {
                this.lIIIIlIIIIIlllIllIII(0);
                this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl, 2.0f);
            }
        }
        else {
            this.lIIIIlIIIIIlllIllIII(300);
        }
    }
    
    @Override
    public boolean IllIlllIllIIIIllllII() {
        return false;
    }
}
