package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import org.apache.commons.lang3.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;

public abstract class IlIIlIlIIIlIIlIlIlII extends IlIlIIIllIllIIIIIllI
{
    protected final llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI;
    protected boolean IllIIlllIIIIlllIIlIl;
    private boolean llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IlIIlIlIIIlIIlIlIlII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        this(llIIlIIIlIIIllIlIIIl, b, false);
    }
    
    public IlIIlIlIIIlIIlIlIlII(final llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI, final boolean illIIlllIIIIlllIIlIl, final boolean llllIIIIlIIIlIlllIll) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IlIlIIIllIllIIIIIllI.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return false;
        }
        if (!iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII()) {
            return false;
        }
        final IlIlIIIllIIllIlllllI w = this.IlIlIIIllIllIIIIIllI.w();
        final IlIlIIIllIIllIlllllI w2 = iIlllIIIlIlllIIlllII.w();
        if (w != null && w2 == w) {
            return false;
        }
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        if (this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(iIlllIIIlIlllIIlllII) > liiiIlIIIIIlllIllIII * liiiIlIIIIIlllIllIII) {
            return false;
        }
        if (this.IllIIlllIIIIlllIIlIl) {
            if (this.IlIlIIIllIllIIIIIllI.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII)) {
                this.IlIIIlIlIIIllIlIlIIl = 0;
            }
            else if (++this.IlIIIlIlIIIllIlIlIIl > 60) {
                return false;
            }
        }
        return !(iIlllIIIlIlllIIlllII instanceof llllIIIIlIIIlIlllIll) || !((llllIIIIlIIIlIlllIll)iIlllIIIlIlllIIlllII).K.llllIIIIlIIIlIlllIll;
    }
    
    protected double lIIIIlIIIIIlllIllIII() {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl);
        return (llllIIIIlIIIlIlllIll == null) ? 16.0 : llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)null);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final boolean b, final boolean b2) {
        if (lllIIIIlllllIlIIllIl == null) {
            return false;
        }
        if (lllIIIIlllllIlIIllIl == ilIllIlIlIIIlIlIlIII) {
            return false;
        }
        if (!lllIIIIlllllIlIIllIl.llllIllllIllllIlIlII()) {
            return false;
        }
        if (!ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.getClass())) {
            return false;
        }
        final IlIlIIIllIIllIlllllI w = ilIllIlIlIIIlIlIlIII.w();
        final IlIlIIIllIIllIlllllI w2 = lllIIIIlllllIlIIllIl.w();
        if (w != null && w2 == w) {
            return false;
        }
        if (ilIllIlIlIIIlIlIlIII instanceof lIllllllIIllIlIlIlII && StringUtils.isNotEmpty((CharSequence)((lIllllllIIllIlIlIlII)ilIllIlIlIIIlIlIlIII).IlIlIlIlIlllllllllIl())) {
            if (lllIIIIlllllIlIIllIl instanceof lIllllllIIllIlIlIlII && ((lIllllllIIllIlIlIlII)ilIllIlIlIIIlIlIlIII).IlIlIlIlIlllllllllIl().equals(((lIllllllIIllIlIlIlII)lllIIIIlllllIlIIllIl).IlIlIlIlIlllllllllIl())) {
                return false;
            }
            if (lllIIIIlllllIlIIllIl == ((lIllllllIIllIlIlIlII)ilIllIlIlIIIlIlIlIII).llIllIIIIIllIlIIIIlI()) {
                return false;
            }
        }
        else if (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll && !b && ((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).K.llllIIIIlIIIlIlllIll) {
            return false;
        }
        return !b2 || ilIllIlIlIIIlIlIlIII.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final boolean b) {
        if (!llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, lllIIIIlllllIlIIllIl, b, this.IllIIlllIIIIlllIIlIl)) {
            return false;
        }
        if (!this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(new IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl))) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll) {
            if (--this.llIllIIIIIllIlIIIIlI <= 0) {
                this.IlIlIlIlIlllllllllIl = 0;
            }
            if (this.IlIlIlIlIlllllllllIl == 0) {
                this.IlIlIlIlIlllllllllIl = (this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl) ? 1 : 2);
            }
            if (this.IlIlIlIlIlllllllllIl == 2) {
                return false;
            }
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        this.llIllIIIIIllIlIIIIlI = 10 + this.IlIlIIIllIllIIIIIllI.B().nextInt(5);
        final net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        final lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == null) {
            return false;
        }
        final int n = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll - llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl);
        final int n2 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI - llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII);
        return n * n + n2 * n2 <= 2.25;
    }
}
