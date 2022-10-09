package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;

class BossBarSetting extends SettingBase
{
    final /* synthetic */ HudSetting hudSetting;
    
    BossBarSetting(final HudSetting hudSetting, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.hudSetting = hudSetting;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void addSetting() {
        Leaf.instance.configManager.saveConfig("BossBar", "health", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.modManager.bossBarMod.name = this.llllIIIIlIIIlIlllIll;
    }
}
