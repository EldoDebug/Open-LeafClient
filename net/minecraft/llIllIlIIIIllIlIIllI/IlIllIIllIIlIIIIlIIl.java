package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIllIIllIIlIIIIlIIl extends IlIIIlIlIIIllIlIlIIl
{
    public IlIllIIllIIlIIIIlIIl() {
        this.IlIlIlIlIlllllllllIl(1);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll == null) {
            return false;
        }
        if (!iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("pages", 9)) {
            return false;
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("pages", 8);
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final String illIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(i);
            if (illIIlllIIIIlllIIlIl == null) {
                return false;
            }
            if (illIIlllIIIIlllIIlIl.length() > 32767) {
                return false;
            }
        }
        return true;
    }
}
