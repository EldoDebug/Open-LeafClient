package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIlIIIllIllIIIIIllI extends llIllIIIIIllIlIIIIlI
{
    public int IlIlIIIllIllIIIIIllI;
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIllIIIIIllI = 1;
    }
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.IlIlIIIllIllIIIIIllI = 1;
    }
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl, n, n2, n3);
        this.IlIlIIIllIllIIIIIllI = 1;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl != null) {
                llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, this.llllIIIIlIIIlIlllIll), 6.0f);
                this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl);
            }
            final boolean ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing");
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, (float)this.IlIlIIIllIllIIIIIllI, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ExplosionPower", this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ExplosionPower", 99)) {
            this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ExplosionPower");
        }
    }
}
