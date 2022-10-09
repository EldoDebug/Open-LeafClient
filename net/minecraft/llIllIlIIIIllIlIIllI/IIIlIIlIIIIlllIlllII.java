package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIlIIlIIIIlllIlllII extends IlIIIlIlIIIllIlIlIIl
{
    private static final int[] llIllIlIIIIllIlIIllI;
    public static final String[] llllIIIlIlllIlIIIIIl;
    private static final llIllIIIIIllIlIIIIlI lIlIlIIIllIIllIIIllI;
    public final int lIIIIlIIIIIlllIllIII;
    public final int lIIIlllIIIllIIIllIII;
    public final int llIIlIIIlIIIllIlIIIl;
    private final IIlllIlIIllIlIlIlIIl IlIlIIIllIIllIlllllI;
    
    static {
        llIllIlIIIIllIlIIllI = new int[] { 11, 16, 15, 13 };
        llllIIIlIlllIlIIIIIl = new String[] { "minecraft:items/empty_armor_slot_helmet", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_boots" };
        lIlIlIIIllIIllIIIllI = new IlIlIllllllllIIIIlII();
    }
    
    public IIIlIIlIIIIlllIlllII(final IIlllIlIIllIlIlIlIIl ilIlIIIllIIllIlllllI, final int llIIlIIIlIIIllIlIIIl, final int liiiIlIIIIIlllIllIII) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII);
        this.IlIIIlIlIIIllIlIlIIl(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII));
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
        IllIllIlllIllllIIllI.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this, IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        if (n > 0) {
            return 16777215;
        }
        int lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI(lllIIIIlIlIllIIlIIIl);
        if (lIlIlIIIllIIllIIIllI < 0) {
            lIlIlIIIllIIllIIIllI = 16777215;
        }
        return lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public int IlIlIIIllIIllIlllllI() {
        return this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll();
    }
    
    public IIlllIlIIllIlIlIlIIl lllIIIIlllllIlIIllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public boolean llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.IlIlIIIllIIllIlllllI == IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll && lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll() && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("display", 10) && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("display").IlIlIlIlIlllllllllIl("color", 3);
    }
    
    public int lIlIlIIIllIIllIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.IlIlIIIllIIllIlllllI != IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            return -1;
        }
        final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll != null) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("display");
            if (ilIlIIIllIIllIlllllI != null && ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("color", 3)) {
                return ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl("color");
            }
        }
        return 10511680;
    }
    
    public void IlIlIIIllIIllIlllllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.IlIlIIIllIIllIlllllI == IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
            if (llllIIllllIlIlIIIIll != null) {
                final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("display");
                if (ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("color")) {
                    ilIlIIIllIIllIlllllI.llllIIllllIlIlIIIIll("color");
                }
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        if (this.IlIlIIIllIIllIlllllI != IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll == null) {
            llllIIllllIlIlIIIIll = new IIIIlllIIIIIIlIIIlll();
            lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(llllIIllllIlIlIIIIll);
        }
        final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("display");
        if (!llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("display", 10)) {
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll("display", ilIlIIIllIIllIlllllI);
        }
        ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll("color", n);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl() == lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll() || super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final int n = IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl) - 1;
        if (llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI(n) == null) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl());
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 0;
        }
        return lllIIIIlIlIllIIlIIIl;
    }
}
