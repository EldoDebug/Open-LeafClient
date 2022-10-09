package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlllIIlIllIllIlIIll implements IlIllIlIlIIIlIlIlIII
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final llIlIIIIIlIIlIlIIlll IlIlIlIlIlllllllllIl;
    private final lllllIlIIIlIlIIlllII llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/pig/pig_saddle.png");
    }
    
    public IIlllIIlIllIllIlIIll(final llIlIIIIIlIIlIlIIlll ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = new lllllIlIIIlIlIIlllII(0.5f);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (llIllIlIIIIllIlIIllI.aq()) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, n, n2, n4, n5, n6, n7);
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
