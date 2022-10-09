package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;

public abstract class IIIIIllIIIIlIIIIllIl extends lllIIIIlIlIllIIlIIIl
{
    public IIIIIllIIIIlIIIIllIl(final Minecraft minecraft, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(minecraft, n, n2, n3, n4, n5);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return false;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIlIlIlllllllllIl(n).llllIIIIlIIIlIlllIll(n, n2, n3, this.m_(), n4, n5, n6, this.llIllIIIIIllIlIIIIlI(n5, n6) == n);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.IlIlIlIlIlllllllllIl(n).llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        if (this.IllIIlllIIIIlllIIlIl(n2)) {
            final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(n, n2);
            if (llIllIIIIIllIlIIIIlI >= 0 && this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n - (this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl / 2 - this.m_() / 2 + 2), n2 - (this.IllIIlllIIIIlllIIlIl + 4 - this.IIIIlllIIIIIIlIIIlll() + llIllIIIIIllIlIIIIlI * this.llIIlIIIlIIIllIlIIIl + this.IlIlIIIlIIlIlIIlllIl))) {
                this.llIllIIIIIllIlIIIIlI(false);
                return true;
            }
        }
        return false;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll(); ++i) {
            this.IlIlIlIlIlllllllllIl(i).IlIlIlIlIlllllllllIl(i, n, n2, n3, n - (this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl / 2 - this.m_() / 2 + 2), n2 - (this.IllIIlllIIIIlllIIlIl + 4 - this.IIIIlllIIIIIIlIIIlll() + i * this.llIIlIIIlIIIllIlIIIl + this.IlIlIIIlIIlIlIIlllIl));
        }
        this.llIllIIIIIllIlIIIIlI(true);
        return false;
    }
    
    public abstract IIIIIIIIIlllIllIlIlI IlIlIlIlIlllllllllIl(final int p0);
}
