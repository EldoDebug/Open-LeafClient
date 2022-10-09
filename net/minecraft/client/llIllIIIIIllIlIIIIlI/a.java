package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import org.apache.logging.log4j.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.io.*;
import java.util.*;
import java.io.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class a extends lIIllIIIllllIlllIllI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private static final lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private List lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private float llIllIlIIIIllIlIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/gui/title/minecraft.png");
        llllIIIlIlllIlIIIIIl = new lIllllIllIllIIllllll("textures/misc/vignette.png");
    }
    
    public a() {
        this.llIllIlIIIIllIlIIllI = 0.5f;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final lIIIlllIIIllIIIllIII lllIIIIlllllIlIIllIl = this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl();
        final IlIllIlIlIIIlIlIlIII ilIIlIlIIIlIIlIlIlII = this.IlIlIIIllIIllIlllllI.IlIIlIlIIIlIIlIlIlII();
        if (this.lIIIIlIIIIIlllIllIII == 0) {
            lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl();
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl);
            ilIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
        }
        ilIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll();
        ++this.lIIIIlIIIIIlllIllIII;
        if (this.lIIIIlIIIIIlllIllIII > (this.llIIlIIIlIIIllIlIIIl + this.IlIllIlIlIIIlIlIlIII + this.IlIllIlIlIIIlIlIlIII + 24) / this.llIllIlIIIIllIlIIllI) {
            this.IlIlIIIllIllIIIIIllI();
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (n == 1) {
            this.IlIlIIIllIllIIIIIllI();
        }
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII(IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll));
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return true;
    }
    
    @Override
    public void n_() {
        if (this.lIIIlllIIIllIIIllIII == null) {
            this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
            try {
                final String string = new StringBuilder().append(IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII).append(IlllIIIIlIIIlIlIlIIl.IIlllIIlIllIllIlIIll).append(IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI).append(IlllIIIIlIIIlIlIlIIl.lIlIlIIIllIIllIIIllI).toString();
                final int n = 274;
                final InputStream ilIlIlIlIlllllllllIl = this.IlIlIIIllIIllIlllllI.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("texts/end.txt")).IlIlIlIlIlllllllllIl();
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ilIlIlIlIlllllllllIl, Charsets.UTF_8));
                final Random random = new Random(8124371L);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String s;
                    int index;
                    for (s = line.replaceAll("PLAYERNAME", this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI()); s.contains(string); s = String.valueOf(s.substring(0, index)) + IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII + IlllIIIIlIIIlIlIlIIl.IIlllIIlIllIllIlIIll + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + s.substring(index + string.length())) {
                        index = s.indexOf(string);
                    }
                    this.lIIIlllIIIllIIIllIII.addAll(this.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(s, n));
                    this.lIIIlllIIIllIIIllIII.add("");
                }
                ilIlIlIlIlllllllllIl.close();
                for (int i = 0; i < 8; ++i) {
                    this.lIIIlllIIIllIIIllIII.add("");
                }
                final InputStream ilIlIlIlIlllllllllIl2 = this.IlIlIIIllIIllIlllllI.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("texts/credits.txt")).IlIlIlIlIlllllllllIl();
                String line2;
                while ((line2 = new BufferedReader(new InputStreamReader(ilIlIlIlIlllllllllIl2, Charsets.UTF_8)).readLine()) != null) {
                    this.lIIIlllIIIllIIIllIII.addAll(this.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(line2.replaceAll("PLAYERNAME", this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI()).replaceAll("\t", "    "), n));
                    this.lIIIlllIIIllIIIllIII.add("");
                }
                ilIlIlIlIlllllllllIl2.close();
                this.llIIlIIIlIIIllIlIIIl = this.lIIIlllIIIllIIIllIII.size() * 12;
            }
            catch (Exception ex) {
                a.IlIlIIIllIllIIIIIllI.error("Couldn't load credits", (Throwable)ex);
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final int n2, final float n3) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        final int llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
        final float n4 = 0.0f - (this.lIIIIlIIIIIlllIllIII + n3) * 0.5f * this.llIllIlIIIIllIlIIllI;
        final float n5 = this.IlIllIlIlIIIlIlIlIII - (this.lIIIIlIIIIIlllIllIII + n3) * 0.5f * this.llIllIlIIIIllIlIIllI;
        final float n6 = 0.015625f;
        float n7 = (this.lIIIIlIIIIIlllIllIII + n3 - 0.0f) * 0.02f;
        final float n8 = ((this.llIIlIIIlIIIllIlIIIl + this.IlIllIlIlIIIlIlIlIII + this.IlIllIlIlIIIlIlIlIII + 24) / this.llIllIlIIIIllIlIIllI - 20.0f - (this.lIIIIlIIIIIlllIllIII + n3)) * 0.005f;
        if (n8 < n7) {
            n7 = n8;
        }
        if (n7 > 1.0f) {
            n7 = 1.0f;
        }
        final float n9 = n7 * n7 * 96.0f / 255.0f;
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, this.IlIllIlIlIIIlIlIlIII, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.0, n4 * n6).llllIIIIlIIIlIlllIll(n9, n9, n9, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll * n6, n4 * n6).llllIIIIlIIIlIlllIll(n9, n9, n9, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll * n6, n5 * n6).llllIIIIlIIIlIlllIll(n9, n9, n9, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.0, n5 * n6).llllIIIIlIIIlIlllIll(n9, n9, n9, 1.0f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        final int n4 = 274;
        final int n5 = this.llllIIllllIlIlIIIIll / 2 - n4 / 2;
        final int n6 = this.IlIllIlIlIIIlIlIlIII + 50;
        final float n7 = -(this.lIIIIlIIIIIlllIllIII + n3) * this.llIllIlIIIIllIlIIllI;
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, n7, 0.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(a.IllIIlllIIIIlllIIlIl);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIlIlIlllllllllIl(n5, n6, 0, 0, 155, 44);
        this.IlIlIlIlIlllllllllIl(n5 + 155, n6, 0, 45, 155, 44);
        int n8 = n6 + 200;
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII.size(); ++i) {
            if (i == this.lIIIlllIIIllIIIllIII.size() - 1) {
                final float n9 = n8 + n7 - (this.IlIllIlIlIIIlIlIlIII / 2 - 6);
                if (n9 < 0.0f) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -n9, 0.0f);
                }
            }
            if (n8 + n7 + 12.0f + 8.0f > 0.0f && n8 + n7 < this.IlIllIlIlIIIlIlIlIII) {
                final String s = this.lIIIlllIIIllIIIllIII.get(i);
                if (s.startsWith("[C]")) {
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s.substring(3), (float)(n5 + (n4 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s.substring(3))) / 2), (float)n8, 16777215);
                }
                else {
                    this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl.setSeed(i * 4238972211L + this.lIIIIlIIIIIlllIllIII / 4);
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, (float)n5, (float)n8, 16777215);
                }
            }
            n8 += 12;
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(a.llllIIIlIlllIlIIIIIl);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 769);
        final int llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
        final int ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, ilIllIlIlIIIlIlIlIII, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.0, 1.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, ilIllIlIlIIIlIlIlIII, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(1.0, 1.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(1.0, 0.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.0, 0.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
