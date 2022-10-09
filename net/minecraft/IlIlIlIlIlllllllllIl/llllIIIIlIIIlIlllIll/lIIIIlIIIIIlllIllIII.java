package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lIIIIlIIIIIlllIllIII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "say";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 1;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.say.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length > 0 && array[0].length() > 0) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("chat.type.announcement", new Object[] { illIlIIllIllIIlIllII.v_(), net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array, 0, true) }));
            return;
        }
        throw new llllIllllIllllIlIlII("commands.say.usage", new Object[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length >= 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : null;
    }
}
