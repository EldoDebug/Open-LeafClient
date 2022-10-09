package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIllllIIIlIIIIIIllIl extends IlIIIlIlIIIllIlIlIIl
{
    private boolean llllIIllllIlIlIIIIll;
    
    public IIllllIIIlIIIIIIllIl(final int n, final int n2, final int n3) {
        super(n, n2, n3, 20, 20, "");
        this.llllIIllllIlIlIIIIll = false;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            final boolean b = n >= this.lIIIIlIIIIIlllIllIII && n2 >= this.lIIIlllIIIllIIIllIII && n < this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl && n2 < this.lIIIlllIIIllIIIllIII + this.llllIIIlIlllIlIIIIIl;
            IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl;
            if (this.llllIIllllIlIlIIIIll) {
                if (!this.lIlIlIIIllIIllIIIllI) {
                    illlIIIIlIIIlIlIlIIl = IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI;
                }
                else if (b) {
                    illlIIIIlIIIlIlIlIIl = IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl;
                }
                else {
                    illlIIIIlIIIlIlIlIIl = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll;
                }
            }
            else if (!this.lIlIlIIIllIIllIIIllI) {
                illlIIIIlIIIlIlIlIIl = IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl;
            }
            else if (b) {
                illlIIIIlIIIlIlIlIIl = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI;
            }
            else {
                illlIIIIlIIIlIlIlIIl = IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl;
            }
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII, illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(), illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(), this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        }
    }
}
