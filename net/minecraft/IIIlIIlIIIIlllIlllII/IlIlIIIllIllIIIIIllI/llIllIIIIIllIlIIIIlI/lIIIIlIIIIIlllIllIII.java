package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;

public class lIIIIlIIIIIlllIllIII extends IIIIlllIIIIIIlIIIlll
{
    private List IlIlIIIllIllIIIIIllI;
    
    public lIIIIlIIIIIlllIllIII() {
        (this.IlIlIIIllIllIIIIIllI = Lists.newArrayList()).add(new lIlIlIIIllIIllIIIllI(llllIIIIlIIIlIlllIll.class, 10, 2, 3));
        this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(llIIIlIlIllIIlIlIlII.class, 5, 4, 4));
        this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(llllllIllIllIlIllllI.class, 10, 4, 4));
        this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(IlIlIllllllllIIIIlII.class, 3, 4, 4));
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Fortress";
    }
    
    public List IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final int n3 = n >> 4;
        final int n4 = n2 >> 4;
        this.IlIlIlIlIlllllllllIl.setSeed((long)(n3 ^ n4 << 4) ^ this.llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII());
        this.IlIlIlIlIlllllllllIl.nextInt();
        return this.IlIlIlIlIlllllllllIl.nextInt(3) == 0 && n == (n3 << 4) + 4 + this.IlIlIlIlIlllllllllIl.nextInt(8) && n2 == (n4 << 4) + 4 + this.IlIlIlIlIlllllllllIl.nextInt(8);
    }
    
    @Override
    protected IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return new lIIIlllIIIllIIIllIII(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl, n, n2);
    }
}
