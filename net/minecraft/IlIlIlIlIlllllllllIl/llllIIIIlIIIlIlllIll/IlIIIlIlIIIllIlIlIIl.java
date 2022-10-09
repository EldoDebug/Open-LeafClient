package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import com.mojang.authlib.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "ban";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.ban.usage";
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll() && super.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1 || array[0].length() <= 0) {
            throw new llllIllllIllllIlIlII("commands.ban.usage", new Object[0]);
        }
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        final GameProfile llllIIIIlIIIlIlllIll = iiiiIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(array[0]);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.ban.failed", new Object[] { array[0] });
        }
        String liiiIlIIIIIlllIllIII = null;
        if (array.length >= 2) {
            liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 1).lIIIIlIIIIIlllIllIII();
        }
        iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(llllIIIIlIIIlIlllIll, null, illIlIIllIllIIlIllII.s_(), null, liiiIlIIIIIlllIllIII));
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(array[0]);
        if (llllIIIIlIIIlIlllIll2 != null) {
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("You are banned from this server.");
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.ban.success", array[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length >= 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : null;
    }
}
