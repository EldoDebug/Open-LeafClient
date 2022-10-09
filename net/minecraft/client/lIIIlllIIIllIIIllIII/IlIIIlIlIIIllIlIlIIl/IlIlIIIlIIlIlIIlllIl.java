package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIlIIlIlIIlllIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private float IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/zombie/zombie.png");
    }
    
    public IlIlIIIlIIlIlIIlllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n, final float ilIlIIIllIllIIIIIllI) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n * ilIlIIIllIllIIIIIllI);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(this));
        this.llllIIIIlIIIlIlllIll(new IlllllllIIIlIIIlIlII(this, this));
    }
    
    @Override
    public void r_() {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.1875f, 0.0f);
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final float n) {
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll;
    }
}
