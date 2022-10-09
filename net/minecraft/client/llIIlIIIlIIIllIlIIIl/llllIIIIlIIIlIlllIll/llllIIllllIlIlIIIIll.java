package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import java.util.*;

public class llllIIllllIlIlIIIIll implements llllIIIlIlllIlIIIIIl
{
    private final boolean llllIIIIlIIIlIlllIll;
    private final boolean IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    
    public llllIIllllIlIlIIIIll(final boolean llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl, final List llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        return Collections.unmodifiableList((List<?>)this.llIllIIIIIllIlIIIIlI);
    }
}
