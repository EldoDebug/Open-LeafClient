package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.net.*;
import java.util.*;

public class llIIlIIIlIIIllIlIIIl
{
    private String IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private Proxy lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private String llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    private Map lIlIlIIIllIIllIIIllI;
    private byte[] IlIlIIIllIIllIlllllI;
    private int IIIIlllIIIIIIlIIIlll;
    public static final String llllIIIIlIIIlIlllIll = "GET";
    public static final String IlIlIlIlIlllllllllIl = "HEAD";
    public static final String llIllIIIIIllIlIIIIlI = "POST";
    public static final String IlIIIlIlIIIllIlIlIIl = "HTTP/1.0";
    public static final String IlIlIIIllIllIIIIIllI = "HTTP/1.1";
    
    public llIIlIIIlIIIllIlIIIl(final String illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final Proxy liiiIlIIIIIlllIllIII, final String liiIlllIIIllIIIllIII, final String llIIlIIIlIIIllIlIIIl, final String llIllIlIIIIllIlIIllI, final Map lIlIlIIIllIIllIIIllI, final byte[] ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = 0;
        this.lIIIIlIIIIIlllIllIII = Proxy.NO_PROXY;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = new LinkedHashMap();
        this.IlIlIIIllIIllIlllllI = null;
        this.IIIIlllIIIIIIlIIIlll = 0;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public Map IllIIlllIIIIlllIIlIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public byte[] llllIIIlIlllIlIIIIIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final int iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public Proxy lIIIlllIIIllIIIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
