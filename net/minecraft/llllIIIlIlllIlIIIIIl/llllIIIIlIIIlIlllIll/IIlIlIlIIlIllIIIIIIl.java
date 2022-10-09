package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlIlIlIIlIllIIIIIIl extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl;
    
    public IIlIlIlIIlIllIIIIIIl(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (!(llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII() instanceof net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)) {
            throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI()) {
            return false;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        final net.minecraft.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 16);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return this.IlIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl) < 2.25;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI() && (!this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() && this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll)));
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        ((net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).IlIlIlIlIlllllllllIl(false);
        ((net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).llIllIIIIIllIlIIIIlI(false);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        ((net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).IlIlIlIlIlllllllllIl(true);
        ((net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).llIllIIIIIllIlIIIIlI(true);
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
    }
}
