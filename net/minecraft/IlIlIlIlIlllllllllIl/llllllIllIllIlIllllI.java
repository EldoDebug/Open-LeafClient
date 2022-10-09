package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllllIllIllIlIllllI extends llllIIIIlIIIlIlllIll
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llIllIlIlIIIIIIIllII() || super.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII);
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "seed";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.seed.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.seed.success", new Object[] { ((illIlIIllIllIIlIllII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) ? ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)illIlIIllIllIIlIllII).IlllllllIIIlIIIlIlII : net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(0)).IIlIIIIlllIlllllIlII() }));
    }
}
