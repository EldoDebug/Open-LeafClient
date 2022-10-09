package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import org.lwjgl.input.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;

public class llllIIllllIlIlIIIIll extends lIIllIIIllllIlllIllI
{
    private llIIlllIIlllIIllIllI IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private IlIIIlIlIIIllIlIlIIl lIIIIlIIIIIlllIllIII;
    
    public llllIIllllIlIlIIIIll(final llIIlllIIlllIIllIllI ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        Keyboard.enableRepeatEvents(true);
        this.IIlllIIlIllIllIlIIll.add(this.lIIIIlIIIIIlllIllIII = new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 120, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(false);
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
        final lIIIIlIIIIIlllIllIII iiIlIIIlIlIIlllIIlll = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll();
        if (iiIlIIIlIlIIlllIIlll != null) {
            iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI(), this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI));
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        ++this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI && ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
            this.IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII();
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (n == 200) {
            this.llllIIIlIlllIlIIIIIl = (this.llllIIIlIlllIlIIIIIl - 1 & 0x3);
        }
        if (n == 208 || n == 28 || n == 156) {
            this.llllIIIlIlllIlIIIIIl = (this.llllIIIlIlllIlIIIIIl + 1 & 0x3);
        }
        String s = this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI[this.llllIIIlIlllIlIIIIIl].lIIIIlIIIIIlllIllIII();
        if (n == 14 && s.length() > 0) {
            s = s.substring(0, s.length() - 1);
        }
        if (net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(c) && this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(String.valueOf(s) + c) <= 90) {
            s = String.valueOf(s) + c;
        }
        this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI[this.llllIIIlIlllIlIIIIIl] = new IlIlIIIIIIlllIlIllIl(s);
        if (n == 1) {
            this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("sign.edit", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 40, 16777215);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(this.llllIIllllIlIlIIIIll / 2), 0.0f, 50.0f);
        final float n4 = 93.75f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-n4, -n4, -n4);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
        if (this.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllllIllIllIlIlIII) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl() * 360 / 16.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -1.0625f, 0.0f);
        }
        else {
            final int llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl();
            float n5 = 0.0f;
            if (llIIlIIIlIIIllIlIIIl == 2) {
                n5 = 180.0f;
            }
            if (llIIlIIIlIIIllIlIIIl == 4) {
                n5 = 90.0f;
            }
            if (llIIlIIIlIIIllIlIIIl == 5) {
                n5 = -90.0f;
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n5, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -1.0625f, 0.0f);
        }
        if (this.IllIIlllIIIIlllIIlIl / 6 % 2 == 0) {
            this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, -0.5, -0.75, -0.5, 0.0f);
        this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl = -1;
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
