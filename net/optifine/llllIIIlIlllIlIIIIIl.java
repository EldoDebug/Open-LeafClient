package net.optifine;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llllIIIlIlllIlIIIIIl implements Comparator
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    
    public llllIIIlIlllIlIIIIIl(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double n) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = 1.0 - llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(Math.abs(n) / 1.5707963267948966, 0.0, 1.0);
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) - this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2);
    }
    
    private int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll;
        final int n2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl;
        final int n3 = n * n + n2 * n2;
        double abs = Math.abs(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2, (double)n) - this.llIllIIIIIllIlIIIIlI);
        if (abs > 3.141592653589793) {
            abs = 6.283185307179586 - abs;
        }
        return (int)(n3 * 1000.0 * this.IlIIIlIlIIIllIlIlIIl * abs * abs);
    }
}
