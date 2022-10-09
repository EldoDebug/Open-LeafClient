package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import com.google.common.collect.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl extends IIlllIIlIllIllIlIIll
{
    private static final Map llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private llIllIIIIIllIlIIIIlI IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = Maps.newHashMap();
        IlIIIlIlIIIllIlIlIIl = new lIllllIllIllIIllllll("textures/entity/banner_base.png");
    }
    
    public IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIIIllIllIIIIIllI = new llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final double n, final double n2, final double n3, final float n4, final int n5) {
        final boolean b = liiiIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII() != null;
        final boolean b2 = !b || liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aO;
        final int n6 = b ? liiiIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl() : 0;
        final long n7 = b ? liiiIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII().IIIlIIlIIIIlllIlllII() : 0L;
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        final float n8 = 0.6666667f;
        if (b2) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.5f, (float)n2 + 0.75f * n8, (float)n3 + 0.5f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(n6 * 360 / 16.0f), 0.0f, 1.0f, 0.0f);
            this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = true;
        }
        else {
            float n9 = 0.0f;
            if (n6 == 2) {
                n9 = 180.0f;
            }
            if (n6 == 4) {
                n9 = 90.0f;
            }
            if (n6 == 5) {
                n9 = -90.0f;
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.5f, (float)n2 - 0.25f * n8, (float)n3 + 0.5f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n9, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.3125f, -0.4375f);
            this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = false;
        }
        final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI();
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = (-0.0125f + 0.01f * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII() * 7 + lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() * 9 + lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl() * 13 + (float)n7 + n4) * 3.1415927f * 0.02f)) * 3.1415927f;
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        if (llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n8, -n8, -n8);
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final String ilIlIIIllIllIIIIIllI = liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI.isEmpty()) {
            return null;
        }
        IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.get(ilIlIIIllIllIIIIIllI);
        if (ilIlIIIllIllIIIIIllI2 == null) {
            if (net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.size() >= 256) {
                final long currentTimeMillis = System.currentTimeMillis();
                final Iterator<String> iterator = net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.keySet().iterator();
                while (iterator.hasNext()) {
                    final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI3 = net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.get(iterator.next());
                    if (currentTimeMillis - ilIlIIIllIllIIIIIllI3.llllIIIIlIIIlIlllIll > 60000L) {
                        Minecraft.getMinecraft().lllIllIIIllllllIllll().llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI3.IlIlIlIlIlllllllllIl);
                        iterator.remove();
                    }
                }
                if (net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.size() >= 256) {
                    return null;
                }
            }
            final List ilIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
            final List ilIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<lIIIlllIIIllIIIllIII> iterator2 = ilIlIlIlIlllllllllIl.iterator();
            while (iterator2.hasNext()) {
                arrayList.add("textures/entity/banner/" + iterator2.next().llllIIIIlIIIlIlllIll() + ".png");
            }
            ilIlIIIllIllIIIIIllI2 = new IlIlIIIllIllIIIIIllI(null);
            ilIlIIIllIllIIIIIllI2.IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll(ilIlIIIllIllIIIIIllI);
            Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2.IlIlIlIlIlllllllllIl, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl, arrayList, ilIIIlIlIIIllIlIlIIl));
            net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.put(ilIlIIIllIllIIIIIllI, ilIlIIIllIllIIIIIllI2);
        }
        ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll = System.currentTimeMillis();
        return ilIlIIIllIllIIIIIllI2.IlIlIlIlIlllllllllIl;
    }
}
