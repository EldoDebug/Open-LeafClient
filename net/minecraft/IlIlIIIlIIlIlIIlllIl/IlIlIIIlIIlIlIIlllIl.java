package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IlIlIIIlIIlIlIIlllIl extends IlIIIlIlIIIllIlIlIIl implements llIIIllIlIllIllIIIIl
{
    public float IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (++this.lIIIIlIIIIIlllIllIII % 20 * 4 == 0) {
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U, 1, this.llllIIIlIlllIlIIIIIl);
        }
        this.IllIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI;
        final int liiiIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        final float n = 0.1f;
        if (this.llllIIIlIlllIlIIIIIl > 0 && this.IlIlIIIllIllIIIIIllI == 0.0f) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII + 0.5, liiIlllIIIllIIIllIII + 0.5, llIIlIIIlIIIllIlIIIl + 0.5, "random.chestopen", 0.5f, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f);
        }
        if ((this.llllIIIlIlllIlIIIIIl == 0 && this.IlIlIIIllIllIIIIIllI > 0.0f) || (this.llllIIIlIlllIlIIIIIl > 0 && this.IlIlIIIllIllIIIIIllI < 1.0f)) {
            final float ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
            if (this.llllIIIlIlllIlIIIIIl > 0) {
                this.IlIlIIIllIllIIIIIllI += n;
            }
            else {
                this.IlIlIIIllIllIIIIIllI -= n;
            }
            if (this.IlIlIIIllIllIIIIIllI > 1.0f) {
                this.IlIlIIIllIllIIIIIllI = 1.0f;
            }
            final float n2 = 0.5f;
            if (this.IlIlIIIllIllIIIIIllI < n2 && ilIlIIIllIllIIIIIllI >= n2) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII + 0.5, liiIlllIIIllIIIllIII + 0.5, llIIlIIIlIIIllIlIIIl + 0.5, "random.chestclosed", 0.5f, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f);
            }
            if (this.IlIlIIIllIllIIIIIllI < 0.0f) {
                this.IlIlIIIllIllIIIIIllI = 0.0f;
            }
        }
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int llllIIIlIlllIlIIIIIl) {
        if (n == 1) {
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            return true;
        }
        return super.llIllIIIIIllIlIIIIlI(n, llllIIIlIlllIlIIIIIl);
    }
    
    @Override
    public void IlIllIlIlIIIlIlIlIII() {
        this.lllIIIIlllllIlIIllIl();
        super.IlIllIlIlIIIlIlIlIII();
    }
    
    public void IlIlIlIlIlllllllllIl() {
        ++this.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U, 1, this.llllIIIlIlllIlIIIIIl);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        --this.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U, 1, this.llllIIIlIlllIlIIIIIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl) == this && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
    }
}
