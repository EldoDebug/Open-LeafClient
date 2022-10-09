package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;

public class IIlIIIIlllIlllllIlII extends lIIIIlIIIIIlllIllIII
{
    public IIlIIIIlllIlllllIlII() {
        this("end_crystal");
    }
    
    protected IIlIIIIlllIlllllIlII(final String s) {
        super(llIllIIIIIllIlIIIIlI.class, s, 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IlIllIlIlIIIlIlIlIII(0.0f, true);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIllIlIlIIIlIlIlIII)) {
            return null;
        }
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)ilIIIlIlIIIllIlIlIIl;
        return (IIlIIIIIllIlIIIlIIll)(s.equals("cube") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bx, 0) : (s.equals("glass") ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bx, 1) : (s.equals("base") ? ((IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bx, 2)) : null)));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "cube", "glass", "base" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl().IlIIIlIlIIIllIlIlIIl().get(llIllIIIIIllIlIIIIlI.class);
        if (!(llIllIIIIIllIlIIIIlI2 instanceof llllIIIIlIIIlIlllIll)) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Not an instance of RenderEnderCrystal: " + llIllIIIIIllIlIIIIlI2);
            return null;
        }
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI2;
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bz.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: RenderEnderCrystal.modelEnderCrystal");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bz, ilIIIlIlIIIllIlIlIIl);
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return llllIIIIlIIIlIlllIll;
    }
}
