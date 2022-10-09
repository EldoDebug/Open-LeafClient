package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import org.lwjgl.util.glu.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll lllllIlIIIlIlIIlllII;
    private static final lIllllIllIllIIllllll lIllllllIIllIlIlIlII;
    private static final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII llIIlllIIlllIIllIllI;
    private final IllIIlllIIIIlllIIlIl IIlllIIIlIlllIIlllII;
    private Random IIlIIIIIllIlIIIlIIll;
    private llIIlIIIlIIIllIlIIIl llllllIllIllIlIllllI;
    public int IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    public float lIIIlllIIIllIIIllIII;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI;
    private final IlIllIlIlIIIlIlIlIII IIIllllllIllIIIlllIl;
    
    static {
        lllllIlIIIlIlIIlllII = new lIllllIllIllIIllllll("textures/gui/container/enchanting_table.png");
        lIllllllIIllIlIlIlII = new lIllllIllIllIIllllll("textures/entity/enchanting_table_book.png");
        llIIlllIIlllIIllIllI = new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII();
    }
    
    public IIIlIIIlIlIIlllIIlll(final IllIIlllIIIIlllIIlIl iIlllIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIllIlIlIIIlIlIlIII iiIllllllIllIIIlllIl) {
        super(new llIIlIIIlIIIllIlIIIl(iIlllIIIlIlllIIlllII, illlllllIIIlIIIlIlII));
        this.IIlIIIIIllIlIIIlIIll = new Random();
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        this.llllllIllIllIlIllllI = (llIIlIIIlIIIllIlIIIl)this.IIlIIIIlllIlllllIlII;
        this.IIIllllllIllIIIlllIl = iiIllllllIllIIIlllIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IIIllllllIllIIIlllIl.v_().lIIIIlIIIIIlllIllIII(), 12, 5, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IIlllIIIlIlllIIlllII.v_().lIIIIlIIIIIlllIllIII(), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        for (int i = 0; i < 3; ++i) {
            final int n6 = n - (n4 + 60);
            final int n7 = n2 - (n5 + 14 + 19 * i);
            if (n6 >= 0 && n7 >= 0 && n6 < 108 && n7 < 19 && this.llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, i)) {
                this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl, i);
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.lllllIlIIIlIlIIlllII);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((g.llllIIIIlIIIlIlllIll() - 320) / 2 * g.IlIlIIIllIllIIIIIllI(), (g.IlIlIlIlIlllllllllIl() - 240) / 2 * g.IlIlIIIllIllIIIIIllI(), 320 * g.IlIlIIIllIllIIIIIllI(), 240 * g.IlIlIIIllIllIIIIIllI());
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.34f, 0.23f, 0.0f);
        Project.gluPerspective(90.0f, 1.3333334f, 9.0f, 80.0f);
        final float n6 = 1.0f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 3.3f, -16.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n6, n6, n6);
        final float n7 = 5.0f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n7, n7, n7);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 0.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.lIllllllIIllIlIlIlII);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(20.0f, 1.0f, 0.0f, 0.0f);
        final float n8 = this.llIllIlIIIIllIlIIllI + (this.llIIlIIIlIIIllIlIIIl - this.llIllIlIIIIllIlIIllI) * n;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((1.0f - n8) * 0.2f, (1.0f - n8) * 0.1f, (1.0f - n8) * 0.25f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(1.0f - n8) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 1.0f, 0.0f, 0.0f);
        final float n9 = this.llllIIIlIlllIlIIIIIl + (this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl) * n + 0.25f;
        final float n10 = this.llllIIIlIlllIlIIIIIl + (this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl) * n + 0.75f;
        float n11 = (n9 - llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((double)n9)) * 1.6f - 0.3f;
        float n12 = (n10 - llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((double)n10)) * 1.6f - 0.3f;
        if (n11 < 0.0f) {
            n11 = 0.0f;
        }
        if (n12 < 0.0f) {
            n12 = 0.0f;
        }
        if (n11 > 1.0f) {
            n11 = 1.0f;
        }
        if (n12 > 1.0f) {
            n12 = 1.0f;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        IIIlIIIlIlIIlllIIlll.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(null, 0.0f, n11, n12, n8, 0.0f, 0.0625f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this.llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl);
        final int llllIIIIlIIIlIlllIll = this.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < 3; ++i) {
            final int n13 = n4 + 60;
            final int n14 = n13 + 20;
            final int n15 = 86;
            final String ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.lllllIlIIIlIlIIlllII);
            final int n16 = this.llllllIllIllIlIllllI.llllIIIlIlllIlIIIIIl[i];
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            if (n16 == 0) {
                this.IlIlIlIlIlllllllllIl(n13, n5 + 14 + 19 * i, 0, 185, 108, 19);
            }
            else {
                final String string = new StringBuilder().append(n16).toString();
                final FontRenderer ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI;
                int n17 = 6839882;
                int n18;
                if ((llllIIIIlIIIlIlllIll < i + 1 || this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.L < n16) && !this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.K.IlIIIlIlIIIllIlIlIIl) {
                    this.IlIlIlIlIlllllllllIl(n13, n5 + 14 + 19 * i, 0, 185, 108, 19);
                    this.IlIlIlIlIlllllllllIl(n13 + 1, n5 + 15 + 19 * i, 16 * i, 239, 16, 16);
                    ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n14, n5 + 16 + 19 * i, n15, (n17 & 0xFEFEFE) >> 1);
                    n18 = 4226832;
                }
                else {
                    final int n19 = n2 - (n4 + 60);
                    final int n20 = n3 - (n5 + 14 + 19 * i);
                    if (n19 >= 0 && n20 >= 0 && n19 < 108 && n20 < 19) {
                        this.IlIlIlIlIlllllllllIl(n13, n5 + 14 + 19 * i, 0, 204, 108, 19);
                        n17 = 16777088;
                    }
                    else {
                        this.IlIlIlIlIlllllllllIl(n13, n5 + 14 + 19 * i, 0, 166, 108, 19);
                    }
                    this.IlIlIlIlIlllllllllIl(n13 + 1, n5 + 15 + 19 * i, 16 * i, 223, 16, 16);
                    ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n14, n5 + 16 + 19 * i, n15, n17);
                    n18 = 8453920;
                }
                final FontRenderer lIlIlIIIllIIllIIIllI = this.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI;
                lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string, (float)(n14 + 86 - lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string)), (float)(n5 + 16 + 19 * i + 7), n18);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        final boolean ilIIIlIlIIIllIlIlIIl = this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.K.IlIIIlIlIIIllIlIlIIl;
        final int llllIIIIlIIIlIlllIll = this.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < 3; ++i) {
            final int n4 = this.llllllIllIllIlIllllI.llllIIIlIlllIlIIIIIl[i];
            final int n5 = this.llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII[i];
            final int n6 = i + 1;
            if (this.llIllIIIIIllIlIIIIlI(60, 14 + 19 * i, 108, 17, n, n2) && n4 > 0 && n5 >= 0) {
                final ArrayList arrayList = Lists.newArrayList();
                if (n5 >= 0 && net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5 & 0xFF) != null) {
                    arrayList.add(String.valueOf(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII.toString()) + net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.IIIlIIIlIlIIlllIIlll.toString() + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.enchant.clue", net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5 & 0xFF).IlIIIlIlIIIllIlIlIIl((n5 & 0xFF00) >> 8)));
                }
                if (!ilIIIlIlIIIllIlIlIIl) {
                    if (n5 >= 0) {
                        arrayList.add("");
                    }
                    if (this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.L < n4) {
                        arrayList.add(String.valueOf(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI.toString()) + "Level Requirement: " + this.llllllIllIllIlIllllI.llllIIIlIlllIlIIIIIl[i]);
                    }
                    else {
                        String s;
                        if (n6 == 1) {
                            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.enchant.lapis.one", new Object[0]);
                        }
                        else {
                            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.enchant.lapis.many", n6);
                        }
                        if (llllIIIIlIIIlIlllIll >= n6) {
                            arrayList.add(String.valueOf(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII.toString()) + s);
                        }
                        else {
                            arrayList.add(String.valueOf(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI.toString()) + s);
                        }
                        String s2;
                        if (n6 == 1) {
                            s2 = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.enchant.level.one", new Object[0]);
                        }
                        else {
                            s2 = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.enchant.level.many", n6);
                        }
                        arrayList.add(String.valueOf(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII.toString()) + s2);
                    }
                }
                this.llllIIIIlIIIlIlllIll(arrayList, n, n2);
                break;
            }
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(0).llllIIIIlIIIlIlllIll();
        if (!lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, this.lIlIlIIIllIIllIIIllI)) {
            this.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll;
            do {
                this.lIIIIlIIIIIlllIllIII += this.IIlIIIIIllIlIIIlIIll.nextInt(4) - this.IIlIIIIIllIlIIIlIIll.nextInt(4);
            } while (this.IllIIlllIIIIlllIIlIl <= this.lIIIIlIIIIIlllIllIII + 1.0f && this.IllIIlllIIIIlllIIlIl >= this.lIIIIlIIIIIlllIllIII - 1.0f);
        }
        ++this.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
        this.llIllIlIIIIllIlIIllI = this.llIIlIIIlIIIllIlIIIl;
        boolean b = false;
        for (int i = 0; i < 3; ++i) {
            if (this.llllllIllIllIlIllllI.llllIIIlIlllIlIIIIIl[i] != 0) {
                b = true;
            }
        }
        if (b) {
            this.llIIlIIIlIIIllIlIIIl += 0.2f;
        }
        else {
            this.llIIlIIIlIIIllIlIIIl -= 0.2f;
        }
        this.llIIlIIIlIIIllIlIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, 0.0f, 1.0f);
        final float n = (this.lIIIIlIIIIIlllIllIII - this.IllIIlllIIIIlllIIlIl) * 0.4f;
        final float n2 = 0.2f;
        this.lIIIlllIIIllIIIllIII += (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, -n2, n2) - this.lIIIlllIIIllIIIllIII) * 0.9f;
        this.IllIIlllIIIIlllIIlIl += this.lIIIlllIIIllIIIllIII;
    }
}
