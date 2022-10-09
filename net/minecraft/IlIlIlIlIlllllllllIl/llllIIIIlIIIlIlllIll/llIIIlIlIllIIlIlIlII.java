package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class llIIIlIlIllIIlIlIlII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "testfor";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.testfor.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.testfor.usage", new Object[0]);
        }
        final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[0]);
        llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = null;
        if (array.length >= 2) {
            try {
                llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 1));
            }
            catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.testfor.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        if (llllIIIIlIIIlIlllIll != null) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
            ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll);
            if (!IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, iiiIlllIIIIIIlIIIlll, true)) {
                throw new IIIIlllIIIIIIlIIIlll("commands.testfor.failure", new Object[] { ilIlIlIlIlllllllllIl.s_() });
            }
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.testfor.success", ilIlIlIlIlllllllllIl.s_());
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : null;
    }
}
