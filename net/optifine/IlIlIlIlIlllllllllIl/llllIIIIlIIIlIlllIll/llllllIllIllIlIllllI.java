package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class llllllIllIllIlIllllI extends lIIIIlIIIIIlllIllIII
{
    public llllllIllIllIlIllllI() {
        super(IlIlIllllllllIIIIlII.class, "magma_cube", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIlIllllllllIIIIlII();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIlIllllllllIIIIlII)) {
            return null;
        }
        final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIlIllllllllIIIIlII)ilIIIlIlIIIllIlIlIIl;
        if (s.equals("core")) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bP);
        }
        final String s2 = "segment";
        if (!s.startsWith(s2)) {
            return null;
        }
        final IIlIIIIIllIlIIIlIIll[] array = (IIlIIIIIllIlIIIlIIll[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bQ);
        if (array == null) {
            return null;
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
        return (--llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length) ? array[llllIIIIlIIIlIlllIll] : null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "core", "segment1", "segment2", "segment3", "segment4", "segment5", "segment6", "segment7", "segment8" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl = new IlllIIIIlIIIlIlIlIIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        illlIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        illlIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return illlIIIIlIIIlIlIlIIl;
    }
}
