package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class lllIllIIIllllllIllll extends lIlIlIIIllIIllIIIllI
{
    public lllIllIIIllllllIllll() {
        super(llIIIlIlIllIIlIlIlII.class, "zombie_pigman", 0.5f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IlIIlIlIIIlIIlIlIlII();
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IlIIlIlIIIlIIlIlIlII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII, (IllIIlllIIIIlllIIlIl)illIIlllIIIIlllIIlIl);
        ilIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        ilIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return ilIIlIlIIIlIIlIlIlII;
    }
}
