package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.logging.log4j.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIlIlIlIIlIllIIIIIIl extends lIIIlllIIIllIIIllIII
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private llIIlllIIlllIIllIllI llllIIIlIlllIlIIIIIl;
    private IllIllIIIIlIIlIlllII lIIIIlIIIIIlllIllIII;
    private IllIllIIIIlIIlIlllII lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private llIIIIIIlIllIIlIIIll llIllIlIIIIllIlIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/gui/container/villager.png");
    }
    
    public IIlIlIlIIlIllIIIIIIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIlllIIlllIIllIllI llllIIIlIlllIlIIIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(new IlIlIIIIIIlllIlIllIl(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl, illlllllIIIlIIIlIlII));
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llIllIlIIIIllIlIIllI = llllIIIlIlllIlIIIIIl.v_();
    }
    
    @Override
    public void n_() {
        super.n_();
        final int n = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n2 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IIlllIIlIllIllIlIIll.add(this.lIIIIlIIIIIlllIllIII = new IllIllIIIIlIIlIlllII(1, n + 120 + 27, n2 + 24 - 1, true));
        this.IIlllIIlIllIllIlIIll.add(this.lIIIlllIIIllIIIllIII = new IllIllIIIIlIIlIlllII(2, n + 36 - 19, n2 + 24 - 1, false));
        this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI = false;
        this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = false;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final String liiiIlIIIIIlllIllIII = this.llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII();
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.IlIlIIIlIIlIlIIlllIl / 2 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII) / 2, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.inventory", new Object[0]), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        final net.minecraft.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
        if (ilIlIlIlIlllllllllIl != null) {
            this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI = (this.llIIlIIIlIIIllIlIIIl < ilIlIlIlIlllllllllIl.size() - 1);
            this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = (this.llIIlIIIlIIIllIlIIIl > 0);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        boolean b = false;
        if (ilIIIlIlIIIllIlIlIIl == this.lIIIIlIIIIIlllIllIII) {
            ++this.llIIlIIIlIIIllIlIIIl;
            final net.minecraft.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
            if (ilIlIlIlIlllllllllIl != null && this.llIIlIIIlIIIllIlIIIl >= ilIlIlIlIlllllllllIl.size()) {
                this.llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.size() - 1;
            }
            b = true;
        }
        else if (ilIIIlIlIIIllIlIlIIl == this.lIIIlllIIIllIIIllIII) {
            --this.llIIlIIIlIIIllIlIIIl;
            if (this.llIIlIIIlIIIllIlIIIl < 0) {
                this.llIIlIIIlIIIllIlIIIl = 0;
            }
            b = true;
        }
        if (b) {
            ((IlIlIIIIIIlllIlIllIl)this.IIlIIIIlllIlllllIlII).IlIIIlIlIIIllIlIlIIl(this.llIIlIIIlIIIllIlIIIl);
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(Unpooled.buffer());
            llllllIllIllIlIllllI.writeInt(this.llIIlIIIlIIIllIlIIIl);
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII("MC|TrSel", llllllIllIllIlIllllI));
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlIlIlIIlIllIIIIIIl.IllIIlllIIIIlllIIlIl);
        this.IlIlIlIlIlllllllllIl((this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2, (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        final net.minecraft.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
        if (ilIlIlIlIlllllllllIl != null && !ilIlIlIlIlllllllllIl.isEmpty()) {
            final int llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl;
            if (llIIlIIIlIIIllIlIIIl < 0 || llIIlIIIlIIIllIlIIIl >= ilIlIlIlIlllllllllIl.size()) {
                return;
            }
            if (ilIlIlIlIlllllllllIl.get(llIIlIIIlIIIllIlIIIl).lIIIIlIIIIIlllIllIII()) {
                this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlIlIlIIlIllIIIIIIl.IllIIlllIIIIlllIIlIl);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                this.IlIlIlIlIlllllllllIl(this.IIIlIIlIIIIlllIlllII + 83, this.IlIlIllllllllIIIIlII + 21, 212, 0, 28, 21);
                this.IlIlIlIlIlllllllllIl(this.IIIlIIlIIIIlllIlllII + 83, this.IlIlIllllllllIIIIlII + 51, 212, 0, 28, 21);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        final net.minecraft.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
        if (ilIlIlIlIlllllllllIl != null && !ilIlIlIlIlllllllllIl.isEmpty()) {
            final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
            final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
            final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.get(this.llIIlIIIlIIIllIlIIIl);
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            final lllIIIIlIlIllIIlIIIl ilIlIlIlIlllllllllIl2 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 100.0f;
            this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2, n4 + 36, n5 + 24);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, llllIIIIlIIIlIlllIll2, n4 + 36, n5 + 24);
            if (ilIlIlIlIlllllllllIl2 != null) {
                this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2, n4 + 62, n5 + 24);
                this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, ilIlIlIlIlllllllllIl2, n4 + 62, n5 + 24);
            }
            this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, n4 + 120, n5 + 24);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, ilIIIlIlIIIllIlIlIIl, n4 + 120, n5 + 24);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 0.0f;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            if (this.llIllIIIIIllIlIIIIlI(36, 24, 16, 16, n, n2) && llllIIIIlIIIlIlllIll2 != null) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, n, n2);
            }
            else if (ilIlIlIlIlllllllllIl2 != null && this.llIllIIIIIllIlIIIIlI(62, 24, 16, 16, n, n2) && ilIlIlIlIlllllllllIl2 != null) {
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, n, n2);
            }
            else if (ilIIIlIlIIIllIlIlIIl != null && this.llIllIIIIIllIlIIIIlI(120, 24, 16, 16, n, n2) && ilIIIlIlIIIllIlIlIIl != null) {
                this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, n2);
            }
            else if (llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() && (this.llIllIIIIIllIlIIIIlI(83, 21, 28, 21, n, n2) || this.llIllIIIIIllIlIIIIlI(83, 51, 28, 21, n, n2))) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("merchant.deprecated", new Object[0]), n, n2);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        }
    }
    
    public llIIlllIIlllIIllIllI IlIlIIIllIllIIIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
