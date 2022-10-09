package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "clear";
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.clear.usage";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (array.length == 0) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0]);
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = (array.length >= 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(illIlIIllIllIIlIllII, array[1]) : null;
        final int n = (array.length >= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], -1) : -1;
        final int n2 = (array.length >= 4) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[3], -1) : -1;
        net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = null;
        if (array.length >= 5) {
            try {
                llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 4));
            }
            catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.clear.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        if (array.length >= 2 && ilIIIlIlIIIllIlIlIIl2 == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.clear.failure", new Object[] { ilIIIlIlIIIllIlIlIIl.s_() });
        }
        final int llllIIIIlIIIlIlllIll2 = ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2, n, n2, llllIIIIlIIIlIlllIll);
        ilIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
        if (!ilIIIlIlIIIllIlIlIIl.K.IlIIIlIlIIIllIlIlIIl) {
            ilIIIlIlIIIllIlIlIIl.IlIllIlIlIIIlIlIlIII();
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll2);
        if (llllIIIIlIIIlIlllIll2 == 0) {
            throw new IIIIlllIIIIIIlIIIlll("commands.clear.failure", new Object[] { ilIIIlIlIIIllIlIlIIl.s_() });
        }
        if (n2 == 0) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.clear.testing", new Object[] { ilIIIlIlIIIllIlIlIIl.s_(), llllIIIIlIIIlIlllIll2 }));
        }
        else {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.clear.success", ilIIIlIlIIIllIlIlIIl.s_(), llllIIIIlIIIlIlllIll2);
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : ((array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : null);
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
