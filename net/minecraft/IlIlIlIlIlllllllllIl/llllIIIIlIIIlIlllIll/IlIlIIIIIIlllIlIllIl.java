package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIlIIIIIIlllIlIllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "save-all";
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.save.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.save.start", new Object[0]));
        if (iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII() != null) {
            iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().llIIlIIIlIIIllIlIIIl();
        }
        try {
            for (int i = 0; i < iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                if (iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i] != null) {
                    final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i];
                    final boolean iIlllIIIlIlllIIlllII = iiIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII;
                    iiIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII = false;
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(true, null);
                    iiIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
                }
            }
            if (array.length > 0 && "flush".equals(array[0])) {
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.save.flushStart", new Object[0]));
                for (int j = 0; j < iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl.length; ++j) {
                    if (iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[j] != null) {
                        final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl2 = iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[j];
                        final boolean iIlllIIIlIlllIIlllII2 = iiIllllllIllIIIlllIl2.IIlllIIIlIlllIIlllII;
                        iiIllllllIllIIIlllIl2.IIlllIIIlIlllIIlllII = false;
                        iiIllllllIllIIIlllIl2.lIIlIIIlIllIlIllIIIl();
                        iiIllllllIllIIIlllIl2.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII2;
                    }
                }
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.save.failed", lllIIIIlllllIlIIllIl.getMessage());
            return;
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.save.success", new Object[0]);
    }
}
