package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lIlIlIIIllIIllIIIllI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "enchant";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.enchant.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII("commands.enchant.usage", new Object[0]);
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0]);
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, 0);
        int n;
        try {
            n = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1], 0);
        }
        catch (lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl) {
            final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1]);
            if (llllIIIIlIIIlIlllIll2 == null) {
                throw liIlIIIlIllIlIllIIIl;
            }
            n = llllIIIIlIIIlIlllIll2.IIlllIlIIllIlIlIlIIl;
        }
        int llllIIIIlIIIlIlllIll3 = 1;
        final lllIIIIlIlIllIIlIIIl p2 = llllIIIIlIIIlIlllIll.p();
        if (p2 == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.enchant.noItem", new Object[0]);
        }
        final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
        if (llllIIIIlIIIlIlllIll4 == null) {
            throw new lIIlIIIlIllIlIllIIIl("commands.enchant.notFound", new Object[] { n });
        }
        if (!llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(p2)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.enchant.cantEnchant", new Object[0]);
        }
        if (array.length >= 3) {
            llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl());
        }
        if (p2.IIIIlllIIIIIIlIIIlll()) {
            final IlIlIIIlIIlIlIIlllIl ilIllIlIlIIIlIlIlIII = p2.IlIllIlIlIIIlIlIlIII();
            if (ilIllIlIlIIIlIlIlIII != null) {
                for (int i = 0; i < ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI(); ++i) {
                    final short ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("id");
                    if (net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI) != null) {
                        final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
                        if (!llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4)) {
                            throw new IIIIlllIIIIIIlIIIlll("commands.enchant.cantCombine", new Object[] { llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll3), llllIIIIlIIIlIlllIll5.IlIIIlIlIIIllIlIlIIl(ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("lvl")) });
                        }
                    }
                }
            }
        }
        p2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll3);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.enchant.success", new Object[0]);
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, 1);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : ((array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) : null);
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
