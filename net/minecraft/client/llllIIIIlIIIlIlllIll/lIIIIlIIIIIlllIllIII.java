package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIlIIIIIlllIllIII extends IllIIlllIIIIlllIIlIl
{
    private final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI;
    private final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI lIlIlIIIllIIllIIIllI;
    
    public lIIIIlIIIIIlllIllIII(final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI lIlIlIIIllIIllIIIllI) {
        super(new lIllllIllIllIIllllll("minecraft:minecart.inside"));
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
        this.lIIIIlIIIIIlllIllIII = true;
        this.lIIIlllIIIllIIIllIII = 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (!this.lIlIlIIIllIIllIIIllI.IIlIlIlIIlIllIIIIIIl && this.llIllIlIIIIllIlIIllI.IIllIIIlIIIIlIIlIIII() && this.llIllIlIIIIllIlIIllI.IIIlIIIlIlIIlllIIlll == this.lIlIlIIIllIIllIIIllI) {
            final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI.lIllllllIIllIlIlIlII * this.lIlIlIIIllIIllIIIllI.lIllllllIIllIlIlIlII + this.lIlIlIIIllIIllIIIllI.IIlllIIIlIlllIIlllII * this.lIlIlIIIllIIllIIIllI.IIlllIIIlIlllIIlllII);
            if (llllIIIIlIIIlIlllIll >= 0.01) {
                this.llIllIIIIIllIlIIIIlI = 0.0f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0.0f, 1.0f) * 0.75f;
            }
            else {
                this.llIllIIIIIllIlIIIIlI = 0.0f;
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll = true;
        }
    }
}
