package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IllIIlllIIIIlllIIlIl extends IlIlIIIllIllIIIIIllI
{
    private IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll;
    private llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private IlllllllIIIlIIIlIlII llIllIIIIIllIlIIIIlI;
    private float IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IllIIlllIIIIlllIIlIl(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll, final float ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll(2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, (double)this.IlIIIlIlIIIllIlIlIIl);
        return this.IlIlIlIlIlllllllllIl != null && this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII() && this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) <= this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl && (this.IlIlIIIllIllIIIIIllI > 0 && this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl));
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII(true);
        this.IlIlIIIllIllIIIIIllI = 40 + this.llllIIIIlIIIlIlllIll.B().nextInt(40);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII(false);
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII + this.IlIlIlIlIlllllllllIl.llllIlIllllIIlIIlIlI(), this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII, 10.0f, (float)this.llllIIIIlIIIlIlllIll.j());
        --this.IlIlIIIllIllIIIIIllI;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        return ilIIIlIlIIIllIlIlIIl != null && ((!this.llllIIIIlIIIlIlllIll.as() && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.b) || this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl));
    }
}
