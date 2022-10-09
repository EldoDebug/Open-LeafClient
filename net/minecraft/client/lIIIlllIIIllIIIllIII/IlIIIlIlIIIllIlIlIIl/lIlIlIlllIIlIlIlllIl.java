package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIlIlIlllIIlIlIlllIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    private static final lIllllIllIllIIllllll IlllllllIIIlIIIlIlII;
    private static final lIllllIllIllIIllllll IIlIIIIlllIlllllIlII;
    private static final lIllllIllIllIIllllll IIIlIIlIIIIlllIlllII;
    private static final lIllllIllIllIIllllll IlIlIllllllllIIIIlII;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/rabbit/brown.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/rabbit/white.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/rabbit/black.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/rabbit/gold.png");
        IlllllllIIIlIIIlIlII = new lIllllIllIllIIllllll("textures/entity/rabbit/salt.png");
        IIlIIIIlllIlllllIlII = new lIllllIllIllIIllllll("textures/entity/rabbit/white_splotched.png");
        IIIlIIlIIIIlllIlllII = new lIllllIllIllIIllllll("textures/entity/rabbit/toast.png");
        IlIlIllllllllIIIIlII = new lIllllIllIllIIllllll("textures/entity/rabbit/caerbannog.png");
    }
    
    public lIlIlIlllIIlIlIlllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final String llllIIIIlIIIlIlllIll = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.s_());
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.equals("Toast")) {
            return lIlIlIlllIIlIlIlllIl.IIIlIIlIIIIlllIlllII;
        }
        switch (lIlIlIIIllIIllIIIllI.as()) {
            default: {
                return lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll;
            }
            case 1: {
                return lIlIlIlllIIlIlIlllIl.IlIlIIIllIllIIIIIllI;
            }
            case 2: {
                return lIlIlIlllIIlIlIlllIl.IIIlIIIlIlIIlllIIlll;
            }
            case 3: {
                return lIlIlIlllIIlIlIlllIl.IIlIIIIlllIlllllIlII;
            }
            case 4: {
                return lIlIlIlllIIlIlIlllIl.IlIlIIIlIIlIlIIlllIl;
            }
            case 5: {
                return lIlIlIlllIIlIlIlllIl.IlllllllIIIlIIIlIlII;
            }
            case 99: {
                return lIlIlIlllIIlIlIlllIl.IlIlIllllllllIIIIlII;
            }
        }
    }
}
