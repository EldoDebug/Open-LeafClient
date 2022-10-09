package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import com.google.common.collect.*;
import java.util.*;

public class lllIllIIIllllllIllll extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "trigger";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 0;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.trigger.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 3) {
            throw new llllIllllIllllIlIlII("commands.trigger.usage", new Object[0]);
        }
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl;
        if (illIlIIllIllIIlIllII instanceof IlIIIlIlIIIllIlIlIIl) {
            ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)illIlIIllIllIIlIllII;
        }
        else {
            final llIllIIIIIllIlIIIIlI l_ = illIlIIllIllIIlIllII.l_();
            if (!(l_ instanceof IlIIIlIlIIIllIlIlIIl)) {
                throw new IIIIlllIIIIIIlIIIlll("commands.trigger.invalidPlayer", new Object[0]);
            }
            ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)l_;
        }
        final llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(0).IlllIIIIlIIIlIlIlIIl();
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(array[0]);
        if (llllIIIIlIIIlIlllIll == null || llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() != IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            throw new IIIIlllIIIIIIlIIIlll("commands.trigger.invalidObjective", new Object[] { array[0] });
        }
        final int llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2]);
        if (!illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.s_(), llllIIIIlIIIlIlllIll)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.trigger.invalidObjective", new Object[] { array[0] });
        }
        final net.minecraft.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.s_(), llllIIIIlIIIlIlllIll);
        if (ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()) {
            throw new IIIIlllIIIIIIlIIIlll("commands.trigger.disabled", new Object[] { array[0] });
        }
        if ("set".equals(array[1])) {
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2);
        }
        else {
            if (!"add".equals(array[1])) {
                throw new IIIIlllIIIIIIlIIIlll("commands.trigger.invalidMode", new Object[] { array[1] });
            }
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        }
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(true);
        if (ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.trigger.success", array[0], array[1], array[2]);
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (array.length == 1) {
            final llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(0).IlllIIIIlIIIlIlIlIIl();
            final ArrayList arrayList = Lists.newArrayList();
            for (final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII : illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll()) {
                if (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() == IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                    arrayList.add(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
                }
            }
            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, (String[])arrayList.toArray(new String[arrayList.size()]));
        }
        return (array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "add", "set") : null;
    }
}
