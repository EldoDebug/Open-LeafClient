package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;

public class IlIIlIlIIIlIIlIlIlII extends IllIIlllIIIIlllIIlIl
{
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    
    static {
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/zombie_pigman.png");
    }
    
    public IlIIlIlIIIlIIlIlIlII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIlIlIIIlIIlIlIlII(), 0.5f, 1.0f);
        this.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(this));
        this.llllIIIIlIIIlIlllIll(new IllIlIIllIllIIlIllII(this, this));
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        return IlIIlIlIIIlIIlIlIlII.IIIlIIIlIlIIlllIIlll;
    }
}
