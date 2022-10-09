package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

class lllllIIllIlIllIllllI extends IlIIIlIlIIIllIlIlIIl
{
    private final boolean llllIIllllIlIlIIIIll;
    
    public lllllIIllIlIllIllllI(final int n, final int n2, final int n3, final boolean llllIIllllIlIlIIIIll) {
        super(n, n2, n3, 23, 13, "");
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            final boolean b = n >= this.lIIIIlIIIIIlllIllIII && n2 >= this.lIIIlllIIIllIIIllIII && n < this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl && n2 < this.lIIIlllIIIllIIIllIII + this.llllIIIlIlllIlIIIIIl;
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl);
            int n3 = 0;
            int n4 = 192;
            if (b) {
                n3 += 23;
            }
            if (!this.llllIIllllIlIlIIIIll) {
                n4 += 13;
            }
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, n3, n4, 23, 13);
        }
    }
}
