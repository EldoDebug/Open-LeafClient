package net.minecraft.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public abstract class llllIIIIlIIIlIlllIll
{
    public static final llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
    public static final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    public static final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    public static final llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    public static final llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI;
    public static final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    public static final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    public static final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    public static final llllIIIIlIIIlIlllIll lIIIlllIIIllIIIllIII;
    public static final llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl;
    public static final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI;
    public static final llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI;
    public static final llllIIIIlIIIlIlllIll IlIlIIIllIIllIlllllI;
    private final int IIIIlllIIIIIIlIIIlll;
    private final String llllIIllllIlIlIIIIll;
    private String IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    private IlIlIllllllllIIIIlII[] IlIlIIIIIIlllIlIllIl;
    private lllIIIIlIlIllIIlIIIl IIllIIllIIIlIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll[12];
        IlIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(0, "buildingBlocks");
        llIllIIIIIllIlIIIIlI = new IllIIlllIIIIlllIIlIl(1, "decorations");
        IlIIIlIlIIIllIlIlIIl = new llllIIIlIlllIlIIIIIl(2, "redstone");
        IlIlIIIllIllIIIIIllI = new lIIIIlIIIIIlllIllIII(3, "transportation");
        IllIIlllIIIIlllIIlIl = new lIIIlllIIIllIIIllIII(4, "misc").llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII[] { IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll });
        llllIIIlIlllIlIIIIIl = new llIIlIIIlIIIllIlIIIl(5, "search").llllIIIIlIIIlIlllIll("item_search.png");
        lIIIIlIIIIIlllIllIII = new llIllIlIIIIllIlIIllI(6, "food");
        lIIIlllIIIllIIIllIII = new lIlIlIIIllIIllIIIllI(7, "tools").llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII, IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII, IlIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl);
        llIIlIIIlIIIllIlIIIl = new IlIlIIIllIIllIlllllI(8, "combat").llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl, IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI, IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl, IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl, IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI, IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI, IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl);
        llIllIlIIIIllIlIIllI = new llIllIIIIIllIlIIIIlI(9, "brewing");
        lIlIlIIIllIIllIIIllI = new IlIIIlIlIIIllIlIlIIl(10, "materials");
        IlIlIIIllIIllIlllllI = new IlIlIIIllIllIIIIIllI(11, "inventory").llllIIIIlIIIlIlllIll("inventory.png").llIllIlIIIIllIlIIllI().lIIIlllIIIllIIIllIII();
    }
    
    public llllIIIIlIIIlIlllIll(final int iiiIlllIIIIIIlIIIlll, final String llllIIllllIlIlIIIIll) {
        this.IlIllIlIlIIIlIlIlIII = "items.png";
        this.IIlllIIlIllIllIlIIll = true;
        this.lllIIIIlllllIlIIllIl = true;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[iiiIlllIIIIIIlIIIlll] = this;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return "itemGroup." + this.IlIlIlIlIlllllllllIl();
    }
    
    public lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl() {
        if (this.IIllIIllIIIlIlIIIIlI == null) {
            this.IIllIIllIIIlIlIIIIlI = new lllIIIIlIlIllIIlIIIl(this.IlIlIIIllIllIIIIIllI(), 1, this.IllIIlllIIIIlllIIlIl());
        }
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public abstract net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI();
    
    public int IllIIlllIIIIlllIIlIl() {
        return 0;
    }
    
    public String llllIIIlIlllIlIIIIIl() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        return this;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public llllIIIIlIIIlIlllIll lIIIlllIIIllIIIllIII() {
        this.lllIIIIlllllIlIIllIl = false;
        return this;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI() {
        this.IIlllIIlIllIllIlIIll = false;
        return this;
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        return this.IIIIlllIIIIIIlIIIlll % 6;
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.IIIIlllIIIIIIlIIIlll < 6;
    }
    
    public IlIlIllllllllIIIIlII[] IIIIlllIIIIIIlIIIlll() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII... ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        return this;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        if (this.IlIlIIIIIIlllIlIllIl == null) {
            return false;
        }
        IlIlIllllllllIIIIlII[] ilIlIIIIIIlllIlIllIl;
        for (int length = (ilIlIIIIIIlllIlIllIl = this.IlIlIIIIIIlllIlIllIl).length, i = 0; i < length; ++i) {
            if (ilIlIIIIIIlllIlIllIl[i] == ilIlIllllllllIIIIlII) {
                return true;
            }
        }
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        for (final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
            if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll() == this) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, this, list);
            }
        }
        if (this.IIIIlllIIIIIIlIIIlll() != null) {
            this.llllIIIIlIIIlIlllIll(list, this.IIIIlllIIIIIIlIIIlll());
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final List list, final IlIlIllllllllIIIIlII... array) {
        net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
        for (int length = (llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[i];
            if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.llIIIlIlIllIIlIlIlII != null) {
                boolean b = false;
                for (int n = 0; n < array.length && !b; ++n) {
                    if (llllIIIIlIIIlIlllIll2.llIIIlIlIllIIlIlIlII == array[n]) {
                        b = true;
                    }
                }
                if (b) {
                    list.add(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(new net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl())));
                }
            }
        }
    }
}
