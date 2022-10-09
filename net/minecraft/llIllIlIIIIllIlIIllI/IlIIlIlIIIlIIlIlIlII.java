package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;

public class IlIIlIlIIIlIIlIlIlII extends IlIIIlIlIIIllIlIlIIl
{
    @Override
    public boolean lIIIIlIIIIIlllIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return false;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (this.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl).IlIlIIIllIllIIIIIllI() > 0) ? net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl : super.lIIIlllIIIllIIIllIII(lllIIIIlIlIllIIlIIIl);
    }
    
    public IlIlIIIlIIlIlIIlllIl llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
        return (IlIlIIIlIIlIlIIlllIl)((llllIIllllIlIlIIIIll != null && llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("StoredEnchantments", 9)) ? llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll("StoredEnchantments") : new IlIlIIIlIIlIlIIlllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll, list, b);
        final IlIlIIIlIIlIlIIlllIl llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl);
        if (llIllIlIIIIllIlIIllI != null) {
            for (int i = 0; i < llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI(); ++i) {
                final short ilIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("id");
                final short ilIlIIIllIllIIIIIllI2 = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("lvl");
                if (net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI) != null) {
                    list.add(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI).IlIIIlIlIIIllIlIlIIl(ilIlIIIllIllIIIIIllI2));
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final IlIlIIIlIIlIlIIlllIl llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl);
        boolean b = true;
        for (int i = 0; i < llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(i);
            if (ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI("id") == llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl) {
                if (ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI("lvl") < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("lvl", (short)llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
                }
                b = false;
                break;
            }
        }
        if (b) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", (short)llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("lvl", (short)llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
            llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        }
        if (!lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(new IIIIlllIIIIIIlIIIlll());
        }
        lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll("StoredEnchantments", llIllIlIIIIllIlIIllI);
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(this);
        this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIlIlllIlIIIIIl);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        for (int i = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(); i <= llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(); ++i) {
            list.add(this.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll, i)));
        }
    }
    
    public k llllIIIIlIIIlIlllIll(final Random random) {
        return this.llllIIIIlIIIlIlllIll(random, 1, 1, 1);
    }
    
    public k llllIIIIlIIIlIlllIll(final Random random, final int n, final int n2, final int n3) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll, 1, 0);
        net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(random, lllIIIIlIlIllIIlIIIl, 30);
        return new k(lllIIIIlIlIllIIlIIIl, n, n2, n3);
    }
}
