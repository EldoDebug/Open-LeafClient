package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class lIIIIlIlIllllIIlIllI extends lIIIIlIIIIIlllIllIII
{
    public lIIIIlIlIllllIIlIllI() {
        super(IllIllIlllIllllIIllI.class, "witch", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IlIllllIIlIIlIlIlIll(0.0f);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIllllIIlIIlIlIlIll)) {
            return null;
        }
        final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll = (IlIllllIIlIIlIlIlIll)ilIIIlIlIIIllIlIlIIl;
        return (IIlIIIIIllIlIIIlIIll)(s.equals("mole") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ce) : (s.equals("hat") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cf) : (s.equals("head") ? ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll : (s.equals("body") ? ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl : (s.equals("arms") ? ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI : (s.equals("left_leg") ? ilIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI : (s.equals("right_leg") ? ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl : (s.equals("nose") ? ilIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI : null))))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "mole", "head", "body", "arms", "right_leg", "left_leg", "nose" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl = new lllllIIlIlIIIlIlIIIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        lllllIIlIlIIIlIlIIIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return lllllIIlIlIIIlIlIIIl;
    }
}
