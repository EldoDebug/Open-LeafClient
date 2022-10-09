package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.awt.*;
import org.apache.commons.lang3.*;
import java.awt.datatransfer.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import java.net.*;
import java.io.*;
import tv.twitch.chat.*;
import org.lwjgl.input.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public abstract class lIIllIIIllllIlllIllI extends llIllIIIIIllIlIIIIlI implements c
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private static final Set IllIIlllIIIIlllIIlIl;
    private static final Splitter llllIIIlIlllIlIIIIIl;
    protected Minecraft IlIlIIIllIIllIlllllI;
    protected IIlllIlIIllIlIlIlIIl IIIIlllIIIIIIlIIIlll;
    public int llllIIllllIlIlIIIIll;
    public int IlIllIlIlIIIlIlIlIII;
    protected List IIlllIIlIllIllIlIIll;
    protected List lllIIIIlllllIlIIllIl;
    public boolean IlIlIIIIIIlllIlIllIl;
    protected FontRenderer IIllIIllIIIlIlIIIIlI;
    private IlIIIlIlIIIllIlIlIIl lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private long llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private URI lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        IllIIlllIIIIlllIIlIl = Sets.newHashSet((Object[])new String[] { "http", "https" });
        llllIIIlIlllIlIIIIIl = Splitter.on('\n');
    }
    
    public lIIllIIIllllIlllIllI() {
        this.IIlllIIlIllIllIlIIll = Lists.newArrayList();
        this.lllIIIIlllllIlIIllIl = Lists.newArrayList();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
            ((IlIIIlIlIIIllIlIlIIl)this.IIlllIIlIllIllIlIIll.get(i)).llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, n, n2);
        }
        for (int j = 0; j < this.lllIIIIlllllIlIIllIl.size(); ++j) {
            ((IIlIIIIIllIlIIIlIIll)this.lllIIIIlllllIlIIllIl.get(j)).llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, n, n2);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (n == 1) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            if (this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll == null) {
                this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
            }
        }
    }
    
    public static String llIIlIIIlIIIllIlIIIl() {
        try {
            final Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)contents.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception ex) {}
        return "";
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final String s) {
        if (!StringUtils.isEmpty((CharSequence)s)) {
            try {
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(s), null);
            }
            catch (Exception ex) {}
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        final List llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIlIIlIIIIlllIlllII);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.size(); ++i) {
            if (i == 0) {
                llllIIIIlIIIlIlllIll.set(i, lllIIIIlIlIllIIlIIIl.IIIlIIIlIlIIlllIIlll().IlIlIIIllIllIIIIIllI + llllIIIIlIIIlIlllIll.get(i));
            }
            else {
                llllIIIIlIIIlIlllIll.set(i, IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + llllIIIIlIIIlIlllIll.get(i));
            }
        }
        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2);
    }
    
    protected void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll(Arrays.asList(s), n, n2);
    }
    
    protected void llllIIIIlIIIlIlllIll(final List list, final int n, final int n2) {
        if (!list.isEmpty()) {
            lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
            lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            int n3 = 0;
            final Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                final int llllIIIIlIIIlIlllIll = this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(iterator.next());
                if (llllIIIIlIIIlIlllIll > n3) {
                    n3 = llllIIIIlIIIlIlllIll;
                }
            }
            int n4 = n + 12;
            int n5 = n2 - 12;
            int n6 = 8;
            if (list.size() > 1) {
                n6 += 2 + (list.size() - 1) * 10;
            }
            if (n4 + n3 > this.llllIIllllIlIlIIIIll) {
                n4 -= 28 + n3;
            }
            if (n5 + n6 + 6 > this.IlIllIlIlIIIlIlIlIII) {
                n5 = this.IlIllIlIlIIIlIlIlIII - n6 - 6;
            }
            this.IlIIIlIlIIIllIlIlIIl = 300.0f;
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 300.0f;
            final int n7 = -267386864;
            this.llllIIIIlIIIlIlllIll(n4 - 3, n5 - 4, n4 + n3 + 3, n5 - 3, n7, n7);
            this.llllIIIIlIIIlIlllIll(n4 - 3, n5 + n6 + 3, n4 + n3 + 3, n5 + n6 + 4, n7, n7);
            this.llllIIIIlIIIlIlllIll(n4 - 3, n5 - 3, n4 + n3 + 3, n5 + n6 + 3, n7, n7);
            this.llllIIIIlIIIlIlllIll(n4 - 4, n5 - 3, n4 - 3, n5 + n6 + 3, n7, n7);
            this.llllIIIIlIIIlIlllIll(n4 + n3 + 3, n5 - 3, n4 + n3 + 4, n5 + n6 + 3, n7, n7);
            final int n8 = 1347420415;
            final int n9 = (n8 & 0xFEFEFE) >> 1 | (n8 & 0xFF000000);
            this.llllIIIIlIIIlIlllIll(n4 - 3, n5 - 3 + 1, n4 - 3 + 1, n5 + n6 + 3 - 1, n8, n9);
            this.llllIIIIlIIIlIlllIll(n4 + n3 + 2, n5 - 3 + 1, n4 + n3 + 3, n5 + n6 + 3 - 1, n8, n9);
            this.llllIIIIlIIIlIlllIll(n4 - 3, n5 - 3, n4 + n3 + 3, n5 - 3 + 1, n8, n8);
            this.llllIIIIlIIIlIlllIll(n4 - 3, n5 + n6 + 2, n4 + n3 + 3, n5 + n6 + 3, n9, n9);
            for (int i = 0; i < list.size(); ++i) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(list.get(i), (float)n4, (float)n5, -1);
                if (i == 0) {
                    n5 += 2;
                }
                n5 += 10;
            }
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 0.0f;
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final int n, final int n2) {
        if (llIIIIIIlIllIIlIIIll != null && llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().lIIIlllIIIllIIIllIII() != null) {
            final net.minecraft.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI liiIlllIIIllIIIllIII = llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().lIIIlllIIIllIIIllIII();
            if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
                lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = null;
                try {
                    final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl().lIIIIlIIIIIlllIllIII());
                    if (llllIIIIlIIIlIlllIll2 instanceof IIIIlllIIIIIIlIIIlll) {
                        llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                    }
                }
                catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2) {}
                if (llllIIIIlIIIlIlllIll != null) {
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Invalid Item!", n, n2);
                }
            }
            else if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl) {
                if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIlIIlIIIIlllIlllII) {
                    try {
                        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll3 = net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl().lIIIIlIIIIIlllIllIII());
                        if (llllIIIIlIIIlIlllIll3 instanceof IIIIlllIIIIIIlIIIlll) {
                            final ArrayList arrayList = Lists.newArrayList();
                            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll3;
                            arrayList.add(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("name"));
                            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("type", 8)) {
                                final String llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("type");
                                arrayList.add("Type: " + llIIlIIIlIIIllIlIIIl + " (" + net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl) + ")");
                            }
                            arrayList.add(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
                            this.llllIIIIlIIIlIlllIll(arrayList, n, n2);
                        }
                        else {
                            this.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Invalid Entity!", n, n2);
                        }
                    }
                    catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII3) {
                        this.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Invalid Entity!", n, n2);
                    }
                }
            }
            else if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
                this.llllIIIIlIIIlIlllIll(lIIllIIIllllIlllIllI.llllIIIlIlllIlIIIIIl.splitToList((CharSequence)liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl().lIIIlllIIIllIIIllIII()), n, n2);
            }
            else if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
                final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll4 = net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl().lIIIIlIIIIIlllIllIII());
                if (llllIIIIlIIIlIlllIll4 != null) {
                    final llIIIIIIlIllIIlIIIll ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll4.IlIlIIIllIllIIIIIllI();
                    final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("stats.tooltip.type." + (llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl() ? "achievement" : "statistic"), new Object[0]);
                    illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl(true);
                    final String s = (llllIIIIlIIIlIlllIll4 instanceof net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll) ? ((net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll4).IllIIlllIIIIlllIIlIl() : null;
                    final ArrayList arrayList2 = Lists.newArrayList((Object[])new String[] { ilIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII(), illIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII() });
                    if (s != null) {
                        arrayList2.addAll(this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(s, 150));
                    }
                    this.llllIIIIlIIIlIlllIll(arrayList2, n, n2);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Invalid statistic/achievement!", n, n2);
                }
            }
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final String s, final boolean b) {
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        if (llIIIIIIlIllIIlIIIll == null) {
            return false;
        }
        final net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII = llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().lIIIIlIIIIIlllIllIII();
        if (llllIIllllIlIlIIIIll()) {
            if (llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llIIlIIIlIIIllIlIIIl() != null) {
                this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llIIlIIIlIIIllIlIIIl(), false);
            }
        }
        else if (liiiIlIIIIIlllIllIII != null) {
            if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                if (!this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIIllllIlIlIIIIll) {
                    return false;
                }
                try {
                    final URI lIlIlIIIllIIllIIIllI = new URI(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
                    final String scheme = lIlIlIIIllIIllIIIllI.getScheme();
                    if (scheme == null) {
                        throw new URISyntaxException(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "Missing protocol");
                    }
                    if (!lIIllIIIllllIlllIllI.IllIIlllIIIIlllIIlIl.contains(scheme.toLowerCase())) {
                        throw new URISyntaxException(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "Unsupported protocol: " + scheme.toLowerCase());
                    }
                    if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIllIlIlIIIlIlIlIII) {
                        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
                        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl(this, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), 31102009, false));
                    }
                    else {
                        this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI);
                    }
                }
                catch (URISyntaxException ex) {
                    lIIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI.error("Can't open url for " + liiiIlIIIIIlllIllIII, (Throwable)ex);
                }
            }
            else if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
                this.llllIIIIlIIIlIlllIll(new File(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl()).toURI());
            }
            else if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI) {
                this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), true);
            }
            else if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), false);
            }
            else if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                final ChatUserInfo ilIlIIIllIllIIIIIllI = this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
                if (ilIlIIIllIllIIIIIllI != null) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl(), ilIlIIIllIllIIIIIllI));
                }
                else {
                    lIIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI.error("Tried to handle twitch user but couldn't find them!");
                }
            }
            else {
                lIIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI.error("Don't know how to handle " + liiiIlIIIIIlllIllIII);
            }
            return true;
        }
        return false;
    }
    
    public void IlIlIIIllIllIIIIIllI(final String s) {
        this.IlIlIlIlIlllllllllIl(s, true);
    }
    
    public void IlIlIlIlIlllllllllIl(final String s, final boolean b) {
        if (b) {
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(s);
        }
        this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(s);
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            for (int i = 0; i < this.IIlllIIlIllIllIlIIll.size(); ++i) {
                final IlIIIlIlIIIllIlIlIIl liiiIlIIIIIlllIllIII = this.IIlllIIlIllIllIlIIll.get(i);
                if (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIIllIlllllI, n, n2)) {
                    (this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII).llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IlIIlIlIIIlIIlIlIlII());
                    this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
                }
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        if (this.lIIIIlIIIIIlllIllIII != null && n3 == 0) {
            this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, n2);
            this.lIIIIlIIIIIlllIllIII = null;
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final long n4) {
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
    }
    
    public void llllIIIIlIIIlIlllIll(final Minecraft ilIlIIIllIIllIlllllI, final int llllIIllllIlIlIIIIll, final int ilIllIlIlIIIlIlIlIII) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IllIIlllllIIllIIllIl();
        this.IIllIIllIIIlIlIIIIlI = ilIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll.clear();
        this.n_();
    }
    
    public void IlIlIlIlIlllllllllIl(final int llllIIllllIlIlIIIIll, final int ilIllIlIlIIIlIlIlIII) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public void n_() {
    }
    
    public void llIllIlIIIIllIlIIllI() {
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                this.IlIlIlIlIlllllllllIl();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                this.lIlIlIIIllIIllIIIllI();
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        final int n = Mouse.getEventX() * this.llllIIllllIlIlIIIIll / this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl;
        final int n2 = this.IlIllIlIlIIIlIlIlIII - Mouse.getEventY() * this.IlIllIlIlIIIlIlIlIII / this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI - 1;
        final int eventButton = Mouse.getEventButton();
        if (Mouse.getEventButtonState()) {
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl && this.llIllIlIIIIllIlIIllI++ > 0) {
                return;
            }
            this.lIIIlllIIIllIIIllIII = eventButton;
            this.llIIlIIIlIIIllIlIIIl = Minecraft.IIIllllllIllIIIlllIl();
            this.llllIIIIlIIIlIlllIll(n, n2, this.lIIIlllIIIllIIIllIII);
        }
        else if (eventButton != -1) {
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl && --this.llIllIlIIIIllIlIIllI > 0) {
                return;
            }
            this.lIIIlllIIIllIIIllIII = -1;
            this.IlIlIlIlIlllllllllIl(n, n2, eventButton);
        }
        else if (this.lIIIlllIIIllIIIllIII != -1 && this.llIIlIIIlIIIllIlIIIl > 0L) {
            this.llllIIIIlIIIlIlllIll(n, n2, this.lIIIlllIIIllIIIllIII, Minecraft.IIIllllllIllIIIlllIl() - this.llIIlIIIlIIIllIlIIIl);
        }
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        if (Keyboard.getEventKeyState()) {
            this.llllIIIIlIIIlIlllIll(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
        this.IlIlIIIllIIllIlllllI.IIlIIIlllIllIllIlIII();
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
    }
    
    public void o_() {
    }
    
    public void IlIlIIIllIIllIlllllI() {
        this.IlIlIlIlIlllllllllIl(0);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null) {
            this.llllIIIIlIIIlIlllIll(0, 0, this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, -1072689136, -804253680);
        }
        else {
            this.llIllIIIIIllIlIIIIlI(n);
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n) {
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, this.IlIllIlIlIIIlIlIlIII, 0.0).llllIIIIlIIIlIlllIll(0.0, this.IlIllIlIlIIIlIlIlIII / 32.0f + n).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, 0.0).llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll / 32.0f, this.IlIllIlIlIIIlIlIlIII / 32.0f + n).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll, 0.0, 0.0).llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll / 32.0f, n).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).llllIIIIlIIIlIlllIll(0.0, n).IlIlIlIlIlllllllllIl(64, 64, 64, 255).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        if (n == 31102009) {
            if (b) {
                this.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI);
            }
            this.lIlIlIIIllIIllIIIllI = null;
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final URI uri) {
        try {
            final Class<?> forName = Class.forName("java.awt.Desktop");
            forName.getMethod("browse", URI.class).invoke(forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]), uri);
        }
        catch (Throwable t) {
            lIIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI.error("Couldn't open link", t);
        }
    }
    
    public static boolean IIIIlllIIIIIIlIIIlll() {
        return Minecraft.llllIIIIlIIIlIlllIll ? (Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220)) : (Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157));
    }
    
    public static boolean llllIIllllIlIlIIIIll() {
        return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
    }
    
    public static boolean IlIllIlIlIIIlIlIlIII() {
        return Keyboard.isKeyDown(56) || Keyboard.isKeyDown(184);
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final int n) {
        return n == 45 && IIIIlllIIIIIIlIIIlll() && !llllIIllllIlIlIIIIll() && !IlIllIlIlIIIlIlIlIII();
    }
    
    public static boolean IlIlIIIllIllIIIIIllI(final int n) {
        return n == 47 && IIIIlllIIIIIIlIIIlll() && !llllIIllllIlIlIIIIll() && !IlIllIlIlIIIlIlIlIII();
    }
    
    public static boolean IllIIlllIIIIlllIIlIl(final int n) {
        return n == 46 && IIIIlllIIIIIIlIIIlll() && !llllIIllllIlIlIIIIll() && !IlIllIlIlIIIlIlIlIII();
    }
    
    public static boolean llllIIIlIlllIlIIIIIl(final int n) {
        return n == 30 && IIIIlllIIIIIIlIIIlll() && !llllIIllllIlIlIIIIll() && !IlIllIlIlIIIlIlIlIII();
    }
    
    public void IlIlIlIlIlllllllllIl(final Minecraft minecraft, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll(minecraft, n, n2);
    }
}
