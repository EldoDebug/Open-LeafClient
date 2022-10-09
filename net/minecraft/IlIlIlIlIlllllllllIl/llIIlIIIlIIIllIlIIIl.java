package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIIlIIIlIIIllIlIIIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "difficulty";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.difficulty.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length <= 0) {
            throw new llllIllllIllllIlIlII("commands.difficulty.usage", new Object[0]);
        }
        final IllIIlllIIIIlllIIlIl ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(array[0]);
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.difficulty.success", new IIllIIllIIIlIlIIIIlI(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), new Object[0]));
    }
    
    protected IllIIlllIIIIlllIIlIl IlIlIIIllIllIIIIIllI(final String s) {
        return (!s.equalsIgnoreCase("peaceful") && !s.equalsIgnoreCase("p")) ? ((!s.equalsIgnoreCase("easy") && !s.equalsIgnoreCase("e")) ? ((!s.equalsIgnoreCase("normal") && !s.equalsIgnoreCase("n")) ? ((!s.equalsIgnoreCase("hard") && !s.equalsIgnoreCase("h")) ? IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, 0, 3)) : IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) : IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI) : IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl) : IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "peaceful", "easy", "normal", "hard") : null;
    }
}
