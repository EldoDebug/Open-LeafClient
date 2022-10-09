package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public abstract class IIlIIIIlllIlllllIlII
{
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    public IIlIIIIlllIlllllIlII() {
        this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
    }
    
    public abstract void llllIIIIlIIIlIlllIll(final Random p0, final int p1, final int p2, final int p3, final boolean p4);
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
