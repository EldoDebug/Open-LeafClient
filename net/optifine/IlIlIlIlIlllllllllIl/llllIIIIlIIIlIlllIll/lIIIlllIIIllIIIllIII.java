package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;

public class lIIIlllIIIllIIIllIII extends lIlIlIIIllIIllIIIllI
{
    public lIIIlllIIIllIIIllIII() {
        super(llllIIIIlIIIlIlllIll.class, "armor_stand", 0.0f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll)) {
            return null;
        }
        final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll)ilIIIlIlIIIllIlIlIIl;
        return s.equals("right") ? llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll : (s.equals("left") ? llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl : (s.equals("waist") ? llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI : (s.equals("base") ? llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl : super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return (String[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(super.IllIIlllIIIIlllIIlIl(), new String[] { "right", "left", "waist", "base" });
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return llllIIIIlIIIlIlllIll;
    }
}
