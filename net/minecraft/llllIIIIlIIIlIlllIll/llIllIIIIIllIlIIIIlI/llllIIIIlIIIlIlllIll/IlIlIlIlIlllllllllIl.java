package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import com.google.common.cache.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl
{
    private final Predicate[][][] llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIlIlIlllllllllIl(final Predicate[][][] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.length;
        if (this.IlIlIlIlIlllllllllIl > 0) {
            this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll[0].length;
            if (this.llIllIIIIIllIlIIIIlI > 0) {
                this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll[0][0].length;
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl = 0;
            }
        }
        else {
            this.llIllIIIIIllIlIIIIlI = 0;
            this.IlIIIlIlIIIllIlIlIIl = 0;
        }
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    private IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIllIIIllllllIllll lllIllIIIllllllIllll2, final LoadingCache loadingCache) {
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl; ++i) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
                for (int k = 0; k < this.IlIlIlIlIlllllllllIl; ++k) {
                    if (!this.llllIIIIlIIIlIlllIll[k][j][i].apply((Object)loadingCache.getUnchecked((Object)llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, lllIllIIIllllllIllll2, i, j, k)))) {
                        return null;
                    }
                }
            }
        }
        return new IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, lllIllIIIllllllIllll2, loadingCache, this.IlIIIlIlIIIllIlIlIIl, this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl);
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final LoadingCache llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, false);
        final int max = Math.max(Math.max(this.IlIIIlIlIIIllIlIlIIl, this.llIllIIIIIllIlIIIIlI), this.IlIlIlIlIlllllllllIl);
        for (final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 : net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(max - 1, max - 1, max - 1))) {
            lllIllIIIllllllIllll[] values;
            for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
                lllIllIIIllllllIllll[] values2;
                for (int length2 = (values2 = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, j = 0; j < length2; ++j) {
                    final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = values2[j];
                    if (lllIllIIIllllllIllll2 != lllIllIIIllllllIllll && lllIllIIIllllllIllll2 != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI()) {
                        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll, lllIllIIIllllllIllll2, llllIIIIlIIIlIlllIll);
                        if (llllIIIIlIIIlIlllIll2 != null) {
                            return llllIIIIlIIIlIlllIll2;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static LoadingCache llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final boolean b) {
        return CacheBuilder.newBuilder().build((CacheLoader)new llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, b));
    }
    
    protected static net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIllIIIllllllIllll lllIllIIIllllllIllll2, final int n, final int n2, final int n3) {
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll2 && lllIllIIIllllllIllll != lllIllIIIllllllIllll2.IlIlIIIllIllIIIIIllI()) {
            final f f = new f(lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII(), lllIllIIIllllllIllll.lIIIlllIIIllIIIllIII(), lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl());
            final f f2 = new f(lllIllIIIllllllIllll2.lIIIIlIIIIIlllIllIII(), lllIllIIIllllllIllll2.lIIIlllIIIllIIIllIII(), lllIllIIIllllllIllll2.llIIlIIIlIIIllIlIIIl());
            final f ilIIIlIlIIIllIlIlIIl = f.IlIIIlIlIIIllIlIlIIl(f2);
            return ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(f2.lIIIIlIIIIIlllIllIII() * -n2 + ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII() * n + f.lIIIIlIIIIIlllIllIII() * n3, f2.lIIIlllIIIllIIIllIII() * -n2 + ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() * n + f.lIIIlllIIIllIIIllIII() * n3, f2.llIIlIIIlIIIllIlIIIl() * -n2 + ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl() * n + f.llIIlIIIlIIIllIlIIIl() * n3);
        }
        throw new IllegalArgumentException("Invalid forwards & up combination");
    }
}
