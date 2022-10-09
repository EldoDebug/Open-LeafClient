package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import com.mojang.authlib.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class llllIIllllIlIlIIIIll extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "op";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.op.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length != 1 || array[0].length() <= 0) {
            throw new llllIllllIllllIlIlII("commands.op.usage", new Object[0]);
        }
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        final GameProfile llllIIIIlIIIlIlllIll = iiiiIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(array[0]);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.op.failed", new Object[] { array[0] });
        }
        iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.op.success", array[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (array.length == 1) {
            final String s = array[array.length - 1];
            final ArrayList arrayList = Lists.newArrayList();
            GameProfile[] iiIllllllIllIIIlllIl;
            for (int length = (iiIllllllIllIIIlllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIIllllllIllIIIlllIl()).length, i = 0; i < length; ++i) {
                final GameProfile gameProfile = iiIllllllIllIIIlllIl[i];
                if (!net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().IlIlIIIllIllIIIIIllI(gameProfile) && net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, gameProfile.getName())) {
                    arrayList.add(gameProfile.getName());
                }
            }
            return arrayList;
        }
        return null;
    }
}
