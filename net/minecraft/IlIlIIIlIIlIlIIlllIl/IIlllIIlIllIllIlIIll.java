package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IIlllIIlIllIllIlIIll extends IlIIIlIlIIIllIlIlIIl implements llIIIllIlIllIllIIIIl
{
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll != null && !this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII && this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII() % 20L == 0L) {
            this.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIIllIlllllI();
            if (this.IlIIIlIlIIIllIlIlIIl instanceof lllIllIIIllllllIllll) {
                ((lllIllIIIllllllIllll)this.IlIIIlIlIIIllIlIlIIl).lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
            }
        }
    }
}
