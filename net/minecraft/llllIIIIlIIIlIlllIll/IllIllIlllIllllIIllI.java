package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIllIllIIIIIllI.*;

public class IllIllIlllIllllIIllI extends IIllllIIIlIIIIIIllIl
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final lllIlIIIIIlIlllllIlI IlllIIIIlIIIlIlIlIIl;
    protected Random lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("triggered");
        IlllIIIIlIIIlIlIlIIl = new lllIlIIIIIlIlllllIlI(new net.minecraft.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll());
    }
    
    protected IllIllIlllIllllIIllI() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
        this.lllIllIIIllllllIllll = new Random();
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl, false));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return 4;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        super.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    private void IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI);
            final boolean llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll();
            final boolean llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll();
            if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll && !llllIIIIlIIIlIlllIll2) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
            }
            else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll2 && !llllIIIIlIIIlIlllIll) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
            }
            else {
                final boolean llllIIIIlIIIlIlllIll3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll();
                final boolean llllIIIIlIIIlIlllIll4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll();
                if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && llllIIIIlIIIlIlllIll3 && !llllIIIIlIIIlIlllIll4) {
                    lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
                }
                else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && llllIIIIlIIIlIlllIll4 && !llllIIIIlIIIlIlllIll3) {
                    lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
                }
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll).llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl, false), 2);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll2 instanceof lllIIIIlllllIlIIllIl) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll2);
            if (llllIIIIlIIIlIlllIll2 instanceof IlIlIIIIIIlllIlIllIl) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lllIllIIIllllllIllll);
            }
            else {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIlIlIlIIlIllIIIIIIl);
            }
        }
        return true;
    }
    
    protected void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final ci ci = new ci(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)ci.llllIIIlIlllIlIIIIIl();
        if (lllIIIIlllllIlIIllIl != null) {
            final int iiIlIIIlIlIIlllIIlll = lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll();
            if (iiIlIIIlIlIIlllIIlll < 0) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(1001, ilIlIlIlIlllllllllIl, 0);
            }
            else {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI(iiIlIIIlIlIIlllIIlll);
                final net.minecraft.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI);
                if (llllIIIIlIIIlIlllIll != net.minecraft.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
                    final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ci, lIlIlIIIllIIllIIIllI);
                    lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(iiIlIIIlIlIIlllIIlll, (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl <= 0) ? null : llllIIIIlIIIlIlllIll2);
                }
            }
        }
    }
    
    protected net.minecraft.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (net.minecraft.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI)IllIllIlllIllllIIllI.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll((lllIIIIlIlIllIIlIIIl == null) ? null : lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final boolean b = illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl) || illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        final boolean booleanValue = (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl);
        if (b && !booleanValue) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl, true), 4);
        }
        else if (!b && booleanValue) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl, false), 4);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new lllIIIIlllllIlIIllIl();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI, v.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIIIIlllllIlIIllIl)).llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl, false);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI, v.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIIIIlllllIlIIllIl)), 2);
        if (lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
                ((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
            net.minecraft.llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll);
            illlllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, this);
        }
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    public static lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI2 = IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl());
        return new lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() + 0.7 * ilIlIIIllIllIIIIIllI2.lIIIIlIIIIIlllIllIII(), ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() + 0.7 * ilIlIIIllIllIIIIIllI2.lIIIlllIIIllIIIllIII(), ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl() + 0.7 * ilIlIIIllIllIIIIIllI2.llIIlIIIlIIIllIlIIIl());
    }
    
    public static lllIllIIIllllllIllll IlIlIIIllIllIIIIIllI(final int n) {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n & 0x7);
    }
    
    @Override
    public boolean IIIIIIIIIlllIllIlIlI() {
        return true;
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 3;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI, IlIlIIIllIllIIIIIllI(n)).llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IllIllIlllIllllIIllI.IIIIIIIIIlllIllIlIlI, IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl });
    }
}
