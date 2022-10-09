package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class llllIIIlIlllIlIIIIIl
{
    public final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    public int IlIlIlIlIlllllllllIl;
    final /* synthetic */ IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    
    public llllIIIlIlllIlIIIIIl(final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IlIlIIIllIllIIIIIllI = 0;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.llllIIIlIlllIlIIIIIl = 127;
        this.lIIIIlIIIIIlllIllIII = 127;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.IlIIIlIlIIIllIlIlIIl = false;
            return new lllllIIIIIlIlIIIIIIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.values(), this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl + 1 - this.IlIlIIIllIllIIIIIllI, this.lIIIIlIIIIIlllIllIII + 1 - this.IllIIlllIIIIlllIIlIl);
        }
        return (this.lIIIlllIIIllIIIllIII++ % 5 == 0) ? new lllllIIIIIlIlIIIIIIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.values(), this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, 0, 0, 0, 0) : null;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.IlIlIIIllIllIIIIIllI = Math.min(this.IlIlIIIllIllIIIIIllI, n);
            this.IllIIlllIIIIlllIIlIl = Math.min(this.IllIIlllIIIIlllIIlIl, n2);
            this.llllIIIlIlllIlIIIIIl = Math.max(this.llllIIIlIlllIlIIIIIl, n);
            this.lIIIIlIIIIIlllIllIII = Math.max(this.lIIIIlIIIIIlllIllIII, n2);
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = true;
            this.IlIlIIIllIllIIIIIllI = n;
            this.IllIIlllIIIIlllIIlIl = n2;
            this.llllIIIlIlllIlIIIIIl = n;
            this.lIIIIlIIIIIlllIllIII = n2;
        }
    }
}
