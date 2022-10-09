package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class llIIIIIIlIllIIlIIIll extends lIIIIlIIIIIlllIllIII
{
    public llIIIIIIlIllIIlIIIll() {
        super(IlIlIllllllllIIIIlII.class, "villager", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IllIllIIIIlIIlIlllII(0.0f);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IllIllIIIIlIIlIlllII)) {
            return null;
        }
        final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII = (IllIllIIIIlIIlIlllII)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? illIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll : (s.equals("body") ? illIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl : (s.equals("arms") ? illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI : (s.equals("left_leg") ? illIllIIIIlIIlIlllII.llIllIlIIIIllIlIIllI : (s.equals("right_leg") ? illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl : (s.equals("nose") ? illIllIIIIlIIlIlllII.lIlIlIIIllIIllIIIllI : null)))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "body", "arms", "right_leg", "left_leg", "nose" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll = new IlIIlllllIIllIIlllll(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        ilIIlllllIIllIIlllll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        ilIIlllllIIllIIlllll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return ilIIlllllIIllIIlllll;
    }
}
