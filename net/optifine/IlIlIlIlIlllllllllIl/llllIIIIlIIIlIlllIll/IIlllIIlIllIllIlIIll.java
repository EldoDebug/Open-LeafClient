package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IIlllIIlIllIllIlIIll extends lIIIIlIIIIIlllIllIII
{
    public IIlllIIlIllIllIlIIll() {
        super(IlIlIIIllIIllIlllllI.class, "chest", 0.0f);
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
        net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.class);
        if (!(llllIIIIlIIIlIlllIll instanceof net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl)) {
            return null;
        }
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == null) {
            llllIIIIlIIIlIlllIll = new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cC.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: TileEntityChestRenderer.simpleChest");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cC, ilIIIlIlIIIllIlIlIIl);
        return llllIIIIlIIIlIlllIll;
    }
}
