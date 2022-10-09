package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

class lIllllIllIllIIllllll extends IIlIIIIlllIlllllIlII
{
    private lIllllIllIllIIllllll() {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Random random, final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            final float nextFloat = random.nextFloat();
            if (nextFloat < 0.2f) {
                this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.llIllIIIIIllIlIIIIlI(cv.lllIllIIIllllllIllll);
            }
            else if (nextFloat < 0.5f) {
                this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.llIllIIIIIllIlIIIIlI(cv.IlllIIIIlIIIlIlIlIIl);
            }
            else if (nextFloat < 0.55f) {
                this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i.llIllIIIIIllIlIIIIlI(bt.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl());
            }
            else {
                this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j.lllIllIIIllllllIllll();
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        }
    }
}
