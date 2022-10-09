package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIIIIIlIIllIIlIlIll extends IIllllIIIlIIIIIIllIl
{
    public static final IllIIlllIIIIlllIIlIl IIIIIIIIIlllIllIlIlI;
    public static final IlIIIlIlIIIllIlIlIIl IIllllIIIlIIIIIIllIl;
    private static volatile /* synthetic */ int[] IlllIIIIlIIIlIlIlIIl;
    private static volatile /* synthetic */ int[] lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("legacy_data", 0, 15);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("contents", IllllIIlIlIllIIIllII.class);
    }
    
    public IlIIIIIlIIllIIlIlIll() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IlIIIIIlIIllIIlIlIll.IIllllIIIlIIIIIIllIl, IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(IlIIIIIlIIllIIlIlIll.IIIIIIIIIlllIllIlIlI, 0));
        this.IlIlIllllllllIIIIlII();
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.flowerPot.name");
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        final float n = 0.375f;
        final float n2 = n / 2.0f;
        this.llllIIIIlIIIlIlllIll(0.5f - n2, 0.0f, 0.5f - n2, 0.5f + n2, n, 0.5f + n2);
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 3;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll instanceof IlllllllIIIlIIIlIlII) {
            final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = ((IlllllllIIIlIIIlIlII)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll2 instanceof IIlllIIIlIlllIIlllII) {
                return net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2).llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, n);
            }
        }
        return 16777215;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl == null || !(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() instanceof IIlllIIIlIlllIIlllII)) {
            return false;
        }
        final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        if (liiIlllIIIllIIIllIII == null) {
            return false;
        }
        if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() != null) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()), ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII())) {
            return false;
        }
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII());
        liiIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII();
        illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IllIllIlllIllllIIllI);
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl;
            if (--lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
            }
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        return llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl || (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI && n == dd.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return (liiIlllIIIllIIIllIII != null && liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() != null) ? liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() : net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.U;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return (liiIlllIIIllIIIllIII != null && liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() != null) ? liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl() : 0;
    }
    
    @Override
    public boolean IlIIIlIIIllllIlIlIlI() {
        return true;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) && net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        if (liiIlllIIIllIIIllIII != null && liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() != null) {
            net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(), 1, liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl()));
        }
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            final IlllllllIIIlIIIlIlII liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
            if (liiIlllIIIllIIIllIII != null) {
                liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(null, 0);
            }
        }
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.U;
    }
    
    private IlllllllIIIlIIIlIlII lIIIlllIIIllIIIllIII(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        return (llllIIIIlIIIlIlllIll instanceof IlllllllIIIlIIIlIlII) ? ((IlllllllIIIlIIIlIlII)llllIIIIlIIIlIlllIll) : null;
    }
    
    @Override
    public net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = null;
        int n2 = 0;
        switch (n) {
            case 1: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll;
                n2 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                break;
            }
            case 2: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl;
                break;
            }
            case 3: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
                n2 = aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                break;
            }
            case 4: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
                n2 = aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                break;
            }
            case 5: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
                n2 = aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                break;
            }
            case 6: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
                n2 = aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                break;
            }
            case 7: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl;
                break;
            }
            case 8: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII;
                break;
            }
            case 9: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll;
                break;
            }
            case 10: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl;
                break;
            }
            case 11: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI;
                n2 = dd.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                break;
            }
            case 12: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
                n2 = aa.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                break;
            }
            case 13: {
                llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
                n2 = aa.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                break;
            }
        }
        return new IlllllllIIIlIIIlIlII(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), n2);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlIIIIIlIIllIIlIlIll.IIllllIIIlIIIIIIllIl, IlIIIIIlIIllIIlIlIll.IIIIIIIIIlllIllIlIlI });
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIIIIlIIllIIlIlIll.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        IllllIIlIlIllIIIllII illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll;
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll instanceof IlllllllIIIlIIIlIlII) {
            final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = (IlllllllIIIlIIIlIlII)llllIIIIlIIIlIlllIll;
            final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll2 instanceof IIlllIIIlIlllIIlllII) {
                final int ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl();
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl) {
                    switch (IllIllIIIIlIIlIlllII()[aa.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2).ordinal()]) {
                        case 1: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.lIlIlIIIllIIllIIIllI;
                            break;
                        }
                        case 2: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IlIlIIIllIIllIlllllI;
                            break;
                        }
                        case 3: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IIIIlllIIIIIIlIIIlll;
                            break;
                        }
                        case 4: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llllIIllllIlIlIIIIll;
                            break;
                        }
                        case 5: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IlIllIlIlIIIlIlIlIII;
                            break;
                        }
                        case 6: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IIlllIIlIllIllIlIIll;
                            break;
                        }
                        default: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll;
                            break;
                        }
                    }
                }
                else if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI) {
                    switch (ilIlIlIlIlllllllllIl2) {
                        case 0: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IIllIIllIIIlIlIIIIlI;
                            break;
                        }
                        case 2: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IIIlIIIlIlIIlllIIlll;
                            break;
                        }
                        default: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll;
                            break;
                        }
                    }
                }
                else if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl) {
                    illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llIllIlIIIIllIlIIllI;
                }
                else if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll) {
                    switch (IlIllllIIlIIlIlIlIll()[llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2).ordinal()]) {
                        case 2: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl;
                            break;
                        }
                        case 3: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI;
                            break;
                        }
                        case 4: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IlIIIlIlIIIllIlIlIIl;
                            break;
                        }
                        case 5: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI;
                            break;
                        }
                        case 6: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IllIIlllIIIIlllIIlIl;
                            break;
                        }
                        case 7: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llllIIIlIlllIlIIIIIl;
                            break;
                        }
                        case 8: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.lIIIIlIIIIIlllIllIII;
                            break;
                        }
                        case 9: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.lIIIlllIIIllIIIllIII;
                            break;
                        }
                        case 10: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llIIlIIIlIIIllIlIIIl;
                            break;
                        }
                        default: {
                            illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll;
                            break;
                        }
                    }
                }
                else if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl) {
                    illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.lllIIIIlllllIlIIllIl;
                }
                else if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII) {
                    illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IlIlIIIIIIlllIlIllIl;
                }
                else if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl) {
                    illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IIllIIllIIIlIlIIIIlI;
                }
                else if (llllIIIIlIIIlIlllIll3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll) {
                    illllIIlIlIllIIIllII = IllllIIlIlIllIIIllII.IlIlIIIlIIlIlIIlllIl;
                }
            }
        }
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIIIIlIIllIIlIlIll.IIllllIIIlIIIIIIllIl, illllIIlIlIllIIIllII);
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
    
    static /* synthetic */ int[] IllIllIIIIlIIlIlllII() {
        final int[] illlIIIIlIIIlIlIlIIl = IlIIIIIlIIllIIlIlIll.IlllIIIIlIIIlIlIlIIl;
        if (illlIIIIlIIIlIlIlIIl != null) {
            return illlIIIIlIIIlIlIlIIl;
        }
        final int[] illlIIIIlIIIlIlIlIIl2 = new int[aa.values().length];
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            illlIIIIlIIIlIlIlIIl2[aa.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlIIIIIlIIllIIlIlIll.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl2;
    }
    
    static /* synthetic */ int[] IlIllllIIlIIlIlIlIll() {
        final int[] lllIllIIIllllllIllll = IlIIIIIlIIllIIlIlIll.lllIllIIIllllllIllll;
        if (lllIllIIIllllllIllll != null) {
            return lllIllIIIllllllIllll;
        }
        final int[] lllIllIIIllllllIllll2 = new int[llIllIIlllllllllllll.values().length];
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            lllIllIIIllllllIllll2[llIllIIlllllllllllll.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        return IlIIIIIlIIllIIlIlIll.lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
    }
}
