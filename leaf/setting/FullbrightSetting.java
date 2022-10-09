package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;
import net.minecraft.client.*;

class FullbrightSetting extends SettingBase
{
    final /* synthetic */ RenderSetting IlIlIlIlIlllllllllIl;
    
    FullbrightSetting(final RenderSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void addSetting() {
        Leaf.instance.configManager.saveConfig("Setting", "fullbright", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.modManager.fullbright = this.llllIIIIlIIIlIlllIll;
        Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
    }
}
