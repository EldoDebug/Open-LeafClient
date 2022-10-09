package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IIIIlllIIIIIIlIIIlll extends lIIIIlIIIIIlllIllIII
{
    public IIIIlllIIIIIIlIIIlll() {
        super(IlIlIlIlIlllllllllIl.class, "boat", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII)) {
            return null;
        }
        final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII)ilIIIlIlIIIllIlIlIIl;
        return s.equals("bottom") ? liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[0] : (s.equals("back") ? liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[1] : (s.equals("front") ? liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[2] : (s.equals("right") ? liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[3] : (s.equals("left") ? liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[4] : null))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "bottom", "back", "front", "right", "left" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cq.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: RenderBoat.modelBoat");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cq, ilIIIlIlIIIllIlIlIIl);
        liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return liiiIlIIIIIlllIllIII;
    }
}
