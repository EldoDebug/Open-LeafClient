package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lIlIlIIIllIIllIIIllI extends IIIIlllIIIIIIlIIIlll
{
    private List IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private IlIlIlIlIlllllllllIl[] llllIIIlIlllIlIIIIIl;
    private double lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    public lIlIlIIIllIIllIIIllI() {
        this.llllIIIlIlllIlIIIIIl = new IlIlIlIlIlllllllllIl[3];
        this.lIIIIlIIIIIlllIllIII = 32.0;
        this.lIIIlllIIIllIIIllIII = 3;
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        llIIlIIIlIIIllIlIIIl[] iiiIlllIIIIIIlIIIlll;
        for (int length = (iiiIlllIIIIIIlIIIlll = llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll()).length, i = 0; i < length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll[i];
            if (llIIlIIIlIIIllIlIIIl != null && llIIlIIIlIIIllIlIIIl.IIlllllIllIllIlIlIII > 0.0f) {
                this.IlIlIIIllIllIIIIIllI.add(llIIlIIIlIIIllIlIIIl);
            }
        }
    }
    
    public lIlIlIIIllIIllIIIllI(final Map map) {
        this();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (entry.getKey().equals("distance")) {
                this.lIIIIlIIIIIlllIllIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.lIIIIlIIIIIlllIllIII, 1.0);
            }
            else if (entry.getKey().equals("count")) {
                this.llllIIIlIlllIlIIIIIl = new IlIlIlIlIlllllllllIl[llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.llllIIIlIlllIlIIIIIl.length, 1)];
            }
            else {
                if (!entry.getKey().equals("spread")) {
                    continue;
                }
                this.lIIIlllIIIllIIIllIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.lIIIlllIIIllIIIllIII, 1);
            }
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Stronghold";
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (!this.IllIIlllIIIIlllIIlIl) {
            final Random random = new Random();
            random.setSeed(this.llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII());
            double n3 = random.nextDouble() * 3.141592653589793 * 2.0;
            int n4 = 1;
            for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
                final double n5 = (1.25 * n4 + random.nextDouble()) * this.lIIIIlIIIIIlllIllIII * n4;
                int n6 = (int)Math.round(Math.cos(n3) * n5);
                int n7 = (int)Math.round(Math.sin(n3) * n5);
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll((n6 << 4) + 8, (n7 << 4) + 8, 112, this.IlIlIIIllIllIIIIIllI, random);
                if (llllIIIIlIIIlIlllIll != null) {
                    n6 = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() >> 4;
                    n7 = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() >> 4;
                }
                this.llllIIIlIlllIlIIIIIl[i] = new IlIlIlIlIlllllllllIl(n6, n7);
                n3 += 6.283185307179586 * n4 / this.lIIIlllIIIllIIIllIII;
                if (i == this.lIIIlllIIIllIIIllIII) {
                    n4 += 2 + random.nextInt(5);
                    this.lIIIlllIIIllIIIllIII += 1 + random.nextInt(2);
                }
            }
            this.IllIIlllIIIIlllIIlIl = true;
        }
        IlIlIlIlIlllllllllIl[] llllIIIlIlllIlIIIIIl;
        for (int length = (llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl).length, j = 0; j < length; ++j) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = llllIIIlIlllIlIIIIIl[j];
            if (n == ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && n2 == ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected List x_() {
        final ArrayList arrayList = Lists.newArrayList();
        IlIlIlIlIlllllllllIl[] llllIIIlIlllIlIIIIIl;
        for (int length = (llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl).length, i = 0; i < length; ++i) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = llllIIIlIlllIlIIIIIl[i];
            if (ilIlIlIlIlllllllllIl != null) {
                arrayList.add(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(64));
            }
        }
        return arrayList;
    }
    
    @Override
    protected IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl(final int n, final int n2) {
        net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI;
        for (ilIlIIIllIIllIlllllI = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl, n, n2); ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI().isEmpty() || ((llllllIIIIIIIlllIIll)ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI().get(0)).IlIlIlIlIlllllllllIl == null; ilIlIIIllIIllIlllllI = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl, n, n2)) {}
        return ilIlIIIllIIllIlllllI;
    }
}
