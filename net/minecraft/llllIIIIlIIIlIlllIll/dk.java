package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class dk extends llllIIIIlIIIlIlllIll
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    public static final IlIlIlIlIlllllllllIl llIllIlIlIIIIIIIllII;
    public static final IlIlIlIlIlllllllllIl[] IIlIlIlIIlIllIIIIIIl;
    private static volatile /* synthetic */ int[] IllIllIIIIlIIlIlllII;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("up");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("north");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("east");
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("south");
        llIllIlIlIIIIIIIllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("west");
        IIlIlIlIIlIllIIIIIIl = new IlIlIlIlIlllllllllIl[] { dk.IIIIIIIIIlllIllIlIlI, dk.IIllllIIIlIIIIIIllIl, dk.lllIllIIIllllllIllll, dk.llIllIlIlIIIIIIIllII, dk.IlllIIIIlIIIlIlIlIIl };
    }
    
    public dk() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(dk.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl, false).llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll, false).llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII, false));
        this.llllIIIIlIIIlIlllIll(true);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dk.IIIIIIIIIlllIllIlIlI, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().llllIIIlIlllIlIIIIIl());
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
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
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return true;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        float min = 1.0f;
        float min2 = 1.0f;
        float min3 = 1.0f;
        float max = 0.0f;
        float n = 0.0f;
        float max2 = 0.0f;
        boolean b = false;
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII)) {
            max = Math.max(max, 0.0625f);
            min = 0.0f;
            min2 = 0.0f;
            n = 1.0f;
            min3 = 0.0f;
            max2 = 1.0f;
            b = true;
        }
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl)) {
            min = Math.min(min, 0.9375f);
            max = 1.0f;
            min2 = 0.0f;
            n = 1.0f;
            min3 = 0.0f;
            max2 = 1.0f;
            b = true;
        }
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl)) {
            max2 = Math.max(max2, 0.0625f);
            min3 = 0.0f;
            min = 0.0f;
            max = 1.0f;
            min2 = 0.0f;
            n = 1.0f;
            b = true;
        }
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll)) {
            min3 = Math.min(min3, 0.9375f);
            max2 = 1.0f;
            min = 0.0f;
            max = 1.0f;
            min2 = 0.0f;
            n = 1.0f;
            b = true;
        }
        if (!b && this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI())) {
            min2 = Math.min(min2, 0.9375f);
            n = 1.0f;
            min = 0.0f;
            max = 1.0f;
            min3 = 0.0f;
            max2 = 1.0f;
        }
        this.llllIIIIlIIIlIlllIll(min, min2, min3, max, n, max2);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        switch (IllIllIIIIlIIlIlllII()[lllIllIIIllllllIllll.ordinal()]) {
            case 2: {
                return this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI());
            }
            case 3:
            case 4:
            case 5:
            case 6: {
                return this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI())).llIllIIIIIllIlIIIIlI());
            }
            default: {
                return false;
            }
        }
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() && llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    private boolean IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll;
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            if ((boolean)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2) && !this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI())) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
                if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this && (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                    continue;
                }
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, false);
            }
        }
        if (lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll) == 0) {
            return false;
        }
        if (llIIlIIIlIIIllIlIIIl != llllIIIIlIIIlIlllIll) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 2);
        }
        return true;
    }
    
    @Override
    public int IIlIIIIlllIlllllIlII() {
        return net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(4) == 0) {
            final int n = 4;
            int n2 = 5;
            boolean b = false;
        Label_0115:
            for (int i = -n; i <= n; ++i) {
                for (int j = -n; j <= n; ++j) {
                    for (int k = -1; k <= 1; ++k) {
                        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, k, j)).llIllIIIIIllIlIIIIlI() == this && --n2 <= 0) {
                            b = true;
                            break Label_0115;
                        }
                    }
                }
            }
            final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(random);
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 255 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2)) {
                if (!b) {
                    llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll3 = llIIlIIIlIIIllIlIIIl;
                    for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                        if (random.nextBoolean() || !this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI())) {
                            llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), false);
                        }
                    }
                    if ((boolean)llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl) || (boolean)llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl) || (boolean)llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll) || (boolean)llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII)) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3, 2);
                    }
                }
            }
            else if (llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI().IlIIIlIlIIIllIlIlIIl() && !(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll))) {
                if (!b) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4).llIllIIIIIllIlIIIIlI();
                    if (llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
                        final lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
                        final boolean booleanValue = (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl));
                        final boolean booleanValue2 = (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl));
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
                        if (booleanValue && this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll5).llIllIIIIIllIlIIIIlI())) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl), true), 2);
                        }
                        else if (booleanValue2 && this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll6).llIllIIIIIllIlIIIIlI())) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl), true), 2);
                        }
                        else if (booleanValue && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll5) && this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl)).llIllIIIIIllIlIIIIlI())) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5, this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI()), true), 2);
                        }
                        else if (booleanValue2 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll6) && this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl)).llIllIIIIIllIlIIIIlI())) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll6, this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI()), true), 2);
                        }
                        else if (this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI())) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, this.lllIllIIIllllllIllll(), 2);
                        }
                    }
                    else if (llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI.llIIlIIIlIIIllIlIIIl() && llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl()) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), true), 2);
                    }
                }
            }
            else if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 1) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2);
                final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI2.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll7 = llIIlIIIlIIIllIlIIIl;
                    for (final lllIllIIIllllllIllll lllIllIIIllllllIllll2 : net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                        if (random.nextBoolean()) {
                            llllIIIIlIIIlIlllIll7 = llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2), false);
                        }
                    }
                    if ((boolean)llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl) || (boolean)llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl) || (boolean)llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll) || (boolean)llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII)) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll7, 2);
                    }
                }
                else if (llIllIIIIIllIlIIIIlI2 == this) {
                    llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll8 = ilIlIlIlIlllllllllIl3;
                    final Iterator iterator3 = net.minecraft.IlllllllIIIlIIIlIlII.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
                    while (iterator3.hasNext()) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll9 = llllIIIIlIIIlIlllIll(iterator3.next());
                        if (random.nextBoolean() && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll9)) {
                            llllIIIIlIIIlIlllIll8 = llllIIIIlIIIlIlllIll8.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll9, true);
                        }
                    }
                    if ((boolean)llllIIIIlIIIlIlllIll8.llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl) || (boolean)llllIIIIlIIIlIlllIll8.llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl) || (boolean)llllIIIIlIIIlIlllIll8.llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll) || (boolean)llllIIIIlIIIlIlllIll8.llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII)) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll8, 2);
                    }
                }
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dk.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl, false).llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll, false).llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII, false);
        return lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI().IlIIIlIlIIIllIlIlIIl() ? llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI()), true) : llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return null;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llllIIIIlIIIlIlllIll.p() != null && llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this)]);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r, 1, 0));
        }
        else {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll, (n & 0x1) > 0).llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII, (n & 0x2) > 0).llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl, (n & 0x4) > 0).llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0;
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll)) {
            n |= 0x1;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII)) {
            n |= 0x2;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl)) {
            n |= 0x4;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { dk.IIIIIIIIIlllIllIlIlI, dk.IIllllIIIlIIIIIIllIl, dk.IlllIIIIlIIIlIlIlIIl, dk.lllIllIIIllllllIllll, dk.llIllIlIlIIIIIIIllII });
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        switch (IllIllIIIIlIIlIlllII()[lllIllIIIllllllIllll.ordinal()]) {
            case 2: {
                return dk.IIIIIIIIIlllIllIlIlI;
            }
            case 3: {
                return dk.IIllllIIIlIIIIIIllIl;
            }
            case 4: {
                return dk.lllIllIIIllllllIllll;
            }
            case 6: {
                return dk.IlllIIIIlIIIlIlIlIIl;
            }
            case 5: {
                return dk.llIllIlIlIIIIIIIllII;
            }
            default: {
                throw new IllegalArgumentException(lllIllIIIllllllIllll + " is an invalid choice");
            }
        }
    }
    
    public static int lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0;
        IlIlIlIlIlllllllllIl[] iIlIlIlIIlIllIIIIIIl;
        for (int length = (iIlIlIlIIlIllIIIIIIl = dk.IIlIlIlIIlIllIIIIIIl).length, i = 0; i < length; ++i) {
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(iIlIlIlIIlIllIIIIIIl[i])) {
                ++n;
            }
        }
        return n;
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] illIllIIIIlIIlIlllII = dk.IllIllIIIIlIIlIlllII;
        if (illIllIIIIlIIlIlllII != null) {
            return illIllIIIIlIIlIlllII;
        }
        final int[] illIllIIIIlIIlIlllII2 = new int[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values().length];
        try {
            illIllIIIIlIIlIlllII2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illIllIIIIlIIlIlllII2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illIllIIIIlIIlIlllII2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illIllIIIIlIIlIlllII2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            illIllIIIIlIIlIlllII2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            illIllIIIIlIIlIlllII2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return dk.IllIllIIIIlIIlIlllII = illIllIIIIlIIlIlllII2;
    }
}
