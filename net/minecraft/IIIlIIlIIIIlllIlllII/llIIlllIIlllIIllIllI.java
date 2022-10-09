package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.*;

public class llIIlllIIlllIIllIllI extends lllllIlIIIlIlIIlllII
{
    public void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI = new IlIIIlIIIllllIlIlIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII, 0.0f);
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IlIlIIIllIllIIIIIllI = true;
        this.llllIIIlIlllIlIIIIIl = -1;
    }
    
    @Override
    public e IlIlIlIlIlllllllllIl(final float n, final float n2) {
        return new e(0.20000000298023224, 0.029999999329447746, 0.029999999329447746);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll() {
        final float n = 0.1f;
        for (int i = 0; i <= 15; ++i) {
            final float n2 = 1.0f - i / 15.0f;
            this.IllIIlllIIIIlllIIlIl[i] = (1.0f - n2) / (n2 * 3.0f + 1.0f) * (1.0f - n) + n;
        }
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return new IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().lllIIIIlllllIlIIllIl(), this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII());
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return false;
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final long n, final float n2) {
        return 0.5f;
    }
    
    @Override
    public boolean IlIlIIIllIllIIIIIllI() {
        return false;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return true;
    }
    
    @Override
    public String llIllIlIIIIllIlIIllI() {
        return "Nether";
    }
    
    @Override
    public String lIlIlIIIllIIllIIIllI() {
        return "_nether";
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI lllIIIIlllllIlIIllIl() {
        return new IIlllIIIlIlllIIlllII(this);
    }
}
