package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.util.*;

public class llIllIlIIIIllIlIIllI
{
    private int llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private Map llIllIIIIIllIlIIIIlI;
    private byte[] IlIIIlIlIIIllIlIlIIl;
    
    public llIllIlIIIIllIlIIllI(final int llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final Map llIllIIIIIllIlIIIIlI, final byte[] ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = 0;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = new LinkedHashMap();
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public Map llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public String llllIIIIlIIIlIlllIll(final String s) {
        return this.llIllIIIIIllIlIIIIlI.get(s);
    }
    
    public byte[] IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
