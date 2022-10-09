package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class IIlllIIIlIlllIIlllII extends IlIIIlIlIIIllIlIlIIl
{
    protected final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    
    public IIlllIIIlIlllIIlllII(final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public IIlllIIIlIlllIIlllII IlIIIlIlIIIllIlIlIIl(final String s) {
        super.IlIlIlIlIlllllllllIl(s);
        return this;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
            llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
            return false;
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll2, false, lllIllIIIllllllIllll, null, lllIIIIlIlIllIIlIIIl)) {
            if (illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, n, n2, n3, this.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()), llllIIIIlIIIlIlllIll), 3)) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == this.llllIIIlIlllIlIIIIIl) {
                    llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, lllIIIIlIlIllIIlIIIl);
                    this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, lllIIIIlIlIllIIlIIIl);
                }
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + 0.5f, llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() + 0.5f, llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + 0.5f, this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(), (this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() + 1.0f) / 2.0f, this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.8f);
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            return true;
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        if (iiiiIllIIIIlIIIIllIl == null) {
            return false;
        }
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll() && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("BlockEntityTag", 10)) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll2 != null) {
                if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llllIIIIlIIIlIlllIll2.IlIlIIIIIIlllIlIllIl() && !iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll.r())) {
                    return false;
                }
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = (IIIIlllIIIIIIlIIIlll)iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll((IIIIlllIIIIIIlIIIlll)lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll("BlockEntityTag"));
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("x", ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("y", ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("z", ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
                if (!iiiIlllIIIIIIlIIIlll.equals(iiiIlllIIIIIIlIIIlll2)) {
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
                    llllIIIIlIIIlIlllIll2.llIIIlIlIllIIlIlIlII();
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) {
            ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
        }
        else if (!llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll)) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        return illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll, false, ilIlIlIlIlllllllllIl, null, lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.llllIIIlIlllIlIIIIIl.lIllllllIIllIlIlIlII();
    }
    
    @Override
    public String lIIIIlIIIIIlllIllIII() {
        return this.llllIIIlIlllIlIIIIIl.lIllllllIIllIlIlIlII();
    }
    
    @Override
    public net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll IIIIlllIIIIIIlIIIlll() {
        return this.llllIIIlIlllIlIIIIIl.IIIllllllIllIIIlllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, list);
    }
    
    public llllIIIIlIIIlIlllIll lllIIIIlllllIlIIllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
