package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class i implements IIIIIIIIIlllIllIlIlI
{
    private final IlIllllIIlIIlIlIlIll llIllIIIIIllIlIIIIlI;
    protected final Minecraft llllIIIIlIIIlIlllIll;
    protected final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private long IlIIIlIlIIIllIlIlIIl;
    
    protected i(final IlIllllIIlIIlIlIlIll llIllIIIIIllIlIIIIlI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = 0L;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = Minecraft.getMinecraft();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("lanServer.title", new Object[0]), n2 + 32 + 3, n3 + 1, 16777215);
        this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2 + 32 + 3, n3 + 12, 8421504);
        if (this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIlIIIIlllIlllllIlII) {
            this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("selectServer.hiddenAddress", new Object[0]), n2 + 32 + 3, n3 + 12 + 11, 3158064);
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2 + 32 + 3, n3 + 12 + 11, 3158064);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n);
        if (Minecraft.IIIllllllIllIIIlllIl() - this.IlIIIlIlIIIllIlIlIIl < 250L) {
            this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl();
        }
        this.IlIIIlIlIIIllIlIlIIl = Minecraft.IIIllllllIllIIIlllIl();
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
