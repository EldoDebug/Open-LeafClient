package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll extends IllIIlllIIIIlllIIlIl
{
    private final lllIIIIlllllIlIIllIl llIllIlIIIIllIlIIllI;
    
    public llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl llIllIlIIIIllIlIIllI) {
        super(new lIllllIllIllIIllllll("minecraft:mob.guardian.attack"));
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
        this.lIIIIlIIIIIlllIllIII = true;
        this.lIIIlllIIIllIIIllIII = 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (!this.llIllIlIIIIllIlIIllI.IIlIlIlIIlIllIIIIIIl && this.llIllIlIIIIllIlIIllI.ar()) {
            this.IlIlIIIllIllIIIIIllI = (float)this.llIllIlIIIIllIlIIllI.IIlllIlIIllIlIlIlIIl;
            this.IllIIlllIIIIlllIIlIl = (float)this.llIllIlIIIIllIlIIllI.llIIIlIlIllIIlIlIlII;
            this.llllIIIlIlllIlIIIIIl = (float)this.llIllIlIIIIllIlIIllI.lllllIlIIIlIlIIlllII;
            final float ilIllIlIlIIIlIlIlIII = this.llIllIlIIIIllIlIIllI.IlIllIlIlIIIlIlIlIII(0.0f);
            this.llIllIIIIIllIlIIIIlI = 0.0f + 1.0f * ilIllIlIlIIIlIlIlIII * ilIllIlIlIIIlIlIlIII;
            this.IlIIIlIlIIIllIlIlIIl = 0.7f + 0.5f * ilIllIlIlIIIlIlIlIII;
        }
        else {
            this.llllIIIIlIIIlIlllIll = true;
        }
    }
}
