package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIllllllIIllIlIlIlII extends lllllIlIIIlIlIIlllII
{
    public void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI = new IlIIIlIIIllllIlIlIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIlIIlIIIIlllIlllII, 0.0f);
        this.llllIIIlIlllIlIIIIIl = 1;
        this.IlIlIIIllIllIIIIIllI = true;
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return new IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII());
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final long n, final float n2) {
        return 0.0f;
    }
    
    @Override
    public float[] llllIIIIlIIIlIlllIll(final float n, final float n2) {
        return null;
    }
    
    @Override
    public e IlIlIlIlIlllllllllIl(final float n, final float n2) {
        final int n3 = 10518688;
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 3.1415927f * 2.0f) * 2.0f + 0.5f, 0.0f, 1.0f);
        return new e((n3 >> 16 & 0xFF) / 255.0f * (llllIIIIlIIIlIlllIll * 0.0f + 0.15f), (n3 >> 8 & 0xFF) / 255.0f * (llllIIIIlIIIlIlllIll * 0.0f + 0.15f), (n3 & 0xFF) / 255.0f * (llllIIIIlIIIlIlllIll * 0.0f + 0.15f));
    }
    
    @Override
    public boolean llllIIIlIlllIlIIIIIl() {
        return false;
    }
    
    @Override
    public boolean IlIlIIIllIllIIIIIllI() {
        return false;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return false;
    }
    
    @Override
    public float IllIIlllIIIIlllIIlIl() {
        return 8.0f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n, 0, n2)).IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl lIIIIlIIIIIlllIllIII() {
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(100, 50, 0);
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 50;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return true;
    }
    
    @Override
    public String llIllIlIIIIllIlIIllI() {
        return "The End";
    }
    
    @Override
    public String lIlIlIIIllIIllIIIllI() {
        return "_end";
    }
}
