package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIlIIIlllIllIllIlIII extends lIIIIlIIIIIlllIllIII
{
    public IIlIIIlllIllIllIlIII() {
        super(llIllIlIlIIIIIIIllII.class, "spider", 1.0f);
    }
    
    protected IIlIIIlllIllIllIlIII(final Class clazz, final String s, final float n) {
        super(clazz, s, n);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII)) {
            return null;
        }
        final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII)ilIIIlIlIIIllIlIlIIl;
        return s.equals("head") ? llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll : (s.equals("neck") ? llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl : (s.equals("body") ? llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI : (s.equals("leg1") ? llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl : (s.equals("leg2") ? llIllIlIlIIIIIIIllII.llIllIlIIIIllIlIIllI : (s.equals("leg3") ? llIllIlIlIIIIIIIllII.lIlIlIIIllIIllIIIllI : (s.equals("leg4") ? llIllIlIlIIIIIIIllII.IlIlIIIllIIllIlllllI : (s.equals("leg5") ? llIllIlIlIIIIIIIllII.IIIIlllIIIIIIlIIIlll : (s.equals("leg6") ? llIllIlIlIIIIIIIllII.llllIIllllIlIlIIIIll : (s.equals("leg7") ? llIllIlIlIIIIIIIllII.IlIllIlIlIIIlIlIlIII : (s.equals("leg8") ? llIllIlIlIIIIIIIllII.IIlllIIlIllIllIlIIll : null))))))))));
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "neck", "body", "leg1", "leg2", "leg3", "leg4", "leg5", "leg6", "leg7", "leg8" };
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        final lIlIIlllIIlIIlIlllIl lIlIIlllIIlIIlIlllIl = new lIlIIlllIIlIIlIlllIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl());
        lIlIIlllIIlIIlIlllIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return lIlIIlllIIlIIlIlllIl;
    }
}
