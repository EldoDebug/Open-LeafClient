package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    public llIllIIIIIllIlIIIIlI(final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII) {
        super(illIIIlIIlIlIlIIIII);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = new IllIIlllIIIIlllIIlIl(0.5f);
        this.IlIIIlIlIIIllIlIlIIl = new IllIIlllIIIIlllIIlIl(1.0f);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        switch (n) {
            case 1: {
                illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl = true;
                illIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl = true;
                break;
            }
            case 2: {
                illIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl = true;
                illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl = true;
                illIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl = true;
                break;
            }
            case 3: {
                illIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl = true;
                illIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl = true;
                illIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl = true;
                break;
            }
            case 4: {
                illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl = true;
                illIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl = true;
                break;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(false);
    }
}
