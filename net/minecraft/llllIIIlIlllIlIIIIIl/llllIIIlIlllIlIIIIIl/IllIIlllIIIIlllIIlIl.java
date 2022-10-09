package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import java.util.concurrent.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIIlllIIIIlllIIlIl implements llIIIlIlIllIIlIlIlII
{
    public lllIIIIlIlIllIIlIIIl[] llllIIIIlIIIlIlllIll;
    public lllIIIIlIlIllIIlIIIl[] IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    private lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl;
    public boolean IlIlIIIllIllIIIIIllI;
    
    public IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl[36];
        this.IlIlIlIlIlllllllllIl = new lllIIIIlIlIllIIlIIIl[4];
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl() {
        return (this.llIllIIIIIllIlIIIIlI < 9 && this.llIllIIIIIllIlIIIIlI >= 0) ? this.llllIIIIlIIIlIlllIll[this.llIllIIIIIllIlIIIIlI] : null;
    }
    
    public static int IllIIlllIIIIlllIIlIl() {
        return 9;
    }
    
    private int llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null && this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll() == ilIIIlIlIIIllIlIlIIl) {
                return i;
            }
        }
        return -1;
    }
    
    private int llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null && this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll() == ilIIIlIlIIIllIlIlIIl && this.llllIIIIlIIIlIlllIll[i].lIIIIlIIIIIlllIllIII() == n) {
                return i;
            }
        }
        return -1;
    }
    
    private int IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null && this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll() == lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() && this.llllIIIIlIIIlIlllIll[i].llIllIIIIIllIlIIIIlI() && this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl < this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl() && this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl < this.lllllIlIIIlIlIIlllII() && (!this.llllIIIIlIIIlIlllIll[i].IlIlIIIllIllIIIIIllI() || this.llllIIIIlIIIlIlllIll[i].lIIIIlIIIIIlllIllIII() == lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()) && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[i], lllIIIIlIlIllIIlIIIl)) {
                return i;
            }
        }
        return -1;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final boolean b, final boolean b2) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl2 = this.IlIIIlIlIIIllIlIlIIl();
        final int llIllIIIIIllIlIIIIlI = b ? this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n) : this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        if (llIllIIIIIllIlIIIIlI >= 0 && llIllIIIIIllIlIIIIlI < 9) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
        else if (b2 && ilIIIlIlIIIllIlIlIIl != null) {
            final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl >= 0 && llllIIIlIlllIlIIIIIl < 9) {
                this.llIllIIIIIllIlIIIIlI = llllIIIlIlllIlIIIIIl;
            }
            if (ilIIIlIlIIIllIlIlIIl2 == null || !ilIIIlIlIIIllIlIlIIl2.IlIlIIIlIIlIlIIlllIl() || this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll(), ilIIIlIlIIIllIlIlIIl2.llllIIIlIlllIlIIIIIl()) != this.llIllIIIIIllIlIIIIlI) {
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n);
                int ilIlIlIlIlllllllllIl;
                if (llllIIIIlIIIlIlllIll >= 0) {
                    ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll].IlIlIlIlIlllllllllIl;
                    this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll] = this.llllIIIIlIIIlIlllIll[this.llIllIIIIIllIlIIIIlI];
                }
                else {
                    ilIlIlIlIlllllllllIl = 1;
                }
                this.llllIIIIlIIIlIlllIll[this.llIllIIIIIllIlIIIIlI] = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, n);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(int n) {
        if (n > 0) {
            n = 1;
        }
        if (n < 0) {
            n = -1;
        }
        this.llIllIIIIIllIlIIIIlI -= n;
        while (this.llIllIIIIIllIlIIIIlI < 0) {
            this.llIllIIIIIllIlIIIIlI += 9;
        }
        while (this.llIllIIIIIllIlIIIIlI >= 9) {
            this.llIllIIIIIllIlIIIIlI -= 9;
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final int n2, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        int n3 = 0;
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[i];
            if (lllIIIIlIlIllIIlIIIl != null && (ilIIIlIlIIIllIlIlIIl == null || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == ilIIIlIlIIIllIlIlIIl) && (n <= -1 || lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == n) && (iiiIlllIIIIIIlIIIlll == null || IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll(), true))) {
                final int n4 = (n2 <= 0) ? lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl : Math.min(n2 - n3, lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl);
                n3 += n4;
                if (n2 != 0) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = this.llllIIIIlIIIlIlllIll[i];
                    lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl -= n4;
                    if (this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl == 0) {
                        this.llllIIIIlIIIlIlllIll[i] = null;
                    }
                    if (n2 > 0 && n3 >= n2) {
                        return n3;
                    }
                }
            }
        }
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length; ++j) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = this.IlIlIlIlIlllllllllIl[j];
            if (lllIIIIlIlIllIIlIIIl3 != null && (ilIIIlIlIIIllIlIlIIl == null || lllIIIIlIlIllIIlIIIl3.llllIIIIlIIIlIlllIll() == ilIIIlIlIIIllIlIlIIl) && (n <= -1 || lllIIIIlIlIllIIlIIIl3.lIIIIlIIIIIlllIllIII() == n) && (iiiIlllIIIIIIlIIIlll == null || IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, lllIIIIlIlIllIIlIIIl3.llllIIllllIlIlIIIIll(), false))) {
                final int n5 = (n2 <= 0) ? lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl : Math.min(n2 - n3, lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl);
                n3 += n5;
                if (n2 != 0) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl4 = this.IlIlIlIlIlllllllllIl[j];
                    lllIIIIlIlIllIIlIIIl4.IlIlIlIlIlllllllllIl -= n5;
                    if (this.IlIlIlIlIlllllllllIl[j].IlIlIlIlIlllllllllIl == 0) {
                        this.IlIlIlIlIlllllllllIl[j] = null;
                    }
                    if (n2 > 0 && n3 >= n2) {
                        return n3;
                    }
                }
            }
        }
        if (this.IllIIlllIIIIlllIIlIl != null) {
            if (ilIIIlIlIIIllIlIlIIl != null && this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() != ilIIIlIlIIIllIlIlIIl) {
                return n3;
            }
            if (n > -1 && this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII() != n) {
                return n3;
            }
            if (iiiIlllIIIIIIlIIIlll != null && !IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, this.IllIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll(), false)) {
                return n3;
            }
            final int n6 = (n2 <= 0) ? this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl : Math.min(n2 - n3, this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
            n3 += n6;
            if (n2 != 0) {
                final lllIIIIlIlIllIIlIIIl illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
                illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl -= n6;
                if (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl == 0) {
                    this.IllIIlllIIIIlllIIlIl = null;
                }
                if (n2 > 0 && n3 >= n2) {
                    return n3;
                }
            }
        }
        return n3;
    }
    
    private int IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        final int ilIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        int n = this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl);
        if (n < 0) {
            n = this.llllIIIlIlllIlIIIIIl();
        }
        if (n < 0) {
            return ilIlIlIlIlllllllllIl;
        }
        if (this.llllIIIIlIIIlIlllIll[n] == null) {
            this.llllIIIIlIIIlIlllIll[n] = new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll, 0, lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
            if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
                this.llllIIIIlIIIlIlllIll[n].IlIIIlIlIIIllIlIlIIl((IIIIlllIIIIIIlIIIlll)lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl());
            }
        }
        int n2;
        if ((n2 = ilIlIlIlIlllllllllIl) > this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl() - this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl) {
            n2 = this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl() - this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl;
        }
        if (n2 > this.lllllIlIIIlIlIIlllII() - this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl) {
            n2 = this.lllllIlIIIlIlIIlllII() - this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl;
        }
        if (n2 == 0) {
            return ilIlIlIlIlllllllllIl;
        }
        final int n3 = ilIlIlIlIlllllllllIl - n2;
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = this.llllIIIIlIIIlIlllIll[n];
        lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl += n2;
        this.llllIIIIlIIIlIlllIll[n].llIllIIIIIllIlIIIIlI = 5;
        return n3;
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null) {
                this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII, this.IlIIIlIlIIIllIlIlIIl, i, this.llIllIIIIIllIlIIIIlI == i);
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        if (llIllIIIIIllIlIIIIlI < 0) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI];
        if (--lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
            this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] = null;
        }
        return true;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl) >= 0;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl != 0 && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null) {
            try {
                if (lllIIIIlIlIllIIlIIIl.IllIIlllIIIIlllIIlIl()) {
                    final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
                    if (llllIIIlIlllIlIIIIIl >= 0) {
                        this.llllIIIIlIIIlIlllIll[llllIIIlIlllIlIIIIIl] = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
                        this.llllIIIIlIIIlIlllIll[llllIIIlIlllIlIIIIIl].llIllIIIIIllIlIIIIlI = 5;
                        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 0;
                        return true;
                    }
                    if (this.IlIIIlIlIIIllIlIlIIl.K.IlIIIlIlIIIllIlIlIIl) {
                        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 0;
                        return true;
                    }
                    return false;
                }
                else {
                    int ilIlIlIlIlllllllllIl;
                    do {
                        ilIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl);
                    } while (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 0 && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl < ilIlIlIlIlllllllllIl);
                    if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == ilIlIlIlIlllllllllIl && this.IlIIIlIlIIIllIlIlIIl.K.IlIIIlIlIIIllIlIlIIl) {
                        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 0;
                        return true;
                    }
                    return lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl < ilIlIlIlIlllllllllIl;
                }
            }
            catch (Throwable t) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Adding item to inventory");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Item being added");
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Item ID", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Item data", lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Item name", new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(this, lllIIIIlIlIllIIlIIIl));
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
        }
        return false;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(int n, final int n2) {
        lllIIIIlIlIllIIlIIIl[] array = this.llllIIIIlIIIlIlllIll;
        if (n >= this.llllIIIIlIIIlIlllIll.length) {
            array = this.IlIlIlIlIlllllllllIl;
            n -= this.llllIIIIlIIIlIlllIll.length;
        }
        if (array[n] == null) {
            return null;
        }
        if (array[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = array[n];
            array[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = array[n].llllIIIIlIIIlIlllIll(n2);
        if (array[n].IlIlIlIlIlllllllllIl == 0) {
            array[n] = null;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(int n) {
        lllIIIIlIlIllIIlIIIl[] array = this.llllIIIIlIIIlIlllIll;
        if (n >= this.llllIIIIlIIIlIlllIll.length) {
            array = this.IlIlIlIlIlllllllllIl;
            n -= this.llllIIIIlIIIlIlllIll.length;
        }
        if (array[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = array[n];
            array[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        lllIIIIlIlIllIIlIIIl[] array = this.llllIIIIlIIIlIlllIll;
        if (n >= array.length) {
            n -= array.length;
            array = this.IlIlIlIlIlllllllllIl;
        }
        array[n] = lllIIIIlIlIllIIlIIIl;
    }
    
    public float llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        float n = 1.0f;
        if (this.llllIIIIlIIIlIlllIll[this.llIllIIIIIllIlIIIIlI] != null) {
            n *= this.llllIIIIlIIIlIlllIll[this.llIllIIIIIllIlIIIIlI].llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        return n;
    }
    
    public IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
            }
        }
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length; ++j) {
            if (this.IlIlIlIlIlllllllllIl[j] != null) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)(j + 100));
                this.IlIlIlIlIlllllllllIl[j].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl[36];
        this.IlIlIlIlIlllllllllIl = new lllIIIIlIlIllIIlIIIl[4];
        for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i);
            final int n = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot") & 0xFF;
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll != null) {
                if (n >= 0 && n < this.llllIIIIlIIIlIlllIll.length) {
                    this.llllIIIIlIIIlIlllIll[n] = llllIIIIlIIIlIlllIll;
                }
                if (n >= 100 && n < this.IlIlIlIlIlllllllllIl.length + 100) {
                    this.IlIlIlIlIlllllllllIl[n - 100] = llllIIIIlIIIlIlllIll;
                }
            }
        }
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.llllIIIIlIIIlIlllIll.length + 4;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(int n) {
        lllIIIIlIlIllIIlIIIl[] array = this.llllIIIIlIIIlIlllIll;
        if (n >= array.length) {
            n -= array.length;
            array = this.IlIlIlIlIlllllllllIl;
        }
        return array[n];
    }
    
    @Override
    public String s_() {
        return "container.inventory";
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
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llIllIlIIIIllIlIIllI()) {
            return true;
        }
        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI(this.llIllIIIIIllIlIIIIlI);
        return lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
    }
    
    public lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl[n];
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        int n = 0;
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            if (this.IlIlIlIlIlllllllllIl[i] != null && this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                n += ((IIIlIIlIIIIlllIlllII)this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll()).lIIIlllIIIllIIIllIII;
            }
        }
        return n;
    }
    
    public void llllIIIIlIIIlIlllIll(float n) {
        n /= 4.0f;
        if (n < 1.0f) {
            n = 1.0f;
        }
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            if (this.IlIlIlIlIlllllllllIl[i] != null && this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll((int)n, this.IlIIIlIlIIIllIlIlIIl);
                if (this.IlIlIlIlIlllllllllIl[i].IlIlIlIlIlllllllllIl == 0) {
                    this.IlIlIlIlIlllllllllIl[i] = null;
                }
            }
        }
    }
    
    public void llIllIlIIIIllIlIIllI() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null) {
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[i], true, false);
                this.llllIIIIlIIIlIlllIll[i] = null;
            }
        }
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length; ++j) {
            if (this.IlIlIlIlIlllllllllIl[j] != null) {
                this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl[j], true, false);
                this.IlIlIlIlIlllllllllIl[j] = null;
            }
        }
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
        this.IlIlIIIllIllIIIIIllI = true;
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return !this.IlIIIlIlIIIllIlIlIIl.IIlIlIlIIlIllIIIIIIl && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIIIlIlIIIllIlIlIIl) <= 64.0;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            if (this.IlIlIlIlIlllllllllIl[i] != null && this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl)) {
                return true;
            }
        }
        for (int j = 0; j < this.llllIIIIlIIIlIlllIll.length; ++j) {
            if (this.llllIIIIlIIIlIlllIll[j] != null && this.llllIIIIlIIIlIlllIll[j].llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl)) {
                return true;
            }
        }
        return false;
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
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll[i]);
        }
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length; ++j) {
            this.IlIlIlIlIlllllllllIl[j] = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl[j]);
        }
        this.llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI;
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
        for (int j = 0; j < this.IlIlIlIlIlllllllllIl.length; ++j) {
            this.IlIlIlIlIlllllllllIl[j] = null;
        }
    }
}
