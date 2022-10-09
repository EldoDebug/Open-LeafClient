package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.*;
import com.google.common.base.*;

public class llllIIIIlIIIlIlllIll
{
    private final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    
    public llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final List ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n) {
        return (IlIlIlIlIlllllllllIl)((n >= 0 && n < this.IlIlIlIlIlllllllllIl.size()) ? Objects.firstNonNull((Object)this.IlIlIlIlIlllllllllIl.get(n), (Object)IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) : IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
