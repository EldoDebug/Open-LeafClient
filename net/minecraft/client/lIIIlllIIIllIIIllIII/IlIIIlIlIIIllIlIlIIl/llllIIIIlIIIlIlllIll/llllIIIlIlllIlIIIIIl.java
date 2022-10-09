package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIIlIlllIlIIIIIl implements IlIllIlIlIIIlIlIlIII
{
    private final lIIlIIIlIllIlIllIIIl llllIIIIlIIIlIlllIll;
    
    public llllIIIlIlllIlIIIIIl(final lIIlIIIlIllIlIllIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (llllIIIIlIIIlIlllIll.s_().equals("deadmau5") && llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl() && !llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII()) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
            for (int i = 0; i < 2; ++i) {
                final float n8 = llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl + (llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll - llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl) * n3 - (llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl + (llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII - llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl) * n3);
                final float n9 = llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI + (llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI - llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI) * n3;
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n8, 0.0f, 1.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n9, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.375f * (i * 2 - 1), 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.375f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n9, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n8, 0.0f, 1.0f, 0.0f);
                final float n10 = 1.3333334f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n10, n10, n10);
                this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl(0.0625f);
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
}
