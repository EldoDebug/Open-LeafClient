package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IlIlIIIIIIlllIlIllIl extends lIIIIlIIIIIlllIllIII
{
    public IlIlIIIIIIlllIlIllIl() {
        super(IlIIIlIlIIIllIlIlIIl.class, "chicken", 0.3f);
    }
    
    @Override
    public net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof lIlIlIIIllIIllIIIllI)) {
            return null;
        }
        final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = (lIlIlIIIllIIllIIIllI)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll : (s.equals("body") ? lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl : (s.equals("right_leg") ? lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI : (s.equals("left_leg") ? lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl : (s.equals("right_wing") ? lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI : (s.equals("left_wing") ? lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI : (s.equals("bill") ? lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI : (s.equals("chin") ? lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll : null)))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        return new llIIlIIIlIIIllIlIIIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl(), ilIIIlIlIIIllIlIlIIl, n);
    }
}
