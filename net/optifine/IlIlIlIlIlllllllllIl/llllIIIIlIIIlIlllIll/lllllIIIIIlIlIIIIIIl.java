package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class lllllIIIIIlIlIIIIIIl extends lIIIIlIIIIIlllIllIII
{
    public lllllIIIIIlIlIIIIIIl() {
        super(IIIllllllIllIIIlllIl.class, "wolf", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new llIlIIIIIlIIlIlIIlll();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll)) {
            return null;
        }
        final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = (llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl;
        return (IIlIIIIIllIlIIIlIIll)(s.equals("head") ? llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll : (s.equals("body") ? llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl : (s.equals("leg1") ? llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI : (s.equals("leg2") ? llIlIIIIIlIIlIlIIlll.IlIIIlIlIIIllIlIlIIl : (s.equals("leg3") ? llIlIIIIIlIIlIlIIlll.llIllIlIIIIllIlIIllI : (s.equals("leg4") ? llIlIIIIIlIIlIlIIlll.lIlIlIIIllIIllIIIllI : (s.equals("tail") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ck) : (s.equals("mane") ? ((IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cl)) : null))))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        return new llllIllllIllllIlIlII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl(), ilIIIlIlIIIllIlIlIIl, n);
    }
}
