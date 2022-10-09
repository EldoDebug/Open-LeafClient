package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

class IllIllIIIIlIIlIlllII extends IlIIIlIlIIIllIlIlIIl
{
    private final boolean llllIIllllIlIlIIIIll;
    
    public IllIllIIIIlIIlIlllII(final int n, final int n2, final int n3, final boolean llllIIllllIlIlIIIIll) {
        super(n, n2, n3, 12, 19, "");
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlIlIlIIlIllIIIIIIl.IllIIlllIIIIlllIIlIl);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            final boolean b = n >= this.lIIIIlIIIIIlllIllIII && n2 >= this.lIIIlllIIIllIIIllIII && n < this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl && n2 < this.lIIIlllIIIllIIIllIII + this.llllIIIlIlllIlIIIIIl;
            int n3 = 0;
            int n4 = 176;
            if (!this.lIlIlIIIllIIllIIIllI) {
                n4 += this.IllIIlllIIIIlllIIlIl * 2;
            }
            else if (b) {
                n4 += this.IllIIlllIIIIlllIIlIl;
            }
            if (!this.llllIIllllIlIlIIIIll) {
                n3 += this.llllIIIlIlllIlIIIIIl;
            }
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, n4, n3, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        }
    }
}
