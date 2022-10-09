package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class bh extends llllIIIIlIIIlIlllIll
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    public static final IlIIIlIlIIIllIlIlIIl IIllllIIIlIIIIIIllIl;
    public static final IlIIIlIlIIIllIlIlIIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIIIlIlIIIllIlIlIIl lllIllIIIllllllIllll;
    public static final IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII;
    private boolean IIlIlIlIIlIllIIIIIIl;
    private final Set IllIllIIIIlIIlIlllII;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("north", bi.class);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("east", bi.class);
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("south", bi.class);
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("west", bi.class);
        llIllIlIlIIIIIIIllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("power", 0, 15);
    }
    
    public bh() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
        this.IIlIlIlIIlIllIIIIIIl = true;
        this.IllIllIIIIlIIlIlllII = Sets.newHashSet();
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(bh.IIIIIIIIIlllIllIlIlI, bi.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(bh.IIllllIIIlIIIIIIllIl, bi.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(bh.IlllIIIIlIIIlIlIlIIl, bi.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(bh.lllIllIIIllllllIllll, bi.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII, 0));
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.lllIllIIIllllllIllll, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI));
        llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.IIllllIIIlIIIIIIllIl, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl));
        llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.IIIIIIIIIlllIllIlIlI, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI));
        llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.IlllIIIIlIIIlIlIlIIl, this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl));
        return llIIlIIIlIIIllIlIIIl;
    }
    
    private bi llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI();
        if (!llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll), lllIllIIIllllllIllll) && (llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl() || !lIIIlllIIIllIIIllIII(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl())))) {
            return (!lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().llllIIIlIlllIlIIIIIl() && llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl() && lIIIlllIIIllIIIllIII(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()))) ? bi.llllIIIIlIIIlIlllIll : bi.llIllIIIIIllIlIIIIlI;
        }
        return bi.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != this) ? super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, n) : this.IlIlIIIllIllIIIIIllI((int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII));
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) || illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.b;
    }
    
    private llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.IllIllIIIIlIIlIlllII);
        this.IllIllIIIIlIIlIlllII.clear();
        final Iterator<net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(iterator.next(), this);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll;
        final int intValue = (int)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII);
        int ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, 0);
        this.IIlIlIlIIlIllIIIIIIl = false;
        final int ilIlIllllllllIIIIlII = illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII(ilIlIlIlIlllllllllIl);
        this.IIlIlIlIIlIllIIIIIIl = true;
        if (ilIlIllllllllIIIIlII > 0 && ilIlIllllllllIIIIlII > ilIlIlIlIlllllllllIl3 - 1) {
            ilIlIlIlIlllllllllIl3 = ilIlIllllllllIIIIlII;
        }
        int n = 0;
        final Iterator iterator = net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next());
            final boolean b = llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() != ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() || llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() != ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl();
            if (b) {
                n = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, n);
            }
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII() && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                if (!b || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()) {
                    continue;
                }
                n = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), n);
            }
            else {
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII() || !b || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()) {
                    continue;
                }
                n = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(), n);
            }
        }
        if (n > ilIlIlIlIlllllllllIl3) {
            ilIlIlIlIlllllllllIl3 = n - 1;
        }
        else if (ilIlIlIlIlllllllllIl3 > 0) {
            --ilIlIlIlIlllllllllIl3;
        }
        else {
            ilIlIlIlIlllllllllIl3 = 0;
        }
        if (ilIlIllllllllIIIIlII > ilIlIlIlIlllllllllIl3 - 1) {
            ilIlIlIlIlllllllllIl3 = ilIlIllllllllIIIIlII;
        }
        if (intValue != ilIlIlIlIlllllllllIl3) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII, ilIlIlIlIlllllllllIl3);
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl) == llIIlIIIlIIIllIlIIIl) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 2);
            }
            this.IllIllIIIIlIIlIlllII.add(ilIlIlIlIlllllllllIl);
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                this.IllIllIIIIlIIlIlllII.add(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]));
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == this) {
            illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, this);
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]), this);
            }
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
            final Iterator iterator = net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl.iterator();
            while (iterator.hasNext()) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next()), this);
            }
            final Iterator iterator2 = net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
            while (iterator2.hasNext()) {
                this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator2.next()));
            }
            final Iterator iterator3 = net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
            while (iterator3.hasNext()) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator3.next());
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                    this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
                }
                else {
                    this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
                }
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]), this);
            }
            this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
            final Iterator iterator = net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
            while (iterator.hasNext()) {
                this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next()));
            }
            final Iterator iterator2 = net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
            while (iterator2.hasNext()) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator2.next());
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                    this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
                }
                else {
                    this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
                }
            }
        }
    }
    
    private int IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != this) {
            return n;
        }
        final int intValue = (int)illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII);
        return (intValue > n) ? intValue : n;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
                this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
            }
            else {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.IIlIlIlIIlIllIIIIIIl ? this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, lllIllIIIllllllIllll) : 0;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (!this.IIlIlIlIIlIllIIIIIIl) {
            return 0;
        }
        final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII);
        if (intValue == 0) {
            return 0;
        }
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            return intValue;
        }
        final EnumSet<lllIllIIIllllllIllll> none = EnumSet.noneOf(lllIllIIIllllllIllll.class);
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll2 : net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            if (this.IlIIIlIlIIIllIlIlIIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll2)) {
                none.add(lllIllIIIllllllIllll2);
            }
        }
        if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI().IlIIIlIlIIIllIlIlIIl() && none.isEmpty()) {
            return intValue;
        }
        if (none.contains(lllIllIIIllllllIllll) && !none.contains(lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl()) && !none.contains(lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl())) {
            return intValue;
        }
        return 0;
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        final boolean liiiIlIIIIIlllIllIII = llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII();
        return (!lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII() && liiiIlIIIIIlllIllIII && IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll())) || llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll) || (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.g && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(bb.IlllIIIIlIIIlIlIlIIl) == lllIllIIIllllllIllll) || (!liiiIlIIIIIlllIllIII && IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()));
    }
    
    protected static boolean IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return lIIIlllIIIllIIIllIII(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
    }
    
    protected static boolean lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, null);
    }
    
    protected static boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl) {
            return true;
        }
        if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.f.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI)) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl);
            return lllIllIIIllllllIllll2 == lllIllIIIllllllIllll || lllIllIIIllllllIllll2.IlIlIIIllIllIIIIIllI() == lllIllIIIllllllIllll;
        }
        return llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII() && lllIllIIIllllllIllll != null;
    }
    
    @Override
    public boolean IIIlIIlIIIIlllIlllII() {
        return this.IIlIlIlIIlIllIIIIIIl;
    }
    
    private int IlIlIIIllIllIIIIIllI(final int n) {
        final float n2 = n / 15.0f;
        float n3 = n2 * 0.6f + 0.4f;
        if (n == 0) {
            n3 = 0.3f;
        }
        float n4 = n2 * n2 * 0.7f - 0.5f;
        float n5 = n2 * n2 * 0.6f - 0.7f;
        if (n4 < 0.0f) {
            n4 = 0.0f;
        }
        if (n5 < 0.0f) {
            n5 = 0.0f;
        }
        return 0xFF000000 | llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n3 * 255.0f), 0, 255) << 16 | llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n4 * 255.0f), 0, 255) << 8 | llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n5 * 255.0f), 0, 255);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII);
        if (intValue != 0) {
            final double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 + (random.nextFloat() - 0.5) * 0.2;
            final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.0625f;
            final double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 + (random.nextFloat() - 0.5) * 0.2;
            final float n4 = intValue / 15.0f;
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIIlllIIlllIIllIllI, n, n2, n3, n4 * 0.6f + 0.4f, Math.max(0.0f, n4 * n4 * 0.7f - 0.5f), Math.max(0.0f, n4 * n4 * 0.6f - 0.7f), new int[0]);
        }
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII;
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { bh.IIIIIIIIIlllIllIlIlI, bh.IIllllIIIlIIIIIIllIl, bh.IlllIIIIlIIIlIlIlIIl, bh.lllIllIIIllllllIllll, bh.llIllIlIlIIIIIIIllII });
    }
}
