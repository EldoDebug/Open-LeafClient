package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class lIIlIIIlIllIlIllIIIl extends lIIIIlIIIIIlllIllIII
{
    public lIIlIIIlIllIlIllIIIl() {
        super(lllIllIIIllllllIllll.class, "snow_golem", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll)) {
            return null;
        }
        final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll lllIllIIIllllllIllll = (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll)ilIIIlIlIIIllIlIlIIl;
        return s.equals("body") ? lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll : (s.equals("body_bottom") ? lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl : (s.equals("head") ? lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI : (s.equals("left_hand") ? lllIllIIIllllllIllll.llIllIlIIIIllIlIIllI : (s.equals("right_hand") ? lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl : null))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "body", "body_bottom", "head", "right_hand", "left_hand" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IllIIlllllIIllIIllIl illIIlllllIIllIIllIl = new IllIIlllllIIllIIllIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        illIIlllllIIllIIllIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        illIIlllllIIllIIllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return illIIlllllIIllIIllIl;
    }
}
