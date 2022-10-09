package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import io.netty.buffer.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class llllIIllllIlIlIIIIll extends IlIlIIIllIllIIIIIllI
{
    final /* synthetic */ IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
    
    llllIIllllIlIlIIIIll(final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIIIlIIlIlIIlllIl() {
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public e j_() {
        return new e(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5);
    }
    
    @Override
    public IlllllllIIIlIIIlIlII k_() {
        return this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s) {
        super.llllIIIIlIIIlIlllIll(s);
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl() {
        this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII().lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final ByteBuf byteBuf) {
        byteBuf.writeInt(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        byteBuf.writeInt(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
        byteBuf.writeInt(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI l_() {
        return null;
    }
}
