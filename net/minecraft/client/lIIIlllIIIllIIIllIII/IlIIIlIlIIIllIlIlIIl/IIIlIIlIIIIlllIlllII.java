package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIlIIlIIIIlllIlllII extends IIllllIIIlIIIIIIllIl
{
    private static final Map llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    private static final lIllllIllIllIIllllll IlllllllIIIlIIIlIlII;
    private static final lIllllIllIllIIllllll IIlIIIIlllIlllllIlII;
    
    static {
        llllIIIIlIIIlIlllIll = Maps.newHashMap();
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/horse/horse_white.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/horse/mule.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/horse/donkey.png");
        IlllllllIIIlIIIlIlII = new lIllllIllIllIIllllll("textures/entity/horse/horse_zombie.png");
        IIlIIIIlllIlllllIlII = new lIllllIllIllIIllllll("textures/entity/horse/horse_skeleton.png");
    }
    
    public IIIlIIlIIIIlllIlllII(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll, final float n) {
        super(lllIllIIIllllllIllll, iiIlIIIlIlIIlllIIlll, n);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final float n) {
        float n2 = 1.0f;
        final int aq = illIIlllIIIIlllIIlIl.aq();
        if (aq == 1) {
            n2 *= 0.87f;
        }
        else if (aq == 2) {
            n2 *= 0.92f;
        }
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n2, n2, n2);
        super.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, n);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (illIIlllIIIIlllIIlIl.aL()) {
            return this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl);
        }
        switch (illIIlllIIIIlllIIlIl.aq()) {
            default: {
                return IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;
            }
            case 1: {
                return IIIlIIlIIIIlllIlllII.IlIlIIIlIIlIlIIlllIl;
            }
            case 2: {
                return IIIlIIlIIIIlllIlllII.IIIlIIIlIlIIlllIIlll;
            }
            case 3: {
                return IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII;
            }
            case 4: {
                return IIIlIIlIIIIlllIlllII.IIlIIIIlllIlllllIlII;
            }
        }
    }
    
    private lIllllIllIllIIllllll IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final String an = illIIlllIIIIlllIIlIl.aN();
        if (!illIIlllIIIIlllIIlIl.aM()) {
            return null;
        }
        lIllllIllIllIIllllll lIllllIllIllIIllllll = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.get(an);
        if (lIllllIllIllIIllllll == null) {
            lIllllIllIllIIllllll = new lIllllIllIllIIllllll(an);
            Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, new lIIIIlIIIIIlllIllIII(illIIlllIIIIlllIIlIl.aO()));
            IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.put(an, lIllllIllIllIIllllll);
        }
        return lIllllIllIllIIllllll;
    }
}
