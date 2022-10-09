package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import com.mojang.authlib.*;
import net.minecraft.client.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import leaf.*;
import net.minecraft.client.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import com.google.common.util.concurrent.*;
import java.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class lIIIIlIIIIIlllIllIII implements llllIIIIlIIIlIlllIll
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private final IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI;
    private final GameProfile IlIIIlIlIIIllIlIlIIl;
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private Minecraft IllIIlllIIIIlllIIlIl;
    private llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private final Map lIIIlllIIIllIIIllIII;
    public int llllIIIIlIIIlIlllIll;
    private boolean llIIlIIIlIIIllIlIIIl;
    private final Random llIllIlIIIIllIlIIllI;
    private static volatile /* synthetic */ int[] lIlIlIIIllIIllIIIllI;
    private static volatile /* synthetic */ int[] IlIlIIIllIIllIlllllI;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public lIIIIlIIIIIlllIllIII(final Minecraft illIIlllIIIIlllIIlIl, final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI, final GameProfile ilIIIlIlIIIllIlIlIIl) {
        this.lIIIlllIIIllIIIllIII = Maps.newHashMap();
        this.llllIIIIlIIIlIlllIll = 20;
        this.llIIlIIIlIIIllIlIIIl = false;
        this.llIllIlIIIIllIlIIllI = new Random();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIlIlllIlIIIIIl = null;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI = new IlIIIlIlIIIllIlIlIIl(this.IllIIlllIIIIlllIIlIl, this);
        this.llllIIIlIlllIlIIIIIl = new llIIlIIIlIIIllIlIIIl(this, new IlllIIIIlIIIlIlIlIIl(0L, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), false, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl()), ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), this.IllIIlllIIIIlllIIlIl.llIIIlIlIllIIlIlIlII);
        this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.lIIIIIlIlIIIlIIIIlIl = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI(this));
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI();
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII("MC|Brand", new llllllIllIllIlIllllI(Unpooled.buffer()).llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll())));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, this, this.IllIIlllIIIIlllIIlIl);
        final double n = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl() / 32.0;
        final double n2 = ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI() / 32.0;
        final double n3 = ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl() / 32.0;
        net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = null;
        if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 10) {
            llllIIIIlIIIlIlllIll = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n2, n3, net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI()));
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 90) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI());
            if (llllIIIIlIIIlIlllIll2 instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3, (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll2);
            }
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 60) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 61) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 71) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl(this.llllIIIlIlllIlIIIIIl, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3)), lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI()));
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 77) {
            llllIIIIlIIIlIlllIll = new IlIlIIIllIIllIlllllI(this.llllIIIlIlllIlIIIIIl, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3)));
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 65) {
            llllIIIIlIIIlIlllIll = new IlIlIIIllIllIIIIIllI(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 72) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 76) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII(this.llllIIIlIlllIlIIIIIl, n, n2, n3, null);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 63) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(this.llllIIIlIlllIlIIIIIl, n, n2, n3, ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI() / 8000.0, ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl() / 8000.0, ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl() / 8000.0);
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 64) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3, ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI() / 8000.0, ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl() / 8000.0, ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl() / 8000.0);
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 66) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3, ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI() / 8000.0, ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl() / 8000.0, ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl() / 8000.0);
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 62) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 73) {
            llllIIIIlIIIlIlllIll = new IllIIlllIIIIlllIIlIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3, ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI());
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 75) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 1) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 50) {
            llllIIIIlIIIlIlllIll = new IIIlIIIlIlIIlllIIlll(this.llllIIIlIlllIlIIIIIl, n, n2, n3, null);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 78) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 51) {
            llllIIIIlIIIlIlllIll = new llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 2) {
            llllIIIIlIIIlIlllIll = new lIIIlllIIIllIIIllIII(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        else if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 70) {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl(this.llllIIIlIlllIlIIIIIl, n, n2, n3, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI() & 0xFFFF));
            ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl(0);
        }
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl();
            llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI = ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI();
            llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll = ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl();
            llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = ilIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII() * 360 / 256.0f;
            llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII() * 360 / 256.0f;
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI[] ilIllllIIlIllIlIlIll = llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll();
            if (ilIllllIIlIllIlIlIll != null) {
                final int n4 = ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll() - llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl();
                for (int i = 0; i < ilIllllIIlIllIlIlIll.length; ++i) {
                    ilIllllIIlIllIlIlIll[i].IlIIIlIlIIIllIlIlIIl(ilIllllIIlIllIlIlIll[i].IlllIIIIlIIIlIlIlIIl() + n4);
                }
            }
            llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll());
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll);
            if (ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI() > 0) {
                if (ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl() == 60) {
                    final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll3 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI());
                    if (llllIIIIlIIIlIlllIll3 instanceof lllIIIIlllllIlIIllIl && llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
                        ((net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll3;
                    }
                }
                llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI() / 8000.0, ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl() / 8000.0, ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl() / 8000.0);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, this, this.IllIIlllIIIIlllIIlIl);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl(this.llllIIIlIlllIlIIIIIl, ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl() / 32.0, ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI() / 32.0, ilIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl() / 32.0, ilIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI());
        ilIlIIIlIIlIlIIlllIl.IIlIlIllllIlllIIIIll = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl();
        ilIlIIIlIIlIlIIlllIl.lIIllIIIllllIlllIllI = ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI();
        ilIlIIIlIIlIlIIlllIl.IllIlIllIllIlllIIlll = ilIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl();
        ilIlIIIlIIlIlIIlllIl.IIlIIIIIllIlIIIlIIll = 0.0f;
        ilIlIIIlIIlIlIIlllIl.llllllIllIllIlIllllI = 0.0f;
        ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll());
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(), ilIlIIIlIIlIlIIlllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, this.IllIIlllIIIIlllIIlIl);
        final double n = illIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl() / 32.0;
        final double n2 = illIlIIllIllIIlIllII.llIllIIIIIllIlIIIIlI() / 32.0;
        final double n3 = illIlIIllIllIIlIllII.IlIIIlIlIIIllIlIlIIl() / 32.0;
        net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
        if (illIlIIllIllIIlIllII.IlIlIIIllIllIIIIIllI() == 1) {
            llIllIIIIIllIlIIIIlI = new net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n2, n3);
        }
        if (llIllIIIIIllIlIIIIlI != null) {
            llIllIIIIIllIlIIIIlI.IIlIlIllllIlllIIIIll = illIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl();
            llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI = illIlIIllIllIIlIllII.llIllIIIIIllIlIIIIlI();
            llIllIIIIIllIlIIIIlI.IllIlIllIllIlllIIlll = illIlIIllIllIIlIllII.IlIIIlIlIIIllIlIlIIl();
            llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll = 0.0f;
            llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI = 0.0f;
            llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll());
            this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, this, this.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(), new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIIIIlllIlIllIl(this.llllIIIlIlllIlIIIIIl, lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(), lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(), lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl()));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl() / 8000.0, illIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI() / 8000.0, illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() / 8000.0);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl());
        if (llllIIIIlIIIlIlllIll != null && lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll() != null) {
            llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, this, this.IllIIlllIIIIlllIIlIl);
        final double n = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl() / 32.0;
        final double n2 = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI() / 32.0;
        final double n3 = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl() / 32.0;
        final float n4 = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl() * 360 / 256.0f;
        final float n5 = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII() * 360 / 256.0f;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2 = (ilIlIlIlIlllllllllIl3 = (ilIlIlIlIlllllllllIl4 = new net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl, (Leaf.instance.modManager.nickHiderMod.lIlIlIIIllIIllIIIllI() && Leaf.instance.modManager.nickHiderMod.nickOther) ? Leaf.instance.modManager.getGameProfile() : this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI()).llllIIIIlIIIlIlllIll())));
        final int ilIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl();
        ilIlIlIlIlllllllllIl2.IIlIlIllllIlllIIIIll = ilIIIlIlIIIllIlIlIIl;
        final double n6 = ilIIIlIlIIIllIlIlIIl;
        ilIlIlIlIlllllllllIl3.lIIlIIIlIllIlIllIIIl = n6;
        ilIlIlIlIlllllllllIl4.IIlIIIIlllIlllllIlII = n6;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl5 = ilIlIlIlIlllllllllIl;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl6 = ilIlIlIlIlllllllllIl;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl7 = ilIlIlIlIlllllllllIl;
        final int ilIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI();
        ilIlIlIlIlllllllllIl7.lIIllIIIllllIlllIllI = ilIlIIIllIllIIIIIllI;
        final double n7 = ilIlIIIllIllIIIIIllI;
        ilIlIlIlIlllllllllIl6.IIlIIIlllIllIllIlIII = n7;
        ilIlIlIlIlllllllllIl5.IIIlIIlIIIIlllIlllII = n7;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl8 = ilIlIlIlIlllllllllIl;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl9 = ilIlIlIlIlllllllllIl;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl10 = ilIlIlIlIlllllllllIl;
        final int illIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl();
        ilIlIlIlIlllllllllIl10.IllIlIllIllIlllIIlll = illIIlllIIIIlllIIlIl;
        final double n8 = illIIlllIIIIlllIIlIl;
        ilIlIlIlIlllllllllIl9.lIlIlIlllIIlIlIlllIl = n8;
        ilIlIlIlIlllllllllIl8.IlIlIllllllllIIIIlII = n8;
        final int liiIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII();
        if (liiIlllIIIllIIIllIII == 0) {
            ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = null;
        }
        else {
            ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII), 1, 0);
        }
        ilIlIlIlIlllllllllIl.a_(n, n2, n3, n4, n5);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl);
        final List llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll != null) {
            ilIlIlIlIlllllllllIl.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll = ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl();
            llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI = ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI();
            llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll = ilIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl();
            final double n = llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll / 32.0;
            final double n2 = llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI / 32.0;
            final double n3 = llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll / 32.0;
            final float n4 = ilIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI() * 360 / 256.0f;
            final float n5 = ilIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl() * 360 / 256.0f;
            if (Math.abs(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - n) < 0.03125 && Math.abs(llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII - n2) < 0.015625 && Math.abs(llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - n3) < 0.03125) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, n4, n5, 3, true);
            }
            else {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, 3, true);
            }
            llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl = ilIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, this, this.IllIIlllIIIIlllIIlIl);
        if (llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll() >= 0 && llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll() < net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl()) {
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll != null) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll;
            llIllIIIIIllIlIIIIlI.IIlIlIllllIlllIIIIll += ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll;
            llIllIIIIIllIlIIIIlI2.lIIllIIIllllIlllIllI += ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl();
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll;
            llIllIIIIIllIlIIIIlI3.IllIlIllIllIlllIIlll += ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll / 32.0, llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI / 32.0, llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll / 32.0, ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl() ? (ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl() * 360 / 256.0f) : llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl() ? (ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI() * 360 / 256.0f) : llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, 3, false);
            llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl = ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll() * 360 / 256.0f);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, this, this.IllIIlllIIIIlllIIlIl);
        for (int i = 0; i < iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll().length; ++i) {
            this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll()[i]);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        double llllIIIIlIIIlIlllIll = liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
        double ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl();
        double llIllIIIIIllIlIIIIlI = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI();
        float ilIIIlIlIIIllIlIlIIl = liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl();
        float ilIlIIIllIllIIIIIllI = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
        if (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl().contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll)) {
            llllIIIIlIIIlIlllIll += liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl;
        }
        else {
            liiiIlIIIIIlllIllIII.lIllllllIIllIlIlIlII = 0.0;
        }
        if (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl().contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl)) {
            ilIlIlIlIlllllllllIl += liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII;
        }
        else {
            liiiIlIIIIIlllIllIII.llIIlllIIlllIIllIllI = 0.0;
        }
        if (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl().contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI)) {
            llIllIIIIIllIlIIIIlI += liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII;
        }
        else {
            liiiIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII = 0.0;
        }
        if (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl().contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI)) {
            ilIlIIIllIllIIIIIllI += liiiIlIIIIIlllIllIII.llllllIllIllIlIllllI;
        }
        if (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl().contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl)) {
            ilIIIlIlIIIllIlIlIIl += liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll;
        }
        liiiIlIIIIIlllIllIII.a_(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl, liiiIlIIIIIlllIllIII.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII, liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll, liiiIlIIIIIlllIllIII.llllllIllIllIlIllllI, false));
        if (!this.lIIIIlIIIIIlllIllIII) {
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl;
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IIIlIIlIIIIlllIlllII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII;
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IlIlIllllllllIIIIlII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII;
            this.lIIIIlIIIIIlllIllIII = true;
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiiiiiiiIlllIllIlIlI, this, this.IllIIlllIIIIlllIIlIl);
        IIllllIIIlIIIIIIllIl[] llllIIIIlIIIlIlllIll;
        for (int length = (llllIIIIlIIIlIlllIll = iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll()).length, i = 0; i < length; ++i) {
            final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = llllIIIIlIIIlIlllIll[i];
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(), illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI, this, this.IllIIlllIIIIlllIIlIl);
        if (ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI()) {
            if (ilIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl() == 0) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl(), ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI(), false);
                return;
            }
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl(), ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI(), true);
        }
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl() << 4, 0, ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI() << 4, (ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl() << 4) + 15, 256, (ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI() << 4) + 15);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl(), ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI());
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(), ilIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl(), ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI());
        this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl() << 4, 0, ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI() << 4, (ilIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl() << 4) + 15, 256, (ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI() << 4) + 15);
        if (!ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI() || !(this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IIlIIIIIllIlIIIlIIll)) {
            llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl, this, this.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(), illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIlllllllllllll llIllIIlllllllllllll) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)null);
        if (this.IlIlIIIllIllIIIIIllI != null) {
            if (this.IlIlIIIllIllIIIIIllI instanceof IIIllIIllIIIIIIlIIlI) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(((IIIllIIllIIIIIIlIIlI)this.IlIlIIIllIllIIIIIllI).IlIlIIIllIllIIIIIllI(), "disconnect.lost", llIIIIIIlIllIIlIIIll).llllIIIIlIIIlIlllIll());
            }
            else {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl(this.IlIlIIIllIllIIIIIllI, "disconnect.lost", llIIIIIIlIllIIlIIIll));
            }
        }
        else {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl(new IlIllllIIlIIlIlIlIll(), "disconnect.lost", llIIIIIIlIllIIlIIIll));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll());
        lllIIIIlllllIlIIllIl liiiIlIIIIIlllIllIII = (lllIIIIlllllIlIIllIl)this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl());
        if (liiiIlIIIIIlllIllIII == null) {
            liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        }
        if (llllIIIIlIIIlIlllIll != null) {
            if (llllIIIIlIIIlIlllIll instanceof IlIlIIIlIIlIlIIlllIl) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, "random.orb", 0.2f, ((this.llIllIlIIIIllIlIIllI.nextFloat() - this.llIllIlIIIIllIlIIllI.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            else {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, "random.pop", 0.2f, ((this.llIllIlIIIIllIlIIllI.nextFloat() - this.llIllIlIIIIllIlIIllI.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(new lIllIIIIIlllIIlIIllI(this.llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII, 0.5f));
            this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this, this.IllIIlllIIIIlllIIlIl);
        if (llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI() == 2) {
            this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), false);
        }
        else {
            this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll != null) {
            if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl() == 0) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll).IIlIIIIlllIlllllIlII();
            }
            else if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl() == 1) {
                llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl();
            }
            else if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl() == 2) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(false, false, false);
            }
            else if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl() == 4) {
                this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIIlIIIlIIIllIlIIIl);
            }
            else if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl() == 5) {
                this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, this, this.IllIIlllIIIIlllIIlIl);
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll, this, this.IllIIlllIIIIlllIIlIl);
        final double n = illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl() / 32.0;
        final double n2 = illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI() / 32.0;
        final double n3 = illlIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl() / 32.0;
        final float n4 = illlIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl() * 360 / 256.0f;
        final float n5 = illlIIlIllIllIlIIll.llIllIlIIIIllIlIIllI() * 360 / 256.0f;
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(), this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl);
        lllIIIIlllllIlIIllIl.IIlIlIllllIlllIIIIll = illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl();
        lllIIIIlllllIlIIllIl.lIIllIIIllllIlllIllI = illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI();
        lllIIIIlllllIlIIllIl.IllIlIllIllIlllIIlll = illlIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl();
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2 = lllIIIIlllllIlIIllIl;
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl3 = lllIIIIlllllIlIIllIl;
        final float n6 = illlIIlIllIllIlIIll.lIlIlIIIllIIllIIIllI() * 360 / 256.0f;
        lllIIIIlllllIlIIllIl3.lIIlllIlllllIIlllIll = n6;
        lllIIIIlllllIlIIllIl2.lIllIlIIIllllllIIlII = n6;
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI[] ilIllllIIlIllIlIlIll = lllIIIIlllllIlIIllIl.IlIllllIIlIllIlIlIll();
        if (ilIllllIIlIllIlIlIll != null) {
            final int n7 = illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl() - lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl();
            for (int i = 0; i < ilIllllIIlIllIlIlIll.length; ++i) {
                ilIllllIIlIllIlIlIll[i].IlIIIlIlIIIllIlIlIIl(ilIllllIIlIllIlIlIll[i].IlllIIIIlIIIlIlIlIIl() + n7);
            }
        }
        lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl());
        lllIIIIlllllIlIIllIl.a_(n, n2, n3, n4, n5);
        lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII = illlIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() / 8000.0f;
        lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI = illlIIlIllIllIlIIll.lIIIIlIIIIIlllIllIII() / 8000.0f;
        lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII = illlIIlIllIllIlIIll.lIIIlllIIIllIIIllIII() / 8000.0f;
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(), lllIIIIlllllIlIIllIl);
        final List llllIIIIlIIIlIlllIll = illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll != null) {
            lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll());
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(), true);
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, this, this.IllIIlllIIIIlllIIlIl);
        net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl());
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI());
        if (lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll() == 0) {
            int n = 0;
            if (lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl() == this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl()) {
                llIllIIIIIllIlIIIIlI = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
                if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
                    ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(false);
                }
                n = ((llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll == null && llllIIIIlIIIlIlllIll != null) ? 1 : 0);
            }
            else if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(true);
            }
            if (llIllIIIIIllIlIIIIlI == null) {
                return;
            }
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (n != 0) {
                this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("mount.onboard", net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IlIIllIIllIIllIIlIIl.lIIIlllIIIllIIIllIII())), false);
            }
        }
        else if (lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll() == 1 && llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII) {
            if (llllIIIIlIIIlIlllIll != null) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, false);
            }
            else {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(false, false);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll != null) {
            if (llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll() == 21) {
                this.IllIIlllIIIIlllIIlIl.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(new net.minecraft.client.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll));
            }
            else {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll());
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll());
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.aq().llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.aq().IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(), ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl(), ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this, this.IllIIlllIIIIlllIIlIl);
        if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() != this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl) {
            this.lIIIIlIIIIIlllIllIII = false;
            (this.llllIIIlIlllIlIIIIIl = new llIIlIIIlIIIllIlIIIl(this, new IlllIIIIlIIIlIlIlIIl(0L, liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(), false, this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl(), liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl()), liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(), liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), this.IllIIlllIIIIlllIIlIl.llIIIlIlIllIIlIlIlII)).llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl());
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI(this));
        }
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIllIIIIlIIlIlllII, this, this.IllIIlllIIIIlllIIlIl);
        new net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII(this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl, null, illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl(), illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI(), illIllIIIIlIIlIlllII.IllIIlllIIIIlllIIlIl(), illIllIIIIlIIlIlllII.llllIIIlIlllIlIIIIIl(), illIllIIIIlIIlIlllII.lIIIIlIIIIIlllIllIII()).llllIIIIlIIIlIlllIll(true);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        liiiIlIIIIIlllIllIII.lIllllllIIllIlIlIlII += illIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII2 = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        liiiIlIIIIIlllIllIII2.llIIlllIIlllIIllIllI += illIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl();
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII3 = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        liiiIlIIIIIlllIllIII3.IIlllIIIlIlllIIlllII += illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(liIlIIIlIllIlIllIIIl, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        if ("minecraft:container".equals(liIlIIIlIllIlIllIIIl.IlIlIlIlIlllllllllIl())) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new net.minecraft.llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII(liIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI(), liIlIIIlIllIlIllIIIl.IlIIIlIlIIIllIlIlIIl()));
            liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl = liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll();
        }
        else if ("minecraft:villager".equals(liIlIIIlIllIlIllIIIl.IlIlIlIlIlllllllllIl())) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIlIlllIlIIIIIl.IIIllllllIllIIIlllIl(liiiIlIIIIIlllIllIII, liIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI()));
            liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl = liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll();
        }
        else if ("EntityHorse".equals(liIlIIIlIllIlIllIIIl.IlIlIlIlIlllllllllIl())) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liIlIIIlIllIlIllIIIl.IlIlIIIllIllIIIIIllI());
            if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl)llllIIIIlIIIlIlllIll, new net.minecraft.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(liIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI(), liIlIIIlIllIlIllIIIl.IlIIIlIlIIIllIlIlIIl()));
                liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl = liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll();
            }
        }
        else if (!liIlIIIlIllIlIllIIIl.IllIIlllIIIIlllIIlIl()) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new net.minecraft.client.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(liIlIIIlIllIlIllIIIl.IlIlIlIlIlllllllllIl(), liIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI()));
            liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl = liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll();
        }
        else {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((net.minecraft.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII)new net.minecraft.client.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liIlIIIlIllIlIllIIIl.IlIlIlIlIlllllllllIl(), liIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI(), liIlIIIlIllIlIllIIIl.IlIIIlIlIIIllIlIlIIl()));
            liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl = liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        if (lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll() == -1) {
            liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI());
        }
        else {
            boolean b = false;
            if (this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                b = (((net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl)this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll).llllIIIlIlllIlIIIIIl() != net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll());
            }
            if (lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll() == 0 && lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl() >= 36 && lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl() < 45) {
                final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl()).llllIIIIlIIIlIlllIll();
                if (lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI() != null && (llllIIIIlIIIlIlllIll == null || llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl < lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl)) {
                    lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI = 5;
                }
                liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(), lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI());
            }
            else if (lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll() == liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl && (lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll() != 0 || !b)) {
                liiiIlIIIIIlllIllIII.t.llllIIIIlIIIlIlllIll(lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(), lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI());
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlllIllIIlIllI llIIIlIlllIllIIlIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI, this, this.IllIIlllIIIIlllIIlIl);
        net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = null;
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        if (llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll() == 0) {
            ilIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI;
        }
        else if (llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll() == liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl) {
            ilIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.t;
        }
        if (ilIlIlIlIlllllllllIl != null && !llIIIlIlllIllIIlIllI.llIllIIIIIllIlIIIIlI()) {
            this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl(llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(), llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl(), true));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        if (llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll() == 0) {
            liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl());
        }
        else if (llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll() == liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl) {
            liiiIlIIIIIlllIllIII.t.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI, this, this.IllIIlllIIIIlllIIlIl);
        net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll());
        if (!(llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlllIIlllIIllIllI)) {
            llllIIIIlIIIlIlllIll = new net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlllIIlllIIllIllI();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll());
        }
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll((net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlllIIlllIIllIllI)llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIllIIllIIllIIlIIl, this, this.IllIIlllIIIIlllIIlIl);
        boolean b = false;
        if (this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll())) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll());
            if (llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlllIIlllIIllIllI) {
                final net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = (net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlllIIlllIIllIllI)llllIIIIlIIIlIlllIll;
                if (llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll()) {
                    System.arraycopy(ilIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl(), 0, llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI, 0, 4);
                    llIIlllIIlllIIllIllI.llIIIlIlIllIIlIlIlII();
                }
                b = true;
            }
        }
        if (!b && this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII != null) {
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl("Unable to locate sign at " + ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII() + ", " + ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII() + ", " + ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl()));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllllIIllIIllIl illIIlllllIIllIIllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIIlllllIIllIIllIl, this, this.IllIIlllIIIIlllIIlIl);
        if (this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(illIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll())) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(illIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll());
            final int ilIlIlIlIlllllllllIl = illIIlllllIIllIIllIl.IlIlIlIlIlllllllllIl();
            if ((ilIlIlIlIlllllllllIl == 1 && llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.IIlllIlIIllIlIlIlIIl) || (ilIlIlIlIlllllllllIl == 2 && llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIIlllIIIIIIlIIIlll) || (ilIlIlIlIlllllllllIl == 3 && llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl) || (ilIlIlIlIlllllllllIl == 4 && llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.llllllIllIllIlIllllI) || (ilIlIlIlIlllllllllIl == 5 && llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.IlllllllIIIlIIIlIlII) || (ilIlIlIlIlllllllllIl == 6 && llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII)) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIlllllIIllIIllIl.llIllIIIIIllIlIIIIlI());
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIIIlIlIllllIIlIllI liiiIlIlIllllIIlIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII.t != null && liiiIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl == liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll()) {
            liiiIlIIIIIlllIllIII.t.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(), liiiIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl());
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIIlllIllIllIlIII, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(), lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl(), lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(), lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(), llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl(), llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIIlIllIIIIIIl, this, this.IllIIlllIIIIlllIIlIl);
        for (int i = 0; i < ilIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll(); ++i) {
            final int llllIIIIlIIIlIlllIll = ilIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll(i);
            final int ilIlIlIlIlllllllllIl = ilIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl(i);
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, true);
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll << 4, 0, ilIlIlIlIlllllllllIl << 4, (llllIIIIlIIIlIlllIll << 4) + 15, 256, (ilIlIlIlIlllllllllIl << 4) + 15);
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(ilIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI(i), ilIlIlIIlIllIIIIIIl.IlIIIlIlIIIllIlIlIIl(i), true);
            this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll << 4, 0, ilIlIlIlIlllllllllIl << 4, (llllIIIIlIIIlIlllIll << 4) + 15, 256, (ilIlIlIlIlllllllllIl << 4) + 15);
            if (!(this.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IIlIIIIIllIlIIIlIIll)) {
                llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI();
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        final int llllIIIIlIIIlIlllIll = ilIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll();
        final float ilIlIlIlIlllllllllIl = ilIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl();
        final int ilIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl + 0.5f);
        if (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll.length && IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll] != null) {
            liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll], new Object[0]));
        }
        if (llllIIIIlIIIlIlllIll == 1) {
            this.llllIIIlIlllIlIIIIIl.lIllllllIIllIlIlIlII().IlIlIlIlIlllllllllIl(true);
            this.llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI(0.0f);
        }
        else if (llllIIIIlIIIlIlllIll == 2) {
            this.llllIIIlIlllIlIIIIIl.lIllllllIIllIlIlIlII().IlIlIlIlIlllllllllIl(false);
            this.llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI(1.0f);
        }
        else if (llllIIIIlIIIlIlllIll == 3) {
            this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl));
        }
        else if (llllIIIIlIIIlIlllIll == 4) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new a());
        }
        else if (llllIIIIlIIIlIlllIll == 5) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll iiIlIIIlIlIIlllIIlll = this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll;
            if (ilIlIlIlIlllllllllIl == 0.0f) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new IlIllllIIIlIllIlIIll());
            }
            else if (ilIlIlIlIlllllllllIl == 101.0f) {
                this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("demo.help.movement", new Object[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.IIlIIIlllIllIllIlIII.lIIIlllIIIllIIIllIII()), net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.lIlIlIlllIIlIlIlllIl.lIIIlllIIIllIIIllIII()), net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.llIIIIIIlIllIIlIIIll.lIIIlllIIIllIIIllIII()), net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) }));
            }
            else if (ilIlIlIlIlllllllllIl == 102.0f) {
                this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("demo.help.jump", new Object[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.llIIIlIlllIllIIlIllI.lIIIlllIIIllIIIllIII()) }));
            }
            else if (ilIlIlIlIlllllllllIl == 103.0f) {
                this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("demo.help.inventory", new Object[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.IllIIlllllIIllIIllIl.lIIIlllIIIllIIIllIII()) }));
            }
        }
        else if (llllIIIIlIIIlIlllIll == 6) {
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl, liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII + liiiIlIIIIIlllIllIII.llllIlIllllIIlIIlIlI(), liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII, "random.successful_hit", 0.18f, 0.45f, false);
        }
        else if (llllIIIIlIIIlIlllIll == 7) {
            this.llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI(ilIlIlIlIlllllllllIl);
        }
        else if (llllIIIIlIIIlIlllIll == 8) {
            this.llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl);
        }
        else if (llllIIIIlIIIlIlllIll == 10) {
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIllIlIlIIIIIIIllII, liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl, liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII, liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl, liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII, liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII, "mob.guardian.curse", 1.0f, 1.0f, false);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(), this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl);
        lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        this.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, this, this.IllIIlllIIIIlllIIlIl);
        if (ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll()) {
            this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl(), ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl(), ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI());
        }
        else {
            this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl(), ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl(), ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIlIIlllIIlIIlIlllIl lIlIIlllIIlIIlIlllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lIlIIlllIIlIIlIlllIl, this, this.IllIIlllIIIIlllIIlIl);
        boolean b = false;
        for (final Map.Entry<net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl, V> entry : lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll().entrySet()) {
            final net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = entry.getKey();
            final int intValue = (int)entry.getValue();
            if (illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() && intValue > 0) {
                if (this.llIIlIIIlIIIllIlIIIl && this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl) == 0) {
                    final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll)illIIlllIIIIlllIIlIl;
                    this.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    this.IllIIlllIIIIlllIIlIl.lIIlIIIlIllIlIllIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.client.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll(llllIIIIlIIIlIlllIll), 0L);
                    if (illIIlllIIIIlllIIlIl == net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) {
                        this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIIllllllIllIIIlllIl = false;
                        this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                    }
                }
                b = true;
            }
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll().IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII, illIIlllIIIIlllIIlIl, intValue);
        }
        if (!this.llIIlIIIlIIIllIlIIIl && !b && this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIIllllllIllIIIlllIl) {
            this.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
        }
        this.llIIlIIIlIIIllIlIIIl = true;
        if (this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll instanceof d) {
            ((d)this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll).llIllIIIIIllIlIIIIlI();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl());
        if (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
            final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(), llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI(), llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl(), false, llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl());
            ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll());
            ((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIIIIlIIllIIlIlIll, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIIIIlIIllIIlIlIll.llIllIIIIIllIlIIIIlI);
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) ? ((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll) : null;
        if (ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll == IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl) {
            this.IllIIlllIIIIlllIIlIl.lIIlIIIlIllIlIllIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl(this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII, lllIIIIlllllIlIIllIl), 0L - 1000 * ilIIIIIlIIllIIlIlIll.IlIIIlIlIIIllIlIlIIl / 20, 0L);
        }
        else if (ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll == IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIIIIIlIIllIIlIlIll.IlIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll2 instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                final net.minecraft.client.IlIlIIIllIIllIlllllI.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = new net.minecraft.client.IlIlIIIllIIllIlllllI.IlllllllIIIlIIIlIlII((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll2, lllIIIIlllllIlIIllIl);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIIIIlIIllIIlIlIll.IlIlIIIllIllIIIIIllI);
                this.IllIIlllIIIIlllIIlIl.lIIlIIIlIllIlIllIIIl().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 0L);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllllIIllIlIllIllllI lllllIIllIlIllIllllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllllIIllIlIllIllllI, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(lllllIIllIlIllIllllI.IlIlIlIlIlllllllllIl());
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IlIlIIIllIllIIIIIllI(lllllIIllIlIllIllllI.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllllIIIIIlIIlllIlIl lllllIIIIIlIIlllIlIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllllIIIIIlIIlllIlIl, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = lllllIIIIIlIIlllIlIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll != null) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllllIIIlIllIlIIll ilIllllIIIlIllIlIIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIllllIIIlIllIlIIll, this, this.IllIIlllIIIIlllIIlIl);
        ilIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IllIllIlllIllllIIllI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIllIIIlIIIIlIIlIIII illIIIlIIIIlIIlIIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIIIlIIIIlIIlIIII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllIIllIIIIIIlIIlI llllIIIIlIIIlIlllIll = illIIIlIIIIlIIlIIII.llllIIIIlIIIlIlllIll();
        String s = null;
        String s2 = null;
        final String s3 = (illIIIlIIIIlIIlIIII.IlIlIlIlIlllllllllIl() != null) ? illIIIlIIIIlIIlIIII.IlIlIlIlIlllllllllIl().lIIIlllIIIllIIIllIII() : "";
        switch (IlIlIIIllIllIIIIIllI()[llllIIIIlIIIlIlllIll.ordinal()]) {
            case 1: {
                s = s3;
                break;
            }
            case 2: {
                s2 = s3;
                break;
            }
            case 5: {
                this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll("", "", -1, -1, -1);
                this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll();
                return;
            }
        }
        this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(s, s2, illIIIlIIIIlIIlIIII.llIllIIIIIllIlIIIIlI(), illIIIlIIIIlIIlIIII.IlIIIlIlIIIllIlIlIIl(), illIIIlIIIIlIIlIIII.IlIlIIIllIllIIIIIllI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIIIIllllIlIIIIIII iiiiiiIllllIlIIIIIII) {
        if (!this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iiiiiiIllllIlIIIIIII.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlllIIIllIllIIlIlIl illlIIIllIllIIlIlIl) {
        this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl((illlIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII().length() == 0) ? null : illlIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll());
        this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll((illlIIIllIllIIlIlIl.IlIlIlIlIlllllllllIl().lIIIlllIIIllIIIllIII().length() == 0) ? null : illlIIIllIllIIlIlIl.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIIIlIlllIIlllII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illlIIIlIlllIIlllII.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
            ((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll).IIIIlllIIIIIIlIIIlll(illlIIIlIlllIIlllII.IlIlIlIlIlllllllllIl());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIllIlIllIllIIIIl llIIIllIlIllIllIIIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl, this, this.IllIIlllIIIIlllIIlIl);
        for (final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII : llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
            if (llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl() == IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI) {
                this.lIIIlllIIIllIIIllIII.remove(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getId());
            }
            else {
                net.minecraft.client.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = this.lIIIlllIIIllIIIllIII.get(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().getId());
                if (llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl() == IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll) {
                    iiiIlllIIIIIIlIIIlll = new net.minecraft.client.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll(illlIIlllIIIlIlllII);
                    this.lIIIlllIIIllIIIllIII.put(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().getId(), iiiIlllIIIIIIlIIIlll);
                }
                if (iiiIlllIIIIIIlIIIlll == null) {
                    continue;
                }
                switch (IllIIlllIIIIlllIIlIl()[llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl().ordinal()]) {
                    default: {
                        continue;
                    }
                    case 1: {
                        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI());
                        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl());
                        continue;
                    }
                    case 2: {
                        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI());
                        continue;
                    }
                    case 3: {
                        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl());
                        continue;
                    }
                    case 4: {
                        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl());
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIlllllIIllIIlllll, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII;
        liiiIlIIIIIlllIllIII.K.IlIlIlIlIlllllllllIl = ilIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl();
        liiiIlIIIIIlllIllIII.K.IlIIIlIlIIIllIlIlIIl = ilIIlllllIIllIIlllll.IlIIIlIlIIIllIlIlIIl();
        liiiIlIIIIIlllIllIII.K.llllIIIIlIIIlIlllIll = ilIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll();
        liiiIlIIIIIlllIllIII.K.llIllIIIIIllIlIIIIlI = ilIIlllllIIllIIlllll.llIllIIIIIllIlIIIIlI();
        liiiIlIIIIIlllIllIII.K.llllIIIIlIIIlIlllIll(ilIIlllllIIllIIlllll.IlIlIIIllIllIIIIIllI());
        liiiIlIIIIIlllIllIII.K.IlIlIlIlIlllllllllIl(ilIIlllllIIllIIlllll.IllIIlllIIIIlllIIlIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl, this, this.IllIIlllIIIIlllIIlIl);
        final String[] llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll();
        if (this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl) {
            ((net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl)this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, this, this.IllIIlllIIIIlllIIlIl);
        this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI.IlIlIlIlIlllllllllIl(), illIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI(), illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl(), illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(), illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(), illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl(), false);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        final String llllIIIIlIIIlIlllIll = llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll();
        final String ilIlIlIlIlllllllllIl = llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl();
        if (llllIIIIlIIIlIlllIll.startsWith("level://")) {
            final File file = new File(new File(this.IllIIlllIIIIlllIIlIl.mcDataDir, "saves"), llllIIIIlIIIlIlllIll.substring("level://".length()));
            if (file.isFile()) {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII(ilIlIlIlIlllllllllIl, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl));
                Futures.addCallback(this.IllIIlllIIIIlllIIlIl.IIlIlIlIIlIllIIIIIIl().llllIIIIlIIIlIlllIll(file), (FutureCallback)new net.minecraft.client.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII(this, ilIlIlIlIlllllllllIl));
            }
            else {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII(ilIlIlIlIlllllllllIl, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI));
            }
        }
        else if (this.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII() != null && this.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII().IlIlIlIlIlllllllllIl() == net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII(ilIlIlIlIlllllllllIl, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl));
            Futures.addCallback(this.IllIIlllIIIIlllIIlIl.IIlIlIlIIlIllIIIIIIl().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl), (FutureCallback)new net.minecraft.client.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(this, ilIlIlIlIlllllllllIl));
        }
        else if (this.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII() != null && this.IllIIlllIIIIlllIIlIl.lllllIlIIIlIlIIlllII().IlIlIlIlIlllllllllIl() != net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII(ilIlIlIlIlllllllllIl, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl));
        }
        else {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI(this, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllllIlIlIlllIlllIlI lllllIlIlIlllIlllIlI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllllIlIlIlllIlllIlI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIIIlIIlIlIlIIIII, this, this.IllIIlllIIIIlllIIlIl);
        if ("MC|TrList".equals(illIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll())) {
            final llllllIllIllIlIllllI ilIlIlIlIlllllllllIl = illIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl();
            try {
                final int int1 = ilIlIlIlIlllllllllIl.readInt();
                final lIIllIIIllllIlllIllI iiiIlllIIIIIIlIIIlll = this.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll;
                if (iiiIlllIIIIIIlIIIlll != null && iiiIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl && int1 == this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.t.IlIIIlIlIIIllIlIlIIl) {
                    ((net.minecraft.client.llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl)iiiIlllIIIIIIlIIIlll).IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(net.minecraft.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
                }
            }
            catch (IOException ex) {
                net.minecraft.client.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.error("Couldn't load trade info", (Throwable)ex);
                return;
            }
            finally {
                ilIlIlIlIlllllllllIl.release();
            }
            ilIlIlIlIlllllllllIl.release();
        }
        else if ("MC|Brand".equals(illIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll())) {
            this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(illIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI(32767));
        }
        else if ("MC|BOpen".equals(illIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll())) {
            final lllIIIIlIlIllIIlIIIl p = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.p();
            if (p != null && p.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.R) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIlllllllllllll(this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII, p, false));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlllllIllIllIlIlIII illlllIllIllIlIlIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlllIllIllIlIlIII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = this.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl();
        if (illlllIllIllIlIlIII.llIllIIIIIllIlIIIIlI() == 0) {
            final net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(illlllIllIllIlIlIII.llllIIIIlIIIlIlllIll(), net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllIllIllIlIlIII.IlIlIlIlIlllllllllIl());
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllIllIllIlIlIII.IlIIIlIlIIIllIlIlIIl());
        }
        else {
            final net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll2 = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(illlllIllIllIlIlIII.llllIIIIlIIIlIlllIll());
            if (illlllIllIllIlIlIII.llIllIIIIIllIlIIIIlI() == 1) {
                illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
            }
            else if (illlllIllIllIlIlIII.llIllIIIIIllIlIIIIlI() == 2) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(illlllIllIllIlIlIII.IlIlIlIlIlllllllllIl());
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(illlllIllIllIlIlIII.IlIIIlIlIIIllIlIlIIl());
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIllllIllllIlIlII llllIllllIllllIlIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = this.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl();
        final net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl());
        if (llllIllllIllllIlIlII.IlIIIlIlIIIllIlIlIIl() == IIlIlIllllIlllIIIIll.llllIIIIlIIIlIlllIll) {
            illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(llllIllllIllllIlIlII.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI());
        }
        else if (llllIllllIllllIlIlII.IlIIIlIlIIIllIlIlIIl() == IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl) {
            if (lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl())) {
                illlIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI(llllIllllIllllIlIlII.llllIIIIlIIIlIlllIll(), null);
            }
            else if (llllIIIIlIIIlIlllIll != null) {
                illlIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI(llllIllllIllllIlIlII.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = this.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl();
        if (liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl().length() == 0) {
            illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(), null);
        }
        else {
            illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(), illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl()));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIllIllIlllIIlll illIlIllIllIlllIIlll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIlIllIllIlllIIlll, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = this.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl();
        net.minecraft.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII;
        if (illIlIllIllIlllIIlll.IllIIlllIIIIlllIIlIl() == 0) {
            liiIlllIIIllIIIllIII = illlIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl(illIlIllIllIlllIIlll.llllIIIIlIIIlIlllIll());
        }
        else {
            liiIlllIIIllIIIllIII = illlIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI(illIlIllIllIlllIIlll.llllIIIIlIIIlIlllIll());
        }
        if (illIlIllIllIlllIIlll.IllIIlllIIIIlllIIlIl() == 0 || illIlIllIllIlllIIlll.IllIIlllIIIIlllIIlIl() == 2) {
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIlIllIllIlllIIlll.IlIlIlIlIlllllllllIl());
            liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(illIlIllIllIlllIIlll.llIllIIIIIllIlIIIIlI());
            liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(illIlIllIllIlllIIlll.IlIIIlIlIIIllIlIlIIl());
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(illIlIllIllIlllIIlll.lIIIIlIIIIIlllIllIII()));
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIlIllIllIlllIIlll.llllIIIlIlllIlIIIIIl());
            final net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(illIlIllIllIlllIIlll.lIIIlllIIIllIIIllIII());
            if (llllIIIIlIIIlIlllIll != null) {
                liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
        }
        if (illIlIllIllIlllIIlll.IllIIlllIIIIlllIIlIl() == 0 || illIlIllIllIlllIIlll.IllIIlllIIIIlllIIlIl() == 3) {
            final Iterator<String> iterator = illIlIllIllIlllIIlll.IlIlIIIllIllIIIIIllI().iterator();
            while (iterator.hasNext()) {
                illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(iterator.next(), illIlIllIllIlllIIlll.llllIIIIlIIIlIlllIll());
            }
        }
        if (illIlIllIllIlllIIlll.IllIIlllIIIIlllIIlIl() == 4) {
            final Iterator<String> iterator2 = illIlIllIllIlllIIlll.IlIlIIIllIllIIIIIllI().iterator();
            while (iterator2.hasNext()) {
                illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(iterator2.next(), liiIlllIIIllIIIllIII);
            }
        }
        if (illIlIllIllIlllIIlll.IllIIlllIIIIlllIIlIl() == 1) {
            illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll, this, this.IllIIlllIIIIlllIIlIl);
        if (llIlIIIIIlIIlIlIIlll.llIIlIIIlIIIllIlIIIl() == 0) {
            final double n = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII() * llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl();
            final double n2 = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII() * llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl();
            final double n3 = llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII() * llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII();
            try {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(), llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl(), llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(), llIlIIIIIlIIlIlIIlll.IlIIIlIlIIIllIlIlIIl(), llIlIIIIIlIIlIlIIlll.IlIlIIIllIllIIIIIllI(), n, n2, n3, llIlIIIIIlIIlIlIIlll.llIllIlIIIIllIlIIllI());
            }
            catch (Throwable t) {
                net.minecraft.client.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.warn("Could not spawn particle effect " + llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll());
            }
        }
        else {
            for (int i = 0; i < llIlIIIIIlIIlIlIIlll.llIIlIIIlIIIllIlIIIl(); ++i) {
                final double n4 = this.llIllIlIIIIllIlIIllI.nextGaussian() * llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl();
                final double n5 = this.llIllIlIIIIllIlIIllI.nextGaussian() * llIlIIIIIlIIlIlIIlll.llllIIIlIlllIlIIIIIl();
                final double n6 = this.llIllIlIIIIllIlIIllI.nextGaussian() * llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII();
                final double n7 = this.llIllIlIIIIllIlIIllI.nextGaussian() * llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII();
                final double n8 = this.llIllIlIIIIllIlIIllI.nextGaussian() * llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII();
                final double n9 = this.llIllIlIIIIllIlIIllI.nextGaussian() * llIlIIIIIlIIlIlIIlll.lIIIlllIIIllIIIllIII();
                try {
                    this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(), llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl(), llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI() + n4, llIlIIIIIlIIlIlIIlll.IlIIIlIlIIIllIlIlIIl() + n5, llIlIIIIIlIIlIlIIlll.IlIlIIIllIllIIIIIllI() + n6, n7, n8, n9, llIlIIIIIlIIlIlIIlll.llIllIlIIIIllIlIIllI());
                }
                catch (Throwable t2) {
                    net.minecraft.client.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.warn("Could not spawn particle effect " + llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll());
                    return;
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI, this, this.IllIIlllIIIIlllIIlIl);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll != null) {
            if (!(llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + llllIIIIlIIIlIlllIll + ")");
            }
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI x = ((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll).X();
            for (final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl : llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl()) {
                net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = x.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll());
                if (ilIlIIIllIllIIIIIllI == null) {
                    ilIlIIIllIllIIIIIllI = x.IlIlIlIlIlllllllllIl(new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(null, iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
                }
                ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl());
                ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl();
                final Iterator iterator2 = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI().iterator();
                while (iterator2.hasNext()) {
                    ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(iterator2.next());
                }
            }
        }
    }
    
    public IIlllIIlIllIllIlIIll IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public Collection llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII.values();
    }
    
    public net.minecraft.client.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final UUID uuid) {
        return this.lIIIlllIIIllIIIllIII.get(uuid);
    }
    
    public net.minecraft.client.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s) {
        for (final net.minecraft.client.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll : this.lIIIlllIIIllIIIllIII.values()) {
            if (iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().getName().equals(s)) {
                return iiiIlllIIIIIIlIIIlll;
            }
        }
        return null;
    }
    
    public GameProfile IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    static /* synthetic */ int[] IlIlIIIllIllIIIIIllI() {
        final int[] lIlIlIIIllIIllIIIllI = lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI;
        if (lIlIlIIIllIIllIIIllI != null) {
            return lIlIlIIIllIIllIIIllI;
        }
        final int[] lIlIlIIIllIIllIIIllI2 = new int[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllIIllIIIIIIlIIlI.values().length];
        try {
            lIlIlIIIllIIllIIIllI2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllIIllIIIIIIlIIlI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lIlIlIIIllIIllIIIllI2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllIIllIIIIIIlIIlI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lIlIlIIIllIIllIIIllI2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllIIllIIIIIIlIIlI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lIlIlIIIllIIllIIIllI2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lIlIlIIIllIIllIIIllI2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI2;
    }
    
    static /* synthetic */ int[] IllIIlllIIIIlllIIlIl() {
        final int[] ilIlIIIllIIllIlllllI = lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI;
        if (ilIlIIIllIIllIlllllI != null) {
            return ilIlIIIllIIllIlllllI;
        }
        final int[] ilIlIIIllIIllIlllllI2 = new int[IIIllIIIlIlIIllIIIlI.values().length];
        try {
            ilIlIIIllIIllIlllllI2[IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIIIllIIllIlllllI2[IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIIIllIIllIlllllI2[IIIllIIIlIlIIllIIIlI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIIIllIIllIlllllI2[IIIllIIIlIlIIllIIIlI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIIIllIIllIlllllI2[IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI2;
    }
}
