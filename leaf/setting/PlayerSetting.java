package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;
import net.minecraft.client.*;

class PlayerSetting extends llIllIIIIIllIlIIIIlI
{
    final /* synthetic */ PlayerCosmeticSetting llllIIIIlIIIlIlllIll;
    private final /* synthetic */ String IlIlIlIlIlllllllllIl;
    
    PlayerSetting(final PlayerCosmeticSetting llllIIIIlIIIlIlllIll, final String s, final int n, final int n2, final int n3, final int n4, final boolean b, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void addSetting() {
        Leaf.instance.configManager.saveConfig("Setting", this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.toLowerCase(), this.IlIlIlIlIlllllllllIl);
        if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.equals("Cape")) {
            Leaf.instance.modManager.capeSetting = this.IlIlIlIlIlllllllllIl;
        }
        else if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.equals("Wing")) {
            Leaf.instance.modManager.wingSetting = this.IlIlIlIlIlllllllllIl;
        }
        else if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.equals("Hat")) {
            Leaf.instance.modManager.hatSetting = this.IlIlIlIlIlllllllllIl;
        }
        Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll();
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft(), Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll, Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll.IlIllIlIlIIIlIlIlIII);
    }
}
