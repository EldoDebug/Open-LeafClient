package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIIlIlllIlIIIIIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/blaze.png");
    }
    
    public llllIIIlIlllIlIIIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl(), 0.5f);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;
    }
}
