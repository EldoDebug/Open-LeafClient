package leaf.cosmetic;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import leaf.*;
import net.minecraft.client.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class RenderNazoCosmetic extends IlIIIlIlIIIllIlIlIIl
{
    final /* synthetic */ Cosmetic llllIIIIlIIIlIlllIll;
    
    private RenderNazoCosmetic(final Cosmetic llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        if (llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII()) {
            return;
        }
        GL11.glPushMatrix();
        final lIllllIllIllIIllllll llIllIlIIIIllIlIIllI = ((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).llIllIlIIIIllIlIIllI();
        final List<String> list = Leaf.instance.downloadPlayerData.IllIIlllIIIIlllIIlIl.get(llIllIlIIIIllIlIIllI);
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI);
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = Integer.parseInt(list.get(0));
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl = Integer.parseInt(list.get(0));
        Cosmetic.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, new IIlIIIIIllIlIIIlIIll(this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, 0, 0));
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(Float.parseFloat(list.get(1)), Float.parseFloat(list.get(2)), Float.parseFloat(list.get(3)), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5)), Integer.parseInt(list.get(6)));
        Cosmetic.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, new IIlIIIIIllIlIIIlIIll(this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, 0, Integer.parseInt(list.get(7))));
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(Float.parseFloat(list.get(8)), Float.parseFloat(list.get(9)), Float.parseFloat(list.get(10)), Integer.parseInt(list.get(11)), Integer.parseInt(list.get(12)), Integer.parseInt(list.get(13)));
        if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
            GL11.glTranslated(0.0, 0.225, 0.0);
        }
        final float float1 = Float.parseFloat(list.get(14));
        GL11.glScalef(float1, float1, float1);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = 0.0f;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = 0.0f;
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        GL11.glPopMatrix();
    }
}
