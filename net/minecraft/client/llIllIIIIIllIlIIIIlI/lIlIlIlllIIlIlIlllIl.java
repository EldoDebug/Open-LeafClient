package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;

public class lIlIlIlllIIlIlIlllIl implements IIIIIIIIIlllIllIlIlI
{
    private final Minecraft llllIIIIlIIIlIlllIll;
    private final IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private final IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    
    public lIlIlIlllIIlIlIlllIl(final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl, final IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = Minecraft.getMinecraft();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        if (this.IlIlIlIlIlllllllllIl != null) {
            this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII = n3;
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, n6, n7);
        }
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = n3;
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, n6, n7);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll, n2, n3)) {
            if (this.IlIlIlIlIlllllllllIl instanceof llIlIIIIIlIIlIlIIlll) {
                this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)this.IlIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI(), 1);
                this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI));
            }
            return true;
        }
        if (this.llIllIIIIIllIlIIIIlI != null && this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll, n2, n3)) {
            if (this.llIllIIIIIllIlIIIIlI instanceof llIlIIIIIlIIlIlIIlll) {
                this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)this.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(), 1);
                this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI));
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (this.IlIlIlIlIlllllllllIl != null) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2, n3);
        }
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
}
