package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.concurrent.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll
{
    private static final Logger llIllIIIIIllIlIIIIlI;
    private final llllIIIlIlllIlIIIIIl[] IlIIIlIlIIIllIlIlIIl;
    private final byte[] IlIlIIIllIllIIIIIllI;
    private final int[] IllIIlllIIIIlllIIlIl;
    private final boolean[] llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private final IlllllllIIIlIIIlIlII lIIIlllIIIllIIIllIII;
    private final int[] llIIlIIIlIIIllIlIIIl;
    public final int llllIIIIlIIIlIlllIll;
    public final int IlIlIlIlIlllllllllIl;
    private boolean llIllIlIIIIllIlIIllI;
    private final Map lIlIlIIIllIIllIIIllI;
    private final IIIlIIlIIIIlllIlllII[] IlIlIIIllIIllIlllllI;
    private boolean IIIIlllIIIIIIlIIIlll;
    private boolean llllIIllllIlIlIIIIll;
    private boolean IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    private long IlIlIIIIIIlllIlIllIl;
    private int IIllIIllIIIlIlIIIIlI;
    private long IIIlIIIlIlIIlllIIlll;
    private int IlIlIIIlIIlIlIIlllIl;
    private ConcurrentLinkedQueue IlllllllIIIlIIIlIlII;
    
    static {
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII, final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = new llllIIIlIlllIlIIIIIl[16];
        this.IlIlIIIllIllIIIIIllI = new byte[256];
        this.IllIIlllIIIIlllIIlIl = new int[256];
        this.llllIIIlIlllIlIIIIIl = new boolean[256];
        this.lIlIlIIIllIIllIIIllI = Maps.newHashMap();
        this.IlIlIIIlIIlIlIIlllIl = 4096;
        this.IlllllllIIIlIIIlIlII = Queues.newConcurrentLinkedQueue();
        this.IlIlIIIllIIllIlllllI = new IIIlIIlIIIIlllIlllII[16];
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIIlIIIlIIIllIlIIIl = new int[256];
        for (int i = 0; i < this.IlIlIIIllIIllIlllllI.length; ++i) {
            this.IlIlIIIllIIllIlllllI[i] = new IIIlIIlIIIIlllIlllII(llIllIIIIIllIlIIIIlI.class);
        }
        Arrays.fill(this.IllIIlllIIIIlllIIlIl, -999);
        Arrays.fill(this.IlIlIIIllIllIIIIIllI, (byte)(-1));
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2) {
        this(illlllllIIIlIIIlIlII, n, n2);
        final int n3 = 256;
        final boolean b = !illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < n3; ++k) {
                    final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i * n3 * 16 | j * n3 | k);
                    if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        final int n4 = k >> 4;
                        if (this.IlIIIlIlIIIllIlIlIIl[n4] == null) {
                            this.IlIIIlIlIIIllIlIlIIl[n4] = new llllIIIlIlllIlIIIIIl(n4 << 4, b);
                        }
                        this.IlIIIlIlIIIllIlIlIIl[n4].llllIIIIlIIIlIlllIll(i, k & 0xF, j, llllIIIIlIIIlIlllIll);
                    }
                }
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return n == this.llllIIIIlIIIlIlllIll && n2 == this.IlIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF);
    }
    
    public int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return this.llIIlIIIlIIIllIlIIIl[n2 << 4 | n];
    }
    
    public int llllIIIIlIIIlIlllIll() {
        for (int i = this.IlIIIlIlIIIllIlIlIIl.length - 1; i >= 0; --i) {
            if (this.IlIIIlIlIIIllIlIlIIl[i] != null) {
                return this.IlIIIlIlIIIllIlIlIIl[i].llIllIIIIIllIlIIIIlI();
            }
        }
        return 0;
    }
    
    public llllIIIlIlllIlIIIIIl[] IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    protected void llIllIIIIIllIlIIIIlI() {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
        this.IIllIIllIIIlIlIIIIlI = Integer.MAX_VALUE;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                this.IllIIlllIIIIlllIIlIl[i + (j << 4)] = -999;
                int k = llllIIIIlIIIlIlllIll + 16;
                while (k > 0) {
                    if (this.IlIlIIIllIllIIIIIllI(i, k - 1, j).IlIlIlIlIlllllllllIl() != 0) {
                        if ((this.llIIlIIIlIIIllIlIIIl[j << 4 | i] = k) < this.IIllIIllIIIlIlIIIIlI) {
                            this.IIllIIllIIIlIlIIIIlI = k;
                            break;
                        }
                        break;
                    }
                    else {
                        --k;
                    }
                }
            }
        }
        this.IIlllIIlIllIllIlIIll = true;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
        this.IIllIIllIIIlIlIIIIlI = Integer.MAX_VALUE;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                this.IllIIlllIIIIlllIIlIl[i + (j << 4)] = -999;
                int k = llllIIIIlIIIlIlllIll + 16;
                while (k > 0) {
                    if (this.IlIIIlIlIIIllIlIlIIl(i, k - 1, j) != 0) {
                        if ((this.llIIlIIIlIIIllIlIIIl[j << 4 | i] = k) < this.IIllIIllIIIlIlIIIIlI) {
                            this.IIllIIllIIIlIlIIIIlI = k;
                            break;
                        }
                        break;
                    }
                    else {
                        --k;
                    }
                }
                if (!this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
                    int n = 15;
                    int n2 = llllIIIIlIIIlIlllIll + 16 - 1;
                    do {
                        int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(i, n2, j);
                        if (ilIIIlIlIIIllIlIlIIl == 0 && n != 15) {
                            ilIIIlIlIIIllIlIlIIl = 1;
                        }
                        n -= ilIIIlIlIIIllIlIlIIl;
                        if (n > 0) {
                            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[n2 >> 4];
                            if (llllIIIlIlllIlIIIIIl == null) {
                                continue;
                            }
                            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(i, n2 & 0xF, j, n);
                            this.lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((this.llllIIIIlIIIlIlllIll << 4) + i, n2, (this.IlIlIlIlIlllllllllIl << 4) + j));
                        }
                    } while (--n2 > 0 && n > 0);
                }
            }
        }
        this.IIlllIIlIllIllIlIIll = true;
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        this.llllIIIlIlllIlIIIIIl[n + n2 * 16] = true;
        this.llIllIlIIIIllIlIIllI = true;
    }
    
    private void lIIIIlIIIIIlllIllIII(final boolean b) {
        this.lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("recheckGaps");
        if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll * 16 + 8, 0, this.IlIlIlIlIlllllllllIl * 16 + 8), 16)) {
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    if (this.llllIIIlIlllIlIIIIIl[i + j * 16]) {
                        this.llllIIIlIlllIlIIIIIl[i + j * 16] = false;
                        final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(i, j);
                        final int n = this.llllIIIIlIIIlIlllIll * 16 + i;
                        final int n2 = this.IlIlIlIlIlllllllllIl * 16 + j;
                        int min = Integer.MAX_VALUE;
                        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                            min = Math.min(min, this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(n + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII(), n2 + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl()));
                        }
                        this.IlIlIlIlIlllllllllIl(n, n2, min);
                        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll2 : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                            this.IlIlIlIlIlllllllllIl(n + lllIllIIIllllllIllll2.lIIIIlIIIIIlllIllIII(), n2 + lllIllIIIllllllIllll2.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl);
                        }
                        if (b) {
                            this.lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
                            return;
                        }
                    }
                }
            }
            this.llIllIlIIIIllIlIIllI = false;
        }
        this.lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        final int liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n, 0, n2)).lIIIlllIIIllIIIllIII();
        if (liiIlllIIIllIIIllIII > n3) {
            this.llllIIIIlIIIlIlllIll(n, n2, n3, liiIlllIIIllIIIllIII + 1);
        }
        else if (liiIlllIIIllIIIllIII < n3) {
            this.llllIIIIlIIIlIlllIll(n, n2, liiIlllIIIllIIIllIII, n3 + 1);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        if (n4 > n3 && this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n, 0, n2), 16)) {
            for (int i = n3; i < n4; ++i) {
                this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n, i, n2));
            }
            this.IIlllIIlIllIllIlIIll = true;
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3) {
        int n5;
        final int n4 = n5 = (this.llIIlIIIlIIIllIlIIIl[n3 << 4 | n] & 0xFF);
        if (n2 > n4) {
            n5 = n2;
        }
        while (n5 > 0 && this.IlIIIlIlIIIllIlIlIIl(n, n5 - 1, n3) == 0) {
            --n5;
        }
        if (n5 != n4) {
            this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n + this.llllIIIIlIIIlIlllIll * 16, n3 + this.IlIlIlIlIlllllllllIl * 16, n5, n4);
            this.llIIlIIIlIIIllIlIIIl[n3 << 4 | n] = n5;
            final int n6 = this.llllIIIIlIIIlIlllIll * 16 + n;
            final int n7 = this.IlIlIlIlIlllllllllIl * 16 + n3;
            if (!this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
                if (n5 < n4) {
                    for (int i = n5; i < n4; ++i) {
                        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[i >> 4];
                        if (llllIIIlIlllIlIIIIIl != null) {
                            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, i & 0xF, n3, 15);
                            this.lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((this.llllIIIIlIIIlIlllIll << 4) + n, i, (this.IlIlIlIlIlllllllllIl << 4) + n3));
                        }
                    }
                }
                else {
                    for (int j = n4; j < n5; ++j) {
                        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = this.IlIIIlIlIIIllIlIlIIl[j >> 4];
                        if (llllIIIlIlllIlIIIIIl2 != null) {
                            llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll(n, j & 0xF, n3, 0);
                            this.lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((this.llllIIIIlIIIlIlllIll << 4) + n, j, (this.IlIlIlIlIlllllllllIl << 4) + n3));
                        }
                    }
                }
                int n8 = 15;
                while (n5 > 0 && n8 > 0) {
                    --n5;
                    int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(n, n5, n3);
                    if (ilIIIlIlIIIllIlIlIIl == 0) {
                        ilIIIlIlIIIllIlIlIIl = 1;
                    }
                    n8 -= ilIIIlIlIIIllIlIlIIl;
                    if (n8 < 0) {
                        n8 = 0;
                    }
                    final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = this.IlIIIlIlIIIllIlIlIIl[n5 >> 4];
                    if (llllIIIlIlllIlIIIIIl3 != null) {
                        llllIIIlIlllIlIIIIIl3.llllIIIIlIIIlIlllIll(n, n5 & 0xF, n3, n8);
                    }
                }
            }
            final int iIllIIllIIIlIlIIIIlI = this.llIIlIIIlIIIllIlIIIl[n3 << 4 | n];
            int n9;
            int n10;
            if ((n9 = iIllIIllIIIlIlIIIIlI) < (n10 = n4)) {
                n10 = iIllIIllIIIlIlIIIIlI;
                n9 = n4;
            }
            if (iIllIIllIIIlIlIIIIlI < this.IIllIIllIIIlIlIIIIlI) {
                this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
            }
            if (!this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
                for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                    this.llllIIIIlIIIlIlllIll(n6 + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII(), n7 + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl(), n10, n9);
                }
                this.llllIIIIlIIIlIlllIll(n6, n7, n10, n9);
            }
            this.IIlllIIlIllIllIlIIll = true;
        }
    }
    
    public int IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl();
    }
    
    private int IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3) {
        return this.IlIlIIIllIllIIIIIllI(n, n2, n3).IlIlIlIlIlllllllllIl();
    }
    
    private net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI(final int n, final int n2, final int n3) {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        if (n2 >= 0 && n2 >> 4 < this.IlIIIlIlIIIllIlIlIIl.length) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[n2 >> 4];
            if (llllIIIlIlllIlIIIIIl != null) {
                try {
                    llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2 & 0xF, n3);
                }
                catch (Throwable t) {
                    throw new IIlIlllIlIlllIlIllll(net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Getting block"));
                }
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        try {
            return this.IlIlIIIllIllIIIIIllI(n & 0xF, n2, n3 & 0xF);
        }
        catch (IIlIlllIlIlllIlIllll ilIlllIlIlllIlIllll) {
            ilIlllIlIlllIlIllll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll("Block being got").llllIIIIlIIIlIlllIll("Location", new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, n, n2, n3));
            throw ilIlllIlIlllIlIllll;
        }
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        try {
            return this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF);
        }
        catch (IIlIlllIlIlllIlIllll ilIlllIlIlllIlIllll) {
            ilIlllIlIlllIlIllll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll("Block being got").llllIIIIlIIIlIlllIll("Location", new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this, ilIlIlIlIlllllllllIl));
            throw ilIlllIlIlllIlIllll;
        }
    }
    
    public llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.lIIIlllIIIllIIIllIII.p_() == llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = null;
            if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() == 60) {
                llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az.lllIllIIIllllllIllll();
            }
            if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() == 70) {
                llIIlIIIlIIIllIlIIIl = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
            }
            return (llIIlIIIlIIIllIlIIIl == null) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll() : llIIlIIIlIIIllIlIIIl;
        }
        try {
            if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >> 4 < this.IlIIIlIlIIIllIlIlIIl.length) {
                final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >> 4];
                if (llllIIIlIlllIlIIIIIl != null) {
                    return llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() & 0xF, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF);
                }
            }
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Getting block state");
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Block being got").llllIIIIlIIIlIlllIll("Location", new IlIIIlIlIIIllIlIlIIl(this, ilIlIlIlIlllllllllIl));
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
    }
    
    private int IllIIlllIIIIlllIIlIl(final int n, final int n2, final int n3) {
        if (n2 >> 4 >= this.IlIIIlIlIIIllIlIlIIl.length) {
            return 0;
        }
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[n2 >> 4];
        return (llllIIIlIlllIlIIIIIl != null) ? llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(n, n2 & 0xF, n3) : 0;
    }
    
    public int IlIlIIIllIllIIIIIllI(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF);
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final int n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF;
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int n2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF;
        final int n3 = n2 << 4 | n;
        if (liiIlllIIIllIIIllIII >= this.IllIIlllIIIIlllIIlIl[n3] - 1) {
            this.IllIIlllIIIIlllIIlIl[n3] = -999;
        }
        final int n4 = this.llIIlIIIlIIIllIlIIIl[n3];
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl);
        if (ilIIIlIlIIIllIlIlIIl == llIIlIIIlIIIllIlIIIl) {
            return null;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
        llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[liiIlllIIIllIIIllIII >> 4];
        int n5 = 0;
        if (llllIIIlIlllIlIIIIIl == null) {
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                return null;
            }
            final llllIIIlIlllIlIIIIIl[] ilIIIlIlIIIllIlIlIIl2 = this.IlIIIlIlIIIllIlIlIIl;
            final int n6 = liiIlllIIIllIIIllIII >> 4;
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl(liiIlllIIIllIIIllIII >> 4 << 4, !this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll());
            ilIIIlIlIIIllIlIlIIl2[n6] = llllIIIlIlllIlIIIIIl2;
            llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl2;
            n5 = ((liiIlllIIIllIIIllIII >= n4) ? 1 : 0);
        }
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, liiIlllIIIllIIIllIII & 0xF, n2, llIIlIIIlIIIllIlIIIl);
        if (llIllIIIIIllIlIIIIlI2 != llIllIIIIIllIlIIIIlI) {
            if (!this.lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII) {
                llIllIIIIIllIlIIIIlI2.IlIIIlIlIIIllIlIlIIl(this.lIIIlllIIIllIIIllIII, ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
            }
            else if (llIllIIIIIllIlIIIIlI2 instanceof du) {
                this.lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl(ilIlIlIlIlllllllllIl);
            }
        }
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, liiIlllIIIllIIIllIII & 0xF, n2) != llIllIIIIIllIlIIIIlI) {
            return null;
        }
        if (n5 != 0) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        else {
            final int ilIlIlIlIlllllllllIl2 = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
            final int ilIlIlIlIlllllllllIl3 = llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl2 > 0) {
                if (liiIlllIIIllIIIllIII >= n4) {
                    this.llIllIIIIIllIlIIIIlI(n, liiIlllIIIllIIIllIII + 1, n2);
                }
            }
            else if (liiIlllIIIllIIIllIII == n4 - 1) {
                this.llIllIIIIIllIlIIIIlI(n, liiIlllIIIllIIIllIII, n2);
            }
            if (ilIlIlIlIlllllllllIl2 != ilIlIlIlIlllllllllIl3 && (ilIlIlIlIlllllllllIl2 < ilIlIlIlIlllllllllIl3 || this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl) > 0 || this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl) > 0)) {
                this.IlIIIlIlIIIllIlIlIIl(n, n2);
            }
        }
        if (llIllIIIIIllIlIIIIlI2 instanceof du) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI);
            if (llllIIIIlIIIlIlllIll != null) {
                llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl();
            }
        }
        if (!this.lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII && llIllIIIIIllIlIIIIlI2 != llIllIIIIIllIlIIIIlI) {
            llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.lIIIlllIIIllIIIllIII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        }
        if (llIllIIIIIllIlIIIIlI instanceof du) {
            net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI);
            if (ilIIIlIlIIIllIlIlIIl3 == null) {
                ilIIIlIlIIIllIlIlIIl3 = ((du)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl));
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl3);
            }
            if (ilIIIlIlIIIllIlIlIIl3 != null) {
                ilIIIlIlIIIllIlIlIIl3.lllIIIIlllllIlIIllIl();
            }
        }
        this.IIlllIIlIllIllIlIIll = true;
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF;
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int n2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF;
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = this.IlIIIlIlIIIllIlIlIIl[liiIlllIIIllIIIllIII >> 4];
        return (llllIIIlIlllIlIIIIIl2 == null) ? (this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl) ? llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI : 0) : ((llllIIIlIlllIlIIIIIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) ? (this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() ? 0 : llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl(n, liiIlllIIIllIIIllIII & 0xF, n2)) : ((llllIIIlIlllIlIIIIIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) ? llllIIIlIlllIlIIIIIl2.IlIlIIIllIllIIIIIllI(n, liiIlllIIIllIIIllIII & 0xF, n2) : llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF;
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF;
        llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = this.IlIIIlIlIIIllIlIlIIl[liiIlllIIIllIIIllIII >> 4];
        if (llllIIIlIlllIlIIIIIl2 == null) {
            final llllIIIlIlllIlIIIIIl[] ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
            final int n4 = liiIlllIIIllIIIllIII >> 4;
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = new llllIIIlIlllIlIIIIIl(liiIlllIIIllIIIllIII >> 4 << 4, !this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll());
            ilIIIlIlIIIllIlIlIIl[n4] = llllIIIlIlllIlIIIIIl3;
            llllIIIlIlllIlIIIIIl2 = llllIIIlIlllIlIIIIIl3;
            this.IlIIIlIlIIIllIlIlIIl();
        }
        this.IIlllIIlIllIllIlIIll = true;
        if (llllIIIlIlllIlIIIIIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            if (!this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
                llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll(n2, liiIlllIIIllIIIllIII & 0xF, n3, n);
            }
        }
        else if (llllIIIlIlllIlIIIIIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(n2, liiIlllIIIllIIIllIII & 0xF, n3, n);
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF;
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF;
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[liiIlllIIIllIIIllIII >> 4];
        if (llllIIIlIlllIlIIIIIl == null) {
            return (!this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() && n < net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) ? (net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI - n) : 0;
        }
        int n4 = (this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() ? 0 : llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl(n2, liiIlllIIIllIIIllIII & 0xF, n3)) - n;
        final int ilIlIIIllIllIIIIIllI = llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI(n2, liiIlllIIIllIIIllIII & 0xF, n3);
        if (ilIlIIIllIllIIIIIllI > n4) {
            n4 = ilIlIIIllIllIIIIIllI;
        }
        return n4;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.lllIIIIlllllIlIIllIl = true;
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl / 16.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII / 16.0);
        if (llIllIIIIIllIlIIIIlI2 != this.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI3 != this.IlIlIlIlIlllllllllIl) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.warn("Wrong location! (" + llIllIIIIIllIlIIIIlI2 + ", " + llIllIIIIIllIlIIIIlI3 + ") should be (" + this.llllIIIIlIIIlIlllIll + ", " + this.IlIlIlIlIlllllllllIl + "), " + llIllIIIIIllIlIIIIlI, new Object[] { llIllIIIIIllIlIIIIlI });
            llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII();
        }
        int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII / 16.0);
        if (llIllIIIIIllIlIIIIlI4 < 0) {
            llIllIIIIIllIlIIIIlI4 = 0;
        }
        if (llIllIIIIIllIlIIIIlI4 >= this.IlIlIIIllIIllIlllllI.length) {
            llIllIIIIIllIlIIIIlI4 = this.IlIlIIIllIIllIlllllI.length - 1;
        }
        llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll = true;
        llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl = this.llllIIIIlIIIlIlllIll;
        llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII = llIllIIIIIllIlIIIIlI4;
        llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII = this.IlIlIlIlIlllllllllIl;
        this.IlIlIIIllIIllIlllllI[llIllIIIIIllIlIIIIlI4].add(llIllIIIIIllIlIIIIlI);
    }
    
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII);
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, int n) {
        if (n < 0) {
            n = 0;
        }
        if (n >= this.IlIlIIIllIIllIlllllI.length) {
            n = this.IlIlIIIllIIllIlllllI.length - 1;
        }
        this.IlIlIIIllIIllIlllllI[n].remove(llIllIIIIIllIlIIIIlI);
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= this.llIIlIIIlIIIllIlIIIl[(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF) << 4 | (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF)];
    }
    
    private net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl lIIIlllIIIllIIIllIII(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        return llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll() ? ((du)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl)) : null;
    }
    
    public net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl liiIlllIIIllIIIllIII = this.lIlIlIIIllIIllIIIllI.get(ilIlIlIlIlllllllllIl);
        if (liiIlllIIIllIIIllIII == null) {
            if (ilIlIIIllIllIIIIIllI == net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) {
                liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl);
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, liiIlllIIIllIIIllIII);
            }
            else if (ilIlIIIllIllIIIIIllI == net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl) {
                this.IlllllllIIIlIIIlIlII.add(ilIlIlIlIlllllllllIl);
            }
        }
        else if (liiIlllIIIllIIIllIII.llllIIllllIlIlIIIIll()) {
            this.lIlIlIIIllIIllIIIllI.remove(ilIlIlIlIlllllllllIl);
            return null;
        }
        return liiIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI(), ilIIIlIlIIIllIlIlIIl);
        if (this.lIIIIlIIIIIlllIllIII) {
            this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl) instanceof du) {
            if (this.lIlIlIIIllIIllIIIllI.containsKey(ilIlIlIlIlllllllllIl)) {
                this.lIlIlIIIllIIllIIIllI.get(ilIlIlIlIlllllllllIl).IlIllIlIlIIIlIlIlIII();
            }
            ilIIIlIlIIIllIlIlIIl.IIlllIIlIllIllIlIIll();
            this.lIlIlIIIllIIllIIIllI.put(ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public void llllIIIlIlllIlIIIIIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.lIIIIlIIIIIlllIllIII) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.lIlIlIIIllIIllIIIllI.remove(ilIlIlIlIlllllllllIl);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                ilIIIlIlIIIllIlIlIIl.IlIllIlIlIIIlIlIlIII();
            }
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.lIIIIlIIIIIlllIllIII = true;
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI.values());
        for (int i = 0; i < this.IlIlIIIllIIllIlllllI.length; ++i) {
            final Iterator iterator = this.IlIlIIIllIIllIlllllI[i].iterator();
            while (iterator.hasNext()) {
                iterator.next().IIlllllIllIllIlIlIII();
            }
            this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI[i]);
        }
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        this.lIIIIlIIIIIlllIllIII = false;
        final Iterator<net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl> iterator = this.lIlIlIIIllIIllIIIllI.values().iterator();
        while (iterator.hasNext()) {
            this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(iterator.next());
        }
        for (int i = 0; i < this.IlIlIIIllIIllIlllllI.length; ++i) {
            this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIIllIlllllI[i]);
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.IIlllIIlIllIllIlIIll = true;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final Predicate predicate) {
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl - 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 2.0) / 16.0);
        final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, 0, this.IlIlIIIllIIllIlllllI.length - 1);
        for (int llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI3, 0, this.IlIlIIIllIIllIlllllI.length - 1), i = llllIIIIlIIIlIlllIll2; i <= llllIIIIlIIIlIlllIll3; ++i) {
            if (!this.IlIlIIIllIIllIlllllI[i].isEmpty()) {
                for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI4 : this.IlIlIIIllIIllIlllllI[i]) {
                    if (llIllIIIIIllIlIIIIlI4.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll) && llIllIIIIIllIlIIIIlI4 != llIllIIIIIllIlIIIIlI) {
                        if (predicate == null || predicate.apply((Object)llIllIIIIIllIlIIIIlI4)) {
                            list.add(llIllIIIIIllIlIIIIlI4);
                        }
                        final llIllIIIIIllIlIIIIlI[] ilIllllIIlIllIlIlIll = llIllIIIIIllIlIIIIlI4.IlIllllIIlIllIlIlIll();
                        if (ilIllllIIlIllIlIlIll == null) {
                            continue;
                        }
                        for (int j = 0; j < ilIllllIIlIllIlIlIll.length; ++j) {
                            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI5 = ilIllllIIlIllIlIlIll[j];
                            if (llIllIIIIIllIlIIIIlI5 != llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI5.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll) && (predicate == null || predicate.apply((Object)llIllIIIIIllIlIIIIlI5))) {
                                list.add(llIllIIIIIllIlIIIIlI5);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final Class clazz, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final Predicate predicate) {
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl - 2.0) / 16.0);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 2.0) / 16.0);
        final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0, this.IlIlIIIllIIllIlllllI.length - 1);
        for (int llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, 0, this.IlIlIIIllIIllIlllllI.length - 1), i = llllIIIIlIIIlIlllIll2; i <= llllIIIIlIIIlIlllIll3; ++i) {
            for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 : this.IlIlIIIllIIllIlllllI[i].llIllIIIIIllIlIIIIlI(clazz)) {
                if (llIllIIIIIllIlIIIIlI3.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll) && (predicate == null || predicate.apply((Object)llIllIIIIIllIlIIIIlI3))) {
                    list.add(llIllIIIIIllIlIIIIlI3);
                }
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final boolean b) {
        if (b) {
            if ((this.lllIIIIlllllIlIIllIl && this.lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII() != this.IlIlIIIIIIlllIlIllIl) || this.IIlllIIlIllIllIlIIll) {
                return true;
            }
        }
        else if (this.lllIIIIlllllIlIIllIl && this.lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII() >= this.IlIlIIIIIIlllIlIllIl + 600L) {
            return true;
        }
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public Random llllIIIIlIIIlIlllIll(final long n) {
        return new Random(this.lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII() + this.llllIIIIlIIIlIlllIll * this.llllIIIIlIIIlIlllIll * 4987142 + this.llllIIIIlIIIlIlllIll * 5947611 + this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl * 4392871L + this.IlIlIlIlIlllllllllIl * 389711 ^ n);
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2, final int n, final int n2) {
        final boolean llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2 - 1);
        final boolean llllIIIIlIIIlIlllIll2 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n + 1, n2);
        final boolean llllIIIIlIIIlIlllIll3 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2 + 1);
        final boolean llllIIIIlIIIlIlllIll4 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n - 1, n2);
        final boolean llllIIIIlIIIlIlllIll5 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n - 1, n2 - 1);
        final boolean llllIIIIlIIIlIlllIll6 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n + 1, n2 + 1);
        final boolean llllIIIIlIIIlIlllIll7 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n - 1, n2 + 1);
        final boolean llllIIIIlIIIlIlllIll8 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n + 1, n2 - 1);
        if (llllIIIIlIIIlIlllIll2 && llllIIIIlIIIlIlllIll3 && llllIIIIlIIIlIlllIll6) {
            if (!this.IIIIlllIIIIIIlIIIlll) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, n, n2);
            }
            else {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, this, n, n2);
            }
        }
        if (llllIIIIlIIIlIlllIll4 && llllIIIIlIIIlIlllIll3 && llllIIIIlIIIlIlllIll7) {
            final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(n - 1, n2);
            if (!ilIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, n - 1, n2);
            }
            else {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, ilIIIlIlIIIllIlIlIIl, n - 1, n2);
            }
        }
        if (llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll2 && llllIIIIlIIIlIlllIll8) {
            final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl2 = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(n, n2 - 1);
            if (!ilIIIlIlIIIllIlIlIIl2.IIIIlllIIIIIIlIIIlll) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, n, n2 - 1);
            }
            else {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, ilIIIlIlIIIllIlIlIIl2, n, n2 - 1);
            }
        }
        if (llllIIIIlIIIlIlllIll5 && llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll4) {
            final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl3 = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(n - 1, n2 - 1);
            if (!ilIIIlIlIIIllIlIlIIl3.IIIIlllIIIIIIlIIIlll) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, n - 1, n2 - 1);
            }
            else {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, ilIIIlIlIIIllIlIlIIl3, n - 1, n2 - 1);
            }
        }
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl lIIIIlIIIIIlllIllIII(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF) | (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF) << 4;
        if (new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), this.IllIIlllIIIIlllIIlIl[n], ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()).lIIIlllIIIllIIIllIII() == -999) {
            net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), this.llllIIIIlIIIlIlllIll() + 15, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
            int n2 = -1;
            while (ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() > 0 && n2 == -1) {
                final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2).IllIIlllIIIIlllIIlIl();
                if (!illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() && !illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll()) {
                    ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl();
                }
                else {
                    n2 = ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() + 1;
                }
            }
            this.IllIIlllIIIIlllIIlIl[n] = n2;
        }
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), this.IllIIlllIIIIlllIIlIl[n], ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean b) {
        if (this.llIllIlIIIIllIlIIllI && !this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() && !b) {
            this.lIIIIlIIIIIlllIllIII(this.lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII);
        }
        this.IlIllIlIlIIIlIlIlIII = true;
        if (!this.llllIIllllIlIlIIIIll && this.IIIIlllIIIIIIlIIIlll) {
            this.IIIIlllIIIIIIlIIIlll();
        }
        while (!this.IlllllllIIIlIIIlIlII.isEmpty()) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.poll();
            if (this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI) == null && this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).IIIIlllIIIIIIlIIIlll()) {
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl));
                this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.IlIllIlIlIIIlIlIlIII && this.IIIIlllIIIIIIlIIIlll && this.llllIIllllIlIlIIIIll;
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl() {
        return new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
    }
    
    public boolean llIllIIIIIllIlIIIIlI(int n, int n2) {
        if (n < 0) {
            n = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        for (int i = n; i <= n2; i += 16) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[i >> 4];
            if (llllIIIlIlllIlIIIIIl != null && !llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) {
                return false;
            }
        }
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl[] array) {
        if (this.IlIIIlIlIIIllIlIlIIl.length != array.length) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.warn("Could not set level chunk sections, array length is " + array.length + " instead of " + this.IlIIIlIlIIIllIlIlIIl.length);
        }
        else {
            for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                this.IlIIIlIlIIIllIlIlIIl[i] = array[i];
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final byte[] array, final int n, final boolean b) {
        int n2 = 0;
        final boolean b2 = !this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll();
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            if ((n & 1 << i) != 0x0) {
                if (this.IlIIIlIlIIIllIlIlIIl[i] == null) {
                    this.IlIIIlIlIIIllIlIlIIl[i] = new llllIIIlIlllIlIIIIIl(i << 4, b2);
                }
                final char[] ilIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl[i].IlIlIIIllIllIIIIIllI();
                for (int j = 0; j < ilIlIIIllIllIIIIIllI.length; ++j) {
                    ilIlIIIllIllIIIIIllI[j] = (char)((array[n2 + 1] & 0xFF) << 8 | (array[n2] & 0xFF));
                    n2 += 2;
                }
            }
            else if (b && this.IlIIIlIlIIIllIlIlIIl[i] != null) {
                this.IlIIIlIlIIIllIlIlIIl[i] = null;
            }
        }
        for (int k = 0; k < this.IlIIIlIlIIIllIlIlIIl.length; ++k) {
            if ((n & 1 << k) != 0x0 && this.IlIIIlIlIIIllIlIlIIl[k] != null) {
                final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl = this.IlIIIlIlIIIllIlIlIIl[k].IllIIlllIIIIlllIIlIl();
                System.arraycopy(array, n2, illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(), 0, illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll().length);
                n2 += illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll().length;
            }
        }
        if (b2) {
            for (int l = 0; l < this.IlIIIlIlIIIllIlIlIIl.length; ++l) {
                if ((n & 1 << l) != 0x0 && this.IlIIIlIlIIIllIlIlIIl[l] != null) {
                    final lIIIlllIIIllIIIllIII llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl[l].llllIIIlIlllIlIIIIIl();
                    System.arraycopy(array, n2, llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(), 0, llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll().length);
                    n2 += llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll().length;
                }
            }
        }
        if (b) {
            System.arraycopy(array, n2, this.IlIlIIIllIllIIIIIllI, 0, this.IlIlIIIllIllIIIIIllI.length);
            final int n3 = n2 + this.IlIlIIIllIllIIIIIllI.length;
        }
        for (int n4 = 0; n4 < this.IlIIIlIlIIIllIlIlIIl.length; ++n4) {
            if (this.IlIIIlIlIIIllIlIlIIl[n4] != null && (n & 1 << n4) != 0x0) {
                this.IlIIIlIlIIIllIlIlIIl[n4].IlIIIlIlIIIllIlIlIIl();
            }
        }
        this.llllIIllllIlIlIIIIll = true;
        this.IIIIlllIIIIIIlIIIlll = true;
        this.llIllIIIIIllIlIIIIlI();
        final Iterator<net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl> iterator = this.lIlIlIIIllIIllIIIllI.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().lllIIIIlllllIlIIllIl();
        }
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        final int n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF;
        final int n2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF;
        int liiiiIlIlIIIlIIIIlIl = this.IlIlIIIllIllIIIIIllI[n2 << 4 | n] & 0xFF;
        if (liiiiIlIlIIIlIIIIlIl == 255) {
            liiiiIlIlIIIlIIIIlIl = iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll).lIIIIIlIlIIIlIIIIlIl;
            this.IlIlIIIllIllIIIIIllI[n2 << 4 | n] = (byte)(liiiiIlIlIIIlIIIIlIl & 0xFF);
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(liiiiIlIlIIIlIIIIlIl);
        return (ilIlIIIllIllIIIIIllI == null) ? net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll : ilIlIIIllIllIIIIIllI;
    }
    
    public byte[] llIllIlIIIIllIlIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final byte[] array) {
        if (this.IlIlIIIllIllIIIIIllI.length != array.length) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.warn("Could not set level chunk biomes, array length is " + array.length + " instead of " + this.IlIlIIIllIllIIIIIllI.length);
        }
        else {
            for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
                this.IlIlIIIllIllIIIIIllI[i] = array[i];
            }
        }
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        this.IlIlIIIlIIlIlIIlllIl = 0;
    }
    
    public void IlIlIIIllIIllIlllllI() {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll << 4, 0, this.IlIlIlIlIlllllllllIl << 4);
        for (int i = 0; i < 8; ++i) {
            if (this.IlIlIIIlIIlIlIIlllIl >= 4096) {
                return;
            }
            final int n = this.IlIlIIIlIIlIlIIlllIl % 16;
            final int n2 = this.IlIlIIIlIIlIlIIlllIl / 16 % 16;
            final int n3 = this.IlIlIIIlIIlIlIIlllIl / 256;
            ++this.IlIlIIIlIIlIlIIlllIl;
            for (int j = 0; j < 16; ++j) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2, (n << 4) + j, n3);
                final boolean b = j == 0 || j == 15 || n2 == 0 || n2 == 15 || n3 == 0 || n3 == 15;
                if ((this.IlIIIlIlIIIllIlIlIIl[n] == null && b) || (this.IlIIIlIlIIIllIlIlIIl[n] != null && this.IlIIIlIlIIIllIlIlIIl[n].IlIlIlIlIlllllllllIl(n2, j, n3).IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)) {
                    lllIllIIIllllllIllll[] values;
                    for (int length = (values = lllIllIIIllllllIllll.values()).length, k = 0; k < length; ++k) {
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(values[k]);
                        if (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().IlIIIlIlIIIllIlIlIIl() > 0) {
                            this.lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII(llllIIIIlIIIlIlllIll2);
                        }
                    }
                    this.lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII(llllIIIIlIIIlIlllIll);
                }
            }
        }
    }
    
    public void IIIIlllIIIIIIlIIIlll() {
        this.IIIIlllIIIIIIlIIIlll = true;
        this.llllIIllllIlIlIIIIll = true;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll << 4, 0, this.IlIlIlIlIlllllllllIl << 4);
        if (!this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
            if (this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-1, 0, -1), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(16, this.lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl(), 16))) {
            Label_0121:
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        if (!this.IlIlIIIllIllIIIIIllI(i, j)) {
                            this.llllIIllllIlIlIIIIll = false;
                            break Label_0121;
                        }
                    }
                }
                if (this.llllIIllllIlIlIIIIll) {
                    for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                        this.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, (lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl() == IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll) ? 16 : 1)).llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI());
                    }
                    this.IIlIIIIlllIlllllIlII();
                }
            }
            else {
                this.llllIIllllIlIlIIIIll = false;
            }
        }
    }
    
    private void IIlIIIIlllIlllllIlII() {
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            this.llllIIIlIlllIlIIIIIl[i] = true;
        }
        this.lIIIIlIIIIIlllIllIII(false);
    }
    
    private void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (this.IIIIlllIIIIIIlIIIlll) {
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                for (int i = 0; i < 16; ++i) {
                    this.IlIlIIIllIllIIIIIllI(15, i);
                }
            }
            else if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                for (int j = 0; j < 16; ++j) {
                    this.IlIlIIIllIllIIIIIllI(0, j);
                }
            }
            else if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                for (int k = 0; k < 16; ++k) {
                    this.IlIlIIIllIllIIIIIllI(k, 15);
                }
            }
            else if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                for (int l = 0; l < 16; ++l) {
                    this.IlIlIIIllIllIIIIIllI(l, 0);
                }
            }
        }
    }
    
    private boolean IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
        int n3 = 0;
        boolean b = false;
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl((this.llllIIIIlIIIlIlllIll << 4) + n, 0, (this.IlIlIlIlIlllllllllIl << 4) + n2);
        for (int n4 = llllIIIIlIIIlIlllIll + 16 - 1; n4 > this.lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl() || (n4 > 0 && !b); --n4) {
            llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII(), n4, llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl());
            final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
            if (ilIlIlIlIlllllllllIl == 255 && llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII() < this.lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl()) {
                b = true;
            }
            if (n3 == 0 && ilIlIlIlIlllllllllIl > 0) {
                n3 = 1;
            }
            else if (n3 != 0 && ilIlIlIlIlllllllllIl == 0 && !this.lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII(llllIIIlIlllIlIIIIIl)) {
                return false;
            }
        }
        for (int i = llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII(); i > 0; --i) {
            llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII(), i, llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl());
            if (this.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl).IlIIIlIlIIIllIlIlIIl() > 0) {
                this.lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII(llllIIIlIlllIlIIIIIl);
            }
        }
        return true;
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public IlllllllIIIlIIIlIlII IlIllIlIlIIIlIlIlIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int[] IIlllIIlIllIllIlIIll() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int[] array) {
        if (this.llIIlIIIlIIIllIlIIIl.length != array.length) {
            net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.warn("Could not set level chunk heightmap, array length is " + array.length + " instead of " + this.llIIlIIIlIIIllIlIIIl.length);
        }
        else {
            for (int i = 0; i < this.llIIlIIIlIIIllIlIIIl.length; ++i) {
                this.llIIlIIIlIIIllIlIIIl[i] = array[i];
            }
        }
    }
    
    public Map lllIIIIlllllIlIIllIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public IIIlIIlIIIIlllIlllII[] IlIlIIIIIIlllIlIllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public boolean IIllIIllIIIlIlIIIIlI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final boolean iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public boolean IIIlIIIlIlIIlllIIlll() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public void IlIlIIIllIllIIIIIllI(final boolean llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public void IllIIlllIIIIlllIIlIl(final boolean iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public void llllIIIlIlllIlIIIIIl(final boolean lllIIIIlllllIlIIllIl) {
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final long ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
    }
    
    public int IlIlIIIlIIlIlIIlllIl() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public long IlllllllIIIlIIIlIlII() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    public void llIllIIIIIllIlIIIIlI(final long iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
}
