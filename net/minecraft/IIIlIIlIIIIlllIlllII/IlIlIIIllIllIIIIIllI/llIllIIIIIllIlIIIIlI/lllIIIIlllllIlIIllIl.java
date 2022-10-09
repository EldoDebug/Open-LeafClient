package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lllIIIIlllllIlIIllIl extends llllllIllIllIlIllllI
{
    private IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl;
    
    public lllIIIIlllllIlIIllIl(final String s) {
        super(s);
        this.IlIlIlIlIlllllllllIl = new IIIIlllIIIIIIlIIIlll();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Features");
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Features", this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final int n, final int n2) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(n, n2), iiiIlllIIIIIIlIIIlll);
    }
    
    public static String llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return "[" + n + "," + n2 + "]";
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
