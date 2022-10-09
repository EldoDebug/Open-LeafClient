package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IIIIIIIIIlllIllIlIlI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "time";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.time.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length > 1) {
            if (array[0].equals("set")) {
                int llllIIIIlIIIlIlllIll;
                if (array[1].equals("day")) {
                    llllIIIIlIIIlIlllIll = 1000;
                }
                else if (array[1].equals("night")) {
                    llllIIIIlIIIlIlllIll = 13000;
                }
                else {
                    llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1], 0);
                }
                this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.time.set", llllIIIIlIIIlIlllIll);
                return;
            }
            if (array[0].equals("add")) {
                final int llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1], 0);
                this.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, llllIIIIlIIIlIlllIll2);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.time.added", llllIIIIlIIIlIlllIll2);
                return;
            }
            if (array[0].equals("query")) {
                if (array[1].equals("daytime")) {
                    final int n = (int)(illIlIIllIllIIlIllII.k_().IlIlIllllllllIIIIlII() % 2147483647L);
                    illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, n);
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.time.query", n);
                    return;
                }
                if (array[1].equals("gametime")) {
                    final int n2 = (int)(illIlIIllIllIIlIllII.k_().IIIlIIlIIIIlllIlllII() % 2147483647L);
                    illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, n2);
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.time.query", n2);
                    return;
                }
            }
        }
        throw new llllIllllIllllIlIlII("commands.time.usage", new Object[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "set", "add", "query") : ((array.length == 2 && array[0].equals("set")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "day", "night") : ((array.length == 2 && array[0].equals("query")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "daytime", "gametime") : null));
    }
    
    protected void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final int n) {
        for (int i = 0; i < net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl.length; ++i) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll((long)n);
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final int n) {
        for (int i = 0; i < net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl.length; ++i) {
            final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[i];
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.IlIlIllllllllIIIIlII() + n);
        }
    }
}
