package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

class lIIIlllIIIllIIIllIII implements IlIlIlIlIlllllllllIl
{
    private final int llllIIIIlIIIlIlllIll;
    private final boolean IlIlIlIlIlllllllllIl;
    
    public lIIIlllIIIllIIIllIII(final int llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return (this.llllIIIIlIIIlIlllIll < 0) ? new IlIlIIIIIIlllIlIllIl("Previous Page") : new IlIlIIIIIIlllIlIllIl("Next Page");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IlIlIIIllIllIIIIIllI);
        if (this.llllIIIIlIIIlIlllIll < 0) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
        else {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
