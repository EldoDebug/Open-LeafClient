package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IIlllIlIIllIlIlIlIIl extends IlIlIIIllIllIIIIIllI
{
    private IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    int IlIlIlIlIlllllllllIl;
    double llIllIIIIIllIlIIIIlI;
    
    public IIlllIlIIllIlIlIlIIl(final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl, final double llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll = ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.IlIIIlIlIIIllIlIlIIl.ao()) {
            return false;
        }
        this.IlIlIIIllIllIIIIIllI = this.lIIIIlIIIIIlllIllIII();
        return this.IlIlIIIllIllIIIIIllI != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI.llllIllllIllllIlIlII() && this.IlIlIIIllIllIIIIIllI.ao() && this.IlIlIlIlIlllllllllIl < 60;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIIIllIllIIIIIllI = null;
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, 10.0f, (float)this.IlIIIlIlIIIllIlIlIIl.j());
        this.IlIIIlIlIIIllIlIlIIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, this.llIllIIIIIllIlIIIIlI);
        ++this.IlIlIlIlIlllllllllIl;
        if (this.IlIlIlIlIlllllllllIl >= 60 && this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(this.IlIlIIIllIllIIIIIllI) < 9.0) {
            this.lIIIlllIIIllIIIllIII();
        }
    }
    
    private IlIlIlIlIlllllllllIl lIIIIlIIIIIlllIllIII() {
        final float n = 8.0f;
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.getClass(), this.IlIIIlIlIIIllIlIlIIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(n, n, n));
        double ilIlIIIllIllIIIIIllI = Double.MAX_VALUE;
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = null;
        for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 : llllIIIIlIIIlIlllIll) {
            if (this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2) && this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl2) < ilIlIIIllIllIIIIIllI) {
                ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
                ilIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl2);
            }
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    private void lIIIlllIIIllIIIllIII() {
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.IlIIIlIlIIIllIlIlIIl.an();
            if (llllIIIIlIIIlIlllIll2 == null && this.IlIlIIIllIllIIIIIllI.an() != null) {
                llllIIIIlIIIlIlllIll2 = this.IlIlIIIllIllIIIIIllI.an();
            }
            if (llllIIIIlIIIlIlllIll2 != null) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IIlllIlIIllIlIlIlIIl);
                if (this.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI) {
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
                }
            }
            this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(6000);
            this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(6000);
            this.IlIIIlIlIIIllIlIlIIl.ap();
            this.IlIlIIIllIllIIIIIllI.ap();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(-24000);
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl, this.IlIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII, this.IlIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII, 0.0f, 0.0f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            final Random b = this.IlIIIlIlIIIllIlIlIIl.B();
            for (int i = 0; i < 7; ++i) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl, this.IlIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl + (b.nextDouble() * this.IlIIIlIlIIIllIlIlIIl.IllIllIIIIlIIlIlllII * 2.0 - this.IlIIIlIlIIIllIlIlIIl.IllIllIIIIlIIlIlllII), this.IlIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII + (0.5 + b.nextDouble() * this.IlIIIlIlIIIllIlIlIIl.IlIllllIIlIIlIlIlIll), this.IlIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII + (b.nextDouble() * this.IlIIIlIlIIIllIlIlIIl.IllIllIIIIlIIlIlllII * 2.0 - this.IlIIIlIlIIIllIlIlIIl.IllIllIIIIlIIlIlllII), b.nextGaussian() * 0.02, b.nextGaussian() * 0.02, b.nextGaussian() * 0.02, new int[0]);
            }
            if (this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobLoot")) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.llllIIIIlIIIlIlllIll, this.IlIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl, this.IlIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII, this.IlIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII, b.nextInt(7) + 1));
            }
        }
    }
}
