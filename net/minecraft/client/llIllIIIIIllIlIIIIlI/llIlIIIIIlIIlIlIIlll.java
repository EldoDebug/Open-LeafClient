package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;

public class llIlIIIIIlIIlIlIIlll extends IlIIIlIlIIIllIlIlIIl
{
    private final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llllIIllllIlIlIIIIll;
    
    public llIlIIIIIlIIlIlIIlll(final int n, final int n2, final int n3, final String s) {
        this(n, n2, n3, null, s);
    }
    
    public llIlIIIIIlIIlIlIIlll(final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        super(n, n2, n3, n4, n5, s);
        this.llllIIllllIlIlIIIIll = null;
    }
    
    public llIlIIIIIlIIlIlIIlll(final int n, final int n2, final int n3, final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llllIIllllIlIlIIIIll, final String s) {
        super(n, n2, n3, 150, 20, s);
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI() {
        return this.llllIIllllIlIlIIIIll;
    }
}
