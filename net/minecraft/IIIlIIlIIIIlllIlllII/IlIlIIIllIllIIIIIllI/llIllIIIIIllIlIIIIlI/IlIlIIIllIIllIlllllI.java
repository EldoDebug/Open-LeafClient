package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public class IlIlIIIllIIllIlllllI extends IlIIIIIlIIllIIlIlIll
{
    public IlIlIIIllIIllIlllllI() {
    }
    
    public IlIlIIIllIIllIlllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2) {
        super(n, n2);
        IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl();
        final llllllIIIIIIIlllIIll llllllIIIIIIIlllIIll = new llllllIIIIIIIlllIIll(0, random, (n << 4) + 2, (n2 << 4) + 2);
        this.llllIIIIlIIIlIlllIll.add(llllllIIIIIIIlllIIll);
        llllllIIIIIIIlllIIll.llllIIIIlIIIlIlllIll(llllllIIIIIIIlllIIll, this.llllIIIIlIIIlIlllIll, random);
        final List llIllIIIIIllIlIIIIlI = llllllIIIIIIIlllIIll.llIllIIIIIllIlIIIIlI;
        while (!llIllIIIIIllIlIIIIlI.isEmpty()) {
            llIllIIIIIllIlIIIIlI.remove(random.nextInt(llIllIIIIIllIlIIIIlI.size())).llllIIIIlIIIlIlllIll(llllllIIIIIIIlllIIll, this.llllIIIIlIIIlIlllIll, random);
        }
        this.IlIIIlIlIIIllIlIlIIl();
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, 10);
    }
}
