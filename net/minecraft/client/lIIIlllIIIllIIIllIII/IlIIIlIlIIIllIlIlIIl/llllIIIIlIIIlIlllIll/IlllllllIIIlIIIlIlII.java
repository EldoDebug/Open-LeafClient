package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlllllllIIIlIIIlIlII implements IlIllIlIlIIIlIlIlIII
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final IIlllllIllIllIlIlIII IlIlIlIlIlllllllllIl;
    private final IllIllIlllIllllIIllI llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/wither/wither_armor.png");
    }
    
    public IlllllllIIIlIIIlIlII(final IIlllllIllIllIlIlIII ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = new IllIllIlllIllllIIllI(0.5f);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (ilIIIlIlIIIllIlIlIIl.ao()) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(!ilIIIlIlIIIllIlIlIIl.IIIIIIIllllIlIIIIIII());
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            final float n8 = ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIlIIIIIIl + n3;
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n8 * 0.02f) * 3.0f, n8 * 0.01f, 0.0f);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            final float n9 = 0.5f;
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n9, n9, n9, 1.0f);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1, 1);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, n2, n3);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, n2, n4, n5, n6, n7);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
