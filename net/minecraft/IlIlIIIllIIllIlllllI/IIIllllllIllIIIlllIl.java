package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;

public class IIIllllllIllIIIlllIl
{
    public static int llllIIIIlIIIlIlllIll;
    
    static {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = Integer.MIN_VALUE;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final lIlIIlllIIlIIlIlllIl lIlIIlllIIlIIlIlllIl) {
        if (!lIlIIlllIIlIIlIlllIl.llIIIlIlllIllIIlIllI()) {
            lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll(new IlIIIlIIIllllIlIlIlI(ilIIIIIllIlIIIlIIll, llllIIIlIlllIlIIIIIl));
            throw IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll;
        }
        llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
    }
    
    protected static void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (ilIIIIIllIlIIIlIIll instanceof lIIIlllIIIllIIIllIII) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl().IIllIIllIIIlIlIIIIlI();
        }
        if (ilIIIIIllIlIIIlIIll instanceof lIIIIlIIIIIlllIllIII) {
            IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = ((lIIIIlIIIIIlllIllIII)ilIIIIIllIlIIIlIIll).llllIIIIlIIIlIlllIll();
        }
        else if (ilIIIIIllIlIIIlIIll instanceof IlIlIlIlIlllllllllIl) {
            IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = ((IlIlIlIlIlllllllllIl)ilIIIIIllIlIIIlIIll).IlIIIlIlIIIllIlIlIIl();
        }
        else {
            IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = Integer.MIN_VALUE;
        }
    }
}
