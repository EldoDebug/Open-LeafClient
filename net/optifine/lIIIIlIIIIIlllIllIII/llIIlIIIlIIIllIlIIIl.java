package net.optifine.lIIIIlIIIIIlllIllIII;

import net.optifine.*;

public class llIIlIIIlIIIllIlIIIl implements llllIIIlIlllIlIIIIIl
{
    private String llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private Class llIllIIIIIllIlIIIIlI;
    
    public llIIlIIIlIIIllIlIIIl(final String llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = false;
        this.llIllIIIIIllIlIIIIlI = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public llIIlIIIlIIIllIlIIIl(final Class llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = false;
        this.llIllIIIIIllIlIIIIlI = null;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.getName();
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    public Class IlIlIlIlIlllllllllIl() {
        if (this.IlIlIlIlIlllllllllIl) {
            return this.llIllIIIIIllIlIIIIlI;
        }
        this.IlIlIlIlIlllllllllIl = true;
        try {
            this.llIllIIIIIllIlIIIIlI = Class.forName(this.llllIIIIlIIIlIlllIll);
        }
        catch (ClassNotFoundException ex) {
            IIlIIIlllIllIllIlIII.IlIlIIIllIllIIIIIllI("(Reflector) Class not present: " + this.llllIIIIlIIIlIlllIll);
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl() != null;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final Object o) {
        return this.IlIlIlIlIlllllllllIl() != null && this.IlIlIlIlIlllllllllIl().isInstance(o);
    }
    
    public lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final String s) {
        return new lIlIlIIIllIIllIIIllI(this, s);
    }
    
    public llllIIllllIlIlIIIIll IlIlIlIlIlllllllllIl(final String s) {
        return new llllIIllllIlIlIIIIll(this, s);
    }
    
    public llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final String s, final Class[] array) {
        return new llllIIllllIlIlIIIIll(this, s, array);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl();
    }
}
