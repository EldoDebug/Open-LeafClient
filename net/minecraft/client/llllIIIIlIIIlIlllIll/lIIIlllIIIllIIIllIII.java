package net.minecraft.client.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII implements llIIIllIlIllIllIIIIl
{
    private final Random llllIIIIlIIIlIlllIll;
    private final Minecraft IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public lIIIlllIIIllIIIllIII(final Minecraft ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = new Random();
        this.IlIIIlIlIIIllIlIlIIl = 100;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        final llIIlIIIlIIIllIlIIIl illIlIIllIllIIlIllII = this.IlIlIlIlIlllllllllIl.IllIlIIllIllIIlIllII();
        if (this.llIllIIIIIllIlIIIIlI != null) {
            if (!illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll().equals(this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl())) {
                this.IlIlIlIlIlllllllllIl.IlIIlIlIIIlIIlIlIlII().IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
                this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 0, illIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl() / 2);
            }
            if (!this.IlIlIlIlIlllllllllIl.IlIIlIlIIIlIIlIlIlII().llIllIIIIIllIlIIIIlI(this.llIllIIIIIllIlIIIIlI)) {
                this.llIllIIIIIllIlIIIIlI = null;
                this.IlIIIlIlIIIllIlIlIIl = Math.min(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, illIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl(), illIlIIllIllIIlIllII.llIllIIIIIllIlIIIIlI()), this.IlIIIlIlIIIllIlIlIIl);
            }
        }
        if (this.llIllIIIIIllIlIIIIlI == null && this.IlIIIlIlIIIllIlIlIIl-- <= 0) {
            this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll());
        this.IlIlIlIlIlllllllllIl.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Integer.MAX_VALUE;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.IlIlIlIlIlllllllllIl.IlIIlIlIIIlIIlIlIlII().IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
            this.llIllIIIIIllIlIIIIlI = null;
            this.IlIIIlIlIIIllIlIlIIl = 0;
        }
    }
}
