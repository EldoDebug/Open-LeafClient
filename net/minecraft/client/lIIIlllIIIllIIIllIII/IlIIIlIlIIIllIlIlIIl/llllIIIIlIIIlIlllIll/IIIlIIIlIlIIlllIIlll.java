package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIlIIIlIlIIlllIIlll implements IlIllIlIlIIIlIlIlIII
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final lIlIIlllIIlIIlIlllIl IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/spider_eyes.png");
    }
    
    public IIIlIIIlIlIIlllIIlll(final lIlIIlllIIlIIlIlllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1, 1);
        if (llIllIlIlIIIIIIIllII.IIIIIIIllllIlIIIIIII()) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        }
        else {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        }
        final int n8 = 61680;
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, n8 % 65536 / 1.0f, n8 / 65536 / 1.0f);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            llIIlllIIlllIIllIllI.IllIllIIIIlIIlIlllII();
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl().lIIIlllIIIllIIIllIII = true;
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII, n, n2, n4, n5, n6, n7);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl().lIIIlllIIIllIIIllIII = false;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            llIIlllIIlllIIllIllI.IlIllllIIlIIlIlIlIll();
        }
        final int a_ = llIllIlIlIIIIIIIllII.a_(n3);
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII, n3);
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
