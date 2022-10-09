package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IlIllIlIlIIIlIlIlIII extends IIlIIIlllIllIllIlIII
{
    public IlIllIlIlIIIlIlIlIII() {
        super(llIllIIIIIllIlIIIIlI.class, "cave_spider", 0.7f);
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return liiIlllIIIllIIIllIII;
    }
}
