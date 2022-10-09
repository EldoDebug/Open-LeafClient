package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class IIlIIIIlllIlllllIlII extends IlIlIllllllllIIIIlII implements llIIIllIlIllIllIIIIl, lllllIlIIIlIlIIlllII
{
    private static final int[] IlIlIIIllIllIIIIIllI;
    private static final int[] IllIIlllIIIIlllIIlIl;
    private static final int[] llllIIIlIlllIlIIIIIl;
    private lllIIIIlIlIllIIlIIIl[] lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private String IlIlIIIllIIllIlllllI;
    
    static {
        IlIlIIIllIllIIIIIllI = new int[1];
        IllIIlllIIIIlllIIlIl = new int[] { 2, 1 };
        llllIIIlIlllIlIIIIIl = new int[] { 1 };
    }
    
    public IIlIIIIlllIlllllIlII() {
        this.lIIIIlIIIIIlllIllIII = new lllIIIIlIlIllIIlIIIl[3];
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.lIIIIlIIIIIlllIllIII.length;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return this.lIIIIlIIIIIlllIllIII[n];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.lIIIIlIIIIIlllIllIII[n] == null) {
            return null;
        }
        if (this.lIIIIlIIIIIlllIllIII[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.lIIIIlIIIIIlllIllIII[n];
            this.lIIIIlIIIIIlllIllIII[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII[n].llllIIIIlIIIlIlllIll(n2);
        if (this.lIIIIlIIIIIlllIllIII[n].IlIlIlIlIlllllllllIl == 0) {
            this.lIIIIlIIIIIlllIllIII[n] = null;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.lIIIIlIIIIIlllIllIII[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.lIIIIlIIIIIlllIllIII[n];
            this.lIIIIlIIIIIlllIllIII[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final boolean b = lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII[n]) && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, this.lIIIIlIIIIIlllIllIII[n]);
        this.lIIIIlIIIIIlllIllIII[n] = lllIIIIlIlIllIIlIIIl;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > this.lllllIlIIIlIlIIlllII()) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII();
        }
        if (n == 0 && !b) {
            this.lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
            this.llIllIlIIIIllIlIIllI = 0;
            this.llIIIlIlIllIIlIlIlII();
        }
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.IlIlIIIllIIllIlllllI : "container.furnace";
    }
    
    @Override
    public boolean w_() {
        return this.IlIlIIIllIIllIlllllI != null && this.IlIlIIIllIIllIlllllI.length() > 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Items", 10);
        this.lIIIIlIIIIIlllIllIII = new lllIIIIlIlIllIIlIIIl[this.lIIIlllIIIllIIIllIII()];
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final byte ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot");
            if (ilIIIlIlIIIllIlIlIIl >= 0 && ilIIIlIlIIIllIlIlIIl < this.lIIIIlIIIIIlllIllIII.length) {
                this.lIIIIlIIIIIlllIllIII[ilIIIlIlIIIllIlIlIIl] = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
        }
        this.lIIIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("BurnTime");
        this.llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("CookTime");
        this.lIlIlIIIllIIllIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("CookTimeTotal");
        this.llIIlIIIlIIIllIlIIIl = IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII[1]);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8)) {
            this.IlIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BurnTime", (short)this.lIIIlllIIIllIIIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CookTime", (short)this.llIllIlIIIIllIlIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CookTimeTotal", (short)this.lIlIlIIIllIIllIIIllI);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.lIIIIlIIIIIlllIllIII.length; ++i) {
            if (this.lIIIIlIIIIIlllIllIII[i] != null) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                this.lIIIIlIIIIIlllIllIII[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Items", ilIlIIIlIIlIlIIlllIl);
        if (this.w_()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.IlIlIIIllIIllIlllllI);
        }
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    public boolean IIIlIIIlIlIIlllIIlll() {
        return this.lIIIlllIIIllIIIllIII > 0;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        return llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(0) > 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        final boolean iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll();
        boolean b = false;
        if (this.IIIlIIIlIlIIlllIIlll()) {
            --this.lIIIlllIIIllIIIllIII;
        }
        if (!this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
            if (this.IIIlIIIlIlIIlllIIlll() || (this.lIIIIlIIIIIlllIllIII[1] != null && this.lIIIIlIIIIIlllIllIII[0] != null)) {
                if (!this.IIIlIIIlIlIIlllIIlll() && this.IlllllllIIIlIIIlIlII()) {
                    final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII[1]);
                    this.lIIIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl;
                    this.llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl;
                    if (this.IIIlIIIlIlIIlllIIlll()) {
                        b = true;
                        if (this.lIIIIlIIIIIlllIllIII[1] != null) {
                            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.lIIIIlIIIIIlllIllIII[1];
                            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                            if (this.lIIIIlIIIIIlllIllIII[1].IlIlIlIlIlllllllllIl == 0) {
                                final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl = this.lIIIIlIIIIIlllIllIII[1].llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl();
                                this.lIIIIlIIIIIlllIllIII[1] = ((llIIlIIIlIIIllIlIIIl != null) ? new lllIIIIlIlIllIIlIIIl(llIIlIIIlIIIllIlIIIl) : null);
                            }
                        }
                    }
                }
                if (this.IIIlIIIlIlIIlllIIlll() && this.IlllllllIIIlIIIlIlII()) {
                    ++this.llIllIlIIIIllIlIIllI;
                    if (this.llIllIlIIIIllIlIIllI == this.lIlIlIIIllIIllIIIllI) {
                        this.llIllIlIIIIllIlIIllI = 0;
                        this.lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII[0]);
                        this.IlIlIIIlIIlIlIIlllIl();
                        b = true;
                    }
                }
                else {
                    this.llIllIlIIIIllIlIIllI = 0;
                }
            }
            else if (!this.IIIlIIIlIlIIlllIIlll() && this.llIllIlIIIIllIlIIllI > 0) {
                this.llIllIlIIIIllIlIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI - 2, 0, this.lIlIlIIIllIIllIIIllI);
            }
            if (iiIlIIIlIlIIlllIIlll != this.IIIlIIIlIlIIlllIIlll()) {
                b = true;
                lllllIIIIIlIIlllIlIl.llllIIIIlIIIlIlllIll(this.IIIlIIIlIlIIlllIIlll(), this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
            }
        }
        if (b) {
            this.llIIIlIlIllIIlIlIlII();
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return 200;
    }
    
    private boolean IlllllllIIIlIIIlIlII() {
        if (this.lIIIIlIIIIIlllIllIII[0] == null) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII[0]);
        return llllIIIIlIIIlIlllIll != null && (this.lIIIIlIIIIIlllIllIII[2] == null || (this.lIIIIlIIIIIlllIllIII[2].llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && ((this.lIIIIlIIIIIlllIllIII[2].IlIlIlIlIlllllllllIl < this.lllllIlIIIlIlIIlllII() && this.lIIIIlIIIIIlllIllIII[2].IlIlIlIlIlllllllllIl < this.lIIIIlIIIIIlllIllIII[2].IlIlIlIlIlllllllllIl()) || this.lIIIIlIIIIIlllIllIII[2].IlIlIlIlIlllllllllIl < llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl())));
    }
    
    public void IlIlIIIlIIlIlIIlllIl() {
        if (this.IlllllllIIIlIIIlIlII()) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII[0]);
            if (this.lIIIIlIIIIIlllIllIII[2] == null) {
                this.lIIIIlIIIIIlllIllIII[2] = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
            }
            else if (this.lIIIIlIIIIIlllIllIII[2].llllIIIIlIIIlIlllIll() == llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.lIIIIlIIIIIlllIllIII[2];
                ++lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            if (this.lIIIIlIIIIIlllIllIII[0].llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl) && this.lIIIIlIIIIIlllIllIII[0].lIIIIlIIIIIlllIllIII() == 1 && this.lIIIIlIIIIIlllIllIII[1] != null && this.lIIIIlIIIIIlllIllIII[1].llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IllllIIlIlIllIIIllII) {
                this.lIIIIlIIIIIlllIllIII[1] = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lllllIIIIIlIIlllIlIl);
            }
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = this.lIIIIlIIIIIlllIllIII[0];
            --lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl;
            if (this.lIIIIlIIIIIlllIllIII[0].IlIlIlIlIlllllllllIl <= 0) {
                this.lIIIIlIIIIIlllIllIII[0] = null;
            }
        }
    }
    
    public static int IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            return 0;
        }
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll instanceof IIlllIIIlIlllIIlllII && net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q) {
                return 150;
            }
            if (llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl() == IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                return 300;
            }
            if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aE) {
                return 16000;
            }
        }
        return (llllIIIIlIIIlIlllIll instanceof lIllIlIIIllllllIIlII && ((lIllIlIIIllllllIIlII)llllIIIIlIIIlIlllIll).IlIlIIIIIIlllIlIllIl().equals("WOOD")) ? 200 : ((llllIIIIlIIIlIlllIll instanceof IllIlllIllIIIIllllII && ((IllIlllIllIIIIllllII)llllIIIIlIIIlIlllIll).IlIlIIIIIIlllIlIllIl().equals("WOOD")) ? 200 : ((llllIIIIlIIIlIlllIll instanceof IIIllIIIlIlIIllIIIlI && ((IIIllIIIlIlIIllIIIlI)llllIIIIlIIIlIlllIll).lllIIIIlllllIlIIllIl().equals("WOOD")) ? 200 : ((llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII) ? 100 : ((llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII) ? 1600 : ((llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.IlIllllIIIlIllIlIIll) ? 20000 : ((llllIIIIlIIIlIlllIll == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl)) ? 100 : ((llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.z) ? 2400 : 0)))))));
    }
    
    public static boolean llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl) > 0;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl) == this && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return n != 2 && (n != 1 || llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl) || IIllllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl));
    }
    
    @Override
    public int[] llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) ? IIlIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl : ((lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) ? IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI : IIlIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.IlIIIlIlIIIllIlIlIIl(n, lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && n == 1) {
            final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll != IIllIIllIIIlIlIIIIlI.lllllIIIIIlIIlllIlIl && llllIIIIlIIIlIlllIll != IIllIIllIIIlIlIIIIlI.IllllIIlIlIllIIIllII) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:furnace";
    }
    
    @Override
    public net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new net.minecraft.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll(illIIlllIIIIlllIIlIl, this);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        switch (n) {
            case 0: {
                return this.lIIIlllIIIllIIIllIII;
            }
            case 1: {
                return this.llIIlIIIlIIIllIlIIIl;
            }
            case 2: {
                return this.llIllIlIIIIllIlIIllI;
            }
            case 3: {
                return this.lIlIlIIIllIIllIIIllI;
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        switch (n) {
            case 0: {
                this.lIIIlllIIIllIIIllIII = n2;
                break;
            }
            case 1: {
                this.llIIlIIIlIIIllIlIIIl = n2;
                break;
            }
            case 2: {
                this.llIllIlIIIIllIlIIllI = n2;
                break;
            }
            case 3: {
                this.lIlIlIIIllIIllIIIllI = n2;
                break;
            }
        }
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 4;
    }
    
    @Override
    public void lIllllllIIllIlIlIlII() {
        for (int i = 0; i < this.lIIIIlIIIIIlllIllIII.length; ++i) {
            this.lIIIIlIIIIIlllIllIII[i] = null;
        }
    }
}
