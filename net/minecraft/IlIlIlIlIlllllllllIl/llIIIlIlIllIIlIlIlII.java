package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIIIlIlIllIIlIlIlII
{
    private static final int llllIIIIlIIIlIlllIll;
    private static final String[] IlIlIlIlIlllllllllIl;
    private String[] llIllIIIIIllIlIIIIlI;
    private String[] IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = lIllllllIIllIlIlIlII.values().length;
        IlIlIlIlIlllllllllIl = new String[llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll];
    }
    
    public llIIIlIlIllIIlIlIlII() {
        this.llIllIIIIIllIlIIIIlI = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final int n) {
        final String s = this.llIllIIIIIllIlIIIIlI[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()];
        if (s != null) {
            final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = new lllllIlIIIlIlIIlllII(this, illIlIIllIllIIlIllII);
            String ilIlIIIllIllIIIIIllI;
            try {
                ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(lllllIlIIIlIlIIlllII, s);
            }
            catch (IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
                return;
            }
            final String s2 = this.IlIIIlIlIIIllIlIlIIl[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()];
            if (s2 != null) {
                final llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = illIlIIllIllIIlIllII.k_().IlllIIIIlIIIlIlIlIIl();
                final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(s2);
                if (llllIIIIlIIIlIlllIll != null && illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll)) {
                    illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(n);
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CommandStats", 10)) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("CommandStats");
            lIllllllIIllIlIlIlII[] values;
            for (int length = (values = lIllllllIIllIlIlIlII.values()).length, i = 0; i < length; ++i) {
                final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII = values[i];
                final String string = String.valueOf(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl()) + "Name";
                final String string2 = String.valueOf(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl()) + "Objective";
                if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(string, 8) && ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(string2, 8)) {
                    llllIIIIlIIIlIlllIll(this, lIllllllIIllIlIlIlII, ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl(string), ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl(string2));
                }
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
        lIllllllIIllIlIlIlII[] values;
        for (int length = (values = lIllllllIIllIlIlIlII.values()).length, i = 0; i < length; ++i) {
            final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII = values[i];
            final String s = this.llIllIIIIIllIlIIIIlI[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()];
            final String s2 = this.IlIIIlIlIIIllIlIlIIl[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()];
            if (s != null && s2 != null) {
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll(String.valueOf(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl()) + "Name", s);
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll(String.valueOf(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl()) + "Objective", s2);
            }
        }
        if (!iiiIlllIIIIIIlIIIlll2.llIllIIIIIllIlIIIIlI()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CommandStats", iiiIlllIIIIIIlIIIlll2);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final String s, final String s2) {
        if (s != null && s.length() != 0 && s2 != null && s2.length() != 0) {
            if (llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI == llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl || llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl == llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl) {
                llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI = new String[llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll];
                llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl = new String[llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll];
            }
            llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()] = s;
            llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()] = s2;
        }
        else {
            llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, lIllllllIIllIlIlIlII);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI != llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl && llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl != llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl) {
            llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()] = null;
            llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()] = null;
            boolean b = true;
            lIllllllIIllIlIlIlII[] values;
            for (int length = (values = lIllllllIIllIlIlIlII.values()).length, i = 0; i < length; ++i) {
                final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII2 = values[i];
                if (llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI[lIllllllIIllIlIlIlII2.llllIIIIlIIIlIlllIll()] != null && llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl[lIllllllIIllIlIlIlII2.llllIIIIlIIIlIlllIll()] != null) {
                    b = false;
                    break;
                }
            }
            if (b) {
                llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl;
                llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        lIllllllIIllIlIlIlII[] values;
        for (int length = (values = lIllllllIIllIlIlIlII.values()).length, i = 0; i < length; ++i) {
            final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII = values[i];
            llllIIIIlIIIlIlllIll(this, lIllllllIIllIlIlIlII, llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()], llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl[lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()]);
        }
    }
}
