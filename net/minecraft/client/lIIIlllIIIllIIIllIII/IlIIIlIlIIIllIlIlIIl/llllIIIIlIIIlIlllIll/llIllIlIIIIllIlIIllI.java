package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIllIlIIIIllIlIIllI implements IlIllIlIlIIIlIlIlIII
{
    private final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
    
    public llIllIlIIIIllIlIIllI(final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final llIIlIIIlIIIllIlIIIl ao = ilIlIIIllIllIIIIIllI.ao();
        if (ao.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl = Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl();
            lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.6875f, -0.75f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(20.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(45.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.25f, 0.1875f, 0.25f);
            final float n8 = 0.5f;
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-n8, -n8, n8);
            final int a_ = ilIlIIIllIllIIIIIllI.a_(n3);
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(ao, 1.0f);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
