package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII extends IlIIIIIlIIllIIlIlIll
{
    public lIIIlllIIIllIIIllIII() {
    }
    
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2) {
        super(n, n2);
        final IllIllIlllIllllIIllI illIllIlllIllllIIllI = new IllIllIlllIllllIIllI(random, (n << 4) + 2, (n2 << 4) + 2);
        this.llllIIIIlIIIlIlllIll.add(illIllIlllIllllIIllI);
        illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, this.llllIIIIlIIIlIlllIll, random);
        final List liiiIlIIIIIlllIllIII = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII;
        while (!liiiIlIIIIIlllIllIII.isEmpty()) {
            liiiIlIIIIIlllIllIII.remove(random.nextInt(liiiIlIIIIIlllIllIII.size())).llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, this.llllIIIIlIIIlIlllIll, random);
        }
        this.IlIIIlIlIIIllIlIlIIl();
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, 48, 70);
    }
}
