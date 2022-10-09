package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIllllIIlIIlIlIlIll extends IlIIIlIlIIIllIlIlIIl
{
    public IlIllllIIlIIlIlIlIll() {
        this.IlIlIlIlIlllllllllIl(1);
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (!IlIllIIllIIlIIIIlIIl.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll)) {
            return false;
        }
        if (!iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("title", 8)) {
            return false;
        }
        final String llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("title");
        return llIIlIIIlIIIllIlIIIl != null && llIIlIIIlIIIllIlIIIl.length() <= 32 && iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("author", 8);
    }
    
    public static int llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IllIIlllIIIIlllIIlIl("generation");
    }
    
    @Override
    public String llllIIIlIlllIlIIIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            final String llIIlIIIlIIIllIlIIIl = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llIIlIIIlIIIllIlIIIl("title");
            if (!lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl)) {
                return llIIlIIIlIIIllIlIIIl;
            }
        }
        return super.llllIIIlIlllIlIIIIIl(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
            final String llIIlIIIlIIIllIlIIIl = llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl("author");
            if (!lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl)) {
                list.add(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("book.byAuthor", llIIlIIIlIIIllIlIIIl));
            }
            list.add(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("book.generation." + llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl("generation")));
        }
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll);
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    private void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll() != null) {
            final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
            if (!llllIIllllIlIlIIIIll.IIIIlllIIIIIIlIIIlll("resolved")) {
                llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll("resolved", true);
                if (IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll)) {
                    final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI("pages", 8);
                    for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                        final String illIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(i);
                        llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll2;
                        try {
                            llllIIIIlIIIlIlllIll2 = IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl), llllIIIIlIIIlIlllIll);
                        }
                        catch (Exception ex) {
                            llllIIIIlIIIlIlllIll2 = new IlIlIIIIIIlllIlIllIl(illIIlllIIIIlllIIlIl);
                        }
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(i, new IIIlIIlIIIIlllIlllII(lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)));
                    }
                    llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll("pages", llIllIIIIIllIlIIIIlI);
                    if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll.p() == lllIIIIlIlIllIIlIIIl) {
                        ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIlIlIlllIIlIlIlllIl(0, llllIIIIlIIIlIlllIll.t.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI, lllIIIIlIlIllIIlIIIl));
                    }
                }
            }
        }
    }
    
    @Override
    public boolean lIIIIlIIIIIlllIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
}
