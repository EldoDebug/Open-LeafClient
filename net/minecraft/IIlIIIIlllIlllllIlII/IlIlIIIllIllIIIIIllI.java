package net.minecraft.IIlIIIIlllIlllllIlII;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIlIIIllIllIIIIIllI extends llllllIllIllIlIllllI
{
    private IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private final List IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public IlIlIIIllIllIIIIIllI(final String s) {
        super(s);
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
    }
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl) {
        super(llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII));
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final Iterator<llIllIIIIIllIlIIIIlI> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.llIllIIIIIllIlIIIIlI.size() <= 64 && !this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl)) {
            this.llIllIIIIIllIlIIIIlI.add(ilIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        ++this.IllIIlllIIIIlllIIlIl;
        final Iterator<llIllIIIIIllIlIIIIlI> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
        }
        this.llIllIIIIIllIlIIIIlI();
        this.IllIIlllIIIIlllIIlIl();
        this.llllIIIlIlllIlIIIIIl();
        if (this.IllIIlllIIIIlllIIlIl % 400 == 0) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        final Iterator<llIllIIIIIllIlIIIIlI> iterator = (Iterator<llIllIIIIIllIlIIIIlI>)this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().llllIIIlIlllIlIIIIIl()) {
                iterator.remove();
                this.IlIIIlIlIIIllIlIlIIl();
            }
        }
    }
    
    public List IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
        double n2 = 3.4028234663852886E38;
        for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 : this.IlIlIIIllIllIIIIIllI) {
            final double illIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll().IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
            if (illIIlllIIIIlllIIlIl < n2) {
                final float n3 = (float)(n + llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl());
                if (illIIlllIIIIlllIIlIl > n3 * n3) {
                    continue;
                }
                llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
                n2 = illIIlllIIIIlllIIlIl;
            }
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    private void IllIIlllIIIIlllIIlIl() {
        if (!this.llIllIIIIIllIlIIIIlI.isEmpty()) {
            this.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.remove(0));
        }
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.size(); ++i) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl.get(i);
            llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(), 32);
            if (llllIIIIlIIIlIlllIll == null) {
                llllIIIIlIIIlIlllIll = new llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl);
                this.IlIlIIIllIllIIIIIllI.add(llllIIIIlIIIlIlllIll);
                this.IlIIIlIlIIIllIlIlIIl();
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        }
        this.IlIIIlIlIIIllIlIlIIl.clear();
    }
    
    private void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = 16;
        final int n2 = 4;
        final int n3 = 16;
        for (int i = -n; i < n; ++i) {
            for (int j = -n2; j < n2; ++j) {
                for (int k = -n3; k < n3; ++k) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, j, k);
                    if (this.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll)) {
                        final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
                        if (llIllIIIIIllIlIIIIlI == null) {
                            this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
                        }
                        else {
                            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
                        }
                    }
                }
            }
        }
    }
    
    private IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl : this.IlIIIlIlIIIllIlIlIIl) {
            if (illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().lIIIIlIIIIIlllIllIII() == ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() && illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().llIIlIIIlIIIllIlIIIl() == ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() && Math.abs(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().lIIIlllIIIllIIIllIII() - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) <= 1) {
                return illIIlllIIIIlllIIlIl;
            }
        }
        final Iterator<llIllIIIIIllIlIIIIlI> iterator2 = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator2.hasNext()) {
            final IllIIlllIIIIlllIIlIl ilIIIlIlIIIllIlIlIIl = iterator2.next().IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                return ilIIIlIlIIIllIlIlIIl;
            }
        }
        return null;
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl = llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl((lIlIlIIIllIIllIIIllI)this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI();
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl, 5);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll + 1);
        if (llllIIIIlIIIlIlllIll != llllIIIIlIIIlIlllIll2) {
            this.IlIIIlIlIIIllIlIlIIl.add(new IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl, (llllIIIIlIIIlIlllIll < llllIIIIlIIIlIlllIll2) ? llllIIIlIlllIlIIIIIl : ilIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl));
        }
    }
    
    private int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n) {
        int n2 = 0;
        for (int i = 1; i <= 5; ++i) {
            if (this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, i)) && ++n2 >= n) {
                return n2;
            }
        }
        return n2;
    }
    
    private boolean IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final Iterator<IlIlIlIlIlllllllllIl> iterator = this.llIllIIIIIllIlIIIIlI.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(ilIlIlIlIlllllllllIl)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean IllIIlllIIIIlllIIlIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI instanceof llIlIIIIIlIIlIlIIlll && llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Tick");
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Villages", 10);
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = new llIllIIIIIllIlIIIIlI();
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            this.IlIlIIIllIllIIIIIllI.add(llIllIIIIIllIlIIIIlI2);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Tick", this.IllIIlllIIIIlllIIlIl);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : this.IlIlIIIllIllIIIIIllI) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Villages", ilIlIIIlIIlIlIIlllIl);
    }
    
    public static String llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        return "villages" + lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
    }
}
