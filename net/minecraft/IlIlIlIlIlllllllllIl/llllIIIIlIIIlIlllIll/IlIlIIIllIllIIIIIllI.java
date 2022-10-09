package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import java.text.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import java.util.concurrent.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import io.netty.buffer.*;

public abstract class IlIlIIIllIllIIIIIllI implements IllIlIIllIllIIlIllII
{
    private static final SimpleDateFormat llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    private llIIIIIIlIllIIlIIIll IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new SimpleDateFormat("HH:mm:ss");
    }
    
    public IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI = true;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = "";
        this.IllIIlllIIIIlllIIlIl = "@";
        this.llllIIIlIlllIlIIIIIl = new llIIIlIlIllIIlIlIlII();
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIIIIIIlIllIIlIIIll lIIIIlIIIIIlllIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Command", this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SuccessCount", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TrackOutput", this.llIllIIIIIllIlIIIIlI);
        if (this.IlIIIlIlIIIllIlIlIIl != null && this.llIllIIIIIllIlIIIIlI) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LastOutput", lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl));
        }
        this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Command");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SuccessCount");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8)) {
            this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("TrackOutput", 1)) {
            this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("TrackOutput");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("LastOutput", 8) && this.llIllIIIIIllIlIIIIlI) {
            this.IlIIIlIlIIIllIlIlIIl = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("LastOutput"));
        }
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final String s) {
        return n <= 2;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    public String lIIIlllIIIllIIIllIII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlIlIlIlIlllllllllIl = 0;
        }
        final llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IIIIIIIIIlllIllIlIlI() && iiiiIllIIIIlIIIIllIl.lIllIIIIIlllIIlIIllI()) {
            final IlIIlIlIIIlIIlIlIlII iIllllIIIlIIIIIIllIl = iiiiIllIIIIlIIIIllIl.IIllllIIIlIIIIIIllIl();
            try {
                this.IlIIIlIlIIIllIlIlIIl = null;
                this.IlIlIlIlIlllllllllIl = iIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIllIIIIIllI);
                return;
            }
            catch (Throwable t) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Executing command block");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Command to be executed");
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Command", new IllIIlllIIIIlllIIlIl(this));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Name", new llllIIIlIlllIlIIIIIl(this));
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
        }
        this.IlIlIlIlIlllllllllIl = 0;
    }
    
    @Override
    public String s_() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return new IlIlIIIIIIlllIlIllIl(this.s_());
    }
    
    public void IlIlIlIlIlllllllllIl(final String illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        if (this.llIllIIIIIllIlIIIIlI && this.k_() != null && !this.k_().IlIlIllllllllIIIIlII) {
            this.IlIIIlIlIIIllIlIlIIl = new IlIlIIIIIIlllIlIllIl("[" + net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.format(new Date()) + "] ").llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
            this.llIIlIIIlIIIllIlIIIl();
        }
    }
    
    @Override
    public boolean d_() {
        final llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        return iiiiIllIIIIlIIIIllIl == null || !iiiiIllIIIIlIIIIllIl.IIIIIIIIIlllIllIlIlI() || iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl[0].llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("commandBlockOutput");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final int n) {
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this, lIllllllIIllIlIlIlII, n);
    }
    
    public abstract void llIIlIIIlIIIllIlIIIl();
    
    public abstract int llIllIlIIIIllIlIIllI();
    
    public abstract void llllIIIIlIIIlIlllIll(final ByteBuf p0);
    
    public void IlIlIlIlIlllllllllIl(final llIIIIIIlIllIIlIIIll ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            return false;
        }
        if (llllIIIIlIIIlIlllIll.k_().IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        }
        return true;
    }
    
    public llIIIlIlIllIIlIlIlII IlIlIIIllIIllIlllllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
