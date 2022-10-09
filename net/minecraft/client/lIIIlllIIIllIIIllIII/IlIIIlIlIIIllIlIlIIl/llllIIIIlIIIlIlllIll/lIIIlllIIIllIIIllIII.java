package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIlllIIIllIIIllIII implements IlIllIlIlIIIlIlIlIII
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/enderdragon/dragon_eyes.png");
    }
    
    public lIIIlllIIIllIIIllIII(final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1, 1);
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(514);
        final int n8 = 61680;
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, n8 % 65536 / 1.0f, n8 / 65536 / 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            llIIlllIIlllIIllIllI.IllIllIIIIlIIlIlllII();
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl().lIIIlllIIIllIIIllIII = true;
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n2, n4, n5, n6, n7);
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl().lIIIlllIIIllIIIllIII = false;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            llIIlllIIlllIIllIllI.IlIllllIIlIIlIlIlIll();
        }
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n3);
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
}
