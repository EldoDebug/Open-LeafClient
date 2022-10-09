package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class cr extends IIlIIIIlllIlllllIlII implements dt
{
    public static final IllIIlllIIIIlllIIlIl IIIIIIIIIlllIllIlIlI;
    public static final llIllIIIIIllIlIIIIlI IIllllIIIlIIIIIIllIl;
    private final llllIIIIlIIIlIlllIll IlllIIIIlIIIlIlIlIIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("age", 0, 7);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing", (Predicate)new cs());
    }
    
    protected cr(final llllIIIIlIIIlIlllIll illlIIIIlIIIlIlIlIIl) {
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI, 0).llllIIIIlIIIlIlllIll(cr.IIllllIIIlIIIIIIllIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl));
        this.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl;
        this.llllIIIIlIIIlIlllIll(true);
        final float n = 0.125f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.25f, 0.5f + n);
        this.llllIIIIlIIIlIlllIll((net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll)null);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIllllIIIlIIIIIIllIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl);
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI() == this.IlllIIIIlIIIlIlIlIIl) {
                llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIllllIIIlIIIIIIllIl, lllIllIIIllllllIllll);
                break;
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    protected boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2, final Random random) {
        super.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, random);
        if (illlllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) >= 9 && random.nextInt((int)(25.0f / net.minecraft.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll)) + 1) == 0) {
            final int intValue = (int)llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI);
            if (intValue < 7) {
                llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI, intValue + 1);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, 2);
            }
            else {
                final Iterator iterator = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
                while (iterator.hasNext()) {
                    if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iterator.next())).llIllIIIIIllIlIIIIlI() == this.IlllIIIIlIIIlIlIlIIl) {
                        return;
                    }
                }
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random));
                final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI)) {
                    illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, this.IlllIIIIlIIIlIlIlIIl.lllIllIIIllllllIllll());
                }
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI, Math.min(7, (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI) + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, 2, 5))), 2);
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() != this) {
            return super.IlIlIIIllIllIIIIIllI(llIIlIIIlIIIllIlIIIl);
        }
        final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI);
        return intValue * 32 << 16 | 255 - intValue * 8 << 8 | intValue * 4;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        final float n = 0.125f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.25f, 0.5f + n);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.lIllllllIIllIlIlIlII = ((int)lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI) * 2 + 2) / 16.0f;
        final float n = 0.125f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, (float)this.lIllllllIIllIlIlIlII, 0.5f + n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n, n2);
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final IlIIIlIlIIIllIlIlIIl illIllIIIIlIIlIlllII = this.IllIllIIIIlIIlIlllII();
            if (illIllIIIIlIIlIlllII != null) {
                final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI);
                for (int i = 0; i < 3; ++i) {
                    if (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(15) <= intValue) {
                        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(illIllIIIIlIIlIlllII));
                    }
                }
            }
        }
    }
    
    protected IlIIIlIlIIIllIlIlIIl IllIllIIIIlIIlIlllII() {
        return (this.IlllIIIIlIIIlIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.k : ((this.IlllIIIIlIIIlIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.o) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.l : null);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return null;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIIIlIlIIIllIlIlIIl illIllIIIIlIIlIlllII = this.IllIllIIIIlIIlIlllII();
        return (illIllIIIIlIIlIlllII != null) ? illIllIIIIlIIlIlllII : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI) != 7;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return true;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cr.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { cr.IIIIIIIIIlllIllIlIlI, cr.IIllllIIIlIIIIIIllIl });
    }
}
