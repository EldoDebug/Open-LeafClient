package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IIlllllIllIllIlIlIII extends IlIIlllllIIllIIlllll
{
    private int llllIIllllIlIlIIIIll;
    
    public IIlllllIllIllIlIlIII() {
    }
    
    public IIlllllIllIllIlIlIII(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        super(1, lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, 1, 1, 1);
        this.llllIIllllIlIlIIIIll = random.nextInt(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll / 25 > 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
        }
        if (this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 1, 6, 4, 6, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll);
        }
        final boolean b = this.llllIIllllIlIlIIIIll != 0 && random.nextBoolean() && !this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()] && !this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] && this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI() > 1;
        if (this.llllIIllllIlIlIIIIll == 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 2, 1, 2, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 0, 2, 3, 2, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 0, 0, 2, 2, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 0, 2, 2, 0, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 1, 2, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 0, 7, 1, 2, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 3, 0, 7, 3, 2, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 0, 7, 2, 2, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 2, 0, 6, 2, 0, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 6, 2, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 5, 2, 1, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 5, 2, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 5, 0, 2, 7, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 7, 2, 2, 7, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 1, 2, 6, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 5, 7, 1, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 3, 5, 7, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 5, 7, 2, 7, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 2, 7, 6, 2, 7, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 6, 2, 6, ilIlIIIlIIlIlIIlllIl);
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 3, 0, 4, 3, 0, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            else {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 3, 0, 4, 3, 1, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 2, 0, 4, 2, 0, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 4, 1, 1, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 3, 7, 4, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            else {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 3, 6, 4, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 2, 7, 4, 2, 7, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 6, 4, 1, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 3, 0, 3, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            else {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 3, 1, 3, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 3, 0, 2, 4, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 3, 1, 1, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 3, 3, 7, 3, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            else {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 3, 3, 7, 3, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 3, 7, 2, 4, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 3, 7, 1, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
        }
        else if (this.llllIIllllIlIlIIIIll == 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 2, 2, 3, 2, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 5, 2, 3, 5, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 5, 5, 3, 5, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 2, 5, 3, 2, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 2, 2, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 2, 2, 5, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 5, 2, 5, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII, 5, 2, 2, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 1, 3, 0, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 1, 0, 3, 1, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 7, 1, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 6, 0, 3, 6, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 7, 7, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 6, 7, 3, 6, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 0, 7, 3, 0, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 1, 7, 3, 1, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 1, 2, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 0, 2, 1, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 1, 2, 7, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 0, 2, 6, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 6, 2, 7, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 7, 2, 6, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 6, 2, 0, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, 7, 2, 1, ilIlIIIlIIlIlIIlllIl);
            if (!this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 0, 6, 3, 0, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 0, 6, 2, 0, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 0, 6, 1, 0, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            if (!this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 7, 6, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 7, 6, 2, 7, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 7, 6, 1, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            if (!this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 1, 0, 3, 6, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 1, 0, 2, 6, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 1, 0, 1, 6, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
            if (!this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 3, 1, 7, 3, 6, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 1, 7, 2, 6, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 1, 7, 1, 6, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            }
        }
        else if (this.llllIIllllIlIlIIIIll == 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 0, 1, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 0, 7, 1, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 0, 6, 1, 0, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 7, 6, 1, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 0, 0, 2, 7, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 0, 7, 2, 7, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 0, 6, 2, 0, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 7, 6, 2, 7, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 0, 0, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 3, 0, 7, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 0, 6, 3, 0, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 7, 6, 3, 7, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 3, 0, 2, 4, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 3, 7, 2, 4, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 4, 2, 0, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 7, 4, 2, 7, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI, false);
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 4, 2, 0, false);
            }
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 7, 4, 2, 7, false);
            }
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 3, 0, 2, 4, false);
            }
            if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 3, 7, 2, 4, false);
            }
        }
        if (b) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 3, 4, 1, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 2, 3, 4, 2, 4, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 3, 3, 4, 3, 4, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl, false);
        }
        return true;
    }
}
