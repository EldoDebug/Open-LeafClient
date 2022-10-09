package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lIIIIlIlIllllIIlIllI extends IllIIlllllIIllIIllIl
{
    private int IlIlIIIllIllIIIIIllI;
    private IlIlIllllllllIIIIlII IllIIlllIIIIlllIIlIl;
    
    public lIIIIlIlIllllIIlIllI(final IlIlIllllllllIIIIlII illIIlllIIIIlllIIlIl) {
        super(illIIlllIIIIlllIIlIl, IlIlIllllllllIIIIlII.class, 3.0f, 0.02f);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        super.IlIlIIIllIllIIIIIllI();
        if (this.IllIIlllIIIIlllIIlIl.au() && this.IlIlIlIlIlllllllllIl instanceof IlIlIllllllllIIIIlII && ((IlIlIllllllllIIIIlII)this.IlIlIlIlIlllllllllIl).av()) {
            this.IlIlIIIllIllIIIIIllI = 10;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = 0;
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        if (this.IlIlIIIllIllIIIIIllI > 0) {
            --this.IlIlIIIllIllIIIIIllI;
            if (this.IlIlIIIllIllIIIIIllI == 0) {
                final lIllllllIIllIlIlIlII as = this.IllIIlllIIIIlllIIlIl.as();
                for (int i = 0; i < as.lIIIlllIIIllIIIllIII(); ++i) {
                    final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = as.lIlIlIIIllIIllIIIllI(i);
                    lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
                    if (lIlIlIIIllIIllIIIllI != null) {
                        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
                        if ((llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII || llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.W || llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.V) && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl > 3) {
                            final int n = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl / 2;
                            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = lIlIlIIIllIIllIIIllI;
                            lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl -= n;
                            lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll, n, lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII());
                        }
                        else if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl > 5) {
                            final int n2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl / 2 / 3 * 3;
                            final int n3 = n2 / 3;
                            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = lIlIlIIIllIIllIIIllI;
                            lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl -= n2;
                            lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII, n3, 0);
                        }
                        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl <= 0) {
                            as.llIllIIIIIllIlIIIIlI(i, null);
                        }
                    }
                    if (lllIIIIlIlIllIIlIIIl != null) {
                        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(this.IllIIlllIIIIlllIIlIl.IlllllllIIIlIIIlIlII, this.IllIIlllIIIIlllIIlIl.IIlllIlIIllIlIlIlIIl, this.IllIIlllIIIIlllIIlIl.llIIIlIlIllIIlIlIlII - 0.30000001192092896 + this.IllIIlllIIIIlllIIlIl.llllIlIllllIIlIIlIlI(), this.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII, lllIIIIlIlIllIIlIIIl);
                        final float n4 = 0.3f;
                        final float liIlllIlllllIIlllIll = this.IllIIlllIIIIlllIIlIl.lIIlllIlllllIIlllIll;
                        final float llllllIllIllIlIllllI = this.IllIIlllIIIIlllIIlIl.llllllIllIllIlIllllI;
                        liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII = -llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(liIlllIlllllIIlllIll / 180.0f * 3.1415927f) * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n4;
                        liiIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(liIlllIlllllIIlllIll / 180.0f * 3.1415927f) * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n4;
                        liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI = -llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n4 + 0.1f;
                        liiIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII();
                        this.IllIIlllIIIIlllIIlIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
                        break;
                    }
                }
            }
        }
    }
}
