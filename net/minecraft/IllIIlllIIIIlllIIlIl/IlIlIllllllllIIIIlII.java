package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;

public enum IlIlIllllllllIIIIlII
{
    llllIIIIlIIIlIlllIll("ALL", 0), 
    IlIlIlIlIlllllllllIl("ARMOR", 1), 
    llIllIIIIIllIlIIIIlI("ARMOR_FEET", 2), 
    IlIIIlIlIIIllIlIlIIl("ARMOR_LEGS", 3), 
    IlIlIIIllIllIIIIIllI("ARMOR_TORSO", 4), 
    IllIIlllIIIIlllIIlIl("ARMOR_HEAD", 5), 
    llllIIIlIlllIlIIIIIl("WEAPON", 6), 
    lIIIIlIIIIIlllIllIII("DIGGER", 7), 
    lIIIlllIIIllIIIllIII("FISHING_ROD", 8), 
    llIIlIIIlIIIllIlIIIl("BREAKABLE", 9), 
    llIllIlIIIIllIlIIllI("BOW", 10);
    
    static {
        lIlIlIIIllIIllIIIllI = new IlIlIllllllllIIIIlII[] { IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll, IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl, IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI, IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl, IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI, IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl, IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl, IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII, IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII, IlIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl, IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI };
    }
    
    private IlIlIllllllllIIIIlII(final String s, final int n) {
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this == IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll) {
            return true;
        }
        if (this == IlIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl && ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl()) {
            return true;
        }
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIIlIIlIIIIlllIlllII)) {
            return (ilIIIlIlIIIllIlIlIIl instanceof IllIlllIllIIIIllllII) ? (this == IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl) : ((ilIIIlIlIIIllIlIlIIl instanceof lIllIlIIIllllllIIlII) ? (this == IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII) : ((ilIIIlIlIIIllIlIlIIl instanceof IIIllllllIllIIIlllIl) ? (this == IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI) : (ilIIIlIlIIIllIlIlIIl instanceof lllllIIIIIlIlIIIIIIl && this == IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII)));
        }
        if (this == IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl) {
            return true;
        }
        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)ilIIIlIlIIIllIlIlIIl;
        return (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 0) ? (this == IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl) : ((iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 2) ? (this == IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl) : ((iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 1) ? (this == IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI) : (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 3 && this == IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI)));
    }
}
