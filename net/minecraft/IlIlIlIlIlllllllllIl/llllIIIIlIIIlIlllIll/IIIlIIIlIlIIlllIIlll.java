package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IIIlIIIlIlIIlllIIlll extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "save-on";
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.save-on.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        boolean b = false;
        for (int i = 0; i < iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            if (iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i] != null) {
                final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[i];
                if (iiIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII) {
                    iiIllllllIllIIIlllIl.IIlllIIIlIlllIIlllII = false;
                    b = true;
                }
            }
        }
        if (b) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.save.enabled", new Object[0]);
            return;
        }
        throw new IIIIlllIIIIIIlIIIlll("commands.save-on.alreadyOn", new Object[0]);
    }
}
