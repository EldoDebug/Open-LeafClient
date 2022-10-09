package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public abstract class lIlIlIIIllIIllIIIllI extends lIIIIlIIIIIlllIllIII
{
    public lIlIlIIIllIIllIIIllI(final Class clazz, final String s, final float n) {
        super(clazz, s, n);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IllIIlllIIIIlllIIlIl)) {
            return null;
        }
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI : (s.equals("headwear") ? illIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI : (s.equals("body") ? illIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI : (s.equals("left_arm") ? illIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll : (s.equals("right_arm") ? illIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll : (s.equals("left_leg") ? illIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll : (s.equals("right_leg") ? illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII : null))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg" };
    }
}
