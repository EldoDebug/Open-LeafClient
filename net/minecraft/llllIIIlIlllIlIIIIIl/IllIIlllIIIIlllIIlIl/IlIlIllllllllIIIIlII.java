package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;

public class IlIlIllllllllIIIIlII extends lIIIIlIIIIIlllIllIII implements IIlllIIIlIlllIIlllII, llIIlllIIlllIIllIllI
{
    private int u;
    private boolean v;
    private boolean w;
    net.minecraft.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI t;
    private llllIIIIlIIIlIlllIll x;
    private IlIlIlIlIlllllllllIl y;
    private int z;
    private boolean A;
    private boolean B;
    private int C;
    private String D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private lIllllllIIllIlIlIlII I;
    private static final llIIIlIlIllIIlIlIlII[][][][] J;
    
    static {
        J = new llIIIlIlIllIIlIlIlII[][][][] { { { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll, new IIlIIIIIllIlIIIlIIll(18, 22)), new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.W, new IIlIIIIIllIlIIIlIIll(15, 19)), new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.V, new IIlIIIIIllIlIIIlIIll(15, 19)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII, new IIlIIIIIllIlIIIlIIll(-4, -2)) }, { new IIlllIlIIllIlIlIlIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI), new IIlIIIIIllIlIIIlIIll(8, 13)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.ae, new IIlIIIIIllIlIIIlIIll(-3, -2)) }, { new IIlllIlIIllIlIlIlIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.o), new IIlIIIIIllIlIIIlIIll(7, 12)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, new IIlIIIIIllIlIIIlIIll(-5, -7)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.g, new IIlIIIIIllIlIIIlIIll(-6, -10)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.d, new IIlIIIIIllIlIIIlIIll(1, 1)) } }, { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII, new IIlIIIIIllIlIIIlIIll(15, 20)), new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, new IIlIIIIIllIlIIIlIIll(16, 24)), new lllllIlIIIlIlIIlllII(IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, new IIlIIIIIllIlIIIlIIll(6, 6), IIllIIllIIIlIlIIIIlI.llllIlIllllIIlIIlIlI, new IIlIIIIIllIlIIIlIIll(6, 6)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll, new IIlIIIIIllIlIIIlIIll(7, 8)) } }, { { new IIlllIlIIllIlIlIlIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), new IIlIIIIIllIlIIIlIIll(16, 22)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.i, new IIlIIIIIllIlIIIlIIll(3, 4)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 0), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 1), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 2), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 3), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 4), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 5), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 6), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 7), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 8), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 9), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 10), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 11), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 12), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 13), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 14), new IIlIIIIIllIlIIIlIIll(1, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, 15), new IIlIIIIIllIlIIIlIIll(1, 2)) } }, { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII, new IIlIIIIIllIlIIIlIIll(15, 20)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl, new IIlIIIIIllIlIIIlIIll(-12, -8)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, new IIlIIIIIllIlIIIlIIll(2, 3)), new lllllIlIIIlIlIIlllII(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll), new IIlIIIIIllIlIIIlIIll(10, 10), IIllIIllIIIlIlIIIIlI.IIlllIIlllIIIlIlllII, new IIlIIIIIllIlIIIlIIll(6, 10)) } } }, { { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll, new IIlIIIIIllIlIIIlIIll(24, 36)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII() }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll, new IIlIIIIIllIlIIIlIIll(8, 10)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IlIllIIllIIlIIIIlIIl, new IIlIIIIIllIlIIIlIIll(10, 12)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl), new IIlIIIIIllIlIIIlIIll(3, 4)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.R, new IIlIIIIIllIlIIIlIIll(2, 2)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.lIllIIlIlIlllllIIIII, new IIlIIIIIllIlIIIlIIll(10, 12)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII), new IIlIIIIIllIlIIIlIIll(-5, -3)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII() }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII() }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.as, new IIlIIIIIllIlIIIlIIll(20, 22)) } } }, { { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.x, new IIlIIIIIllIlIIIlIIll(36, 40)), new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, new IIlIIIIIllIlIIIlIIll(8, 10)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII, new IIlIIIIIllIlIIIlIIll(-4, -1)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.a, 1, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI()), new IIlIIIIIllIlIIIlIIll(-2, -1)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.L, new IIlIIIIIllIlIIIlIIll(7, 11)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.b), new IIlIIIIIllIlIIIlIIll(-3, -1)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.O, new IIlIIIIIllIlIIIlIIll(3, 11)) } } }, { { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, new IIlIIIIIllIlIIIlIIll(16, 24)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IIlIIIlllIllIllIlIII, new IIlIIIIIllIlIIIlIIll(4, 6)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, new IIlIIIIIllIlIIIlIIll(7, 9)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.lIlIlIlllIIlIlIlllIl, new IIlIIIIIllIlIIIlIIll(10, 14)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, new IIlIIIIIllIlIIIlIIll(3, 4)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl, new IIlIIIIIllIlIIIlIIll(16, 19)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.lIIlIIIlIllIlIllIIIl, new IIlIIIIIllIlIIIlIIll(5, 7)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IllIlIIllIllIIlIllII, new IIlIIIIIllIlIIIlIIll(9, 11)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.llIlIIIIIlIIlIlIIlll, new IIlIIIIIllIlIIIlIIll(5, 7)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IlIIlIlIIIlIIlIlIlII, new IIlIIIIIllIlIIIlIIll(11, 15)) } }, { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, new IIlIIIIIllIlIIIlIIll(16, 24)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI, new IIlIIIIIllIlIIIlIIll(6, 8)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, new IIlIIIIIllIlIIIlIIll(7, 9)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI, new IIlIIIIIllIlIIIlIIll(9, 10)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, new IIlIIIIIllIlIIIlIIll(3, 4)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll, new IIlIIIIIllIlIIIlIIll(12, 15)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.IIlIIIIlllIlllllIlII, new IIlIIIIIllIlIIIlIIll(9, 12)) } }, { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, new IIlIIIIIllIlIIIlIIll(16, 24)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, new IIlIIIIIllIlIIIlIIll(5, 7)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, new IIlIIIIIllIlIIIlIIll(7, 9)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl, new IIlIIIIIllIlIIIlIIll(9, 11)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, new IIlIIIIIllIlIIIlIIll(3, 4)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.IlllllllIIIlIIIlIlII, new IIlIIIIIllIlIIIlIIll(12, 15)) } } }, { { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.IlIIlllllIIllIIlllll, new IIlIIIIIllIlIIIlIIll(14, 18)), new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.o, new IIlIIIIIllIlIIIlIIll(14, 18)) }, { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, new IIlIIIIIllIlIIIlIIll(16, 24)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.lllllIIlIlIIIlIlIIIl, new IIlIIIIIllIlIIIlIIll(-7, -5)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.p, new IIlIIIIIllIlIIIlIIll(-8, -6)) } }, { { new IIlllIlIIllIlIlIlIIl(IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI, new IIlIIIIIllIlIIIlIIll(9, 12)), new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IlIllllIIlIIlIlIlIll, new IIlIIIIIllIlIIIlIIll(2, 4)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI(IIllIIllIIIlIlIIIIlI.IllIllIIIIlIIlIlllII, new IIlIIIIIllIlIIIlIIll(7, 12)) }, { new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, new IIlIIIIIllIlIIIlIIll(8, 10)) } } } };
    }
    
    public IlIlIllllllllIIIIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this(illlllllIIIlIIIlIlII, 0);
    }
    
    public IlIlIllllllllIIIIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        super(illlllllIIIlIIIlIlII);
        this.I = new lIllllllIIllIlIlIlII("Items", false, 8);
        this.lllIIIIlllllIlIIllIl(n);
        this.llllIIIIlIIIlIlllIll(0.6f, 1.8f);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).IlIlIlIlIlllllllllIl(true);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIlIIIIIlIIlIlIIlll.class, 8.0f, 0.6, 0.6));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIIIIIIlIllIIlIIIll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new IIlIIIIlllIlllllIlII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new IIlIlIlIIlIllIIIIIIl(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IIIIIIIIIlllIllIlIlI(this, true));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI(this, 0.6));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new llIIIlIlllIllIIlIllI(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(9, new IllIIlllllIIllIIllIl(this, llllIIIIlIIIlIlllIll.class, 3.0f, 1.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(9, new lIIIIlIlIllllIIlIllI(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(9, new IlIIllIIllIIllIIlIIl(this, 0.6));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(10, new lllllIIIIIlIlIIIIIIl(this, IlIllIlIlIIIlIlIlIII.class, 8.0f));
        this.IlIlIlIlIlllllllllIl(true);
    }
    
    private void ax() {
        if (!this.H) {
            this.H = true;
            if (this.e_()) {
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new llIllIlIlIIIIIIIllII(this, 0.32));
            }
            else if (this.an() == 0) {
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IIIlIIIlIlIIlllIIlll(this, 0.6));
            }
        }
    }
    
    @Override
    protected void lIIIIlIIIIIlllIllIII() {
        if (this.an() == 0) {
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IIIlIIIlIlIIlllIIlll(this, 0.6));
        }
        super.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.5);
    }
    
    @Override
    protected void i() {
        final int u = this.u - 1;
        this.u = u;
        if (u <= 0) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
            this.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            this.u = 70 + this.IlIIllIIllIIllIIlIIl.nextInt(50);
            this.t = this.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 32);
            if (this.t == null) {
                this.IlIlIIIIIIlllIlIllIl();
            }
            else {
                this.llllIIIIlIIIlIlllIll(this.t.llllIIIIlIIIlIlllIll(), (int)(this.t.IlIlIlIlIlllllllllIl() * 1.0f));
                if (this.G) {
                    this.G = false;
                    this.t.IlIlIlIlIlllllllllIl(5);
                }
            }
        }
        if (!this.aq() && this.z > 0) {
            --this.z;
            if (this.z <= 0) {
                if (this.A) {
                    for (final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.y) {
                        if (llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) {
                            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl.nextInt(6) + this.IlIIllIIllIIllIIlIIl.nextInt(6) + 2);
                        }
                    }
                    this.ay();
                    this.A = false;
                    if (this.t != null && this.D != null) {
                        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)14);
                        this.t.llllIIIIlIIIlIlllIll(this.D, 1);
                    }
                }
                this.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllllIllIllIlIllllI, 200, 0));
            }
        }
        super.i();
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if ((ilIIIlIlIIIllIlIlIIl == null || ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() != net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.N) && this.llllIllllIllllIlIlII() && !this.aq() && !this.e_()) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (this.y == null || this.y.size() > 0)) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIlllIIlllIIllIllI)this);
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIlllIIIlIlllIIlllII);
            return true;
        }
        return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Profession", this.an());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Riches", this.C);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Career", this.E);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CareerLevel", this.F);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Willing", this.B);
        if (this.y != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Offers", this.y.llllIIIIlIIIlIlllIll());
        }
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.I.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.I.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll()));
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Inventory", ilIlIIIlIIlIlIIlllIl);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lllIIIIlllllIlIIllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Profession"));
        this.C = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Riches");
        this.E = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Career");
        this.F = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CareerLevel");
        this.B = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Willing");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Offers", 10)) {
            this.y = new IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Offers"));
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Inventory", 10);
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i));
            if (llllIIIIlIIIlIlllIll != null) {
                this.I.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
        }
        this.IlIlIlIlIlllllllllIl(true);
        this.ax();
    }
    
    @Override
    protected boolean g() {
        return false;
    }
    
    @Override
    protected String e() {
        return this.aq() ? "mob.villager.haggle" : "mob.villager.idle";
    }
    
    @Override
    protected String O() {
        return "mob.villager.hit";
    }
    
    @Override
    protected String P() {
        return "mob.villager.death";
    }
    
    public void lllIIIIlllllIlIIllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, n);
    }
    
    public int an() {
        return Math.max(this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(16) % 5, 0);
    }
    
    public boolean ao() {
        return this.v;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean v) {
        this.v = v;
    }
    
    public void IlIlIIIllIIllIlllllI(final boolean w) {
        this.w = w;
    }
    
    public boolean ap() {
        return this.w;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl);
        if (this.t != null && lllIIIIlllllIlIIllIl != null) {
            this.t.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
            if (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll) {
                int n = -1;
                if (this.e_()) {
                    n = -3;
                }
                this.t.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.s_(), n);
                if (this.llllIllllIllllIlIlII()) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)13);
                }
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (this.t != null) {
            final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
            if (llIIlIIIlIIIllIlIIIl != null) {
                if (llIIlIIIlIIIllIlIIIl instanceof llllIIIIlIIIlIlllIll) {
                    this.t.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.s_(), -2);
                }
                else if (llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IllIlIIllIllIIlIllII) {
                    this.t.lIIIIlIIIIIlllIllIII();
                }
            }
            else if (this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, 16.0) != null) {
                this.t.lIIIIlIIIIIlllIllIII();
            }
        }
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll x) {
        this.x = x;
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        return this.x;
    }
    
    public boolean aq() {
        return this.x != null;
    }
    
    public boolean IIIIlllIIIIIIlIIIlll(final boolean b) {
        if (!this.B && b && this.at()) {
            boolean b2 = false;
            for (int i = 0; i < this.I.lIIIlllIIIllIIIllIII(); ++i) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.I.lIlIlIIIllIIllIIIllI(i);
                if (lIlIlIIIllIIllIIIllI != null) {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl >= 3) {
                        b2 = true;
                        this.I.IlIlIlIlIlllllllllIl(i, 3);
                    }
                    else if ((lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.W || lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V) && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl >= 12) {
                        b2 = true;
                        this.I.IlIlIlIlIlllllllllIl(i, 12);
                    }
                }
                if (b2) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)18);
                    this.B = true;
                    break;
                }
            }
        }
        return this.B;
    }
    
    public void llllIIllllIlIlIIIIll(final boolean b) {
        this.B = b;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
        this.IllIIlllIIIIlllIIlIl = -this.IIIllllllIllIIIlllIl();
        this.llllIIIIlIIIlIlllIll("mob.villager.yes", this.Z(), this.aa());
        int n = 3 + this.IlIIllIIllIIllIIlIIl.nextInt(4);
        if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() == 1 || this.IlIIllIIllIIllIIlIIl.nextInt(5) == 0) {
            this.z = 40;
            this.A = true;
            this.B = true;
            if (this.x != null) {
                this.D = this.x.s_();
            }
            else {
                this.D = null;
            }
            n += 5;
        }
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.S) {
            this.C += llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl;
        }
        if (llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII, n));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IllIIlllIIIIlllIIlIl > -this.IIIllllllIllIIIlllIl() + 20) {
            this.IllIIlllIIIIlllIIlIl = -this.IIIllllllIllIIIlllIl();
            if (lllIIIIlIlIllIIlIIIl != null) {
                this.llllIIIIlIIIlIlllIll("mob.villager.yes", this.Z(), this.aa());
            }
            else {
                this.llllIIIIlIIIlIlllIll("mob.villager.no", this.Z(), this.aa());
            }
        }
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.y == null) {
            this.ay();
        }
        return this.y;
    }
    
    private void ay() {
        final llIIIlIlIllIIlIlIlII[][][] array = IlIlIllllllllIIIIlII.J[this.an()];
        if (this.E != 0 && this.F != 0) {
            ++this.F;
        }
        else {
            this.E = this.IlIIllIIllIIllIIlIIl.nextInt(array.length) + 1;
            this.F = 1;
        }
        if (this.y == null) {
            this.y = new IlIlIlIlIlllllllllIl();
        }
        final int n = this.E - 1;
        final int n2 = this.F - 1;
        final llIIIlIlIllIIlIlIlII[][] array2 = array[n];
        if (n2 >= 0 && n2 < array2.length) {
            llIIIlIlIllIIlIlIlII[] array3;
            for (int length = (array3 = array2[n2]).length, i = 0; i < length; ++i) {
                array3[i].llllIIIIlIIIlIlllIll(this.y, this.IlIIllIIllIIllIIlIIl);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llIIIIIIlIllIIlIIIll v_() {
        final String lIllIlIIIllllllIIlII = this.lIllIlIIIllllllIIlII();
        if (lIllIlIIIllllllIIlII != null && lIllIlIIIllllllIIlII.length() > 0) {
            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(lIllIlIIIllllllIIlII);
            ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lIIlIIIIIIIlIIlIlIIl());
            ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lllIIIIlIlIllIIlIIIl().toString());
            return ilIlIIIIIIlllIlIllIl;
        }
        if (this.y == null) {
            this.ay();
        }
        String s = null;
        switch (this.an()) {
            case 0: {
                if (this.E == 1) {
                    s = "farmer";
                    break;
                }
                if (this.E == 2) {
                    s = "fisherman";
                    break;
                }
                if (this.E == 3) {
                    s = "shepherd";
                    break;
                }
                if (this.E == 4) {
                    s = "fletcher";
                    break;
                }
                break;
            }
            case 1: {
                s = "librarian";
                break;
            }
            case 2: {
                s = "cleric";
                break;
            }
            case 3: {
                if (this.E == 1) {
                    s = "armor";
                    break;
                }
                if (this.E == 2) {
                    s = "weapon";
                    break;
                }
                if (this.E == 3) {
                    s = "tool";
                    break;
                }
                break;
            }
            case 4: {
                if (this.E == 1) {
                    s = "butcher";
                    break;
                }
                if (this.E == 2) {
                    s = "leather";
                    break;
                }
                break;
            }
        }
        if (s != null) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("entity.Villager." + s, new Object[0]);
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lIIlIIIIIIIlIIlIlIIl());
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lllIIIIlIlIllIIlIIIl().toString());
            return illIIllIIIlIlIIIIlI;
        }
        return super.v_();
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        float n = 1.62f;
        if (this.e_()) {
            n -= (float)0.81;
        }
        return n;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 12) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl);
        }
        else if (b == 13) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIIlIlIIlllIIlll);
        }
        else if (b == 14) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIlIIlIlIIlllIl);
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        for (int i = 0; i < 5; ++i) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + 1.0 + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, new int[0]);
        }
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        this.lllIIIIlllllIlIIllIl(this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(5));
        this.ax();
        return llllIIIIlIIIlIlllIll;
    }
    
    public void ar() {
        this.G = true;
    }
    
    public IlIlIllllllllIIIIlII IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = new IlIlIllllllllIIIIlII(this.IlllllllIIIlIIIlIlII);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIllllllllIIIIlII)), null);
        return ilIlIllllllllIIIIlII;
    }
    
    @Override
    public boolean s() {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IIlIlIlIIlIllIIIIIIl) {
            final IllIllIlllIllllIIllI illIllIlllIllllIIllI = new IllIllIlllIllllIIllI(this.IlllllllIIIlIIIlIlII);
            illIllIlllIllllIIllI.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI)), null);
            illIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl(this.v());
            if (this.w_()) {
                illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl(this.lIllIlIIIllllllIIlII());
                illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII(this.IlIllIIllIIlIIIIlIIl());
            }
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI);
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    public lIllllllIIllIlIlIlII as() {
        return this.I;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
        if (this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll())) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.I.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
            if (llllIIIIlIIIlIlllIll == null) {
                liiIlllIIIllIIIllIII.IllIllIIIIlIIlIlllII();
            }
            else {
                liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
            }
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII || ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.W || ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V || ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll || ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl;
    }
    
    public boolean at() {
        return this.IlIlIIIIIIlllIlIllIl(1);
    }
    
    public boolean au() {
        return this.IlIlIIIIIIlllIlIllIl(2);
    }
    
    public boolean av() {
        return (this.an() == 0) ? (!this.IlIlIIIIIIlllIlIllIl(5)) : (!this.IlIlIIIIIIlllIlIllIl(1));
    }
    
    private boolean IlIlIIIIIIlllIlIllIl(final int n) {
        final boolean b = this.an() == 0;
        for (int i = 0; i < this.I.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.I.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if ((lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl >= 3 * n) || (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.W && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl >= 12 * n) || (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl >= 12 * n)) {
                    return true;
                }
                if (b && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl >= 9 * n) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean aw() {
        for (int i = 0; i < this.I.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.I.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null && (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl || lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.W || lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (super.IlIlIlIlIlllllllllIl(n, lllIIIIlIlIllIIlIIIl)) {
            return true;
        }
        final int n2 = n - 300;
        if (n2 >= 0 && n2 < this.I.lIIIlllIIIllIIIllIII()) {
            this.I.llIllIIIIIllIlIIIIlI(n2, lllIIIIlIlIllIIlIIIl);
            return true;
        }
        return false;
    }
}
