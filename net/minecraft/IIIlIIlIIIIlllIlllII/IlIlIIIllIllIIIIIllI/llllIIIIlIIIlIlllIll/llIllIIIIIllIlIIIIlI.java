package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    private Random llIllIlIIIIllIlIIllI;
    private IlllllllIIIlIIIlIlII lIlIlIIIllIIllIIIllI;
    private IlIlIlIlIlllllllllIl IlIlIIIllIIllIlllllI;
    int llllIIIIlIIIlIlllIll;
    int IlIlIlIlIlllllllllIl;
    double llIllIIIIIllIlIIIIlI;
    double IlIIIlIlIIIllIlIlIIl;
    double IlIlIIIllIllIIIIIllI;
    double IllIIlllIIIIlllIIlIl;
    int llllIIIlIlllIlIIIIIl;
    int lIIIIlIIIIIlllIllIII;
    int lIIIlllIIIllIIIllIII;
    List llIIlIIIlIIIllIlIIIl;
    
    public llIllIIIIIllIlIIIIlI(final boolean b) {
        super(b);
        this.IlIlIIIllIIllIlllllI = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = 0.618;
        this.IlIIIlIlIIIllIlIlIIl = 0.381;
        this.IlIlIIIllIllIIIIIllI = 1.0;
        this.IllIIlllIIIIlllIIlIl = 1.0;
        this.llllIIIlIlllIlIIIIIl = 1;
        this.lIIIIlIIIIIlllIllIII = 12;
        this.lIIIlllIIIllIIIllIII = 4;
    }
    
    void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = (int)(this.llllIIIIlIIIlIlllIll * this.llIllIIIIIllIlIIIIlI);
        if (this.IlIlIlIlIlllllllllIl >= this.llllIIIIlIIIlIlllIll) {
            this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll - 1;
        }
        int n = (int)(1.382 + Math.pow(this.IllIIlllIIIIlllIIlIl * this.llllIIIIlIIIlIlllIll / 13.0, 2.0));
        if (n < 1) {
            n = 1;
        }
        final int n2 = this.IlIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII() + this.IlIlIlIlIlllllllllIl;
        int i = this.llllIIIIlIIIlIlllIll - this.lIIIlllIIIllIIIllIII;
        (this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList()).add(new IlIIIlIlIIIllIlIlIIl(this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(i), n2));
        while (i >= 0) {
            final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(i);
            if (llllIIIIlIIIlIlllIll >= 0.0f) {
                for (int j = 0; j < n; ++j) {
                    final double n3 = this.IlIlIIIllIllIIIIIllI * llllIIIIlIIIlIlllIll * (this.llIllIlIIIIllIlIIllI.nextFloat() + 0.328);
                    final double n4 = this.llIllIlIIIIllIlIIllI.nextFloat() * 2.0f * 3.141592653589793;
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(n3 * Math.sin(n4) + 0.5, i - 1, n3 * Math.cos(n4) + 0.5);
                    if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII)) == -1) {
                        final int n5 = this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII() - llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII();
                        final int n6 = this.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl() - llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
                        final double n7 = llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() - Math.sqrt(n5 * n5 + n6 * n6) * this.IlIIIlIlIIIllIlIlIIl;
                        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII(), (n7 > n2) ? n2 : ((int)n7), this.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl());
                        if (this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2) == -1) {
                            this.llIIlIIIlIIIllIlIIIl.add(new IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()));
                        }
                    }
                }
            }
            --i;
        }
    }
    
    void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        for (int n2 = (int)(n + 0.618), i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                if (Math.pow(Math.abs(i) + 0.5, 2.0) + Math.pow(Math.abs(j) + 0.5, 2.0) <= n * n) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
                    if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                        this.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl);
                    }
                }
            }
        }
    }
    
    float llllIIIIlIIIlIlllIll(final int n) {
        if (n < this.llllIIIIlIIIlIlllIll * 0.3f) {
            return -1.0f;
        }
        final float n2 = this.llllIIIIlIIIlIlllIll / 2.0f;
        final float n3 = n2 - n;
        float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2 * n2 - n3 * n3);
        if (n3 == 0.0f) {
            llIllIIIIIllIlIIIIlI = n2;
        }
        else if (Math.abs(n3) >= n2) {
            return 0.0f;
        }
        return llIllIIIIIllIlIIIIlI * 0.5f;
    }
    
    float IlIlIlIlIlllllllllIl(final int n) {
        return (n >= 0 && n < this.lIIIlllIIIllIIIllIII) ? ((n != 0 && n != this.lIIIlllIIIllIIIllIII - 1) ? 3.0f : 2.0f) : -1.0f;
    }
    
    void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII; ++i) {
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i), this.IlIlIlIlIlllllllllIl(i), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false));
        }
    }
    
    void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(-ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), -ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), -ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        final int ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
        final float n = llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() / (float)ilIlIlIlIlllllllllIl3;
        final float n2 = llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() / (float)ilIlIlIlIlllllllllIl3;
        final float n3 = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() / (float)ilIlIlIlIlllllllllIl3;
        for (int i = 0; i <= ilIlIlIlIlllllllllIl3; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.5f + i * n, 0.5f + i * n2, 0.5f + i * n3);
            this.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIlIllllIIlIIlIlI.IIIIIIIIIlllIllIlIlI, this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll3)));
        }
    }
    
    private int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
        final int llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        return (llllIIIIlIIIlIlllIll3 > llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll3 > llllIIIIlIIIlIlllIll2) ? llllIIIIlIIIlIlllIll3 : ((llllIIIIlIIIlIlllIll2 > llllIIIIlIIIlIlllIll) ? llllIIIIlIIIlIlllIll2 : llllIIIIlIIIlIlllIll);
    }
    
    private a IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        a a = net.minecraft.llllIIIIlIIIlIlllIll.a.IlIlIlIlIlllllllllIl;
        final int abs = Math.abs(ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        final int abs2 = Math.abs(ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        final int max = Math.max(abs, abs2);
        if (max > 0) {
            if (abs == max) {
                a = net.minecraft.llllIIIIlIIIlIlllIll.a.llllIIIIlIIIlIlllIll;
            }
            else if (abs2 == max) {
                a = net.minecraft.llllIIIIlIIIlIlllIll.a.llIllIIIIIllIlIIIIlI;
            }
        }
        return a;
    }
    
    void IlIlIlIlIlllllllllIl() {
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.llIIlIIIlIIIllIlIIIl.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(iterator.next());
        }
    }
    
    boolean llIllIIIIIllIlIIIIlI(final int n) {
        return n >= this.llllIIIIlIIIlIlllIll * 0.2;
    }
    
    void llIllIIIIIllIlIIIIlI() {
        final IlIlIlIlIlllllllllIl ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI;
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll lllIIIIlllllIlIIllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl;
        this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, llllIIIIlIIIlIlllIll, lllIIIIlllllIlIIllIl);
        if (this.llllIIIlIlllIlIIIIIl == 2) {
            this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl(), llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(), lllIIIIlllllIlIIllIl);
            this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl(), lllIIIIlllllIlIIllIl);
            this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), lllIIIIlllllIlIIllIl);
        }
    }
    
    void IlIIIlIlIIIllIlIlIIl() {
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.llIIlIIIlIIIllIlIIIl) {
            final int llIllIlIIIIllIlIIllI = ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI();
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII(), llIllIlIIIIllIlIIllI, this.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl());
            if (!ilIlIlIlIlllllllllIl.equals(ilIIIlIlIIIllIlIlIIl) && this.llIllIIIIIllIlIIIIlI(llIllIlIIIIllIlIIllI - this.IlIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII())) {
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl);
            }
        }
    }
    
    int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(-ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), -ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), -ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        final int ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        final float n = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() / (float)ilIlIlIlIlllllllllIl3;
        final float n2 = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() / (float)ilIlIlIlIlllllllllIl3;
        final float n3 = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() / (float)ilIlIlIlIlllllllllIl3;
        if (ilIlIlIlIlllllllllIl3 == 0) {
            return -1;
        }
        for (int i = 0; i <= ilIlIlIlIlllllllllIl3; ++i) {
            if (!this.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.5f + i * n, 0.5f + i * n2, 0.5f + i * n3)).llIllIIIIIllIlIIIIlI())) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.lIIIlllIIIllIIIllIII = 5;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII lIlIlIIIllIIllIIIllI, final Random random, final IlIlIlIlIlllllllllIl ilIlIIIllIIllIlllllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.llIllIlIIIIllIlIIllI = new Random(random.nextLong());
        if (this.llllIIIIlIIIlIlllIll == 0) {
            this.llllIIIIlIIIlIlllIll = 5 + this.llIllIlIIIIllIlIIllI.nextInt(this.lIIIIlIIIIIlllIllIII);
        }
        if (!this.IllIIlllIIIIlllIIlIl()) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll();
        this.IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI();
        this.IlIIIlIlIIIllIlIlIIl();
        return true;
    }
    
    private boolean IllIIlllIIIIlllIIlIl() {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII) {
            return false;
        }
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll - 1));
        if (llllIIIIlIIIlIlllIll == -1) {
            return true;
        }
        if (llllIIIIlIIIlIlllIll < 6) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        return true;
    }
}
