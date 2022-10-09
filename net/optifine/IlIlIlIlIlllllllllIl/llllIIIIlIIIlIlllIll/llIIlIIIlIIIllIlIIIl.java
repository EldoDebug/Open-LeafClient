package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;

public class llIIlIIIlIIIllIlIIIl extends lIIIIlIIIIIlllIllIII
{
    public llIIlIIIlIIIllIlIIIl() {
        super(net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.class, "banner", 0.0f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof llIllIIIIIllIlIIIIlI)) {
            return null;
        }
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl;
        return s.equals("slate") ? llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll : (s.equals("stand") ? llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl : (s.equals("top") ? llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI : null));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "slate", "stand", "top" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl;
        IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.class);
        if (!(llllIIIIlIIIlIlllIll instanceof net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl)) {
            return null;
        }
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == null) {
            llllIIIIlIIIlIlllIll = new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cw.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: TileEntityBannerRenderer.bannerModel");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cw, ilIIIlIlIIIllIlIlIIl);
        return llllIIIIlIIIlIlllIll;
    }
}
