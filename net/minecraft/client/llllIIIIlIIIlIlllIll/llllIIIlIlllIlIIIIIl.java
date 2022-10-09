package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIlIlllIlIIIIIl extends IllIIlllIIIIlllIIlIl
{
    private final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI;
    private float lIlIlIIIllIIllIIIllI;
    
    public llllIIIlIlllIlIIIIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        super(new lIllllIllIllIIllllll("minecraft:minecart.base"));
        this.lIlIlIIIllIIllIIIllI = 0.0f;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIIIIlIIIIIlllIllIII = true;
        this.lIIIlllIIIllIIIllIII = 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.llIllIlIIIIllIlIIllI.IIlIlIlIIlIllIIIIIIl) {
            this.llllIIIIlIIIlIlllIll = true;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = (float)this.llIllIlIIIIllIlIIllI.IIlllIlIIllIlIlIlIIl;
            this.IllIIlllIIIIlllIIlIl = (float)this.llIllIlIIIIllIlIIllI.llIIIlIlIllIIlIlIlII;
            this.llllIIIlIlllIlIIIIIl = (float)this.llIllIlIIIIllIlIIllI.lllllIlIIIlIlIIlllII;
            final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI.lIllllllIIllIlIlIlII * this.llIllIlIIIIllIlIIllI.lIllllllIIllIlIlIlII + this.llIllIlIIIIllIlIIllI.IIlllIIIlIlllIIlllII * this.llIllIlIIIIllIlIIllI.IIlllIIIlIlllIIlllII);
            if (llllIIIIlIIIlIlllIll >= 0.01) {
                this.lIlIlIIIllIIllIIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI + 0.0025f, 0.0f, 1.0f);
                this.llIllIIIIIllIlIIIIlI = 0.0f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0.0f, 0.5f) * 0.7f;
            }
            else {
                this.lIlIlIIIllIIllIIIllI = 0.0f;
                this.llIllIIIIIllIlIIIIlI = 0.0f;
            }
        }
    }
}
