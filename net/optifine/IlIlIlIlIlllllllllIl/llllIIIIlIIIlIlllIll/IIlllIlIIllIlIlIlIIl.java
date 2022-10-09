package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIlllIlIIllIlIlIlIIl extends lIIIIlIIIIIlllIllIII
{
    public IIlllIlIIllIlIlIlIIl() {
        super(llIllIlIIIIllIlIIllI.class, "ghast", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IlIlIIIIIIlllIlIllIl();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIlIIIIIIlllIlIllIl)) {
            return null;
        }
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = (IlIlIIIIIIlllIlIllIl)ilIIIlIlIIIllIlIlIIl;
        if (s.equals("body")) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bD);
        }
        final String s2 = "tentacle";
        if (!s.startsWith(s2)) {
            return null;
        }
        final IIlIIIIIllIlIIIlIIll[] array = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bE);
        if (array == null) {
            return null;
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
        return (--llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length) ? array[llllIIIIlIIIlIlllIll] : null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = new IIIlIIIlIlIIlllIIlll(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        iiIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return iiIlIIIlIlIIlllIIlll;
    }
}
