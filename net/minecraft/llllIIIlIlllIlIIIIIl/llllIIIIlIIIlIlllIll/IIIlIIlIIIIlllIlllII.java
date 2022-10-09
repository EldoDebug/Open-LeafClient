package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIlIIlIIIIlllIlllII extends IlIlIIIllIllIIIIIllI
{
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private IlIlIllllllllIIIIlII IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IIIlIIlIIIIlllIlllII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI()) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll.B().nextInt(8000) != 0) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = (IlIlIllllllllIIIIlII)this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.class, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(6.0, 2.0, 6.0), this.llllIIIIlIIIlIlllIll);
        return this.IlIlIlIlIlllllllllIl != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI > 0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI = 400;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(false);
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 30.0f, 30.0f);
        --this.llIllIIIIIllIlIIIIlI;
    }
}
