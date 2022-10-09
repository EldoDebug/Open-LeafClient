package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;

public class IlllIIIIlIIIlIlIlIIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "toggledownfall";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.downfall.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        this.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.downfall.success", new Object[0]);
    }
    
    protected void IlIIIlIlIIIllIlIlIIl() {
        final llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[0].lIllllllIIllIlIlIlII();
        lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl(!lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll());
    }
}
