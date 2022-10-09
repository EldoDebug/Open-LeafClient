package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import com.google.common.collect.*;

public enum llllIIIlIlllIlIIIIIl
{
    llllIIIIlIIIlIlllIll("VERTEX", 0, "vertex", ".vsh", lIIIIlIlIllllIIlIllI.llllIIllllIlIlIIIIll), 
    IlIlIlIlIlllllllllIl("FRAGMENT", 1, "fragment", ".fsh", lIIIIlIlIllllIIlIllI.IlIllIlIlIIIlIlIlIII);
    
    private final String llIllIIIIIllIlIIIIlI;
    private final String IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final Map IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl[] { net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl };
    }
    
    private llllIIIlIlllIlIIIIIl(final String s, final int n, final String llIllIIIIIllIlIIIIlI, final String ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.IllIIlllIIIIlllIIlIl = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    protected String IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    protected int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    protected Map IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
