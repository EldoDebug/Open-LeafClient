package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIllIIllIlllllI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "entitydata";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.entitydata.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII("commands.entitydata.usage", new Object[0]);
        }
        final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[0]);
        if (ilIlIlIlIlllllllllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            throw new IIIIlllIIIIIIlIIIlll("commands.entitydata.noPlayers", new Object[] { ilIlIlIlIlllllllllIl.v_() });
        }
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll);
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = (net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll)iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
        net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
        try {
            llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 1).lIIIIlIIIIIlllIllIII());
        }
        catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
            throw new IIIIlllIIIIIIlIIIlll("commands.entitydata.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
        }
        llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll("UUIDMost");
        llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll("UUIDLeast");
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (iiiIlllIIIIIIlIIIlll.equals(iiiIlllIIIIIIlIIIlll2)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.entitydata.failed", new Object[] { iiiIlllIIIIIIlIIIlll.toString() });
        }
        ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.entitydata.success", iiiIlllIIIIIIlIIIlll.toString());
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
