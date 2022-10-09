package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.optifine.*;

public class lIIIIlIIIIIlllIllIII extends IllIIlllIIIIlllIIlIl
{
    public static final String[] llllIIIIlIIIlIlllIll;
    public static final String[] IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new String[] { "default", "true", "false" };
        IlIlIlIlIlllllllllIl = new String[] { "Default", "ON", "OFF" };
    }
    
    public lIIIIlIIIIIlllIllIII(final String s, final String s2, final int n) {
        super(s, lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, s2, lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, n);
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl() ? IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl() : (this.lIIIIlIIIIIlllIllIII() ? IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl() : (this.lIIIlllIIIllIIIllIII() ? IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI() : super.IlIlIlIlIlllllllllIl()));
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll() == 0;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll() == 1;
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.llllIIIIlIIIlIlllIll() == 2;
    }
}
