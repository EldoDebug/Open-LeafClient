package net.minecraft.lIlIlIIIllIIllIIIllI;

import com.mojang.authlib.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.mojang.authlib.properties.*;
import java.util.*;

public final class IlIlIllllllllIIIIlII
{
    public static GameProfile llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        String llIIlIIIlIIIllIlIIIl = null;
        String llIIlIIIlIIIllIlIIIl2 = null;
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Name", 8)) {
            llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Name");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Id", 8)) {
            llIIlIIIlIIIllIlIIIl2 = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Id");
        }
        if (lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl) && lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl2)) {
            return null;
        }
        UUID fromString;
        try {
            fromString = UUID.fromString(llIIlIIIlIIIllIlIIIl2);
        }
        catch (Throwable t) {
            fromString = null;
        }
        final GameProfile gameProfile = new GameProfile(fromString, llIIlIIIlIIIllIlIIIl);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Properties", 10)) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Properties");
            for (final String s : ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI()) {
                final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI(s, 10);
                for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                    final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
                    final String llIIlIIIlIIIllIlIIIl3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Value");
                    if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("Signature", 8)) {
                        gameProfile.getProperties().put((Object)s, (Object)new Property(s, llIIlIIIlIIIllIlIIIl3, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Signature")));
                    }
                    else {
                        gameProfile.getProperties().put((Object)s, (Object)new Property(s, llIIlIIIlIIIllIlIIIl3));
                    }
                }
            }
        }
        return gameProfile;
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final GameProfile gameProfile) {
        if (!lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(gameProfile.getName())) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Name", gameProfile.getName());
        }
        if (gameProfile.getId() != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Id", gameProfile.getId().toString());
        }
        if (!gameProfile.getProperties().isEmpty()) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            for (final String s : gameProfile.getProperties().keySet()) {
                final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
                for (final Property property : gameProfile.getProperties().get((Object)s)) {
                    final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll3 = new IIIIlllIIIIIIlIIIlll();
                    iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("Value", property.getValue());
                    if (property.hasSignature()) {
                        iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("Signature", property.getSignature());
                    }
                    ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll3);
                }
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll(s, ilIlIIIlIIlIlIIlllIl);
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Properties", iiiIlllIIIIIIlIIIlll2);
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2, final boolean b) {
        if (llllIIIlIlllIlIIIIIl == llllIIIlIlllIlIIIIIl2) {
            return true;
        }
        if (llllIIIlIlllIlIIIIIl == null) {
            return true;
        }
        if (llllIIIlIlllIlIIIIIl2 == null) {
            return false;
        }
        if (!llllIIIlIlllIlIIIIIl.getClass().equals(llllIIIlIlllIlIIIIIl2.getClass())) {
            return false;
        }
        if (llllIIIlIlllIlIIIIIl instanceof IIIIlllIIIIIIlIIIlll) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (IIIIlllIIIIIIlIIIlll)llllIIIlIlllIlIIIIIl;
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = (IIIIlllIIIIIIlIIIlll)llllIIIlIlllIlIIIIIl2;
            for (final String s : iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI()) {
                if (!llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s), iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll(s), b)) {
                    return false;
                }
            }
            return true;
        }
        if (!(llllIIIlIlllIlIIIIIl instanceof IlIlIIIlIIlIlIIlllIl) || !b) {
            return llllIIIlIlllIlIIIIIl.equals(llllIIIlIlllIlIIIIIl2);
        }
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (IlIlIIIlIIlIlIIlllIl)llllIIIlIlllIlIIIIIl;
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = (IlIlIIIlIIlIlIIlllIl)llllIIIlIlllIlIIIIIl2;
        if (ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI() == 0) {
            return ilIlIIIlIIlIlIIlllIl2.IlIlIIIllIllIIIIIllI() == 0;
        }
        for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3 = ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl(i);
            boolean b2 = false;
            for (int j = 0; j < ilIlIIIlIIlIlIIlllIl2.IlIlIIIllIllIIIIIllI(); ++j) {
                if (llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl3, ilIlIIIlIIlIlIIlllIl2.llllIIIlIlllIlIIIIIl(j), b)) {
                    b2 = true;
                    break;
                }
            }
            if (!b2) {
                return false;
            }
        }
        return true;
    }
}
