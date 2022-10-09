package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import com.google.common.collect.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import java.util.*;

public class IIIIIllIIIIlIIIIllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "stats";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.stats.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.stats.usage", new Object[0]);
        }
        boolean b;
        if (array[0].equals("entity")) {
            b = false;
        }
        else {
            if (!array[0].equals("block")) {
                throw new llllIllllIllllIlIlII("commands.stats.usage", new Object[0]);
            }
            b = true;
        }
        int n;
        if (b) {
            if (array.length < 5) {
                throw new llllIllllIllllIlIlII("commands.stats.block.usage", new Object[0]);
            }
            n = 4;
        }
        else {
            if (array.length < 3) {
                throw new llllIllllIllllIlIlII("commands.stats.entity.usage", new Object[0]);
            }
            n = 2;
        }
        final String s = array[n++];
        if ("set".equals(s)) {
            if (array.length < n + 3) {
                if (n == 5) {
                    throw new llllIllllIllllIlIlII("commands.stats.block.set.usage", new Object[0]);
                }
                throw new llllIllllIllllIlIlII("commands.stats.entity.set.usage", new Object[0]);
            }
        }
        else {
            if (!"clear".equals(s)) {
                throw new llllIllllIllllIlIlII("commands.stats.usage", new Object[0]);
            }
            if (array.length < n + 1) {
                if (n == 5) {
                    throw new llllIllllIllllIlIlII("commands.stats.block.clear.usage", new Object[0]);
                }
                throw new llllIllllIllllIlIlII("commands.stats.entity.clear.usage", new Object[0]);
            }
        }
        final lIllllllIIllIlIlIlII llllIIIIlIIIlIlllIll = lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(array[n++]);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.stats.failed", new Object[0]);
        }
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII;
        if (b) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 1, false);
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            if (llllIIIIlIIIlIlllIll3 == null) {
                throw new IIIIlllIIIIIIlIIIlll("commands.stats.noCompatibleBlock", new Object[] { llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() });
            }
            if (llllIIIIlIIIlIlllIll3 instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIIlllIIIIIIlIIIlll) {
                llIIIlIlIllIIlIlIlII = ((net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll3).IlIlIlIlIlllllllllIl();
            }
            else {
                if (!(llllIIIIlIIIlIlllIll3 instanceof llIIlllIIlllIIllIllI)) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.stats.noCompatibleBlock", new Object[] { llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() });
                }
                llIIIlIlIllIIlIlIlII = ((llIIlllIIlllIIllIllI)llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI();
            }
        }
        else {
            llIIIlIlIllIIlIlIlII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[1]).b();
        }
        if ("set".equals(s)) {
            final String s2 = array[n++];
            final String s3 = array[n];
            if (s2.length() == 0 || s3.length() == 0) {
                throw new IIIIlllIIIIIIlIIIlll("commands.stats.failed", new Object[0]);
            }
            net.minecraft.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll, s2, s3);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.stats.success", llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), s3, s2);
        }
        else if ("clear".equals(s)) {
            net.minecraft.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll, null, null);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.stats.cleared", llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
        }
        if (b) {
            k_.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 1, false)).llIIIlIlIllIIlIlIlII();
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "entity", "block") : ((array.length == 2 && array[0].equals("entity")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : ((array.length >= 2 && array.length <= 4 && array[0].equals("block")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 1, ilIlIlIlIlllllllllIl) : (((array.length != 3 || !array[0].equals("entity")) && (array.length != 5 || !array[0].equals("block"))) ? (((array.length != 4 || !array[0].equals("entity")) && (array.length != 6 || !array[0].equals("block"))) ? (((array.length != 6 || !array[0].equals("entity")) && (array.length != 8 || !array[0].equals("block"))) ? null : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIlIIIllIllIIIIIllI())) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI())) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "set", "clear"))));
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    protected List IlIlIIIllIllIIIIIllI() {
        final Collection llllIIIIlIIIlIlllIll = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(0).IlllIIIIlIIIlIlIlIIl().llllIIIIlIIIlIlllIll();
        final ArrayList arrayList = Lists.newArrayList();
        for (final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII : llllIIIIlIIIlIlllIll) {
            if (!liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl()) {
                arrayList.add(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return array.length > 0 && array[0].equals("entity") && n == 1;
    }
}
