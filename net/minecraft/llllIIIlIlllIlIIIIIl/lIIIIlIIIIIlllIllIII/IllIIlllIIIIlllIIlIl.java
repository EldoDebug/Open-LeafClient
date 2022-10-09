package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IllIIlllIIIIlllIIlIl extends lIIIlllIIIllIIIllIII
{
    private lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI;
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final int n) {
        this(illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, 1, n));
    }
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI) {
        super(illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final int n4) {
        this(illlllllIIIlIIIlIlII, n, n2, n3, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, 1, n4));
    }
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected float llllIIIlIlllIlIIIIIl() {
        return 0.05f;
    }
    
    @Override
    protected float lIIIIlIIIIIlllIllIII() {
        return 0.5f;
    }
    
    @Override
    protected float lIIIlllIIIllIIIllIII() {
        return -20.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, 1, 0);
        }
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n);
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, 1, 0);
        }
        return this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final List llIllIlIIIIllIlIIllI = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D.llIllIlIIIIllIlIIllI(this.llIllIIIIIllIlIIIIlI);
            if (llIllIlIIIIllIlIIllI != null && !llIllIlIIIIllIlIIllI.isEmpty()) {
                final List llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(4.0, 2.0, 4.0));
                if (!llllIIIIlIIIlIlllIll.isEmpty()) {
                    for (final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl : llllIIIIlIIIlIlllIll) {
                        final double ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(lllIIIIlllllIlIIllIl);
                        if (ilIlIIIllIllIIIIIllI < 16.0) {
                            double n = 1.0 - Math.sqrt(ilIlIIIllIllIIIIIllI) / 4.0;
                            if (lllIIIIlllllIlIIllIl == llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl) {
                                n = 1.0;
                            }
                            for (final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : llIllIlIIIIllIlIIllI) {
                                final int llllIIIIlIIIlIlllIll2 = ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
                                if (net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2].llIllIIIIIllIlIIIIlI()) {
                                    net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2].llllIIIIlIIIlIlllIll(this, this.llllIIllllIlIlIIIIll(), lllIIIIlllllIlIIllIl, ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), n);
                                }
                                else {
                                    final int n2 = (int)(n * ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() + 0.5);
                                    if (n2 <= 20) {
                                        continue;
                                    }
                                    lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2, n2, ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI()));
                                }
                            }
                        }
                    }
                }
            }
            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(2002, new IlIlIlIlIlllllllllIl(this), this.lIlIlIIIllIIllIIIllI());
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Potion", 10)) {
            this.llIllIIIIIllIlIIIIlI = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Potion"));
        }
        else {
            this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("potionValue"));
        }
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        if (this.llIllIIIIIllIlIIIIlI != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Potion", this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        }
    }
}
