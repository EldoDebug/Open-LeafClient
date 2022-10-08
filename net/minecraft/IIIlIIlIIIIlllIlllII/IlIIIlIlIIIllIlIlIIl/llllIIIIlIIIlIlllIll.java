package net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class llllIIIIlIIIlIlllIll extends IlIIIlIlIIIllIlIlIIl
{
    private boolean llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        ++this.IllIIlllIIIIlllIIlIl;
        final long iiIlIIlIIIIlllIlllII = this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII();
        final long n = iiIlIIlIIIIlllIlllII / 24000L + 1L;
        if (!this.llIllIIIIIllIlIIIIlI && this.IllIIlllIIIIlllIIlIl > 20) {
            this.llIllIIIIIllIlIIIIlI = true;
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(5, 0.0f));
        }
        this.IlIIIlIlIIIllIlIlIIl = (iiIlIIlIIIIlllIlllII > 120500L);
        if (this.IlIIIlIlIIIllIlIlIIl) {
            ++this.IlIlIIIllIllIIIIIllI;
        }
        if (iiIlIIlIIIIlllIlllII % 24000L == 500L) {
            if (n <= 6L) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("demo.day." + n, new Object[0]));
            }
        }
        else if (n == 1L) {
            if (iiIlIIlIIIIlllIlllII == 100L) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(5, 101.0f));
            }
            else if (iiIlIIlIIIIlllIlllII == 175L) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(5, 102.0f));
            }
            else if (iiIlIIlIIIIlllIlllII == 250L) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(5, 103.0f));
            }
        }
        else if (n == 5L && iiIlIIlIIIIlllIlllII % 24000L == 22000L) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("demo.day.warning", new Object[0]));
        }
    }
    
    private void IllIIlllIIIIlllIIlIl() {
        if (this.IlIlIIIllIllIIIIIllI > 100) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("demo.reminder", new Object[0]));
            this.IlIlIIIllIllIIIIIllI = 0;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.IllIIlllIIIIlllIIlIl();
        }
        else {
            super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.IlIIIlIlIIIllIlIlIIl) {
            super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return !this.IlIIIlIlIIIllIlIlIIl && super.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.IllIIlllIIIIlllIIlIl();
            return false;
        }
        return super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.IllIIlllIIIIlllIIlIl();
            return false;
        }
        return super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, lllIIIIlIlIllIIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3);
    }
}
