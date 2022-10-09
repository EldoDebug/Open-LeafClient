package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IIlllIlIIllIlIlIlIIl extends llllIIIIlIIIlIlllIll
{
    private static final Map llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = Maps.newHashMap();
        for (int i = 0; i < 54; ++i) {
            IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.container." + i, i);
        }
        for (int j = 0; j < 9; ++j) {
            IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.hotbar." + j, j);
        }
        for (int k = 0; k < 27; ++k) {
            IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.inventory." + k, 9 + k);
        }
        for (int l = 0; l < 27; ++l) {
            IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.enderchest." + l, 200 + l);
        }
        for (int n = 0; n < 8; ++n) {
            IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.villager." + n, 300 + n);
        }
        for (int n2 = 0; n2 < 15; ++n2) {
            IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.horse." + n2, 500 + n2);
        }
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.weapon", 99);
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.armor.head", 103);
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.armor.chest", 102);
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.armor.legs", 101);
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.armor.feet", 100);
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.horse.saddle", 400);
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.horse.armor", 401);
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.put("slot.horse.chest", 499);
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "replaceitem";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.replaceitem.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.replaceitem.usage", new Object[0]);
        }
        boolean b;
        if (array[0].equals("entity")) {
            b = false;
        }
        else {
            if (!array[0].equals("block")) {
                throw new llllIllllIllllIlIlII("commands.replaceitem.usage", new Object[0]);
            }
            b = true;
        }
        int n;
        if (b) {
            if (array.length < 6) {
                throw new llllIllllIllllIlIlII("commands.replaceitem.block.usage", new Object[0]);
            }
            n = 4;
        }
        else {
            if (array.length < 4) {
                throw new llllIllllIllllIlIlII("commands.replaceitem.entity.usage", new Object[0]);
            }
            n = 2;
        }
        final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(array[n++]);
        IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl;
        try {
            illIIlllIIIIlllIIlIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(illIlIIllIllIIlIllII, array[n]);
        }
        catch (lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl) {
            if (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n]) != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                throw liIlIIIlIllIlIllIIIl;
            }
            illIIlllIIIIlllIIlIl = null;
        }
        ++n;
        final int n2 = (array.length > n) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n++], 1, 64) : 1;
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(illIIlllIIIIlllIIlIl, n2, (array.length > n) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n++]) : 0);
        if (array.length > n) {
            final String liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, n).lIIIIlIIIIIlllIllIII();
            try {
                lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII));
            }
            catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.replaceitem.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == null) {
            lllIIIIlIlIllIIlIIIl = null;
        }
        if (b) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, 0);
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 1, false);
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illIlIIllIllIIlIllII.k_().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll2 == null || !(llllIIIIlIIIlIlllIll2 instanceof llIIIlIlIllIIlIlIlII)) {
                throw new IIIIlllIIIIIIlIIIlll("commands.replaceitem.noContainer", new Object[] { llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() });
            }
            final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII = (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll2;
            if (ilIlIIIllIllIIIIIllI >= 0 && ilIlIIIllIllIIIIIllI < llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII()) {
                llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl);
            }
        }
        else {
            final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[1]);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, 0);
            if (ilIlIlIlIlllllllllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)ilIlIlIlIlllllllllIl).IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
            }
            if (!ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl)) {
                throw new IIIIlllIIIIIIlIIIlll("commands.replaceitem.failed", new Object[] { ilIlIIIllIllIIIIIllI, n2, (lllIIIIlIlIllIIlIIIl == null) ? "Air" : lllIIIIlIlIllIIlIIIl.lllllIlIIIlIlIIlllII() });
            }
            if (ilIlIlIlIlllllllllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)ilIlIlIlIlllllllllIl).IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
            }
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, n2);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.replaceitem.success", ilIlIIIllIllIIIIIllI, n2, (lllIIIIlIlIllIIlIIIl == null) ? "Air" : lllIIIIlIlIllIIlIIIl.lllllIlIIIlIlIIlllII());
    }
    
    private int IlIlIIIllIllIIIIIllI(final String s) {
        if (!IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.containsKey(s)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.generic.parameter.invalid", new Object[] { s });
        }
        return IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.get(s);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "entity", "block") : ((array.length == 2 && array[0].equals("entity")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : ((array.length >= 2 && array.length <= 4 && array[0].equals("block")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 1, ilIlIlIlIlllllllllIl) : (((array.length != 3 || !array[0].equals("entity")) && (array.length != 5 || !array[0].equals("block"))) ? (((array.length != 4 || !array[0].equals("entity")) && (array.length != 6 || !array[0].equals("block"))) ? null : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI())) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.keySet()))));
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return array.length > 0 && array[0].equals("entity") && n == 1;
    }
}
