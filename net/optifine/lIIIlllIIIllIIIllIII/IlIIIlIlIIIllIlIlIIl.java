package net.optifine.lIIIlllIIIllIIIllIII;

import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private Minecraft llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    int llllIIIIlIIIlIlllIll;
    private e IllIIlllIIIIlllIIlIl;
    float IlIlIlIlIlllllllllIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private e lIIIlllIIIllIIIllIII;
    private double llIIlIIIlIIIllIlIIIl;
    private double llIllIlIIIIllIlIIllI;
    private double lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    
    public IlIIIlIlIIIllIlIlIIl(final Minecraft llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.IlIlIIIllIllIIIIIllI = false;
        this.llllIIIlIlllIlIIIIIl = false;
        this.lIIIIlIIIIIlllIllIII = 0;
        this.lIIIlllIIIllIIIllIII = new e(-1.0, -1.0, -1.0);
        this.llIIlIIIlIIIllIlIIIl = 0.0;
        this.llIllIlIIIIllIlIIllI = 0.0;
        this.lIlIlIIIllIIllIIIllI = 0.0;
        this.IlIlIIIllIIllIlllllI = -1;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIIllIlllllI = llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(1);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIIIllIllIIIIIllI, final int llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl, final e illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.IlIIIlIlIIIllIlIlIIl) {
            return true;
        }
        if (this.IlIlIIIllIllIIIIIllI != this.llllIIIlIlllIlIIIIIl) {
            return true;
        }
        if (this.llllIIIIlIIIlIlllIll >= this.lIIIIlIIIIIlllIllIII + 20) {
            return true;
        }
        if (Math.abs(this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll - this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll) > 0.003) {
            return true;
        }
        if (Math.abs(this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl - this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl) > 0.003) {
            return true;
        }
        if (Math.abs(this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI - this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI) > 0.003) {
            return true;
        }
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI();
        return liiiIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII + liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI() < 128.0 + this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.g * 128.0f ^ this.llIllIlIIIIllIlIIllI + liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI() < 128.0 + this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.g * 128.0f;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        GL11.glNewList(this.IlIlIIIllIIllIlllllI, 4864);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        GL11.glEndList();
        this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI;
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll;
        this.lIIIlllIIIllIIIllIII = this.IllIIlllIIIIlllIIlIl;
        this.llIIlIIIlIIIllIlIIIl = this.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI().IIlIIIIlllIlllllIlII;
        this.llIllIlIIIIllIlIIllI = this.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI().IIIlIIlIIIIlllIlllII;
        this.lIlIlIIIllIIllIIIllI = this.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI().IlIlIllllllllIIIIlII;
        this.IlIIIlIlIIIllIlIlIIl = true;
        lllllIlIIIlIlIIlllII.llIIlllIIlllIIllIllI();
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI();
        final double n = liiiIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII) * this.IlIlIlIlIlllllllllIl;
        final double n2 = liiiIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII) * this.IlIlIlIlIlllllllllIl;
        final double n3 = liiiIlIlIllllIIlIllI.IlIlIllllllllIIIIlII + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.IlIlIllllllllIIIIlII) * this.IlIlIlIlIlllllllllIl;
        final float n4 = (float)(n - this.llIIlIIIlIIIllIlIIIl + (this.llllIIIIlIIIlIlllIll - this.lIIIIlIIIIIlllIllIII + this.IlIlIlIlIlllllllllIl) * 0.03);
        final float n5 = (float)(n2 - this.llIllIlIIIIllIlIIllI);
        final float n6 = (float)(n3 - this.lIlIlIIIllIIllIIIllI);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        if (this.IlIlIIIllIllIIIIIllI) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n4 / 12.0f, -n5, -n6 / 12.0f);
        }
        else {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n4, -n5, -n6);
        }
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IlIlIIIllIIllIlllllI);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.llIIlllIIlllIIllIllI();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIIIlIlIIIllIlIlIIl = false;
    }
}
