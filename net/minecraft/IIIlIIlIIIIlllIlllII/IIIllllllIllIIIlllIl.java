package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import org.apache.logging.log4j.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import com.google.common.base.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import com.google.common.util.concurrent.*;

public class IIIllllllIllIIIlllIl extends IlllllllIIIlIIIlIlII implements lIlIIlllIIlIIlIlllIl
{
    private static final Logger llllllIllIllIlIllllI;
    private final llllIIIIlIIIlIlllIll IIIllllllIllIIIlllIl;
    private final net.minecraft.llllIIIlIlllIlIIIIIl.IlllllllIIIlIIIlIlII IlIIIlIIIllllIlIlIlI;
    private final IllIIlllIIIIlllIIlIl IIIIIllIIIIlIIIIllIl;
    private final Set IIIIIIIIIlllIllIlIlI;
    private final TreeSet IIllllIIIlIIIIIIllIl;
    private final Map IlllIIIIlIIIlIlIlIIl;
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl llIIlllIIlllIIllIllI;
    public boolean IIlllIIIlIlllIIlllII;
    private boolean lllIllIIIllllllIllll;
    private int llIllIlIlIIIIIIIllII;
    private final IIIlIIIlIlIIlllIIlll IIlIlIlIIlIllIIIIIIl;
    private final IIllIIllIIIlIlIIIIlI IllIllIIIIlIIlIlllII;
    protected final llllIIIlIlllIlIIIIIl IIlIIIIIllIlIIIlIIll;
    private IIIIIllIIIIlIIIIllIl[] IlIllllIIlIIlIlIlIll;
    private int IllIllIlllIllllIIllI;
    private static final List llIlIIIIIlIIlIlIIlll;
    private List IlIIlIlIIIlIIlIlIlII;
    
    static {
        llllllIllIllIlIllllI = LogManager.getLogger();
        llIlIIIIIlIIlIlIIlll = Lists.newArrayList((Object[])new k[] { new k(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, 0, 1, 3, 10), new k(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl), 0, 1, 3, 10), new k(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl), 0, 1, 3, 10), new k(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI, 0, 1, 1, 3), new k(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIllIlIlIIIlIlIlIII, 0, 1, 1, 5), new k(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIIIIlllIlIllIl, 0, 1, 1, 3), new k(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll, 0, 1, 1, 5), new k(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, 0, 2, 3, 5), new k(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII, 0, 2, 3, 3), new k(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl), 0, 1, 3, 10) });
    }
    
    public IIIllllllIllIIIlllIl(final llllIIIIlIIIlIlllIll iiIllllllIllIIIlllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final int n, final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2) {
        super(ilIIIlIlIIIllIlIlIIl, llllIIllllIlIlIIIIll, net.minecraft.IIIlIIlIIIIlllIlllII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n), ilIIIlIlIIIllIlIlIIl2, false);
        this.IIIIIIIIIlllIllIlIlI = Sets.newHashSet();
        this.IIllllIIIlIIIIIIllIl = new TreeSet();
        this.IlllIIIIlIIIlIlIlIIl = Maps.newHashMap();
        this.IllIllIIIIlIIlIlllII = new IIllIIllIIIlIlIIIIlI();
        this.IIlIIIIIllIlIIIlIIll = new llllIIIlIlllIlIIIIIl(this);
        this.IlIllllIIlIIlIlIlIll = new IIIIIllIIIIlIIIIllIl[] { new IIIIIllIIIIlIIIIllIl(null), new IIIIIllIIIIlIIIIllIl(null) };
        this.IlIIlIlIIIlIIlIlIlII = Lists.newArrayList();
        this.IIIllllllIllIIIlllIl = iiIllllllIllIIIlllIl;
        this.IlIIIlIIIllllIlIlIlI = new net.minecraft.llllIIIlIlllIlIIIIIl.IlllllllIIIlIIIlIlII(this);
        this.IIIIIllIIIIlIIIIllIl = new IllIIlllIIIIlllIIlIl(this);
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this);
        this.lllIIIIlllllIlIIllIl = this.IlIlIlIlIlllllllllIl();
        this.IIlIlIlIIlIllIIIIIIl = new IIIlIIIlIlIIlllIIlll(this);
        this.lllIIIIlllllIlIIllIl();
        this.IlIlIIIIIIlllIlIllIl();
        this.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.IIIIIIIllllIlIIIIIII());
    }
    
    @Override
    public IlllllllIIIlIIIlIlII lIIIlllIIIllIIIllIII() {
        this.IlIlIIIlIIlIlIIlllIl = new lIIIIlIIIIIlllIllIII(this.IlIlIIIIIIlllIlIllIl);
        final String llllIIIIlIIIlIlllIll = net.minecraft.IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
        final IlIlIIIllIllIIIIIllI illlllllIIIlIIIlIlII = (IlIlIIIllIllIIIIIllI)this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.class, llllIIIIlIIIlIlllIll);
        if (illlllllIIIlIIIlIlII == null) {
            this.IlllllllIIIlIIIlIlII = new IlIlIIIllIllIIIIIllI(this);
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.IlllllllIIIlIIIlIlII);
        }
        else {
            (this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll(this);
        }
        this.IIIlIIlIIIIlllIlllII = new net.minecraft.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI(this.IIIllllllIllIIIlllIl);
        llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.class, "scoreboard");
        if (llIllIlIIIIllIlIIllI == null) {
            llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI();
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll("scoreboard", llIllIlIIIIllIlIIllI);
        }
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII);
        ((net.minecraft.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI)this.IIIlIIlIIIIlllIlllII).llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI);
        this.IllIllIlllIllllIIllI().IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI.llIIIlIlIllIIlIlIlII(), this.IIllIIllIIIlIlIIIIlI.lllllIlIIIlIlIIlllII());
        this.IllIllIlllIllllIIllI().llIllIIIIIllIlIIIIlI(this.IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI());
        this.IllIllIlllIllllIIllI().IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll());
        this.IllIllIlllIllllIIllI().llIllIIIIIllIlIIIIlI(this.IIllIIllIIIlIlIIIIlI.IIIllllllIllIIIlllIl());
        this.IllIllIlllIllllIIllI().IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI.IlIIIlIIIllllIlIlIlI());
        if (this.IIllIIllIIIlIlIIIIlI.llIIlllIIlllIIllIllI() > 0L) {
            this.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI.lIllllllIIllIlIlIlII(), this.IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII(), this.IIllIIllIIIlIlIIIIlI.llIIlllIIlllIIllIllI());
        }
        else {
            this.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI.lIllllllIIllIlIlIlII());
        }
        return this;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        super.llllIIIIlIIIlIlllIll();
        if (this.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl() && this.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
            this.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl);
        }
        this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIIllIlllllI().IlIlIlIlIlllllllllIl();
        if (this.lIIIIlIIIIIlllIllIII()) {
            if (this.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doDaylightCycle")) {
                final long n = this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl() + 24000L;
                this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(n - n % 24000L);
            }
            this.llllIIIlIlllIlIIIIIl();
        }
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("mobSpawner");
        if (this.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobSpawning") && this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI() != net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll(this, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl() % 400L == 0L);
        }
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("chunkSource");
        this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl();
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(1.0f);
        if (llllIIIIlIIIlIlllIll != this.llIllIlIlIIIIIIIllII()) {
            this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
        }
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl() + 1L);
        if (this.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doDaylightCycle")) {
            this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl() + 1L);
        }
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("tickPending");
        this.llllIIIIlIIIlIlllIll(false);
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("tickBlocks");
        this.llIllIIIIIllIlIIIIlI();
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("chunkMap");
        this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl();
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("village");
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll();
        this.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll();
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("portalForcer");
        this.IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII());
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IIIllIIIlIlIIllIIIlI();
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final List llllIIIIlIIIlIlllIll = this.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl);
        return (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.isEmpty()) ? ((net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI)i.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll)) : null;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final List llllIIIIlIIIlIlllIll = this.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl);
        return llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.isEmpty() && llllIIIIlIIIlIlllIll.contains(lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public void IIlllIIIlIlllIIlllII() {
        this.lllIllIIIllllllIllll = false;
        if (!this.IllIIlllIIIIlllIIlIl.isEmpty()) {
            int n = 0;
            int n2 = 0;
            for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.IllIIlllIIIIlllIIlIl) {
                if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
                    ++n;
                }
                else {
                    if (!llllIIIIlIIIlIlllIll.ah()) {
                        continue;
                    }
                    ++n2;
                }
            }
            this.lllIllIIIllllllIllll = (n2 > 0 && n2 >= this.IllIIlllIIIIlllIIlIl.size() - n);
        }
    }
    
    protected void llllIIIlIlllIlIIIIIl() {
        this.lllIllIIIllllllIllll = false;
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.IllIIlllIIIIlllIIlIl) {
            if (llllIIIIlIIIlIlllIll.ah()) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(false, false, true);
            }
        }
        this.IllIIlllllIIllIIllIl();
    }
    
    private void IllIIlllllIIllIIllIl() {
        this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl(0);
        this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(false);
        this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI(0);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(false);
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        if (this.lllIllIIIllllllIllll && !this.IlIlIllllllllIIIIlII) {
            for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.IllIIlllIIIIlllIIlIl) {
                if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl() || !llllIIIIlIIIlIlllIll.t()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void llIllIlIIIIllIlIIllI() {
        if (this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl() <= 0) {
            this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.IlIlIIIlIIlIlIIlllIl() + 1);
        }
        int llIllIIIIIllIlIIIIlI = this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI();
        int ilIlIIIllIllIIIIIllI = this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI();
        int n = 0;
        while (this.IlIlIIIllIllIIIIIllI(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, 0, ilIlIIIllIllIIIIIllI)).IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            llIllIIIIIllIlIIIIlI += this.llllIIllllIlIlIIIIll.nextInt(8) - this.llllIIllllIlIlIIIIll.nextInt(8);
            ilIlIIIllIllIIIIIllI += this.llllIIllllIlIlIIIIll.nextInt(8) - this.llllIIllllIlIlIIIIll.nextInt(8);
            if (++n == 10000) {
                break;
            }
        }
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI);
    }
    
    @Override
    protected void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
        if (this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI() == net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            for (final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.IIlllIlIIllIlIlIlIIl) {
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(false);
            }
        }
        else {
            int n = 0;
            int n2 = 0;
            for (final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 : this.IIlllIlIIllIlIlIlIIl) {
                final int n3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll * 16;
                final int n4 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl * 16;
                this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("getChunk");
                final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl);
                this.llllIIIIlIIIlIlllIll(n3, n4, llllIIIIlIIIlIlllIll);
                this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("tickChunk");
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(false);
                this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("thunder");
                if (this.llllIIllllIlIlIIIIll.nextInt(100000) == 0 && this.llllllIllIllIlIllllI() && this.IIlIIIIIllIlIIIlIIll()) {
                    this.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII * 3 + 1013904223;
                    final int n5 = this.lIIIlllIIIllIIIllIII >> 2;
                    final IlIlIlIlIlllllllllIl llIIlllIIlllIIllIllI = this.llIIlllIIlllIIllIllI(new IlIlIlIlIlllllllllIl(n3 + (n5 & 0xF), 0, n4 + (n5 >> 8 & 0xF)));
                    if (this.llIIIlIlIllIIlIlIlII(llIIlllIIlllIIllIllI)) {
                        this.IlIlIIIllIllIIIIIllI(new net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this, llIIlllIIlllIIllIllI.lIIIIlIIIIIlllIllIII(), llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII(), llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl()));
                    }
                }
                this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("iceandsnow");
                if (this.llllIIllllIlIlIIIIll.nextInt(16) == 0) {
                    this.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII * 3 + 1013904223;
                    final int n6 = this.lIIIlllIIIllIIIllIII >> 2;
                    final IlIlIlIlIlllllllllIl iIlllIIlIllIllIlIIll = this.IIlllIIlIllIllIlIIll(new IlIlIlIlIlllllllllIl(n3 + (n6 & 0xF), 0, n4 + (n6 >> 8 & 0xF)));
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = iIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl();
                    if (this.IlIlIIIlIIlIlIIlllIl(ilIlIlIlIlllllllllIl3)) {
                        this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII.lllIllIIIllllllIllll());
                    }
                    if (this.llllllIllIllIlIllllI() && this.IllIIlllIIIIlllIIlIl(iIlllIIlIllIllIlIIll, true)) {
                        this.IlIlIlIlIlllllllllIl(iIlllIIlIllIllIlIIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI.lllIllIIIllllllIllll());
                    }
                    if (this.llllllIllIllIlIllllI() && this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3).IlIlIIIllIllIIIIIllI()) {
                        this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3).llIllIIIIIllIlIIIIlI().llllIIIlIlllIlIIIIIl(this, ilIlIlIlIlllllllllIl3);
                    }
                }
                this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("tickBlocks");
                final int llIllIIIIIllIlIIIIlI = this.llIIlllIIlllIIllIllI().llIllIIIIIllIlIIIIlI("randomTickSpeed");
                if (llIllIIIIIllIlIIIIlI > 0) {
                    net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl[] ilIlIlIlIlllllllllIl4;
                    for (int length = (ilIlIlIlIlllllllllIl4 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()).length, i = 0; i < length; ++i) {
                        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl4[i];
                        if (llllIIIlIlllIlIIIIIl != null && llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl()) {
                            for (int j = 0; j < llIllIIIIIllIlIIIIlI; ++j) {
                                this.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII * 3 + 1013904223;
                                final int n7 = this.lIIIlllIIIllIIIllIII >> 2;
                                final int n8 = n7 & 0xF;
                                final int n9 = n7 >> 8 & 0xF;
                                final int n10 = n7 >> 16 & 0xF;
                                ++n2;
                                final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n8, n10, n9);
                                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
                                if (llIllIIIIIllIlIIIIlI2.IlIlIIIllIIllIlllllI()) {
                                    ++n;
                                    llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(this, new IlIlIlIlIlllllllllIl(n8 + n3, n10 + llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(), n9 + n4), llllIIIIlIIIlIlllIll2, this.llllIIllllIlIlIIIIll);
                                }
                            }
                        }
                    }
                }
                this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
            }
        }
    }
    
    protected IlIlIlIlIlllllllllIl llIIlllIIlllIIllIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIlIlIlIlllllllllIl iIlllIIlIllIllIlIIll = this.IIlllIIlIllIllIlIIll(ilIlIlIlIlllllllllIl);
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll, new IlIlIlIlIlllllllllIl(iIlllIIlIllIllIlIIll.lIIIIlIIIIIlllIllIII(), this.IlIIIlIIIllllIlIlIlI(), iIlllIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl())).IlIlIlIlIlllllllllIl(3.0, 3.0, 3.0), (Predicate)new IlIIIlIIIllllIlIlIlI(this));
        return llllIIIIlIIIlIlllIll.isEmpty() ? iIlllIIlIllIllIlIIll : llllIIIIlIIIlIlllIll.get(this.llllIIllllIlIlIIIIll.nextInt(llllIIIIlIIIlIlllIll.size())).IlIlIIIlIIlIlIIlllIl();
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IlIIlIlIIIlIIlIlIlII.contains(new IlIlIIIIIIlllIlIllIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, n, 0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, int n, final int n2) {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        final int n3 = 0;
        if (this.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            if (llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl()) {
                final int n4 = 8;
                if (this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-n4, -n4, -n4), ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n4, n4, n4))) {
                    final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll);
                    if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll()) {
                        ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(this, ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2, this.llllIIllllIlIlIIIIll);
                    }
                }
                return;
            }
            n = 1;
        }
        if (this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-n3, -n3, -n3), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n3, n3, n3))) {
            if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(n + this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl());
                ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(n2);
            }
            if (!this.IIIIIIIIIlllIllIlIlI.contains(ilIlIIIIIIlllIlIllIl)) {
                this.IIIIIIIIIlllIllIlIlI.add(ilIlIIIIIIlllIlIllIl);
                this.IIllllIIIlIIIIIIllIl.add(ilIlIIIIIIlllIlIllIl);
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(n2);
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(n + this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl());
        }
        if (!this.IIIIIIIIIlllIllIlIlI.contains(ilIlIIIIIIlllIlIllIl)) {
            this.IIIIIIIIIlllIllIlIlI.add(ilIlIIIIIIlllIlIllIl);
            this.IIllllIIIlIIIIIIllIl.add(ilIlIIIIIIlllIlIllIl);
        }
    }
    
    @Override
    public void llllIIllllIlIlIIIIll() {
        if (this.IllIIlllIIIIlllIIlIl.isEmpty()) {
            if (this.llIllIlIlIIIIIIIllII++ >= 1200) {
                return;
            }
        }
        else {
            this.llIlIIIIIlIIlIlIIlll();
        }
        super.llllIIllllIlIlIIIIll();
    }
    
    public void llIlIIIIIlIIlIlIIlll() {
        this.llIllIlIlIIIIIIIllII = 0;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final boolean b) {
        if (this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI() == net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            return false;
        }
        int size = this.IIllllIIIlIIIIIIllIl.size();
        if (size != this.IIIIIIIIIlllIllIlIlI.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (size > 1000) {
            size = 1000;
        }
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("cleaning");
        for (int i = 0; i < size; ++i) {
            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = this.IIllllIIIlIIIIIIllIl.first();
            if (!b && ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl > this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl()) {
                break;
            }
            this.IIllllIIIlIIIIIIllIl.remove(ilIlIIIIIIlllIlIllIl);
            this.IIIIIIIIIlllIllIlIlI.remove(ilIlIIIIIIlllIlIllIl);
            this.IlIIlIlIIIlIIlIlIlII.add(ilIlIIIIIIlllIlIllIl);
        }
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("ticking");
        final Iterator iterator = this.IlIIlIlIIIlIIlIlIlII.iterator();
        while (iterator.hasNext()) {
            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = iterator.next();
            iterator.remove();
            final int n = 0;
            if (this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-n, -n, -n), ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n, n))) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll);
                if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || !net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll())) {
                    continue;
                }
                try {
                    ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(this, ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, this.llllIIllllIlIlIIIIll);
                    continue;
                }
                catch (Throwable t) {
                    final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Exception while ticking a block");
                    net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Block being ticked"), ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
                }
            }
            this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll, ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll(), 0);
        }
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlIIlIlIIIlIIlIlIlII.clear();
        return !this.IIllllIIIlIIIIIIllIl.isEmpty();
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
        final int n = (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll << 4) - 2;
        final int n2 = n + 16 + 2;
        final int n3 = (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl << 4) - 2;
        return this.IlIlIlIlIlllllllllIl(new IlIlIIIlIIlIlIIlllIl(n, 0, n3, n2, 256, n3 + 16 + 2), b);
    }
    
    @Override
    public List IlIlIlIlIlllllllllIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final boolean b) {
        List<IlIlIIIIIIlllIlIllIl> arrayList = null;
        for (int i = 0; i < 2; ++i) {
            Iterator<IlIlIIIIIIlllIlIllIl> iterator;
            if (i == 0) {
                iterator = (Iterator<IlIlIIIIIIlllIlIllIl>)this.IIllllIIIlIIIIIIllIl.iterator();
            }
            else {
                iterator = (Iterator<IlIlIIIIIIlllIlIllIl>)this.IlIIlIlIIIlIIlIlIlII.iterator();
            }
            while (iterator.hasNext()) {
                final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = iterator.next();
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;
                if (llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() >= ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() < ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() >= ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() < ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl) {
                    if (b) {
                        this.IIIIIIIIIlllIllIlIlI.remove(ilIlIIIIIIlllIlIllIl);
                        iterator.remove();
                    }
                    if (arrayList == null) {
                        arrayList = (List<IlIlIIIIIIlllIlIllIl>)Lists.newArrayList();
                    }
                    arrayList.add(ilIlIIIIIIlllIlIllIl);
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final boolean b) {
        if (!this.lIlIIlllIIlIIlIlllIl() && (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl || llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llllllIllIllIlIllllI)) {
            llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII();
        }
        if (!this.lIllIIIIIlllIIlIIllI() && llIllIIIIIllIlIIIIlI instanceof IIlllIIIlIlllIIlllII) {
            llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII();
        }
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, b);
    }
    
    private boolean lIllIIIIIlllIIlIIllI() {
        return this.IIIllllllIllIIIlllIl.lIIIIlIlIllllIIlIllI();
    }
    
    private boolean lIlIIlllIIlIIlIlllIl() {
        return this.IIIllllllIllIIIlllIl.llIIIIIIlIllIIlIIIll();
    }
    
    @Override
    protected net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl() {
        return this.llIIlllIIlllIIllIllI = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl(this, this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII), this.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI());
    }
    
    public List llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.size(); ++i) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl.get(i);
            final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI();
            if (lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII() >= n && lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() >= n2 && lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl() >= n3 && lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII() < n4 && lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() < n5 && lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl() < n6) {
                arrayList.add(ilIIIlIlIIIllIlIlIIl);
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return !this.IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(this, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll) && this.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        if (!this.IIllIIllIIIlIlIIIIlI.IlIlIIIlIIlIlIIlllIl()) {
            try {
                this.IlIlIlIlIlllllllllIl(illlIIIIlIIIlIlIlIIl);
                if (this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI() == net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
                    this.llIIIllIlIllIllIIIIl();
                }
                super.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl);
            }
            catch (Throwable t) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Exception initializing level");
                try {
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                }
                catch (Throwable t2) {}
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
            this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl(true);
        }
    }
    
    private void llIIIllIlIllIllIIIIl() {
        this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl(false);
        this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(true);
        this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(false);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(false);
        this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl(1000000000);
        this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(6000L);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI);
        this.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl(false);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
        this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI(true);
        this.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll("doDaylightCycle", "false");
    }
    
    private void IlIlIlIlIlllllllllIl(final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        if (!this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI()) {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII()));
        }
        else if (this.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI() == net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        }
        else {
            this.IIIlIIIlIlIIlllIIlll = true;
            final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl ilIlIIIllIIllIlllllI = this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIIllIlllllI();
            final List llllIIIIlIIIlIlllIll = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll();
            final Random random = new Random(this.IIlIIIIlllIlllllIlII());
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(0, 0, 256, llllIIIIlIIIlIlllIll, random);
            int liiiIlIIIIIlllIllIII = 0;
            final int liiIlllIIIllIIIllIII = this.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII();
            int llIIlIIIlIIIllIlIIIl = 0;
            if (llllIIIIlIIIlIlllIll2 != null) {
                liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII();
                llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
            }
            else {
                net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl.llllllIllIllIlIllllI.warn("Unable to find spawn biome");
            }
            int n = 0;
            while (!this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, llIIlIIIlIIIllIlIIIl)) {
                liiiIlIIIIIlllIllIII += random.nextInt(64) - random.nextInt(64);
                llIIlIIIlIIIllIlIIIl += random.nextInt(64) - random.nextInt(64);
                if (++n == 1000) {
                    break;
                }
            }
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl));
            this.IIIlIIIlIlIIlllIIlll = false;
            if (illlIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI()) {
                this.IlIIlIlIIIlIIlIlIlII();
            }
        }
    }
    
    protected void IlIIlIlIIIlIIlIlIlII() {
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII(net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl.llIlIIIIIlIIlIlIIlll, 10);
        for (int n = 0; n < 10 && !llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(this, this.llllIIllllIlIlIIIIll, this.lllIIIIlllllIlIIllIl(new IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI() + this.llllIIllllIlIlIIIIll.nextInt(6) - this.llllIIllllIlIlIIIIll.nextInt(6), 0, this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI() + this.llllIIllllIlIlIIIIll.nextInt(6) - this.llllIIllllIlIlIIIIll.nextInt(6))).llllIIIIlIIIlIlllIll()); ++n) {}
    }
    
    public IlIlIlIlIlllllllllIl IllIlIIllIllIIlIllII() {
        return this.IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII();
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        if (this.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI()) {
            if (lllllIIIIIlIlIIIIIIl != null) {
                lllllIIIIIlIlIIIIIIl.IlIlIlIlIlllllllllIl("Saving level");
            }
            this.IIlIIIlllIllIllIlIII();
            if (lllllIIIIIlIlIIIIIIl != null) {
                lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI("Saving chunks");
            }
            this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(b, lllllIIIIIlIlIIIIIIl);
            for (final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : Lists.newArrayList((Iterable)this.llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl())) {
                if (llllIIIIlIIIlIlllIll != null && !this.IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl)) {
                    this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
                }
            }
        }
    }
    
    public void lIIlIIIlIllIlIllIIIl() {
        if (this.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI()) {
            this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll();
        }
    }
    
    protected void IIlIIIlllIllIllIlIII() {
        this.IlllllllIIIlIIIlIlII();
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIllIlllIllllIIllI().lIIIIlIIIIIlllIllIII());
        this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl(this.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll());
        this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(this.IllIllIlllIllllIIllI().IlIlIlIlIlllllllllIl());
        this.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI(this.IllIllIlllIllllIIllI().IlIlIIIllIIllIlllllI());
        this.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl(this.IllIllIlllIllllIIllI().IIIIlllIIIIIIlIIIlll());
        this.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII(this.IllIllIlllIllllIIllI().IIlllIIlIllIllIlIIll());
        this.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII(this.IllIllIlllIllllIIllI().IlIllIlIlIIIlIlIlIII());
        this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.IllIllIlllIllllIIllI().llIIlIIIlIIIllIlIIIl());
        this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(this.IllIllIlllIllllIIllI().lIIIlllIIIllIIIllIII());
        this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl());
        this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    protected void llIllIIIIIllIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl(), llIllIIIIIllIlIIIIlI);
        this.IlllIIIIlIIIlIlIlIIl.put(llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl(), llIllIIIIIllIlIIIIlI);
        final llIllIIIIIllIlIIIIlI[] ilIllllIIlIllIlIlIll = llIllIIIIIllIlIIIIlI.IlIllllIIlIllIlIlIll();
        if (ilIllllIIlIllIlIlIll != null) {
            for (int i = 0; i < ilIllllIIlIllIlIlIll.length; ++i) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIllllIIlIllIlIlIll[i].IlllIIIIlIIIlIlIlIIl(), ilIllllIIlIllIlIlIll[i]);
            }
        }
    }
    
    @Override
    protected void IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI);
        this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
        this.IlllIIIIlIIIlIlIlIIl.remove(llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl());
        final llIllIIIIIllIlIIIIlI[] ilIllllIIlIllIlIlIll = llIllIIIIIllIlIIIIlI.IlIllllIIlIllIlIlIll();
        if (ilIllllIIlIllIlIlIll != null) {
            for (int i = 0; i < ilIllllIIlIllIlIlIll.length; ++i) {
                this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(ilIllllIIlIllIlIlIll[i].IlllIIIIlIIIlIlIlIIl());
            }
        }
    }
    
    @Override
    public boolean IlIlIIIllIllIIIIIllI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (super.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI)) {
            this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, 512.0, this.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll(), new IllIlIIllIllIIlIllII(llIllIIIIIllIlIIIIlI));
            return true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final byte b) {
        this.lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, new llIIIlIlIllIIlIlIlII(llIllIIIIIllIlIIIIlI, b));
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final boolean b, final boolean b2) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new net.minecraft.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII(this, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, b, b2);
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(false);
        if (!b2) {
            liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
        }
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.IllIIlllIIIIlllIIlIl) {
            if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(n, n2, n3) < 4096.0) {
                ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IllIllIIIIlIIlIlllII(n, n2, n3, n4, liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(), (e)liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().get(llllIIIIlIIIlIlllIll)));
            }
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII = new IIlllIIlllIIIlIlllII(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, n, n2);
        final Iterator<IIlllIIlllIIIlIlllII> iterator = this.IlIllllIIlIIlIlIlIll[this.IllIllIlllIllllIIllI].iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(illlIIlllIIIlIlllII)) {
                return;
            }
        }
        this.IlIllllIIlIIlIlIlIll[this.IllIllIlllIllllIIllI].add(illlIIlllIIIlIlllII);
    }
    
    private void IIIllIIIlIlIIllIIIlI() {
        while (!this.IlIllllIIlIIlIlIlIll[this.IllIllIlllIllllIIllI].isEmpty()) {
            final int illIllIlllIllllIIllI = this.IllIllIlllIllllIIllI;
            this.IllIllIlllIllllIIllI ^= 0x1;
            for (final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII : this.IlIllllIIlIIlIlIlIll[illIllIlllIllllIIllI]) {
                if (this.llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII)) {
                    this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII(), illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII(), illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl(), 64.0, this.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll(), new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(), illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl(), illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(), illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI()));
                }
            }
            this.IlIllllIIlIIlIlIlIll[illIllIlllIllllIIllI].clear();
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll());
        return ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl() && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(this, illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(), ilIlIlIlIlllllllllIl, illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(), illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI());
    }
    
    public void lIlIlIlllIIlIlIlllIl() {
        this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI() {
        final boolean llllllIllIllIlIllllI = this.llllllIllIllIlIllllI();
        super.IlIlIIIllIllIIIIIllI();
        if (this.llIllIlIIIIllIlIIllI != this.lIlIlIIIllIIllIIIllI) {
            this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(7, this.lIlIlIIIllIIllIIIllI), this.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll());
        }
        if (this.IlIlIIIllIIllIlllllI != this.IIIIlllIIIIIIlIIIlll) {
            this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(8, this.IIIIlllIIIIIIlIIIlll), this.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll());
        }
        if (llllllIllIllIlIllllI != this.llllllIllIllIlIllllI()) {
            if (llllllIllIllIlIllllI) {
                this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(2, 0.0f));
            }
            else {
                this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(1, 0.0f));
            }
            this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(7, this.lIlIlIIIllIIllIIIllI));
            this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(8, this.IIIIlllIIIIIIlIIIlll));
        }
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.IIIllllllIllIIIlllIl.IIlllIIlllIIIlIlllII().IlIlIIIIIIlllIlIllIl();
    }
    
    public llllIIIIlIIIlIlllIll llIIIIIIlIllIIlIIIll() {
        return this.IIIllllllIllIIIlllIl;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlllllllIIIlIIIlIlII lIIIIlIlIllllIIlIllI() {
        return this.IlIIIlIIIllllIlIlIlI;
    }
    
    public IllIIlllIIIIlllIIlIl IlIIllIIllIIllIIlIIl() {
        return this.IIIIIllIIIIlIIIIllIl;
    }
    
    public IIIlIIIlIlIIlllIIlll lllllIIIIIlIlIIIIIIl() {
        return this.IIlIlIlIIlIllIIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final double n, final double n2, final double n3, final int n4, final double n5, final double n6, final double n7, final double n8, final int... array) {
        this.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, false, n, n2, n3, n4, n5, n6, n7, n8, array);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final boolean b, final double n, final double n2, final double n3, final int n4, final double n5, final double n6, final double n7, final double n8, final int... array) {
        final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = new llIlIIIIIlIIlIlIIlll(ilIllllIIlIIlIlIlIll, b, (float)n, (float)n2, (float)n3, (float)n5, (float)n6, (float)n7, (float)n8, n4, array);
        for (int i = 0; i < this.IllIIlllIIIIlllIIlIl.size(); ++i) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IllIIlllIIIIlllIIlIl.get(i);
            final double ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl().IlIlIlIlIlllllllllIl(n, n2, n3);
            if (ilIlIlIlIlllllllllIl <= 256.0 || (b && ilIlIlIlIlllllllllIl <= 65536.0)) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll);
            }
        }
    }
    
    public llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl(final UUID uuid) {
        return this.IlllIIIIlIIIlIlIlIIl.get(uuid);
    }
    
    @Override
    public ListenableFuture llllIIIIlIIIlIlllIll(final Runnable runnable) {
        return this.IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(runnable);
    }
    
    @Override
    public boolean llIIIlIlllIllIIlIllI() {
        return this.IIIllllllIllIIIlllIl.llIIIlIlllIllIIlIllI();
    }
}
