package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;

public class lIlIlIIIllIIllIIIllI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "list";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 0;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.players.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        final int iIlllIIIlIlllIIlllII = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIIlIlllIIlllII();
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.players.list", new Object[] { iIlllIIIlIlllIIlllII, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlIIIIIllIlIIIlIIll() }));
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(array.length > 0 && "uuids".equalsIgnoreCase(array[0]))));
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, iIlllIIIlIlllIIlllII);
    }
}
