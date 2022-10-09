package net.minecraft.client.IlIlIIIllIIllIlllllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIlIIlIlIIlllIl extends IIllIIllIIIlIlIIIIlI
{
    public IlIlIIIlIIlIlIIlllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        super("player_combat");
        this.llllIIIIlIIIlIlllIll("player", lllIIIIlllllIlIIllIl.s_());
        if (lllIIIIlllllIlIIllIl2 != null) {
            this.llllIIIIlIIIlIlllIll("primary_opponent", lllIIIIlllllIlIIllIl2.s_());
        }
        if (lllIIIIlllllIlIIllIl2 != null) {
            this.llllIIIIlIIIlIlllIll("Combat between " + lllIIIIlllllIlIIllIl.s_() + " and " + lllIIIIlllllIlIIllIl2.s_());
        }
        else {
            this.llllIIIIlIIIlIlllIll("Combat between " + lllIIIIlllllIlIIllIl.s_() + " and others");
        }
    }
}
