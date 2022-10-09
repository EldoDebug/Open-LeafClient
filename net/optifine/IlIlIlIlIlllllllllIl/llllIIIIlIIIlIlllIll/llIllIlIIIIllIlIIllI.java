package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;

public class llIllIlIIIIllIlIIllI extends lIIIIlIIIIIlllIllIII
{
    public llIllIlIIIIllIlIIllI() {
        super(llIllIIIIIllIlIIIIlI.class, "bat", 0.25f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIlIIIllIllIIIIIllI)) {
            return null;
        }
        final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = (IlIlIIIllIllIIIIIllI)ilIIIlIlIIIllIlIlIIl;
        return (IIlIIIIIllIlIIIlIIll)(s.equals("head") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bn, 0) : (s.equals("body") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bn, 1) : (s.equals("right_wing") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bn, 2) : (s.equals("left_wing") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bn, 3) : (s.equals("outer_right_wing") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bn, 4) : (s.equals("outer_left_wing") ? ((IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bn, 5)) : null))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return ilIlIIIllIllIIIIIllI;
    }
}
