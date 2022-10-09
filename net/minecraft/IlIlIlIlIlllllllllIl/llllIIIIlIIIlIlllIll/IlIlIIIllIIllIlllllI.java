package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIIllIlllllI extends llllIIIIlIIIlIlllIll
{
    @Override
    public List IlIlIlIlIlllllllllIl() {
        return Arrays.asList("w", "msg");
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "tell";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 0;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.message.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII("commands.message.usage", new Object[0]);
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0]);
        if (llllIIIIlIIIlIlllIll == illIlIIllIllIIlIllII) {
            throw new IIlIIIlllIllIllIlIII("commands.message.sameTarget", new Object[0]);
        }
        final llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array, 1, !(illIlIIllIllIIlIllII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll));
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.message.display.incoming", new Object[] { illIlIIllIllIIlIllII.v_(), ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI() });
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = new IIllIIllIIIlIlIIIIlI("commands.message.display.outgoing", new Object[] { llllIIIIlIIIlIlllIll.v_(), ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI() });
        illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl(true);
        illIIllIIIlIlIIIIlI2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl(true);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI2);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI());
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
