package net.optifine.IlIIIlIlIIIllIlIlIIl;

import java.util.*;

public class IlIlIlIlIlllllllllIl extends Thread
{
    private String llllIIIIlIIIlIlllIll;
    private Map IlIlIlIlIlllllllllIl;
    private byte[] llIllIIIIIllIlIIIIlI;
    private IIIIlllIIIIIIlIIIlll IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIlIlIlllllllllIl(final String llllIIIIlIIIlIlllIll, final Map ilIlIlIlIlllllllllIl, final byte[] llIllIIIIIllIlIIIIlI, final IIIIlllIIIIIIlIIIlll ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void run() {
        try {
            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI, null);
        }
        catch (Exception ex) {
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI, ex);
        }
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public byte[] IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
