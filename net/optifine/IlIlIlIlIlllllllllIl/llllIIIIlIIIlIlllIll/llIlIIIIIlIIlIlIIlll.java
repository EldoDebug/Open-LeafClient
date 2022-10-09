package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class llIlIIIIIlIIlIlIIlll extends lIIIIlIIIIIlllIllIII
{
    public llIlIIIIIlIIlIlIIlll() {
        super(llIIlllIIlllIIllIllI.class, "silverfish", 0.3f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIIIIllIIIIlIIIIllIl();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIIIIllIIIIlIIIIllIl)) {
            return null;
        }
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = (IIIIIllIIIIlIIIIllIl)ilIIIlIlIIIllIlIlIIl;
        final String s2 = "body";
        if (s.startsWith(s2)) {
            final IIlIIIIIllIlIIIlIIll[] array = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bW);
            if (array == null) {
                return null;
            }
            int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
            return (--llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length) ? array[llllIIIIlIIIlIlllIll] : null;
        }
        else {
            final String s3 = "wing";
            if (!s.startsWith(s3)) {
                return null;
            }
            final IIlIIIIIllIlIIIlIIll[] array2 = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bX);
            if (array2 == null) {
                return null;
            }
            int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s3.length()), -1);
            return (--llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll2 < array2.length) ? array2[llllIIIIlIIIlIlllIll2] : null;
        }
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "body1", "body2", "body3", "body4", "body5", "body6", "body7", "wing1", "wing2", "wing3" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final lIIIIlIlIllllIIlIllI liiiIlIlIllllIIlIllI = new lIIIIlIlIllllIIlIllI(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        liiiIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        liiiIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return liiiIlIlIllllIIlIllI;
    }
}
