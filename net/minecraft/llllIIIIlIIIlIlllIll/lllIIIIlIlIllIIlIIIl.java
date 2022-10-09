package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lllIIIIlIlIllIIlIIIl extends IlIIIlIlIIIllIlIlIIl
{
    private net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl IlIlIIIllIllIIIIIllI;
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("RecordItem", 10)) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("RecordItem")));
        }
        else if (iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Record") > 0) {
            this.llllIIIIlIIIlIlllIll(new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Record")), 1, 0));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (this.llllIIIIlIIIlIlllIll() != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("RecordItem", this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        }
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIIIlIlIllIIlIlIlII();
    }
}
