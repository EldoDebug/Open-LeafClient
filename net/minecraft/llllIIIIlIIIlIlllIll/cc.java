package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public abstract class cc extends llllIIIIlIIIlIlllIll
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("half", cd.class);
    }
    
    public cc(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
        if (this.IllIllIIIIlIIlIlllII()) {
            this.IlIllIlIlIIIlIlIlIII = true;
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.IlIIIlIlIIIllIlIlIIl(255);
    }
    
    @Override
    protected boolean IIlllIlIIllIlIlIlIIl() {
        return false;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IllIllIIIIlIIlIlllII()) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
                if (ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll) {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
                }
            }
        }
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        if (this.IllIllIIIIlIIlIlllII()) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3, n4, lllIIIIlllllIlIIllIl).llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI, cd.IlIlIlIlIlllllllllIl);
        return this.IllIllIIIIlIIlIlllII() ? llllIIIIlIIIlIlllIll : ((lllIllIIIllllllIllll != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || n2 <= 0.5)) ? llllIIIIlIIIlIlllIll : llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI, cd.llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return this.IllIllIIIIlIIlIlllII() ? 2 : 1;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (this.IllIllIIIIlIIlIlllII()) {
            return super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
        }
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && lllIllIIIllllllIllll != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && !super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll)) {
            return false;
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI());
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        final boolean b = llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI()) && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll;
        return (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI()) && ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll) ? (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll)) || !llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI()) || !b) : (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll)) || !llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI()) || b);
    }
    
    protected static boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT;
    }
    
    public abstract String IlIlIIIllIllIIIIIllI(final int p0);
    
    @Override
    public int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return super.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) & 0x7;
    }
    
    public abstract boolean IllIllIIIIlIIlIlllII();
    
    public abstract net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll IlIllllIIlIIlIlIlIll();
    
    public abstract Object llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl p0);
}
