package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IlIIllIIllIIllIIlIIl extends lIIIIlIIIIIlllIllIII
{
    public IlIIllIIllIIllIIlIIl() {
        super(llIIlIIIlIIIllIlIIIl.class, "wither_skull", 0.0f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIllllIIIlIIIIIIllIl();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIllllIIIlIIIIIIllIl)) {
            return null;
        }
        final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = (IIllllIIIlIIIIIIllIl)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll : null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = new llIllIIIIIllIlIIIIlI(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cu.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: RenderWitherSkull_model");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cu, ilIIIlIlIIIllIlIlIIl);
        llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return llIllIIIIIllIlIIIIlI2;
    }
}
