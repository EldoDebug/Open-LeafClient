package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class llIllIlIIIIllIlIIllI extends IlIIIIIlIIllIIlIlIll
{
    public llIllIlIIIIllIlIIllI() {
    }
    
    public llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2) {
        super(n, n2);
        final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(new IlIlIlIlIlllllllllIl(n * 16 + 8, 0, n2 * 16 + 8));
        if (llIllIIIIIllIlIIIIlI != llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl && llIllIIIIIllIlIIIIlI != llIIlIIIlIIIllIlIIIl.IIIIIIIIIlllIllIlIlI) {
            if (llIllIIIIIllIlIIIIlI == llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl) {
                this.llllIIIIlIIIlIlllIll.add(new IllIIlllIIIIlllIIlIl(random, n * 16, n2 * 16));
            }
            else if (llIllIIIIIllIlIIIIlI == llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl || llIllIIIIIllIlIIIIlI == llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll) {
                this.llllIIIIlIIIlIlllIll.add(new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(random, n * 16, n2 * 16));
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll.add(new IlIIIlIlIIIllIlIlIIl(random, n * 16, n2 * 16));
        }
        this.IlIIIlIlIIIllIlIlIIl();
    }
}
