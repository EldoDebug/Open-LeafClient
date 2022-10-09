package net.optifine.IlIlIIIllIllIIIIIllI;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.*;

public class llllIIIIlIIIlIlllIll
{
    private static final List llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = (List)ImmutableList.of();
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl.IlIlIIIllIIllIlllllI()) {
            llllIIIIlIIIlIlllIll = IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public static List llllIIIIlIIIlIlllIll(List llllIIIIlIIIlIlllIll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final long n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (lllIllIIIllllllIllll != null) {
            if (llllIIIlIlllIlIIIIIl.IlIlIIIllIIllIlllllI() && IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)), llIIlIIIlIIIllIlIIIl)) {
                return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
            }
            if (!llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl()) {
                llllIIIIlIIIlIlllIll = net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, llllIIIIlIIIlIlllIll);
            }
        }
        final List iiiIlllIIIIIIlIIIlll = llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.clear();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.size(); ++i) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.get(i);
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, llllIIIlIlllIlIIIIIl);
            if (i == 0 && llllIIIIlIIIlIlllIll.size() == 1 && llllIIIIlIIIlIlllIll3.length == 1 && llllIIIIlIIIlIlllIll3[0] == llllIIIIlIIIlIlllIll2 && llllIIIIlIIIlIlllIll2.llllIIllllIlIlIIIIll() == null) {
                return llllIIIIlIIIlIlllIll;
            }
            for (int j = 0; j < llllIIIIlIIIlIlllIll3.length; ++j) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll3[j];
                iiiIlllIIIIIIlIIIlll.add(llllIIIIlIIIlIlllIll4);
                if (llllIIIIlIIIlIlllIll4.llllIIllllIlIlIIIIll() != null) {
                    llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4.llllIIllllIlIlIIIIll(), llIIlIIIlIIIllIlIIIl);
                    llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
                }
            }
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    private static IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        return (ilIIlIlIIIlIIlIlIlII != null && ilIIlIlIIIlIIlIlIlII != IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) ? ilIIlIlIIIlIIlIlIlII : IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl;
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final long n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
            return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll()) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll3 = net.optifine.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            if (llllIIIIlIIIlIlllIll3.length != 1 || llllIIIIlIIIlIlllIll3[0] != llllIIIIlIIIlIlllIll) {
                return llllIIIIlIIIlIlllIll3;
            }
        }
        if (llllIIIIlIIIlIlllIll.lIllIIlIlIlllllIIIII()) {
            llllIIIIlIIIlIlllIll = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll != llllIIIIlIIIlIlllIll2) {
                return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            }
        }
        return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
    }
}
