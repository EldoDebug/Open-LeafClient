package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIIllllllIllIIIlllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "spreadplayers";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.spreadplayers.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 6) {
            throw new llllIllllIllllIlIlII("commands.spreadplayers.usage", new Object[0]);
        }
        int i = 0;
        final IlIlIlIlIlllllllllIl ilIlIIIlIIlIlIIlllIl = illIlIIllIllIIlIllII.IlIlIIIlIIlIlIIlllIl();
        final double ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII(), array[i++], true);
        final double ilIlIlIlIlllllllllIl2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl(), array[i++], true);
        final double llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[i++], 0.0);
        final double llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[i++], llllIIIIlIIIlIlllIll + 1.0);
        final boolean ilIIIlIlIIIllIlIlIIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(array[i++]);
        final ArrayList arrayList = Lists.newArrayList();
        while (i < array.length) {
            final String s = array[i++];
            if (lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(s)) {
                final List ilIlIlIlIlllllllllIl3 = lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, s, llIllIIIIIllIlIIIIlI.class);
                if (ilIlIlIlIlllllllllIl3.size() == 0) {
                    throw new IlIllllIIlIIlIlIlIll();
                }
                arrayList.addAll(ilIlIlIlIlllllllllIl3);
            }
            else {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(s);
                if (llllIIIIlIIIlIlllIll3 == null) {
                    throw new IIlIIIlllIllIllIlIII();
                }
                arrayList.add(llllIIIIlIIIlIlllIll3);
            }
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new IlIllllIIlIIlIlIlIll();
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.spreadplayers.spreading." + (ilIIIlIlIIIllIlIlIIl ? "teams" : "players"), new Object[] { arrayList.size(), llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll }));
        this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, arrayList, new IlIIIlIIIllllIlIlIlI(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2), llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ((IlIIIlIlIIIllIlIlIIl)arrayList.get(0)).IlllllllIIIlIIIlIlII, ilIIIlIlIIIllIlIlIIl);
    }
    
    private void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final List list, final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI, final double n, final double n2, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final boolean b) {
        final Random random = new Random();
        final double n3 = ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll - n2;
        final double n4 = ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl - n2;
        final double n5 = ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll + n2;
        final double n6 = ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl + n2;
        final IlIIIlIIIllllIlIlIlI[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(random, b ? this.IlIlIlIlIlllllllllIl(list) : list.size(), n3, n4, n5, n6);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI, n, illlllllIIIlIIIlIlII, random, n3, n4, n5, n6, llllIIIIlIIIlIlllIll, b);
        final double llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(list, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, b);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.spreadplayers.success." + (b ? "teams" : "players"), llllIIIIlIIIlIlllIll.length, ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll, ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll.length > 1) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.spreadplayers.info." + (b ? "teams" : "players"), new Object[] { String.format("%.2f", llllIIIIlIIIlIlllIll3), llllIIIIlIIIlIlllIll2 }));
        }
    }
    
    private int IlIlIlIlIlllllllllIl(final List list) {
        final HashSet hashSet = Sets.newHashSet();
        for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : list) {
            if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                hashSet.add(((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).w());
            }
            else {
                hashSet.add(null);
            }
        }
        return hashSet.size();
    }
    
    private int llllIIIIlIIIlIlllIll(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI, final double n, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final double n2, final double n3, final double n4, final double n5, final IlIIIlIIIllllIlIlIlI[] array, final boolean b) {
        int n6 = 1;
        double min = 3.4028234663852886E38;
        int n7;
        for (n7 = 0; n7 < 10000 && n6 != 0; ++n7) {
            n6 = 0;
            min = 3.4028234663852886E38;
            for (int i = 0; i < array.length; ++i) {
                final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI2 = array[i];
                int n8 = 0;
                final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI3 = new IlIIIlIIIllllIlIlIlI();
                for (int j = 0; j < array.length; ++j) {
                    if (i != j) {
                        final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI4 = array[j];
                        final double llllIIIIlIIIlIlllIll = ilIIIlIIIllllIlIlIlI2.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI4);
                        min = Math.min(llllIIIIlIIIlIlllIll, min);
                        if (llllIIIIlIIIlIlllIll < n) {
                            ++n8;
                            final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI5 = ilIIIlIIIllllIlIlIlI3;
                            ilIIIlIIIllllIlIlIlI5.llllIIIIlIIIlIlllIll += ilIIIlIIIllllIlIlIlI4.llllIIIIlIIIlIlllIll - ilIIIlIIIllllIlIlIlI2.llllIIIIlIIIlIlllIll;
                            final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI6 = ilIIIlIIIllllIlIlIlI3;
                            ilIIIlIIIllllIlIlIlI6.IlIlIlIlIlllllllllIl += ilIIIlIIIllllIlIlIlI4.IlIlIlIlIlllllllllIl - ilIIIlIIIllllIlIlIlI2.IlIlIlIlIlllllllllIl;
                        }
                    }
                }
                if (n8 > 0) {
                    final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI7 = ilIIIlIIIllllIlIlIlI3;
                    ilIIIlIIIllllIlIlIlI7.llllIIIIlIIIlIlllIll /= n8;
                    final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI8 = ilIIIlIIIllllIlIlIlI3;
                    ilIIIlIIIllllIlIlIlI8.IlIlIlIlIlllllllllIl /= n8;
                    if (ilIIIlIIIllllIlIlIlI3.IlIlIlIlIlllllllllIl() > 0.0) {
                        ilIIIlIIIllllIlIlIlI3.llllIIIIlIIIlIlllIll();
                        ilIIIlIIIllllIlIlIlI2.IlIlIlIlIlllllllllIl(ilIIIlIIIllllIlIlIlI3);
                    }
                    else {
                        ilIIIlIIIllllIlIlIlI2.llllIIIIlIIIlIlllIll(random, n2, n3, n4, n5);
                    }
                    n6 = 1;
                }
                if (ilIIIlIIIllllIlIlIlI2.llllIIIIlIIIlIlllIll(n2, n3, n4, n5)) {
                    n6 = 1;
                }
            }
            if (n6 == 0) {
                for (final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI9 : array) {
                    if (!ilIIIlIIIllllIlIlIlI9.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII)) {
                        ilIIIlIIIllllIlIlIlI9.llllIIIIlIIIlIlllIll(random, n2, n3, n4, n5);
                        n6 = 1;
                    }
                }
            }
        }
        if (n7 >= 10000) {
            throw new IIIIlllIIIIIIlIIIlll("commands.spreadplayers.failure." + (b ? "teams" : "players"), new Object[] { array.length, ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll, ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl, String.format("%.2f", min) });
        }
        return n7;
    }
    
    private double llllIIIIlIIIlIlllIll(final List list, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIIIlIIIllllIlIlIlI[] array, final boolean b) {
        double n = 0.0;
        int n2 = 0;
        final HashMap hashMap = Maps.newHashMap();
        for (int i = 0; i < list.size(); ++i) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = list.get(i);
            IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI;
            if (b) {
                final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) ? ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).w() : null;
                if (!hashMap.containsKey(ilIlIIIllIIllIlllllI)) {
                    hashMap.put(ilIlIIIllIIllIlllllI, array[n2++]);
                }
                ilIIIlIIIllllIlIlIlI = hashMap.get(ilIlIIIllIIllIlllllI);
            }
            else {
                ilIIIlIIIllllIlIlIlI = array[n2++];
            }
            llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll) + 0.5f, ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl) + 0.5);
            double min = Double.MAX_VALUE;
            for (int j = 0; j < array.length; ++j) {
                if (ilIIIlIIIllllIlIlIlI != array[j]) {
                    min = Math.min(ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(array[j]), min);
                }
            }
            n += min;
        }
        return n / list.size();
    }
    
    private IlIIIlIIIllllIlIlIlI[] llllIIIIlIIIlIlllIll(final Random random, final int n, final double n2, final double n3, final double n4, final double n5) {
        final IlIIIlIIIllllIlIlIlI[] array = new IlIIIlIIIllllIlIlIlI[n];
        for (int i = 0; i < array.length; ++i) {
            final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI = new IlIIIlIIIllllIlIlIlI();
            ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(random, n2, n3, n4, n5);
            array[i] = ilIIIlIIIllllIlIlIlI;
        }
        return array;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length >= 1 && array.length <= 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(array, 0, ilIlIlIlIlllllllllIl) : null;
    }
}
