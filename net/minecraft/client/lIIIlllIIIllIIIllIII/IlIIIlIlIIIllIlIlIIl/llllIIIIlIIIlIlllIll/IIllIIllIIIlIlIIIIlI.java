package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIllIIllIIIlIlIIIIlI implements IlIllIlIlIIIlIlIlIII
{
    private final IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll;
    
    public IIllIIllIIIlIlIIIIlI(final IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!lllIllIIIllllllIllll.IIIIIIIllllIlIIIIIII()) {
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII().llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(0.0625f);
            final float n8 = 0.625f;
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.34375f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n8, -n8, -n8);
            Minecraft.getMinecraft().lIllIIIIIlllIIlIIllI().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI, 1), IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
}
