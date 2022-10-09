package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IlIIlIlIIIlIIlIlIlII extends lIlIlIIIllIIllIIIllI
{
    public IlIIlIlIIIlIIlIlIlII() {
        super(llllllIllIllIlIllllI.class, "skeleton", 0.7f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIIIIIIIIlllIllIlIlI();
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final llIIIlIlllIllIIlIllI llIIIlIlllIllIIlIllI = new llIIIlIlllIllIIlIllI(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI, (IllIIlllIIIIlllIIlIl)illIIlllIIIIlllIIlIl);
        llIIIlIlllIllIIlIllI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        llIIIlIlllIllIIlIllI.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return llIIIlIlllIllIIlIllI;
    }
}
