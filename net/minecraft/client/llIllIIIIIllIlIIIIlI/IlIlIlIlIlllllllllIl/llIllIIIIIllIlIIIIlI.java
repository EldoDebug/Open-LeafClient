package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

class llIllIIIIIllIlIIIIlI extends IlIIIlIlIIIllIlIlIIl
{
    private final lIllllIllIllIIllllll llllIIllllIlIlIIIIll;
    private final int IlIllIlIlIIIlIlIlIII;
    private final int IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    
    protected llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final lIllllIllIllIIllllll llllIIllllIlIlIIIIll, final int ilIllIlIlIIIlIlIlIII, final int iIlllIIlIllIllIlIIll) {
        super(n, n2, n3, 22, 22, "");
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.IIIIlllIIIIIIlIIIlll = (n >= this.lIIIIlIIIIIlllIllIII && n2 >= this.lIIIlllIIIllIIIllIII && n < this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl && n2 < this.lIIIlllIIIllIIIllIII + this.llllIIIlIlllIlIIIIIl);
            final int n3 = 219;
            int n4 = 0;
            if (!this.lIlIlIIIllIIllIIIllI) {
                n4 += this.IllIIlllIIIIlllIIlIl * 2;
            }
            else if (this.lllIIIIlllllIlIIllIl) {
                n4 += this.IllIIlllIIIIlllIIlIl * 1;
            }
            else if (this.IIIIlllIIIIIIlIIIlll) {
                n4 += this.IllIIlllIIIIlllIIlIl * 3;
            }
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, n4, n3, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
            if (!net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.equals(this.llllIIllllIlIlIIIIll)) {
                minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll);
            }
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + 2, this.lIIIlllIIIllIIIllIII + 2, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, 18, 18);
        }
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean lllIIIIlllllIlIIllIl) {
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
    }
}
