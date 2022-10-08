package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;
import net.minecraft.client.*;

class ClearGlassSetting extends IlIIIlIlIIIllIlIlIIl
{
    final /* synthetic */ RenderSetting IlIlIlIlIlllllllllIl;
    
    ClearGlassSetting(final RenderSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        Leaf.instance.saveConfig.saveConfig("Setting", "clear_glass", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.modManager.IlIlIllllllllIIIIlII = this.llllIIIIlIIIlIlllIll;
        Minecraft.getMinecraft().llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
    }
}
