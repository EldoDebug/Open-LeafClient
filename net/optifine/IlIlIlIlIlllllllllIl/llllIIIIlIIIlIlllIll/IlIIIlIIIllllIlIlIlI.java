package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IlIIIlIIIllllIlIlIlI extends IIIllllllIllIIIlllIl
{
    public IlIIIlIIIllllIlIlIlI() {
        super(llIIIllIlIllIllIIIIl.class, "spawner_minecart", 0.5f);
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl = new IIlIlIlIIlIllIIIIIIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cs.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIIlIllIIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cs, ilIIIlIlIIIllIlIlIIl);
        ilIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return ilIlIlIIlIllIIIIIIl;
    }
}
