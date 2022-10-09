package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI
{
    private final List llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private long IllIIlllIIIIlllIIlIl;
    private long llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private double lIIIlllIIIllIIIllIII;
    private double llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    
    public llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = 0.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 6.0E7;
        this.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = 29999984;
        this.lIIIlllIIIllIIIllIII = 0.2;
        this.llIIlIIIlIIIllIlIIIl = 5.0;
        this.llIllIlIIIIllIlIIllI = 15;
        this.lIlIlIIIllIIllIIIllI = 5;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 1 > this.IlIIIlIlIIIllIlIlIIl() && ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() < this.IllIIlllIIIIlllIIlIl() && ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 1 > this.IlIlIIIllIllIIIIIllI() && ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() < this.llllIIIlIlllIlIIIIIl();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI() > this.IlIIIlIlIIIllIlIlIIl() && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() < this.IllIIlllIIIIlllIIlIl() && ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl() > this.IlIlIIIllIllIIIIIllI() && ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() < this.llllIIIlIlllIlIIIIIl();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl > this.IlIIIlIlIIIllIlIlIIl() && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll < this.IllIIlllIIIIlllIIlIl() && llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl > this.IlIlIIIllIllIIIIIllI() && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI < this.llllIIIlIlllIlIIIIIl();
    }
    
    public double llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
    }
    
    public double llllIIIIlIIIlIlllIll(final double n, final double n2) {
        return Math.min(Math.min(Math.min(n - this.IlIIIlIlIIIllIlIlIIl(), this.IllIIlllIIIIlllIIlIl() - n), n2 - this.IlIlIIIllIllIIIIIllI()), this.llllIIIlIlllIlIIIIIl() - n2);
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return (this.IlIlIIIllIllIIIIIllI < this.IlIIIlIlIIIllIlIlIIl) ? net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl : ((this.IlIlIIIllIllIIIIIllI > this.IlIIIlIlIIIllIlIlIIl) ? net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll : net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        double n = this.llllIIIIlIIIlIlllIll() - this.lIIIIlIIIIIlllIllIII() / 2.0;
        if (n < -this.lIIIIlIIIIIlllIllIII) {
            n = -this.lIIIIlIIIIIlllIllIII;
        }
        return n;
    }
    
    public double IlIlIIIllIllIIIIIllI() {
        double n = this.IlIlIlIlIlllllllllIl() - this.lIIIIlIIIIIlllIllIII() / 2.0;
        if (n < -this.lIIIIlIIIIIlllIllIII) {
            n = -this.lIIIIlIIIIIlllIllIII;
        }
        return n;
    }
    
    public double IllIIlllIIIIlllIIlIl() {
        double n = this.llllIIIIlIIIlIlllIll() + this.lIIIIlIIIIIlllIllIII() / 2.0;
        if (n > this.lIIIIlIIIIIlllIllIII) {
            n = this.lIIIIlIIIIIlllIllIII;
        }
        return n;
    }
    
    public double llllIIIlIlllIlIIIIIl() {
        double n = this.IlIlIlIlIlllllllllIl() + this.lIIIIlIIIIIlllIllIII() / 2.0;
        if (n > this.lIIIIlIIIIIlllIllIII) {
            n = this.lIIIIlIIIIIlllIllIII;
        }
        return n;
    }
    
    public double llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public double IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl(final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl> iterator = this.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
        }
    }
    
    public double lIIIIlIIIIIlllIllIII() {
        if (this.llIllIIIIIllIlIIIIlI() != net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
            final double n = (System.currentTimeMillis() - this.llllIIIlIlllIlIIIIIl) / (float)(this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl);
            if (n < 1.0) {
                return this.IlIIIlIlIIIllIlIlIIl + (this.IlIlIIIllIllIIIIIllI - this.IlIIIlIlIIIllIlIlIIl) * n;
            }
            this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public long lIIIlllIIIllIIIllIII() {
        return (this.llIllIIIIIllIlIIIIlI() != net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) ? (this.IllIIlllIIIIlllIIlIl - System.currentTimeMillis()) : 0L;
    }
    
    public double llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final double n) {
        this.IlIIIlIlIIIllIlIlIIl = n;
        this.IlIlIIIllIllIIIIIllI = n;
        this.IllIIlllIIIIlllIIlIl = System.currentTimeMillis();
        this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl> iterator = this.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this, n);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI, final long n) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = System.currentTimeMillis();
        this.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl + n;
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl> iterator = this.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI, n);
        }
    }
    
    protected List llIllIlIIIIllIlIIllI() {
        return Lists.newArrayList((Iterable)this.llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll.add(ilIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final int liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public double IlIlIIIllIIllIlllllI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final double llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl> iterator = this.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().llIllIIIIIllIlIIIIlI(this, llIIlIIIlIIIllIlIIIl);
        }
    }
    
    public double IIIIlllIIIIIIlIIIlll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public void llIllIIIIIllIlIIIIlI(final double liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl> iterator = this.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl(this, liiIlllIIIllIIIllIII);
        }
    }
    
    public double llllIIllllIlIlIIIIll() {
        return (this.IllIIlllIIIIlllIIlIl == this.llllIIIlIlllIlIIIIIl) ? 0.0 : (Math.abs(this.IlIIIlIlIIIllIlIlIIl - this.IlIlIIIllIllIIIIIllI) / (this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl));
    }
    
    public int IlIllIlIlIIIlIlIlIII() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl> iterator = this.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this, llIllIlIIIIllIlIIllI);
        }
    }
    
    public int IIlllIIlIllIllIlIIll() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl> iterator = this.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl(this, lIlIlIIIllIIllIIIllI);
        }
    }
}
