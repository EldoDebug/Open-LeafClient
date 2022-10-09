package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IllIllIIIIlIIlIlllII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "xp";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.xp.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length <= 0) {
            throw new llllIllllIllllIlIlII("commands.xp.usage", new Object[0]);
        }
        String substring = array[0];
        final boolean b = substring.endsWith("l") || substring.endsWith("L");
        if (b && substring.length() > 1) {
            substring = substring.substring(0, substring.length() - 1);
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(substring);
        final boolean b2 = llllIIIIlIIIlIlllIll < 0;
        if (b2) {
            llllIIIIlIIIlIlllIll *= -1;
        }
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (array.length > 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[1]) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII);
        if (b) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl.L);
            if (b2) {
                ilIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI(-llllIIIIlIIIlIlllIll);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.xp.success.negative.levels", llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl.s_());
            }
            else {
                ilIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI(llllIIIIlIIIlIlllIll);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.xp.success.levels", llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl.s_());
            }
        }
        else {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl.M);
            if (b2) {
                throw new IIIIlllIIIIIIlIIIlll("commands.xp.failure.widthdrawXp", new Object[0]);
            }
            ilIIIlIlIIIllIlIlIIl.lllIIIIlllllIlIIllIl(llllIIIIlIIIlIlllIll);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.xp.success", llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl.s_());
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : null;
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 1;
    }
}
