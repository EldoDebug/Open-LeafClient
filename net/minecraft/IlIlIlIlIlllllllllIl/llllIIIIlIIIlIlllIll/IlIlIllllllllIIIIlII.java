package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIllllllllIIIIlII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "summon";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.summon.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.summon.usage", new Object[0]);
        }
        final String s = array[0];
        IlIlIlIlIlllllllllIl ilIlIIIlIIlIlIIlllIl = illIlIIllIllIIlIllII.IlIlIIIlIIlIlIIlllIl();
        final e j_ = illIlIIllIllIIlIllII.j_();
        double n = j_.llllIIIIlIIIlIlllIll;
        double n2 = j_.IlIlIlIlIlllllllllIl;
        double n3 = j_.llIllIIIIIllIlIIIIlI;
        if (array.length >= 4) {
            n = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n, array[1], true);
            n2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n2, array[2], false);
            n3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n3, array[3], true);
            ilIlIIIlIIlIlIIlllIl = new IlIlIlIlIlllllllllIl(n, n2, n3);
        }
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        if (!k_.IllIIlllIIIIlllIIlIl(ilIlIIIlIIlIlIIlllIl)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.summon.outOfWorld", new Object[0]);
        }
        if ("LightningBolt".equals(s)) {
            k_.IlIlIIIllIllIIIIIllI(new net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(k_, n, n2, n3));
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.summon.success", new Object[0]);
        }
        else {
            net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
            boolean b = false;
            if (array.length >= 5) {
                final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 4);
                try {
                    llllIIIIlIIIlIlllIll = net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII());
                    b = true;
                }
                catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.summon.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
                }
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("id", s);
            llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll3;
            try {
                llllIIIIlIIIlIlllIll3 = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, k_);
            }
            catch (RuntimeException ex) {
                throw new IIIIlllIIIIIIlIIIlll("commands.summon.failed", new Object[0]);
            }
            if (llllIIIIlIIIlIlllIll3 == null) {
                throw new IIIIlllIIIIIIlIIIlll("commands.summon.failed", new Object[0]);
            }
            llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(n, n2, n3, llllIIIIlIIIlIlllIll3.IIlIIIIIllIlIIIlIIll, llllIIIIlIIIlIlllIll3.llllllIllIllIlIllllI);
            if (!b && llllIIIIlIIIlIlllIll3 instanceof IlIllIlIlIIIlIlIlIII) {
                ((IlIllIlIlIIIlIlIlIII)llllIIIIlIIIlIlllIll3).llllIIIIlIIIlIlllIll(k_.lIllllllIIllIlIlIlII(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3)), null);
            }
            k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
            llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll3;
            llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll4;
            for (net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll; llIllIIIIIllIlIIIIlI != null && ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Riding", 10); llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll4, ilIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI("Riding")) {
                llllIIIIlIIIlIlllIll4 = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI("Riding"), k_);
                if (llllIIIIlIIIlIlllIll4 != null) {
                    llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl(n, n2, n3, llllIIIIlIIIlIlllIll4.IIlIIIIIllIlIIIlIIll, llllIIIIlIIIlIlllIll4.llllllIllIllIlIllllI);
                    k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
                }
            }
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.summon.success", new Object[0]);
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl()) : ((array.length > 1 && array.length <= 4) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 1, ilIlIlIlIlllllllllIl) : null);
    }
}
