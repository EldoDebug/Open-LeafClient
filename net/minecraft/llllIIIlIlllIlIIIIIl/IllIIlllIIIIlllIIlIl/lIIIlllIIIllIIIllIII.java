package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIlllIIIllIIIllIII extends IlIlIIIllIllIIIIIllI
{
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.9f, 1.3f);
        this.t = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIllllllllIIIIlII && this.llllIIIlIlllIlIIIIIl() >= 0) {
            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl == 1) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIlIIllIlIlIlIIl));
                return true;
            }
            if (llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIlIIllIlIlIlIIl)) && !llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, 1);
                return true;
            }
        }
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i && this.llllIIIlIlllIlIIIIIl() >= 0) {
            this.IllIllIIIIlIIlIlllII();
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.IlIllllIIlIIlIlIlIll / 2.0f, this.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new IlIlIIIllIllIIIIIllI(this.IlllllllIIIlIIIlIlII);
                ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
                ilIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI(this.N());
                ilIlIIIllIllIIIIIllI.lIllIlIIIllllllIIlII = this.lIllIlIIIllllllIIlII;
                if (this.w_()) {
                    ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl(this.lIllIlIIIllllllIIlII());
                }
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
                for (int i = 0; i < 5; ++i) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII, new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl)));
                }
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll);
                this.llllIIIIlIIIlIlllIll("mob.sheep.shear", 1.0f, 1.0f);
            }
            return true;
        }
        return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    public lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return new lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII);
    }
}
