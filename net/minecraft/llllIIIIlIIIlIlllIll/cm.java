package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import com.google.common.base.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class cm extends llllIIIIlIIIlIlllIll
{
    public static final llIllIIIIIllIlIIIIlI IIIIIIIIIlllIllIlIlI;
    public static final IlIIIlIlIIIllIlIlIIl IIllllIIIlIIIIIIllIl;
    public static final IlIIIlIlIIIllIlIlIIl IlllIIIIlIIIlIlIlIIl;
    private static final int[][] lllIllIIIllllllIllll;
    private final llllIIIIlIIIlIlllIll llIllIlIlIIIIIIIllII;
    private final llIIlIIIlIIIllIlIIIl IIlIlIlIIlIllIIIIIIl;
    private boolean IllIllIIIIlIIlIlllII;
    private int IlIllllIIlIIlIlIlIll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("facing", (Predicate)IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("half", cn.class);
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("shape", co.class);
        lllIllIIIllllllIllll = new int[][] { { 4, 5 }, { 5, 7 }, { 6, 7 }, { 4, 6 }, { 0, 1 }, { 1, 3 }, { 2, 3 }, { 0, 2 } };
    }
    
    protected cm(final llIIlIIIlIIIllIlIIIl iIlIlIlIIlIllIIIIIIl) {
        super(iIlIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl, cn.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.llllIIIIlIIIlIlllIll));
        this.llIllIlIlIIIIIIIllII = iIlIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI();
        this.IIlIlIlIIlIllIIIIIIl = iIlIlIlIIlIllIIIIIIl;
        this.llIllIIIIIllIlIIIIlI(this.llIllIlIlIIIIIIIllII.IIIlIIIlIlIIlllIIlll);
        this.IlIlIlIlIlllllllllIl(this.llIllIlIlIIIIIIIllII.IlIlIIIlIIlIlIIlllIl / 3.0f);
        this.llllIIIIlIIIlIlllIll(this.llIllIlIlIIIIIIIllII.IIlllIIIlIlllIIlllII);
        this.IlIIIlIlIIIllIlIlIIl(255);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IllIllIIIIlIIlIlllII) {
            this.llllIIIIlIIIlIlllIll(0.5f * (this.IlIllllIIlIIlIlIlIll % 2), 0.5f * (this.IlIllllIIlIIlIlIlIll / 4 % 2), 0.5f * (this.IlIllllIIlIIlIlIlIll / 2 % 2), 0.5f + 0.5f * (this.IlIllllIIlIIlIlIlIll % 2), 0.5f + 0.5f * (this.IlIllllIIlIIlIlIlIll / 4 % 2), 0.5f + 0.5f * (this.IlIllllIIlIIlIlIlIll / 2 % 2));
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    public void IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl) == cn.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }
    
    public static boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll instanceof cm;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI()) && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl) == llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl) && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI) == llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
    }
    
    public int IllIIlllIIIIlllIIlIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
        final cn cn = (cn)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl);
        final boolean b = cn == net.minecraft.llllIIIIlIIIlIlllIll.cn.llllIIIIlIIIlIlllIll;
        if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
                if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll3 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
                if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl5 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl5.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll4 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
                if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl6 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl6.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll5 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
                if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
            }
        }
        return 0;
    }
    
    public int llllIIIlIlllIlIIIIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
        final cn cn = (cn)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl);
        final boolean b = cn == net.minecraft.llllIIIIlIIIlIlllIll.cn.llllIIIIlIIIlIlllIll;
        if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
                if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll3 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
                if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl5 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl5.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll4 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
                if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl6 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl6.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll5 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 1 : 2;
                }
                if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    return b ? 2 : 1;
                }
            }
        }
        return 0;
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
        final cn cn = (cn)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl);
        final boolean b = cn == net.minecraft.llllIIIIlIIIlIlllIll.cn.llllIIIIlIIIlIlllIll;
        float n = 0.5f;
        float n2 = 1.0f;
        if (b) {
            n = 0.0f;
            n2 = 0.5f;
        }
        float n3 = 0.0f;
        float n4 = 1.0f;
        float n5 = 0.0f;
        float n6 = 0.5f;
        boolean b2 = true;
        if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            n3 = 0.5f;
            n6 = 1.0f;
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    n6 = 0.5f;
                    b2 = false;
                }
                else if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    n5 = 0.5f;
                    b2 = false;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            n4 = 0.5f;
            n6 = 1.0f;
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll3 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    n6 = 0.5f;
                    b2 = false;
                }
                else if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    n5 = 0.5f;
                    b2 = false;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            n5 = 0.5f;
            n6 = 1.0f;
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl5 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl5.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll4 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    n4 = 0.5f;
                    b2 = false;
                }
                else if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    n3 = 0.5f;
                    b2 = false;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl6 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl6.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll5 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    n4 = 0.5f;
                    b2 = false;
                }
                else if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    n3 = 0.5f;
                    b2 = false;
                }
            }
        }
        this.llllIIIIlIIIlIlllIll(n3, n, n5, n4, n2, n6);
        return b2;
    }
    
    public boolean lIIIlllIIIllIIIllIII(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
        final cn cn = (cn)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl);
        final boolean b = cn == net.minecraft.llllIIIIlIIIlIlllIll.cn.llllIIIIlIIIlIlllIll;
        float n = 0.5f;
        float n2 = 1.0f;
        if (b) {
            n = 0.0f;
            n2 = 0.5f;
        }
        float n3 = 0.0f;
        float n4 = 0.5f;
        float n5 = 0.5f;
        float n6 = 1.0f;
        boolean b2 = false;
        if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    n5 = 0.0f;
                    n6 = 0.5f;
                    b2 = true;
                }
                else if (lllIllIIIllllllIllll2 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    n5 = 0.5f;
                    n6 = 1.0f;
                    b2 = true;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                n3 = 0.5f;
                n4 = 1.0f;
                final lllIllIIIllllllIllll lllIllIIIllllllIllll3 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl2)) {
                    n5 = 0.0f;
                    n6 = 0.5f;
                    b2 = true;
                }
                else if (lllIllIIIllllllIllll3 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl2)) {
                    n5 = 0.5f;
                    n6 = 1.0f;
                    b2 = true;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl5 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl5.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                n5 = 0.0f;
                n6 = 0.5f;
                final lllIllIIIllllllIllll lllIllIIIllllllIllll4 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    b2 = true;
                }
                else if (lllIllIIIllllllIllll4 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    n3 = 0.5f;
                    n4 = 1.0f;
                    b2 = true;
                }
            }
        }
        else if (lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl6 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
            if (llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl6.llIllIIIIIllIlIIIIlI()) && cn == ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl)) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll5 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl6.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI);
                if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl2)) {
                    b2 = true;
                }
                else if (lllIllIIIllllllIllll5 == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && !llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), ilIlIlIlIlllllllllIl2)) {
                    n3 = 0.5f;
                    n4 = 1.0f;
                    b2 = true;
                }
            }
        }
        if (b2) {
            this.llllIIIIlIIIlIlllIll(n3, n, n5, n4, n2, n6);
        }
        return b2;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        final boolean liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        if (liiiIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, list, llIllIIIIIllIlIIIIlI);
        }
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        this.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return this.llIllIlIlIIIIIIIllII.IIlllIIlIllIllIlIIll();
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public e llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final e e) {
        return this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, e);
    }
    
    @Override
    public boolean IlIllIlIlIIIlIlIlIII() {
        return this.llIllIlIlIIIIIIIllII.IlIllIlIlIIIlIlIlIII();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, b);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, this.IIlIlIlIIlIllIIIIIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        this.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, this.IIlIlIlIIlIllIIIIIIl);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, this.IIlIlIlIIlIllIIIIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        this.llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        return this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, this.IIlIlIlIIlIllIIIIIIl, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, 0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII);
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl(this.IIlIlIlIIlIllIIIIIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3, n4, lllIIIIlllllIlIIllIl).llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII()).llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.llllIIIIlIIIlIlllIll);
        return (lllIllIIIllllllIllll != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || n2 <= 0.5)) ? llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl, cn.IlIlIlIlIlllllllllIl) : llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl, cn.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final e e, final e e2) {
        final llIlllIlllllIIllIIII[] array = new llIlllIlllllIIllIIII[8];
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final int[] array2 = cm.lllIllIIIllllllIllll[((lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI)).llIllIIIIIllIlIIIIlI() + ((ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl) == cn.llllIIIIlIIIlIlllIll) ? 4 : 0)];
        this.IllIllIIIIlIIlIlllII = true;
        for (int i = 0; i < 8; ++i) {
            this.IlIllllIIlIIlIlIlIll = i;
            if (Arrays.binarySearch(array2, i) < 0) {
                array[i] = super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, e, e2);
            }
        }
        int[] array3;
        for (int length = (array3 = array2).length, j = 0; j < length; ++j) {
            array[array3[j]] = null;
        }
        llIlllIlllllIIllIIII llIlllIlllllIIllIIII = null;
        double n = 0.0;
        llIlllIlllllIIllIIII[] array4;
        for (int length2 = (array4 = array).length, k = 0; k < length2; ++k) {
            final llIlllIlllllIIllIIII llIlllIlllllIIllIIII2 = array4[k];
            if (llIlllIlllllIIllIIII2 != null) {
                final double llllIIIlIlllIlIIIIIl = llIlllIlllllIIllIIII2.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(e2);
                if (llllIIIlIlllIlIIIIIl > n) {
                    llIlllIlllllIIllIIII = llIlllIlllllIIllIIII2;
                    n = llllIIIlIlllIlIIIIIl;
                }
            }
        }
        return llIlllIlllllIIllIIII;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl, ((n & 0x4) > 0) ? cn.llllIIIIlIIIlIlllIll : cn.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(5 - (n & 0x3)));
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0;
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IIllllIIIlIIIIIIllIl) == cn.llllIIIIlIIIlIlllIll) {
            n |= 0x4;
        }
        return n | 5 - ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.lIIIIlIIIIIlllIllIII(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl)) {
            switch (this.llllIIIlIlllIlIIIIIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl)) {
                case 0: {
                    llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.llllIIIIlIIIlIlllIll);
                    break;
                }
                case 1: {
                    llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.llIllIIIIIllIlIIIIlI);
                    break;
                }
                case 2: {
                    llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.IlIlIlIlIlllllllllIl);
                    break;
                }
            }
        }
        else {
            switch (this.IllIIlllIIIIlllIIlIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl)) {
                case 0: {
                    llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.llllIIIIlIIIlIlllIll);
                    break;
                }
                case 1: {
                    llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.IlIlIIIllIllIIIIIllI);
                    break;
                }
                case 2: {
                    llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IlllIIIIlIIIlIlIlIIl, co.IlIIIlIlIIIllIlIlIIl);
                    break;
                }
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { cm.IIIIIIIIIlllIllIlIlI, cm.IIllllIIIlIIIIIIllIl, cm.IlllIIIIlIIIlIlIlIIl });
    }
}
