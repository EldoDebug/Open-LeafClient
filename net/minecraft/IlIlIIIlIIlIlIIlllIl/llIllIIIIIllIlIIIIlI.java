package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIllIIIIIllIlIIIIlI extends j
{
    private final IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl;
    private final String IlIIIlIlIIIllIlIlIIl;
    final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    public llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this(ilIlIlIlIlllllllllIl, iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Properties"), iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Type"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Weight"));
    }
    
    public llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final String s) {
        this(ilIlIlIlIlllllllllIl, iiiIlllIIIIIIlIIIlll, s, 1);
    }
    
    private llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl, String ilIlIlIlIlllllllllIl2, final int n) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(n);
        if (ilIlIlIlIlllllllllIl2.equals("Minecart")) {
            if (ilIlIlIlIlllllllllIl != null) {
                ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("Type")).IlIlIlIlIlllllllllIl();
            }
            else {
                ilIlIlIlIlllllllllIl2 = "MinecartRideable";
            }
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl2;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Properties", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Type", this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Weight", this.llIllIIIIIllIlIIIIlI);
        return iiiIlllIIIIIIlIIIlll;
    }
}
