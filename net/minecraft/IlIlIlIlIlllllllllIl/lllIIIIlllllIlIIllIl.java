package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lllIIIIlllllIlIIllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "gamemode";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.gamemode.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length <= 0) {
            throw new llllIllllIllllIlIlII("commands.gamemode.usage", new Object[0]);
        }
        final lllIllIIIllllllIllll liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(illIlIIllIllIIlIllII, array[0]);
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (array.length >= 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[1]) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII);
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        ilIIIlIlIIIllIlIlIIl.IllIlIIllIllIIlIllII = 0.0f;
        if (illIlIIllIllIIlIllII.k_().llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("sendCommandFeedback")) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("gameMode.changed", new Object[0]));
        }
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("gameMode." + liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), new Object[0]);
        if (ilIIIlIlIIIllIlIlIIl != illIlIIllIllIIlIllII) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, 1, "commands.gamemode.success.other", ilIIIlIlIIIllIlIlIIl.s_(), illIIllIIIlIlIIIIlI);
        }
        else {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, 1, "commands.gamemode.success.self", illIIllIIIlIlIIIIlI);
        }
    }
    
    protected lllIllIIIllllllIllll lIIIIlIIIIIlllIllIII(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        return (!s.equalsIgnoreCase(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && !s.equalsIgnoreCase("s")) ? ((!s.equalsIgnoreCase(lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) && !s.equalsIgnoreCase("c")) ? ((!s.equalsIgnoreCase(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()) && !s.equalsIgnoreCase("a")) ? ((!s.equalsIgnoreCase(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) && !s.equalsIgnoreCase("sp")) ? IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, 0, lllIllIIIllllllIllll.values().length - 2)) : lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) : lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) : lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) : lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "survival", "creative", "adventure", "spectator") : ((array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : null);
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 1;
    }
}
