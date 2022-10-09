package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import leaf.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;

public abstract class lIIlIIIlIllIlIllIIIl extends lIIIlllIIIllIIIllIII
{
    private boolean IlIlIIIllIllIIIIIllI;
    
    public lIIlIIIlIllIlIllIIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void n_() {
        super.n_();
        this.IlIlIIIllIllIIIIIllI();
    }
    
    protected void IlIlIIIllIllIIIIIllI() {
        if (!this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.L().isEmpty()) {
            this.IlIlIIIllIllIIIIIllI = true;
        }
        else {
            this.IIIlIIlIIIIlllIlllII = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
            this.IlIlIIIllIllIIIIIllI = false;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (this.IlIlIIIllIllIIIIIllI && !Leaf.instance.modManager.potionStatusMod.lIlIlIIIllIIllIIIllI()) {
            this.llllIIIlIlllIlIIIIIl();
        }
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        final int n = this.IIIlIIlIIIIlllIlllII - 124;
        int ilIlIllllllllIIIIlII = this.IlIlIllllllllIIIIlII;
        final Collection l = this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.L();
        if (!l.isEmpty()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            int n2 = 33;
            if (l.size() > 5) {
                n2 = 132 / (l.size() - 1);
            }
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.L()) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()];
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIlIIIlIlIIlllIIlll);
                this.IlIlIlIlIlllllllllIl(n, ilIlIllllllllIIIIlII, 0, 166, 140, 32);
                if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI()) {
                    final int illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
                    this.IlIlIlIlIlllllllllIl(n + 6, ilIlIllllllllIIIIlII + 7, 0 + illIIlllIIIIlllIIlIl % 8 * 18, 198 + illIIlllIIIIlllIIlIl / 8 * 18, 18, 18);
                }
                String s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), new Object[0]);
                if (ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() == 1) {
                    s = String.valueOf(s) + " " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("enchantment.level.2", new Object[0]);
                }
                else if (ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() == 2) {
                    s = String.valueOf(s) + " " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("enchantment.level.3", new Object[0]);
                }
                else if (ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() == 3) {
                    s = String.valueOf(s) + " " + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("enchantment.level.4", new Object[0]);
                }
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, (float)(n + 10 + 18), (float)(ilIlIllllllllIIIIlII + 6), 16777215);
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl), (float)(n + 10 + 18), (float)(ilIlIllllllllIIIIlII + 6 + 10), 8355711);
                ilIlIllllllllIIIIlII += n2;
            }
        }
    }
}
