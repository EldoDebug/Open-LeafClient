package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import java.util.*;

public class lIlIlIIIllIIllIIIllI
{
    private List llllIIIIlIIIlIlllIll;
    
    public lIlIlIIIllIIllIIIllI() {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
    }
    
    public lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        this.llllIIIIlIIIlIlllIll.add(new IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl, n));
        return this;
    }
    
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll() {
        Collections.sort((List<Comparable>)this.llllIIIIlIIIlIlllIll);
        return new llIllIlIIIIllIlIIllI(this.llllIIIIlIIIlIlllIll);
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.get(0).llllIIIIlIIIlIlllIll;
    }
}
