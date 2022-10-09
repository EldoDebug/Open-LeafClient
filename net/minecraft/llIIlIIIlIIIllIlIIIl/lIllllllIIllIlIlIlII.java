package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class lIllllllIIllIlIlIlII implements llIIIlIlIllIIlIlIlII
{
    private String llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private lllIIIIlIlIllIIlIIIl[] llIllIIIIIllIlIIIIlI;
    private List IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    
    public lIllllllIIllIlIlIlII(final String llllIIIIlIIIlIlllIll, final boolean ilIlIIIllIllIIIIIllI, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new lllIIIIlIlIllIIlIIIl[ilIlIlIlIlllllllllIl];
    }
    
    public lIllllllIIllIlIlIlII(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final int n) {
        this(llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII(), true, n);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl) {
        if (this.IlIIIlIlIIIllIlIlIIl == null) {
            this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        }
        this.IlIIIlIlIIIllIlIlIIl.add(illlIlIIllIlIlIlIIl);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl.remove(illlIlIIllIlIlIlIIl);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.length) ? this.llIllIIIIIllIlIIIIlI[n] : null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.llIllIIIIIllIlIIIIlI[n] == null) {
            return null;
        }
        if (this.llIllIIIIIllIlIIIIlI[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llIllIIIIIllIlIIIIlI[n];
            this.llIllIIIIIllIlIIIIlI[n] = null;
            this.llIIIlIlIllIIlIlIlII();
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI[n].llllIIIIlIIIlIlllIll(n2);
        if (this.llIllIIIIIllIlIIIIlI[n].IlIlIlIlIlllllllllIl == 0) {
            this.llIllIIIIIllIlIIIIlI[n] = null;
        }
        this.llIIIlIlIllIIlIlIlII();
        return llllIIIIlIIIlIlllIll;
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl();
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl; ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI == null) {
                this.llIllIIIIIllIlIIIIlI(i, llIIlIIIlIIIllIlIIIl);
                this.llIIIlIlIllIIlIlIlII();
                return null;
            }
            if (lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl)) {
                final int min = Math.min(llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl, Math.min(this.lllllIlIIIlIlIIlllII(), lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl()) - lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl);
                if (min > 0) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = lIlIlIIIllIIllIIIllI;
                    lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl += min;
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = llIIlIIIlIIIllIlIIIl;
                    lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl -= min;
                    if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                        this.llIIIlIlIllIIlIlIlII();
                        return null;
                    }
                }
            }
        }
        if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl != lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl) {
            this.llIIIlIlIllIIlIlIlII();
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.llIllIIIIIllIlIIIIlI[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llIllIIIIIllIlIIIIlI[n];
            this.llIllIIIIIllIlIIIIlI[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llIllIIIIIllIlIIIIlI[n] = lllIIIIlIlIllIIlIIIl;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > this.lllllIlIIIlIlIIlllII()) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII();
        }
        this.llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String s_() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean w_() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llllIIIIlIIIlIlllIll) {
        this.IlIlIIIllIllIIIIIllI = true;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return this.w_() ? new IlIlIIIIIIlllIlIllIl(this.s_()) : new IIllIIllIIIlIlIIIIlI(this.s_(), new Object[0]);
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.size(); ++i) {
                ((IIlllIlIIllIlIlIlIIl)this.IlIIIlIlIIIllIlIlIIl.get(i)).llllIIIIlIIIlIlllIll(this);
            }
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return true;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public void lIllllllIIllIlIlIlII() {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.length; ++i) {
            this.llIllIIIIIllIlIIIIlI[i] = null;
        }
    }
}
