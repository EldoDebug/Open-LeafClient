package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class lllIllIIIllllllIllll extends IIlllIIIlIlllIIlllII
{
    private final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private String[] lIIIlllIIIllIIIllIII;
    
    public lllIllIIIllllllIllll(final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII, final boolean b) {
        super(liiiIlIIIIIlllIllIII);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        if (b) {
            this.IlIIIlIlIIIllIlIlIIl(0);
            this.llllIIIIlIIIlIlllIll(true);
        }
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        return this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()));
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return n;
    }
    
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final String[] liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        return this;
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.lIIIlllIIIllIIIllIII == null) {
            return super.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
        }
        final int liiiIlIIIIIlllIllIII = lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
        return (liiiIlIIIIIlllIllIII >= 0 && liiiIlIIIIIlllIllIII < this.lIIIlllIIIllIIIllIII.length) ? (String.valueOf(super.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl)) + "." + this.lIIIlllIIIllIIIllIII[liiiIlIIIIIlllIllIII]) : super.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
    }
}
