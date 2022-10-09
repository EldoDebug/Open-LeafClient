package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.cache.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class ab extends IlIlIIIlIIlIlIIlllIl
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("axis", llIllIlIlIIIIIIIllII.class, llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll, llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI);
    }
    
    public ab() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI, false);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI, llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll));
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        super.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
        if (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl() && illlllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobSpawning") && random.nextInt(2000) < illlllllIIIlIIIlIlII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll()) {
            final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
            net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2;
            for (ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl; !net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2) && ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() > 0; ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl()) {}
            if (liiIlllIIIllIIIllIII > 0 && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = IllIlIllIllIlllIIlll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 57, ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() + 1.1, ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() + 0.5);
                if (llllIIIIlIIIlIlllIll != null) {
                    llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI = llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII();
                }
            }
        }
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = (llIllIlIlIIIIIIIllII)lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI);
        float n = 0.125f;
        float n2 = 0.125f;
        if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) {
            n = 0.5f;
        }
        if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
            n2 = 0.5f;
        }
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n2, 0.5f + n, 1.0f, 0.5f + n2);
    }
    
    public static int llllIIIIlIIIlIlllIll(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        return (llIllIlIlIIIIIIIllII == llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) ? 1 : ((llIllIlIlIIIIIIIllII == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) ? 2 : 0);
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    public boolean lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final ac ac = new ac(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll);
        if (ac.IlIIIlIlIIIllIlIlIIl() && ac.IlIlIIIllIllIIIIIllI == 0) {
            ac.IlIlIIIllIllIIIIIllI();
            return true;
        }
        final ac ac2 = new ac(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI);
        if (ac2.IlIIIlIlIIIllIlIlIIl() && ac2.IlIlIIIllIllIIIIIllI == 0) {
            ac2.IlIlIIIllIllIIIIIllI();
            return true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = (llIllIlIlIIIIIIIllII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI);
        if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) {
            final ac ac = new ac(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll);
            if (!ac.IlIIIlIlIIIllIlIlIIl() || ac.IlIlIIIllIllIIIIIllI < ac.lIIIIlIIIIIlllIllIII * ac.llllIIIlIlllIlIIIIIl) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
            }
        }
        else if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
            final ac ac2 = new ac(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI);
            if (!ac2.IlIIIlIlIIIllIlIlIIl() || ac2.IlIlIIIllIllIIIIIllI < ac2.lIIIIlIIIIIlllIllIII * ac2.llllIIIlIlllIlIIIIIl) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = null;
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == this) {
            llIllIlIlIIIIIIIllII = (llIllIlIlIIIIIIIllII)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI);
            if (llIllIlIlIIIIIIIllII == null) {
                return false;
            }
            if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI && lllIllIIIllllllIllll != lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                return false;
            }
            if (llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll && lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && lllIllIIIllllllIllll != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                return false;
            }
        }
        final boolean b = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI() == this && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(2)).llIllIIIIIllIlIIIIlI() != this;
        final boolean b2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI() == this && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(2)).llIllIIIIIllIlIIIIlI() != this;
        final boolean b3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI() == this && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(2)).llIllIIIIIllIlIIIIlI() != this;
        final boolean b4 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI() == this && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(2)).llIllIIIIIllIlIIIIlI() != this;
        final boolean b5 = b || b2 || llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll;
        final boolean b6 = b3 || b4 || llIllIlIlIIIIIIIllII == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI;
        return (b5 && lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) || (b5 && lllIllIIIllllllIllll == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) || (b6 && lllIllIIIllllllIllll == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) || (b6 && lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return 0;
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll == null && llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI == null) {
            llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (random.nextInt(100) == 0) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, "portal.portal", 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i = 0; i < 4; ++i) {
            double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextFloat();
            final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextFloat();
            double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextFloat();
            double n4 = (random.nextFloat() - 0.5) * 0.5;
            final double n5 = (random.nextFloat() - 0.5) * 0.5;
            double n6 = (random.nextFloat() - 0.5) * 0.5;
            final int n7 = random.nextInt(2) * 2 - 1;
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI() != this && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI() != this) {
                n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 + 0.25 * n7;
                n4 = random.nextFloat() * 2.0f * n7;
            }
            else {
                n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 + 0.25 * n7;
                n6 = random.nextFloat() * 2.0f * n7;
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, n, n2, n3, n4, n5, n6, new int[0]);
        }
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return null;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI, ((n & 0x3) == 0x2) ? llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI : llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return llllIIIIlIIIlIlllIll((llIllIlIlIIIIIIIllII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ab.IIIIIIIIIlllIllIlIlI));
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { ab.IIIIIIIIIlllIllIlIlI });
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI;
        ac ac = new ac(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll);
        final LoadingCache llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, true);
        if (!ac.IlIIIlIlIIIllIlIlIIl()) {
            llIllIlIlIIIIIIIllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll;
            ac = new ac(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI);
        }
        if (!ac.IlIIIlIlIIIllIlIlIIl()) {
            return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 1, 1, 1);
        }
        final int[] array = new int[IIlIlIlIIlIllIIIIIIl.values().length];
        final lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl = ac.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ac.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ac.llllIIIIlIIIlIlllIll() - 1);
        IIlIlIlIIlIllIIIIIIl[] values;
        for (int length = (values = IIlIlIlIIlIllIIIIIIl.values()).length, i = 0; i < length; ++i) {
            final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl = values[i];
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl((llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() == ilIlIlIIlIllIIIIIIl) ? llllIIIIlIIIlIlllIll2 : llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(ac.llIllIIIIIllIlIIIIlI, ac.IlIlIlIlIlllllllllIl() - 1), net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(ilIlIlIIlIllIIIIIIl, llIllIlIlIIIIIIIllII), net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, ac.IlIlIlIlIlllllllllIl(), ac.llllIIIIlIIIlIlllIll(), 1);
            for (int j = 0; j < ac.IlIlIlIlIlllllllllIl(); ++j) {
                for (int k = 0; k < ac.llllIIIIlIIIlIlllIll(); ++k) {
                    final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll3 = ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(j, k, 1);
                    if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll() != null && llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        final int[] array2 = array;
                        final int ordinal = ilIlIlIIlIllIIIIIIl.ordinal();
                        ++array2[ordinal];
                    }
                }
            }
        }
        IIlIlIlIIlIllIIIIIIl llllIIIIlIIIlIlllIll4 = IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll;
        IIlIlIlIIlIllIIIIIIl[] values2;
        for (int length2 = (values2 = IIlIlIlIIlIllIIIIIIl.values()).length, l = 0; l < length2; ++l) {
            final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl2 = values2[l];
            if (array[ilIlIlIIlIllIIIIIIl2.ordinal()] < array[llllIIIIlIIIlIlllIll4.ordinal()]) {
                llllIIIIlIIIlIlllIll4 = ilIlIlIIlIllIIIIIIl2;
            }
        }
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl((llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() == llllIIIIlIIIlIlllIll4) ? llllIIIIlIIIlIlllIll2 : llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(ac.llIllIIIIIllIlIIIIlI, ac.IlIlIlIlIlllllllllIl() - 1), net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, llIllIlIlIIIIIIIllII), net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, ac.IlIlIlIlIlllllllllIl(), ac.llllIIIIlIIIlIlllIll(), 1);
    }
}
