package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public class lIllllllIIllIlIlIlII extends IlIIIIIlIIllIIlIlIll
{
    public lIllllllIIllIlIlIlII() {
    }
    
    public lIllllllIIllIlIlIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2) {
        super(n, n2);
        final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII = new llIIIlIlIllIIlIlIlII(0, random, (n << 4) + 2, (n2 << 4) + 2);
        this.llllIIIIlIIIlIlllIll.add(llIIIlIlIllIIlIlIlII);
        llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, this.llllIIIIlIIIlIlllIll, random);
        this.IlIIIlIlIIIllIlIlIIl();
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, 10);
    }
}
