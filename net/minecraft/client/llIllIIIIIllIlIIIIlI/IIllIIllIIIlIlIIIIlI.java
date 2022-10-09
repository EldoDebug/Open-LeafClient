package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.optifine.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IIllIIllIIIlIlIIIIlI extends lIIllIIIllllIlllIllI
{
    private lIIIIlIIIIIlllIllIII IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private IIlIIIIIllIlIIIlIIll llllIIIlIlllIlIIIIIl;
    
    public IIllIIllIIIlIlIIIIlI(final lIIIIlIIIIIlllIllIII ilIlIIIllIllIIIIIllI) {
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        ++this.IllIIlllIIIIlllIIlIl;
        if (this.IllIIlllIIIIlllIIlIl % 20 == 0) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(new llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        if (this.llllIIIlIlllIlIIIIIl != null) {
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII);
        }
        else {
            this.llIllIIIIIllIlIIIIlI(0);
        }
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("multiplayer.downloadingTerrain", new Object[0]), this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2 - 50, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return false;
    }
}
