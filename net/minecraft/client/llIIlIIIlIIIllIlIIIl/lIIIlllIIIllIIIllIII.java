package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.io.*;

public class lIIIlllIIIllIIIllIII implements IIIIlllIIIIIIlIIIlll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/colormap/grass.png");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        try {
            IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll));
        }
        catch (IOException ex) {}
    }
}
