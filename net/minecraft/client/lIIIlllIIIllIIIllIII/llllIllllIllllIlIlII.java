package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llllIllllIllllIlIlII extends llIllIIlllllllllllll
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    public llllIllllIllllIlIlII() {
        this.llllIIIIlIIIlIlllIll = null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        if (liIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl() == 7 && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.I()) {
            liIllIIIllllIlllIllI.lllIIIIlllllIlIIllIl();
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(liIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl());
        }
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI.llllIIIlIlllIlIIIIIl());
        liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
}
