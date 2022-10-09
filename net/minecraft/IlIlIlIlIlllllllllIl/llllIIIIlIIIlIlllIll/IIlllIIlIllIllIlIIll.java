package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import com.mojang.authlib.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlllIIlIllIllIlIIll extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "pardon";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.unban.usage";
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll() && super.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length != 1 || array[0].length() <= 0) {
            throw new llllIllllIllllIlIlII("commands.unban.usage", new Object[0]);
        }
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        final GameProfile llllIIIIlIIIlIlllIll = iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll(array[0]);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.unban.failed", new Object[] { array[0] });
        }
        iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.unban.success", array[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl()) : null;
    }
}
