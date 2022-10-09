package net.optifine.lIIIIlIIIIIlllIllIII;

import java.lang.reflect.*;

public class lIlIlIIIllIIllIIIllI implements llllIIIlIlllIlIIIIIl
{
    private IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private Field llIllIIIIIllIlIIIIlI;
    
    public lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final String s) {
        this(new llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl, s));
    }
    
    public lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class clazz) {
        this(llIIlIIIlIIIllIlIIIl, clazz, 0);
    }
    
    public lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class clazz, final int n) {
        this(new IlIIIlIlIIIllIlIlIIl(llIIlIIIlIIIllIlIIIl, clazz, n));
    }
    
    public lIlIlIIIllIIllIIIllI(final Field field) {
        this(new IlIlIlIlIlllllllllIl(field));
    }
    
    public lIlIlIIIllIIllIIIllI(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = false;
        this.llIllIIIIIllIlIIIIlI = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public Field IlIlIlIlIlllllllllIl() {
        if (this.IlIlIlIlIlllllllllIl) {
            return this.llIllIIIIIllIlIIIIlI;
        }
        this.IlIlIlIlIlllllllllIl = true;
        this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.setAccessible(true);
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public Object llIllIIIIIllIlIIIIlI() {
        return lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((Object)null, this);
    }
    
    public void llllIIIIlIIIlIlllIll(final Object o) {
        lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(null, this, o);
    }
    
    public void llllIIIIlIIIlIlllIll(final Object o, final Object o2) {
        lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(o, this, o2);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl() != null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl();
    }
}
