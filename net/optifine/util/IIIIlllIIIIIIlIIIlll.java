package net.optifine.util;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;

public class IIIIlllIIIIIIlIIIlll
{
    public static IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll() {
        final Minecraft liiiIlIlIllllIIlIllI = llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
        final llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = liiiIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl;
        if (illIIlllIIIIlllIIlIl == null) {
            return null;
        }
        if (!liiiIlIlIllllIIlIllI.lIllllllIIllIlIlIlII()) {
            return null;
        }
        final IlIlIlIlIlllllllllIl iIlllIIIlIlllIIlllII = liiiIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return null;
        }
        final lllllIlIIIlIlIIlllII ilIllIlIlIIIlIlIlIII = illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII;
        if (ilIllIlIlIIIlIlIlIII == null) {
            return null;
        }
        final int iIlllIIlIllIllIlIIll = ilIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
        try {
            return iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll);
        }
        catch (NullPointerException ex) {
            return null;
        }
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final UUID uuid) {
        final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        return llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(uuid);
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII().IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            return null;
        }
        return ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI);
    }
}
