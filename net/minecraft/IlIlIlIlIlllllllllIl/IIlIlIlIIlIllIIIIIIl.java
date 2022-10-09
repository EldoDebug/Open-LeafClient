package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlIlIlIIlIllIIIIIIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "worldborder";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.worldborder.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.worldborder.usage", new Object[0]);
        }
        final llIllIIIIIllIlIIIIlI ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (array[0].equals("set")) {
            if (array.length != 2 && array.length != 3) {
                throw new llllIllllIllllIlIlII("commands.worldborder.set.usage", new Object[0]);
            }
            final double llIIlIIIlIIIllIlIIIl = ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl();
            final double llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1], 1.0, 6.0E7);
            final long n = (array.length > 2) ? (net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], 0L, 9223372036854775L) * 1000L) : 0L;
            if (n > 0L) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, n);
                if (llIIlIIIlIIIllIlIIIl > llllIIIIlIIIlIlllIll) {
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", llllIIIIlIIIlIlllIll), String.format("%.1f", llIIlIIIlIIIllIlIIIl), Long.toString(n / 1000L));
                }
                else {
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", llllIIIIlIIIlIlllIll), String.format("%.1f", llIIlIIIlIIIllIlIIIl), Long.toString(n / 1000L));
                }
            }
            else {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.set.success", String.format("%.1f", llllIIIIlIIIlIlllIll), String.format("%.1f", llIIlIIIlIIIllIlIIIl));
            }
        }
        else if (array[0].equals("add")) {
            if (array.length != 2 && array.length != 3) {
                throw new llllIllllIllllIlIlII("commands.worldborder.add.usage", new Object[0]);
            }
            final double liiiIlIIIIIlllIllIII = ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII();
            final double n2 = liiiIlIIIIIlllIllIII + net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1], -liiiIlIIIIIlllIllIII, 6.0E7 - liiiIlIIIIIlllIllIII);
            final long n3 = ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() + ((array.length > 2) ? (net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], 0L, 9223372036854775L) * 1000L) : 0L);
            if (n3 > 0L) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, n2, n3);
                if (liiiIlIIIIIlllIllIII > n2) {
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", n2), String.format("%.1f", liiiIlIIIIIlllIllIII), Long.toString(n3 / 1000L));
                }
                else {
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", n2), String.format("%.1f", liiiIlIIIIIlllIllIII), Long.toString(n3 / 1000L));
                }
            }
            else {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n2);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.set.success", String.format("%.1f", n2), String.format("%.1f", liiiIlIIIIIlllIllIII));
            }
        }
        else if (array[0].equals("center")) {
            if (array.length != 3) {
                throw new llllIllllIllllIlIlII("commands.worldborder.center.usage", new Object[0]);
            }
            final IlIlIlIlIlllllllllIl ilIlIIIlIIlIlIIlllIl = illIlIIllIllIIlIllII.IlIlIIIlIIlIlIIlllIl();
            final double ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII() + 0.5, array[1], true);
            final double ilIlIlIlIlllllllllIl2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl() + 0.5, array[2], true);
            ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.center.success", ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        }
        else if (array[0].equals("damage")) {
            if (array.length < 2) {
                throw new llllIllllIllllIlIlII("commands.worldborder.damage.usage", new Object[0]);
            }
            if (array[1].equals("buffer")) {
                if (array.length != 3) {
                    throw new llllIllllIllllIlIlII("commands.worldborder.damage.buffer.usage", new Object[0]);
                }
                final double llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], 0.0);
                final double ilIlIIIllIIllIlllllI = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI();
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.damage.buffer.success", String.format("%.1f", llllIIIIlIIIlIlllIll2), String.format("%.1f", ilIlIIIllIIllIlllllI));
            }
            else if (array[1].equals("amount")) {
                if (array.length != 3) {
                    throw new llllIllllIllllIlIlII("commands.worldborder.damage.amount.usage", new Object[0]);
                }
                final double llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], 0.0);
                final double iiiIlllIIIIIIlIIIlll = ilIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll();
                ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.damage.amount.success", String.format("%.2f", llllIIIIlIIIlIlllIll3), String.format("%.2f", iiiIlllIIIIIIlIIIlll));
            }
        }
        else if (array[0].equals("warning")) {
            if (array.length < 2) {
                throw new llllIllllIllllIlIlII("commands.worldborder.warning.usage", new Object[0]);
            }
            final int llllIIIIlIIIlIlllIll4 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], 0);
            if (array[1].equals("time")) {
                if (array.length != 3) {
                    throw new llllIllllIllllIlIlII("commands.worldborder.warning.time.usage", new Object[0]);
                }
                final int ilIllIlIlIIIlIlIlIII = ilIIIlIlIIIllIlIlIIl.IlIllIlIlIIIlIlIlIII();
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.warning.time.success", llllIIIIlIIIlIlllIll4, ilIllIlIlIIIlIlIlIII);
            }
            else if (array[1].equals("distance")) {
                if (array.length != 3) {
                    throw new llllIllllIllllIlIlII("commands.worldborder.warning.distance.usage", new Object[0]);
                }
                final int iIlllIIlIllIllIlIIll = ilIIIlIlIIIllIlIlIIl.IIlllIIlIllIllIlIIll();
                ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.worldborder.warning.distance.success", llllIIIIlIIIlIlllIll4, iIlllIIlIllIllIlIIll);
            }
        }
        else {
            if (!array[0].equals("get")) {
                throw new llllIllllIllllIlIlII("commands.worldborder.usage", new Object[0]);
            }
            final double liiiIlIIIIIlllIllIII2 = ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII();
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII2 + 0.5));
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.worldborder.get.success", new Object[] { String.format("%.0f", liiiIlIIIIIlllIllIII2) }));
        }
    }
    
    protected llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[0].IllIllIlllIllllIIllI();
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "set", "center", "damage", "warning", "add", "get") : ((array.length == 2 && array[0].equals("damage")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "buffer", "amount") : ((array.length >= 2 && array.length <= 3 && array[0].equals("center")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(array, 1, ilIlIlIlIlllllllllIl) : ((array.length == 2 && array[0].equals("warning")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "time", "distance") : null)));
    }
}
