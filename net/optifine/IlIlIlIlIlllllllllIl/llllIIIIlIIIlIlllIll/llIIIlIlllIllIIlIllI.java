package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class llIIIlIlllIllIIlIllI extends lIIIIlIIIIIlllIllIII
{
    public llIIIlIlllIllIIlIllI() {
        super(IlIIIlIlIIIllIlIlIIl.class, "wither", 0.5f);
    }
    
    @Override
    public net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IllIllIlllIllllIIllI(0.0f);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IllIllIlllIllllIIllI)) {
            return null;
        }
        final IllIllIlllIllllIIllI illIllIlllIllllIIllI = (IllIllIlllIllllIIllI)ilIIIlIlIIIllIlIlIIl;
        final String s2 = "body";
        if (s.startsWith(s2)) {
            final IIlIIIIIllIlIIIlIIll[] array = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ch);
            if (array == null) {
                return null;
            }
            int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
            return (--llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length) ? array[llllIIIIlIIIlIlllIll] : null;
        }
        else {
            final String s3 = "head";
            if (!s.startsWith(s3)) {
                return null;
            }
            final IIlIIIIIllIlIIIlIIll[] array2 = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ci);
            if (array2 == null) {
                return null;
            }
            int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s3.length()), -1);
            return (--llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll2 < array2.length) ? array2[llllIIIIlIIIlIlllIll2] : null;
        }
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "body1", "body2", "body3", "head1", "head2", "head3" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IIlllllIllIllIlIlIII illlllIllIllIlIlIII = new IIlllllIllIllIlIlIII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        illlllIllIllIlIlIII.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        illlllIllIllIlIlIII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return illlllIllIllIlIlIII;
    }
}
