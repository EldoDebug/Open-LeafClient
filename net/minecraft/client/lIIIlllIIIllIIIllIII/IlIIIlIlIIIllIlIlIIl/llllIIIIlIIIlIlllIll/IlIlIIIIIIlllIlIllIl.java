package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIIIIlllIlIllIl implements IlIllIlIlIIIlIlIlIII
{
    private final lllllIIIIIlIlIIIIIIl llllIIIIlIIIlIlllIll;
    private final IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    
    public IlIlIIIIIIlllIlIllIl(final lllllIIIIIlIlIIIIIIl llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = new IlllIIIIlIIIlIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!iiIllllllIllIIIlllIl.IIIIIIIllllIlIIIIIII()) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl, n, n2, n4, n5, n6, n7);
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
}
