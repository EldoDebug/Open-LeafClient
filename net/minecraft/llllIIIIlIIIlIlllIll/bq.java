package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class bq extends llllIIIIlIIIlIlllIll
{
    public bq(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return 2 + random.nextInt(2);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n, final Random random) {
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(random) + random.nextInt(n + 1), 1, 5);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aH;
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII;
    }
    
    @Override
    protected boolean IIlllIlIIllIlIlIlIIl() {
        return true;
    }
}
