package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import com.google.common.collect.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIllIIIIIllIlIIIIlI implements lIIIIlIIIIIlllIllIII
{
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private Random IlIlIlIlIlllllllllIl;
    private final llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI;
    private final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    private final boolean IllIIlllIIIIlllIIlIl;
    private final boolean llllIIIlIlllIlIIIIIl;
    private IlIlIIIlIIlIlIIlllIl lIIIIlIIIIIlllIllIII;
    private IlIlIIIlIIlIlIIlllIl lIIIlllIIIllIIIllIII;
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final long n, final boolean b, final String s) {
        this.llIllIIIIIllIlIIIIlI = new llIIlIIIlIIIllIlIIIl[256];
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = new Random(n);
        this.IlIIIlIlIIIllIlIlIIl = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s);
        if (b) {
            final Map ilIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl.containsKey("village")) {
                final Map<String, String> map = ilIlIlIlIlllllllllIl.get("village");
                if (!map.containsKey("size")) {
                    map.put("size", "1");
                }
                this.IlIlIIIllIllIIIIIllI.add(new IIllIIllIIIlIlIIIIlI(map));
            }
            if (ilIlIlIlIlllllllllIl.containsKey("biome_1")) {
                this.IlIlIIIllIllIIIIIllI.add(new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl.get("biome_1")));
            }
            if (ilIlIlIlIlllllllllIl.containsKey("mineshaft")) {
                this.IlIlIIIllIllIIIIIllI.add(new llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl.get("mineshaft")));
            }
            if (ilIlIlIlIlllllllllIl.containsKey("stronghold")) {
                this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(ilIlIlIlIlllllllllIl.get("stronghold")));
            }
            if (ilIlIlIlIlllllllllIl.containsKey("oceanmonument")) {
                this.IlIlIIIllIllIIIIIllI.add(new IllIlIIllIllIIlIllII(ilIlIlIlIlllllllllIl.get("oceanmonument")));
            }
        }
        if (this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl().containsKey("lake")) {
            this.lIIIIlIIIIIlllIllIII = new IlIlIIIlIIlIlIIlllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
        }
        if (this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl().containsKey("lava_lake")) {
            this.lIIIlllIIIllIIIllIII = new IlIlIIIlIIlIlIIlllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
        }
        this.llllIIIlIlllIlIIIIIl = this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl().containsKey("dungeon");
        int n2 = 0;
        int n3 = 0;
        boolean b2 = true;
        for (final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI : this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI()) {
            for (int i = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI(); i < llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI() + llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(); ++i) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl();
                if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                    b2 = false;
                    this.llIllIIIIIllIlIIIIlI[i] = ilIlIlIlIlllllllllIl2;
                }
            }
            if (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                n3 += llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
            }
            else {
                n2 += llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll() + n3;
                n3 = 0;
            }
        }
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n2);
        this.IllIIlllIIIIlllIIlIl = (!b2 && this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl().containsKey("decoration"));
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl();
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llIllIIIIIllIlIIIIlI[i];
            if (llIIlIIIlIIIllIlIIIl != null) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, i, k, llIIlIIIlIIIllIlIIIl);
                    }
                }
            }
        }
        final Iterator<IlIlIIIllIIllIlllllI> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this, this.llllIIIIlIIIlIlllIll, n, n2, illIIlllIIIIlllIIlIl);
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl, n, n2);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(null, n * 16, n2 * 16, 16, 16);
        final byte[] llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
        for (int l = 0; l < llIllIlIIIIllIlIIllI.length; ++l) {
            llIllIlIIIIllIlIIllI[l] = (byte)ilIlIlIlIlllllllllIl[l].lIIIIIlIlIIIlIIIIlIl;
        }
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n, final int n2) {
        final int n3 = n * 16;
        final int n4 = n2 * 16;
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n3, 0, n4);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(new IlIlIlIlIlllllllllIl(n3 + 16, 0, n4 + 16));
        int n5 = 0;
        this.IlIlIlIlIlllllllllIl.setSeed(this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII());
        this.IlIlIlIlIlllllllllIl.setSeed(n * (this.IlIlIlIlIlllllllllIl.nextLong() / 2L * 2L + 1L) + n2 * (this.IlIlIlIlIlllllllllIl.nextLong() / 2L * 2L + 1L) ^ this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII());
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(n, n2);
        for (final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll : this.IlIlIIIllIllIIIIIllI) {
            final boolean llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
            if (iiiIlllIIIIIIlIIIlll instanceof IIllIIllIIIlIlIIIIlI) {
                n5 |= (llllIIIIlIIIlIlllIll ? 1 : 0);
            }
        }
        if (this.lIIIIlIIIIIlllIllIII != null && n5 == 0 && this.IlIlIlIlIlllllllllIl.nextInt(4) == 0) {
            this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.nextInt(16) + 8, this.IlIlIlIlIlllllllllIl.nextInt(256), this.IlIlIlIlIlllllllllIl.nextInt(16) + 8));
        }
        if (this.lIIIlllIIIllIIIllIII != null && n5 == 0 && this.IlIlIlIlIlllllllllIl.nextInt(8) == 0) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.nextInt(16) + 8, this.IlIlIlIlIlllllllllIl.nextInt(this.IlIlIlIlIlllllllllIl.nextInt(248) + 8), this.IlIlIlIlIlllllllllIl.nextInt(16) + 8);
            if (llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() < this.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl() || this.IlIlIlIlIlllllllllIl.nextInt(10) == 0) {
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2);
            }
        }
        if (this.llllIIIlIlllIlIIIIIl) {
            for (int i = 0; i < 8; ++i) {
                new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.nextInt(16) + 8, this.IlIlIlIlIlllllllllIl.nextInt(256), this.IlIlIlIlIlllllllllIl.nextInt(16) + 8));
            }
        }
        if (this.IllIIlllIIIIlllIIlIl) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final boolean b, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return true;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "FlatLevelSource";
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl);
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final String s, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if ("Stronghold".equals(s)) {
            for (final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll : this.IlIlIIIllIllIIIIIllI) {
                if (iiiIlllIIIIIIlIIIlll instanceof lIlIlIIIllIIllIIIllI) {
                    return iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                }
            }
        }
        return null;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        final Iterator<IIIIlllIIIIIIlIIIlll> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this, this.llllIIIIlIIIlIlllIll, n, n2, null);
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
}
