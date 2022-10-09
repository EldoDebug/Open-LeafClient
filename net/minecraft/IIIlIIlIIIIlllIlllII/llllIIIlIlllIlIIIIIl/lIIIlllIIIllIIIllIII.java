package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lIIIlllIIIllIIIllIII extends lIIIIlIIIIIlllIllIII
{
    public lIIIlllIIIllIIIllIII() {
        super(null);
    }
    
    @Override
    public llllllIllIllIlIllllI llllIIIIlIIIlIlllIll(final Class clazz, final String s) {
        return this.llllIIIIlIIIlIlllIll.get(s);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll.put(s, llllllIllIllIlIllllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final String s) {
        return 0;
    }
}
