package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.primitives.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;

public class IIlllIIlIllIllIlIIll extends lIIllIIIllllIlllIllI implements lIlIIlllIIlIIlIlllIl, lIllllIllIllIIllllll
{
    private IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII;
    protected String IlIlIIIllIllIIIIIllI;
    protected String IllIIlllIIIIlllIIlIl;
    protected String llllIIIlIlllIlIIIIIl;
    protected String[] lIIIIlIIIIIlllIllIII;
    private lIIIIlIlIllllIIlIllI llIIlIIIlIIIllIlIIIl;
    private IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    private IlIIIlIlIIIllIlIlIIl lIlIlIIIllIIllIIIllI;
    private IlIIIlIlIIIllIlIlIIl IIIlIIIlIlIIlllIIlll;
    private IlIIIlIlIIIllIlIlIIl IlIlIIIlIIlIlIIlllIl;
    private IlIIIlIlIIIllIlIlIIl IlllllllIIIlIIIlIlII;
    private IlIIIlIlIIIllIlIlIIl IIlIIIIlllIlllllIlII;
    private IlIIIlIlIIIllIlIlIIl IIIlIIlIIIIlllIlllII;
    private IlIIIlIlIIIllIlIlIIl IlIlIllllllllIIIIlII;
    private boolean IIlllIlIIllIlIlIlIIl;
    private int llIIIlIlIllIIlIlIlII;
    private boolean lllllIlIIIlIlIIlllII;
    private Predicate lIllllllIIllIlIlIlII;
    private lIIIIlIIIIIlllIllIII llIIlllIIlllIIllIllI;
    private lIIIIlIIIIIlllIllIII IIlllIIIlIlllIIlllII;
    private Random IIlIIIIIllIlIIIlIIll;
    
    public IIlllIIlIllIllIlIIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final String s) {
        this.IlIlIIIllIllIIIIIllI = "Customize World Settings";
        this.IllIIlllIIIIlllIIlIl = "Page 1 of 3";
        this.llllIIIlIlllIlIIIIIl = "Basic Settings";
        this.lIIIIlIIIIIlllIllIII = new String[4];
        this.IIlllIlIIllIlIlIlIIl = false;
        this.llIIIlIlIllIIlIlIlII = 0;
        this.lllllIlIIIlIlIIlllII = false;
        this.lIllllllIIllIlIlIlII = (Predicate)new lllIIIIlllllIlIIllIl(this);
        this.llIIlllIIlllIIllIllI = new lIIIIlIIIIIlllIllIII();
        this.IIlIIIIIllIlIIIlIIll = new Random();
        this.lIIIlllIIIllIIIllIII = (IIIIlllIIIIIIlIIIlll)liIllIIIllllIlllIllI;
        this.llllIIIIlIIIlIlllIll(s);
    }
    
    @Override
    public void n_() {
        int ilIIIlIlIIIllIlIlIIl = 0;
        int iiiIlllIIIIIIlIIIlll = 0;
        if (this.llIIlIIIlIIIllIlIIIl != null) {
            ilIIIlIlIIIllIlIlIIl = this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl();
            iiiIlllIIIIIIlIIIlll = this.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll();
        }
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.customizeTitle", new Object[0]);
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(this.IlIlIIIlIIlIlIIlllIl = new IlIIIlIlIIIllIlIlIIl(302, 20, 5, 80, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.prev", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IlllllllIIIlIIIlIlII = new IlIIIlIlIIIllIlIlIIl(303, this.llllIIllllIlIlIIIIll - 100, 5, 80, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.next", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IIIlIIIlIlIIlllIIlll = new IlIIIlIlIIIllIlIlIIl(304, this.llllIIllllIlIlIIIIll / 2 - 187, this.IlIllIlIlIIIlIlIlIII - 27, 90, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.defaults", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.lIlIlIIIllIIllIIIllI = new IlIIIlIlIIIllIlIlIIl(301, this.llllIIllllIlIlIIIIll / 2 - 92, this.IlIllIlIlIIIlIlIlIII - 27, 90, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.randomize", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.IlIlIllllllllIIIIlII = new IlIIIlIlIIIllIlIlIIl(305, this.llllIIllllIlIlIIIIll / 2 + 3, this.IlIllIlIlIIIlIlIlIII - 27, 90, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.presets", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(this.llIllIlIIIIllIlIIllI = new IlIIIlIlIIIllIlIlIIl(300, this.llllIIllllIlIlIIIIll / 2 + 98, this.IlIllIlIlIIIlIlIlIII - 27, 90, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI = this.IIlllIlIIllIlIlIlIIl;
        this.IIlIIIIlllIlllllIlII = new IlIIIlIlIIIllIlIlIIl(306, this.llllIIllllIlIlIIIIll / 2 - 55, 160, 50, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.yes", new Object[0]));
        this.IIlIIIIlllIlllllIlII.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll.add(this.IIlIIIIlllIlllllIlII);
        this.IIIlIIlIIIIlllIlllII = new IlIIIlIlIIIllIlIlIIl(307, this.llllIIllllIlIlIIIIll / 2 + 5, 160, 50, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.no", new Object[0]));
        this.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll.add(this.IIIlIIlIIIIlllIlllII);
        if (this.llIIIlIlIllIIlIlIlII != 0) {
            this.IIlIIIIlllIlllllIlII.IlIlIIIllIIllIlllllI = true;
            this.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI = true;
        }
        this.llllIIIlIlllIlIIIIIl();
        if (ilIIIlIlIIIllIlIlIIl != 0) {
            this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
            this.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl(iiiIlllIIIIIIlIIIlll);
            this.IIlllIIlIllIllIlIIll();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    private void llllIIIlIlllIlIIIIIl() {
        this.llIIlIIIlIIIllIlIIIl = new lIIIIlIlIllllIIlIllI(this.IlIlIIIllIIllIlllllI, this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, 32, this.IlIllIlIlIIIlIlIlIII - 32, 25, this, new lIllIIIIIlllIIlIIllI[][] { { new llIIIllIlIllIllIIIIl(160, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.lllIIIIlllllIlIIllIl), new IlIIllIIllIIllIIlIIl(148, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useCaves", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IlIlIIIIIIlllIlIllIl), new IlIIllIIllIIllIIlIIl(150, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IlIlIIIlIIlIlIIlllIl), new IlIIllIIllIIllIIlIIl(151, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useVillages", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IlllllllIIIlIIIlIlII), new IlIIllIIllIIllIIlIIl(152, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IIlIIIIlllIlllllIlII), new IlIIllIIllIIllIIlIIl(153, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useTemples", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IIIlIIlIIIIlllIlllII), new IlIIllIIllIIllIIlIIl(210, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useMonuments", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IlIlIllllllllIIIIlII), new IlIIllIIllIIllIIlIIl(154, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useRavines", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl), new IlIIllIIllIIllIIlIIl(149, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useDungeons", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IIllIIllIIIlIlIIIIlI), new llIIIllIlIllIllIIIIl(157, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0f, 100.0f, (float)this.IIlllIIIlIlllIIlllII.IIIlIIIlIlIIlllIIlll), new IlIIllIIllIIllIIlIIl(155, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.IIlllIIIlIlllIIlllII.llIIIlIlIllIIlIlIlII), new llIIIllIlIllIllIIIIl(158, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0f, 100.0f, (float)this.IIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII), new IlIIllIIllIIllIIlIIl(156, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.IIlllIIIlIlllIIlllII.lIllllllIIllIlIlIlII), new llIIIllIlIllIllIIIIl(159, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0f, 100.0f, (float)this.IIlllIIIlIlllIIlllII.llIIlllIIlllIIllIllI), new IlIIllIIllIIllIIlIIl(161, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.IIlllIIIlIlllIIlllII.IIlllIIIlIlllIIlllII), new llIIIllIlIllIllIIIIl(162, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0f, 37.0f, (float)this.IIlllIIIlIlllIIlllII.IIlIIIIIllIlIIIlIIll), new llIIIllIlIllIllIIIIl(163, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0f, 8.0f, (float)this.IIlllIIIlIlllIIlllII.llllllIllIllIlIllllI), new llIIIllIlIllIllIIIIl(164, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0f, 5.0f, (float)this.IIlllIIIlIlllIIlllII.IIIllllllIllIIIlllIl) }, { new IllIIlllllIIllIIllIl(416, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.dirt.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(165, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.IlIIIlIIIllllIlIlIlI), new llIIIllIlIllIllIIIIl(166, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.IIIIIllIIIIlIIIIllIl), new llIIIllIlIllIllIIIIl(167, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI), new llIIIllIlIllIllIIIIl(168, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIllllIIIlIIIIIIllIl), new IllIIlllllIIllIIllIl(417, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.gravel.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(169, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.IlllIIIIlIIIlIlIlIIl), new llIIIllIlIllIllIIIIl(170, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.lllIllIIIllllllIllll), new llIIIllIlIllIllIIIIl(171, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.llIllIlIlIIIIIIIllII), new llIIIllIlIllIllIIIIl(172, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIlIlIlIIlIllIIIIIIl), new IllIIlllllIIllIIllIl(418, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.stone.granite.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(173, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.IllIllIIIIlIIlIlllII), new llIIIllIlIllIllIIIIl(174, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.IlIllllIIlIIlIlIlIll), new llIIIllIlIllIllIIIIl(175, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IllIllIlllIllllIIllI), new llIIIllIlIllIllIIIIl(176, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.llIlIIIIIlIIlIlIIlll), new IllIIlllllIIllIIllIl(419, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.stone.diorite.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(177, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.IlIIlIlIIIlIIlIlIlII), new llIIIllIlIllIllIIIIl(178, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.IllIlIIllIllIIlIllII), new llIIIllIlIllIllIIIIl(179, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.lIIlIIIlIllIlIllIIIl), new llIIIllIlIllIllIIIIl(180, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIlIIIlllIllIllIlIII), new IllIIlllllIIllIIllIl(420, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.stone.andesite.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(181, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.lIlIlIlllIIlIlIlllIl), new llIIIllIlIllIllIIIIl(182, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.llIIIIIIlIllIIlIIIll), new llIIIllIlIllIllIIIIl(183, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.lIIIIlIlIllllIIlIllI), new llIIIllIlIllIllIIIIl(184, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.llIIIlIlllIllIIlIllI), new IllIIlllllIIllIIllIl(421, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.oreCoal.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(185, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.IlIIllIIllIIllIIlIIl), new llIIIllIlIllIllIIIIl(186, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.lllllIIIIIlIlIIIIIIl), new llIIIllIlIllIllIIIIl(187, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IllIIlllllIIllIIllIl), new llIIIllIlIllIllIIIIl(189, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.lIllIIIIIlllIIlIIllI), new IllIIlllllIIllIIllIl(422, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.oreIron.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(190, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.lIlIIlllIIlIIlIlllIl), new llIIIllIlIllIllIIIIl(191, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.llIIIllIlIllIllIIIIl), new llIIIllIlIllIllIIIIl(192, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIIllIIIlIlIIllIIIlI), new llIIIllIlIllIllIIIIl(193, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIlllIIlllIIIlIlllII), new IllIIlllllIIllIIllIl(423, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.oreGold.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(194, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.IlIIlllllIIllIIlllll), new llIIIllIlIllIllIIIIl(195, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.lllllIIlIlIIIlIlIIIl), new llIIIllIlIllIllIIIIl(196, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIlllllIllIllIlIlIII), new llIIIllIlIllIllIIIIl(197, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.llllIllllIllllIlIlII), new IllIIlllllIIllIIllIl(424, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.oreRedstone.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(198, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.IIlIlIllllIlllIIIIll), new llIIIllIlIllIllIIIIl(199, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.lIIllIIIllllIlllIllI), new llIIIllIlIllIllIIIIl(200, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IllIlIllIllIlllIIlll), new llIIIllIlIllIllIIIIl(201, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIllIIIlIIlIlIlIIIII), new IllIIlllllIIllIIllIl(425, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.oreDiamond.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(202, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.llIllIIlllllllllllll), new llIIIllIlIllIllIIIIl(203, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.lllllIIllIlIllIllllI), new llIIIllIlIllIllIIIIl(204, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IlIIIIIlIIllIIlIlIll), new llIIIllIlIllIllIIIIl(205, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IllllIIlIlIllIIIllII), new IllIIlllllIIllIIllIl(426, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.oreLapis.name", new Object[0]), false), null, new llIIIllIlIllIllIIIIl(206, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, (float)this.IIlllIIIlIlllIIlllII.lllllIIIIIlIIlllIlIl), new llIIIllIlIllIllIIIIl(207, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, (float)this.IIlllIIIlIlllIIlllII.IlIllllIIIlIllIlIIll), new llIIIllIlIllIllIIIIl(208, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.center", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.lIIIIIlIlIIIlIIIIlIl), new llIIIllIlIllIllIIIIl(209, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0f, 255.0f, (float)this.IIlllIIIlIlllIIlllII.IIllIIIlIIIIlIIlIIII) }, { new llIIIllIlIllIllIIIIl(100, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0f, 5000.0f, this.IIlllIIIlIlllIIlllII.lIIIlllIIIllIIIllIII), new llIIIllIlIllIllIIIIl(101, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0f, 5000.0f, this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl), new llIIIllIlIllIllIIIIl(102, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0f, 5000.0f, this.IIlllIIIlIlllIIlllII.llIllIlIIIIllIlIIllI), new llIIIllIlIllIllIIIIl(103, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0f, 2000.0f, this.IIlllIIIlIlllIIlllII.IllIIlllIIIIlllIIlIl), new llIIIllIlIllIllIIIIl(104, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0f, 2000.0f, this.IIlllIIIlIlllIIlllII.llllIIIlIlllIlIIIIIl), new llIIIllIlIllIllIIIIl(105, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01f, 20.0f, this.IIlllIIIlIlllIIlllII.lIIIIlIIIIIlllIllIII), new llIIIllIlIllIllIIIIl(106, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0f, 25.0f, this.IIlllIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI), new llIIIllIlIllIllIIIIl(107, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0f, 6000.0f, this.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl), new llIIIllIlIllIllIIIIl(108, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0f, 6000.0f, this.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI), new llIIIllIlIllIllIIIIl(109, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01f, 50.0f, this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI), new llIIIllIlIllIllIIIIl(110, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl), new llIIIllIlIllIllIIIIl(111, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI), new llIIIllIlIllIllIIIIl(112, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0f, 20.0f, this.IIlllIIIlIlllIIlllII.IIIIlllIIIIIIlIIIlll), new llIIIllIlIllIllIIIIl(113, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0f, 20.0f, this.IIlllIIIlIlllIIlllII.llllIIllllIlIlIIIIll), new llIIIllIlIllIllIIIIl(114, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0f, 20.0f, this.IIlllIIIlIlllIIlllII.IlIllIlIlIIIlIlIlIII), new llIIIllIlIllIllIIIIl(115, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0f, 20.0f, this.IIlllIIIlIlllIIlllII.IIlllIIlIllIllIlIIll) }, { new IllIIlllllIIllIIllIl(400, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.mainNoiseScaleX", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(132, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.lIIIlllIIIllIIIllIII), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(401, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.mainNoiseScaleY", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(133, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(402, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.mainNoiseScaleZ", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(134, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.llIllIlIIIIllIlIIllI), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(403, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.depthNoiseScaleX", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(135, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.IllIIlllIIIIlllIIlIl), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(404, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.depthNoiseScaleZ", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(136, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.llllIIIlIlllIlIIIIIl), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(405, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(137, String.format("%2.3f", this.IIlllIIIlIlllIIlllII.lIIIIlIIIIIlllIllIII), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(406, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.baseSize", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(138, String.format("%2.3f", this.IIlllIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(407, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.coordinateScale", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(139, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(408, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.heightScale", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(140, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(409, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.stretchY", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(141, String.format("%2.3f", this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(410, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.upperLimitScale", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(142, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(411, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.lowerLimitScale", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(143, String.format("%5.3f", this.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(412, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeDepthWeight", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(144, String.format("%2.3f", this.IIlllIIIlIlllIIlllII.IIIIlllIIIIIIlIIIlll), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(413, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeDepthOffset", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(145, String.format("%2.3f", this.IIlllIIIlIlllIIlllII.llllIIllllIlIlIIIIll), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(414, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeScaleWeight", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(146, String.format("%2.3f", this.IIlllIIIlIlllIIlllII.IlIllIlIlIIIlIlIlIII), false, this.lIllllllIIllIlIlIlII), new IllIIlllllIIllIIllIl(415, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.biomeScaleOffset", new Object[0])) + ":", false), new llIIIlIlllIllIIlIllI(147, String.format("%2.3f", this.IIlllIIIlIlllIIlllII.IIlllIIlIllIllIlIIll), false, this.lIllllllIIllIlIlIlII) } });
        for (int i = 0; i < 4; ++i) {
            this.lIIIIlIIIIIlllIllIII[i] = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.page" + i, new Object[0]);
        }
        this.IIlllIIlIllIllIlIIll();
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.IIlllIIIlIlllIIlllII.toString().replace("\n", "");
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        if (s != null && s.length() != 0) {
            this.IIlllIIIlIlllIIlllII = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(s);
        }
        else {
            this.IIlllIIIlIlllIIlllII = new lIIIIlIIIIIlllIllIII();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final String s) {
        float float1 = 0.0f;
        try {
            float1 = Float.parseFloat(s);
        }
        catch (NumberFormatException ex) {}
        float n2 = 0.0f;
        switch (n) {
            case 132: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 5000.0f);
                iIlllIIIlIlllIIlllII.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll;
                n2 = llllIIIIlIIIlIlllIll;
                break;
            }
            case 133: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII2 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 5000.0f);
                iIlllIIIlIlllIIlllII2.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2;
                n2 = llllIIIIlIIIlIlllIll2;
                break;
            }
            case 134: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII3 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 5000.0f);
                iIlllIIIlIlllIIlllII3.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll3;
                n2 = llllIIIIlIIIlIlllIll3;
                break;
            }
            case 135: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII4 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 2000.0f);
                iIlllIIIlIlllIIlllII4.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll4;
                n2 = llllIIIIlIIIlIlllIll4;
                break;
            }
            case 136: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII5 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 2000.0f);
                iIlllIIIlIlllIIlllII5.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll5;
                n2 = llllIIIIlIIIlIlllIll5;
                break;
            }
            case 137: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII6 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll6 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 0.01f, 20.0f);
                iIlllIIIlIlllIIlllII6.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll6;
                n2 = llllIIIIlIIIlIlllIll6;
                break;
            }
            case 138: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII7 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll7 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 25.0f);
                iIlllIIIlIlllIIlllII7.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll7;
                n2 = llllIIIIlIIIlIlllIll7;
                break;
            }
            case 139: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII8 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll8 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 6000.0f);
                iIlllIIIlIlllIIlllII8.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll8;
                n2 = llllIIIIlIIIlIlllIll8;
                break;
            }
            case 140: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII9 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll9 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 6000.0f);
                iIlllIIIlIlllIIlllII9.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll9;
                n2 = llllIIIIlIIIlIlllIll9;
                break;
            }
            case 141: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII10 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll10 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 0.01f, 50.0f);
                iIlllIIIlIlllIIlllII10.IlIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll10;
                n2 = llllIIIIlIIIlIlllIll10;
                break;
            }
            case 142: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII11 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll11 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 5000.0f);
                iIlllIIIlIlllIIlllII11.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll11;
                n2 = llllIIIIlIIIlIlllIll11;
                break;
            }
            case 143: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII12 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll12 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 5000.0f);
                iIlllIIIlIlllIIlllII12.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll12;
                n2 = llllIIIIlIIIlIlllIll12;
                break;
            }
            case 144: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII13 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll13 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 20.0f);
                iIlllIIIlIlllIIlllII13.IIIIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll13;
                n2 = llllIIIIlIIIlIlllIll13;
                break;
            }
            case 145: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII14 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll14 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 0.0f, 20.0f);
                iIlllIIIlIlllIIlllII14.llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll14;
                n2 = llllIIIIlIIIlIlllIll14;
                break;
            }
            case 146: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII15 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll15 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 1.0f, 20.0f);
                iIlllIIIlIlllIIlllII15.IlIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll15;
                n2 = llllIIIIlIIIlIlllIll15;
                break;
            }
            case 147: {
                final lIIIIlIIIIIlllIllIII iIlllIIIlIlllIIlllII16 = this.IIlllIIIlIlllIIlllII;
                final float llllIIIIlIIIlIlllIll16 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(float1, 0.0f, 20.0f);
                iIlllIIIlIlllIIlllII16.IIlllIIlIllIllIlIIll = llllIIIIlIIIlIlllIll16;
                n2 = llllIIIIlIIIlIlllIll16;
                break;
            }
        }
        if (n2 != float1 && float1 != 0.0f) {
            ((lIIlIIIIIIIlIIlIlIIl)this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl(n)).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(n, n2));
        }
        ((IIlIlllIlIlllIlIllll)this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl(n - 132 + 100)).llllIIIIlIIIlIlllIll(n2, false);
        if (!this.IIlllIIIlIlllIIlllII.equals(this.llIIlllIIlllIIllIllI)) {
            this.llllIIIIlIIIlIlllIll(true);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IIlllIlIIllIlIlIlIIl = b;
        this.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI = b;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll(final int n, final String s, final float n2) {
        return String.valueOf(s) + ": " + this.IlIlIlIlIlllllllllIl(n, n2);
    }
    
    private String IlIlIlIlIlllllllllIl(final int n, final float n2) {
        switch (n) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 107:
            case 108:
            case 110:
            case 111:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 139:
            case 140:
            case 142:
            case 143: {
                return String.format("%5.3f", n2);
            }
            case 105:
            case 106:
            case 109:
            case 112:
            case 113:
            case 114:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case 145:
            case 146:
            case 147: {
                return String.format("%2.3f", n2);
            }
            default: {
                return String.format("%d", (int)n2);
            }
            case 162: {
                if (n2 < 0.0f) {
                    return net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.all", new Object[0]);
                }
                if ((int)n2 >= net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII.lIIIIIlIlIIIlIIIIlIl) {
                    final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll()[(int)n2 + 2];
                    return (llIIlIIIlIIIllIlIIIl != null) ? llIIlIIIlIIIllIlIIIl.lIlIIlllIIlIIlIlllIl : "?";
                }
                final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll()[(int)n2];
                return (llIIlIIIlIIIllIlIIIl2 != null) ? llIIlIIIlIIIllIlIIIl2.lIlIIlllIIlIIlIlllIl : "?";
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final boolean ilIlIllllllllIIIIlII) {
        switch (n) {
            case 148: {
                this.IIlllIIIlIlllIIlllII.IlIlIIIIIIlllIlIllIl = ilIlIllllllllIIIIlII;
                break;
            }
            case 149: {
                this.IIlllIIIlIlllIIlllII.IIllIIllIIIlIlIIIIlI = ilIlIllllllllIIIIlII;
                break;
            }
            case 150: {
                this.IIlllIIIlIlllIIlllII.IlIlIIIlIIlIlIIlllIl = ilIlIllllllllIIIIlII;
                break;
            }
            case 151: {
                this.IIlllIIIlIlllIIlllII.IlllllllIIIlIIIlIlII = ilIlIllllllllIIIIlII;
                break;
            }
            case 152: {
                this.IIlllIIIlIlllIIlllII.IIlIIIIlllIlllllIlII = ilIlIllllllllIIIIlII;
                break;
            }
            case 153: {
                this.IIlllIIIlIlllIIlllII.IIIlIIlIIIIlllIlllII = ilIlIllllllllIIIIlII;
                break;
            }
            case 154: {
                this.IIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl = ilIlIllllllllIIIIlII;
                break;
            }
            case 155: {
                this.IIlllIIIlIlllIIlllII.llIIIlIlIllIIlIlIlII = ilIlIllllllllIIIIlII;
                break;
            }
            case 156: {
                this.IIlllIIIlIlllIIlllII.lIllllllIIllIlIlIlII = ilIlIllllllllIIIIlII;
                break;
            }
            case 161: {
                this.IIlllIIIlIlllIIlllII.IIlllIIIlIlllIIlllII = ilIlIllllllllIIIIlII;
                break;
            }
            case 210: {
                this.IIlllIIIlIlllIIlllII.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
                break;
            }
        }
        if (!this.IIlllIIIlIlllIIlllII.equals(this.llIIlllIIlllIIllIllI)) {
            this.llllIIIIlIIIlIlllIll(true);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final float n2) {
        switch (n) {
            case 100: {
                this.IIlllIIIlIlllIIlllII.lIIIlllIIIllIIIllIII = n2;
                break;
            }
            case 101: {
                this.IIlllIIIlIlllIIlllII.llIIlIIIlIIIllIlIIIl = n2;
                break;
            }
            case 102: {
                this.IIlllIIIlIlllIIlllII.llIllIlIIIIllIlIIllI = n2;
                break;
            }
            case 103: {
                this.IIlllIIIlIlllIIlllII.IllIIlllIIIIlllIIlIl = n2;
                break;
            }
            case 104: {
                this.IIlllIIIlIlllIIlllII.llllIIIlIlllIlIIIIIl = n2;
                break;
            }
            case 105: {
                this.IIlllIIIlIlllIIlllII.lIIIIlIIIIIlllIllIII = n2;
                break;
            }
            case 106: {
                this.IIlllIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI = n2;
                break;
            }
            case 107: {
                this.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl = n2;
                break;
            }
            case 108: {
                this.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI = n2;
                break;
            }
            case 109: {
                this.IIlllIIIlIlllIIlllII.IlIlIIIllIIllIlllllI = n2;
                break;
            }
            case 110: {
                this.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl = n2;
                break;
            }
            case 111: {
                this.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI = n2;
                break;
            }
            case 112: {
                this.IIlllIIIlIlllIIlllII.IIIIlllIIIIIIlIIIlll = n2;
                break;
            }
            case 113: {
                this.IIlllIIIlIlllIIlllII.llllIIllllIlIlIIIIll = n2;
                break;
            }
            case 114: {
                this.IIlllIIIlIlllIIlllII.IlIllIlIlIIIlIlIlIII = n2;
                break;
            }
            case 115: {
                this.IIlllIIIlIlllIIlllII.IIlllIIlIllIllIlIIll = n2;
                break;
            }
            case 157: {
                this.IIlllIIIlIlllIIlllII.IIIlIIIlIlIIlllIIlll = (int)n2;
                break;
            }
            case 158: {
                this.IIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII = (int)n2;
                break;
            }
            case 159: {
                this.IIlllIIIlIlllIIlllII.llIIlllIIlllIIllIllI = (int)n2;
                break;
            }
            case 160: {
                this.IIlllIIIlIlllIIlllII.lllIIIIlllllIlIIllIl = (int)n2;
                break;
            }
            case 162: {
                this.IIlllIIIlIlllIIlllII.IIlIIIIIllIlIIIlIIll = (int)n2;
                break;
            }
            case 163: {
                this.IIlllIIIlIlllIIlllII.llllllIllIllIlIllllI = (int)n2;
                break;
            }
            case 164: {
                this.IIlllIIIlIlllIIlllII.IIIllllllIllIIIlllIl = (int)n2;
                break;
            }
            case 165: {
                this.IIlllIIIlIlllIIlllII.IlIIIlIIIllllIlIlIlI = (int)n2;
                break;
            }
            case 166: {
                this.IIlllIIIlIlllIIlllII.IIIIIllIIIIlIIIIllIl = (int)n2;
                break;
            }
            case 167: {
                this.IIlllIIIlIlllIIlllII.IIIIIIIIIlllIllIlIlI = (int)n2;
                break;
            }
            case 168: {
                this.IIlllIIIlIlllIIlllII.IIllllIIIlIIIIIIllIl = (int)n2;
                break;
            }
            case 169: {
                this.IIlllIIIlIlllIIlllII.IlllIIIIlIIIlIlIlIIl = (int)n2;
                break;
            }
            case 170: {
                this.IIlllIIIlIlllIIlllII.lllIllIIIllllllIllll = (int)n2;
                break;
            }
            case 171: {
                this.IIlllIIIlIlllIIlllII.llIllIlIlIIIIIIIllII = (int)n2;
                break;
            }
            case 172: {
                this.IIlllIIIlIlllIIlllII.IIlIlIlIIlIllIIIIIIl = (int)n2;
                break;
            }
            case 173: {
                this.IIlllIIIlIlllIIlllII.IllIllIIIIlIIlIlllII = (int)n2;
                break;
            }
            case 174: {
                this.IIlllIIIlIlllIIlllII.IlIllllIIlIIlIlIlIll = (int)n2;
                break;
            }
            case 175: {
                this.IIlllIIIlIlllIIlllII.IllIllIlllIllllIIllI = (int)n2;
                break;
            }
            case 176: {
                this.IIlllIIIlIlllIIlllII.llIlIIIIIlIIlIlIIlll = (int)n2;
                break;
            }
            case 177: {
                this.IIlllIIIlIlllIIlllII.IlIIlIlIIIlIIlIlIlII = (int)n2;
                break;
            }
            case 178: {
                this.IIlllIIIlIlllIIlllII.IllIlIIllIllIIlIllII = (int)n2;
                break;
            }
            case 179: {
                this.IIlllIIIlIlllIIlllII.lIIlIIIlIllIlIllIIIl = (int)n2;
                break;
            }
            case 180: {
                this.IIlllIIIlIlllIIlllII.IIlIIIlllIllIllIlIII = (int)n2;
                break;
            }
            case 181: {
                this.IIlllIIIlIlllIIlllII.lIlIlIlllIIlIlIlllIl = (int)n2;
                break;
            }
            case 182: {
                this.IIlllIIIlIlllIIlllII.llIIIIIIlIllIIlIIIll = (int)n2;
                break;
            }
            case 183: {
                this.IIlllIIIlIlllIIlllII.lIIIIlIlIllllIIlIllI = (int)n2;
                break;
            }
            case 184: {
                this.IIlllIIIlIlllIIlllII.llIIIlIlllIllIIlIllI = (int)n2;
                break;
            }
            case 185: {
                this.IIlllIIIlIlllIIlllII.IlIIllIIllIIllIIlIIl = (int)n2;
                break;
            }
            case 186: {
                this.IIlllIIIlIlllIIlllII.lllllIIIIIlIlIIIIIIl = (int)n2;
                break;
            }
            case 187: {
                this.IIlllIIIlIlllIIlllII.IllIIlllllIIllIIllIl = (int)n2;
                break;
            }
            case 189: {
                this.IIlllIIIlIlllIIlllII.lIllIIIIIlllIIlIIllI = (int)n2;
                break;
            }
            case 190: {
                this.IIlllIIIlIlllIIlllII.lIlIIlllIIlIIlIlllIl = (int)n2;
                break;
            }
            case 191: {
                this.IIlllIIIlIlllIIlllII.llIIIllIlIllIllIIIIl = (int)n2;
                break;
            }
            case 192: {
                this.IIlllIIIlIlllIIlllII.IIIllIIIlIlIIllIIIlI = (int)n2;
                break;
            }
            case 193: {
                this.IIlllIIIlIlllIIlllII.IIlllIIlllIIIlIlllII = (int)n2;
                break;
            }
            case 194: {
                this.IIlllIIIlIlllIIlllII.IlIIlllllIIllIIlllll = (int)n2;
                break;
            }
            case 195: {
                this.IIlllIIIlIlllIIlllII.lllllIIlIlIIIlIlIIIl = (int)n2;
                break;
            }
            case 196: {
                this.IIlllIIIlIlllIIlllII.IIlllllIllIllIlIlIII = (int)n2;
                break;
            }
            case 197: {
                this.IIlllIIIlIlllIIlllII.llllIllllIllllIlIlII = (int)n2;
                break;
            }
            case 198: {
                this.IIlllIIIlIlllIIlllII.IIlIlIllllIlllIIIIll = (int)n2;
                break;
            }
            case 199: {
                this.IIlllIIIlIlllIIlllII.lIIllIIIllllIlllIllI = (int)n2;
                break;
            }
            case 200: {
                this.IIlllIIIlIlllIIlllII.IllIlIllIllIlllIIlll = (int)n2;
                break;
            }
            case 201: {
                this.IIlllIIIlIlllIIlllII.IIllIIIlIIlIlIlIIIII = (int)n2;
                break;
            }
            case 202: {
                this.IIlllIIIlIlllIIlllII.llIllIIlllllllllllll = (int)n2;
                break;
            }
            case 203: {
                this.IIlllIIIlIlllIIlllII.lllllIIllIlIllIllllI = (int)n2;
                break;
            }
            case 204: {
                this.IIlllIIIlIlllIIlllII.IlIIIIIlIIllIIlIlIll = (int)n2;
                break;
            }
            case 205: {
                this.IIlllIIIlIlllIIlllII.IllllIIlIlIllIIIllII = (int)n2;
                break;
            }
            case 206: {
                this.IIlllIIIlIlllIIlllII.lllllIIIIIlIIlllIlIl = (int)n2;
                break;
            }
            case 207: {
                this.IIlllIIIlIlllIIlllII.IlIllllIIIlIllIlIIll = (int)n2;
                break;
            }
            case 208: {
                this.IIlllIIIlIlllIIlllII.lIIIIIlIlIIIlIIIIlIl = (int)n2;
                break;
            }
            case 209: {
                this.IIlllIIIlIlllIIlllII.IIllIIIlIIIIlIIlIIII = (int)n2;
                break;
            }
        }
        if (n >= 100 && n < 116) {
            final llIllIIIIIllIlIIIIlI ilIIIlIlIIIllIlIlIIl = this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl(n - 100 + 132);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                ((lIIlIIIIIIIlIIlIlIIl)ilIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(n, n2));
            }
        }
        if (!this.IIlllIIIlIlllIIlllII.equals(this.llIIlllIIlllIIllIllI)) {
            this.llllIIIIlIIIlIlllIll(true);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            switch (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
                case 300: {
                    this.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI = this.IIlllIIIlIlllIIlllII.toString();
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
                    break;
                }
                case 301: {
                    for (int i = 0; i < this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(); ++i) {
                        final lllllIIIIIlIlIIIIIIl ilIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(i);
                        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
                        if (llllIIIIlIIIlIlllIll instanceof IlIIIlIlIIIllIlIlIIl) {
                            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = (IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll;
                            if (ilIIIlIlIIIllIlIlIIl2 instanceof IIlIlllIlIlllIlIllll) {
                                ((IIlIlllIlIlllIlIllll)ilIIIlIlIIIllIlIlIIl2).llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(((IIlIlllIlIlllIlIllll)ilIIIlIlIIIllIlIlIIl2).IlIIIlIlIIIllIlIlIIl() * (0.75f + this.IIlIIIIIllIlIIIlIIll.nextFloat() * 0.5f) + (this.IIlIIIIIllIlIIIlIIll.nextFloat() * 0.1f - 0.05f), 0.0f, 1.0f));
                            }
                            else if (ilIIIlIlIIIllIlIlIIl2 instanceof IlIIIlIIIllllIlIlIlI) {
                                ((IlIIIlIIIllllIlIlIlI)ilIIIlIlIIIllIlIlIIl2).IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll.nextBoolean());
                            }
                        }
                        final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                        if (ilIlIlIlIlllllllllIl instanceof IlIIIlIlIIIllIlIlIIl) {
                            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3 = (IlIIIlIlIIIllIlIlIIl)ilIlIlIlIlllllllllIl;
                            if (ilIIIlIlIIIllIlIlIIl3 instanceof IIlIlllIlIlllIlIllll) {
                                ((IIlIlllIlIlllIlIllll)ilIIIlIlIIIllIlIlIIl3).llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(((IIlIlllIlIlllIlIllll)ilIIIlIlIIIllIlIlIIl3).IlIIIlIlIIIllIlIlIIl() * (0.75f + this.IIlIIIIIllIlIIIlIIll.nextFloat() * 0.5f) + (this.IIlIIIIIllIlIIIlIIll.nextFloat() * 0.1f - 0.05f), 0.0f, 1.0f));
                            }
                            else if (ilIIIlIlIIIllIlIlIIl3 instanceof IlIIIlIIIllllIlIlIlI) {
                                ((IlIIIlIIIllllIlIlIlI)ilIIIlIlIIIllIlIlIIl3).IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll.nextBoolean());
                            }
                        }
                    }
                }
                case 302: {
                    this.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl();
                    this.IIlllIIlIllIllIlIIll();
                    break;
                }
                case 303: {
                    this.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI();
                    this.IIlllIIlIllIllIlIIll();
                    break;
                }
                case 304: {
                    if (this.IIlllIlIIllIlIlIlIIl) {
                        this.llllIIIIlIIIlIlllIll(304);
                        break;
                    }
                    break;
                }
                case 305: {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIIIIIlIIllIIlIlIll(this));
                    break;
                }
                case 306: {
                    this.lIIIlllIIIllIIIllIII();
                    break;
                }
                case 307: {
                    this.llIIIlIlIllIIlIlIlII = 0;
                    this.lIIIlllIIIllIIIllIII();
                    break;
                }
            }
        }
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        this.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll();
        this.llllIIIlIlllIlIIIIIl();
        this.llllIIIIlIIIlIlllIll(false);
    }
    
    private void llllIIIIlIIIlIlllIll(final int llIIIlIlIllIIlIlIlII) {
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
        this.IlIlIlIlIlllllllllIl(true);
    }
    
    private void lIIIlllIIIllIIIllIII() {
        switch (this.llIIIlIlIllIIlIlIlII) {
            case 300: {
                this.llllIIIIlIIIlIlllIll((IlIIIlIlIIIllIlIlIIl)this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl(300));
                break;
            }
            case 304: {
                this.lIIIIlIIIIIlllIllIII();
                break;
            }
        }
        this.llIIIlIlIllIIlIlIlII = 0;
        this.lllllIlIIIlIlIIlllII = true;
        this.IlIlIlIlIlllllllllIl(false);
    }
    
    private void IlIlIlIlIlllllllllIl(final boolean b) {
        this.IIlIIIIlllIlllllIlII.IlIlIIIllIIllIlllllI = b;
        this.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI = b;
        this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI = !b;
        this.llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = !b;
        this.IlIlIIIlIIlIlIIlllIl.lIlIlIIIllIIllIIIllI = !b;
        this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI = !b;
        this.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI = (this.IIlllIlIIllIlIlIlIIl && !b);
        this.IlIlIllllllllIIIIlII.lIlIlIIIllIIllIIIllI = !b;
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(!b);
    }
    
    private void IIlllIIlIllIllIlIIll() {
        this.IlIlIIIlIIlIlIIlllIl.lIlIlIIIllIIllIIIllI = (this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() != 0);
        this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI = (this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() != this.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI() - 1);
        this.IllIIlllIIIIlllIIlIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("book.pageIndicator", this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() + 1, this.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI());
        this.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII[this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl()];
        this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI = (this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() != this.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI() - 1);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        super.llllIIIIlIIIlIlllIll(c, n);
        if (this.llIIIlIlIllIIlIlIlII == 0) {
            switch (n) {
                case 200: {
                    this.llllIIIIlIIIlIlllIll(1.0f);
                    break;
                }
                case 208: {
                    this.llllIIIIlIIIlIlllIll(-1.0f);
                    break;
                }
                default: {
                    this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(c, n);
                    break;
                }
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final float n) {
        final llIllIIIIIllIlIIIIlI liiIlllIIIllIIIllIII = this.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII();
        if (liiIlllIIIllIIIllIII instanceof lIIlIIIIIIIlIIlIlIIl) {
            float n2 = n;
            if (lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                n2 = n * 0.1f;
                if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                    n2 *= 0.1f;
                }
            }
            else if (lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                n2 = n * 10.0f;
                if (lIIllIIIllllIlllIllI.IlIllIlIlIIIlIlIlIII()) {
                    n2 *= 10.0f;
                }
            }
            final lIIlIIIIIIIlIIlIlIIl liIlIIIIIIIlIIlIlIIl = (lIIlIIIIIIIlIIlIlIIl)liiIlllIIIllIIIllIII;
            final Float tryParse = Floats.tryParse(liIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl());
            if (tryParse != null) {
                final Float value = tryParse + n2;
                final int ilIIIlIlIIIllIlIlIIl = liIlIIIIIIIlIIlIlIIl.IlIIIlIlIIIllIlIlIIl();
                final String ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(liIlIIIIIIIlIIlIlIIl.IlIIIlIlIIIllIlIlIIl(), value);
                liIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (this.llIIIlIlIllIIlIlIlII == 0 && !this.lllllIlIIIlIlIIlllII) {
            this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(n, n2, n3);
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        super.IlIlIlIlIlllllllllIl(n, n2, n3);
        if (this.lllllIlIIIlIlIIlllII) {
            this.lllllIlIIIlIlIIlllII = false;
        }
        else if (this.llIIIlIlIllIIlIlIlII == 0) {
            this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(n, n2, n3);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 2, 16777215);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll / 2, 12, 16777215);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.llllIIIlIlllIlIIIIIl, this.llllIIllllIlIlIIIIll / 2, 22, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (this.llIIIlIlIllIIlIlIlII != 0) {
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, Integer.MIN_VALUE);
            this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll / 2 - 91, this.llllIIllllIlIlIIIIll / 2 + 90, 99, -2039584);
            this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll / 2 - 91, this.llllIIllllIlIlIIIIll / 2 + 90, 185, -6250336);
            this.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll / 2 - 91, 99, 185, -2039584);
            this.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll / 2 + 90, 99, 185, -6250336);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll / 2 - 90, 185.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 2.65625).IlIlIlIlIlllllllllIl(64, 64, 64, 64).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll / 2 + 90, 185.0, 0.0).llllIIIIlIIIlIlllIll(5.625, 2.65625).IlIlIlIlIlllllllllIl(64, 64, 64, 64).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll / 2 + 90, 100.0, 0.0).llllIIIIlIIIlIlllIll(5.625, 0.0).IlIlIlIlIlllllllllIl(64, 64, 64, 64).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIllllIlIlIIIIll / 2 - 90, 100.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(64, 64, 64, 64).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.confirmTitle", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 105, 16777215);
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.confirm1", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 125, 16777215);
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.confirm2", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 135, 16777215);
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, n, n2);
            this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, n, n2);
        }
    }
}
