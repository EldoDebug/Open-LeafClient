package leaf.setting;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import leaf.*;
import leaf.mods.*;
import java.util.*;

public class ModList extends lIIllIIIllllIlllIllI
{
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        for (final Mod mod : Leaf.instance.modManager.mods) {
            if (mod.lIlIlIIIllIIllIIIllI()) {
                mod.renderDummy(n, n2);
            }
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
