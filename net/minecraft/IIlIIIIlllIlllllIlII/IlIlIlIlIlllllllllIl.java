package net.minecraft.IIlIIIIlllIlllllIlII;

import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIlIlIlIlllllllllIl extends ArrayList
{
    public IlIlIlIlIlllllllllIl() {
    }
    
    public IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2, final int n) {
        if (n > 0 && n < this.size()) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.get(n);
            return (!this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) || ((lllIIIIlIlIllIIlIIIl2 != null || llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) && (!llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() || !this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()))) || lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl < llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl || (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() && lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl < llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl)) ? null : llllIIIIlIIIlIlllIll;
        }
        for (int i = 0; i < this.size(); ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.get(i);
            if (this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll()) && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl >= llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl && ((!llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() && lllIIIIlIlIllIIlIIIl2 == null) || (llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() && this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl()) && lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl >= llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl))) {
                return llllIIIIlIIIlIlllIll2;
            }
        }
        return null;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2) && (!lllIIIIlIlIllIIlIIIl2.IIIIlllIIIIIIlIIIlll() || (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll() && IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2.llllIIllllIlIlIIIIll(), lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll(), false)));
    }
    
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte((byte)(this.size() & 0xFF));
        for (int i = 0; i < this.size(); ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.get(i);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
            final lllIIIIlIlIllIIlIIIl ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            llllllIllIllIlIllllI.writeBoolean(ilIlIlIlIlllllllllIl != null);
            if (ilIlIlIlIlllllllllIl != null) {
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
            llllllIllIllIlIllllI.writeBoolean(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
            llllllIllIllIlIllllI.writeInt(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI());
            llllllIllIllIlIllllI.writeInt(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl());
        }
    }
    
    public static IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl();
        for (int n = llllllIllIllIlIllllI.readByte() & 0xFF, i = 0; i < n; ++i) {
            final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
            final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII2 = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
            lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII3 = null;
            if (llllllIllIllIlIllllI.readBoolean()) {
                liiiIlIIIIIlllIllIII3 = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
            }
            final boolean boolean1 = llllllIllIllIlIllllI.readBoolean();
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiiIlIIIIIlllIllIII3, liiiIlIIIIIlllIllIII2, llllllIllIllIlIllllI.readInt(), llllllIllIllIlIllllI.readInt());
            if (boolean1) {
                llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
            }
            ilIlIlIlIlllllllllIl.add(llllIIIIlIIIlIlllIll);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Recipes", 10);
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            this.add(new llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i)));
        }
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.size(); ++i) {
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(((llllIIIIlIIIlIlllIll)this.get(i)).llIllIlIIIIllIlIIllI());
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Recipes", ilIlIIIlIIlIlIIlllIl);
        return iiiIlllIIIIIIlIIIlll;
    }
}
