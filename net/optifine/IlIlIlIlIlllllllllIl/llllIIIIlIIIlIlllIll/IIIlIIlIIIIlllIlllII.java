package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIIlIIlIIIIlllIlllII extends lIlIlIIIllIIllIIIllI
{
    public IIIlIIlIIIIlllIlllII() {
        super(IlIlIIIllIllIIIIIllI.class, "enderman", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new lllIIIIlllllIlIIllIl(0.0f);
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return iiiIlllIIIIIIlIIIlll;
    }
}
