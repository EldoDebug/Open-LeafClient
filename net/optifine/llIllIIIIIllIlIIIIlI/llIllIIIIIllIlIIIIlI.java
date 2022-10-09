package net.optifine.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIlIlllIlIIIIIl
{
    private static final String IllIIlllIIIIlllIIlIl = "/reloadShaders";
    private static final String llllIIIlIlllIlIIIIIl = "/reloadChunks";
    
    public llIllIIIIIllIlIIIIlI(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        super(llllIlIllllIIlIIlIlI.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl));
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final String s) {
        if (this.llllIIIIlIIIlIlllIll(s)) {
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(s);
        }
        else {
            super.IlIlIIIllIllIIIIIllI(s);
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(String trim) {
        if (trim == null) {
            return false;
        }
        trim = trim.trim();
        if (trim.equals("/reloadShaders")) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI();
            }
            return true;
        }
        if (trim.equals("/reloadChunks")) {
            this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
            return true;
        }
        return false;
    }
}
