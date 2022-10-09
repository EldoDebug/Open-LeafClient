package net.minecraft.llllIIIlIlllIlIIIIIl;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;

public class IlIlIIIlIIlIlIIlllIl
{
    private static final HashMap llllIIIIlIIIlIlllIll;
    
    static {
        (llllIIIIlIIIlIlllIll = Maps.newHashMap()).put(llIllIIIIIllIlIIIIlI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IlIIIlIlIIIllIlIlIIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IlIlIIIllIllIIIIIllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IllIIlllIIIIlllIIlIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(lIIIlllIIIllIIIllIII.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llIIlIIIlIIIllIlIIIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llIllIlIIIIllIlIIllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(lIlIlIIIllIIllIIIllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IIIlIIIlIlIIlllIIlll.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(lllIllIIIllllllIllll.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IlllllllIIIlIIIlIlII.class, IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IIIllllllIllIIIlllIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IlIlIllllllllIIIIlII.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IlIlIlIlIlllllllllIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llllIIIIlIIIlIlllIll.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IlIllIlIlIIIlIlIlIII.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(lllIIIIlllllIlIIllIl.class, IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llIIIlIlIllIIlIlIlII.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llIIlllIIlllIIllIllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llllllIllIllIlIllllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IIIllllllIllIIIlllIl.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llIllIlIlIIIIIIIllII.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(IllIllIlllIllllIIllI.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.put(llIlIIIIIlIIlIlIIlll.class, IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
    }
    
    public static IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final Class clazz) {
        return IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.get(clazz);
    }
}
