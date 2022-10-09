package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;

public class IlIllllIIlIIlIlIlIll extends llIllIlIlIIIIIIIllII
{
    public IlIllllIIlIIlIlIlIll() {
        super(IIIlIIIlIlIIlllIIlll.class, "sheep_wool", 0.7f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new llllllIllIllIlIllllI();
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        final lllIllIIIllllllIllll lllllIIIIIlIlIIIIIIl = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl();
        llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = lllllIIIIIlIlIIIIIIl.IlIIIlIlIIIllIlIlIIl().get(IIIlIIIlIlIIlllIIlll.class);
        if (!(llIllIIIIIllIlIIIIlI instanceof llIIIIIIlIllIIlIIIll)) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Not a RenderSheep: " + llIllIIIIIllIlIIIIlI);
            return null;
        }
        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == null) {
            llIllIIIIIllIlIIIIlI = new llIIIIIIlIllIIlIIIll(lllllIIIIIlIlIIIIIIl, new IIIllllllIllIIIlllIl(), 0.7f);
        }
        final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = (llIIIIIIlIllIIlIIIll)llIllIIIIIllIlIIIIlI;
        final Iterator iterator = llIIIIIIlIllIIlIIIll.llIllIlIIIIllIlIIllI().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof lllIIIIlllllIlIIllIl) {
                iterator.remove();
            }
        }
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = new lllIIIIlllllIlIIllIl(llIIIIIIlIllIIlIIIll);
        lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll = (llllllIllIllIlIllllI)ilIIIlIlIIIllIlIlIIl;
        llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
        return llIIIIIIlIllIIlIIIll;
    }
}
