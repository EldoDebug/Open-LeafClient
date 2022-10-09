package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lIllllllIIllIlIlIlII extends IIlllIIIlIlllIIlllII
{
    public lIllllllIIllIlIlIlII() {
        super(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aO);
        this.IlIIIlIlIIIllIlIlIIl = 16;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll(true);
        this.IlIIIlIlIIIllIlIlIIl(0);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
            return false;
        }
        if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
            return false;
        }
        llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        if (!llllIIIIlIIIlIlllIll.aO.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll.aO.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cp.IIIIIIIIIlllIllIlIlI, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll + 180.0f) * 16.0f / 360.0f + 0.5) & 0xF), 3);
        }
        else {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll.aP.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dn.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll), 3);
        }
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        if (llllIIIIlIIIlIlllIll3 instanceof lIIIIlIIIIIlllIllIII) {
            ((lIIIIlIIIIIlllIllIII)llllIIIIlIIIlIlllIll3).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        }
        return true;
    }
    
    @Override
    public String llllIIIlIlllIlIIIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf("item.banner.") + this.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl).IlIIIlIlIIIllIlIlIIl() + ".name");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", false);
        if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI("Patterns")) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI("Patterns", 10);
            for (int n = 0; n < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() && n < 6; ++n) {
                final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n);
                final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("Color"));
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll4 = net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Pattern"));
                if (llllIIIIlIIIlIlllIll4 != null) {
                    list.add(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.banner." + llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll() + "." + llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl()));
                }
            }
        }
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        if (n == 0) {
            return 16777215;
        }
        return this.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl).IlIlIIIllIllIIIIIllI().IIIIIIIIIlllIllIlIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl[] values;
        for (int length = (values = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.values()).length, i = 0; i < length; ++i) {
            final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = values[i];
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), null);
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("BlockEntityTag", iiiIlllIIIIIIlIIIlll);
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
            lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll2);
            list.add(lllIIIIlIlIllIIlIIIl);
        }
    }
    
    @Override
    public net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll IIIIlllIIIIIIlIIIlll() {
        return net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
    }
    
    private net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", false);
        net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl;
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Base")) {
            ilIlIlIlIlllllllllIl = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl("Base"));
        }
        else {
            ilIlIlIlIlllllllllIl = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
        }
        return ilIlIlIlIlllllllllIl;
    }
}
