package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.io.*;

public class lIIIIlIIIIIlllIllIII implements IIIIlllIIIIIIlIIIlll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/colormap/foliage.png");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        try {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll));
        }
        catch (IOException ex) {}
    }
}
