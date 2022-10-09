package net.optifine.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;

public class IllIIlllIIIIlllIIlIl extends llIlIIIIIlIIlIlIIlll implements IlIlIIIllIIllIlllllI
{
    private net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llllIIllllIlIlIIIIll;
    
    public IllIIlllIIIIlllIIlIl(final int n, final int n2, final int n3, final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llllIIllllIlIlIIIIll, final String s) {
        super(n, n2, n3, llllIIllllIlIlIIIIll, s);
        this.llllIIllllIlIlIIIIll = null;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    @Override
    public net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIllllIlIlIIIIll;
    }
}
