package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class ac
{
    private final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final llIllIlIlIIIIIIIllII IlIlIlIlIlllllllllIl;
    private final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private final lllIllIIIllllllIllll IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    public ac(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIllIlIlIIIIIIIllII ilIlIlIlIlllllllllIl2) {
        this.IlIlIIIllIllIIIIIllI = 0;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
        if (ilIlIlIlIlllllllllIl2 == llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) {
            this.IlIIIlIlIIIllIlIlIIl = lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            this.llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
            this.llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
        }
        while (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 21 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 0 && this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI())) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        final int n = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIIIlIlIIIllIlIlIIl) - 1;
        if (n >= 0) {
            this.IllIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, n);
            this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llIllIIIIIllIlIIIIlI);
            if (this.lIIIIlIIIIIlllIllIII < 2 || this.lIIIIlIIIIIlllIllIII > 21) {
                this.IllIIlllIIIIlllIIlIl = null;
                this.lIIIIlIIIIIlllIllIII = 0;
            }
        }
        if (this.IllIIlllIIIIlllIIlIl != null) {
            this.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI();
        }
    }
    
    protected int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        int i;
        for (i = 0; i < 22; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, i);
            if (!this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI())) {
                break;
            }
            if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl) {
                break;
            }
        }
        return (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, i)).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl) ? i : false;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    protected int llIllIIIIIllIlIIIIlI() {
        this.llllIIIlIlllIlIIIIIl = 0;
    Label_0181:
        while (this.llllIIIlIlllIlIIIIIl < 21) {
            for (int i = 0; i < this.lIIIIlIIIIIlllIllIII; ++i) {
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, i).llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI();
                if (!this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
                    break Label_0181;
                }
                if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c) {
                    ++this.IlIlIIIllIllIIIIIllI;
                }
                if (i == 0) {
                    if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl)).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl) {
                        break Label_0181;
                    }
                }
                else if (i == this.lIIIIlIIIIIlllIllIII - 1 && this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI)).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl) {
                    break Label_0181;
                }
            }
            ++this.llllIIIlIlllIlIIIIIl;
        }
        for (int j = 0; j < this.lIIIIlIIIIIlllIllIII; ++j) {
            if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, j).llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl)).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl) {
                this.llllIIIlIlllIlIIIIIl = 0;
                break;
            }
        }
        if (this.llllIIIlIlllIlIIIIIl <= 21 && this.llllIIIlIlllIlIIIIIl >= 3) {
            return this.llllIIIlIlllIlIIIIIl;
        }
        this.IllIIlllIIIIlllIIlIl = null;
        this.lIIIIlIIIIIlllIllIII = 0;
        return this.llllIIIlIlllIlIIIIIl = 0;
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llllIIIIlIIIlIlllIll == llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI || llllIIIIlIIIlIlllIll == llllIIIIlIIIlIlllIll.c;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl != null && this.lIIIIlIIIIIlllIllIII >= 2 && this.lIIIIlIIIIIlllIllIII <= 21 && this.llllIIIlIlllIlIIIIIl >= 3 && this.llllIIIlIlllIlIIIIIl <= 21;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        for (int i = 0; i < this.lIIIIlIIIIIlllIllIII; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, i);
            for (int j = 0; j < this.llllIIIlIlllIlIIIIIl; ++j) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(j), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI, this.IlIlIlIlIlllllllllIl), 2);
            }
        }
    }
}
