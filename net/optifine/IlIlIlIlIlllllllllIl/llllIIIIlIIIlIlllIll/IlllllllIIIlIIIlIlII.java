package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;

public class IlllllllIIIlIIIlIlII extends lIIIIlIIIIIlllIllIII
{
    public IlllllllIIIlIIIlIlII() {
        super(IlIlIIIlIIlIlIIlllIl.class, "ender_chest", 0.0f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new llIllIlIIIIllIlIIllI();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof llIllIlIIIIllIlIIllI)) {
            return null;
        }
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)ilIIIlIlIIIllIlIlIIl;
        return s.equals("lid") ? llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll : (s.equals("base") ? llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl : (s.equals("knob") ? llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI : null));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "lid", "base", "knob" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl;
        IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlIlIIIlIIlIlIIlllIl.class);
        if (!(llllIIIIlIIIlIlllIll instanceof llIIlIIIlIIIllIlIIIl)) {
            return null;
        }
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == null) {
            llllIIIIlIIIlIlllIll = new llIIlIIIlIIIllIlIIIl();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cJ.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: TileEntityEnderChestRenderer.modelChest");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cJ, ilIIIlIlIIIllIlIlIIl);
        return llllIIIIlIIIlIlllIll;
    }
}
