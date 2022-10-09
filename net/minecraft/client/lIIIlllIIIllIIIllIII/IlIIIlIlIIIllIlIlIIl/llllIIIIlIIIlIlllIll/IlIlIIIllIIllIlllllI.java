package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIlIIIllIIllIlllllI implements IlIllIlIlIIIlIlIlIII
{
    private final lllllIIlIlIIIlIlIIIl llllIIIIlIIIlIlllIll;
    
    public IlIlIIIllIIllIlllllI(final lllllIIlIlIIIlIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final lllIIIIlIlIllIIlIIIl n8 = illIllIlllIllllIIllI.n();
        if (n8 != null) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIlIlllIlIIIIIl) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.625f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-20.0f, -1.0f, 0.0f, 0.0f);
                final float n9 = 0.5f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n9, n9, n9);
            }
            ((IlIllllIIlIIlIlIlIll)this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()).lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(0.0625f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.0625f, 0.53125f, 0.21875f);
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = n8.llllIIIIlIIIlIlllIll();
            final Minecraft minecraft = Minecraft.getMinecraft();
            if (llllIIIIlIIIlIlllIll instanceof IIlllIIIlIlllIIlllII && minecraft.IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), n8.lIIIIlIIIIIlllIllIII())) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0625f, -0.25f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(30.0f, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-5.0f, 0.0f, 1.0f, 0.0f);
                final float n10 = 0.375f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n10, -n10, n10);
            }
            else if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.125f, -0.125f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-45.0f, 0.0f, 1.0f, 0.0f);
                final float n11 = 0.625f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n11, -n11, n11);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-100.0f, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-20.0f, 0.0f, 1.0f, 0.0f);
            }
            else if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl()) {
                if (llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl()) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 0.0f, 1.0f);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.0625f, 0.0f);
                }
                this.llllIIIIlIIIlIlllIll.r_();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0625f, -0.125f, 0.0f);
                final float n12 = 0.625f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n12, -n12, n12);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 1.0f, 0.0f);
            }
            else {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.1875f, 0.1875f, 0.0f);
                final float n13 = 0.875f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n13, n13, n13);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-20.0f, 0.0f, 0.0f, 1.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-60.0f, 1.0f, 0.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-30.0f, 0.0f, 0.0f, 1.0f);
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-15.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(40.0f, 0.0f, 0.0f, 1.0f);
            minecraft.lIllIIIIIlllIIlIIllI().llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, n8, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
