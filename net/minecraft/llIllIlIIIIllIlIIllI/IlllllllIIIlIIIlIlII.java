package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IlllllllIIIlIIIlIlII extends IIllIIIlIIlIlIlIIIII
{
    public IlllllllIIIlIIIlIlII(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll, new String[] { "intact", "slightlyDamaged", "veryDamaged" });
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return n << 2;
    }
}
