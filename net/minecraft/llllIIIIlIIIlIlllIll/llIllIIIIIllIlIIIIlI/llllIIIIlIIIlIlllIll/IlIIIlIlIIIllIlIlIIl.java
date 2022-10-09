package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.cache.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import com.google.common.base.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    private final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private final LoadingCache IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final int llllIIIlIlllIlIIIIIl;
    
    public IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI, final LoadingCache ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (lIIIIlIIIIIlllIllIII)this.IlIIIlIlIIIllIlIlIIl.getUnchecked((Object)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl(), this.llIllIIIIIllIlIIIIlI(), n, n2, n3));
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("up", (Object)this.llIllIIIIIllIlIIIIlI).add("forwards", (Object)this.IlIlIlIlIlllllllllIl).add("frontTopLeft", (Object)this.llllIIIIlIIIlIlllIll).toString();
    }
}
