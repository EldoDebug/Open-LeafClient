package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final IIIllllllIllIIIlllIl IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private final lIIllIIIllllIlllIllI IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    private final List IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private long lIIIIlIIIIIlllIllIII;
    private final int[][] lIIIlllIIIllIIIllIII;
    private final Map llIIlIIIlIIIllIlIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IllIIlllIIIIlllIIlIl(final IIIllllllIllIIIlllIl ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = new lIIllIIIllllIlllIllI();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.lIIIlllIIIllIIIllIII = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        this.llIIlIIIlIIIllIlIIIl = new HashMap();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIIIIIlIllIIlIIIll().IIlllIIlllIIIlIlllII().IlIlIIIIIIlllIlIllIl());
    }
    
    public IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        final Iterator<Map.Entry<K, Set>> iterator = this.llIIlIIIlIIIllIlIIIl.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, Set> entry = iterator.next();
            final Set set = entry.getValue();
            if (!set.isEmpty()) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)entry.getKey();
                if (ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII != this.IlIlIlIlIlllllllllIl) {
                    iterator.remove();
                }
                else {
                    int n = this.llllIIIlIlllIlIIIIIl / 3 + 1;
                    if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.i()) {
                        n = this.llllIIIlIlllIlIIIIIl * 2 + 1;
                    }
                    for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.llllIIIIlIIIlIlllIll(set, ilIIIlIlIIIllIlIlIIl, n)) {
                        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, true).llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                        set.remove(ilIlIlIlIlllllllllIl);
                    }
                }
            }
        }
        final long iiIlIIlIIIIlllIlllII = this.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII();
        if (iiIlIIlIIIIlllIlllII - this.lIIIIlIIIIIlllIllIII > 8000L) {
            this.lIIIIlIIIIIlllIllIII = iiIlIIlIIIIlllIlllII;
            for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.size(); ++i) {
                final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl.get(i);
                llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
            }
        }
        else {
            for (int j = 0; j < this.IlIlIIIllIllIIIIIllI.size(); ++j) {
                ((llllIIIlIlllIlIIIIIl)this.IlIlIIIllIllIIIIIllI.get(j)).IlIlIlIlIlllllllllIl();
            }
        }
        this.IlIlIIIllIllIIIIIllI.clear();
        if (this.llIllIIIIIllIlIIIIlI.isEmpty() && !this.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI()) {
            this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl();
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n + 2147483647L | n2 + 2147483647L << 32) != null;
    }
    
    private llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b) {
        final long n3 = n + 2147483647L | n2 + 2147483647L << 32;
        llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = (llllIIIlIlllIlIIIIIl)this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n3);
        if (llllIIIlIlllIlIIIIIl == null && b) {
            llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(this, n, n2);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n3, llllIIIlIlllIlIIIIIl);
            this.IllIIlllIIIIlllIIlIl.add(llllIIIlIlllIlIIIIIl);
        }
        return llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4, false);
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final int n = (int)ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl >> 4;
        final int n2 = (int)ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII >> 4;
        ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl;
        ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI = ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII;
        final int min = Math.min(this.llllIIIlIlllIlIIIIIl, 8);
        final int n3 = n - min;
        final int n4 = n + min;
        final int n5 = n2 - min;
        final int n6 = n2 + min;
        final Set ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIIIlIlIIIllIlIlIIl);
        for (int i = n - this.llllIIIlIlllIlIIIIIl; i <= n + this.llllIIIlIlllIlIIIIIl; ++i) {
            for (int j = n2 - this.llllIIIlIlllIlIIIIIl; j <= n2 + this.llllIIIlIlllIlIIIIIl; ++j) {
                if (i >= n3 && i <= n4 && j >= n5 && j <= n6) {
                    this.llllIIIIlIIIlIlllIll(i, j, true).llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                }
                else {
                    ilIlIIIllIllIIIIIllI.add(new IlIlIlIlIlllllllllIl(i, j));
                }
            }
        }
        this.llIllIIIIIllIlIIIIlI.add(ilIIIlIlIIIllIlIlIIl);
        this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final ArrayList arrayList = Lists.newArrayList((Iterable)ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl);
        int n = 0;
        final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
        final int n2 = (int)ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl >> 4;
        final int n3 = (int)ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII >> 4;
        int n4 = 0;
        int n5 = 0;
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n2, n3, true).llIllIIIIIllIlIIIIlI;
        ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.clear();
        if (arrayList.contains(llllIIIIlIIIlIlllIll)) {
            ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.add(llllIIIIlIIIlIlllIll);
        }
        for (int i = 1; i <= llllIIIlIlllIlIIIIIl * 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                final int[] array = this.lIIIlllIIIllIIIllIII[n++ % 4];
                for (int k = 0; k < i; ++k) {
                    n4 += array[0];
                    n5 += array[1];
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n2 + n4, n3 + n5, true).llIllIIIIIllIlIIIIlI;
                    if (arrayList.contains(llllIIIIlIIIlIlllIll2)) {
                        ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.add(llllIIIIlIIIlIlllIll2);
                    }
                }
            }
        }
        final int n6 = n % 4;
        for (int l = 0; l < llllIIIlIlllIlIIIIIl * 2; ++l) {
            n4 += this.lIIIlllIIIllIIIllIII[n6][0];
            n5 += this.lIIIlllIIIllIIIllIII[n6][1];
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(n2 + n4, n3 + n5, true).llIllIIIIIllIlIIIIlI;
            if (arrayList.contains(llllIIIIlIIIlIlllIll3)) {
                ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.add(llllIIIIlIIIlIlllIll3);
            }
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llIIlIIIlIIIllIlIIIl.remove(ilIIIlIlIIIllIlIlIIl);
        final int n = (int)ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl >> 4;
        final int n2 = (int)ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI >> 4;
        for (int i = n - this.llllIIIlIlllIlIIIIIl; i <= n + this.llllIIIlIlllIlIIIIIl; ++i) {
            for (int j = n2 - this.llllIIIlIlllIlIIIIIl; j <= n2 + this.llllIIIlIlllIlIIIIIl; ++j) {
                final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(i, j, false);
                if (llllIIIIlIIIlIlllIll != null) {
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                }
            }
        }
        this.llIllIIIIIllIlIIIIlI.remove(ilIIIlIlIIIllIlIlIIl);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = n - n3;
        final int n7 = n2 - n4;
        return n6 >= -n5 && n6 <= n5 && (n7 >= -n5 && n7 <= n5);
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final int n = (int)ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl >> 4;
        final int n2 = (int)ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII >> 4;
        final double n3 = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl - ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl;
        final double n4 = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI - ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII;
        if (n3 * n3 + n4 * n4 >= 64.0) {
            final int n5 = (int)ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl >> 4;
            final int n6 = (int)ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI >> 4;
            final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            final int n7 = n - n5;
            final int n8 = n2 - n6;
            if (n7 != 0 || n8 != 0) {
                final Set ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIIIlIlIIIllIlIlIIl);
                for (int i = n - llllIIIlIlllIlIIIIIl; i <= n + llllIIIlIlllIlIIIIIl; ++i) {
                    for (int j = n2 - llllIIIlIlllIlIIIIIl; j <= n2 + llllIIIlIlllIlIIIIIl; ++j) {
                        if (!this.llllIIIIlIIIlIlllIll(i, j, n5, n6, llllIIIlIlllIlIIIIIl)) {
                            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.i()) {
                                ilIlIIIllIllIIIIIllI.add(new IlIlIlIlIlllllllllIl(i, j));
                            }
                            else {
                                this.llllIIIIlIIIlIlllIll(i, j, true).llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                            }
                        }
                        if (!this.llllIIIIlIIIlIlllIll(i - n7, j - n8, n, n2, llllIIIlIlllIlIIIIIl)) {
                            ilIlIIIllIllIIIIIllI.remove(new IlIlIlIlIlllllllllIl(i - n7, j - n8));
                            final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(i - n7, j - n8, false);
                            if (llllIIIIlIIIlIlllIll != null) {
                                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                            }
                        }
                    }
                }
                this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl;
                ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI = ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII;
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final int n2) {
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n, n2, false);
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.contains(ilIIIlIlIIIllIlIlIIl) && !ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.contains(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(int llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 3, 64);
        if (llllIIIIlIIIlIlllIll != this.llllIIIlIlllIlIIIIIl) {
            final int n = llllIIIIlIIIlIlllIll - this.llllIIIlIlllIlIIIIIl;
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : Lists.newArrayList((Iterable)this.llIllIIIIIllIlIIIIlI)) {
                final int n2 = (int)ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl >> 4;
                final int n3 = (int)ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII >> 4;
                final Set ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIIIlIlIIIllIlIlIIl);
                if (n > 0) {
                    for (int i = n2 - llllIIIIlIIIlIlllIll; i <= n2 + llllIIIIlIIIlIlllIll; ++i) {
                        for (int j = n3 - llllIIIIlIIIlIlllIll; j <= n3 + llllIIIIlIIIlIlllIll; ++j) {
                            if (llllIIIIlIIIlIlllIll.i()) {
                                ilIlIIIllIllIIIIIllI.add(new IlIlIlIlIlllllllllIl(i, j));
                            }
                            else {
                                final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(i, j, true);
                                if (!llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl.contains(ilIIIlIlIIIllIlIlIIl)) {
                                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                                }
                            }
                        }
                    }
                }
                else {
                    for (int k = n2 - this.llllIIIlIlllIlIIIIIl; k <= n2 + this.llllIIIlIlllIlIIIIIl; ++k) {
                        for (int l = n3 - this.llllIIIlIlllIlIIIIIl; l <= n3 + this.llllIIIlIlllIlIIIIIl; ++l) {
                            if (!this.llllIIIIlIIIlIlllIll(k, l, n2, n3, llllIIIIlIIIlIlllIll)) {
                                ilIlIIIllIllIIIIIllI.remove(new IlIlIlIlIlllllllllIl(k, l));
                                final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(k, l, true);
                                if (llllIIIIlIIIlIlllIll3 != null) {
                                    llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                                }
                            }
                        }
                    }
                }
            }
            this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll;
        }
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n) {
        return n * 16 - 16;
    }
    
    private PriorityQueue llllIIIIlIIIlIlllIll(final Set set, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        float n2;
        for (n2 = ilIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll + 90.0f; n2 <= -180.0f; n2 += 360.0f) {}
        while (n2 > 180.0f) {
            n2 -= 360.0f;
        }
        final net.optifine.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.optifine.llllIIIlIlllIlIIIIIl(ilIIIlIlIIIllIlIlIIl.lllllIIlIlIIIlIlIIIl, ilIIIlIlIIIllIlIlIIl.llllIllllIllllIlIlII, n2 * 0.017453292519943295, ilIIIlIlIIIllIlIlIIl.llllllIllIllIlIllllI * 0.017453292519943295);
        final PriorityQueue priorityQueue = new PriorityQueue<IlIlIlIlIlllllllllIl>(n, Collections.reverseOrder((Comparator<Object>)llllIIIlIlllIlIIIIIl));
        for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : set) {
            if (priorityQueue.size() < n) {
                priorityQueue.add(ilIlIlIlIlllllllllIl);
            }
            else {
                if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, priorityQueue.peek()) >= 0) {
                    continue;
                }
                priorityQueue.remove();
                priorityQueue.add(ilIlIlIlIlllllllllIl);
            }
        }
        return priorityQueue;
    }
    
    private Set IlIlIIIllIllIIIIIllI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final Set set = this.llIIlIIIlIIIllIlIIIl.get(ilIIIlIlIIIllIlIlIIl);
        if (set != null) {
            return set;
        }
        final int min = Math.min(this.llllIIIlIlllIlIIIIIl, 8);
        final int n = this.llllIIIlIlllIlIIIIIl * 2 + 1;
        final int n2 = min * 2 + 1;
        final HashSet set2 = new HashSet(Math.max(n * n - n2 * n2, 16));
        this.llIIlIIIlIIIllIlIIIl.put(ilIIIlIlIIIllIlIlIIl, set2);
        return set2;
    }
}
