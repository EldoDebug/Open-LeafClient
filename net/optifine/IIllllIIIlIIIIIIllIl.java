package net.optifine;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class IIllllIIIlIIIIIIllIl
{
    private llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private long lIIIIlIIIIIlllIllIII;
    private Set lIIIlllIIIllIIIllIII;
    private llllIIIlIlllIlIIIIIl llIIlIIIlIIIllIlIIIl;
    
    public IIllllIIIlIIIIIIllIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = 0.0;
        this.llIllIIIIIllIlIIIIlI = -2.147483648E9;
        this.IlIIIlIlIIIllIlIlIIl = -2.147483648E9;
        this.IlIlIIIllIllIIIIIllI = -2.147483648E9;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.llllIIIlIlllIlIIIIIl = false;
        this.lIIIIlIIIIIlllIllIII = 0L;
        this.lIIIlllIIIllIIIllIII = new HashSet();
        this.llIIlIIIlIIIllIlIIIl = new llllIIIlIlllIlIIIIIl();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.y()) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.lIIIIlIIIIIlllIllIII + 500L) {
                return;
            }
            this.lIIIIlIIIIIlllIllIII = currentTimeMillis;
        }
        final double llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - 0.5;
        final double ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII - 0.5 + this.IlIlIlIlIlllllllllIl;
        final double ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - 0.5;
        final int llllIIIIlIIIlIlllIll = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        final double n = llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI;
        final double n2 = ilIIIlIlIIIllIlIlIIl - this.IlIIIlIlIIIllIlIlIIl;
        final double n3 = ilIlIIIllIllIIIIIllI - this.IlIlIIIllIllIIIIIllI;
        final double n4 = 0.1;
        if (Math.abs(n) > n4 || Math.abs(n2) > n4 || Math.abs(n3) > n4 || this.IllIIlllIIIIlllIIlIl != llllIIIIlIIIlIlllIll) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll;
            this.llllIIIlIlllIlIIIIIl = false;
            final llIIlIIIlIIIllIlIIIl ilIlIIIIIIlllIlIllIl = lllllIIIIIlIlIIIIIIl.IlIlIIIIIIlllIlIllIl();
            if (ilIlIIIIIIlllIlIllIl != null) {
                this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI));
                this.llllIIIlIlllIlIIIIIl = (ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
            }
            final HashSet liiIlllIIIllIIIllIII = new HashSet();
            if (llllIIIIlIIIlIlllIll > 0) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll = ((llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI) & 0xF) >= 8) ? net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl : net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
                final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = ((llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl) & 0xF) >= 8) ? net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl : net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
                final lllIllIIIllllllIllll lllIllIIIllllllIllll3 = ((llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI) & 0xF) >= 8) ? net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl : net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI);
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI2 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI3 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2);
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI4 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll3));
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI5 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI3, llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll3));
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll2);
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI6 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3);
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI6, llllIIIIlIIIlIlllIll3, lllIllIIIllllllIllll);
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI7 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4);
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI8 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI6, llllIIIIlIIIlIlllIll3, lllIllIIIllllllIllll3));
                final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI9 = lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI7, llllIIIIlIIIlIlllIll4, lllIllIIIllllllIllll3));
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI3, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI4, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI5, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI6, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI7, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI8, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI9, this.lIIIlllIIIllIIIllIII, liiIlllIIIllIIIllIII);
            }
            this.IlIlIlIlIlllllllllIl(lllllIIIIIlIlIIIIIIl);
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        }
    }
    
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (ilIllIlIlIIIlIlIlIII != null) ? ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll) : ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, 16);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final Set set, final Set set2) {
        if (ilIllIlIlIIIlIlIlIII != null) {
            final llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl = ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl != null && !llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) {
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(true);
            }
            final IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII();
            if (set != null) {
                set.remove(liiIlllIIIllIIIllIII);
            }
            if (set2 != null) {
                set2.add(liiIlllIIIllIIIllIII);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        final Iterator<IlIlIlIlIlllllllllIl> iterator = this.lIIIlllIIIllIIIllIII.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI(iterator.next()), null, (Set)null);
        }
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public double IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public double llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public double llllIIIlIlllIlIIIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        return "Entity: " + this.llllIIIIlIIIlIlllIll + ", offsetY: " + this.IlIlIlIlIlllllllllIl;
    }
}
