package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;

public class IlIlIIIllIIllIlllllI extends lIIIIlIIIIIlllIllIII
{
    public IlIlIIIllIIllIlllllI() {
        super(llllIIIIlIIIlIlllIll.class, "blaze", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof llllIIIlIlllIlIIIIIl)) {
            return null;
        }
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = (llllIIIlIlllIlIIIIIl)ilIIIlIlIIIllIlIlIIl;
        if (s.equals("head")) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bp);
        }
        final String s2 = "stick";
        if (!s.startsWith(s2)) {
            return null;
        }
        final IIlIIIIIllIlIIIlIIll[] array = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bq);
        if (array == null) {
            return null;
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
        return (--llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length) ? array[llllIIIIlIIIlIlllIll] : null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12" };
    }
    
    @Override
    public net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return llllIIIlIlllIlIIIIIl;
    }
}
