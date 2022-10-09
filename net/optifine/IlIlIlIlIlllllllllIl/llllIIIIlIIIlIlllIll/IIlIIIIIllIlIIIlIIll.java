package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IIlIIIIIllIlIIIlIIll extends lIIIIlIIIIIlllIllIII
{
    public IIlIIIIIllIlIIIlIIll() {
        super(IlIlIIIllIIllIlllllI.class, "lead_knot", 0.0f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIIlIIlIIIIlllIlllII();
    }
    
    @Override
    public net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIIlIIlIIIIlllIlllII)) {
            return null;
        }
        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)ilIIIlIlIIIllIlIlIIl;
        return s.equals("knot") ? iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll : null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "knot" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = new IIIIIllIIIIlIIIIllIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bN.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: RenderLeashKnot.leashKnotModel");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bN, ilIIIlIlIIIllIlIlIIl);
        iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return iiiiIllIIIIlIIIIllIl;
    }
}
