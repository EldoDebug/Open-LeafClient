package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import java.util.regex.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    public static final Pattern llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "ban-ip";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().lIIIlllIIIllIIIllIII().llllIIIIlIIIlIlllIll() && super.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII);
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.banip.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length >= 1 && array[0].length() > 1) {
            final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = (array.length >= 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 1) : null;
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.matcher(array[0]).matches()) {
                this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0], (llIIIIIIlIllIIlIIIll == null) ? null : llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
            }
            else {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(array[0]);
                if (llllIIIIlIIIlIlllIll == null) {
                    throw new IIlIIIlllIllIllIlIII("commands.banip.invalid", new Object[0]);
                }
                this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl(), (llIIIIIIlIllIIlIIIll == null) ? null : llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
            }
            return;
        }
        throw new llllIllllIllllIlIlII("commands.banip.usage", new Object[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : null;
    }
    
    protected void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s, final String s2) {
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().lIIIlllIIIllIIIllIII().llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(s, null, illIlIIllIllIIlIllII.s_(), null, s2));
        final List ilIlIlIlIlllllllllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl(s);
        final String[] array = new String[ilIlIlIlIlllllllllIl.size()];
        int n = 0;
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : ilIlIlIlIlllllllllIl) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("You have been IP banned.");
            array[n++] = ilIIIlIlIIIllIlIlIIl.s_();
        }
        if (ilIlIlIlIlllllllllIl.isEmpty()) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.banip.success", s);
        }
        else {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.banip.success.players", s, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])array));
        }
    }
}
