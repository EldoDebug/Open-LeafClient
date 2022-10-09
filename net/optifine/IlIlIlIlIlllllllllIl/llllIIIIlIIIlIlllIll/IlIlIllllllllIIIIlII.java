package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IlIlIllllllllIIIIlII extends lIIIIlIIIIIlllIllIII
{
    public IlIlIllllllllIIIIlII() {
        super(llIIlIIIlIIIllIlIIIl.class, "endermite", 0.3f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIlllIIlIllIllIlIIll();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIlllIIlIllIllIlIIll)) {
            return null;
        }
        final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = (IIlllIIlIllIllIlIIll)ilIIIlIlIIIllIlIlIIl;
        final String s2 = "body";
        if (!s.startsWith(s2)) {
            return null;
        }
        final IIlIIIIIllIlIIIlIIll[] array = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bB);
        if (array == null) {
            return null;
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
        return (--llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length) ? array[llllIIIIlIIIlIlllIll] : null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "body1", "body2", "body3", "body4" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = new llllIIllllIlIlIIIIll(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return llllIIllllIlIlIIIIll;
    }
}
