package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlIlIllllIlllIIIIll extends llllIIIIlIIIlIlllIll
{
    public static final IllIIlllIIIIlllIIlIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    public static final IlIlIlIlIlllllllllIl llIllIlIlIIIIIIIllII;
    public static final IlIlIlIlIlllllllllIl IIlIlIlIIlIllIIIIIIl;
    public static final IlIlIlIlIlllllllllIl IllIllIIIIlIIlIlllII;
    public static final IllIIlllIIIIlllIIlIl IlIllllIIlIIlIlIlIll;
    private final Map IllIllIlllIllllIIllI;
    private final Map llIlIIIIIlIIlIlIIlll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("age", 0, 15);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("flip");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("alt");
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("north");
        llIllIlIlIIIIIIIllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("east");
        IIlIlIlIIlIllIIIIIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("south");
        IllIllIIIIlIIlIlllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("west");
        IlIllllIIlIIlIlIlIll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("upper", 0, 2);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && !net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
            final boolean b = (liiiIlIIIIIlllIllIII + liiIlllIIIllIIIllIII + llIIlIIIlIIIllIlIIIl2 & 0x1) == 0x1;
            final boolean b2 = (liiiIlIIIIIlllIllIII / 2 + liiIlllIIIllIIIllIII / 2 + llIIlIIIlIIIllIlIIIl2 / 2 & 0x1) == 0x1;
            int n = 0;
            if (this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll())) {
                n = (b ? 1 : 2);
            }
            return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.lllIllIIIllllllIllll, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI())).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.llIllIlIlIIIIIIIllII, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl())).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIlIlIlIIlIllIIIIIIl, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl())).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IllIllIIIIlIIlIlllII, this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI())).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IlIllllIIlIIlIlIlIll, n).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIllllIIIlIIIIIIllIl, b2).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IlllIIIIlIIIlIlIlIIl, b);
        }
        return this.lllIllIIIllllllIllll();
    }
    
    protected IIlIlIllllIlllIIIIll() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll);
        this.IllIllIlllIllllIIllI = Maps.newIdentityHashMap();
        this.llIlIIIIIlIIlIlIIlll = Maps.newIdentityHashMap();
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI, 0).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IlllIIIIlIIIlIlIlIIl, false).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.lllIllIIIllllllIllll, false).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.llIllIlIlIIIIIIIllII, false).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIlIlIlIIlIllIIIIIIl, false).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IllIllIIIIlIIlIlllII, false).llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IlIllllIIlIIlIlIlIll, 0));
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    public static void IllIllIIIIlIIlIlllII() {
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.P, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.s, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.t, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.u, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.v, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.w, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.x, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIlIlIlllllIIIII, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIIIIIlIIlIlIIl, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Z, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aa, 5, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, 5, 5);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, 5, 5);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, 30, 60);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll, 30, 60);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl, 30, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII, 15, 100);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, 60, 100);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, 60, 100);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl, 60, 100);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, 60, 100);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl, 60, 100);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, 30, 60);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r, 15, 100);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aE, 5, 5);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aB, 60, 20);
        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, 60, 20);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        this.IllIllIlllIllllIIllI.put(llllIIIIlIIIlIlllIll, n);
        this.llIlIIIIIlIIlIlIIlll.put(llllIIIIlIIIlIlllIll, n2);
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
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return 0;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return 30;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final Random random) {
        if (illlllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doFireTick")) {
            if (!this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
            boolean b = llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI;
            if (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII instanceof lIllllllIIllIlIlIlII && llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII) {
                b = true;
            }
            if (!b && illlllllIIIlIIIlIlII.llllllIllIllIlIllllI() && this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
            else {
                final int intValue = (int)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI);
                if (intValue < 15) {
                    llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI, intValue + random.nextInt(3) / 2);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 4);
                }
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII) + random.nextInt(10));
                if (!b) {
                    if (!this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
                        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) || intValue > 3) {
                            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                        }
                        return;
                    }
                    if (!this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && intValue == 15 && random.nextInt(4) == 0) {
                        illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                        return;
                    }
                }
                final boolean lllllIlIIIlIlIIlllII = illlllllIIIlIIIlIlII.lllllIlIIIlIlIIlllII(ilIlIlIlIlllllllllIl);
                int n = 0;
                if (lllllIlIIIlIlIIlllII) {
                    n = -50;
                }
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), 300 + n, random, intValue);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), 300 + n, random, intValue);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), 250 + n, random, intValue);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), 250 + n, random, intValue);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), 300 + n, random, intValue);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), 300 + n, random, intValue);
                for (int i = -1; i <= 1; ++i) {
                    for (int j = -1; j <= 1; ++j) {
                        for (int k = -1; k <= 4; ++k) {
                            if (i != 0 || k != 0 || j != 0) {
                                int n2 = 100;
                                if (k > 1) {
                                    n2 += (k - 1) * 100;
                                }
                                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, k, j);
                                final int llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2);
                                if (llIllIlIIIIllIlIIllI > 0) {
                                    int n3 = (llIllIlIIIIllIlIIllI + 40 + illlllllIIIlIIIlIlII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll() * 7) / (intValue + 30);
                                    if (lllllIlIIIlIlIIlllII) {
                                        n3 /= 2;
                                    }
                                    if (n3 > 0 && random.nextInt(n2) <= n3 && (!illlllllIIIlIIIlIlII.llllllIllIllIlIllllI() || !this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2))) {
                                        int n4 = intValue + random.nextInt(5) / 4;
                                        if (n4 > 15) {
                                            n4 = 15;
                                        }
                                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI, n4), 3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected boolean lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(ilIlIlIlIlllllllllIl) || illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()) || illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()) || illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()) || illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public boolean IIIIIllIIIIlIIIIllIl() {
        return false;
    }
    
    private int llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final Integer n = this.llIlIIIIIlIIlIlIIlll.get(llllIIIIlIIIlIlllIll);
        return (n == null) ? 0 : n;
    }
    
    private int IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final Integer n = this.IllIllIlllIllllIIllI.get(llllIIIIlIIIlIlllIll);
        return (n == null) ? 0 : n;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final Random random, final int n2) {
        if (random.nextInt(n) < this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI())) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            if (random.nextInt(n2 + 10) < 5 && !illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(ilIlIlIlIlllllllllIl)) {
                int n3 = n2 + random.nextInt(5) / 4;
                if (n3 > 15) {
                    n3 = 15;
                }
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI, n3), 3);
            }
            else {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII) {
                net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, true));
            }
        }
    }
    
    private boolean llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        lllIllIIIllllllIllll[] values;
        for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            if (this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]))) {
                return true;
            }
        }
        return false;
    }
    
    private int llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl)) {
            return 0;
        }
        int max = 0;
        lllIllIIIllllllIllll[] values;
        for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            max = Math.max(this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i])).llIllIIIIIllIlIIIIlI()), max);
        }
        return max;
    }
    
    @Override
    public boolean IlIllIlIlIIIlIlIlIII() {
        return false;
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI()) > 0;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) || this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && !this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll() > 0 || !net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && !this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
            else {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII) + illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(10));
            }
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (random.nextInt(24) == 0) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, "fire.fire", 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
        }
        if (!net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && !net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
            if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI())) {
                for (int i = 0; i < 2; ++i) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextDouble() * 0.10000000149011612, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl())) {
                for (int j = 0; j < 2; ++j) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 1 - random.nextDouble() * 0.10000000149011612, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI())) {
                for (int k = 0; k < 2; ++k) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextDouble() * 0.10000000149011612, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl())) {
                for (int l = 0; l < 2; ++l) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 1 - random.nextDouble() * 0.10000000149011612, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll())) {
                for (int n = 0; n < 2; ++n) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 - random.nextDouble() * 0.10000000149011612, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
        else {
            for (int n2 = 0; n2 < 3; ++n2) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextDouble(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextDouble() * 0.5 + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI, IIlIlIllllIlllIIIIll.lllIllIIIllllllIllll, IIlIlIllllIlllIIIIll.llIllIlIlIIIIIIIllII, IIlIlIllllIlllIIIIll.IIlIlIlIIlIllIIIIIIl, IIlIlIllllIlllIIIIll.IllIllIIIIlIIlIlllII, IIlIlIllllIlllIIIIll.IlIllllIIlIIlIlIlIll, IIlIlIllllIlllIIIIll.IIllllIIIlIIIIIIllIl, IIlIlIllllIlllIIIIll.IlllIIIIlIIIlIlIlIIl });
    }
}
