package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;

public class llllIIllllIlIlIIIIll extends lIIIIlIIIIIlllIllIII
{
    public llllIIllllIlIlIIIIll() {
        super(IIllIIllIIIlIlIIIIlI.class, "book", 0.0f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new lIIIlllIIIllIIIllIII();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof lIIIlllIIIllIIIllIII)) {
            return null;
        }
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = (lIIIlllIIIllIIIllIII)ilIIIlIlIIIllIlIlIIl;
        return s.equals("cover_right") ? liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll : (s.equals("cover_left") ? liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl : (s.equals("pages_right") ? liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI : (s.equals("pages_left") ? liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl : (s.equals("flipping_page_right") ? liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI : (s.equals("flipping_page_left") ? liiIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI : (s.equals("book_spine") ? liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI : null))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl;
        IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.class);
        if (!(llllIIIIlIIIlIlllIll instanceof net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII)) {
            return null;
        }
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == null) {
            llllIIIIlIIIlIlllIll = new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cH.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
            return null;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.cH, ilIIIlIlIIIllIlIlIIl);
        return llllIIIIlIIIlIlllIll;
    }
}
