package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import leaf.setting.*;
import net.minecraft.client.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;

public class IIlllIIlIllIllIlIIll extends lIIlIIIlIllIlIllIIIl
{
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    
    public IIlllIIlIllIllIlIIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI);
        this.IlIlIIIIIIlllIlIllIl = true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII));
        }
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        if (this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII));
        }
        else {
            super.n_();
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.crafting", new Object[0]), 86, 16, 4210752);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.IlIlIIIllIllIIIIIllI = (float)n;
        this.IllIIlllIIIIlllIIlIl = (float)n2;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.IIIlIIIlIlIIlllIIlll);
        final int iiIlIIlIIIIlllIlllII = this.IIIlIIlIIIIlllIlllII;
        final int ilIlIllllllllIIIIlII = this.IlIlIllllllllIIIIlII;
        this.IlIlIlIlIlllllllllIl(iiIlIIlIIIIlllIlllII, ilIlIllllllllIIIIlII, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII + 51, ilIlIllllllllIIIIlII + 75, 30, iiIlIIlIIIIlllIlllII + 51 - this.IlIlIIIllIllIIIIIllI, ilIlIllllllllIIIIlII + 75 - 50 - this.IllIIlllIIIIlllIIlIl, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final float n4, final float n5, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, 50.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll((float)(-n3), (float)n3, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 0.0f, 1.0f);
        final float lIllIlIIIllllllIIlII = lllIIIIlllllIlIIllIl.lIllIlIIIllllllIIlII;
        final float iIlIIIIIllIlIIIlIIll = lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll;
        final float llllllIllIllIlIllllI = lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI;
        final float lIllIIlIlIlllllIIIII = lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII;
        final float liIlllIlllllIIlllIll = lllIIIIlllllIlIIllIl.lIIlllIlllllIIlllIll;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(135.0f, 0.0f, 1.0f, 0.0f);
        lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-135.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(float)Math.atan(n5 / 40.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        lllIIIIlllllIlIIllIl.lIllIlIIIllllllIIlII = ((Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll instanceof PlayerCosmeticSetting) ? n4 : ((float)Math.atan(n4 / 40.0f) * 20.0f));
        lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll = ((Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll instanceof PlayerCosmeticSetting) ? n4 : ((float)Math.atan(n4 / 40.0f) * 40.0f));
        lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI = -(float)Math.atan(n5 / 40.0f) * 20.0f;
        lllIIIIlllllIlIIllIl.lIIlllIlllllIIlllIll = lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll;
        lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII = lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 0.0f);
        final lllIllIIIllllllIllll lllllIIIIIlIlIIIIIIl = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl();
        lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(180.0f);
        lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(false);
        lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(true);
        lllIIIIlllllIlIIllIl.lIllIlIIIllllllIIlII = lIllIlIIIllllllIIlII;
        lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll;
        lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
        lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII = lIllIIlIlIlllllIIIII;
        lllIIIIlllllIlIIllIl.lIIlllIlllllIIlllIll = liIlllIlllllIIlllIll;
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll()));
        }
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll()));
        }
    }
}
