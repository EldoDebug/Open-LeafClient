package net.minecraft.llIllIlIIIIllIlIIllI;

import java.util.*;
import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIllIlIIIllllllIIlII extends IlIIIlIlIIIllIlIlIIl
{
    private Set lIIIlllIIIllIIIllIII;
    protected float llllIIIlIlllIlIIIIIl;
    private float llIIlIIIlIIIllIlIIIl;
    protected IlIlIIIlIIlIlIIlllIl lIIIIlIIIIIlllIllIII;
    
    protected lIllIlIIIllllllIIlII(final float n, final IlIlIIIlIIlIlIIlllIl liiiIlIIIIIlllIllIII, final Set liiIlllIIIllIIIllIII) {
        this.llllIIIlIlllIlIIIIIl = 4.0f;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.IlIIIlIlIIIllIlIlIIl(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
        this.llllIIIlIlllIlIIIIIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        this.llIIlIIIlIIIllIlIIIl = n + liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.lIIIlllIIIllIIIllIII.contains(llllIIIIlIIIlIlllIll) ? this.llllIIIlIlllIlIIIIIl : 1.0f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(2, lllIIIIlllllIlIIllIl2);
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) != 0.0) {
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1, lllIIIIlllllIlIIllIl);
        }
        return true;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return true;
    }
    
    public IlIlIIIlIIlIlIIlllIl lllIIIIlllllIlIIllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    public int IlIlIIIllIIllIlllllI() {
        return this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI();
    }
    
    public String IlIlIIIIIIlllIlIllIl() {
        return this.lIIIIlIIIIIlllIllIII.toString();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl() == lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll() || super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2);
    }
    
    @Override
    public Multimap IlIllIlIlIIIlIlIlIII() {
        final Multimap ilIllIlIlIIIlIlIlIII = super.IlIllIlIlIIIlIlIlIII();
        ilIllIlIlIIIlIlIlIII.put((Object)IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(), (Object)new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IlIlIlIlIlllllllllIl, "Tool modifier", this.llIIlIIIlIIIllIlIIIl, 0));
        return ilIllIlIlIIIlIlIlIII;
    }
}
