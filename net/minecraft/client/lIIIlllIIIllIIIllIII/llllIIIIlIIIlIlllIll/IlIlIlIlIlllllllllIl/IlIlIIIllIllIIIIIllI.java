package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
    }
    
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        return this;
    }
    
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        return this;
    }
    
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll... array) {
        Collections.addAll(this.llIllIIIIIllIlIIIIlI, array);
        return this;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        return new IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, null);
    }
}
