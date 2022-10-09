package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IllIIlllIIIIlllIIlIl implements IIIIlllIIIIIIlIIIlll
{
    private IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll;
    private final IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl;
    private final lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI;
    private IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    
    public IllIIlllIIIIlllIIlIl(final IlIlIIIIIIlllIlIllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new lIIIIlIIIIIlllIllIII(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.llllIIIIlIIIlIlllIll = new llIllIIIIIllIlIIIIlI(ilIlIIIllIIllIlllllI, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll();
        this.IlIIIlIlIIIllIlIlIIl = (IlIlIlIlIlllllllllIl)this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl == null) {
            return this.IlIIIlIlIIIllIlIlIIl;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
        return (ilIlIlIlIlllllllllIl == null) ? this.IlIIIlIlIIIllIlIlIIl : ilIlIlIlIlllllllllIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
