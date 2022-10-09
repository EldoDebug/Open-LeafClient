package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIIlIlllIllIIlIllI extends IlIlIIIllIllIIIIIllI
{
    private IlIlIllllllllIIIIlII IlIlIlIlIlllllllllIl;
    private IlIlIllllllllIIIIlII llIllIIIIIllIlIIIIlI;
    private IlllllllIIIlIIIlIlII IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    public llIIIlIlllIllIIlIllI(final IlIlIllllllllIIIIlII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl() != 0) {
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl.B().nextInt(500) != 0) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl), 0);
        if (this.llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        if (!this.lIIIIlIIIIIlllIllIII() || !this.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll(true)) {
            return false;
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.class, this.IlIlIlIlIlllllllllIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(8.0, 3.0, 8.0), this.IlIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.llIllIIIIIllIlIIIIlI = (IlIlIllllllllIIIIlII)llllIIIIlIIIlIlllIll;
        return this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl() == 0 && this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll(true);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIllIIIIIllI = 300;
        this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI(true);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI(false);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI >= 0 && this.lIIIIlIIIIIlllIllIII() && this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl() == 0 && this.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll(false);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        --this.IlIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, 10.0f, 30.0f);
        if (this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI) > 2.25) {
            this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, 0.25);
        }
        else if (this.IlIlIIIllIllIIIIIllI == 0 && this.llIllIIIIIllIlIIIIlI.ao()) {
            this.lIIIlllIIIllIIIllIII();
        }
        if (this.IlIlIlIlIlllllllllIl.B().nextInt(35) == 0) {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, (byte)12);
        }
    }
    
    private boolean lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() && this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() < (int)((float)this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() * 0.35);
    }
    
    private void lIIIlllIIIllIIIllIII() {
        final IlIlIllllllllIIIIlII ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(6000);
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(6000);
        this.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll(false);
        this.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll(false);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(-24000);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII, this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII, 0.0f, 0.0f);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, (byte)12);
    }
}
