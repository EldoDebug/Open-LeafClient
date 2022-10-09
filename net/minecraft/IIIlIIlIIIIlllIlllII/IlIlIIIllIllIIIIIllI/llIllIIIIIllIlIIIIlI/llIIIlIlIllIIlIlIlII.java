package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIIIlIlIllIIlIlIlII extends IlllllllIIIlIIIlIlII
{
    private List llllIIIIlIIIlIlllIll;
    
    public llIIIlIlIllIIlIlIlII() {
        this.llllIIIIlIIIlIlllIll = Lists.newLinkedList();
    }
    
    public llIIIlIlIllIIlIlIlII(final int n, final Random random, final int n2, final int n3) {
        super(n);
        this.llllIIIIlIIIlIlllIll = Lists.newLinkedList();
        this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n2, 50, n3, n2 + 7 + random.nextInt(6), 54 + random.nextInt(6), n3 + 7 + random.nextInt(6));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        int n = this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl() - 3 - 1;
        if (n <= 0) {
            n = 1;
        }
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(); i += 4) {
            i += random.nextInt(this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI());
            if (i + 3 > this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()) {
                break;
            }
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + i, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + random.nextInt(n) + 1, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
            if (llllIIIIlIIIlIlllIll != null) {
                final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                this.llllIIIIlIIIlIlllIll.add(new IlIlIIIlIIlIlIIlllIl(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1));
            }
        }
        for (int j = 0; j < this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(); j += 4) {
            j += random.nextInt(this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI());
            if (j + 3 > this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()) {
                break;
            }
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll2 = IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + j, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + random.nextInt(n) + 1, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
            if (llllIIIIlIIIlIlllIll2 != null) {
                final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
                this.llllIIIIlIIIlIlllIll.add(new IlIlIIIlIIlIlIIlllIl(llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 1, llIllIIIIIllIlIIIIlI2.IlIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl));
            }
        }
        for (int k = 0; k < this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(); k += 4) {
            k += random.nextInt(this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI());
            if (k + 3 > this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI()) {
                break;
            }
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll3 = IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + random.nextInt(n) + 1, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + k, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
            if (llllIIIIlIIIlIlllIll3 != null) {
                final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI();
                this.llllIIIIlIIIlIlllIll.add(new IlIlIIIlIIlIlIIlllIl(this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI3.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI3.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, llIllIIIIIllIlIIIIlI3.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl));
            }
        }
        for (int l = 0; l < this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(); l += 4) {
            l += random.nextInt(this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI());
            if (l + 3 > this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI()) {
                break;
            }
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll4 = IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + random.nextInt(n) + 1, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + l, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
            if (llllIIIIlIIIlIlllIll4 != null) {
                final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI4 = llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI();
                this.llllIIIIlIIIlIlllIll.add(new IlIlIIIlIIlIlIIlllIl(this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 1, llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI4.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI4.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI4.IllIIlllIIIIlllIIlIl));
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), true);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 1, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, Math.min(this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 3, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI), this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        for (final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 : this.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, ilIlIIIlIIlIlIIlllIl2.llllIIIIlIIIlIlllIll, ilIlIIIlIIlIlIIlllIl2.IlIlIIIllIllIIIIIllI - 2, ilIlIIIlIIlIlIIlllIl2.llIllIIIIIllIlIIIIlI, ilIlIIIlIIlIlIIlllIl2.IlIIIlIlIIIllIlIlIIl, ilIlIIIlIIlIlIIlllIl2.IlIlIIIllIllIIIIIllI, ilIlIIIlIIlIlIIlllIl2.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + 4, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        final Iterator<IlIlIIIlIIlIlIIlllIl> iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2, n3);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl();
        final Iterator<IlIlIIIlIIlIlIIlllIl> iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iterator.next().llllIIIlIlllIlIIIIIl());
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Entrances", ilIlIIIlIIlIlIIlllIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Entrances", 11);
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            this.llllIIIIlIIIlIlllIll.add(new IlIlIIIlIIlIlIIlllIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(i)));
        }
    }
}
