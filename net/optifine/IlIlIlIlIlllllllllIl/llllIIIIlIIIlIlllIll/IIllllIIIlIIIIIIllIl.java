package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIllllIIIlIIIIIIllIl extends lIIIIlIIIIIlllIllIII
{
    private static Map llllIIIIlIIIlIlllIll;
    
    static {
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll = null;
    }
    
    public IIllllIIIlIIIIIIllIl() {
        super(llIIlIIIlIIIllIlIIIl.class, "ocelot", 0.4f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof llIIIlIlIllIIlIlIlII)) {
            return null;
        }
        final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII = (llIIIlIlIllIIlIlIlII)ilIIIlIlIIIllIlIlIIl;
        final Map llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl();
        if (llllIIIlIlllIlIIIIIl.containsKey(s)) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bS, llllIIIlIlllIlIIIIIl.get(s));
        }
        return null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body" };
    }
    
    private static Map llllIIIlIlllIlIIIIIl() {
        if (IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll != null) {
            return IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll;
        }
        (IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll = new HashMap()).put("back_left_leg", 0);
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll.put("back_right_leg", 1);
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll.put("front_left_leg", 2);
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll.put("front_right_leg", 3);
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll.put("tail", 4);
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll.put("tail2", 5);
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll.put("head", 6);
        IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll.put("body", 7);
        return IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        return new IlIllllIIlIIlIlIlIll(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl(), ilIIIlIlIIIllIlIlIIl, n);
    }
}
