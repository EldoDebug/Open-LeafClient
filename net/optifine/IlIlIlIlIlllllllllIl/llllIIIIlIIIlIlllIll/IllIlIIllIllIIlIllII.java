package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IllIlIIllIllIIlIllII extends lIIIIlIIIIIlllIllIII
{
    public IllIlIIllIllIIlIllII() {
        super(IIIllllllIllIIIlllIl.class, "slime", 0.25f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IlllIIIIlIIIlIlIlIIl(16);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlllIIIIlIIIlIlIlIIl)) {
            return null;
        }
        final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl = (IlllIIIIlIIIlIlIlIIl)ilIIIlIlIIIllIlIlIIl;
        return (IIlIIIIIllIlIIIlIIll)(s.equals("body") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bZ, 0) : (s.equals("left_eye") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bZ, 1) : (s.equals("right_eye") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bZ, 2) : (s.equals("mouth") ? ((IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bZ, 3)) : null))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "body", "left_eye", "right_eye", "mouth" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        return new lllllIIIIIlIlIIIIIIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl(), ilIIIlIlIIIllIlIlIIl, n);
    }
}
