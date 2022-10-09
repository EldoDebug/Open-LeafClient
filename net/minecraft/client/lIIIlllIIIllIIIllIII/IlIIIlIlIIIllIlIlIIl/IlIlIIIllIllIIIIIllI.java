package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIllIllIIIIIllI extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/bat.png");
    }
    
    public IlIlIIIllIllIIIIIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(), 0.25f);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.35f, 0.35f, 0.35f);
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3) {
        if (!llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.3f) * 0.1f, 0.0f);
        }
        else {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.1f, 0.0f);
        }
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3);
    }
}
