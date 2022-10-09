package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIIlIlIllllIIlIllI extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/silverfish.png");
    }
    
    public lIIIIlIlIllllIIlIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IIIIIllIIIIlIIIIllIl(), 0.3f);
    }
    
    protected float llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        return 180.0f;
    }
    
    protected lIllllIllIllIIllllll IlIlIlIlIlllllllllIl(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        return lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll;
    }
}
