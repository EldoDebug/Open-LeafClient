package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IIllIIllIIIlIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "save-off";
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.save-off.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        boolean b = false;
        for (int i = 0; i < iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            if (iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i] != null) {
                final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i];
                if (!iiIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII) {
                    iiIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII = true;
                    b = true;
                }
            }
        }
        if (b) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.save.disabled", new Object[0]);
            return;
        }
        throw new IIIIlllIIIIIIlIIIlll("commands.save-off.alreadyOff", new Object[0]);
    }
}
