package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IllIIlllllIIllIIllIl extends lIlIlIIIllIIllIIIllI
{
    public IllIIlllllIIllIIllIl() {
        super(llIlIIIIIlIIlIlIIlll.class, "zombie", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IlIIlIlIIIlIIlIlIlII();
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI = new lIIllIIIllllIlllIllI(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, (IllIIlllIIIIlllIIlIl)illIIlllIIIIlllIIlIl);
        liIllIIIllllIlllIllI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return liIllIIIllllIlllIllI;
    }
}
