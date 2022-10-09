package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class IIlllIlIIllIlIlIlIIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "tp";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.tp.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 1) {
            throw new llllIllllIllllIlIlII("commands.tp.usage", new Object[0]);
        }
        int n = 0;
        llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
        if (array.length != 2 && array.length != 4 && array.length != 6) {
            llIllIIIIIllIlIIIIlI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII);
        }
        else {
            llIllIIIIIllIlIIIIlI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[0]);
            n = 1;
        }
        if (array.length != 1 && array.length != 2) {
            if (array.length < n + 3) {
                throw new llllIllllIllllIlIlII("commands.tp.usage", new Object[0]);
            }
            if (llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII != null) {
                int n2 = n + 1;
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, array[n], true);
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, array[n2++], 0, 0, false);
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, array[n2++], true);
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, (array.length > n2) ? array[n2++] : "~", false);
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll5 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI, (array.length > n2) ? array[n2] : "~", false);
                if (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
                    final EnumSet<llIIlIIIlIIIllIlIIIl> none = EnumSet.noneOf(llIIlIIIlIIIllIlIIIl.class);
                    if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                        none.add(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
                    }
                    if (llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI()) {
                        none.add(llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl);
                    }
                    if (llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI()) {
                        none.add(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI);
                    }
                    if (llllIIIIlIIIlIlllIll5.llIllIIIIIllIlIIIIlI()) {
                        none.add(llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI);
                    }
                    if (llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI()) {
                        none.add(llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl);
                    }
                    float n3 = (float)llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl();
                    if (!llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI()) {
                        n3 = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n3);
                    }
                    float n4 = (float)llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl();
                    if (!llllIIIIlIIIlIlllIll5.llIllIIIIIllIlIIIIlI()) {
                        n4 = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n4);
                    }
                    if (n4 > 90.0f || n4 < -90.0f) {
                        n4 = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(180.0f - n4);
                        n3 = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n3 + 180.0f);
                    }
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
                    ((IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(), n3, n4, none);
                    llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII(n3);
                }
                else {
                    float llllIIIlIlllIlIIIIIl = (float)llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll());
                    float llllIIIlIlllIlIIIIIl2 = (float)llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll());
                    if (llllIIIlIlllIlIIIIIl2 > 90.0f || llllIIIlIlllIlIIIIIl2 < -90.0f) {
                        llllIIIlIlllIlIIIIIl2 = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(180.0f - llllIIIlIlllIlIIIIIl2);
                        llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl + 180.0f);
                    }
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(), llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                    llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII(llllIIIlIlllIlIIIIIl);
                }
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.tp.success.coordinates", llIllIIIIIllIlIIIIlI.s_(), llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll());
            }
        }
        else {
            final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[array.length - 1]);
            if (ilIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII != llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.tp.notSameDimension", new Object[0]);
            }
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
            if (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
                ((IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII, ilIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll, ilIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
            }
            else {
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII, ilIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll, ilIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
            }
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.tp.success", llIllIIIIIllIlIIIIlI.s_(), ilIlIlIlIlllllllllIl.s_());
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length != 1 && array.length != 2) ? null : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI());
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
