package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.optifine.*;
import net.optifine.shaders.*;
import java.util.*;

public class llllIIllllIlIlIIIIll extends IIIIlllIIIIIIlIIIlll
{
    private IlIlIllllllllIIIIlII[] IlIIIlIlIIIllIlIlIIl;
    private IIIIlllIIIIIIlIIIlll[] IlIlIIIllIllIIIIIllI;
    private static final String IllIIlllIIIIlllIIlIl = "<profile>";
    private static final String llllIIIlIlllIlIIIIIl = "<custom>";
    
    public llllIIllllIlIlIIIIll(final IlIlIllllllllIIIIlII[] ilIIIlIlIIIllIlIlIIl, final IIIIlllIIIIIIlIIIlll[] ilIlIIIllIllIIIIIllI) {
        super("<profile>", "", llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI), llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl), llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI, true), null);
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIlIlllIlIIIIIl() {
        super.llllIIIlIlllIlIIIIIl();
        if (this.IlIIIlIlIIIllIlIlIIl().equals("<custom>")) {
            super.llllIIIlIlllIlIIIIIl();
        }
        this.IlIlIIIIIIlllIlIllIl();
    }
    
    public void lllIIIIlllllIlIIllIl() {
        final IlIlIllllllllIIIIlII liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(this.IlIIIlIlIIIllIlIlIIl());
        if (liiIlllIIIllIIIllIII == null || !lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, this.IlIlIIIllIllIIIIIllI, false)) {
            this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI));
        }
    }
    
    private void IlIlIIIIIIlllIlIllIl() {
        final IlIlIllllllllIIIIlII liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(this.IlIIIlIlIIIllIlIlIIl());
        if (liiIlllIIIllIIIllIII != null) {
            final String[] ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl();
            for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
                final String s = ilIlIlIlIlllllllllIl[i];
                final IIIIlllIIIIIIlIIIlll liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(s);
                if (liiiIlIIIIIlllIllIII != null) {
                    liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(s));
                }
            }
        }
    }
    
    private IIIIlllIIIIIIlIIIlll lIIIIlIIIIIlllIllIII(final String s) {
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = this.IlIlIIIllIllIIIIIllI[i];
            if (iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().equals(s)) {
                return iiiIlllIIIIIIlIIIlll;
            }
        }
        return null;
    }
    
    private IlIlIllllllllIIIIlII lIIIlllIIIllIIIllIII(final String s) {
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = this.IlIIIlIlIIIllIlIlIIl[i];
            if (ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll().equals(s)) {
                return ilIlIllllllllIIIIlII;
            }
        }
        return null;
    }
    
    @Override
    public String IlIlIIIllIIllIlllllI() {
        return IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.shaders.profile");
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl(final String s) {
        return s.equals("<custom>") ? IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.general.custom", "<custom>") : llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("profile." + s, s);
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI(final String s) {
        return s.equals("<custom>") ? "Åòc" : "Åòa";
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        final String ilIlIlIlIlllllllllIl = llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("profile.comment", null);
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            final String llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll != null) {
                final String ilIlIlIlIlllllllllIl2 = llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("profile." + llllIIIIlIIIlIlllIll + ".comment", null);
                if (ilIlIlIlIlllllllllIl2 != null) {
                    sb.append(ilIlIlIlIlllllllllIl2);
                    if (!ilIlIlIlIlllllllllIl2.endsWith(". ")) {
                        sb.append(". ");
                    }
                }
            }
        }
        return sb.toString();
    }
    
    private static String llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII[] array, final IIIIlllIIIIIIlIIIlll[] array2) {
        return llllIIIIlIIIlIlllIll(array, array2, false);
    }
    
    private static String llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII[] array, final IIIIlllIIIIIIlIIIlll[] array2, final boolean b) {
        final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll = lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(array, array2, b);
        return (llllIIIIlIIIlIlllIll == null) ? "<custom>" : llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    private static String[] llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII[] array) {
        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i].llllIIIIlIIIlIlllIll());
        }
        list.add("<custom>");
        return list.toArray(new String[list.size()]);
    }
}
