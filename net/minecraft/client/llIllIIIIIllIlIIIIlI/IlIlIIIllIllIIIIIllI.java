package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIlIIIllIllIIIIIllI extends IlIIIlIlIIIllIlIlIIl
{
    public IlIlIIIllIllIIIIIllI(final int n, final int n2, final int n3) {
        super(n, n2, n3, 20, 20, "");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            final boolean b = n >= this.lIIIIlIIIIIlllIllIII && n2 >= this.lIIIlllIIIllIIIllIII && n < this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl && n2 < this.lIIIlllIIIllIIIllIII + this.llllIIIlIlllIlIIIIIl;
            int n3 = 106;
            if (b) {
                n3 += this.llllIIIlIlllIlIIIIIl;
            }
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, 0, n3, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        }
    }
}
