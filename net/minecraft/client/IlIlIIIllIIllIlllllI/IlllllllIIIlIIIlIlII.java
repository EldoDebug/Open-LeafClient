package net.minecraft.client.IlIlIIIllIIllIlllllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlllllllIIIlIIIlIlII extends IIllIIllIIIlIlIIIIlI
{
    public IlllllllIIIlIIIlIlII(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        super("player_death");
        if (lllIIIIlllllIlIIllIl != null) {
            this.llllIIIIlIIIlIlllIll("player", lllIIIIlllllIlIIllIl.s_());
        }
        if (lllIIIIlllllIlIIllIl2 != null) {
            this.llllIIIIlIIIlIlllIll("killer", lllIIIIlllllIlIIllIl2.s_());
        }
    }
}
