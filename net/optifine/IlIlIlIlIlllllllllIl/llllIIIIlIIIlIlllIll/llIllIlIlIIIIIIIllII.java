package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public abstract class llIllIlIlIIIIIIIllII extends lIIIIlIIIIIlllIllIII
{
    public llIllIlIlIIIIIIIllII(final Class clazz, final String s, final float n) {
        super(clazz, s, n);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof llIIlllIIlllIIllIllI)) {
            return null;
        }
        final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = (llIIlllIIlllIIllIllI)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll : (s.equals("body") ? llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl : (s.equals("leg1") ? llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI : (s.equals("leg2") ? llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl : (s.equals("leg3") ? llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI : (s.equals("leg4") ? llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI : null)))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "body", "leg1", "leg2", "leg3", "leg4" };
    }
}
