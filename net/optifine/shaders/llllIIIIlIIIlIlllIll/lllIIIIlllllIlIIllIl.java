package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.optifine.shaders.*;

public class lllIIIIlllllIlIIllIl extends IIIIlllIIIIIIlIIIlll
{
    public lllIIIIlllllIlIIllIl(final String s) {
        super(s, null, null, new String[0], null, null);
    }
    
    @Override
    public String IlIlIIIllIIllIlllllI() {
        return llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("screen." + this.llllIIIIlIIIlIlllIll(), this.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("screen." + this.llllIIIIlIIIlIlllIll() + ".comment", null);
    }
}
