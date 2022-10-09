package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIllllIIlIIlIlIlIll extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/cat/black.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/cat/ocelot.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/cat/red.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/cat/siamese.png");
    }
    
    public IlIllllIIlIIlIlIlIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        switch (llIIlIIIlIIIllIlIIIl.aq()) {
            default: {
                return IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
            }
            case 1: {
                return IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll;
            }
            case 2: {
                return IlIllllIIlIIlIlIlIll.IIIlIIIlIlIIlllIIlll;
            }
            case 3: {
                return IlIllllIIlIIlIlIlIll.IlIlIIIlIIlIlIIlllIl;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n) {
        super.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, n);
        if (llIIlIIIlIIIllIlIIIl.as()) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.8f, 0.8f, 0.8f);
        }
    }
}
