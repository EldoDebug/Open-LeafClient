package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;

public class IlIIIlIIIllllIlIlIlI implements llIIIlIlIllIIlIlIlII
{
    private final llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll;
    private lllIIIIlIlIllIIlIIIl[] IlIlIlIlIlllllllllIl;
    private final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IlIIIlIIIllllIlIlIlI(final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI, final llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = new lllIIIIlIlIllIIlIIIl[3];
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIlIlIlIlllllllllIl.length;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return this.IlIlIlIlIlllllllllIl[n];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.IlIlIlIlIlllllllllIl[n] == null) {
            return null;
        }
        if (n == 2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.IlIlIlIlIlllllllllIl[n];
            this.IlIlIlIlIlllllllllIl[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        if (this.IlIlIlIlIlllllllllIl[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = this.IlIlIlIlIlllllllllIl[n];
            this.IlIlIlIlIlllllllllIl[n] = null;
            if (this.llIllIIIIIllIlIIIIlI(n)) {
                this.IlIIIlIlIIIllIlIlIIl();
            }
            return lllIIIIlIlIllIIlIIIl2;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl[n].llllIIIIlIIIlIlllIll(n2);
        if (this.IlIlIlIlIlllllllllIl[n].IlIlIlIlIlllllllllIl == 0) {
            this.IlIlIlIlIlllllllllIl[n] = null;
        }
        if (this.llIllIIIIIllIlIIIIlI(n)) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final int n) {
        return n == 0 || n == 1;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.IlIlIlIlIlllllllllIl[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.IlIlIlIlIlllllllllIl[n];
            this.IlIlIlIlIlllllllllIl[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIlIlIlllllllllIl[n] = lllIIIIlIlIllIIlIIIl;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > this.lllllIlIIIlIlIIlllII()) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII();
        }
        if (this.llIllIIIIIllIlIIIIlI(n)) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    @Override
    public String s_() {
        return "mob.villager";
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
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == llllIIIIlIIIlIlllIll;
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
    public void llIIIlIlIllIIlIlIlII() {
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIIIlIlIIIllIlIlIIl = null;
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.IlIlIlIlIlllllllllIl[0];
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = this.IlIlIlIlIlllllllllIl[1];
        if (lllIIIIlIlIllIIlIIIl == null) {
            lllIIIIlIlIllIIlIIIl = lllIIIIlIlIllIIlIIIl2;
            lllIIIIlIlIllIIlIIIl2 = null;
        }
        if (lllIIIIlIlIllIIlIIIl == null) {
            this.llIllIIIIIllIlIIIIlI(2, null);
        }
        else {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
            if (ilIlIlIlIlllllllllIl != null) {
                final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2, this.IlIlIIIllIllIIIIIllI);
                if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) {
                    this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll;
                    this.llIllIIIIIllIlIIIIlI(2, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llIIlIIIlIIIllIlIIIl());
                }
                else if (lllIIIIlIlIllIIlIIIl2 != null) {
                    final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2, lllIIIIlIlIllIIlIIIl, this.IlIlIIIllIllIIIIIllI);
                    if (llllIIIIlIIIlIlllIll2 != null && !llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII()) {
                        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2;
                        this.llIllIIIIIllIlIIIIlI(2, llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl().llIIlIIIlIIIllIlIIIl());
                    }
                    else {
                        this.llIllIIIIIllIlIIIIlI(2, null);
                    }
                }
                else {
                    this.llIllIIIIIllIlIIIIlI(2, null);
                }
            }
        }
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI(2));
    }
    
    public net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl();
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
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = null;
        }
    }
}
