package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import leaf.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public class lIlIlIIIllIIllIIIllI implements IlIllIlIlIIIlIlIlIII
{
    private final IIllIIIlIIlIlIlIIIII llllIIIIlIIIlIlllIll;
    
    public lIlIlIIIllIIllIIIllI(final IIllIIIlIIlIlIlIIIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        lllIIIIlIlIllIIlIIIl n8 = lllIIIIlllllIlIIllIl.n();
        if (n8 != null) {
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIlIlllIlIIIIIl) {
                final float n9 = 0.5f;
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.625f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-20.0f, -1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n9, n9, n9);
            }
            ((IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()).llllIIIIlIIIlIlllIll(0.0625f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.0625f, 0.4375f, 0.0625f);
            if (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll && ((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).Q != null) {
                n8 = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll, 0);
            }
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = n8.llllIIIIlIIIlIlllIll();
            final Minecraft minecraft = Minecraft.getMinecraft();
            if (llllIIIIlIIIlIlllIll instanceof IIlllIIIlIlllIIlllII && net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll).llIllIlIIIIllIlIIllI() == 2) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.1875f, -0.3125f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(20.0f, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(45.0f, 0.0f, 1.0f, 0.0f);
                final float n10 = 0.375f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-n10, -n10, n10);
            }
            if (lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl()) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.203125f, 0.0f);
            }
            if (Leaf.instance.modManager.oldAnimationMod.lIlIlIIIllIIllIIIllI() && lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll && ((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).k()) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-60.0f, 0.0f, 0.0f, 1.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-25.0f, 0.0f, 1.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(10.0f, 1.0f, 0.0f, 0.0f);
                if (lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl()) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 0.1f);
                }
            }
            minecraft.lIllIIIIIlllIIlIIllI().llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n8, IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
