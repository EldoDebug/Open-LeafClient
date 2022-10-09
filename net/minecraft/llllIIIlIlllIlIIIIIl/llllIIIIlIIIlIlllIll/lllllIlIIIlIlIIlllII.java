package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lllllIlIIIlIlIIlllII extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private IllIIlllIIIIlllIIlIl IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private List IllIIlllIIIIlllIIlIl;
    
    public lllllIlIIIlIlIIlllII(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final boolean ilIlIIIllIllIIIIIllI) {
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(1);
        if (!(llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII() instanceof net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        this.lIIIIlIIIIIlllIllIII();
        if (this.IlIlIIIllIllIIIIIllI && this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI()) {
            return false;
        }
        final net.minecraft.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll), 0);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (this.IlIIIlIlIIIllIlIlIIl == null) {
            return false;
        }
        final net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII();
        final boolean ilIlIIIllIIllIlllllI = illIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI();
        illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(false);
        this.llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl());
        illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI);
        if (this.llIllIIIIIllIlIIIIlI != null) {
            return true;
        }
        final e llllIIIIlIIIlIlllIll2 = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 10, 7, new e(this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl().lIIIIlIIIIIlllIllIII(), this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl().lIIIlllIIIllIIIllIII(), this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl().llIIlIIIlIIIllIlIIIl()));
        if (llllIIIIlIIIlIlllIll2 == null) {
            return false;
        }
        illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(false);
        this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI);
        illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI);
        return this.llIllIIIIIllIlIIIIlI != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        if (this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl()) {
            return false;
        }
        final float n = this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII + 4.0f;
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl()) > n * n;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl() || this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl()) < 16.0) {
            this.IllIIlllIIIIlllIIlIl.add(this.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    private IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final net.minecraft.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = null;
        int n = Integer.MAX_VALUE;
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 : llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl()) {
            final int llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII));
            if (llllIIIIlIIIlIlllIll < n && !this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl2)) {
                illIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
                n = llllIIIIlIIIlIlllIll;
            }
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final Iterator<IllIIlllIIIIlllIIlIl> iterator = this.IllIIlllIIIIlllIIlIl.iterator();
        while (iterator.hasNext()) {
            if (illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl().equals(iterator.next().IlIIIlIlIIIllIlIlIIl())) {
                return true;
            }
        }
        return false;
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        if (this.IllIIlllIIIIlllIIlIl.size() > 15) {
            this.IllIIlllIIIIlllIIlIl.remove(0);
        }
    }
}
