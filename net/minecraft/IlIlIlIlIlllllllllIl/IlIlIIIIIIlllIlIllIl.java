package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIIIIIIlllIlIllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "gamerule";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.gamerule.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        final lIIIlllIIIllIIIllIII ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final String s = (array.length > 0) ? array[0] : "";
        final String s2 = (array.length > 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 1) : "";
        switch (array.length) {
            case 0: {
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl())));
                break;
            }
            case 1: {
                if (!ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(s)) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.gamerule.norule", new Object[] { s });
                }
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(s).IlIlIlIlIlllllllllIl(" = ").IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s)));
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(s));
                break;
            }
            default: {
                if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s, llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl) && !"true".equals(s2) && !"false".equals(s2)) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.generic.boolean.invalid", new Object[] { s2 });
                }
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s, s2);
                llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, s);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.gamerule.success", new Object[0]);
                break;
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final String s) {
        if ("reducedDebugInfo".equals(s)) {
            final byte b = (byte)(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(s) ? 22 : 23);
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().IIIlIIIlIlIIlllIIlll()) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII(ilIIIlIlIIIllIlIlIIl, b));
            }
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (array.length == 1) {
            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl());
        }
        if (array.length == 2 && this.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(array[0], llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl)) {
            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "true", "false");
        }
        return null;
    }
    
    private lIIIlllIIIllIIIllIII IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(0).llIIlllIIlllIIllIllI();
    }
}
