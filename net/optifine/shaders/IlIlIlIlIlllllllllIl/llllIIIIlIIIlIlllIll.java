package net.optifine.shaders.IlIlIlIlIlllllllllIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llllIIIIlIIIlIlllIll extends IlIIIlIlIIIllIlIlIIl
{
    public llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super(n, n2, n3, 22, 20, "");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            super.llllIIIIlIIIlIlllIll(minecraft, n, n2);
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("optifine/textures/icons.png"));
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + 3, this.lIIIlllIIIllIIIllIII + 2, 0, 0, 16, 16);
        }
    }
}
