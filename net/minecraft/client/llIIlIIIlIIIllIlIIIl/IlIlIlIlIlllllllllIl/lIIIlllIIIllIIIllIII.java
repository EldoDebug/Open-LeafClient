package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII implements IlIlIlIlIlllllllllIl
{
    protected final List llllIIIIlIIIlIlllIll;
    protected final List IlIlIlIlIlllllllllIl;
    protected final boolean llIllIIIIIllIlIIIIlI;
    protected final boolean IlIIIlIlIIIllIlIlIIl;
    protected final IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI;
    protected final llIllIlIIIIllIlIIllI IllIIlllIIIIlllIIlIl;
    
    public lIIIlllIIIllIIIllIII(final List llllIIIIlIIIlIlllIll, final List ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl, final IlIlIIIllIIllIlllllI ilIlIIIllIllIIIIIllI, final llIllIlIIIIllIlIIllI illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.IlIlIlIlIlllllllllIl.get(lllIllIIIllllllIllll.ordinal());
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return false;
    }
    
    @Override
    public IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public llIllIlIIIIllIlIIllI IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
