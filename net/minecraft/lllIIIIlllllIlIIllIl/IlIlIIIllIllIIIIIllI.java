package net.minecraft.lllIIIIlllllIlIIllIl;

import java.util.*;

class IlIlIIIllIllIIIIIllI implements Comparator
{
    public int llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2) {
        return (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() > ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl()) ? 1 : ((ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() < ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl()) ? -1 : ilIIIlIlIIIllIlIlIIl2.IlIIIlIlIIIllIlIlIIl().compareToIgnoreCase(ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl()));
    }
}
