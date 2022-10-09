package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIlIlIlIIlIllIIIIIIl extends lIIIIlIIIIIlllIllIII
{
    private static Map llllIIIIlIIIlIlllIll;
    
    static {
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll = null;
    }
    
    public IIlIlIlIIlIllIIIIIIl() {
        super(lIlIlIIIllIIllIIIllI.class, "rabbit", 0.3f);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIlllIIIlIlllIIlllII();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIlllIIIlIlllIIlllII)) {
            return null;
        }
        final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII = (IIlllIIIlIlllIIlllII)ilIIIlIlIIIllIlIlIIl;
        final Map llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl();
        if (llllIIIlIlllIlIIIIIl.containsKey(s)) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlIIIlIlllIIlllII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bU, llllIIIlIlllIlIIIIIl.get(s));
        }
        return null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose" };
    }
    
    private static Map llllIIIlIlllIlIIIIIl() {
        if (IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll != null) {
            return IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll;
        }
        (IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll = new HashMap()).put("left_foot", 0);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("right_foot", 1);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("left_thigh", 2);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("right_thigh", 3);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("body", 4);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("left_arm", 5);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("right_arm", 6);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("head", 7);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("right_ear", 8);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("left_ear", 9);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("tail", 10);
        IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll.put("nose", 11);
        return IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        return new lIlIlIlllIIlIlIlllIl(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl(), ilIIIlIlIIIllIlIlIIl, n);
    }
}
