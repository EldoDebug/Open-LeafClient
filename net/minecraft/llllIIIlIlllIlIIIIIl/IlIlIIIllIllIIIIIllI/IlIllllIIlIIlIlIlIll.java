package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;

public class IlIllllIIlIIlIlIlIll implements llIIIlIlIllIIlIlIlII
{
    public int llllIIIIlIIIlIlllIll;
    
    public void llllIIIIlIIIlIlllIll(final Random random) {
        final int nextInt = random.nextInt(5);
        if (nextInt <= 1) {
            this.llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI;
        }
        else if (nextInt <= 2) {
            this.llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llllllIllIllIlIllllI;
        }
        else if (nextInt <= 3) {
            this.llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllllIllIllIlIllllI;
        }
        else if (nextInt <= 4) {
            this.llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.llllllIllIllIlIllllI;
        }
    }
}
