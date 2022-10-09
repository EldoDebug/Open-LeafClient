package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import leaf.*;

public class IIlllIIIllIllIIlIlIl extends IIIIIIIllllIlIIIIIII
{
    private final llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI;
    
    public IIlllIIIllIllIIlIlIl(final llllIIIIlIIIlIlllIll ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = 0.0f;
        this.IlIlIlIlIlllllllllIl = 0.0f;
        if (this.IlIlIIIllIllIIIIIllI.IIlIIIlllIllIllIlIII.IlIIIlIlIIIllIlIlIIl()) {
            ++this.IlIlIlIlIlllllllllIl;
        }
        if (this.IlIlIIIllIllIIIIIllI.llIIIIIIlIllIIlIIIll.IlIIIlIlIIIllIlIlIIl()) {
            --this.IlIlIlIlIlllllllllIl;
        }
        if (this.IlIlIIIllIllIIIIIllI.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl()) {
            ++this.llllIIIIlIIIlIlllIll;
        }
        if (this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl()) {
            --this.llllIIIIlIIIlIlllIll;
        }
        this.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI.llIIIlIlllIllIIlIllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIIIlIlIIIllIlIlIIl = Leaf.instance.modManager.toggleSprintMod.IIIIlllIIIIIIlIIIlll();
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll *= (float)0.3;
            this.IlIlIlIlIlllllllllIl *= (float)0.3;
        }
    }
}
