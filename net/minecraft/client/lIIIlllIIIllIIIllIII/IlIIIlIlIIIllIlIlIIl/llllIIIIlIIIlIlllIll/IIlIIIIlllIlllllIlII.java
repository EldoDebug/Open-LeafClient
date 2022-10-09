package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlIIIIlllIlllllIlII implements IlIllIlIlIIIlIlIlIII
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final llllIllllIllllIlIlII IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/wolf/wolf_collar.png");
    }
    
    public IIlIIIIlllIlllllIlII(final llllIllllIllllIlIlII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (iiIllllllIllIIIlllIl.as() && !iiIllllllIllIIIlllIl.IIIIIIIllllIlIIIIIII()) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll);
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(iiIllllllIllIIIlllIl.ay().IlIlIlIlIlllllllllIl());
            float[] array = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                array = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, array);
            }
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(array[0], array[1], array[2]);
            this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl, n, n2, n4, n5, n6, n7);
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
}
