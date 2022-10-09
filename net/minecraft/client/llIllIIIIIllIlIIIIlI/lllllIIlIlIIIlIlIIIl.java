package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import org.lwjgl.input.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lllllIIlIlIIIlIlIIIl extends lIIIlllIIIllIIIllIII implements IlIlIllllllllIIIIlII
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private IlIlIIIlIIlIlIIlllIl IllIIlllIIIIlllIIlIl;
    private lIIlIIIIIIIlIIlIlIIl llllIIIlIlllIlIIIIIl;
    private IllIIlllIIIIlllIIlIl lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/anvil.png");
    }
    
    public lllllIIlIlIIIlIlIIIl(final IllIIlllIIIIlllIIlIl liiiIlIIIIIlllIllIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(new IlIlIIIlIIlIlIIlllIl(liiiIlIIIIIlllIllIII, illlllllIIIlIIIlIlII, Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII));
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IllIIlllIIIIlllIIlIl = (IlIlIIIlIIlIlIIlllIl)this.IIlIIIIlllIlllllIlII;
    }
    
    @Override
    public void n_() {
        super.n_();
        Keyboard.enableRepeatEvents(true);
        (this.llllIIIlIlllIlIIIIIl = new lIIlIIIIIIIlIIlIlIIl(0, this.IIllIIllIIIlIlIIIIlI, (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2 + 62, (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2 + 24, 103, 12)).llllIIIlIlllIlIIIIIl(-1);
        this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII(-1);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(false);
        this.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl(30);
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl(this);
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void o_() {
        super.o_();
        Keyboard.enableRepeatEvents(false);
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl(this);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.repair", new Object[0]), 60, 6, 4210752);
        if (this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll > 0) {
            int n3 = 8453920;
            boolean b = true;
            String s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.repair.cost", this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
            if (this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll >= 40 && !this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.K.IlIIIlIlIIIllIlIlIIl) {
                s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.repair.expensive", new Object[0]);
                n3 = 16736352;
            }
            else if (!this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(2).IlIlIlIlIlllllllllIl()) {
                b = false;
            }
            else if (!this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(2).llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl)) {
                n3 = 16736352;
            }
            if (b) {
                final int n4 = 0xFF000000 | (n3 & 0xFCFCFC) >> 2 | (n3 & 0xFF000000);
                final int n5 = this.IlIlIIIlIIlIlIIlllIl - 8 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s);
                final int n6 = 67;
                if (this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n5 - 3, n6 - 2, this.IlIlIIIlIIlIlIIlllIl - 7, n6 + 10, -16777216);
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n5 - 2, n6 - 1, this.IlIlIIIlIIlIlIIlllIl - 8, n6 + 9, -12895429);
                }
                else {
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, n5, n6 + 1, n4);
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, n5 + 1, n6, n4);
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, n5 + 1, n6 + 1, n4);
                }
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, n5, n6, n3);
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(c, n)) {
            this.IlIlIIIllIllIIIIIllI();
        }
        else {
            super.llllIIIIlIIIlIlllIll(c, n);
        }
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        String ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
        final IIIIIllIIIIlIIIIllIl llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(0);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() && !llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IlIlIIIIIIlllIlIllIl() && ilIlIlIlIlllllllllIl.equals(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IIlllIIlIllIllIlIIll())) {
            ilIlIlIlIlllllllllIl = "";
        }
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII("MC|ItemName", new llllllIllIllIlIllllI(Unpooled.buffer()).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl.IlIlIIIllIllIIIIIllI);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(n4 + 59, n5 + 20, 0, this.IlllllllIIIlIIIlIlII + (this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(0).IlIlIlIlIlllllllllIl() ? 0 : 16), 110, 16);
        if ((this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(0).IlIlIlIlIlllllllllIl() || this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(1).IlIlIlIlIlllllllllIl()) && !this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(2).IlIlIlIlIlllllllllIl()) {
            this.IlIlIlIlIlllllllllIl(n4 + 99, n5 + 45, this.IlIlIIIlIIlIlIIlllIl, 0, 28, 21);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final List list) {
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 0, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0).llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (n == 0) {
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll((lllIIIIlIlIllIIlIIIl == null) ? "" : lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
            this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl != null);
            if (lllIIIIlIlIllIIlIIIl != null) {
                this.IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
    }
}
