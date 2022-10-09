package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class IIlllIIIlIlllIIlllII implements llIIIlIlIllIIlIlIlII
{
    private final lllIIIIlIlIllIIlIIIl[] llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    
    public IIlllIIIlIlllIIlllII(final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl[ilIlIlIlIlllllllllIl * llIllIIIIIllIlIIIIlI];
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.llllIIIIlIIIlIlllIll.length;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return (n >= this.lIIIlllIIIllIIIllIII()) ? null : this.llllIIIIlIIIlIlllIll[n];
    }
    
    public lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return (n >= 0 && n < this.IlIlIlIlIlllllllllIl && n2 >= 0 && n2 <= this.llIllIIIIIllIlIIIIlI) ? this.lIlIlIIIllIIllIIIllI(n + n2 * this.IlIlIlIlIlllllllllIl) : null;
    }
    
    @Override
    public String s_() {
        return "container.crafting";
    }
    
    @Override
    public boolean w_() {
        return false;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return this.w_() ? new IlIlIIIIIIlllIlIllIl(this.s_()) : new IIllIIllIIIlIlIIIIlI(this.s_(), new Object[0]);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.llllIIIIlIIIlIlllIll[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[n];
            this.llllIIIIlIIIlIlllIll[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.llllIIIIlIIIlIlllIll[n] == null) {
            return null;
        }
        if (this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[n];
            this.llllIIIIlIIIlIlllIll[n] = null;
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll[n].llllIIIIlIIIlIlllIll(n2);
        if (this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl == 0) {
            this.llllIIIIlIIIlIlllIll[n] = null;
        }
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll[n] = lllIIIIlIlIllIIlIIIl;
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
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
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = null;
        }
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
