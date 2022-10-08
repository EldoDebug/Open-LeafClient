package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;

public class IIIIIIIIIlllIllIlIlI extends IIIllllllIllIIIlllIl
{
    private IIIllllllIllIIIlllIl llllllIllIllIlIllllI;
    
    public IIIIIIIIIlllIllIlIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final IIIllllllIllIIIlllIl llllllIllIllIlIllllI, final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2) {
        super(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl, new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.lIllllllIIllIlIlIlII()), n, ilIIIlIlIIIllIlIlIIl2);
        this.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
        llllllIllIllIlIllllI.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(new IIllllIIIlIIIIIIllIl(this));
    }
    
    @Override
    protected void IIlIIIlllIllIllIlIII() {
    }
    
    @Override
    public IlllllllIIIlIIIlIlII lIIIlllIIIllIIIllIII() {
        this.IlIlIIIlIIlIlIIlllIl = this.llllllIllIllIlIllllI.IIIllllllIllIIIlllIl();
        this.IIIlIIlIIIIlllIlllII = this.llllllIllIllIlIllllI.IlllIIIIlIIIlIlIlIIl();
        final String llllIIIIlIIIlIlllIll = net.minecraft.IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
        final IlIlIIIllIllIIIIIllI illlllllIIIlIIIlIlII = (IlIlIIIllIllIIIIIllI)this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.class, llllIIIIlIIIlIlllIll);
        if (illlllllIIIlIIIlIlII == null) {
            this.IlllllllIIIlIIIlIlII = new IlIlIIIllIllIIIIIllI(this);
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.IlllllllIIIlIIIlIlII);
        }
        else {
            (this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll(this);
        }
        return this;
    }
}
