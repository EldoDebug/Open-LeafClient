package net.minecraft.llIllIlIIIIllIlIIllI;

import com.google.common.base.*;

class llIllIIlllllllllllll implements Function
{
    private final /* synthetic */ String[] llllIIIIlIIIlIlllIll;
    
    llIllIIlllllllllllll(final String[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        int liiiIlIIIIIlllIllIII = lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
        if (liiiIlIIIIIlllIllIII < 0 || liiiIlIIIIIlllIllIII >= this.llllIIIIlIIIlIlllIll.length) {
            liiiIlIIIIIlllIllIII = 0;
        }
        return this.llllIIIIlIIIlIlllIll[liiiIlIIIIIlllIllIII];
    }
}
