package net.minecraft.llIllIlIIIIllIlIIllI;

import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public class IlIIIIIlIIllIIlIlIll extends lIllIlIIIllllllIIlII
{
    private static final Set lIIIlllIIIllIIIllIII;
    
    static {
        lIIIlllIIIllIIIllIII = Sets.newHashSet((Object[])new llllIIIIlIIIlIlllIll[] { net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aw, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIllIllIIlIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll });
    }
    
    protected IlIIIIIlIIllIIlIlIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        super(2.0f, ilIlIIIlIIlIlIIlllIl, IlIIIIIlIIllIIlIlIll.lIIIlllIIIllIIIllIII);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl) ? (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() == 3) : ((llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI) ? ((llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.T && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.X) ? ((llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) ? ((llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII) ? ((llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) ? ((llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIllIllIIlIlIl) ? (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI || llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl || llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl) : (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() >= 2)) : (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() >= 1)) : (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() >= 1)) : (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() >= 2)) : (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() >= 2)) : (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() >= 2));
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl && llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl && llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI) ? super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll) : this.llllIIIlIlllIlIIIIIl;
    }
}
