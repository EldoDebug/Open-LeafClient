package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lllllIIIIIlIIlllIlIl extends IIllllIIIlIIIIIIllIl
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    private final boolean IIllllIIIlIIIIIIllIl;
    private static boolean IlllIIIIlIIIlIlIlIIl;
    private static volatile /* synthetic */ int[] lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing", (Predicate)IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
    }
    
    protected lllllIIIIIlIIlllIlIl(final boolean iIllllIIIlIIIIIIllIl) {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI));
        this.IIllllIIIlIIIIIIllIl = iIllllIIIlIIIIIIllIl;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    private void IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI();
            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI();
            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI();
            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI();
            lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI);
            if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() && !llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll()) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
            }
            else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll() && !llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
            }
            else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll() && !llIllIIIIIllIlIIIIlI4.llllIIIIlIIIlIlllIll()) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            }
            else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && llIllIIIIIllIlIIIIlI4.llllIIIIlIIIlIlllIll() && !llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll()) {
                lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll), 2);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (this.IIllllIIIlIIIIIIllIl) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI);
            final double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5;
            final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextDouble() * 6.0 / 16.0;
            final double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5;
            final double n4 = 0.52;
            final double n5 = random.nextDouble() * 0.6 - 0.3;
            switch (IllIllIIIIlIIlIlllII()[lllIllIIIllllllIllll.ordinal()]) {
                case 5: {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n - n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl, n - n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 6: {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n + n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl, n + n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 3: {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n + n5, n2, n3 - n4, 0.0, 0.0, 0.0, new int[0]);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl, n + n5, n2, n3 - n4, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 4: {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n + n5, n2, n3 + n4, 0.0, 0.0, 0.0, new int[0]);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl, n + n5, n2, n3 + n4, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll2 instanceof IIlIIIIlllIlllllIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll2);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIlIIIlllIllIllIlIII);
        }
        return true;
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean b, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        lllllIIIIIlIIlllIlIl.IlllIIIIlIIIlIlIlIIl = true;
        if (b) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI)), 3);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI)), 3);
        }
        else {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI)), 3);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI)), 3);
        }
        lllllIIIIIlIIlllIlIl.IlllIIIIlIIIlIlIlIIl = false;
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll();
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new IIlIIIIlllIlllllIlII();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII().IlIlIIIllIllIIIIIllI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII().IlIlIIIllIllIIIIIllI()), 2);
        if (lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll instanceof IIlIIIIlllIlllllIlII) {
                ((IIlIIIIlllIlllllIlII)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!lllllIIIIIlIIlllIlIl.IlllIIIIlIIIlIlIlIIl) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll instanceof IIlIIIIlllIlllllIlII) {
                net.minecraft.llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll);
                illlllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, this);
            }
        }
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public boolean IIIIIIIIIlllIllIlIlI() {
        return true;
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll);
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 3;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        lllIllIIIllllllIllll lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n);
        if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
        }
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lllllIIIIIlIIlllIlIl.IIIIIIIIIlllIllIlIlI });
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] lllIllIIIllllllIllll = lllllIIIIIlIIlllIlIl.lllIllIIIllllllIllll;
        if (lllIllIIIllllllIllll != null) {
            return lllIllIIIllllllIllll;
        }
        final int[] lllIllIIIllllllIllll2 = new int[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values().length];
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIllIIIllllllIllll2[net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lllllIIIIIlIIlllIlIl.lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
    }
}
