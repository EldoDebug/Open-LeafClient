package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class IIlIIIIIllIlIIIlIIll extends a
{
    public IIlIIIIIllIlIIIlIIll(final int n, final int n2) {
        super(n, n2);
    }
    
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return (int)(((int)this.llllIIIIlIIIlIlllIll() >= (int)this.IlIlIlIlIlllllllllIl()) ? this.llllIIIIlIIIlIlllIll() : ((int)this.llllIIIIlIIIlIlllIll() + random.nextInt((int)this.IlIlIlIlIlllllllllIl() - (int)this.llllIIIIlIIIlIlllIll() + 1)));
    }
}
