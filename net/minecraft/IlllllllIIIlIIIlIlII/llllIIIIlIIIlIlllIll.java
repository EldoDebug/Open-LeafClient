package net.minecraft.IlllllllIIIlIIIlIlII;

public class llllIIIIlIIIlIlllIll
{
    public final double llllIIIIlIIIlIlllIll;
    public final double IlIlIlIlIlllllllllIl;
    public final double llIllIIIIIllIlIIIIlI;
    public final double IlIIIlIlIIIllIlIlIIl;
    public final double IlIlIIIllIllIIIIIllI;
    public final double IllIIlllIIIIlllIIlIl;
    
    public llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.llllIIIIlIIIlIlllIll = Math.min(n, n4);
        this.IlIlIlIlIlllllllllIl = Math.min(n2, n5);
        this.llIllIIIIIllIlIIIIlI = Math.min(n3, n6);
        this.IlIIIlIlIIIllIlIlIIl = Math.max(n, n4);
        this.IlIlIIIllIllIIIIIllI = Math.max(n2, n5);
        this.IllIIlllIIIIlllIIlIl = Math.max(n3, n6);
    }
    
    public llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        this.llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII();
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII();
        this.IllIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl();
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        double llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        double ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        double llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        double ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        double ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
        double illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
        if (n < 0.0) {
            llllIIIIlIIIlIlllIll += n;
        }
        else if (n > 0.0) {
            ilIIIlIlIIIllIlIlIIl += n;
        }
        if (n2 < 0.0) {
            ilIlIlIlIlllllllllIl += n2;
        }
        else if (n2 > 0.0) {
            ilIlIIIllIllIIIIIllI += n2;
        }
        if (n3 < 0.0) {
            llIllIIIIIllIlIIIIlI += n3;
        }
        else if (n3 > 0.0) {
            illIIlllIIIIlllIIlIl += n3;
        }
        return new llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl);
    }
    
    public llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        return new llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll - n, this.IlIlIlIlIlllllllllIl - n2, this.llIllIIIIIllIlIIIIlI - n3, this.IlIIIlIlIIIllIlIlIIl + n, this.IlIlIIIllIllIIIIIllI + n2, this.IllIIlllIIIIlllIIlIl + n3);
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new llllIIIIlIIIlIlllIll(Math.min(this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll), Math.min(this.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), Math.min(this.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI), Math.max(this.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), Math.max(this.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI), Math.max(this.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return new llllIIIIlIIIlIlllIll(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6), Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final double n, final double n2, final double n3) {
        return new llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll + n, this.IlIlIlIlIlllllllllIl + n2, this.llIllIIIIIllIlIIIIlI + n3, this.IlIIIlIlIIIllIlIlIIl + n, this.IlIlIIIllIllIIIIIllI + n2, this.IllIIlllIIIIlllIIlIl + n3);
    }
    
    public double llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, double n) {
        if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI > this.IlIlIlIlIlllllllllIl && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl < this.IlIlIIIllIllIIIIIllI && llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl > this.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI < this.IllIIlllIIIIlllIIlIl) {
            if (n > 0.0 && llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl <= this.llllIIIIlIIIlIlllIll) {
                final double n2 = this.llllIIIIlIIIlIlllIll - llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
                if (n2 < n) {
                    n = n2;
                }
            }
            else if (n < 0.0 && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll >= this.IlIIIlIlIIIllIlIlIIl) {
                final double n3 = this.IlIIIlIlIIIllIlIlIIl - llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
                if (n3 > n) {
                    n = n3;
                }
            }
            return n;
        }
        return n;
    }
    
    public double IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, double n) {
        if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl > this.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll < this.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl > this.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI < this.IllIIlllIIIIlllIIlIl) {
            if (n > 0.0 && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI <= this.IlIlIlIlIlllllllllIl) {
                final double n2 = this.IlIlIlIlIlllllllllIl - llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
                if (n2 < n) {
                    n = n2;
                }
            }
            else if (n < 0.0 && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl >= this.IlIlIIIllIllIIIIIllI) {
                final double n3 = this.IlIlIIIllIllIIIIIllI - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
                if (n3 > n) {
                    n = n3;
                }
            }
            return n;
        }
        return n;
    }
    
    public double llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, double n) {
        if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl > this.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll < this.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI > this.IlIlIlIlIlllllllllIl && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl < this.IlIlIIIllIllIIIIIllI) {
            if (n > 0.0 && llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl <= this.llIllIIIIIllIlIIIIlI) {
                final double n2 = this.llIllIIIIIllIlIIIIlI - llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
                if (n2 < n) {
                    n = n2;
                }
            }
            else if (n < 0.0 && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI >= this.IllIIlllIIIIlllIIlIl) {
                final double n3 = this.IllIIlllIIIIlllIIlIl - llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
                if (n3 > n) {
                    n = n3;
                }
            }
            return n;
        }
        return n;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl > this.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll < this.IlIIIlIlIIIllIlIlIIl && (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI > this.IlIlIlIlIlllllllllIl && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl < this.IlIlIIIllIllIIIIIllI) && (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl > this.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI < this.IllIIlllIIIIlllIIlIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final e e) {
        return e.llllIIIIlIIIlIlllIll > this.llllIIIIlIIIlIlllIll && e.llllIIIIlIIIlIlllIll < this.IlIIIlIlIIIllIlIlIIl && (e.IlIlIlIlIlllllllllIl > this.IlIlIlIlIlllllllllIl && e.IlIlIlIlIlllllllllIl < this.IlIlIIIllIllIIIIIllI) && (e.llIllIIIIIllIlIIIIlI > this.llIllIIIIIllIlIIIIlI && e.llIllIIIIIllIlIIIIlI < this.IllIIlllIIIIlllIIlIl);
    }
    
    public double llllIIIIlIIIlIlllIll() {
        return (this.IlIIIlIlIIIllIlIlIIl - this.llllIIIIlIIIlIlllIll + (this.IlIlIIIllIllIIIIIllI - this.IlIlIlIlIlllllllllIl) + (this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI)) / 3.0;
    }
    
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final double n, final double n2, final double n3) {
        return new llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll + n, this.IlIlIlIlIlllllllllIl + n2, this.llIllIIIIIllIlIIIIlI + n3, this.IlIIIlIlIIIllIlIlIIl - n, this.IlIlIIIllIllIIIIIllI - n2, this.IllIIlllIIIIlllIIlIl - n3);
    }
    
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(final e e, final e e2) {
        e llllIIIIlIIIlIlllIll = e.llllIIIIlIIIlIlllIll(e2, this.llllIIIIlIIIlIlllIll);
        e llllIIIIlIIIlIlllIll2 = e.llllIIIIlIIIlIlllIll(e2, this.IlIIIlIlIIIllIlIlIIl);
        e ilIlIlIlIlllllllllIl = e.IlIlIlIlIlllllllllIl(e2, this.IlIlIlIlIlllllllllIl);
        e ilIlIlIlIlllllllllIl2 = e.IlIlIlIlIlllllllllIl(e2, this.IlIlIIIllIllIIIIIllI);
        e llIllIIIIIllIlIIIIlI = e.llIllIIIIIllIlIIIIlI(e2, this.llIllIIIIIllIlIIIIlI);
        e llIllIIIIIllIlIIIIlI2 = e.llIllIIIIIllIlIIIIlI(e2, this.IllIIlllIIIIlllIIlIl);
        if (!this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll)) {
            llllIIIIlIIIlIlllIll = null;
        }
        if (!this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2)) {
            llllIIIIlIIIlIlllIll2 = null;
        }
        if (!this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl)) {
            ilIlIlIlIlllllllllIl = null;
        }
        if (!this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2)) {
            ilIlIlIlIlllllllllIl2 = null;
        }
        if (!this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI)) {
            llIllIIIIIllIlIIIIlI = null;
        }
        if (!this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI2)) {
            llIllIIIIIllIlIIIIlI2 = null;
        }
        e e3 = null;
        if (llllIIIIlIIIlIlllIll != null) {
            e3 = llllIIIIlIIIlIlllIll;
        }
        if (llllIIIIlIIIlIlllIll2 != null && (e3 == null || e.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2) < e.llllIIIlIlllIlIIIIIl(e3))) {
            e3 = llllIIIIlIIIlIlllIll2;
        }
        if (ilIlIlIlIlllllllllIl != null && (e3 == null || e.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl) < e.llllIIIlIlllIlIIIIIl(e3))) {
            e3 = ilIlIlIlIlllllllllIl;
        }
        if (ilIlIlIlIlllllllllIl2 != null && (e3 == null || e.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl2) < e.llllIIIlIlllIlIIIIIl(e3))) {
            e3 = ilIlIlIlIlllllllllIl2;
        }
        if (llIllIIIIIllIlIIIIlI != null && (e3 == null || e.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI) < e.llllIIIlIlllIlIIIIIl(e3))) {
            e3 = llIllIIIIIllIlIIIIlI;
        }
        if (llIllIIIIIllIlIIIIlI2 != null && (e3 == null || e.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI2) < e.llllIIIlIlllIlIIIIIl(e3))) {
            e3 = llIllIIIIIllIlIIIIlI2;
        }
        if (e3 == null) {
            return null;
        }
        lllIllIIIllllllIllll lllIllIIIllllllIllll;
        if (e3 == llllIIIIlIIIlIlllIll) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
        }
        else if (e3 == llllIIIIlIIIlIlllIll2) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
        }
        else if (e3 == ilIlIlIlIlllllllllIl) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
        }
        else if (e3 == ilIlIlIlIlllllllllIl2) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
        }
        else if (e3 == llIllIIIIIllIlIIIIlI) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
        }
        else {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
        }
        return new llIlllIlllllIIllIIII(e3, lllIllIIIllllllIllll);
    }
    
    private boolean IlIlIlIlIlllllllllIl(final e e) {
        return e != null && (e.IlIlIlIlIlllllllllIl >= this.IlIlIlIlIlllllllllIl && e.IlIlIlIlIlllllllllIl <= this.IlIlIIIllIllIIIIIllI && e.llIllIIIIIllIlIIIIlI >= this.llIllIIIIIllIlIIIIlI && e.llIllIIIIIllIlIIIIlI <= this.IllIIlllIIIIlllIIlIl);
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final e e) {
        return e != null && (e.llllIIIIlIIIlIlllIll >= this.llllIIIIlIIIlIlllIll && e.llllIIIIlIIIlIlllIll <= this.IlIIIlIlIIIllIlIlIIl && e.llIllIIIIIllIlIIIIlI >= this.llIllIIIIIllIlIIIIlI && e.llIllIIIIIllIlIIIIlI <= this.IllIIlllIIIIlllIIlIl);
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final e e) {
        return e != null && (e.llllIIIIlIIIlIlllIll >= this.llllIIIIlIIIlIlllIll && e.llllIIIIlIIIlIlllIll <= this.IlIIIlIlIIIllIlIlIIl && e.IlIlIlIlIlllllllllIl >= this.IlIlIlIlIlllllllllIl && e.IlIlIlIlIlllllllllIl <= this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public String toString() {
        return "box[" + this.llllIIIIlIIIlIlllIll + ", " + this.IlIlIlIlIlllllllllIl + ", " + this.llIllIIIIIllIlIIIIlI + " -> " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + ", " + this.IllIIlllIIIIlllIIlIl + "]";
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return Double.isNaN(this.llllIIIIlIIIlIlllIll) || Double.isNaN(this.IlIlIlIlIlllllllllIl) || Double.isNaN(this.llIllIIIIIllIlIIIIlI) || Double.isNaN(this.IlIIIlIlIIIllIlIlIIl) || Double.isNaN(this.IlIlIIIllIllIIIIIllI) || Double.isNaN(this.IllIIlllIIIIlllIIlIl);
    }
}
