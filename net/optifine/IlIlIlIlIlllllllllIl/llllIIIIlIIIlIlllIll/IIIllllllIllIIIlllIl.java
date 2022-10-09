package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IIIllllllIllIIIlllIl extends lIIIIlIIIIIlllIllIII
{
    public IIIllllllIllIIIlllIl() {
        super(llIllIlIIIIllIlIIllI.class, "minecart", 0.5f);
    }
    
    protected IIIllllllIllIIIlllIl(final Class clazz, final String s, final float n) {
        super(clazz, s, n);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIlllIlIIllIlIlIlIIl();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIlllIlIIllIlIlIlIIl)) {
            return null;
        }
        final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl = (IIlllIlIIllIlIlIlIIl)ilIIIlIlIIIllIlIlIIl;
        return s.equals("bottom") ? illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll[0] : (s.equals("back") ? illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll[1] : (s.equals("front") ? illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll[2] : (s.equals("right") ? illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll[3] : (s.equals("left") ? illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll[4] : (s.equals("dirt") ? illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll[5] : null)))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "bottom", "back", "front", "right", "left", "dirt" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = new llIllIlIlIIIIIIIllII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cs.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cs, ilIIIlIlIIIllIlIlIIl);
        llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return llIllIlIlIIIIIIIllII;
    }
}
