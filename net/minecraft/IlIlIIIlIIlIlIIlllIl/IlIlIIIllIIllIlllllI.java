package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIllIIllIlllllI extends IlIlIllllllllIIIIlII implements llIIIllIlIllIllIIIIl, llIIIlIlIllIIlIlIlII
{
    private lllIIIIlIlIllIIlIIIl[] IlIlIIIllIIllIlllllI;
    public boolean IlIlIIIllIllIIIIIllI;
    public IlIlIIIllIIllIlllllI IllIIlllIIIIlllIIlIl;
    public IlIlIIIllIIllIlllllI llllIIIlIlllIlIIIIIl;
    public IlIlIIIllIIllIlllllI lIIIIlIIIIIlllIllIII;
    public IlIlIIIllIIllIlllllI lIIIlllIIIllIIIllIII;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    public int lIlIlIIIllIIllIIIllI;
    private int IIIIlllIIIIIIlIIIlll;
    private int llllIIllllIlIlIIIIll;
    private String IlIllIlIlIIIlIlIlIII;
    private static volatile /* synthetic */ int[] IIlllIIlIllIllIlIIll;
    
    public IlIlIIIllIIllIlllllI() {
        this.IlIlIIIllIIllIlllllI = new lllIIIIlIlIllIIlIIIl[27];
        this.llllIIllllIlIlIIIIll = -1;
    }
    
    public IlIlIIIllIIllIlllllI(final int llllIIllllIlIlIIIIll) {
        this.IlIlIIIllIIllIlllllI = new lllIIIIlIlIllIIlIIIl[27];
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 27;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return this.IlIlIIIllIIllIlllllI[n];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI[n] == null) {
            return null;
        }
        if (this.IlIlIIIllIIllIlllllI[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.IlIlIIIllIIllIlllllI[n];
            this.IlIlIIIllIIllIlllllI[n] = null;
            this.llIIIlIlIllIIlIlIlII();
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI[n].llllIIIIlIIIlIlllIll(n2);
        if (this.IlIlIIIllIIllIlllllI[n].IlIlIlIlIlllllllllIl == 0) {
            this.IlIlIIIllIIllIlllllI[n] = null;
        }
        this.llIIIlIlIllIIlIlIlII();
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.IlIlIIIllIIllIlllllI[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.IlIlIIIllIIllIlllllI[n];
            this.IlIlIIIllIIllIlllllI[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIIIllIIllIlllllI[n] = lllIIIIlIlIllIIlIIIl;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > this.lllllIlIIIlIlIIlllII()) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII();
        }
        this.llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.IlIllIlIlIIIlIlIlIII : "container.chest";
    }
    
    @Override
    public boolean w_() {
        return this.IlIllIlIlIIIlIlIlIII != null && this.IlIllIlIlIIIlIlIlIII.length() > 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Items", 10);
        this.IlIlIIIllIIllIlllllI = new lllIIIIlIlIllIIlIIIl[this.lIIIlllIIIllIIIllIII()];
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8)) {
            this.IlIllIlIlIIIlIlIlIII = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final int n = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot") & 0xFF;
            if (n >= 0 && n < this.IlIlIIIllIIllIlllllI.length) {
                this.IlIlIIIllIIllIlllllI[n] = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.IlIlIIIllIIllIlllllI.length; ++i) {
            if (this.IlIlIIIllIIllIlllllI[i] != null) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                this.IlIlIIIllIIllIlllllI[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Items", ilIlIIIlIIlIlIIlllIl);
        if (this.w_()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.IlIllIlIlIIIlIlIlIII);
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
    public void lllIIIIlllllIlIIllIl() {
        super.lllIIIIlllllIlIIllIl();
        this.IlIlIIIllIllIIIIIllI = false;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (ilIlIIIllIIllIlllllI.llllIIllllIlIlIIIIll()) {
            this.IlIlIIIllIllIIIIIllI = false;
        }
        else if (this.IlIlIIIllIllIIIIIllI) {
            switch (IlllllllIIIlIIIlIlII()[lllIllIIIllllllIllll.ordinal()]) {
                case 3: {
                    if (this.IllIIlllIIIIlllIIlIl != ilIlIIIllIIllIlllllI) {
                        this.IlIlIIIllIllIIIIIllI = false;
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.lIIIlllIIIllIIIllIII != ilIlIIIllIIllIlllllI) {
                        this.IlIlIIIllIllIIIIIllI = false;
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.llllIIIlIlllIlIIIIIl != ilIlIIIllIIllIlllllI) {
                        this.IlIlIIIllIllIIIIIllI = false;
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.lIIIIlIIIIIlllIllIII != ilIlIIIllIIllIlllllI) {
                        this.IlIlIIIllIllIIIIIllI = false;
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void IIIlIIIlIlIIlllIIlll() {
        if (!this.IlIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = true;
            this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI);
            this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl);
            this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI);
            this.lIIIlllIIIllIIIllIII = this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    protected IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll)) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll2 instanceof IlIlIIIllIIllIlllllI) {
                final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = (IlIlIIIllIIllIlllllI)llllIIIIlIIIlIlllIll2;
                ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI());
                return ilIlIIIllIIllIlllllI;
            }
        }
        return null;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI instanceof IIlIIIIIllIlIIIlIIll && ((IIlIIIIIllIlIIIlIIll)llIllIIIIIllIlIIIIlI).IIllllIIIlIIIIIIllIl == this.IlIlIIIlIIlIlIIlllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.IIIlIIIlIlIIlllIIlll();
        final int liiiIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        ++this.IIIIlllIIIIIIlIIIlll;
        if (!this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII && this.lIlIlIIIllIIllIIIllI != 0 && (this.IIIIlllIIIIIIlIIIlll + liiiIlIIIIIlllIllIII + liiIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl) % 200 == 0) {
            this.lIlIlIIIllIIllIIIllI = 0;
            final float n = 5.0f;
            for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII - n, liiIlllIIIllIIIllIII - n, llIIlIIIlIIIllIlIIIl - n, liiiIlIIIIIlllIllIII + 1 + n, liiIlllIIIllIIIllIII + 1 + n, llIIlIIIlIIIllIlIIIl + 1 + n))) {
                if (llllIIIIlIIIlIlllIll.t instanceof lIIIIlIIIIIlllIllIII) {
                    final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll2 = ((lIIIIlIIIIIlllIllIII)llllIIIIlIIIlIlllIll.t).llllIIIIlIIIlIlllIll();
                    if (llllIIIIlIIIlIlllIll2 != this && (!(llllIIIIlIIIlIlllIll2 instanceof IIIllllllIllIIIlllIl) || !((IIIllllllIllIIIlllIl)llllIIIIlIIIlIlllIll2).llllIIIIlIIIlIlllIll(this))) {
                        continue;
                    }
                    ++this.lIlIlIIIllIIllIIIllI;
                }
            }
        }
        this.llIllIlIIIIllIlIIllI = this.llIIlIIIlIIIllIlIIIl;
        final float n2 = 0.1f;
        if (this.lIlIlIIIllIIllIIIllI > 0 && this.llIIlIIIlIIIllIlIIIl == 0.0f && this.IllIIlllIIIIlllIIlIl == null && this.lIIIIlIIIIIlllIllIII == null) {
            double n3 = liiiIlIIIIIlllIllIII + 0.5;
            double n4 = llIIlIIIlIIIllIlIIIl + 0.5;
            if (this.lIIIlllIIIllIIIllIII != null) {
                n4 += 0.5;
            }
            if (this.llllIIIlIlllIlIIIIIl != null) {
                n3 += 0.5;
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n3, liiIlllIIIllIIIllIII + 0.5, n4, "random.chestopen", 0.5f, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f);
        }
        if ((this.lIlIlIIIllIIllIIIllI == 0 && this.llIIlIIIlIIIllIlIIIl > 0.0f) || (this.lIlIlIIIllIIllIIIllI > 0 && this.llIIlIIIlIIIllIlIIIl < 1.0f)) {
            final float llIIlIIIlIIIllIlIIIl2 = this.llIIlIIIlIIIllIlIIIl;
            if (this.lIlIlIIIllIIllIIIllI > 0) {
                this.llIIlIIIlIIIllIlIIIl += n2;
            }
            else {
                this.llIIlIIIlIIIllIlIIIl -= n2;
            }
            if (this.llIIlIIIlIIIllIlIIIl > 1.0f) {
                this.llIIlIIIlIIIllIlIIIl = 1.0f;
            }
            final float n5 = 0.5f;
            if (this.llIIlIIIlIIIllIlIIIl < n5 && llIIlIIIlIIIllIlIIIl2 >= n5 && this.IllIIlllIIIIlllIIlIl == null && this.lIIIIlIIIIIlllIllIII == null) {
                double n6 = liiiIlIIIIIlllIllIII + 0.5;
                double n7 = llIIlIIIlIIIllIlIIIl + 0.5;
                if (this.lIIIlllIIIllIIIllIII != null) {
                    n7 += 0.5;
                }
                if (this.llllIIIlIlllIlIIIIIl != null) {
                    n6 += 0.5;
                }
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6, liiIlllIIIllIIIllIII + 0.5, n7, "random.chestclosed", 0.5f, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f);
            }
            if (this.llIIlIIIlIIIllIlIIIl < 0.0f) {
                this.llIIlIIIlIIIllIlIIIl = 0.0f;
            }
        }
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int lIlIlIIIllIIllIIIllI) {
        if (n == 1) {
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            return true;
        }
        return super.llIllIIIIIllIlIIIIlI(n, lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
            if (this.lIlIlIIIllIIllIIIllI < 0) {
                this.lIlIlIIIllIIllIIIllI = 0;
            }
            ++this.lIlIlIIIllIIllIIIllI;
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIIllIlllllI(), 1, this.lIlIlIIIllIIllIIIllI);
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIIllIlllllI());
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), this.IlIlIIIllIIllIlllllI());
        }
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl() && this.IlIlIIIllIIllIlllllI() instanceof IIlIIIIIllIlIIIlIIll) {
            --this.lIlIlIIIllIIllIIIllI;
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIIllIlllllI(), 1, this.lIlIlIIIllIIllIIIllI);
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIIllIlllllI());
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), this.IlIlIIIllIIllIlllllI());
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
    
    @Override
    public void IlIllIlIlIIIlIlIlIII() {
        super.IlIllIlIlIIIlIlIlIII();
        this.lllIIIIlllllIlIIllIl();
        this.IIIlIIIlIlIIlllIIlll();
    }
    
    public int IlIlIIIlIIlIlIIlllIl() {
        if (this.llllIIllllIlIlIIIIll == -1) {
            if (this.llllIIIIlIIIlIlllIll == null || !(this.IlIlIIIllIIllIlllllI() instanceof IIlIIIIIllIlIIIlIIll)) {
                return 0;
            }
            this.llllIIllllIlIlIIIIll = ((IIlIIIIIllIlIIIlIIll)this.IlIlIIIllIIllIlllllI()).IIllllIIIlIIIIIIllIl;
        }
        return this.llllIIllllIlIlIIIIll;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:chest";
    }
    
    @Override
    public net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new lIIIIlIIIIIlllIllIII(illIIlllIIIIlllIIlIl, this, llllIIIIlIIIlIlllIll);
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
        for (int i = 0; i < this.IlIlIIIllIIllIlllllI.length; ++i) {
            this.IlIlIIIllIIllIlllllI[i] = null;
        }
    }
    
    static /* synthetic */ int[] IlllllllIIIlIIIlIlII() {
        final int[] iIlllIIlIllIllIlIIll = IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll;
        if (iIlllIIlIllIllIlIIll != null) {
            return iIlllIIlIllIllIlIIll;
        }
        final int[] iIlllIIlIllIllIlIIll2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            iIlllIIlIllIllIlIIll2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iIlllIIlIllIllIlIIll2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iIlllIIlIllIllIlIIll2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iIlllIIlIllIllIlIIll2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            iIlllIIlIllIllIlIIll2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            iIlllIIlIllIllIlIIll2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll2;
    }
}
