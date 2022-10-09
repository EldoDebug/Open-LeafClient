package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIllIlIlIIIIIIIllII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "weather";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.weather.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length >= 1 && array.length <= 2) {
            int n = (300 + new Random().nextInt(600)) * 20;
            if (array.length >= 2) {
                n = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1], 1, 1000000) * 20;
            }
            final llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[0].lIllllllIIllIlIlIlII();
            if ("clear".equalsIgnoreCase(array[0])) {
                lIllllllIIllIlIlIlII.llllIIIlIlllIlIIIIIl(n);
                lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl(0);
                lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI(0);
                lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl(false);
                lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(false);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.weather.clear", new Object[0]);
            }
            else if ("rain".equalsIgnoreCase(array[0])) {
                lIllllllIIllIlIlIlII.llllIIIlIlllIlIIIIIl(0);
                lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl(n);
                lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI(n);
                lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl(true);
                lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(false);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.weather.rain", new Object[0]);
            }
            else {
                if (!"thunder".equalsIgnoreCase(array[0])) {
                    throw new llllIllllIllllIlIlII("commands.weather.usage", new Object[0]);
                }
                lIllllllIIllIlIlIlII.llllIIIlIlllIlIIIIIl(0);
                lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl(n);
                lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI(n);
                lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl(true);
                lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(true);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.weather.thunder", new Object[0]);
            }
            return;
        }
        throw new llllIllllIllllIlIlII("commands.weather.usage", new Object[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "clear", "rain", "thunder") : null;
    }
}
