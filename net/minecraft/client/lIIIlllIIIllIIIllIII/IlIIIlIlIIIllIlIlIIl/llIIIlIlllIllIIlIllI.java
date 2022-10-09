package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIIlIlllIllIIlIllI extends IllIIlllIIIIlllIIlIl
{
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    
    static {
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/skeleton/skeleton.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/skeleton/wither_skeleton.png");
    }
    
    public llIIIlIlllIllIIlIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IIIIIIIIIlllIllIlIlI(), 0.5f);
        this.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(this));
        this.llllIIIIlIIIlIlllIll(new IlIIllIIllIIllIIlIIl(this, this));
    }
    
    protected void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final float n) {
        if (llllllIllIllIlIllllI.ao() == 1) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.2f, 1.2f, 1.2f);
        }
    }
    
    @Override
    public void r_() {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.09375f, 0.1875f, 0.0f);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        return (llllllIllIllIlIllllI.ao() == 1) ? llIIIlIlllIllIIlIllI.IlIlIIIlIIlIlIIlllIl : llIIIlIlllIllIIlIllI.IIIlIIIlIlIIlllIIlll;
    }
}
