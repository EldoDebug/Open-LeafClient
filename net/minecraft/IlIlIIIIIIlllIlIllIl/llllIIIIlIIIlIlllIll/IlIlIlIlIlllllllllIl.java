package net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.client.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import org.apache.logging.log4j.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import java.net.*;
import com.google.common.util.concurrent.*;
import java.util.concurrent.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    private static final Logger IIIIlllIIIIIIlIIIlll;
    private final Minecraft llllIIllllIlIlIIIIll;
    private final IlllIIIIlIIIlIlIlIIl IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    private lIIIlllIIIllIIIllIII IlIlIIIIIIlllIlIllIl;
    private long IIllIIllIIIlIlIIIIlI;
    public IlllllllIIIlIIIlIlII llIllIlIIIIllIlIIllI;
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI;
    public IlIlIIIllIllIIIIIllI IlIlIIIllIIllIlllllI;
    
    static {
        IIIIlllIIIIIIlIIIlll = LogManager.getLogger();
    }
    
    public IlIlIlIlIlllllllllIl(final Minecraft llllIIllllIlIlIIIIll) {
        super(llllIIllllIlIlIIIIll.IlllIIIIlIIIlIlIlIIl(), new File(llllIIllllIlIlIIIIll.mcDataDir, IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.getName()));
        this.IIllIIllIIIlIlIIIIlI = 0L;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = null;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = null;
    }
    
    public IlIlIlIlIlllllllllIl(final Minecraft llllIIllllIlIlIIIIll, final String s, final String s2, final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        super(new File(llllIIllllIlIlIIIIll.mcDataDir, "saves"), llllIIllllIlIlIIIIll.IlllIIIIlIIIlIlIlIIl(), new File(llllIIllllIlIlIIIIll.mcDataDir, IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.getName()));
        this.IIllIIllIIIlIlIIIIlI = 0L;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = null;
        this.IlIlIIIllIllIIIIIllI(llllIIllllIlIlIIIIll.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI());
        this.IllIIlllIIIIlllIIlIl(s);
        this.llllIIIlIlllIlIIIIIl(s2);
        this.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll.IIllIIllIIIlIlIIIIlI());
        this.llIllIIIIIllIlIIIIlI(illlIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI());
        this.IlIlIlIlIlllllllllIl(256);
        this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this));
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = (this.IllIllIlllIllllIIllI() ? net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI : illlIIIIlIIIlIlIlIIl);
        final llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = this.llIlIIIIIlIIlIlIIlll().llllIIIIlIIIlIlllIll(s, false).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != null) {
            final IIIIlllIIIIIIlIIIlll liiIlllIIIllIIIllIII = llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII();
            if (liiIlllIIIllIIIllIII != null && liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI("Dimension")) {
                net.minecraft.IlIlIIIllIIllIlllllI.IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl("Dimension");
                this.llllIIllllIlIlIIIIll.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(-1);
            }
        }
    }
    
    @Override
    protected lllllIIlIlIIIlIlIIIl llllIIIlIlllIlIIIIIl() {
        return new IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final String s, final String s2, final long n, final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII, final String s3) {
        this.llllIIIIlIIIlIlllIll(s);
        final boolean llIllIIIIIllIlIIIIlI = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
        if (!llIllIIIIIllIlIIIIlI) {
            this.IlIIIlIlIIIllIlIlIIl = new net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl[3];
            this.lIIIlllIIIllIIIllIII = new long[this.IlIIIlIlIIIllIlIlIIl.length][100];
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.llIlIIIIIlIIlIlIIlll().llllIIIIlIIIlIlllIll(s, true);
        this.llllIIIIlIIIlIlllIll(this.IIlIlIlIIlIllIIIIIIl(), llllIIIIlIIIlIlllIll);
        llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI2 == null) {
            llIllIIIIIllIlIIIIlI2 = new llllIIllllIlIlIIIIll(this.IlIllIlIlIIIlIlIlIII, s2);
        }
        else {
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(s2);
        }
        if (llIllIIIIIllIlIIIIlI) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = (net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)(this.IllIllIlllIllllIIllI() ? new net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this, llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI2, 0, this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII() : ((net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)new net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl(this, llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI2, 0, this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII()));
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
            Integer[] array;
            for (int length = (array = (Integer[])net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl, new Object[0])).length, i = 0; i < length; ++i) {
                final int intValue = array[i];
                final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl2 = (net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)((intValue == 0) ? iiIllllllIllIIIlllIl : new IIIIIIIIIlllIllIlIlI(this, llllIIIIlIIIlIlllIll, intValue, iiIllllllIllIIIlllIl, this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII());
                iiIllllllIllIIIlllIl2.llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII(this, iiIllllllIllIIIlllIl2));
                if (!this.llIllIlIlIIIIIIIllII()) {
                    iiIllllllIllIIIlllIl2.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI());
                }
                if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI()) {
                    net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aO, iiIllllllIllIIIlllIl2);
                }
            }
            this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl[] { iiIllllllIllIIIlllIl });
            if (iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().IIlIIIIlllIlllllIlII() == null) {
                this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll.lIIIIIlIlIIIlIIIIlIl);
            }
        }
        else {
            for (int j = 0; j < this.IlIIIlIlIIIllIlIlIIl.length; ++j) {
                int n2 = 0;
                if (j == 1) {
                    n2 = -1;
                }
                if (j == 2) {
                    n2 = 1;
                }
                if (j == 0) {
                    if (this.IllIllIlllIllllIIllI()) {
                        this.IlIIIlIlIIIllIlIlIIl[j] = (net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)new net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this, llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI2, n2, this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII();
                    }
                    else {
                        this.IlIIIlIlIIIllIlIlIIl[j] = (net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)new net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl(this, llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI2, n2, this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII();
                    }
                    this.IlIIIlIlIIIllIlIlIIl[j].llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
                }
                else {
                    this.IlIIIlIlIIIllIlIlIIl[j] = (net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)new IIIIIIIIIlllIllIlIlI(this, llllIIIIlIIIlIlllIll, n2, this.IlIIIlIlIIIllIlIlIIl[0], this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII();
                }
                this.IlIIIlIlIIIllIlIlIIl[j].llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII(this, this.IlIIIlIlIIIllIlIlIIl[j]));
            }
            this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
            if (this.IlIIIlIlIIIllIlIlIIl[0].lIllllllIIllIlIlIlII().IIlIIIIlllIlllllIlII() == null) {
                this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll.lIIIIIlIlIIIlIIIIlIl);
            }
        }
        this.llIIlIIIlIIIllIlIIIl();
    }
    
    @Override
    protected boolean lIIIIlIIIIIlllIllIII() {
        IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.info("Starting integrated minecraft server version 1.9");
        this.IlIIIlIlIIIllIlIlIIl(true);
        this.IlIlIIIllIllIIIIIllI(true);
        this.IllIIlllIIIIlllIIlIl(true);
        this.llllIIIlIlllIlIIIIIl(true);
        this.lIIIIlIIIIIlllIllIII(true);
        IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.info("Generating keypair");
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl());
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI() && !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll, new Object[0]), net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll, this)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(this.IIlIlIlIIlIllIIIIIIl(), this.IllIllIIIIlIIlIlllII(), this.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl(), this.IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII(), this.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl());
        this.lIIIIlIIIIIlllIllIII(String.valueOf(this.lllIllIIIllllllIllll()) + " - " + this.IlIIIlIlIIIllIlIlIIl[0].lIllllllIIllIlIlIlII().llIIlIIIlIIIllIlIIIl());
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI()) {
            final Object llllIIIlIlllIlIIIIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll, new Object[0]);
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl() == Boolean.TYPE) {
                return net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIllIlllIllllIIllI, this);
            }
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIllIlllIllllIIllI, this);
        }
        return true;
    }
    
    @Override
    public void IlIlIllllllllIIIIlII() {
        this.lllIlIIIIIlIlllllIlI();
        final boolean iIlllIIlIllIllIlIIll = this.IIlllIIlIllIllIlIIll;
        this.IIlllIIlIllIllIlIIll = (Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll() != null && Minecraft.getMinecraft().llIlIIIIIlIIlIlIIlll());
        if (!iIlllIIlIllIllIlIIll && this.IIlllIIlIllIllIlIIll) {
            IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.info("Saving and pausing game...");
            this.IIlllIIlllIIIlIlllII().llIIlIIIlIIIllIlIIIl();
            this.llllIIIIlIIIlIlllIll(false);
        }
        if (this.IIlllIIlIllIllIlIIll) {
            synchronized (this.llIIlIIIlIIIllIlIIIl) {
                while (!this.llIIlIIIlIIIllIlIIIl.isEmpty()) {
                    c.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.poll(), IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll);
                }
                // monitorexit(this.llIIlIIIlIIIllIlIIIl)
                return;
            }
        }
        super.IlIlIllllllllIIIIlII();
        if (this.llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI != this.IIlllIIlllIIIlIlllII().IlIlIIIIIIlllIlIllIl()) {
            IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.info("Changing view distance to {}, from {}", new Object[] { this.llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI, this.IIlllIIlllIIIlIlllII().IlIlIIIIIIlllIlIllIl() });
            this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI);
        }
        if (this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl != null) {
            final llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII = this.IlIIIlIlIIIllIlIlIIl[0].lIllllllIIllIlIlIlII();
            final llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII2 = this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII();
            if (!lIllllllIIllIlIlIlII.IIIlIIlIIIIlllIlllII() && lIllllllIIllIlIlIlII2.IIlIIIIlllIlllllIlII() != lIllllllIIllIlIlIlII.IIlIIIIlllIlllllIlII()) {
                IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.info("Changing difficulty to {}, from {}", new Object[] { lIllllllIIllIlIlIlII2.IIlIIIIlllIlllllIlII(), lIllllllIIllIlIlIlII.IIlIIIIlllIlllllIlII() });
                this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII2.IIlIIIIlllIlllllIlII());
            }
            else if (lIllllllIIllIlIlIlII2.IIIlIIlIIIIlllIlllII() && !lIllllllIIllIlIlIlII.IIIlIIlIIIIlllIlllII()) {
                IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.info("Locking difficulty to {}", new Object[] { lIllllllIIllIlIlIlII2.IIlIIIIlllIlllllIlII() });
                net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl[] ilIIIlIlIIIllIlIlIIl;
                for (int length = (ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl).length, i = 0; i < length; ++i) {
                    final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = ilIIIlIlIIIllIlIlIIl[i];
                    if (iiIllllllIllIIIlllIl != null) {
                        iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().IlIlIIIllIllIIIIIllI(true);
                    }
                }
            }
        }
    }
    
    @Override
    public boolean llIllIlIIIIllIlIIllI() {
        return false;
    }
    
    @Override
    public lllIllIIIllllllIllll lIlIlIIIllIIllIIIllI() {
        return this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl IlIlIIIllIIllIlllllI() {
        return (this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl == null) ? this.llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll.lIIIIIlIlIIIlIIIIlIl : this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IIlIIIIlllIlllllIlII();
    }
    
    @Override
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public boolean IlIllIlIlIIIlIlIlIII() {
        return true;
    }
    
    @Override
    public boolean IIlllIIlIllIllIlIIll() {
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        if (b) {
            final int llllIllllIllllIlIlII = this.llllIllllIllllIlIlII();
            if (llllIllllIllllIlIlII < this.IIllIIllIIIlIlIIIIlI + this.llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll.l) {
                return;
            }
            this.IIllIIllIIIlIlIIIIlI = llllIllllIllllIlIlII;
        }
        super.llllIIIIlIIIlIlllIll(b);
    }
    
    @Override
    public File IIlIIIIlllIlllllIlII() {
        return this.llllIIllllIlIlIIIIll.mcDataDir;
    }
    
    @Override
    public boolean IIlIIIlllIllIllIlIII() {
        return false;
    }
    
    @Override
    public boolean IlIIllIIllIIllIIlIIl() {
        return false;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl = super.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Type", new llIllIIIIIllIlIIIIlI(this));
        ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Is Modded", new net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this));
        return ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        super.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        if (this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl != null) {
            this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("snooper_partner", this.llllIIllllIlIlIIIIll.llllllIllIllIlIllllI().IllIIlllIIIIlllIIlIl());
    }
    
    @Override
    public boolean llIIIlIlIllIIlIlIlII() {
        return Minecraft.getMinecraft().llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final boolean b) {
        try {
            int llllIIIIlIIIlIlllIll = -1;
            try {
                llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll();
            }
            catch (IOException ex) {}
            if (llllIIIIlIIIlIlllIll <= 0) {
                llllIIIIlIIIlIlllIll = 25564;
            }
            this.IlIIlllllIIllIIlllll().llllIIIIlIIIlIlllIll(null, llllIIIIlIIIlIlllIll);
            IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.info("Started on " + llllIIIIlIIIlIlllIll);
            this.lllIIIIlllllIlIIllIl = true;
            (this.IlIlIIIIIIlllIlIllIl = new lIIIlllIIIllIIIllIII(this.lIlIIlllIIlIIlIlllIl(), new StringBuilder(String.valueOf(llllIIIIlIIIlIlllIll)).toString())).start();
            this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            this.IIlllIIlllIIIlIlllII().llIllIIIIIllIlIIIIlI(b);
            return new StringBuilder(String.valueOf(llllIIIIlIIIlIlllIll)).toString();
        }
        catch (IOException ex2) {
            return null;
        }
    }
    
    @Override
    public void IlIlIIIIIIlllIlIllIl() {
        super.IlIlIIIIIIlllIlIllIl();
        if (this.IlIlIIIIIIlllIlIllIl != null) {
            this.IlIlIIIIIIlllIlIllIl.interrupt();
            this.IlIlIIIIIIlllIlIllIl = null;
        }
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aj.llIllIIIIIllIlIIIIlI() || this.IIllIIllIIIlIlIIIIlI()) {
            Futures.getUnchecked((Future)this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this)));
        }
        super.IIIlIIIlIlIIlllIIlll();
        if (this.IlIlIIIIIIlllIlIllIl != null) {
            this.IlIlIIIIIIlllIlIllIl.interrupt();
            this.IlIlIIIIIIlllIlIllIl = null;
        }
    }
    
    public void lllllIlIlIlllIlllIlI() {
        this.IlllllllIIIlIIIlIlII();
    }
    
    public boolean IlIllllIIlIllIlIlIll() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    @Override
    public boolean lIllIIIIIlllIIlIIllI() {
        return true;
    }
    
    @Override
    public int llllIIllllIlIlIIIIll() {
        return 4;
    }
    
    private void lllIlIIIIIlIlllllIlI() {
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl> iterator = Arrays.asList(this.IlIIIlIlIIIllIlIlIIl).iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(iterator.next());
        }
    }
    
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII llIllIlIIIIllIlIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        return this.IlIlIIIllIIllIlllllI;
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIlIlIlIIIII()) {
            this.llIllIIIIIllIlIIIIlI(iiIllllllIllIIIlllIl);
        }
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII()) {
            this.IlIlIlIlIlllllllllIl(iiIllllllIllIIIlllIl);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = false;
            net.optifine.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c(), iiIllllllIllIIIlllIl);
        }
        if (this.llIllIlIIIIllIlIIllI == iiIllllllIllIIIlllIl && this.lIlIlIIIllIIllIIIllI != null) {
            this.IlIlIIIllIIllIlllllI = iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII(this.lIlIlIIIllIIllIIIllI);
            this.llIllIlIIIIllIlIIllI = null;
            this.lIlIlIIIllIIllIIIllI = null;
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        final llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII = iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII();
        if (lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll() || lIllllllIIllIlIlIlII.IlIlIIIllIIllIlllllI()) {
            lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl(0);
            lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl(false);
            iiIllllllIllIIIlllIl.llIllIlIIIIllIlIIllI(0.0f);
            lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI(0);
            lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(false);
            iiIllllllIllIIIlllIl.lIIIlllIIIllIIIllIII(0.0f);
            this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(2, 0.0f));
            this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(7, 0.0f));
            this.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(8, 0.0f));
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().IIlllIIlIllIllIlIIll().llllIIIIlIIIlIlllIll() == 1) {
            final long ilIlIllllllllIIIIlII = iiIllllllIllIIIlllIl.IlIlIllllllllIIIIlII();
            final long n = ilIlIllllllllIIIIlII % 24000L;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll()) {
                if (n <= 1000L) {
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII - n + 1001L);
                }
                if (n >= 11000L) {
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII - n + 24001L);
                }
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll()) {
                if (n <= 14000L) {
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII - n + 14001L);
                }
                if (n >= 22000L) {
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII - n + 24000L + 14001L);
                }
            }
        }
    }
}
