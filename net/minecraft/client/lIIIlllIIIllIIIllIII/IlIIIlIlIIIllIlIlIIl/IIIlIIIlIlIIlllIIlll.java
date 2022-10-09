package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIlIIIlIlIIlllIIlll extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/ghast/ghast.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/ghast/ghast_shooting.png");
    }
    
    public IIIlIIIlIlIIlllIIlll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IlIlIIIIIIlllIlIllIl(), 0.5f);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        return llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII() ? IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI : IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll;
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final float n) {
        final float n2 = 1.0f;
        final float n3 = (8.0f + n2) / 2.0f;
        final float n4 = (8.0f + 1.0f / n2) / 2.0f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n4, n3, n4);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
    }
}
