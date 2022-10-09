package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llllIIIlIlllIlIIIIIl extends IIIIlllIIIIIIlIIIlll
{
    private double IlIlIIIllIllIIIIIllI;
    
    public llllIIIlIlllIlIIIIIl() {
        this.IlIlIIIllIllIIIIIllI = 0.004;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Mineshaft";
    }
    
    public llllIIIlIlllIlIIIIIl(final Map map) {
        this.IlIlIIIllIllIIIIIllI = 0.004;
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (entry.getKey().equals("chance")) {
                this.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.IlIlIIIllIllIIIIIllI);
            }
        }
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.IlIlIlIlIlllllllllIl.nextDouble() < this.IlIlIIIllIllIIIIIllI && this.IlIlIlIlIlllllllllIl.nextInt(80) < Math.max(Math.abs(n), Math.abs(n2));
    }
    
    @Override
    protected IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return new lIllllllIIllIlIlIlII(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl, n, n2);
    }
}
