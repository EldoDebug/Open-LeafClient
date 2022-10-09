package net.minecraft.lllIIIIlllllIlIIllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll implements IlIlIlIlIlllllllllIl
{
    private final String llIIlIIIlIIIllIlIIIl;
    
    public llllIIIIlIIIlIlllIll(final String s, final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        this.llIIlIIIlIIIllIlIIIl = String.valueOf(s) + illlIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.put(this.llIIlIIIlIIIllIlIIIl, this);
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final List list) {
        return 0;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI() {
        return net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
}
