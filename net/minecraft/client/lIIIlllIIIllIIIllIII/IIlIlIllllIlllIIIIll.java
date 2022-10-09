package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlIlIllllIlllIIIIll
{
    protected final lllllIIIIIlIlIIIIIIl llllIIIIlIIIlIlllIll;
    protected final IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl;
    protected int llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    protected int IlIlIIIllIllIIIIIllI;
    public IlIllIlIlIIIlIlIlIII[] IllIIlllIIIIlllIIlIl;
    private Map llllIIIlIlllIlIIIIIl;
    
    public IIlIlIllllIlllIIIIll(final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl, final int n, final lllllIIIIIlIlIIIIIIl llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.llllIIIlIlllIlIIIIIl = new HashMap();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll(n);
        this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl = new IlIllIlIlIIIlIlIlIII[this.IlIIIlIlIIIllIlIlIIl * this.llIllIIIIIllIlIIIIlI * this.IlIlIIIllIllIIIIIllI];
        int n = 0;
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                for (int k = 0; k < this.IlIlIIIllIllIIIIIllI; ++k) {
                    final int n2 = (k * this.llIllIIIIIllIlIIIIlI + j) * this.IlIIIlIlIIIllIlIlIIl + i;
                    this.IllIIlllIIIIlllIIlIl[n2] = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll, new IlIlIlIlIlllllllllIl(i * 16, j * 16, k * 16), n++);
                    if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.E() && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.D()) {
                        this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl[n2]);
                    }
                }
            }
        }
        for (int l = 0; l < this.IllIIlllIIIIlllIIlIl.length; ++l) {
            final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = this.IllIIlllIIIIlllIIlIl[l];
            for (int n3 = 0; n3 < lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length; ++n3) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[n3];
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, this.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)));
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        IlIllIlIlIIIlIlIlIII[] illIIlllIIIIlllIIlIl;
        for (int length = (illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl).length, i = 0; i < length; ++i) {
            illIIlllIIIIlllIIlIl[i].llllIIIIlIIIlIlllIll();
        }
        this.IlIlIlIlIlllllllllIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n) {
        final int n2 = n * 2 + 1;
        this.IlIIIlIlIIIllIlIlIIl = n2;
        this.llIllIIIIIllIlIIIIlI = 16;
        this.IlIlIIIllIllIIIIIllI = n2;
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2) {
        final int n3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n) - 8;
        final int n4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2) - 8;
        final int n5 = this.IlIIIlIlIIIllIlIlIIl * 16;
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl; ++i) {
            final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n3, n5, i);
            for (int j = 0; j < this.IlIlIIIllIllIIIIIllI; ++j) {
                final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n4, n5, j);
                for (int k = 0; k < this.llIllIIIIIllIlIIIIlI; ++k) {
                    final int n6 = k * 16;
                    final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = this.IllIIlllIIIIlllIIlIl[(j * this.llIllIIIIIllIlIIIIlI + k) * this.IlIIIlIlIIIllIlIlIIl + i];
                    final IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII();
                    if (liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII() != llllIIIIlIIIlIlllIll || liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII() != n6 || liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl() != llllIIIIlIIIlIlllIll2) {
                        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, n6, llllIIIIlIIIlIlllIll2);
                        if (!ilIlIlIlIlllllllllIl.equals(ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII())) {
                            ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                        }
                    }
                }
            }
        }
    }
    
    private int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final int n4 = n3 * 16;
        int n5 = n4 - n + n2 / 2;
        if (n5 < 0) {
            n5 -= n2 - 1;
        }
        return n4 - n5 / n2 * n2;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, 16);
        final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2, 16);
        final int llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3, 16);
        final int llllIIIIlIIIlIlllIll4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4, 16);
        final int llllIIIIlIIIlIlllIll5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n5, 16);
        final int llllIIIIlIIIlIlllIll6 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6, 16);
        for (int i = llllIIIIlIIIlIlllIll; i <= llllIIIIlIIIlIlllIll4; ++i) {
            int n7 = i % this.IlIIIlIlIIIllIlIlIIl;
            if (n7 < 0) {
                n7 += this.IlIIIlIlIIIllIlIlIIl;
            }
            for (int j = llllIIIIlIIIlIlllIll2; j <= llllIIIIlIIIlIlllIll5; ++j) {
                int n8 = j % this.llIllIIIIIllIlIIIIlI;
                if (n8 < 0) {
                    n8 += this.llIllIIIIIllIlIIIIlI;
                }
                for (int k = llllIIIIlIIIlIlllIll3; k <= llllIIIIlIIIlIlllIll6; ++k) {
                    int n9 = k % this.IlIlIIIllIllIIIIIllI;
                    if (n9 < 0) {
                        n9 += this.IlIlIIIllIllIIIIIllI;
                    }
                    this.IllIIlllIIIIlllIIlIl[(n9 * this.llIllIIIIIllIlIIIIlI + n8) * this.IlIIIlIlIIIllIlIlIIl + n7].llllIIIIlIIIlIlllIll(true);
                }
            }
        }
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4;
        final int n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >> 4;
        final int n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4;
        if (n2 >= 0 && n2 < this.llIllIIIIIllIlIIIIlI) {
            int n4 = n % this.IlIIIlIlIIIllIlIlIIl;
            if (n4 < 0) {
                n4 += this.IlIIIlIlIIIllIlIlIIl;
            }
            int n5 = n3 % this.IlIlIIIllIllIIIIIllI;
            if (n5 < 0) {
                n5 += this.IlIlIIIllIllIIIIIllI;
            }
            return this.IllIIlllIIIIlllIIlIl[(n5 * this.llIllIIIIIllIlIIIIlI + n2) * this.IlIIIlIlIIIllIlIlIIl + n4];
        }
        return null;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        final IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII();
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII() >> 8 << 8, liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl() >> 8 << 8);
        final IlIIlIlIIIlIIlIlIlII[] ilIIIlIlIIIllIlIlIIl = IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl;
        lIIIlllIIIllIIIllIII[] array = this.llllIIIlIlllIlIIIIIl.get(ilIlIlIlIlllllllllIl);
        if (array == null) {
            array = new lIIIlllIIIllIIIllIII[ilIIIlIlIIIllIlIlIIl.length];
            for (int i = 0; i < ilIIIlIlIIIllIlIlIIl.length; ++i) {
                array[i] = new lIIIlllIIIllIIIllIII(ilIIIlIlIIIllIlIlIIl[i]);
            }
            this.llllIIIlIlllIlIIIIIl.put(ilIlIlIlIlllllllllIl, array);
        }
        for (int j = 0; j < ilIIIlIlIIIllIlIlIIl.length; ++j) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = array[j];
            if (liiIlllIIIllIIIllIII2 != null) {
                ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(j).llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII2);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl> iterator = this.llllIIIlIlllIlIIIIIl.keySet().iterator();
        while (iterator.hasNext()) {
            final lIIIlllIIIllIIIllIII[] array = this.llllIIIlIlllIlIIIIIl.get(iterator.next());
            for (int i = 0; i < array.length; ++i) {
                final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = array[i];
                if (liiIlllIIIllIIIllIII != null) {
                    liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI();
                }
                array[i] = null;
            }
        }
        this.llllIIIlIlllIlIIIIIl.clear();
    }
}
