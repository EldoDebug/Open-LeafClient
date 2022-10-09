package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIlllIIIlIlllIIlllII extends lIIIIlIIIIIlllIllIII
{
    public IIlllIIIlIlllIIlllII() {
        super(IlllllllIIIlIIIlIlII.class, "iron_golem", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII)) {
            return null;
        }
        final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll : (s.equals("body") ? illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl : (s.equals("left_arm") ? illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl : (s.equals("right_arm") ? illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI : (s.equals("left_leg") ? illlllllIIIlIIIlIlII.llIllIlIIIIllIlIIllI : (s.equals("right_leg") ? illlllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI : null)))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "body", "right_arm", "left_arm", "left_leg", "right_leg" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = new IlIlIllllllllIIIIlII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        ilIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return ilIlIllllllllIIIIlII;
    }
}
