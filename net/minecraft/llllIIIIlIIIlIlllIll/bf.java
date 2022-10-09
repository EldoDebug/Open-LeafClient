package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class bf extends de
{
    private static Map IIllllIIIlIIIIIIllIl;
    private final boolean IlllIIIIlIIIlIlIlIIl;
    
    static {
        bf.IIllllIIIlIIIIIIllIl = Maps.newHashMap();
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        if (!bf.IIllllIIIlIIIIIIllIl.containsKey(illlllllIIIlIIIlIlII)) {
            bf.IIllllIIIlIIIIIIllIl.put(illlllllIIIlIIIlIlII, Lists.newArrayList());
        }
        final List<bg> list = bf.IIllllIIIlIIIIIIllIl.get(illlllllIIIlIIIlIlII);
        if (b) {
            list.add(new bg(ilIlIlIlIlllllllllIl, illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII()));
        }
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).llllIIIIlIIIlIlllIll.equals(ilIlIlIlIlllllllllIl) && ++n >= 8) {
                return true;
            }
        }
        return false;
    }
    
    protected bf(final boolean illlIIIIlIIIlIlIlIIl) {
        this.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl;
        this.llllIIIIlIIIlIlllIll(true);
        this.llllIIIIlIIIlIlllIll((net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll)null);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return 2;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.IlllIIIIlIIIlIlIlIIl) {
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]), this);
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.IlllIIIIlIIIlIlIlIIl) {
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]), this);
            }
        }
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (this.IlllIIIIlIIIlIlIlIIl && llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bf.IIIIIIIIIlllIllIlIlI) != lllIllIIIllllllIllll) ? 15 : 0;
    }
    
    private boolean llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bf.IIIIIIIIIlllIllIlIlI)).IlIlIIIllIllIIIIIllI();
        return illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI), ilIlIIIllIllIIIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        final boolean llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        final List<bg> list = bf.IIllllIIIlIIIIIIllIl.get(illlllllIIIlIIIlIlII);
        while (list != null && !list.isEmpty() && illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII() - list.get(0).IlIlIlIlIlllllllllIl > 60L) {
            list.remove(0);
        }
        if (this.IlllIIIIlIIIlIlIlIIl) {
            if (llllIIIlIlllIlIIIIIl) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlllIlllllIIllIIII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bf.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bf.IIIIIIIIIlllIllIlIlI)), 3);
                if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, true)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, "random.fizz", 0.5f, 2.6f + (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() - illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat()) * 0.8f);
                    for (int i = 0; i < 5; ++i) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextDouble() * 0.6 + 0.2, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextDouble() * 0.6 + 0.2, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextDouble() * 0.6 + 0.2, 0.0, 0.0, 0.0, new int[0]);
                    }
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI(), 160);
                }
            }
        }
        else if (!llllIIIlIlllIlIIIIIl && !this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, false)) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIlIlllIlllIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bf.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bf.IIIIIIIIIlllIllIlIlI)), 3);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl) && this.IlllIIIIlIIIlIlIlIIl == this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
        }
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) ? this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, lllIllIIIllllllIllll) : 0;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIlIlllIlllIlI);
    }
    
    @Override
    public boolean IIIlIIlIIIIlllIlllII() {
        return true;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (this.IlllIIIIlIIIlIlIlIIl) {
            double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.7 + (random.nextDouble() - 0.5) * 0.2;
            double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bf.IIIIIIIIIlllIllIlIlI);
            if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI().IlIIIlIlIIIllIlIlIIl()) {
                final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI();
                n += 0.27 * ilIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII();
                n2 += 0.22;
                n3 += 0.27 * ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl();
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIIlllIIlllIIllIllI, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIlIlllIlllIlI);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlllIlllllIIllIIII || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIlIlllIlllIlI;
    }
}
