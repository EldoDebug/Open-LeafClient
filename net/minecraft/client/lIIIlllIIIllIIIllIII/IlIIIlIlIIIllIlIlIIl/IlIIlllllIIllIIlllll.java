package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIlllllIIllIIlllll extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    private static final lIllllIllIllIIllllll IlllllllIIIlIIIlIlII;
    private static final lIllllIllIllIIllllll IIlIIIIlllIlllllIlII;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/villager/villager.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/villager/farmer.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/villager/librarian.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/villager/priest.png");
        IlllllllIIIlIIIlIlII = new lIllllIllIllIIllllll("textures/entity/villager/smith.png");
        IIlIIIIlllIlllllIlII = new lIllllIllIllIIllllll("textures/entity/villager/butcher.png");
    }
    
    public IlIIlllllIIllIIlllll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IllIllIIIIlIIlIlllII(0.0f), 0.5f);
        this.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this.lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll));
    }
    
    public IllIllIIIIlIIlIlllII lIIIIlIIIIIlllIllIII() {
        return (IllIllIIIIlIIlIlllII)super.IlIlIlIlIlllllllllIl();
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        switch (ilIlIllllllllIIIIlII.an()) {
            case 0: {
                return IlIIlllllIIllIIlllll.IlIlIIIllIllIIIIIllI;
            }
            case 1: {
                return IlIIlllllIIllIIlllll.IIIlIIIlIlIIlllIIlll;
            }
            case 2: {
                return IlIIlllllIIllIIlllll.IlIlIIIlIIlIlIIlllIl;
            }
            case 3: {
                return IlIIlllllIIllIIlllll.IlllllllIIIlIIIlIlII;
            }
            case 4: {
                return IlIIlllllIIllIIlllll.IIlIIIIlllIlllllIlII;
            }
            default: {
                return IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final float n) {
        float n2 = 0.9375f;
        if (ilIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl() < 0) {
            n2 *= 0.5;
            this.llIllIIIIIllIlIIIIlI = 0.25f;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = 0.5f;
        }
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n2, n2, n2);
    }
}
