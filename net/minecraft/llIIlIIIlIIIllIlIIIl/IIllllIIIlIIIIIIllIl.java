package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IIllllIIIlIIIIIIllIl extends IIIIIllIIIIlIIIIllIl
{
    public IIllllIIIlIIIIIIllIl(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final int n2, final int n3) {
        super(llIIIlIlIllIIlIlIlII, n, n2, n3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl) || IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl) ? 1 : super.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl);
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IllllIIlIlIllIIIllII;
    }
}
