package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIIlIlIllIIlIlIlII extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public llIIIlIlIllIIlIlIlII(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        if ((this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI() && (!this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI() || this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).IlIlIIIllIllIIIIIllI())) || this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll.B().nextInt(50) != 0) {
            return false;
        }
        if (this.llIllIIIIIllIlIIIIlI != -1 && this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, this.IlIIIlIlIIIllIlIlIIl) < 4.0) {
            return false;
        }
        final net.minecraft.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 14);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        return this.IlIlIlIlIlllllllllIl != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI = -1;
        final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        final int liiiIlIIIIIlllIllIII = ilIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl();
        if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI) > 256.0) {
            final e llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 14, 3, new e(liiiIlIIIIIlllIllIII + 0.5, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl + 0.5));
            if (llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, 1.0);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII + 0.5, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl + 0.5, 1.0);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().lIIIIlIIIIIlllIllIII();
        this.IlIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().llIIlIIIlIIIllIlIIIl();
        this.IlIlIlIlIlllllllllIl = null;
    }
}
