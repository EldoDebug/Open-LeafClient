package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII extends lllIIIIlllllIlIIllIl
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "defaultgamemode";
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.defaultgamemode.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length <= 0) {
            throw new llllIllllIllllIlIlII("commands.defaultgamemode.usage", new Object[0]);
        }
        final lllIllIIIllllllIllll liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(illIlIIllIllIIlIllII, array[0]);
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.defaultgamemode.success", new IIllIIllIIIlIlIIIIlI("gameMode." + liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), new Object[0]));
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (iiiiIllIIIIlIIIIllIl.IIllIIIlIIlIlIlIIIII()) {
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().IIIlIIIlIlIIlllIIlll()) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                ilIIIlIlIIIllIlIlIIl.IllIlIIllIllIIlIllII = 0.0f;
            }
        }
    }
}
