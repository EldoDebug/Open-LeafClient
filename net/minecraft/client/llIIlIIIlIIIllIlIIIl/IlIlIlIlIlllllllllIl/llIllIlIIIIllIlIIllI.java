package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIlIIIIllIlIIllI implements IlIlIlIlIlllllllllIl
{
    private final int llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    
    public llIllIlIIIIllIlIIllI(final List ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = i.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.get(0).llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final long n) {
        return ((IlIlIIIllIIllIlllllI)i.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, Math.abs((int)n >> 16) % this.llllIIIIlIIIlIlllIll)).llllIIIIlIIIlIlllIll;
    }
}
