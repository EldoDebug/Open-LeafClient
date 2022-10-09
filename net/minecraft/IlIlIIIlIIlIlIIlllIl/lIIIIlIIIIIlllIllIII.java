package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lIIIIlIIIIIlllIllIII extends IlIIIlIlIIIllIlIlIIl
{
    private int IlIlIIIllIllIIIIIllI;
    private IlIlIIIlIIlIlIIlllIl IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private List lIIIIlIIIIIlllIllIII;
    private List lIIIlllIIIllIIIllIII;
    private String llIIlIIIlIIIllIlIIIl;
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IllIIlllIIIIlllIIlIl = null;
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll() && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("BlockEntityTag", 10)) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("BlockEntityTag");
            if (ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("Patterns")) {
                this.IllIIlllIIIIlllIIlIl = (IlIlIIIlIIlIlIIlllIl)ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("Patterns", 10).IlIlIlIlIlllllllllIl();
            }
            if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Base", 99)) {
                this.IlIlIIIllIllIIIIIllI = ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl("Base");
            }
            else {
                this.IlIlIIIllIllIIIIIllI = (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() & 0xF);
            }
        }
        else {
            this.IlIlIIIllIllIIIIIllI = (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() & 0xF);
        }
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = "";
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final int n, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Base", n);
        if (ilIlIIIlIIlIlIIlllIl != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Patterns", ilIlIIIlIIlIlIIlllIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Base");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Patterns", 10);
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        return new IllIIlllllIIllIIllIl(this.IlIlIlIlIlllllllllIl, 6, iiiIlllIIIIIIlIIIlll);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public static int IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", false);
        return (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Base")) ? llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl("Base") : lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    public static int llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", false);
        return (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Patterns")) ? llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Patterns", 10).IlIlIIIllIllIIIIIllI() : 0;
    }
    
    public List IlIlIlIlIlllllllllIl() {
        this.IllIIlllIIIIlllIIlIl();
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public List IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl();
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        this.IllIIlllIIIIlllIIlIl();
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    private void IllIIlllIIIIlllIIlIl() {
        if (this.lIIIIlIIIIIlllIllIII == null || this.lIIIlllIIIllIIIllIII == null || this.llIIlIIIlIIIllIlIIIl == null) {
            if (!this.llllIIIlIlllIlIIIIIl) {
                this.llIIlIIIlIIIllIlIIIl = "";
            }
            else {
                this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
                this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
                this.lIIIIlIIIIIlllIllIII.add(net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll);
                this.lIIIlllIIIllIIIllIII.add(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI));
                this.llIIlIIIlIIIllIlIIIl = "b" + this.IlIlIIIllIllIIIIIllI;
                if (this.IllIIlllIIIIlllIIlIl != null) {
                    for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(); ++i) {
                        final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(i);
                        final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll = net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Pattern"));
                        if (llllIIIIlIIIlIlllIll != null) {
                            this.lIIIIlIIIIIlllIllIII.add(llllIIIIlIIIlIlllIll);
                            final int illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("Color");
                            this.lIIIlllIIIllIIIllIII.add(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl));
                            this.llIIlIIIlIIIllIlIIIl = String.valueOf(this.llIIlIIIlIIIllIlIIIl) + llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() + illIIlllIIIIlllIIlIl;
                        }
                    }
                }
            }
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", false);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Patterns", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Patterns", 10);
            if (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() > 0) {
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() - 1);
                if (llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
                    lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llllIIllllIlIlIIIIll("BlockEntityTag");
                    if (lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llIllIIIIIllIlIIIIlI()) {
                        lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl((IIIIlllIIIIIIlIIIlll)null);
                    }
                }
            }
        }
    }
}
