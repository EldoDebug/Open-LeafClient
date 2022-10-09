package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import java.io.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIIIlIlIIIllIlIlIIl extends lIlIlIIIllIIllIIIllI
{
    public IlIIIlIlIIIllIlIlIIl(final File file, final String s, final boolean b) {
        super(file, s, b);
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        final File illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl();
        if (lllllIlIIIlIlIIlllII instanceof llIIlllIIlllIIllIllI) {
            final File file = new File(illIIlllIIIIlllIIlIl, "DIM-1");
            file.mkdirs();
            return new llllIIIIlIIIlIlllIll(file);
        }
        if (lllllIlIIIlIlIIlllII instanceof lIllllllIIllIlIlIlII) {
            final File file2 = new File(illIIlllIIIIlllIIlIl, "DIM1");
            file2.mkdirs();
            return new llllIIIIlIIIlIlllIll(file2);
        }
        return new llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(19133);
        super.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        try {
            net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
    }
}
