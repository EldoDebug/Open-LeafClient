package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.optifine.shaders.*;
import org.lwjgl.opengl.*;

public class IIlllllIllIllIlIlIII extends lllIIIIlllllIlIIllIl
{
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        if (this.IlIlIlIlIlllllllllIl) {
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.D()) {
                for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII : this.llllIIIIlIIIlIlllIll) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(ilIIlIlIIIlIIlIlIlII.ordinal());
                    lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                    this.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
                    ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl();
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
                    this.llllIIIIlIIIlIlllIll();
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(7);
                    lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                }
            }
            else {
                int ilIlIIIllIllIIIIIllI = Integer.MIN_VALUE;
                int illIIlllIIIIlllIIlIl = Integer.MIN_VALUE;
                lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = null;
                for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2 : this.llllIIIIlIIIlIlllIll) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIllIlIlIIIlIlIlIII2.IlIlIlIlIlllllllllIl(ilIIlIlIIIlIIlIlIlII.ordinal());
                    final lIIIlllIIIllIIIllIII ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl();
                    if (ilIIIlIlIIIllIlIlIIl != liiIlllIIIllIIIllIII || ilIlIIIllIllIIIIIllI != ilIllIlIlIIIlIlIlIII2.IlIlIIIllIllIIIIIllI || illIIlllIIIIlllIIlIl != ilIllIlIlIIIlIlIlIII2.IllIIlllIIIIlllIIlIl) {
                        if (liiIlllIIIllIIIllIII != null) {
                            this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl, liiIlllIIIllIIIllIII);
                        }
                        ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII2.IlIlIIIllIllIIIIIllI;
                        illIIlllIIIIlllIIlIl = ilIllIlIlIIIlIlIlIII2.IllIIlllIIIIlllIIlIl;
                        liiIlllIIIllIIIllIII = ilIIIlIlIIIllIlIlIIl;
                    }
                    ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(7);
                }
                if (liiIlllIIIllIIIllIII != null) {
                    this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl, liiIlllIIIllIIIllIII);
                }
            }
            lIIIIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IllIllIIIIlIIlIlllII, 0);
            lllllIlIIIlIlIIlllII.llIIlllIIlllIIllIllI();
            this.llllIIIIlIIIlIlllIll.clear();
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            IIlllIIIlIlllIIlllII.lIIIlllIIIllIIIllIII();
        }
        else {
            GL11.glVertexPointer(3, 5126, 28, 0L);
            GL11.glColorPointer(4, 5121, 28, 12L);
            GL11.glTexCoordPointer(2, 5126, 28, 16L);
            lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
            GL11.glTexCoordPointer(2, 5122, 28, 24L);
            lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        super.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI);
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.llllIIIIlIIIlIlllIll(n, 0, n2);
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(n - this.llIllIIIIIllIlIIIIlI), (float)(n2 - this.IlIIIlIlIIIllIlIlIIl), (float)(n3 - this.IlIlIIIllIllIIIIIllI));
    }
}
