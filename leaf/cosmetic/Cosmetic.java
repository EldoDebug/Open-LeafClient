package leaf.cosmetic;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class Cosmetic
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private RenderNazoCosmetic llIllIIIIIllIlIIIIlI;
    private IllIIlllIIIIlllIIlIl IlIIIlIlIIIllIlIlIIl;
    
    public Cosmetic(final lIllllllIIllIlIlIlII ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = (IllIIlllIIIIlllIIlIl)ilIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = new RenderNazoCosmetic(this, null);
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)lllIIIIlllllIlIIllIl, n, n2, n4, n5, n6, n7);
    }
}
