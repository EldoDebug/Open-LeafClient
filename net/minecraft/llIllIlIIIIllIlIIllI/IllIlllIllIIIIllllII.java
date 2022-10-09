package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIlllIllIIIIllllII extends IlIIIlIlIIIllIlIlIIl
{
    private float llllIIIlIlllIlIIIIIl;
    private final IlIlIIIlIIlIlIIlllIl lIIIIlIIIIIlllIllIII;
    
    public IllIlllIllIIIIllllII(final IlIlIIIlIIlIlIIlllIl liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.IlIIIlIlIIIllIlIlIIl(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
        this.llllIIIlIlllIlIIIIIl = 4.0f + liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
    }
    
    public float lllIIIIlllllIlIIllIl() {
        return this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll) {
            return 15.0f;
        }
        final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
        return (illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI && illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI && illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIlIIlIlIIlllIl && illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl && illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII) ? 1.0f : 1.5f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1, lllIIIIlllllIlIIllIl2);
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) != 0.0) {
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(2, lllIIIIlllllIlIIllIl);
        }
        return true;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return true;
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return 72000;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl, this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl));
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll;
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
        ilIllIlIlIIIlIlIlIII.put((Object)IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(), (Object)new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IllIlllIllIIIIllllII.IlIlIlIlIlllllllllIl, "Weapon modifier", this.llllIIIlIlllIlIIIIIl, 0));
        return ilIllIlIlIIIlIlIlIII;
    }
}
