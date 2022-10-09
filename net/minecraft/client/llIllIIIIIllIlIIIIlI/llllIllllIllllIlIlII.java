package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public abstract class llllIllllIllllIlIlII extends IIIIIllIIIIlIIIIllIl
{
    protected final Minecraft llllIIIIlIIIlIlllIll;
    protected final List IlIlIlIlIlllllllllIl;
    
    public llllIllllIllllIlIlII(final Minecraft llllIIIIlIIIlIlllIll, final int n, final int n2, final List ilIlIlIlIlllllllllIl) {
        super(llllIIIIlIIIlIlllIll, n, n2, 32, n2 - 55 + 4, 36);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIlIIIllIIllIlllllI = false;
        this.llllIIIIlIIIlIlllIll(true, (int)(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll * 1.5f));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII) {
        final String string = new StringBuilder().append(IlllIIIIlIIIlIlIlIIl.IIllIIllIIIlIlIIIIlI).append(IlllIIIIlIIIlIlIlIIl.lllIIIIlllllIlIIllIl).append(this.IlIIIlIlIIIllIlIlIIl()).toString();
        this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string, n + this.IlIIIlIlIIIllIlIlIIl / 2 - this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string) / 2, Math.min(this.IllIIlllIIIIlllIIlIl + 3, n2), 16777215);
    }
    
    protected abstract String IlIIIlIlIIIllIlIlIIl();
    
    public List IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI().size();
    }
    
    public IIIlIIIlIlIIlllIIlll llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIIIllIllIIIIIllI().get(n);
    }
    
    @Override
    public int m_() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return this.lIIIIlIIIIIlllIllIII - 6;
    }
}
