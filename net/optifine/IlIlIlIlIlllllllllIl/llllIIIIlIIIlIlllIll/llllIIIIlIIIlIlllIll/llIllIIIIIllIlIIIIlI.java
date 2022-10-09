package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public class llIllIIIIIllIlIIIIlI implements llllIIIIlIIIlIlllIll
{
    private lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private IllIIlllIIIIlllIIlIl[] llIllIIIIIllIlIIIIlI;
    private IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    private IIlIIIIIllIlIIIlIIll IlIlIIIllIllIIIIIllI;
    private IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    
    public llIllIIIIIllIlIIIIlI(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl, final IllIIlllIIIIlllIIlIl[] llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl.class.isAssignableFrom(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll())) {
            this.IllIIlllIIIIlllIIlIl = new llIllIlIIIIllIlIIllI();
        }
        else {
            this.IllIIlllIIIIlllIIlIl = new llIIlIIIlIIIllIlIIIl();
        }
    }
    
    @Override
    public net.optifine.expr.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final String s) {
        final IlIlIIIllIllIIIIIllI ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(s);
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final net.optifine.expr.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(s);
        return (llllIIIIlIIIlIlllIll != null) ? llllIIIIlIIIlIlllIll : null;
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return null;
        }
        if (s.indexOf(":") >= 0) {
            final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ":");
            IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[0]);
            for (int i = 1; i < llllIIIIlIIIlIlllIll.length; ++i) {
                final IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[i]);
                if (llIllIIIIIllIlIIIIlI == null) {
                    return null;
                }
                llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI;
            }
            return llllIIIIlIIIlIlllIll2;
        }
        if (this.IlIIIlIlIIIllIlIlIIl != null && s.equals("this")) {
            return this.IlIIIlIlIIIllIlIlIIl;
        }
        if (this.IlIlIIIllIllIIIIIllI != null && s.equals("part")) {
            return this.IlIlIIIllIllIIIIIllI;
        }
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, s);
        if (llllIIIIlIIIlIlllIll3 != null) {
            return llllIIIIlIIIlIlllIll3;
        }
        for (int j = 0; j < this.llIllIIIIIllIlIIIIlI.length; ++j) {
            final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll4 = this.llIllIIIIIllIlIIIIlI[j].llllIIIIlIIIlIlllIll();
            if (s.equals(llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl())) {
                return llllIIIIlIIIlIlllIll4;
            }
            final IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI(s);
            if (llIllIIIIIllIlIIIIlI2 != null) {
                return llIllIIIIIllIlIIIIlI2;
            }
        }
        return null;
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl(final String s) {
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ".");
        if (llllIIIIlIIIlIlllIll.length != 2) {
            return null;
        }
        final String s2 = llllIIIIlIIIlIlllIll[0];
        final String s3 = llllIIIIlIIIlIlllIll[1];
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(s2);
        if (llllIIIIlIIIlIlllIll2 == null) {
            return null;
        }
        final net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll3 = net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(s3);
        return (llllIIIIlIIIlIlllIll3 == null) ? null : new IlIlIIIllIllIIIIIllI(s, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final IIlIIIIIllIlIIIlIIll ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
}
