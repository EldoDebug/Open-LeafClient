package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class g
{
    private final double llllIIIIlIIIlIlllIll;
    private final double IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public g(final Minecraft minecraft) {
        this.llIllIIIIIllIlIIIIlI = minecraft.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = minecraft.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = 1;
        final boolean ilIIIlIlIIIllIlIlIIl = minecraft.IlIIIlIlIIIllIlIlIIl();
        int iIlIlllIlIlllIlIllll = minecraft.IIIlIIIlIlIIlllIIlll.IIlIlllIlIlllIlIllll;
        if (iIlIlllIlIlllIlIllll == 0) {
            iIlIlllIlIlllIlIllll = 1000;
        }
        while (this.IlIlIIIllIllIIIIIllI < iIlIlllIlIlllIlIllll && this.llIllIIIIIllIlIIIIlI / (this.IlIlIIIllIllIIIIIllI + 1) >= 320 && this.IlIIIlIlIIIllIlIlIIl / (this.IlIlIIIllIllIIIIIllI + 1) >= 240) {
            ++this.IlIlIIIllIllIIIIIllI;
        }
        if (ilIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI % 2 != 0 && this.IlIlIIIllIllIIIIIllI != 1) {
            --this.IlIlIIIllIllIIIIIllI;
        }
        this.llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI / (double)this.IlIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl / (double)this.IlIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(this.llllIIIIlIIIlIlllIll);
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(this.IlIlIlIlIlllllllllIl);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public double llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
