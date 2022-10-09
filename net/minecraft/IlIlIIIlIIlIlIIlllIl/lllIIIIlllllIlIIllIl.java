package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class lllIIIIlllllIlIIllIl extends IlIlIllllllllIIIIlII implements llIIIlIlIllIIlIlIlII
{
    private static final Random IllIIlllIIIIlllIIlIl;
    private lllIIIIlIlIllIIlIIIl[] llllIIIlIlllIlIIIIIl;
    protected String IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = new Random();
    }
    
    public lllIIIIlllllIlIIllIl() {
        this.llllIIIlIlllIlIIIIIl = new lllIIIIlIlIllIIlIIIl[9];
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 9;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return this.llllIIIlIlllIlIIIIIl[n];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.llllIIIlIlllIlIIIIIl[n] == null) {
            return null;
        }
        if (this.llllIIIlIlllIlIIIIIl[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIlIlllIlIIIIIl[n];
            this.llllIIIlIlllIlIIIIIl[n] = null;
            this.llIIIlIlIllIIlIlIlII();
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl[n].llllIIIIlIIIlIlllIll(n2);
        if (this.llllIIIlIlllIlIIIIIl[n].IlIlIlIlIlllllllllIl == 0) {
            this.llllIIIlIlllIlIIIIIl[n] = null;
        }
        this.llIIIlIlIllIIlIlIlII();
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.llllIIIlIlllIlIIIIIl[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIlIlllIlIIIIIl[n];
            this.llllIIIlIlllIlIIIIIl[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    public int IIIlIIIlIlIIlllIIlll() {
        int n = -1;
        int n2 = 1;
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            if (this.llllIIIlIlllIlIIIIIl[i] != null && lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl.nextInt(n2++) == 0) {
                n = i;
            }
        }
        return n;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIlIlllIlIIIIIl[n] = lllIIIIlIlIllIIlIIIl;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > this.lllllIlIIIlIlIIlllII()) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII();
        }
        this.llIIIlIlIllIIlIlIlII();
    }
    
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            if (this.llllIIIlIlllIlIIIIIl[i] == null || this.llllIIIlIlllIlIIIIIl[i].llllIIIIlIIIlIlllIll() == null) {
                this.llIllIIIIIllIlIIIIlI(i, lllIIIIlIlIllIIlIIIl);
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.IlIlIIIllIllIIIIIllI : "container.dispenser";
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public boolean w_() {
        return this.IlIlIIIllIllIIIIIllI != null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Items", 10);
        this.llllIIIlIlllIlIIIIIl = new lllIIIIlIlIllIIlIIIl[this.lIIIlllIIIllIIIllIII()];
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final int n = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot") & 0xFF;
            if (n >= 0 && n < this.llllIIIlIlllIlIIIIIl.length) {
                this.llllIIIlIlllIlIIIIIl[n] = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8)) {
            this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            if (this.llllIIIlIlllIlIIIIIl[i] != null) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                this.llllIIIlIlllIlIIIIIl[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Items", ilIlIIIlIIlIlIIlllIl);
        if (this.w_()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl) == this && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
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
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:dispenser";
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new lIIIlllIIIllIIIllIII(illIIlllIIIIlllIIlIl, this);
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
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            this.llllIIIlIlllIlIIIIIl[i] = null;
        }
    }
}
