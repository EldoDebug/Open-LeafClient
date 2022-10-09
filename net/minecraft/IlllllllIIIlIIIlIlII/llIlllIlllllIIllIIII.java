package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIlllIlllllIIllIIII
{
    private IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    public lllllIlIlIlllIlllIlI llllIIIIlIIIlIlllIll;
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    public e llIllIIIIIllIlIIIIlI;
    public llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl;
    
    public llIlllIlllllIIllIIII(final e e, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this(lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl, e, lllIllIIIllllllIllll, ilIlIlIlIlllllllllIl);
    }
    
    public llIlllIlllllIIllIIII(final e e, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this(lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl, e, lllIllIIIllllllIllll, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
    }
    
    public llIlllIlllllIIllIIII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this(llIllIIIIIllIlIIIIlI, new e(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII));
    }
    
    public llIlllIlllllIIllIIII(final lllllIlIlIlllIlllIlI llllIIIIlIIIlIlllIll, final e e, final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new e(e.llllIIIIlIIIlIlllIll, e.IlIlIlIlIlllllllllIl, e.llIllIIIIIllIlIIIIlI);
    }
    
    public llIlllIlllllIIllIIII(final llIllIIIIIllIlIIIIlI ilIIIlIlIIIllIlIlIIl, final e llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = lllllIlIlIlllIlllIlI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return "HitResult{type=" + this.llllIIIIlIIIlIlllIll + ", blockpos=" + this.IlIlIIIllIllIIIIIllI + ", f=" + this.IlIlIlIlIlllllllllIl + ", pos=" + this.llIllIIIIIllIlIIIIlI + ", entity=" + this.IlIIIlIlIIIllIlIlIIl + '}';
    }
}
