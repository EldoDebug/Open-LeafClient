package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIIlllIIIIIIlIIIlll implements IlIllIlIlIIIlIlIlIII
{
    private final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll;
    
    public IIIIlllIIIIIIlIIIlll(final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (illlllllIIIlIIIlIlII.ao() != 0) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl = Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl();
            lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(5.0f + 180.0f * ((net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII)this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl / 3.1415927f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.9375f, -0.625f, -0.9375f);
            final float n8 = 0.5f;
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n8, -n8, n8);
            final int a_ = illlllllIIIlIIIlIlII.a_(n3);
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll.lllIllIIIllllllIllll(), 1.0f);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
