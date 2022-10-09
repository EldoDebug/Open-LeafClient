package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import org.lwjgl.input.*;

public class IlIIIIIlIIllIIlIlIll extends lIIllIIIllllIlllIllI
{
    private static final List IllIIlllIIIIlllIIlIl;
    private lllllIIIIIlIIlllIlIl llllIIIlIlllIlIIIIIl;
    private IlIIIlIlIIIllIlIlIIl lIIIIlIIIIIlllIllIII;
    private lIIlIIIIIIIlIIlIlIIl lIIIlllIIIllIIIllIII;
    private IIlllIIlIllIllIlIIll llIIlIIIlIIIllIlIIIl;
    protected String IlIlIIIllIllIIIIIllI;
    private String llIllIlIIIIllIlIIllI;
    private String lIlIlIIIllIIllIIIllI;
    
    static {
        (IllIIlllIIIIlllIIlIl = Lists.newArrayList()).add(new IllllIIlIlIllIIIllII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.preset.waterWorld", new Object[0]), new lIllllIllIllIIllllll("textures/gui/presets/water.png"), lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }")));
        IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.add(new IllllIIlIlIllIIIllII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.preset.isleLand", new Object[0]), new lIllllIllIllIIllllll("textures/gui/presets/isles.png"), lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }")));
        IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.add(new IllllIIlIlIllIIIllII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.preset.caveDelight", new Object[0]), new lIllllIllIllIIllllll("textures/gui/presets/delight.png"), lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }")));
        IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.add(new IllllIIlIlIllIIIllII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.preset.mountains", new Object[0]), new lIllllIllIllIIllllll("textures/gui/presets/madness.png"), lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }")));
        IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.add(new IllllIIlIlIllIIIllII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.preset.drought", new Object[0]), new lIllllIllIllIIllllll("textures/gui/presets/drought.png"), lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }")));
        IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.add(new IllllIIlIlIllIIIllII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.preset.caveChaos", new Object[0]), new lIllllIllIllIIllllll("textures/gui/presets/chaos.png"), lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }")));
        IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.add(new IllllIIlIlIllIIIllII(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.preset.goodLuck", new Object[0]), new lIllllIllIllIIllllll("textures/gui/presets/luck.png"), lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }")));
    }
    
    public IlIIIIIlIIllIIlIlIll(final IIlllIIlIllIllIlIIll llIIlIIIlIIIllIlIIIl) {
        this.IlIlIIIllIllIIIIIllI = "Customize World Presets";
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        Keyboard.enableRepeatEvents(true);
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.custom.presets.title", new Object[0]);
        this.llIllIlIIIIllIlIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets.share", new Object[0]);
        this.lIlIlIIIllIIllIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets.list", new Object[0]);
        this.lIIIlllIIIllIIIllIII = new lIIlIIIIIIIlIIlIlIIl(2, this.IIllIIllIIIlIlIIIIlI, 50, 40, this.llllIIllllIlIlIIIIll - 100, 20);
        this.llllIIIlIlllIlIIIIIl = new lllllIIIIIlIIlllIlIl(this);
        this.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl(2000);
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI());
        this.IIlllIIlIllIllIlIIll.add(this.lIIIIlIIIIIlllIllIII = new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 102, this.IlIllIlIlIIIlIlIlIII - 27, 100, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.presets.select", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 + 3, this.IlIllIlIlIIIlIlIlIII - 27, 100, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void o_() {
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, n3);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (!this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(c, n)) {
            super.llllIIIIlIIIlIlllIll(c, n);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        switch (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
            case 0: {
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl());
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
                break;
            }
            case 1: {
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
                break;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 8, 16777215);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.llIllIlIIIIllIlIIllI, 50, 30, 10526880);
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, this.lIlIlIIIllIIllIIIllI, 50, 70, 10526880);
        this.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
        super.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI = this.lIIIIlIIIIIlllIllIII();
    }
    
    private boolean lIIIIlIIIIIlllIllIII() {
        return (this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll > -1 && this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll < IlIIIIIlIIllIIlIlIll.IllIIlllIIIIlllIIlIl.size()) || this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl().length() > 1;
    }
}
