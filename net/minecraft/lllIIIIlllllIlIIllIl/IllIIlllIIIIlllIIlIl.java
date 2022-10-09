package net.minecraft.lllIIIIlllllIlIIllIl;

import java.util.*;

public class IllIIlllIIIIlllIIlIl implements IlIlIlIlIlllllllllIl
{
    private final String llIIlIIIlIIIllIlIIIl;
    
    public IllIIlllIIIIlllIIlIl(final String llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.put(llIIlIIIlIIIllIlIIIl, this);
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
