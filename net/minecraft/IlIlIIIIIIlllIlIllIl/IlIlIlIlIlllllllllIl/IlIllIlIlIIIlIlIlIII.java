package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.io.*;
import java.text.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import com.mojang.authlib.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import com.google.common.collect.*;
import java.net.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;

public abstract class IlIllIlIlIIIlIlIlIII
{
    public static final File llllIIIIlIIIlIlllIll;
    public static final File IlIlIlIlIlllllllllIl;
    public static final File llIllIIIIIllIlIIIIlI;
    public static final File IlIIIlIlIIIllIlIlIIl;
    private static final Logger IllIIlllIIIIlllIIlIl;
    private static final SimpleDateFormat llllIIIlIlllIlIIIIIl;
    private final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private final List lIIIlllIIIllIIIllIII;
    private final Map llIIlIIIlIIIllIlIIIl;
    private final IIIlIIIlIlIIlllIIlll llIllIlIIIIllIlIIllI;
    private final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI;
    private final IIlIIIIlllIlllllIlII IlIlIIIllIIllIlllllI;
    private final IlIlIllllllllIIIIlII IIIIlllIIIIIIlIIIlll;
    private final Map llllIIllllIlIlIIIIll;
    private net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    protected int IlIlIIIllIllIIIIIllI;
    private int lllIIIIlllllIlIIllIl;
    private lllIllIIIllllllIllll IlIlIIIIIIlllIlIllIl;
    private boolean IIllIIllIIIlIlIIIIlI;
    private int IIIlIIIlIlIIlllIIlll;
    
    static {
        llllIIIIlIIIlIlllIll = new File("banned-players.json");
        IlIlIlIlIlllllllllIl = new File("banned-ips.json");
        llIllIIIIIllIlIIIIlI = new File("ops.json");
        IlIIIlIlIIIllIlIlIIl = new File("whitelist.json");
        IllIIlllIIIIlllIIlIl = LogManager.getLogger();
        llllIIIlIlllIlIIIIIl = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    }
    
    public IlIllIlIlIIIlIlIlIII(final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
        this.llIIlIIIlIIIllIlIIIl = Maps.newHashMap();
        this.llIllIlIIIIllIlIIllI = new IIIlIIIlIlIIlllIIlll(net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll);
        this.lIlIlIIIllIIllIIIllI = new IlIlIlIlIlllllllllIl(net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl);
        this.IlIlIIIllIIllIlllllI = new IIlIIIIlllIlllllIlII(net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI);
        this.IIIIlllIIIIIIlIIIlll = new IlIlIllllllllIIIIlII(net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl);
        this.llllIIllllIlIlIIIIll = Maps.newHashMap();
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(false);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(false);
        this.IlIlIIIllIllIIIIIllI = 8;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final GameProfile r = ilIIIlIlIIIllIlIlIIl.r();
        final net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII liiiiIlIlIIIlIIIIlIl = this.lIIIIlIIIIIlllIllIII.lIIIIIlIlIIIlIIIIlIl();
        final GameProfile llllIIIIlIIIlIlllIll = liiiiIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(r.getId());
        final String s = (llllIIIIlIIIlIlllIll == null) ? r.getName() : llllIIIIlIIIlIlllIll.getName();
        liiiiIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(r);
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl));
        ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((IIIllllllIllIIIlllIl)ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII);
        String string = "local";
        if (illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl() != null) {
            string = illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl().toString();
        }
        net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl.info(String.valueOf(ilIIIlIlIIIllIlIlIIl.s_()) + "[" + string + "] logged in with entity id " + ilIIIlIlIIIllIlIlIIl.IlllIIIIlIIIlIlIlIIl() + " at (" + ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl + ", " + ilIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII + ", " + ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII + ")");
        final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll2 = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl);
        final llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII = llllIIIIlIIIlIlllIll2.lIllllllIIllIlIlIlII();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl iIlllIlIIllIlIlIlIIl = llllIIIIlIIIlIlllIll2.IIlllIlIIllIlIlIlIIl();
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, null, llllIIIIlIIIlIlllIll2);
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(this.lIIIIlIIIIIlllIllIII, illlIIlIllIllIlIIll, ilIIIlIlIIIllIlIlIIl);
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.IlllIIIIlIIIlIlIlIIl(), ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), lIllllllIIllIlIlIlII.IlIlIIIIIIlllIlIllIl(), llllIIIIlIIIlIlllIll2.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll(), llllIIIIlIIIlIlllIll2.lllIllIIIllllllIllll(), this.IIlllIIlIllIllIlIIll(), lIllllllIIllIlIlIlII.IIllIIllIIIlIlIIIIlI(), llllIIIIlIIIlIlllIll2.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("reducedDebugInfo")));
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new IIllIIIlIIlIlIlIIIII("MC|Brand", new llllllIllIllIlIllllI(Unpooled.buffer()).llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI())));
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new lllllIIllIlIllIllllI(lIllllllIIllIlIlIlII.IIlIIIIlllIlllllIlII(), lIllllllIIllIlIlIlII.IIIlIIlIIIIlllIlllII()));
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(iIlllIlIIllIlIlIlIIl));
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new IlIIlllllIIllIIlllll(ilIIIlIlIIIllIlIlIIl.K));
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI));
        ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII().IlIIIlIlIIIllIlIlIIl();
        ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII().IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll((lIlIlIIIllIIllIIIllI)llllIIIIlIIIlIlllIll2.IlllIIIIlIIIlIlIlIIl(), ilIIIlIlIIIllIlIlIIl);
        this.lIIIIlIIIIIlllIllIII.IIIllIIllIIIIIIlIIlI();
        IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI;
        if (!ilIIIlIlIIIllIlIlIIl.s_().equalsIgnoreCase(s)) {
            illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("multiplayer.player.joined.renamed", new Object[] { ilIIIlIlIIIllIlIlIIl.v_(), s });
        }
        else {
            illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("multiplayer.player.joined", new Object[] { ilIIIlIlIIIllIlIlIIl.v_() });
        }
        illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll);
        this.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
        this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl, ilIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII, ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII, ilIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll, ilIIIlIlIIIllIlIlIIl.llllllIllIllIlIllllI);
        this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll2);
        if (this.lIIIIlIIIIIlllIllIII.IllIlIIllIllIIlIllII().length() > 0) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.IllIlIIllIllIIlIllII(), this.lIIIIlIIIIIlllIllIII.lIIlIIIlIllIlIllIIIl());
        }
        final Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl>)ilIIIlIlIIIllIlIlIIl.L().iterator();
        while (iterator.hasNext()) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(new llIIlllIIlllIIllIllI(ilIIIlIlIIIllIlIlIIl.IlllIIIIlIIIlIlIlIIl(), iterator.next()));
        }
        ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII();
        if (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("Riding", 10)) {
            final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll3 = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI("Riding"), llllIIIIlIIIlIlllIll2);
            if (llllIIIIlIIIlIlllIll3 != null) {
                llllIIIIlIIIlIlllIll3.IlIlIIIlIIlIlIIlllIl = true;
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                llllIIIIlIIIlIlllIll3.IlIlIIIlIIlIlIIlllIl = false;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<lIIIlllIIIllIIIllIII> iterator = lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI().iterator();
        while (iterator.hasNext()) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(iterator.next(), 0));
        }
        for (int i = 0; i < 19; ++i) {
            final net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(i);
            if (llllIIIIlIIIlIlllIll != null && !hashSet.contains(llllIIIIlIIIlIlllIll)) {
                final Iterator iterator2 = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll).iterator();
                while (iterator2.hasNext()) {
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iterator2.next());
                }
                hashSet.add(llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl[] array) {
        this.IlIllIlIlIIIlIlIlIII = array[0].lllllIlIIIlIlIIlllII().IlIlIIIllIllIIIIIllI();
        array[0].IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll(this));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        final IIIllllllIllIIIlllIl illlllllIIIlIIIlIlII = ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII();
        if (iiIllllllIllIIIlllIl != null) {
            iiIllllllIllIIIlllIl.IlIIllIIllIIllIIlIIl().llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        }
        illlllllIIIlIIIlIlII.IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        illlllllIIIlIIIlIlII.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI((int)ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl >> 4, (int)ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII >> 4);
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(this.IlIlIIIIIIlllIlIllIl());
    }
    
    public net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll liiIlllIIIllIIIllIII = this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl[0].lIllllllIIllIlIlIlII().lIIIlllIIIllIIIllIII();
        net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl;
        if (ilIIIlIlIIIllIlIlIIl.s_().equals(this.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll()) && liiIlllIIIllIIIllIII != null) {
            ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(liiIlllIIIllIIIllIII);
            ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII;
            net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl.debug("loading single player");
        }
        else {
            ilIlIlIlIlllllllllIl = this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll.get(ilIIIlIlIIIllIlIlIIl.lllIIIIlIlIllIIlIIIl());
        if (llllIIllllIlIlIIIIll != null) {
            llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl();
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.lIIIlllIIIllIIIllIII.add(ilIIIlIlIIIllIlIlIIl);
        this.llIIlIIIlIIIllIlIIIl.put(ilIIIlIlIIIllIlIlIIl.lllIIIIlIlIllIIlIIIl(), ilIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll(new llIIIllIlIllIllIIIIl(IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll, new IlIIIlIlIIIllIlIlIIl[] { ilIIIlIlIIIllIlIlIIl }));
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl).llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, null);
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIIIllIlIllIllIIIIl(IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll, new IlIIIlIlIIIllIlIlIIl[] { (IlIIIlIlIIIllIlIlIIl)this.lIIIlllIIIllIIIllIII.get(i) }));
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII().IlIIllIIllIIllIIlIIl().IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
    }
    
    public void IlIlIIIllIllIIIIIllI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl);
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        final IIIllllllIllIIIlllIl illlllllIIIlIIIlIlII = ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII();
        if (ilIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll != null) {
            illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll);
            net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl.debug("removing player mount");
        }
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        illlllllIIIlIIIlIlII.IlIIllIIllIIllIIlIIl().llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        this.lIIIlllIIIllIIIllIII.remove(ilIIIlIlIIIllIlIlIIl);
        final UUID lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl.lllIIIIlIlIllIIlIIIl();
        if (this.llIIlIIIlIIIllIlIIIl.get(lllIIIIlIlIllIIlIIIl) == ilIIIlIlIIIllIlIlIIl) {
            this.llIIlIIIlIIIllIlIIIl.remove(lllIIIIlIlIllIIlIIIl);
            this.llllIIllllIlIlIIIIll.remove(lllIIIIlIlIllIIlIIIl);
        }
        this.llllIIIIlIIIlIlllIll(new llIIIllIlIllIllIIIIl(IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI, new IlIIIlIlIIIllIlIlIIl[] { ilIIIlIlIIIllIlIlIIl }));
    }
    
    public String llllIIIIlIIIlIlllIll(final SocketAddress socketAddress, final GameProfile gameProfile) {
        if (this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(gameProfile)) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (IlIlIIIlIIlIlIIlllIl)this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(gameProfile);
            String s = "You are banned from this server!\nReason: " + ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl();
            if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll() != null) {
                s = String.valueOf(s) + "\nYour ban will be removed on " + net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl.format(ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll());
            }
            return s;
        }
        if (!this.IlIIIlIlIIIllIlIlIIl(gameProfile)) {
            return "You are not white-listed on this server!";
        }
        if (this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(socketAddress)) {
            final net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(socketAddress);
            String s2 = "Your IP address is banned from this server!\nReason: " + ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() != null) {
                s2 = String.valueOf(s2) + "\nYour ban will be removed on " + net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl.format(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
            }
            return s2;
        }
        return (this.lIIIlllIIIllIIIllIII.size() >= this.IlIlIIIllIllIIIIIllI && !this.lIIIIlIIIIIlllIllIII(gameProfile)) ? "The server is full!" : null;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        final UUID llllIIIIlIIIlIlllIll = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(gameProfile);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII.get(i);
            if (ilIIIlIlIIIllIlIlIIl.lllIIIIlIlIllIIlIIIl().equals(llllIIIIlIIIlIlllIll)) {
                arrayList.add(ilIIIlIlIIIllIlIlIIl);
            }
        }
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = this.llIIlIIIlIIIllIlIIIl.get(gameProfile.getId());
        if (ilIIIlIlIIIllIlIlIIl2 != null && !arrayList.contains(ilIIIlIlIIIllIlIlIIl2)) {
            arrayList.add(ilIIIlIlIIIllIlIlIIl2);
        }
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<IlIIIlIlIIIllIlIlIIl>)arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("You logged in from another location");
        }
        net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3;
        if (this.lIIIIlIIIIIlllIllIII.IllIllIlllIllllIIllI()) {
            ilIIIlIlIIIllIlIlIIl3 = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(0));
        }
        else {
            ilIIIlIlIIIllIlIlIIl3 = new net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(0));
        }
        return new IlIIIlIlIIIllIlIlIIl(this.lIIIIlIIIIIlllIllIII, this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(0), gameProfile, ilIIIlIlIIIllIlIlIIl3);
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int lllllIIIIIlIIlllIlIl, final boolean b) {
        ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl);
        ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII().IlIIllIIllIIllIIlIIl().llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        this.lIIIlllIIIllIIIllIII.remove(ilIIIlIlIIIllIlIlIIl);
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl).IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl v = ilIIIlIlIIIllIlIlIIl.v();
        final boolean an = ilIIIlIlIIIllIlIlIIl.an();
        ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl = lllllIIIIIlIIlllIlIl;
        net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2;
        if (this.lIIIIlIIIIIlllIllIII.IllIllIlllIllllIIllI()) {
            ilIIIlIlIIIllIlIlIIl2 = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl));
        }
        else {
            ilIIIlIlIIIllIlIlIIl2 = new net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl));
        }
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3 = new IlIIIlIlIIIllIlIlIIl(this.lIIIIlIIIIIlllIllIII, this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl), ilIIIlIlIIIllIlIlIIl.r(), ilIIIlIlIIIllIlIlIIl2);
        ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll = ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;
        ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, b);
        ilIIIlIlIIIllIlIlIIl3.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl.IlllIIIIlIIIlIlIlIIl());
        ilIIIlIlIIIllIlIlIIl3.lIlIlIIIllIIllIIIllI(ilIIIlIlIIIllIlIlIIl);
        final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl);
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl3, ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll);
        if (v != null) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl), v, an);
            if (llllIIIIlIIIlIlllIll2 != null) {
                ilIIIlIlIIIllIlIlIIl3.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + 0.5f, llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() + 0.1f, llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + 0.5f, 0.0f, 0.0f);
                ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll(v, an);
            }
            else {
                ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(0, 0.0f));
            }
        }
        llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI((int)ilIIIlIlIIIllIlIlIIl3.IIlllIlIIllIlIlIlIIl >> 4, (int)ilIIIlIlIIIllIlIlIIl3.lllllIlIIIlIlIIlllII >> 4);
        while (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl3, ilIIIlIlIIIllIlIlIIl3.IlIIlllIIlIlllllIIlI()).isEmpty() && ilIIIlIlIIIllIlIlIIl3.llIIIlIlIllIIlIlIlII < 256.0) {
            ilIIIlIlIIIllIlIlIIl3.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl3.IIlllIlIIllIlIlIlIIl, ilIIIlIlIIIllIlIlIIl3.llIIIlIlIllIIlIlIlII + 1.0, ilIIIlIlIIIllIlIlIIl3.lllllIlIIIlIlIIlllII);
        }
        ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(ilIIIlIlIIIllIlIlIIl3.lllllIIIIIlIIlllIlIl, ilIIIlIlIIIllIlIlIIl3.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll(), ilIIIlIlIIIllIlIlIIl3.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI(), ilIIIlIlIIIllIlIlIIl3.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()));
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl iIlllIlIIllIlIlIlIIl = llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl();
        ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl3.IIlllIlIIllIlIlIlIIl, ilIIIlIlIIIllIlIlIIl3.llIIIlIlIllIIlIlIlII, ilIIIlIlIIIllIlIlIIl3.lllllIlIIIlIlIIlllII, ilIIIlIlIIIllIlIlIIl3.IIlIIIIIllIlIIIlIIll, ilIIIlIlIIIllIlIlIIl3.llllllIllIllIlIllllI);
        ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(iIlllIlIIllIlIlIlIIl));
        ilIIIlIlIIIllIlIlIIl3.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll(ilIIIlIlIIIllIlIlIIl3.N, ilIIIlIlIIIllIlIlIIl3.M, ilIIIlIlIIIllIlIlIIl3.L));
        this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl3, llllIIIIlIIIlIlllIll);
        llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl3);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl3);
        this.lIIIlllIIIllIIIllIII.add(ilIIIlIlIIIllIlIlIIl3);
        this.llIIlIIIlIIIllIlIIIl.put(ilIIIlIlIIIllIlIlIIl3.lllIIIIlIlIllIIlIIIl(), ilIIIlIlIIIllIlIlIIl3);
        ilIIIlIlIIIllIlIlIIl3.lIIIIlIIIIIlllIllIII();
        ilIIIlIlIIIllIlIlIIl3.llIllIlIIIIllIlIIllI(ilIIIlIlIIIllIlIlIIl3.N());
        return ilIIIlIlIIIllIlIlIIl3;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int lllllIIIIIlIIlllIlIl) {
        final int lllllIIIIIlIIlllIlIl2 = ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl;
        final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl);
        ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl = lllllIIIIIlIIlllIlIl;
        final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll2 = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl);
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl, ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll(), ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI(), ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl);
        ilIIIlIlIIIllIlIlIIl.IIlIlIlIIlIllIIIIIIl = false;
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lllllIIIIIlIIlllIlIl2, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll);
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl, ilIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII, ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII, ilIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll, ilIIIlIlIIIllIlIlIIl.llllllIllIllIlIllllI);
        ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll2);
        this.IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl);
        final Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl>)ilIIIlIlIIIllIlIlIIl.L().iterator();
        while (iterator.hasNext()) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIIlllIIlllIIllIllI(ilIIIlIlIIIllIlIlIIl.IlllIIIIlIIIlIlIlIIl(), iterator.next()));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl2) {
        final double iIlllIlIIllIlIlIlIIl = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
        final double lllllIlIIIlIlIIlllII = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
        final double n2 = 8.0;
        final float iIlIIIIIllIlIIIlIIll = llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll;
        iiIllllllIllIIIlllIl.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("moving");
        double n3;
        double n4;
        if (llIllIIIIIllIlIIIIlI.lllllIIIIIlIIlllIlIl == -1) {
            n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl / n2, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().IlIIIlIlIIIllIlIlIIl() + 16.0, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().IllIIlllIIIIlllIIlIl() - 16.0);
            n4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII / n2, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().IlIlIIIllIllIIIIIllI() + 16.0, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().llllIIIlIlllIlIIIIIl() - 16.0);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, n4, llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI);
            if (llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII()) {
                iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, false);
            }
        }
        else if (llIllIIIIIllIlIIIIlI.lllllIIIIIlIIlllIlIl == 0) {
            n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl * n2, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().IlIIIlIlIIIllIlIlIIl() + 16.0, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().IllIIlllIIIIlllIIlIl() - 16.0);
            n4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII * n2, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().IlIlIIIllIllIIIIIllI() + 16.0, iiIllllllIllIIIlllIl2.IllIllIlllIllllIIllI().llllIIIlIlllIlIIIIIl() - 16.0);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, n4, llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI);
            if (llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII()) {
                iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, false);
            }
        }
        else {
            net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl;
            if (n == 1) {
                ilIlIlIlIlllllllllIl = iiIllllllIllIIIlllIl2.IIlllIlIIllIlIlIlIIl();
            }
            else {
                ilIlIlIlIlllllllllIl = iiIllllllIllIIIlllIl2.IllIlIIllIllIIlIllII();
            }
            n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
            llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
            n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, n4, 90.0f, 0.0f);
            if (llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII()) {
                iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, false);
            }
        }
        iiIllllllIllIIIlllIl.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        if (n != 1) {
            iiIllllllIllIIIlllIl.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("placing");
            final double n5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)n3, -29999872, 29999872);
            final double n6 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)n4, -29999872, 29999872);
            if (llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII()) {
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, n6, llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI);
                iiIllllllIllIIIlllIl2.lllllIIIIIlIlIIIIIIl().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, iIlIIIIIllIlIIIlIIll);
                iiIllllllIllIIIlllIl2.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                iiIllllllIllIIIlllIl2.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, false);
            }
            iiIllllllIllIIIlllIl.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        }
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl2);
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        if (++this.IIIlIIIlIlIIlllIIlll > 600) {
            this.llllIIIIlIIIlIlllIll(new llIIIllIlIllIllIIIIl(IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI, this.lIIIlllIIIllIIIllIII));
            this.IIIlIIIlIlIIlllIIlll = 0;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            ((IlIIIlIlIIIllIlIlIIl)this.lIIIlllIIIllIIIllIII.get(i)).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final int n) {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII.get(i);
            if (ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl == n) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        final IlIlIIIllIIllIlllllI w = llllIIIIlIIIlIlllIll.w();
        if (w != null) {
            final Iterator iterator = w.llIllIIIIIllIlIIIIlI().iterator();
            while (iterator.hasNext()) {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(iterator.next());
                if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2 != llllIIIIlIIIlIlllIll) {
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
                }
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        final IlIlIIIllIIllIlllllI w = llllIIIIlIIIlIlllIll.w();
        if (w == null) {
            this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
        }
        else {
            for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII.get(i);
                if (ilIIIlIlIIIllIlIlIIl.w() != w) {
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
                }
            }
        }
    }
    
    public String llllIIIIlIIIlIlllIll(final boolean b) {
        String s = "";
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.lIIIlllIIIllIIIllIII);
        for (int i = 0; i < arrayList.size(); ++i) {
            if (i > 0) {
                s = String.valueOf(s) + ", ";
            }
            s = String.valueOf(s) + ((IlIIIlIlIIIllIlIlIIl)arrayList.get(i)).s_();
            if (b) {
                s = String.valueOf(s) + " (" + ((IlIIIlIlIIIllIlIlIIl)arrayList.get(i)).lllIIIIlIlIllIIlIIIl().toString() + ")";
            }
        }
        return s;
    }
    
    public String[] IllIIlllIIIIlllIIlIl() {
        final String[] array = new String[this.lIIIlllIIIllIIIllIII.size()];
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            array[i] = ((IlIIIlIlIIIllIlIlIIl)this.lIIIlllIIIllIIIllIII.get(i)).s_();
        }
        return array;
    }
    
    public GameProfile[] llllIIIlIlllIlIIIIIl() {
        final GameProfile[] array = new GameProfile[this.lIIIlllIIIllIIIllIII.size()];
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            array[i] = ((IlIIIlIlIIIllIlIlIIl)this.lIIIlllIIIllIIIllIII.get(i)).r();
        }
        return array;
    }
    
    public IIIlIIIlIlIIlllIIlll lIIIIlIIIIIlllIllIII() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public IlIlIlIlIlllllllllIl lIIIlllIIIllIIIllIII() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final GameProfile gameProfile) {
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IIIlIIlIIIIlllIlllII(gameProfile, this.lIIIIlIIIIIlllIllIII.llllIIllllIlIlIIIIll(), this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(gameProfile)));
    }
    
    public void llIllIIIIIllIlIIIIlI(final GameProfile gameProfile) {
        this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(gameProfile);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final GameProfile gameProfile) {
        return !this.IIlllIIlIllIllIlIIll || this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl(gameProfile) || this.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl(gameProfile);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final GameProfile gameProfile) {
        return this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl(gameProfile) || (this.lIIIIlIIIIIlllIllIII.llIllIlIlIIIIIIIllII() && this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl[0].lIllllllIIllIlIlIlII().IIIlIIIlIlIIlllIIlll() && this.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll().equalsIgnoreCase(gameProfile.getName())) || this.IIllIIllIIIlIlIIIIlI;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s) {
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.lIIIlllIIIllIIIllIII) {
            if (ilIIIlIlIIIllIlIlIIl.s_().equalsIgnoreCase(s)) {
                return ilIIIlIlIIIllIlIlIIl;
            }
        }
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final int n5, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llllIIIIlIIIlIlllIll(null, n, n2, n3, n4, n5, ilIIIIIllIlIIIlIIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3, final double n4, final int n5, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII.get(i);
            if (ilIIIlIlIIIllIlIlIIl != llllIIIIlIIIlIlllIll && ilIIIlIlIIIllIlIlIIl.lllllIIIIIlIIlllIlIl == n5) {
                final double n6 = n - ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl;
                final double n7 = n2 - ilIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII;
                final double n8 = n3 - ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII;
                if (n6 * n6 + n7 * n7 + n8 * n8 < n4 * n4) {
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
                }
            }
        }
    }
    
    public void llIIlIIIlIIIllIlIIIl() {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            this.llllIIIIlIIIlIlllIll((IlIIIlIlIIIllIlIlIIl)this.lIIIlllIIIllIIIllIII.get(i));
        }
    }
    
    public void IllIIlllIIIIlllIIlIl(final GameProfile gameProfile) {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(new IIlllIlIIllIlIlIlIIl(gameProfile));
    }
    
    public void llllIIIlIlllIlIIIIIl(final GameProfile gameProfile) {
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(gameProfile);
    }
    
    public IlIlIllllllllIIIIlII llIllIlIIIIllIlIIllI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public String[] lIlIlIIIllIIllIIIllI() {
        return this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
    }
    
    public IIlIIIIlllIlllllIlII IlIlIIIllIIllIlllllI() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public String[] IIIIlllIIIIIIlIIIlll() {
        return this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIllllIlIlIIIIll() {
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIllllIIIlIllIlIIll(this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl[0].IllIllIlllIllllIIllI(), lIIIIIlIlIIIlIIIIlIl.IlIIIlIlIIIllIlIlIIl));
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(iiIllllllIllIIIlllIl.IIIlIIlIIIIlllIlllII(), iiIllllllIllIIIlllIl.IlIlIllllllllIIIIlII(), iiIllllllIllIIIlllIl.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doDaylightCycle")));
        if (iiIllllllIllIIIlllIl.llllllIllIllIlIllllI()) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(1, 0.0f));
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(7, iiIllllllIllIIIlllIl.llIIlIIIlIIIllIlIIIl(1.0f)));
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(8, iiIllllllIllIIIlllIl.lIIIIlIIIIIlllIllIII(1.0f)));
        }
    }
    
    public void IllIIlllIIIIlllIIlIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI);
        ilIIIlIlIIIllIlIlIIl.IlIlIIIIIIlllIlIllIl();
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI));
    }
    
    public int IlIllIlIlIIIlIlIlIII() {
        return this.lIIIlllIIIllIIIllIII.size();
    }
    
    public int IIlllIIlIllIllIlIIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public String[] lllIIIIlllllIlIIllIl() {
        return this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl[0].lllllIlIIIlIlIIlllII().IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public List IlIlIlIlIlllllllllIl(final String s) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.lIIIlllIIIllIIIllIII) {
            if (ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl().equals(s)) {
                arrayList.add(ilIIIlIlIIIllIlIlIIl);
            }
        }
        return arrayList;
    }
    
    public int IlIlIIIIIIlllIlIllIl() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl() {
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (ilIIIlIlIIIllIlIlIIl2 != null) {
            ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        }
        else if (this.IlIlIIIIIIlllIlIllIl != null) {
            ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl);
        }
        ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IIlllIIlIllIllIlIIll());
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean iIllIIllIIIlIlIIIIlI) {
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
    }
    
    public void IIllIIllIIIlIlIIIIlI() {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            ((IlIIIlIlIIIllIlIlIIl)this.lIIIlllIIIllIIIllIII.get(i)).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Server closed");
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final boolean b) {
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
        this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(llIIIIIIlIllIIlIIIll, (byte)(b ? 1 : 0)));
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll, true);
    }
    
    public net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final UUID lllIIIIlIlIllIIlIIIl = llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl();
        net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = (lllIIIIlIlIllIIlIIIl == null) ? null : this.llllIIllllIlIlIIIIll.get(lllIIIIlIlIllIIlIIIl);
        if (llllIIllllIlIlIIIIll == null) {
            final File file = new File(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(0).lllllIlIIIlIlIIlllII().IllIIlllIIIIlllIIlIl(), "stats");
            final File file2 = new File(file, String.valueOf(lllIIIIlIlIllIIlIIIl.toString()) + ".json");
            if (!file2.exists()) {
                final File file3 = new File(file, String.valueOf(llllIIIIlIIIlIlllIll.s_()) + ".json");
                if (file3.exists() && file3.isFile()) {
                    file3.renameTo(file2);
                }
            }
            llllIIllllIlIlIIIIll = new net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIllllIlIlIIIIll(this.lIIIIlIIIIIlllIllIII, file2);
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
            this.llllIIllllIlIlIIIIll.put(lllIIIIlIlIllIIlIIIl, llllIIllllIlIlIIIIll);
        }
        return llllIIllllIlIlIIIIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final int lllIIIIlllllIlIIllIl) {
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
        if (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl != null) {
            IIIllllllIllIIIlllIl[] ilIIIlIlIIIllIlIlIIl;
            for (int length = (ilIIIlIlIIIllIlIlIIl = this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl).length, i = 0; i < length; ++i) {
                final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = ilIIIlIlIIIllIlIlIIl[i];
                if (iiIllllllIllIIIlllIl != null) {
                    iiIllllllIllIIIlllIl.IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
                }
            }
        }
    }
    
    public List IIIlIIIlIlIIlllIIlll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final UUID uuid) {
        return this.llIIlIIIlIIIllIlIIIl.get(uuid);
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final GameProfile gameProfile) {
        return false;
    }
}
