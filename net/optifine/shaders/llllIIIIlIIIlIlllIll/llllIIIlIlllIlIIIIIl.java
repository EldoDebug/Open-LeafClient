package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llllIIIlIlllIlIIIIIl extends IllIIlllIIIIlllIIlIl
{
    public static final String[] llllIIIIlIIIlIlllIll;
    public static final String[] IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new String[] { "default", "fast", "fancy", "off" };
        IlIlIlIlIlllllllllIl = new String[] { "Default", "Fast", "Fancy", "OFF" };
    }
    
    public llllIIIlIlllIlIIIIIl(final String s, final String s2, final int n) {
        super(s, llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, s2, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, n);
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
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.llllIIIIlIIIlIlllIll() == 3;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(String s) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, (Object)"none")) {
            s = "off";
        }
        return super.llllIIIIlIIIlIlllIll(s);
    }
}
