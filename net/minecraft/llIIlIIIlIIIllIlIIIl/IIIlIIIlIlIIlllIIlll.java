package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class IIIlIIIlIlIIlllIIlll extends IIIIIllIIIIlIIIIllIl
{
    final /* synthetic */ IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IllIIlllIIIIlllIIlIl;
    
    IIIlIIIlIlIIlllIIlll(final IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final int n2, final int n3, final int illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        super(llIIIlIlIllIIlIlIlII, n, n2, n3);
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 1;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && ((lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) ? (((IIIlIIlIIIIlllIlllII)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).lIIIIlIIIIIlllIllIII == this.IllIIlllIIIIlllIIlIl) : ((lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI) || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab) && this.IllIIlllIIIIlllIIlIl == 0));
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI() {
        return IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl[this.IllIIlllIIIIlllIIlIl];
    }
}
