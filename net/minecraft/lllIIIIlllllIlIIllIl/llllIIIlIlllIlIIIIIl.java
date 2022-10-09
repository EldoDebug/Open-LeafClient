package net.minecraft.lllIIIIlllllIlIIllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llllIIIlIlllIlIIIIIl extends IllIIlllIIIIlllIIlIl
{
    public llllIIIlIlllIlIIIIIl(final String s) {
        super(s);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final List list) {
        float n = 0.0f;
        for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : list) {
            n += llllIIIIlIIIlIlllIll.N() + llllIIIIlIIIlIlllIll.aj();
        }
        if (list.size() > 0) {
            n /= list.size();
        }
        return llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(n);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI() {
        return net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
    }
}
