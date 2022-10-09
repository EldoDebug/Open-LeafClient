package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import io.netty.buffer.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class IIIlIIIlIlIIlllIIlll extends IlIlIIIllIllIIIIIllI
{
    final /* synthetic */ IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll;
    
    IIIlIIIlIlIIlllIIlll(final IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl() {
        this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(23, this.lIIIlllIIIllIIIllIII());
        this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(24, lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII()));
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 1;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final ByteBuf byteBuf) {
        byteBuf.writeInt(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl());
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIIIlIIlIlIIlllIl() {
        return new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + 0.5, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
    }
    
    @Override
    public e j_() {
        return new e(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
    }
    
    @Override
    public IlllllllIIIlIIIlIlII k_() {
        return this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI l_() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
