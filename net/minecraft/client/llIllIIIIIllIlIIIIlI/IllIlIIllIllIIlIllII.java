package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIlIIIllIIllIlllllI.*;

public class IllIlIIllIllIIlIllII extends lIIllIIIllllIlllIllI implements c
{
    private static final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] IllIIlllIIIIlllIIlIl;
    private final lIIllIIIllllIlllIllI llllIIIlIlllIlIIIIIl;
    private final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private IlIIIlIlIIIllIlIlIIl lIIIlllIIIllIIIllIII;
    private IIllllIIIlIIIIIIllIl llIIlIIIlIIIllIlIIIl;
    protected String IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI };
    }
    
    public IllIlIIllIllIIlIllII(final lIIllIIIllllIlllIllI llllIIIlIlllIlIIIIIl, final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        this.IlIlIIIllIllIIIIIllI = "Options";
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void n_() {
        int n = 0;
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.title", new Object[0]);
        net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] illIIlllIIIIlllIIlIl;
        for (int length = (illIIlllIIIIlllIIlIl = IllIlIIllIllIIlIllII.IllIIlllIIIIlllIIlIl).length, i = 0; i < length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl[i];
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IlIIlIlIIIlIIlIlIlII(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 - 12 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 - 12 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI, this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
            }
            ++n;
        }
        if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null) {
            this.lIIIlllIIIllIIIllIII = new IlIIIlIlIIIllIlIlIIl(108, this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 - 12 + 24 * (n >> 1), 150, 20, this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll()));
            this.IIlllIIlIllIllIlIIll.add(this.lIIIlllIIIllIIIllIII);
            if (this.IlIlIIIllIIllIlllllI.llIIlllIIlllIIllIllI() && !this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl()) {
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl() - 20);
                this.llIIlIIIlIIIllIlIIIl = new IIllllIIIlIIIIIIllIl(109, this.lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), this.lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII);
                this.IIlllIIlIllIllIlIIll.add(this.llIIlIIIlIIIllIlIIIl);
                this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IIIlIIlIIIIlllIlllII());
                this.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI = !this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
                this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = !this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
            }
            else {
                this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = false;
            }
        }
        else {
            this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 - 12 + 24 * (n >> 1), net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll, this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll)));
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(110, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 48 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.skinCustomisation", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new lIIlIIIlIllIlIllIIIl(this, 8675309, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII / 6 + 48 - 6, 150, 20, "Super Secret Settings..."));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(106, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 72 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.sounds", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(107, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII / 6 + 72 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.stream", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(101, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 96 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.video", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(100, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII / 6 + 96 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.controls", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(102, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 120 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.language", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(103, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII / 6 + 120 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.chat.title", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(105, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 144 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.resourcepack", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(104, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII / 6 + 144 - 6, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.snooper.view", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 168, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    public String llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("");
        ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("options.difficulty", new Object[0]));
        ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(": ");
        ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), new Object[0]));
        return ilIlIIIIIIlllIlIllIl.lIIIlllIIIllIIIllIII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
        if (n == 109 && b && this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null) {
            this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IlIlIIIllIllIIIIIllI(true);
            this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(true);
            this.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI = false;
            this.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI = false;
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI < 100 && ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(), 1);
                ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 108) {
                this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll() + 1));
                this.lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll());
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 109) {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new b(this, new IIllIIllIIIlIlIIIIlI("difficulty.lock.title", new Object[0]).lIIIlllIIIllIIIllIII(), new IIllIIllIIIlIlIIIIlI("difficulty.lock.question", new Object[] { new IIllIIllIIIlIlIIIIlI(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IIlIIIIlllIlllllIlII().IlIlIlIlIlllllllllIl(), new Object[0]) }).lIIIlllIIIllIIIllIII(), 109));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 110) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llllIIllllIlIlIIIIll(this));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 8675309) {
                this.IlIlIIIllIIllIlllllI.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl();
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 101) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llllIlIllllIIlIIlIlI(this, this.lIIIIlIIIIIlllIllIII));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 100) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(this, this.lIIIIlIIIIIlllIllIII));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 102) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llllllIllIllIlIllllI(this, this.lIIIIlIIIIIlllIllIII, this.IlIlIIIllIIllIlllllI.IllIllIIIIlIIlIlllII()));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 103) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new h(this, this.lIIIIlIIIIIlllIllIII));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 104) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lIllIlIIIllllllIIlII(this, this.lIIIIlIIIIIlllIllIII));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 105) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IIIIIIIllllIlIIIIIII(this));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 106) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lIIIIIlIlIIIlIIIIlIl(this, this.lIIIIlIIIIIlllIllIII));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 107) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                final IlIlIIIllIIllIlllllI liIlIIIlIllIlIllIIIl = this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl();
                if (liIlIIIlIllIlIllIIIl.lIIIlllIIIllIIIllIII() && liIlIIIlIllIlIllIIIl.IlIlIllllllllIIIIlII()) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(this, this.lIIIIlIIIIIlllIllIII));
                }
                else {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
