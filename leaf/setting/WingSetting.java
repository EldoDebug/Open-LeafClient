package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;
import net.minecraft.client.*;

class WingSetting extends SettingBase
{
    final /* synthetic */ RenderSetting renderSetting;
    
    WingSetting(final RenderSetting renderSetting, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.renderSetting = renderSetting;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void addSetting() {
        Leaf.instance.configManager.saveConfig("Setting", "hide_wing", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.modManager.hideWing = this.llllIIIIlIIIlIlllIll;
        Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll();
    }
}
