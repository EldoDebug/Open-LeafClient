package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;

public class lIllllllIIllIlIlIlII extends lIIIIlIIIIIlllIllIII
{
    public lIllllllIIllIlIlIlII() {
        super(llllllIllIllIlIllllI.class, "head_skeleton", 0.0f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIllllIIIlIIIIIIllIl(0, 0, 64, 32);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIllllIIIlIIIIIIllIl)) {
            return null;
        }
        final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = (IIllllIIIlIIIIIIllIl)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll : null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl;
        IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.class);
        if (!(llllIIIIlIIIlIlllIll instanceof IlIllIlIlIIIlIlIlIII)) {
            return null;
        }
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == null) {
            llllIIIIlIIIlIlllIll = new IlIllIlIlIIIlIlIlIII();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cQ.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: TileEntitySkullRenderer.humanoidHead");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cQ, ilIIIlIlIIIllIlIlIIl);
        return llllIIIIlIIIlIlllIll;
    }
}
