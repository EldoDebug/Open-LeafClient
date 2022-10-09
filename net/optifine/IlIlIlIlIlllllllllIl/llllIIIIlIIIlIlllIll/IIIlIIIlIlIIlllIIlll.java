package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIIlIIIlIlIIlllIIlll extends lIIIIlIIIIIlllIllIII
{
    public IIIlIIIlIlIIlllIIlll() {
        super(IlIIIlIlIIIllIlIlIIl.class, "creeper", 0.5f);
    }
    
    @Override
    public net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIIIlllIIIIIIlIIIlll();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIIIlllIIIIIIlIIIlll)) {
            return null;
        }
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (IIIIlllIIIIIIlIIIlll)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll : (s.equals("armor") ? iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl : (s.equals("body") ? iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI : (s.equals("leg1") ? iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl : (s.equals("leg2") ? iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI : (s.equals("leg3") ? iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI : (s.equals("leg4") ? iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI : null))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "armor", "body", "leg1", "leg2", "leg3", "leg4" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = new lIlIlIIIllIIllIIIllI(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return lIlIlIIIllIIllIIIllI;
    }
}
