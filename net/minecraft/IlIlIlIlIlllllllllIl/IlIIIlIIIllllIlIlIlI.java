package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class IlIIIlIIIllllIlIlIlI
{
    double llllIIIIlIIIlIlllIll;
    double IlIlIlIlIlllllllllIl;
    
    IlIIIlIIIllllIlIlIlI() {
    }
    
    IlIIIlIIIllllIlIlIlI(final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    double llllIIIIlIIIlIlllIll(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        final double n = this.llllIIIIlIIIlIlllIll - ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll;
        final double n2 = this.IlIlIlIlIlllllllllIl - ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl;
        return Math.sqrt(n * n + n2 * n2);
    }
    
    void llllIIIIlIIIlIlllIll() {
        final double n = this.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll /= n;
        this.IlIlIlIlIlllllllllIl /= n;
    }
    
    float IlIlIlIlIlllllllllIl() {
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl);
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        this.llllIIIIlIIIlIlllIll -= ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl -= ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final double llllIIIIlIIIlIlllIll2, final double ilIlIlIlIlllllllllIl2) {
        boolean b = false;
        if (this.llllIIIIlIIIlIlllIll < llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
            b = true;
        }
        else if (this.llllIIIIlIIIlIlllIll > llllIIIIlIIIlIlllIll2) {
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
            b = true;
        }
        if (this.IlIlIlIlIlllllllllIl < ilIlIlIlIlllllllllIl) {
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            b = true;
        }
        else if (this.IlIlIlIlIlllllllllIl > ilIlIlIlIlllllllllIl2) {
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
            b = true;
        }
        return b;
    }
    
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, 256.0, this.IlIlIlIlIlllllllllIl);
        while (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 0) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                return ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1;
            }
        }
        return 257;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, 256.0, this.IlIlIlIlIlllllllllIl);
        while (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 0) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
            if (illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                return !illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() && illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll;
            }
        }
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final Random random, final double n, final double n2, final double n3, final double n4) {
        this.llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, n, n3);
        this.IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, n2, n4);
    }
}
