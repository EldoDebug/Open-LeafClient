package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

class lIIIIlIIIIIlllIllIII implements IlIlIlIlIlllllllllIl
{
    private lIIIIlIIIIIlllIllIII() {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return new IlIlIIIIIIlllIlIllIl("Close menu");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IlIlIIIllIllIIIIIllI);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 128.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return true;
    }
}
