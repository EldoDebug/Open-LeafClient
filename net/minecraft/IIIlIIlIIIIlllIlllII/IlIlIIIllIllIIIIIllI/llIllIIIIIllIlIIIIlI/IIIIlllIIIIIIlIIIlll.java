package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import java.util.concurrent.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public abstract class IIIIlllIIIIIIlIIIlll extends IlIlIIIllIIllIlllllI
{
    private lllIIIIlllllIlIIllIl IlIlIIIllIllIIIIIllI;
    protected Map IlIIIlIlIIIllIlIlIIl;
    
    public IIIIlllIIIIIIlIIIlll() {
        this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
    }
    
    public abstract String llllIIIIlIIIlIlllIll();
    
    @Override
    protected final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3, final int n4, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII);
        if (!this.IlIIIlIlIIIllIlIlIIl.containsKey(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2))) {
            this.IlIlIlIlIlllllllllIl.nextInt();
            try {
                if (this.llllIIIIlIIIlIlllIll(n, n2)) {
                    final IlIIIIIlIIllIIlIlIll ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n, n2);
                    this.IlIIIlIlIIIllIlIlIIl.put(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2), ilIlIlIlIlllllllllIl);
                    this.llllIIIIlIIIlIlllIll(n, n2, ilIlIlIlIlllllllllIl);
                }
            }
            catch (Throwable t) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Exception preparing structure feature");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Feature being prepared");
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Is feature chunk", new llllIIllllIlIlIIIIll(this, n, n2));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Chunk location", String.format("%d,%d", n, n2));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Chunk pos hash", new IlIllIlIlIIIlIlIlIII(this, n, n2));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Structure type", new IIlllIIlIllIllIlIIll(this));
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII);
        final int n = (ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll << 4) + 8;
        final int n2 = (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl << 4) + 8;
        boolean b = false;
        for (final IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll : this.IlIIIlIlIIIllIlIlIIl.values()) {
            if (ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll() && ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) && ilIIIIIlIIllIIlIlIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(n, n2, n + 15, n2 + 15)) {
                ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, new IlIlIIIlIIlIlIIlllIl(n, n2, n + 15, n2 + 15));
                ilIIIIIlIIllIIlIlIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
                b = true;
                this.llllIIIIlIIIlIlllIll(ilIIIIIlIIllIIlIlIll.IlIlIIIllIllIIIIIllI(), ilIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl(), ilIIIIIlIIllIIlIlIll);
            }
        }
        return b;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl) != null;
    }
    
    protected IlIIIIIlIIllIIlIlIll llIllIIIIIllIlIIIIlI(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (final IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll : this.IlIIIlIlIIIllIlIlIIl.values()) {
            if (ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll() && ilIIIIIlIIllIIlIlIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                final Iterator iterator2 = ilIIIIIlIIllIIlIlIll.llIllIIIIIllIlIIIIlI().iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next().llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                        return ilIIIIIlIIllIIlIlIll;
                    }
                }
            }
        }
        return null;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII);
        for (final IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll : this.IlIIIlIlIIIllIlIlIIl.values()) {
            if (ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll() && ilIIIIIlIIllIIlIlIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                return true;
            }
        }
        return false;
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII llIllIIIIIllIlIIIIlI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.setSeed(llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII());
        this.IlIlIlIlIlllllllllIl.setSeed((ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4) * this.IlIlIlIlIlllllllllIl.nextLong() ^ (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4) * this.IlIlIlIlIlllllllllIl.nextLong() ^ llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII());
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4, 0, 0, null);
        double n = Double.MAX_VALUE;
        net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = null;
        for (final IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll : this.IlIIIlIlIIIllIlIlIIl.values()) {
            if (ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll()) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = ilIIIIIlIIllIIlIlIll.llIllIIIIIllIlIIIIlI().get(0).IlIlIIIllIllIIIIIllI();
                final double illIIlllIIIIlllIIlIl = ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
                if (illIIlllIIIIlllIIlIl >= n) {
                    continue;
                }
                n = illIIlllIIIIlllIIlIl;
                ilIlIlIlIlllllllllIl2 = ilIlIIIllIllIIIIIllI;
            }
        }
        if (ilIlIlIlIlllllllllIl2 != null) {
            return ilIlIlIlIlllllllllIl2;
        }
        final List x_ = this.x_();
        if (x_ != null) {
            net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = null;
            for (final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 : x_) {
                final double illIIlllIIIIlllIIlIl2 = ilIlIlIlIlllllllllIl4.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
                if (illIIlllIIIIlllIIlIl2 < n) {
                    n = illIIlllIIIIlllIIlIl2;
                    ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl4;
                }
            }
            return ilIlIlIlIlllllllllIl3;
        }
        return null;
    }
    
    protected List x_() {
        return null;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.IlIlIIIllIllIIIIIllI = (lllIIIIlllllIlIIllIl)illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, this.llllIIIIlIIIlIlllIll());
            if (this.IlIlIIIllIllIIIIIllI == null) {
                this.IlIlIIIllIllIIIIIllI = new lllIIIIlllllIlIIllIl(this.llllIIIIlIIIlIlllIll());
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.IlIlIIIllIllIIIIIllI);
            }
            else {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
                final Iterator iterator = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI().iterator();
                while (iterator.hasNext()) {
                    final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iterator.next());
                    if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() == 10) {
                        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll2;
                        if (!iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("ChunkX") || !iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("ChunkZ")) {
                            continue;
                        }
                        final int illIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ChunkX");
                        final int illIIlllIIIIlllIIlIl2 = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ChunkZ");
                        final IlIIIIIlIIllIIlIlIll llllIIIIlIIIlIlllIll3 = IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, illlllllIIIlIIIlIlII);
                        if (llllIIIIlIIIlIlllIll3 == null) {
                            continue;
                        }
                        this.IlIIIlIlIIIllIlIlIIl.put(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, illIIlllIIIIlllIIlIl2), llllIIIIlIIIlIlllIll3);
                    }
                }
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll(n, n2), n, n2);
        this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    protected abstract boolean llllIIIIlIIIlIlllIll(final int p0, final int p1);
    
    protected abstract IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl(final int p0, final int p1);
}
