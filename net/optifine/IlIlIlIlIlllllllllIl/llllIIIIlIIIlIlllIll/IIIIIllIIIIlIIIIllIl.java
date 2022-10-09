package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IIIIIllIIIIlIIIIllIl extends IIIllllllIllIIIlllIl
{
    public IIIIIllIIIIlIIIIllIl() {
        super(lllIIIIlllllIlIIllIl.class, "tnt_minecart", 0.5f);
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII = new IIlllIIlllIIIlIlllII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cs.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cs, ilIIIlIlIIIllIlIlIIl);
        illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return illlIIlllIIIlIlllII;
    }
}
