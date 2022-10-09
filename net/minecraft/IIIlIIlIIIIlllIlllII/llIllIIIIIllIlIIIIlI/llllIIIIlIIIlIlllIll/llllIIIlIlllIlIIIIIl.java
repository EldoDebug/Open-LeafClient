package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;

public class llllIIIlIlllIlIIIIIl
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private char[] IlIIIlIlIIIllIlIlIIl;
    private lIIIlllIIIllIIIllIII IlIlIIIllIllIIIIIllI;
    private lIIIlllIIIllIIIllIII IllIIlllIIIIlllIIlIl;
    
    public llllIIIlIlllIlIIIIIl(final int llllIIIIlIIIlIlllIll, final boolean b) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = new char[4096];
        this.IlIlIIIllIllIIIIIllI = new lIIIlllIIIllIIIllIII();
        if (b) {
            this.IllIIlllIIIIlllIIlIl = new lIIIlllIIIllIIIllIII();
        }
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n2 << 8 | n3 << 4 | n]);
        return (llIIlIIIlIIIllIlIIIl != null) ? llIIlIIIlIIIllIlIIIl : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (lIIIIlIIIIIlllIllIII.R.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl)) {
            llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llIIlIIIlIIIllIlIIIl, lIIIIlIIIIIlllIllIII.S, new Object[0]);
        }
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll(n, n2, n3).llIllIIIIIllIlIIIIlI();
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            --this.IlIlIlIlIlllllllllIl;
            if (llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI()) {
                --this.llIllIIIIIllIlIIIIlI;
            }
        }
        if (llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            ++this.IlIlIlIlIlllllllllIl;
            if (llIllIIIIIllIlIIIIlI2.IlIlIIIllIIllIlllllI()) {
                ++this.llIllIIIIIllIlIIIIlI;
            }
        }
        this.IlIIIlIlIIIllIlIlIIl[n2 << 8 | n3 << 4 | n] = (char)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
    }
    
    public llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll(n, n2, n3).llIllIIIIIllIlIIIIlI();
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n, n2, n3);
        return llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl == 0;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI > 0;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
    }
    
    public int IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3) {
        return this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
    }
    
    public int IlIlIIIllIllIIIIIllI(final int n, final int n2, final int n3) {
        return this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        int ilIlIlIlIlllllllllIl = 0;
        int llIllIIIIIllIlIIIIlI = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(k, i, j);
                    if (ilIlIlIlIlllllllllIl2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                        ++ilIlIlIlIlllllllllIl;
                        if (ilIlIlIlIlllllllllIl2.IlIlIIIllIIllIlllllI()) {
                            ++llIllIIIIIllIlIIIIlI;
                        }
                    }
                }
            }
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public char[] IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final char[] ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public lIIIlllIIIllIIIllIII IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public lIIIlllIIIllIIIllIII llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
