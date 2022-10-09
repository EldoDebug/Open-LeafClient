package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class llIIIlIlIllIIlIlIlII extends lIIIIlIIIIIlllIllIII
{
    public llIIIlIlIllIIlIlIlII() {
        super(lllIIIIlllllIlIIllIl.class, "guardian", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIllIIllIIIlIlIIIIlI();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIllIIllIIIlIlIIIIlI)) {
            return null;
        }
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = (IIllIIllIIIlIlIIIIlI)ilIIIlIlIIIllIlIlIIl;
        if (s.equals("body")) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bG);
        }
        if (s.equals("eye")) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bH);
        }
        final String s2 = "spine";
        if (s.startsWith(s2)) {
            final IIlIIIIIllIlIIIlIIll[] array = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bI);
            if (array == null) {
                return null;
            }
            int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
            return (--llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length) ? array[llllIIIIlIIIlIlllIll] : null;
        }
        else {
            final String s3 = "tail";
            if (!s.startsWith(s3)) {
                return null;
            }
            final IIlIIIIIllIlIIIlIIll[] array2 = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bJ);
            if (array2 == null) {
                return null;
            }
            int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s3.length()), -1);
            return (--llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll2 < array2.length) ? array2[llllIIIIlIIIlIlllIll2] : null;
        }
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "body", "eye", "spine1", "spine2", "spine3", "spine4", "spine5", "spine6", "spine7", "spine8", "spine9", "spine10", "spine11", "spine12", "tail1", "tail2", "tail3" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII = new IIlIIIIlllIlllllIlII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        ilIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return ilIIIIlllIlllllIlII;
    }
}
