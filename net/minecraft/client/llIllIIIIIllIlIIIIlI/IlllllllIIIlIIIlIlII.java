package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import org.lwjgl.input.*;
import com.google.common.collect.*;
import java.util.*;

public class IlllllllIIIlIIIlIlII extends lIIllIIIllllIlllIllI
{
    private static final List IlIlIIIllIllIIIIIllI;
    private final lIlIlIIIllIIllIIIllI IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private IIIlIIlIIIIlllIlllII llIIlIIIlIIIllIlIIIl;
    private IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    private lIIlIIIIIIIlIIlIlIIl lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        llllIIIIlIIIlIlllIll("Classic Flat", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI), llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, Arrays.asList("village"), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI), new llIllIlIIIIllIlIIllI(2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll("Tunnelers' Dream", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI), new llIllIlIIIIllIlIIllI(5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), new llIllIlIIIIllIlIIllI(230, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll("Water World", IIllIIllIIIlIlIIIIlI.lllllIIIIIlIIlllIlIl, llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl, Arrays.asList("biome_1", "oceanmonument"), new llIllIlIIIIllIlIIllI(90, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl), new llIllIlIIIIllIlIIllI(5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI), new llIllIlIIIIllIlIIllI(5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), new llIllIlIIIIllIlIIllI(5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll("Overworld", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI), dd.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI), new llIllIlIIIIllIlIIllI(3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), new llIllIlIIIIllIlIIllI(59, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll("Snowy Kingdom", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI), llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII, Arrays.asList("village", "biome_1"), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI), new llIllIlIIIIllIlIIllI(3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), new llIllIlIIIIllIlIIllI(59, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll("Bottomless Pit", IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll, llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, Arrays.asList("village", "biome_1"), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI), new llIllIlIIIIllIlIIllI(3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), new llIllIlIIIIllIlIIllI(2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI));
        llllIIIIlIIIlIlllIll("Desert", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI), llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new llIllIlIIIIllIlIIllI(8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI), new llIllIlIIIIllIlIIllI(52, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl), new llIllIlIIIIllIlIIllI(3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll("Redstone Ready", IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII, llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, new llIllIlIIIIllIlIIllI(52, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl), new llIllIlIIIIllIlIIllI(3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
    }
    
    public IlllllllIIIlIIIlIlII(final lIlIlIIIllIIllIIIllI illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        Keyboard.enableRepeatEvents(true);
        this.llllIIIlIlllIlIIIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets.title", new Object[0]);
        this.lIIIIlIIIIIlllIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets.share", new Object[0]);
        this.lIIIlllIIIllIIIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets.list", new Object[0]);
        this.lIlIlIIIllIIllIIIllI = new lIIlIIIIIIIlIIlIlIIl(2, this.IIllIIllIIIlIlIIIIlI, 50, 40, this.llllIIllllIlIlIIIIll - 100, 20);
        this.llIIlIIIlIIIllIlIIIl = new IIIlIIlIIIIlllIlllII(this);
        this.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl(1230);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI());
        this.IIlllIIlIllIllIlIIll.add(this.llIllIlIIIIllIlIIllI = new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets.select", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII - 28, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (!this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(c, n)) {
            super.llllIIIIlIIIlIlllIll(c, n);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0 && this.lIIIIlIIIIIlllIllIII()) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl());
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.llllIIIlIlllIlIIIIIl, this.llllIIllllIlIlIIIIll / 2, 8, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.lIIIIlIIIIIlllIllIII, 50, 30, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.lIIIlllIIIllIIIllIII, 50, 70, 10526880);
        this.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
        super.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI = this.lIIIIlIIIIIlllIllIII();
    }
    
    private boolean lIIIIlIIIIIlllIllIII() {
        return (this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll > -1 && this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll < IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI.size()) || this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl().length() > 1;
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIllIlIIIIllIlIIllI... array) {
        llllIIIIlIIIlIlllIll(s, ilIIIlIlIIIllIlIlIIl, 0, llIIlIIIlIIIllIlIIIl, null, array);
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final List list, final llIllIlIIIIllIlIIllI... array) {
        llllIIIIlIIIlIlllIll(s, ilIIIlIlIIIllIlIlIIl, 0, llIIlIIIlIIIllIlIIIl, list, array);
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final List list, final llIllIlIIIIllIlIIllI... array) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl();
        for (int i = array.length - 1; i >= 0; --i) {
            llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI().add(array[i]);
        }
        llIIlIIIlIIIllIlIIIl2.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.lIIIIIlIlIIIlIIIIlIl);
        llIIlIIIlIIIllIlIIIl2.IlIIIlIlIIIllIlIlIIl();
        if (list != null) {
            final Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl().put(iterator.next(), Maps.newHashMap());
            }
        }
        IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI.add(new IIlIIIIlllIlllllIlII(ilIIIlIlIIIllIlIlIIl, n, s, llIIlIIIlIIIllIlIIIl2.toString()));
    }
}
