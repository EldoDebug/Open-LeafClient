package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIlIlllIlIIIIIl extends llIllIIIIIllIlIIIIlI
{
    public llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.3125f, 0.3125f);
    }
    
    public llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl, n, n2, n3);
        this.llllIIIIlIIIlIlllIll(0.3125f, 0.3125f);
    }
    
    public llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.llllIIIIlIIIlIlllIll(0.3125f, 0.3125f);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl != null) {
                if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, this.llllIIIIlIIIlIlllIll), 5.0f)) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl);
                    if (!llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llIIIIIIlIllIIlIIIll()) {
                        llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(5);
                    }
                }
            }
            else {
                boolean ilIlIlIlIlllllllllIl = true;
                if (this.llllIIIIlIIIlIlllIll != null && this.llllIIIIlIIIlIlllIll instanceof IlIllIlIlIIIlIlIlIII) {
                    ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing");
                }
                if (ilIlIlIlIlllllllllIl) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl);
                    if (this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll)) {
                        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
                    }
                }
            }
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        return false;
    }
}
