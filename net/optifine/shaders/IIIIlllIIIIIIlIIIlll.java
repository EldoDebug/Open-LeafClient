package net.optifine.shaders;

import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;

public class IIIIlllIIIIIIlIIIlll implements Iterator
{
    private IIlIlIllllIlllIIIIll llllIIIIlIIIlIlllIll;
    private Iterator3d IlIlIlIlIlllllllllIl;
    private IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    
    public IIIIlllIIIIIIlIIIlll(final IIlIlIllllIlllIIIIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final int n, final int n2) {
        this.llIllIIIIIllIlIIIIlI = new IlIIIlIlIIIllIlIlIIl(0, 0, 0);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = new Iterator3d(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n, n2);
    }
    
    @Override
    public boolean hasNext() {
        return this.IlIlIlIlIlllllllllIl.hasNext();
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll() {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() << 4, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() << 4, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() << 4);
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }
}
