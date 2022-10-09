package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import com.google.common.base.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import com.google.common.collect.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.opengl.*;
import net.optifine.util.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class llIIIIIIlIllIIlIIIll extends llIllIIIIIllIlIIIIlI
{
    private final Minecraft IlIlIIIllIllIIIIIllI;
    private final FontRenderer IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private List lIIIIlIIIIIlllIllIII;
    private List lIIIlllIIIllIIIllIII;
    private long llIIlIIIlIIIllIlIIIl;
    private long llIllIlIIIIllIlIIllI;
    private static volatile /* synthetic */ int[] lIlIlIIIllIIllIIIllI;
    
    public llIIIIIIlIllIIlIIIll(final Minecraft ilIlIIIllIllIIIIIllI) {
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = 0L;
        this.llIllIlIIIIllIlIIllI = 0L;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = ilIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final g g) {
        this.IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("debug");
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.llllIIIIlIIIlIlllIll();
        this.IlIlIlIlIlllllllllIl(g);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (this.IlIlIIIllIllIIIIIllI.IIIlIIIlIlIIlllIIlll.llIlllIlllllIIllIIII) {
            this.IllIIlllIIIIlllIIlIl();
        }
        this.IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
    }
    
    private boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.av() || this.IlIlIIIllIllIIIIIllI.IIIlIIIlIlIIlllIIlll.IlllllllIIIlIIIlIlII;
    }
    
    protected void llllIIIIlIIIlIlllIll() {
        List liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII == null || System.currentTimeMillis() > this.llIIlIIIlIIIllIlIIIl) {
            liiiIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl();
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            this.llIIlIIIlIIIllIlIIIl = System.currentTimeMillis() + 100L;
        }
        for (int i = 0; i < liiiIlIIIIIlllIllIII.size(); ++i) {
            final String s = liiiIlIIIIIlllIllIII.get(i);
            if (!Strings.isNullOrEmpty(s)) {
                final int llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
                final int llllIIIIlIIIlIlllIll2 = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(s);
                final int n = 2 + llllIIIIlIIIlIlllIll * i;
                net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(1, n - 1, 2 + llllIIIIlIIIlIlllIll2 + 1, n + llllIIIIlIIIlIlllIll - 1, -1873784752);
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(s, 2, n, 14737632);
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final g g) {
        List liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
        if (liiIlllIIIllIIIllIII == null || System.currentTimeMillis() > this.llIllIlIIIIllIlIIllI) {
            liiIlllIIIllIIIllIII = this.llIllIIIIIllIlIIIIlI();
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.llIllIlIIIIllIlIIllI = System.currentTimeMillis() + 100L;
        }
        for (int i = 0; i < liiIlllIIIllIIIllIII.size(); ++i) {
            final String s = liiIlllIIIllIIIllIII.get(i);
            if (!Strings.isNullOrEmpty(s)) {
                final int llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
                final int llllIIIIlIIIlIlllIll2 = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(s);
                final int n = g.llllIIIIlIIIlIlllIll() - 2 - llllIIIIlIIIlIlllIll2;
                final int n2 = 2 + llllIIIIlIIIlIlllIll * i;
                net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n - 1, n2 - 1, n + llllIIIIlIIIlIlllIll2 + 1, n2 + llllIIIIlIIIlIlllIll - 1, -1873784752);
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(s, n, n2, 14737632);
            }
        }
    }
    
    protected List IlIlIlIlIlllllllllIl() {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl, this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI().IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII);
        if (this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII != this.llllIIIlIlllIlIIIIIl) {
            final StringBuffer sb = new StringBuffer(this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII);
            final int r = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.r();
            final int index = this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII.indexOf(" fps ");
            if (index >= 0) {
                sb.insert(index, "/" + r);
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.F()) {
                sb.append(" sf");
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI()) {
                sb.append(" fr");
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII()) {
                sb.append(" af");
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll()) {
                sb.append(" aa");
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.D()) {
                sb.append(" reg");
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                sb.append(" sh");
            }
            this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII = sb.toString();
            this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII;
        }
        final StringBuilder sb2 = new StringBuilder();
        final IlIlIIIIIIlllIlIllIl w = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.w();
        sb2.append(", A: ");
        if (llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
            sb2.append(w.IlIlIIIllIIllIlllllI() + lllllIIlIlIIIlIlIIIl.IlIlIIIllIllIIIIIllI());
            sb2.append("/");
        }
        sb2.append(w.lIlIlIIIllIIllIIIllI() + lllllIIlIlIIIlIlIIIl.IlIIIlIlIIIllIlIlIIl());
        final String string = sb2.toString();
        if (this.IlIlIIIllIllIIIIIllI()) {
            return Lists.newArrayList((Object[])new String[] { "Minecraft 1.8.9 (" + this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() + "/" + net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() + ")", this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII, this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl(), this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(), "P: " + this.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl() + ". T: " + this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII() + string, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll(), "", String.format("Chunk-relative: %d %d %d", ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() & 0xF, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF) });
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI();
        final lllIllIIIllllllIllll lIllIIlIlIlllllIIIII = liiiIlIlIllllIIlIllI.lIllIIlIlIlllllIIIII();
        String s = "Invalid";
        switch (IlIIIlIlIIIllIlIlIIl()[lIllIIlIlIlllllIIIII.ordinal()]) {
            case 3: {
                s = "Towards negative Z";
                break;
            }
            case 4: {
                s = "Towards positive Z";
                break;
            }
            case 5: {
                s = "Towards negative X";
                break;
            }
            case 6: {
                s = "Towards positive X";
                break;
            }
        }
        final ArrayList arrayList = Lists.newArrayList((Object[])new String[] { "Minecraft 1.8.9 (" + this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() + "/" + net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() + ")", this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII, this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl(), this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl(), "P: " + this.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl() + ". T: " + this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII() + string, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll(), "", String.format("XYZ: %.3f / %.5f / %.3f", this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl, this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI().IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII), String.format("Block: %d %d %d", ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()), String.format("Chunk: %d %d %d in %d %d %d", ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() & 0xF, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4), String.format("Facing: %s (%s) (%.1f / %.1f)", lIllIIlIlIlllllIIIII, s, llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(liiiIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll), llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(liiiIlIlIllllIIlIllI.llllllIllIllIlIllllI)) });
        if (this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl != null && this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl);
            arrayList.add("Biome: " + llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl()).lIlIIlllIIlIIlIlllIl);
            arrayList.add("Light: " + llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 0) + " (" + llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl) + " sky, " + llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl) + " block)");
            IlIlIIIllIllIIIIIllI lIllllllIIllIlIlIlII = this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII(ilIlIlIlIlllllllllIl);
            if (this.IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII() && this.IlIlIIIllIllIIIIIllI.IIlllIIIlIlllIIlllII() != null) {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.IIlllIIIlIlllIIlllII().IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.lllIIIIlIlIllIIlIIIl());
                if (llllIIIIlIIIlIlllIll != null) {
                    final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll2 = this.IlIlIIIllIllIIIIIllI.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll));
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        lIllllllIIllIlIlIlII = llllIIIIlIIIlIlllIll2;
                    }
                }
            }
            arrayList.add(String.format("Local Difficulty: %.2f (Day %d)", lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(), this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII() / 24000L));
        }
        if (this.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII != null && this.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll()) {
            arrayList.add("Shader: " + this.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl());
        }
        if (this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI != null && this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl && this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() != null) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
            arrayList.add(String.format("Looking at: %d %d %d", llllIIIIlIIIlIlllIll3.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl()));
        }
        return arrayList;
    }
    
    protected List llIllIIIIIllIlIIIIlI() {
        final long maxMemory = Runtime.getRuntime().maxMemory();
        final long totalMemory = Runtime.getRuntime().totalMemory();
        final long n = totalMemory - Runtime.getRuntime().freeMemory();
        final ArrayList arrayList = Lists.newArrayList((Object[])new String[] { String.format("Java: %s %dbit", System.getProperty("java.version"), this.IlIlIIIllIllIIIIIllI.IllIllIlllIllllIIllI() ? 64 : 32), String.format("Mem: % 2d%% %03d/%03dMB", n * 100L / maxMemory, llllIIIIlIIIlIlllIll(n), llllIIIIlIIIlIlllIll(maxMemory)), String.format("Allocated: % 2d%% %03dMB", totalMemory * 100L / maxMemory, llllIIIIlIIIlIlllIll(totalMemory)), "", String.format("CPU: %s", lIIIIlIlIllllIIlIllI.llIIlIIIlIIIllIlIIIl()), "", String.format("Display: %dx%d (%s)", Display.getWidth(), Display.getHeight(), GL11.glGetString(7936)), GL11.glGetString(7937), GL11.glGetString(7938) });
        arrayList.add(4, "Native: " + llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll()) + "/" + llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl()) + "MB");
        arrayList.set(5, "GC: " + IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI() + "MB/s");
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI()) {
            final Object llllIIIlIlllIlIIIIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll, new Object[0]);
            arrayList.add("");
            arrayList.addAll((Collection<?>)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII, false));
        }
        if (this.IlIlIIIllIllIIIIIllI()) {
            return arrayList;
        }
        if (this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI != null && this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl && this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() != null) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
            llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            if (this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.p_() != llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
                llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll);
            }
            arrayList.add("");
            arrayList.add(String.valueOf(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI())));
            for (final Map.Entry<K, Comparable<?>> entry : llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().entrySet()) {
                String s = entry.getValue().toString();
                if (entry.getValue() == Boolean.TRUE) {
                    s = IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI + s;
                }
                else if (entry.getValue() == Boolean.FALSE) {
                    s = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + s;
                }
                arrayList.add(String.valueOf(entry.getKey().llllIIIIlIIIlIlllIll()) + ": " + s);
            }
        }
        return arrayList;
    }
    
    private void IllIIlllIIIIlllIIlIl() {
    }
    
    private int llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final int n4) {
        return (n < n3) ? this.llllIIIIlIIIlIlllIll(-16711936, -256, n / (float)n3) : this.llllIIIIlIIIlIlllIll(-256, -65536, (n - n3) / (float)(n4 - n3));
    }
    
    private int llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        final int n4 = n >> 24 & 0xFF;
        final int n5 = n >> 16 & 0xFF;
        final int n6 = n >> 8 & 0xFF;
        final int n7 = n & 0xFF;
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n4 + ((n2 >> 24 & 0xFF) - n4) * n3), 0, 255) << 24 | llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n5 + ((n2 >> 16 & 0xFF) - n5) * n3), 0, 255) << 16 | llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n6 + ((n2 >> 8 & 0xFF) - n6) * n3), 0, 255) << 8 | llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n7 + ((n2 & 0xFF) - n7) * n3), 0, 255);
    }
    
    private static long llllIIIIlIIIlIlllIll(final long n) {
        return n / 1024L / 1024L;
    }
    
    static /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl() {
        final int[] lIlIlIIIllIIllIIIllI = llIIIIIIlIllIIlIIIll.lIlIlIIIllIIllIIIllI;
        if (lIlIlIIIllIIllIIIllI != null) {
            return lIlIlIIIllIIllIIIllI;
        }
        final int[] lIlIlIIIllIIllIIIllI2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            lIlIlIIIllIIllIIIllI2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lIlIlIIIllIIllIIIllI2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lIlIlIIIllIIllIIIllI2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lIlIlIIIllIIllIIIllI2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lIlIlIIIllIIllIIIllI2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lIlIlIIIllIIllIIIllI2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return llIIIIIIlIllIIlIIIll.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI2;
    }
}
